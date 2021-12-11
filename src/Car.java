public class Car extends Vehicle{
    @Override
    void move() {
        System.out.println("car moves");
    }

    void openDoor() {
        System.out.println("door");
    }
}
