import java.util.Optional;

public class TrivialExample {

    // Tak nie użyamy optionali, lepiej użyć zwykłedo if
    public String getTrimBad(final Optional<String> input) {
        if(input.isPresent()) {
            return input.get().trim();
        }

        return "";
    }

    // Klasyczne użycie
    public String getTrimClassical(final String input) {
        return input == null ? "" : input.trim();
    }

    public String getTrimGood(final String input) {
        return Optional.ofNullable(input)
                .map(String::trim)
                .orElse("");
    }
}
