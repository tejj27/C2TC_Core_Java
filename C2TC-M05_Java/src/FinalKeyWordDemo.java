class Car {
	final int max_speed = 120;

	void controlSpeed() {
		/*
		 * max_speed=180;/* final variable cant be changed. will give compile time error
		 */
		System.out.println("Max speed of the car is" + max_speed);
	}
}

public class FinalKeyWordDemo {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.controlSpeed();

	}

}
