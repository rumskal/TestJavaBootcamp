interface Payment{
    default String type(){
        return "none";
    }
}
abstract class RewardsPoints{
    abstract String type();
}

public class PassportMiles extends RewardsPoints implements Payment{
    public PassportMiles(){
        super();
    }
    public String type(){
        return "points";
    }

    public static void main(String[] args) {
        System.out.println(((RewardsPoints) new PassportMiles()).type());
    }
}
