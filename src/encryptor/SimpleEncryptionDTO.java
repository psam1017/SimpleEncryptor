package encryptor;

public class SimpleEncryptionDTO {

	private String password;
	private String salt;
	
	/**
	 * <pre>
	 * password와 salt를 속성으로 가지는 DTO입니다.
	 * getter만 public으로 제공되므로 setter가 필요한 경우 별도의 클래스를 만들어야 합니다.
	 * Encryptor는 꼭 DTO가 없더라도 사용할 수 있습니다.
	 * 
	 * -password : String
	 * 사용자가 입력한 비밀번호를 암호화한 값입니다. 바이트 값을 16진수로 암호화한 32길이의 String 타입 변수입니다.
	 * 평문이 아니라 암호문임에 주의하십시오. 
	 * 
	 * -salt : String
	 * 서버에서 생성한 솔트 값입니다. 바이트 값을 16진수로 암호화한 32길이의 String 타입 변수입니다.
	 * </pre>
	 */
	public SimpleEncryptionDTO() { ; }
	
	// public getter
	public String getPassword() {
		return password;
	}
	
	public String getSalt() {
		return salt;
	}
	
	// default setter
	void setPassword(String password) {
		this.password = password;
	}
	
	void setSalt(String salt) {
		this.salt = salt;
	}
}
