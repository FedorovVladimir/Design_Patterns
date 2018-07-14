package Strategy;

class UserChecker {
    private String name;
    private String password;

    UserChecker(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean check(AuthStrategy authStrategy) {
        return authStrategy.checkLogin(name, password);
    }
}
