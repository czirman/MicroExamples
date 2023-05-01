import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.spy;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {

    @Test
    void testStub() {

        //given
        AccountRepository accountRepositoryStub = new AccountRepositoryStub();
        AccountService accountService = new AccountService(accountRepositoryStub);

        //when
        List<Account> activeAccounts = accountService.getAllActiveAccounts();

        //then
        assertEquals(activeAccounts.size(), 2);
    }

    @Mock
    AccountRepository accountRepository;

    @Test
    void testMock() {

        //given

        AccountService accountService = new AccountService(accountRepository);
        given(accountRepository.getAllAccounts()).willReturn(Collections.emptyList());

        //when
        List<Account> activeAccounts = accountService.getAllActiveAccounts();

        //then
        assertEquals(activeAccounts.size(), 0);
    }

    @Test
    void testSpy() {

        //given
        Meal meal = spy(Meal.class);
        given(meal.getPrice()).willReturn(15);
        given(meal.getQuantity()).willReturn(3);

        //when
        int result = meal.sumPrice();

        //then
        assertEquals(result, 45);
    }
}
