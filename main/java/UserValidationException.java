import java.util.regex.Pattern;

@FunctionalInterface
interface IUservalidation{
    public boolean checkPattern(Pattern pattern,String name);

}

public class UserValidationException {

        private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$" ;
        private static final String LAST_NAME_PATTERN =  "^[A-Z]{1}[a-z]{2,}$" ;
        private static final String EMAILID_PATTERN = "^[a-zA-Z]{3}[a-zA-Z0-9\\-\\_\\+]*(\\.)?[a-zA-Z0-9]*(?<!\\.|\\+|\\_|\\-)\\@(?!\\.)[a-z0-9]*(\\.[a-z]{2,3})(\\.[a-z]{2,3})?$";
        private static final String PHONE_NUMBE_PATTERN = "^[0-9]{2}[\\s][789]{1}[0-9]{9}$";
        private static final String PASSWORD_PATTERN = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";


        IUservalidation Uservalidate = (pattern,name) -> {return pattern.matcher(name).matches();};



    public boolean checkFirstName(String fname) throws InvalidDetailsException {
            Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
            boolean check = Uservalidate.checkPattern(pattern,fname);
            if (check == true)
                return pattern.matcher(fname).matches();
            else
                throw new InvalidDetailsException("Invalid First Name");
        }


        public boolean checkLastName(String lname)throws InvalidDetailsException {
            Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
            boolean check = Uservalidate.checkPattern(pattern,lname);
            if (check == true)
                return pattern.matcher(lname).matches();
            else
                throw new InvalidDetailsException("Invalid Last name");
        }

        public boolean checkEmailID(String email)throws InvalidDetailsException  {
            Pattern pattern = Pattern.compile(EMAILID_PATTERN);
            boolean check = Uservalidate.checkPattern(pattern,email);
            if (check == true)
                return pattern.matcher(email).matches();
            else
                throw new InvalidDetailsException("Invalid Email ID");
        }

        public boolean checkPhoneNumber(String phoneNumber)throws InvalidDetailsException {
            Pattern pattern = Pattern.compile(PHONE_NUMBE_PATTERN);
            boolean check = Uservalidate.checkPattern(pattern,phoneNumber);
            if (check == true)
                return pattern.matcher(phoneNumber).matches();
            else
                throw new InvalidDetailsException("Invalid Phone Number");
        }

        public boolean checkPassword(String password)throws InvalidDetailsException {
            Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
            boolean check = Uservalidate.checkPattern(pattern,password);
            if (check == true)
                return pattern.matcher(password).matches();
            else
                throw new InvalidDetailsException("Invalid Password");
        }



}
