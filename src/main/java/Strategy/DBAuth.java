package Strategy;

public class DBAuth implements AuthStrategy {

    private Object dbRef;
    private String dbUrl;

    DBAuth(Object dbRef, String dbUrl) {
        this.dbRef = dbRef;
        this.dbUrl = dbUrl;
    }

    public boolean checkLogin(String name, String password) {
        System.out.println("Checking with DB...");
        return false;
    }
}
