
public class UserManager {
	public void add() {
		System.out.println("Kullanıcı eklendi.");
	}
	public void add(User user) {
		System.out.println("Kullanıcı eklendi : " + user.getFirstName() + " " + user.getLastName());
	}
	public void update(User user) {
		System.out.println("Kullanıcı bilgileri güncellendi : " + user.getFirstName() + " " + user.getLastName() );
	}
	public void delete(User user) {
		System.out.println("Kullanıcı silindi. Kullanıcı Id : " + user.getId() );
	}
}
