import java.util.Objects;

public class KeyCollision {

    public KeyCollision(Integer val) {
        this.val = val;
    }

    Integer val;
    @Override
    public int hashCode() {
        if (val>100) {
            return super.hashCode();
        }
        else if(this.val % 2 == 0) {
            return 1;

        }
        else {
            return 2;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyCollision that = (KeyCollision) o;
        return Objects.equals(val, that.val);
    }
}
