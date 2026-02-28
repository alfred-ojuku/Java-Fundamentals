public class TestStudent{
	public static void main(String[] args){
		Student student = new Student(112342, "Alfred");
		java.util.Date dateCreated = student.getDateCreated();
		System.out.println("Date created before: " + dateCreated);
		dateCreated.setTime(200000);
		System.out.println("Date created after: " + dateCreated);
	}
}
