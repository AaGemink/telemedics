package aplikasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectdata {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/telemedics?useSSL=false&serverTimezone=UTC";
                String user = "root";
                String pass = "refanrefan";

                connection = DriverManager.getConnection(url, user, pass);
                System.out.println("KONEKSI BERHASIL");

            } catch (Exception e) { // ⬅️ INI PENTING
                System.out.println("KONEKSI GAGAL");
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
