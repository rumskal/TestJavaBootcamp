import java.io.*;

public class GradeLevel implements Serializable{
    private int numStudents = 15;
    private transient String subject ="No data";

     public GradeLevel(){
        this.numStudents = 17;
        this.subject = "Literature";
    }

    public static void main(String[] args) throws Exception{
         try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("enrollment.txt"))){
             GradeLevel grade = new GradeLevel();
             grade.numStudents = 11;
             grade.subject = "Biology";
             output.writeObject(grade);
         }
try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("enrollment.txt"))){
    GradeLevel grade = (GradeLevel) input.readObject();
    System.out.println(grade.subject + "-" + grade.numStudents);
}
    }
}
