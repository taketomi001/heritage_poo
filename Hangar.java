public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Clio", 0);
        Boat boat = new Boat("Titanic", 0);
        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());

    }

}
