public class Main {
    public static void main(String[] args) {
        System.out.println();

        Car car1 = new GasolineCar("AF46115","Honda","Civic 2016",3,14);
        System.out.println(car1);
        Car car2 = new DieselCar("BE92241","Seat","Leon 2014",5,21,true);
        System.out.println(car2);
        Car car3 = new ElectricCar("KB24478","Tesla","Model X 2020",5,100,450);
        System.out.println(car3);
        System.out.println();

        FleetOfCars f = new FleetOfCars();
        f.addCar(car1);
        f.addCar(car2);
        f.addCar(car3);
        System.out.println(f);
    }
}