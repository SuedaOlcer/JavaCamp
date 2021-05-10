
public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setFirstName("Mine");
		user.setLastName("T�rk");

		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Nil");
		instructor.setLastName("�ubuk");
		
		String [] courses = {"JAVA","C#","Kotlin"};
		instructor.setCourses(courses);
		
		Student student =new Student ( 1," Mine " , "T�rk");
		UserManager userManager = new UserManager();
		//userManager.add();
		//userManager.add(user);
		//userManager.add(student);
		//userManager.delete(user);
		//userManager.update(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		
	}

}
