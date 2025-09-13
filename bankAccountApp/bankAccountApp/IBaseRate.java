package bankAccountApp;

public interface IBaseRate {
	 default double setBaseRate() {
		return 2.5;
	}

}
