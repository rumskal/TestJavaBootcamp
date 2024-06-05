public class Transportation {
    public static void main(String[] args) {
        int pass = 113;
        int veh = 5;
        int comp1 = pass / veh;
        int comp2 = pass % veh;
        int result = comp2 + comp1 * veh;
        System.out.println(result);

    }
}
