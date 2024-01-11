public class Main {
    public static void main(String[] args) {
        Bicycle[] bicycle = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };
        Car[] car = {
                new Car("car1", 4),
                new Car("car2", 4)
        };
        Truck[] truck = {
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };
        Transport[] transports = new Transport[bicycle.length + car.length + truck.length];
        for (int i = 0; i < bicycle.length; i++) {
            transports[i] = bicycle[i];
        }
        for (int i = 0; i < car.length; i++) {
            transports[i + bicycle.length] = car[i];
        }
        for (int i = 0; i < truck.length; i++) {
            transports[i + bicycle.length + car.length] = truck[i];
        }
        for (int i = 0; i < transports.length; i++) {
            System.out.println(transports[i]);
        }

        transportWork ServiceStation = new ServiceStation();
        ServiceStation.check(bicycle[0]);
        ServiceStation.check(bicycle[1]);
        ServiceStation.check(car[0]);
        ServiceStation.check(car[1]);
        ServiceStation.check(truck[0]);
        ServiceStation.check(truck[1]);
    }
}