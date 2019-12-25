import java.util.Objects;

public class ElementCountDto {
    private final String element;
    private final int count;

    public ElementCountDto(String element, int count) {
        this.element = element;
        this.count = count;
    }

    public String getElement() {
        return element;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElementCountDto that = (ElementCountDto) o;
        return count == that.count &&
                Objects.equals(element, that.element);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element, count);
    }

    @Override
    public String toString() {
        return "ElementCountDto{" +
                "element='" + element + '\'' +
                ", count=" + count +
                '}';
    }
}
