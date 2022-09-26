package _02_Intro_To_Abstract_Classes_and_Interfaces;

public class Abstract extends AbstractClassDemo implements InterfaceDemo, DemoInterface {

	@Override
	public String faceDemo() {
		return "implemented";
	}

	@Override
	public double interDemo() {
		return 6.7;
	}

	@Override
	public void abstractDemo() {
		System.out.println("Demo That Is Abstract");
		
	}

	@Override
	public int abstractNumDemo() {
		return 46517;
	}

}
