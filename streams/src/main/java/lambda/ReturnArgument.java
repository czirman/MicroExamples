package lambda;

@FunctionalInterface
public interface ReturnArgument<T, W> {

    T met(W arg);
}
