package psi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.*;
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
        Document document = getDocument(Instant.now());

        //when then
        assertThrows(NullPointerException.class, () -> {
            documentService.handleDocument(document, null);
        });
    }

    @Test
    public void when_prefer_emails_is_true() {
        //given
        Document document = getDocument(Instant.now());
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
        Document document = getDocument(Instant.now());
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
        Document document = getDocument(Instant.now());
        Customer customer = getCustomer(false);
        given(printerService.isPrinterAvailable()).willReturn(false);

        //when
        documentService.handleDocument(document, customer);

        //then

        verifyNoMoreInteractions(printerService);
        verifyNoMoreInteractions(emailService);

    }

    @Test
    public void when_isOver_deadline() {
        //given
        LocalDateTime deadLineTime = LocalDateTime.of(3000, Month.APRIL, 1, 12, 45);
        ZoneId ZONE_ID = ZoneId.of("Europe/Kiev");
        Instant instant = deadLineTime.atZone(ZONE_ID).toInstant();
        Document document = getDocument(instant);

        //when
        Boolean overDeadline = documentService.isOverDeadline(document);

        //then
        assertFalse(overDeadline);

    }

    @Test
    public void when_isBefore_deadline() {
        //given
        LocalDateTime deadLineTime = LocalDateTime.of(1000, Month.APRIL, 1, 12, 45);
        ZoneId ZONE_ID = ZoneId.of("Europe/Kiev");
        Instant instant = deadLineTime.atZone(ZONE_ID).toInstant();
        Document document = getDocument(instant);

        //when
        Boolean overDeadline = documentService.isOverDeadline(document);

        //then
        assertTrue(overDeadline);

    }

    private static Document getDocument(Instant deadlineDate) {
        return new Document("content", deadlineDate);
    }

    private static Customer getCustomer(final Boolean preferredEmails) {
        return new Customer("email", preferredEmails);
    }
}
