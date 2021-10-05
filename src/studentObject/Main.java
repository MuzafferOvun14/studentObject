package studentObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student();
		student1.setName("Emrah");
		student1.setSurname("BAYRAM");
		student1.setGender(true);
		student1.setAge(38);
		student1.setClassRoom("10AMP");
		student1.setStage(10);
		student1.setNationalIdentity("543521432");
		student1.setLength(1.73);
		student1.setSchoollNumber("324");
		System.out.println("Öðrenci :" 
		+student1.getName()+" "+student1.getSurname());
		
		Student student2=new Student("Ahmet","Özdemir"
				,"148",11,1.78,41,"11AMP",true,"45522");
		System.out.println(student2.getNationalIdentity());
		Schooll okul=new Schooll("ÝBMTAL","Tabaklar"
				, "0374512544");
		System.out.println(okul.getName());
	}

}
