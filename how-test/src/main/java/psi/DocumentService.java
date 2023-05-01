package psi;

import java.time.Instant;
import java.util.Objects;


public class DocumentService {

    private PrinterService printerService;
    private EmailService emailService;

    public DocumentService(PrinterService printerService, EmailService emailService) {
        this.printerService = printerService;
        this.emailService = emailService;
    }

    public void handleDocument(Document document, Customer customer) {
        Objects.requireNonNull(document, "Document can not be null");
        Objects.requireNonNull(customer, "Customer can not be null");
        if (customer.prefersEmails()) {
            emailService.send(document, customer.getEmail());
        } else if (printerService.isPrinterAvailable()) {
            printerService.print(document);
        }
    }

    public boolean isOverDeadline(Document document) {
        Objects.requireNonNull(document, "Document can not be null");
        Instant deadlineDate = document.getDeadline();
        return deadlineDate.isBefore(Instant.now());
    }

}


