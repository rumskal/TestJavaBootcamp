import java.util.stream.*;
class Login {
    String role;
    boolean isAdmin(){
        return "admin".equals(role);
    }

}
public class AdminConsole{
    public static void main(String[] args) {
        Login user1 = new Login();
        Login user2 = new Login();
        Login user3 = new Login();
        user1.role = "admin";
        user3.role = "admin";
        Stream.of(user1, user2) .filter(Login::isAdmin).forEach(System.out::println);
    }
}
