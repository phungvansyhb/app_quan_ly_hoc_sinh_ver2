package bean;

public class student {
	
	private String studentName;
	private String className;
	private int classID;
	private double mathPoint;
	private double physicPoint;
	private double chemPoint;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public double getMathPoint() {
		return mathPoint;
	}
	public void setMathPoint(double point) {
		this.mathPoint = point;
	}
	public double getPhysicPoint() {
		return physicPoint;
	}
	public void setPhysicPoint(double physicPoint) {
		this.physicPoint = physicPoint;
	}
	public double getChemPoint() {
		return chemPoint;
	}
	public void setChemPoint(double chemPoint) {
		this.chemPoint = chemPoint;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
}
