package thread;

public class User {
private Calculator cal;

public User(Calculator cal) {
	super();
	this.cal = cal;
	setName("user");

@Override
public void run() {
		cal.memory(50);
	}
}

}
