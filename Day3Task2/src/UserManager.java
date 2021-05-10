
public class UserManager {
	public void add() {
		System.out.println("Kullanýcý eklendi.");
	}
	public void add(User user) {
		System.out.println("Kullanýcý eklendi : " + user.getFirstName() + " " + user.getLastName());
	}
	public void update(User user) {
		System.out.println("Kullanýcý bilgileri güncellendi : " + user.getFirstName() + " " + user.getLastName() );
	}
	public void delete(User user) {
		System.out.println("Kullanýcý silindi. Kullanýcý Id : " + user.getId() );
	}
}
