public class Vehicle {
    private int VIN;
    private String model, brand;
    private int year;
    public int hashCode(){
        return(model + brand).hashCode();
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Vehicle)){
            return false;
        }
        Vehicle other = (Vehicle) obj;
        return this.VIN ==other.VIN;
    }
}
