package Strategy;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        // ...

        userChecker.check(new DBAuth("dbRef", "dbUrl"));
        userChecker.check(new FileAuth(new File("nameFile")));
    }
}
