package notetwo;

import java.util.Objects;

public class DTO {

    String value;

    public synchronized static void someMethod() {
        // Do SomeThing
    }

    public DTO(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTO dto = (DTO) o;
        return Objects.equals(value, dto.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
