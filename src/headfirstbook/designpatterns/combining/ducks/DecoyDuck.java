package headfirstbook.designpatterns.combining.ducks;

public class DecoyDuck implements Quackable {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
