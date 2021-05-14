package JavaCollections.MainTask.Cars;

import JavaCollections.MainTask.Classification.ClassificationOfPassengerCars;
import JavaCollections.MainTask.Classification.ModelAuto;

public class FreightСar extends Car {
    private int capacityOfPeopleInTheCar;
    private int loadCapacity; // in tons

    public FreightСar(int priceAuto, int averageSpeedAuto, ClassificationOfPassengerCars classificationOfPassengerCars, ModelAuto modelAuto, int fuelConsumer, int capacityOfPeopleInTheCar, int loadCapacity) {
        super(priceAuto, averageSpeedAuto, classificationOfPassengerCars, modelAuto, fuelConsumer);
        this.capacityOfPeopleInTheCar = capacityOfPeopleInTheCar;
        this.loadCapacity = loadCapacity;
    }

    public int getCapacityOfPeopleInTheCar() {
        return capacityOfPeopleInTheCar;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", capacityOfPeopleInTheCar=" + capacityOfPeopleInTheCar +
                        ", loadCapacity=" + loadCapacity + '}' + "\n");
    }
}
