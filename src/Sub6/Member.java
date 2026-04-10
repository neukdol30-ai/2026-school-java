package Sub6;

public class Member {
    String id;
    String password;

    boolean logic(String inputId, String inputPassword){
        return this.id.equals(inputId) && this.password.equals(inputPassword);
    }
}
