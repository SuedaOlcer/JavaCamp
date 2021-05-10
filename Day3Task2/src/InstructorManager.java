

public class InstructorManager extends UserManager {

	@Override
	public void add() {
		super.add();
	}

	@Override
	public void add(User user) {
		System.out.println("Yeni E�itmen eklendi. E�itmen ad� " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println("E�itmen g�ncellendi.");
	}

	@Override
	public void delete(User user) {
		System.out.println("E�itmen silindi.");
	}

}