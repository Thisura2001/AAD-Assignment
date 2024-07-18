import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        Student student = new Student();
        try(FileInputStream fileInputStream = new FileInputStream("Student.ser")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student = (Student) objectInputStream.readObject();
            System.out.println("Object deserialized successfully"+"\n"+student);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
