
public class Test2 {

	public static void main(String[] args) {
		new Thread(() -> MySingleton.getInstance()).start();
		new Thread(() -> MySingleton.getInstance()).start();
	}

}
