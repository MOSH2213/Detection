import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

class Main {

public static void main(String[] args) throws IOException {
        try (java.util.Scanner s = new java.util.Scanner(new java.net.URL("https://api.ipify.org").openStream(),
                "UTF-8").useDelimiter("\\A")) {
            String ip = s.next();
            System.out.println(ip);
            System.out.println("My current IP address is " + ip);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}