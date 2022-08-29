package lesson_06;

public class CarTest {

	String maker;
	String model;
	String year;
	int speed;
	int distance;
	/*
	CarTest sınıfında Person tipinde bir nesne yarattık.
	 */
	Person owner;

	//Nesnenin behaviorları yani davranıslarını methodlar ile saglariz.
	public void go (int newDistance){
		distance += newDistance;
	}
	public void accelarate(int newSpeed){
		speed = newSpeed;
	}
	public void stop(){
		speed = 0;
	}
	public String getInfo() {
		String info = "Car Info : " + year + " " + maker + " " + model + " " + speed + " " + distance;
		if (owner != null) {
			info += " and its owner is " + owner.firstName + " " + owner.lastName;
		}
		else {
			info += " and does not have an owner!";
		}
		return info;
	}
}
