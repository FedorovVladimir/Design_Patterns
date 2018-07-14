package Strategy;

import java.io.File;

public class FileAuth implements AuthStrategy {
    private File file;

    FileAuth(File file) {
        this.file = file;
    }


    public boolean checkLogin(String name, String password) {
        System.out.println("Checking with File");
        return false;
    }
}
