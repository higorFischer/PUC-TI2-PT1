
public class User {

	int Code;
	String Login;
	String Password;
	char Gender;
	
	public User() {
		this.Code = -1;
		this.Login = "";
		this.Password = "";
		this.Gender = '*';
	}
	
	public User(int code, String login, String password, char gender) {
		this.Code = code;
		this.Login = login;
		this.Password = password;
		this.Gender = gender;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public char getGender() {
		return Gender;
	}

	public void setGender(char gender) {
		Gender = gender;
	}
}
