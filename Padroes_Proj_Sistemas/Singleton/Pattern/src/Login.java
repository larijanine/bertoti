
public class Login {
	
	private static Login instance;
	
	private Username username;
	
	private Login(Username username) {
		this.username = username;
	}
	
	public static Login getInstance(Username username) {
		if (instance == null) {
			instance = new Login(username);
		}
		
		return instance;
	}
	
	
}
