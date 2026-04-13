public class UseBMIClass{
	public static void main(String[] args){
		BMI bmi1 = new BMI("Alfred Okinyi", 26, 69, 1.8);
		System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
	}
}
