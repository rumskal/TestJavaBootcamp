final public class Apartment {
    final private int population = 250;
    final protected class City{
        private final int population = 100000;
        public final int getPopulation(){
            return Apartment.this.population;
        }
    }
    final City city = new City ();

    final public static void main(String[] args) {
        System.out.println(new Apartment().city.getPopulation());

    }
}
