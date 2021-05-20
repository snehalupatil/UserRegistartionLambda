import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserValidationTest {
    @Test
    public void givenFisrtName_WhenProper_shouldReturnTrue() {
        UserValidationException user = new UserValidationException();
            boolean result = false;
            try {
                result = user.checkFirstName("Snehal");
            } catch (InvalidDetailsException e) {
                e.printStackTrace();
            }
            Assertions.assertTrue(result);

    }


    @Test
    public void givenLastName_WhenProper_shouldReturnTrue() {
        UserValidationException user = new UserValidationException();
        boolean result = false;
        try {
            result = user.checkLastName("Patil");
        } catch (InvalidDetailsException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailID_WhenProper_shouldReturnTrue() {
        UserValidationException user = new UserValidationException();
        boolean result = false;
        try {
            result = user.checkEmailID("patilsnehal45@gmail.com");
        } catch (InvalidDetailsException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_shouldReturnTrue() {
        UserValidationException user = new UserValidationException();
        boolean result = false;
        try {
            result = user.checkPhoneNumber("91 9876543210");
        } catch (InvalidDetailsException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenProper_shouldReturnTrue() {
        UserValidationException user = new UserValidationException();
        boolean result = false;
        try {
            result = user.checkPassword("Passward#123");
        } catch (InvalidDetailsException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }
}
