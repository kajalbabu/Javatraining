import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class registration {
    HashMap<String, String> map = new HashMap<>();

    public void user_registration(String username, String password) throws Exception {
        if (map.containsKey(username)) {
            throw new Exception("User is already exist...");
        } else {
            map.put(username, password);
        }

    }

    public void login_user(String username, String password) throws Exception {
        if (map.containsKey(username)) {
            String user = map.get(username);
            if ((user.equals(password))) {
                System.out.println("The user login is successfull..");
            } else if (password.isEmpty()) {
                throw new Exception("The password need not to be null..");
            } else {
                throw new Exception("Incorrect password..");
            }
        } else {
            System.out.println("Incorrect username or password..");
        }

    }

    public void printUsers() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String username = entry.getKey();
            String password = entry.getValue();
            System.out.println("Username: " + username + ", Password: " + password);
        }
    }

    public static void main(String[] args) {
        registration reg = new registration();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        boolean n = true;
        while (n) {
            System.out.println("1.User registration");
            System.out.println("2.User login");
            System.out.println("3.Print the pair");
            System.out.println("Choose the option:");
            int num = sc2.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter the username: ");
                    String reg_name = sc.nextLine();
                    System.out.println("Enter the password: ");
                    String reg_pass = sc.nextLine();
                    try {
                        reg.user_registration(reg_name, reg_pass);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter the username:");
                    String log_name = sc.nextLine();
                    System.out.println("Enter the password: ");
                    String log_pass = sc.nextLine();
                    try {
                        reg.login_user(log_name, log_pass);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Key value pairs are..");
                    reg.printUsers();
                    break;
                default:
                    n = false;
                    break;
            }

        }

    }

}
