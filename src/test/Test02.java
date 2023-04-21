package test;

import encryptor.SimpleEncryptor;

public class Test02 {
	public static void main(String[] args) throws Exception {
		
		// String만을 이용한 암호화 및 인증
		// DTO를 활용하지 않더라도 직접 String으로 password와 salt로 조작할 수 있습니다.
		
		String password = "password";
		
		SimpleEncryptor encryptor = new SimpleEncryptor();
		
		String randomSalt = encryptor.generateSalt();
		String encryptedPassword = encryptor.encryptPassword(password, randomSalt);
		
		System.out.println("encrypted password : " + encryptedPassword);
		System.out.println("random salt : " + randomSalt);
		System.out.println("authentication success : " + encryptor.compare("password", encryptedPassword, randomSalt));
		System.out.println("authentication fail : " + encryptor.compare("incorrect", encryptedPassword, randomSalt));
		System.out.println("authentication by null : " + encryptor.compare(null, encryptedPassword, randomSalt));
	}
}
