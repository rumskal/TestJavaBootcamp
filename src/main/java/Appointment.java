public class Appointment {
    public static void main(String[] args) {
        try{
            System.out.println("appID");
            throw  new RuntimeException("Invalid");
        }
        catch (NullPointerException npe){
            System.out.println("error");
            throw npe;
        }
        finally{
            System.out.println("log");
        }
    }
}
