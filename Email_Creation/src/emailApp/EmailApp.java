package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email em1 = new Email("John","Smith");
		
		String employeeInfo = em1.showInfo();
		System.out.println("====EMPLOYEE DETAILS====");
		System.out.println(employeeInfo);

	}

}
