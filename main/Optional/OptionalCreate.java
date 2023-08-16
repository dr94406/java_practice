package Optional;

import java.util.Optional;

public class OptionalCreate {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("myName");
        System.out.println(optional);
        System.out.println(optional.isPresent());
    }

}
