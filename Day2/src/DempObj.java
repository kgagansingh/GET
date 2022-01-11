
class Box {
	private int l, b;

	Box() {
	}

	Box(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public void print() {
		System.out.print("l: " + l + " b: " + b);
	}
}

class Box3D extends Box {
	private int h;

	Box3D(int l, int b, int h) {
		super(l, b);
		this.h = h;
	}

	public void print() {
		super.print();
		System.out.print("h: " + h);
	}

}

class Box3DWithColor extends Box3D {
	private String color;

	Box3DWithColor(int l, int b, int h, String color) {
		super(l, b, h);
		this.color = color;
	}

	public void print() {
		super.print();
		System.out.println("color: " + color);
	}
}

public class DempObj {
	public static void main(String[] args) {
		Box3DWithColor b = new Box3DWithColor(1, 2, 3, "Black");
		b.print();

	}
}