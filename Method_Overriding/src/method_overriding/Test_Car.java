package method_overriding;

class Car {
	public void driving() {
		System.out.println("Driving a car");
	}

	public void start() {
		System.out.println("start a car");
	}

	public void accelerate() {
		System.out.println("Driving a car");
	}

	public void firstgear() {
		System.out.println("...");
	}
}

class LuxaryCar extends Car {
	public void accelerate() {
		System.out.println("LuxaryAcc a car");
	}

	public void changegear() {
		System.out.println("LuxaryChange a car");
	}

	public void firstgear() {
		System.out.println("Yes boss..");

	}
}

public class Test_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LuxaryCar c = new LuxaryCar();
		c.driving();
		c.start();
		c.accelerate();
		c.firstgear();
		c.changegear();

	}

}
