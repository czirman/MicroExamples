package qualifier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fooService")
public class FooService {

    @Autowired
    @Qualifier("fooFormatter")
    private Formatter formatter;
}
