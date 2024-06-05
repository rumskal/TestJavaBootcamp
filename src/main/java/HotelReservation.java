class Booking<T>{
    T id;
    public  void confirm(T id){
        System.out.println("Booking reference number: " +id);

    }
}
public class HotelReservation{
    public static void main(String[] args) {
        //Booking <String> booking = new Booking<>();
        //Booking<String> booking = new Booking<String>();
        //Booking booking = new Booking();
        Booking booking = new Booking<String>();
        booking.confirm("AB2345647");
    }
}