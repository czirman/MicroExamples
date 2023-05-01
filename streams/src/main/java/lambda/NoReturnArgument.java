package lambda;

@FunctionalInterface
public interface NoReturnArgument<T> {

    void met(T arg);
}
