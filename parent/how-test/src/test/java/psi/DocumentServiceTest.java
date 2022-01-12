package psi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@ExtendWith(MockitoExtension.class)
public class DocumentServiceTest {

    @Mock
    private PrinterService printerService;

    @Mock
    private EmailService emailService;

    @InjectMocks
    private DocumentService documentService = new DocumentService(printerService, emailService);

    @Test
    public void when_document_is_null_then_NPE() {
        //given
        Customer customer = getCustomer(true);

        //when then
        assertThrows(NullPointerException.class, () -> {
            documentService.handleDocument(null, customer);
        });
    }

    @Test
    public void when_customer_is_null_then_NPE() {
        //given
        Document document = getDocument();

        //when then
        assertThrows(NullPointerException.class, () -> {
            documentService.handleDocument(document, null);
        });
    }

    @Test
    public void when_prefer_emails_is_true() {
        //given
        Document document = getDocument();
        Customer customer = getCustomer(true);

        //when
        documentService.handleDocument(document, customer);

        //then
        verify(emailService).send(any(), any());
        verifyNoMoreInteractions(emailService);

    }

    @Test
    public void when_prefer_emails_is_false() {
        //given
        Document document = getDocument();
        Customer customer = getCustomer(false);
        given(printerService.isPrinterAvailable()).willReturn(true);

        //when
        documentService.handleDocument(document, customer);

        //then
        verify(printerService).print(any());
        verifyNoMoreInteractions(printerService);

    }


    @Test
    public void when_prefer_emails_and_printer_is_false() {
        //given
        Document document = getDocument();
        Customer customer = getCustomer(false);
        given(printerService.isPrinterAvailable()).willReturn(false);

        //when
        documentService.handleDocument(document, customer);

        //then

        verifyNoMoreInteractions(printerService);
        verifyNoMoreInteractions(emailService);

    }

    //TODO lombok
    private static Document getDocument() {
        return new Document("content", Instant.now());
    }

    private static Customer getCustomer(final Boolean preferedEmails) {
        return new Customer("email", preferedEmails);
    }
}
