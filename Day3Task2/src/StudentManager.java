
public class StudentManager extends UserManager{
	public void add() {
		
	}

	@Override
	public void add(User user) {
		System.out.println("��renci giri�i tamamland�. Giri� yapan ��renci ad�" + user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println( "��renci G�ncellendi." );
	}

	@Override	
	public void delete(User user) {
		System.out.println("��renci kayd� silinmi�tir.");
	}

}
