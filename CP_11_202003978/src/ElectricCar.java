
public class ElectricCar extends Car {
    public ElectricCar(String model, int maxDistance) {
        super(model, maxDistance);
    }

    @Override
    public void calculateRange() {
        super.calculateRange();
        System.out.println("추가로, 이 "+this.model+"은(는) 배터리로 주행 가능합니다.");
    }


}
