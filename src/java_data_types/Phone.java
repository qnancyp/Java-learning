package java_data_types;

public class Phone {
	int imei;
	String make;
	String model;
	String color;
	int memory;
	String camera;

	void makecalls() {
		System.out.println("IMEI :" + imei + "\nMake : " + make + "\nModel: " + model + "\nColor : " + color
				+ "\nMemory: " + memory + "\nCamara :" + camera);
	}

}
