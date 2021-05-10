
public class StudentManager extends UserManager{
	public void add() {
		
	}

	@Override
	public void add(User user) {
		System.out.println("Öðrenci giriþi tamamlandý. Giriþ yapan öðrenci adý" + user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println( "Öðrenci Güncellendi." );
	}

	@Override	
	public void delete(User user) {
		System.out.println("Öðrenci kaydý silinmiþtir.");
	}

}
