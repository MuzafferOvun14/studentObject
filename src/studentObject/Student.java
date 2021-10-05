package studentObject;

public class Student {
	private String name;
	private String surname;
	private String schoollNumber;
	private int stage;
	private double length;
	private int age;
	private String classRoom;
	private boolean gender;
	private String nationalIdentity;
	public Student() {
		super();
	}
	public Student(String name, String surname, String schoollNumber, int stage, double length, int age,
			String classRoom, boolean gender, String nationalIdentity) {
		super();
		this.name = name;
		this.surname = surname;
		this.schoollNumber = schoollNumber;
		this.stage = stage;
		this.length = length;
		this.age = age;
		this.classRoom = classRoom;
		this.gender = gender;
		this.nationalIdentity = nationalIdentity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSchoollNumber() {
		return schoollNumber;
	}
	public void setSchoollNumber(String schoollNumber) {
		this.schoollNumber = schoollNumber;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
}
