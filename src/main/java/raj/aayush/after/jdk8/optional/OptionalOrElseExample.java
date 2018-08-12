package raj.aayush.after.jdk8.optional;
import java.util.Optional;
/**
 * It returns the value if present in Optional Container. Otherwise returns given default value.
 * @author aayushraj
 *
 */
public class OptionalOrElseExample {

    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        System.out.println(gender.orElse("<N/A>")); //MALE
        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>

        System.out.println(gender.orElseGet(() -> "<N/A>")); //MALE
        System.out.println(emptyGender.orElseGet(() -> "<N/A>")); //<N/A>

    }

}