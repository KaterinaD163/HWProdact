import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class NumberOfXAndY {
    private int x;
    private int y;
    private Set<String> tasks;

    public NumberOfXAndY(Set<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((x * y) == (y * x) && x == y) return false;
        NumberOfXAndY that = (NumberOfXAndY) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
        @Override
        public String toString () {
            return "x * y";
        }
    }

