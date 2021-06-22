import model.Company;
import model.Holding;
import model.User;

import java.util.Optional;
import java.util.Vector;

public class ComplexExample {

    public String getCompanyFirstUserName(final Holding holding) {
        if (holding != null) {
            final Company company = holding.getCompanies().get(0);
            if (company != null && company.getUsers() != null) {
                final User user = company.getUsers().get(0);
                if (user != null && user.getFirstName() != null) {
                    final String result = user.getFirstName();
                    if (result.length() > 0) {
                        return result;
                    }
                }
            }
        }

        return "not found";
    }

    public String getCompanyFirstUserNameOptional(final Holding holding) {
        return Optional.ofNullable(holding)
                .map(Holding::getCompanies)
                .map(list -> list.get(0))
                .map(Company::getUsers)
                .map(list -> list.get(0))
                .map(User::getFirstName)
                .filter(name -> name.length() > 0)
                .orElse("not found");
    }

}
