package com.gurukul.day4;

class Polar{
	private double r,th;

	@Override
	public String toString() {
		return "Polar [r=" + r + ", th=" + th + "]";
	}


	public double getX() {
		double rad = Math.toRadians(th);
		return r*Math.cos(rad);
	}
	

	public double getY() {
		double rad = Math.toRadians(th);
		return r*Math.sin(rad);
	}
	
	 public void setX(double x,double y) {
			 r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			  th = Math.atan(y / x);
			  th= Math.toDegrees(th);
	 }

	

	public Polar(double r, double th) {
		super();
		this.r = r;
		this.th = th;
	}
}

public class PolarProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polar a= new Polar(5,50);
		Polar b= new Polar(6,50);
		Polar c= new Polar(0, 0);
		double x=a.getX()+b.getX();
		double y=a.getY()+b.getY();
		c.setX(x, y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

	}

}

public class OopsProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee x= new Employee("Krishna", "Asd31", 40000, "Computer Science");
		
		Employee y = new Employee("Krishna2", "Asd32", 50000, "Science");
		Employee z = new Employee("Krishna3", "Asd33", 60000, "Computer");
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
//		if (x.getSalary() > y.getSalary() && x.getSalary() > z.getSalary()) {
//			System.out.println(x.toString());
//		} else if (y.getSalary() > z.getSalary()) {
//			System.out.println(y.toString());
//		} else {
//			System.out.println(z.toString());
//		}
		//compare employee salary
		Employee max=x;
		if (max.getSalary()<y.getSalary()) {
			max=y;			
		}
		if (max.getSalary()<z.getSalary()) {
			max=z;
		}
		System.out.println(max);
		
		max.getDepertment();
		System.out.println(max.getDepertment());
	}

}
