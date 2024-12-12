package homeAssignment.week3_2;

public class Concrete implements DatabaseConnection{

	public void connect() {
		System.out.println("connected with system");
		
	}

	public void disconnect() {
		System.out.println("disconnected with system");
		
	}

	public void executeUpdate() {
		System.out.println("System executes the update");
	}
public static void main(String[] args) {
	Concrete md=new Concrete();
	md.connect();
	md.disconnect();
	md.executeUpdate();
}
}
