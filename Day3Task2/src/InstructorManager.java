

public class InstructorManager extends UserManager {

	@Override
	public void add() {
		super.add();
	}

	@Override
	public void add(User user) {
		System.out.println("Yeni Eðitmen eklendi. Eðitmen adý " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println("Eðitmen güncellendi.");
	}

	@Override
	public void delete(User user) {
		System.out.println("Eðitmen silindi.");
	}

}