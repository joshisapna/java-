package co.edureka;

public class circle implements Shape{
	private point center;

	public point getCenter() {
		return center;
	}

	public void setCenter(point center) {
		this.center = center;
	}
	
	public void draw() {
		System.out.println("circle :point is :" + center.getX() +","+center.getY() + ")");
	}
	

}
