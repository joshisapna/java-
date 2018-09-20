package co.edureka;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape {
	
	/*private List<point> points;

	public List<point> getPoints() {
		return points;
	}

	public void setPoints(List<point> points) {
		this.points = points;
	}
	
	public void draw() {
	for(point point : points) {
		System.out.println("point=( "+point.getX()+ ","+ point.getY()+")");
		
	}
	}*/
	

private point pointA;
private point pointB;
private point pointC;
public point getPointA() {
	return pointA;
}
public void setPointA(point pointA) {
	this.pointA = pointA;
}
public point getPointB() {
	return pointB;
}
public void setPointB(point pointB) {
	this.pointB = pointB;
}
public point getPointC() {
	return pointC;
}
public void setPointC(point pointC) {
	this.pointC = pointC;
}

public void draw()
{
	System.out.println("Drawing a traingle");
	System.out.println("pointA (" +getPointA().getX()+","+getPointA().getY()+")");
	System.out.println("pointB (" +getPointB().getX()+","+getPointB().getY()+")");
	System.out.println("pointC (" +getPointC().getX()+","+getPointC().getY()+")");
}

/*public void MyInit()
{
	System.out.println("Bean has been initialized");
}

public void cleanUp()
{
	System.out.println("Bean has been destroyed");
}
*/
}



