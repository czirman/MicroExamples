import java.util.Objects;

public class Increme implements Comparable{
    int i =0;

    public Increme(int i) {
        this.i = i;
    }

    public void dodaj (){
        i++;
    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }

    @Override
    public int compareTo(Object o) {
        Increme arg = (Increme) o;
        if (this.i<arg.i)
            return -1;
        else if (this.i>arg.i)
            return +1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Increme increme = (Increme) o;
        return i == increme.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}
