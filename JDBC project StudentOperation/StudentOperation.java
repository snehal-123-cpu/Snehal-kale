import java.sql.*;
import java.util.Scanner;

public class StudentOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);

            
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS student (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(100), " +
                    "email VARCHAR(100), " +
                    "age INT, " +
                    "course VARCHAR(100), " +
                    "grade VARCHAR(10))");

            //  Insert student
            System.out.println("Enter Student Details (id, name, email, age, course, grade):");
            int id = sc.nextInt();
            sc.nextLine(); 
            String name = sc.nextLine();
            String email = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine(); 
            String course = sc.nextLine();
            String grade = sc.nextLine();

            PreparedStatement insert = conn.prepareStatement("INSERT INTO student VALUES (?, ?, ?, ?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, name);
            insert.setString(3, email);
            insert.setInt(4, age);
            insert.setString(5, course);
            insert.setString(6, grade);
            insert.executeUpdate();
            System.out.println("Student inserted.\n");

            // Read student by ID
            System.out.print("Enter ID to read: ");
            int readId = sc.nextInt();
            PreparedStatement readStmt = conn.prepareStatement("SELECT * FROM student WHERE id=?");
            readStmt.setInt(1, readId);
            ResultSet rs = readStmt.executeQuery();
            if (rs.next()) {
                System.out.println("Student Found: " + rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3));
            } else {
                System.out.println("Student not found.");
            }

            //  Read all students
           System.out.println("\nAll Students:");
           System.out.printf("%-5s %-15s %-25s %-5s %-20s %-10s\n", 
                  "ID", "Name", "Email", "Age", "Course", "Grade");
           System.out.println("-------------------------------------------------------------------------------");

           ResultSet allRs = stmt.executeQuery("SELECT * FROM student");
           while (allRs.next()) {
           System.out.printf("%-5d %-15s %-25s %-5d %-20s %-10s\n",
            allRs.getInt("id"),
            allRs.getString("name"),
            allRs.getString("email"),
            allRs.getInt("age"),
            allRs.getString("course"),
            allRs.getString("grade"));
}

            // Update grade by ID
            System.out.print("\nEnter ID to update grade: ");
            int updateId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new grade: ");
            String newGrade = sc.nextLine();
            PreparedStatement update = conn.prepareStatement("UPDATE student SET grade=? WHERE id=?");
            update.setString(1, newGrade);
            update.setInt(2, updateId);
            int rowsUpdated = update.executeUpdate();
            System.out.println(rowsUpdated > 0 ? "Grade updated." : "Student not found.");

            // Delete student by ID
            System.out.print("\nEnter ID to delete: ");
            int deleteId = sc.nextInt();
            PreparedStatement delete = conn.prepareStatement("DELETE FROM student WHERE id=?");
            delete.setInt(1, deleteId);
            int rowsDeleted = delete.executeUpdate();
            System.out.println(rowsDeleted > 0 ? "Student deleted." : "Student not found.");

        
            conn.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
