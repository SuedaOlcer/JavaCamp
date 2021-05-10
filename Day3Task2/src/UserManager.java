
public class UserManager {
	public void add() {
		System.out.println("Kullan�c� eklendi.");
	}
	public void add(User user) {
		System.out.println("Kullan�c� eklendi : " + user.getFirstName() + " " + user.getLastName());
	}
	public void update(User user) {
		System.out.println("Kullan�c� bilgileri g�ncellendi : " + user.getFirstName() + " " + user.getLastName() );
	}
	public void delete(User user) {
		System.out.println("Kullan�c� silindi. Kullan�c� Id : " + user.getId() );
	}
}
