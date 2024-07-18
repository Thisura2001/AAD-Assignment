import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        Student student = new Student("S001","Thisura","matugama");

        try ( FileOutputStream fileOutputStream = new FileOutputStream("student.ser")){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            System.out.println("Object serialized successfully"+"\n"+student);

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
