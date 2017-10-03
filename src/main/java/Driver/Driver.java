package Driver;

import java.util.ArrayList;

import SRS.Course;
import SRS.Module;
import SRS.Student;

public class Driver {

	public static void main(String[] args) {
		
		//Create students
		ArrayList<Student> aStudents = new ArrayList<Student>();
		Student RossBiro = new Student("Ross Biro", 9, 12, 1994);
		aStudents.add(RossBiro);
		Student JosphineGreenwood = new Student("Josphine Greenwood", 12, 12, 1993);
		aStudents.add(JosphineGreenwood);
		Student CaritaZarate = new Student("Carita Zarate", 1, 2, 1990);
		aStudents.add(CaritaZarate);
		Student TimothyHull = new Student("Timothy Hull", 19, 5, 1993);
		aStudents.add(TimothyHull);
		Student JeffreyHanlon = new Student("Jeffrey Hanlon", 20, 1, 1994);
		aStudents.add(JeffreyHanlon);
		Student AlicaHollins = new Student("Alica Hollins", 15, 4, 1991);
		aStudents.add(AlicaHollins);
		Student StevieAlfonso = new Student("Stevie Alfonso", 18, 3, 1993);
		aStudents.add(StevieAlfonso);
		Student IrmaNagler = new Student("Irma Nagler", 21, 12, 1985);
		aStudents.add(IrmaNagler);
		Student MaribethRundle = new Student("Maribeth Rundle", 8, 6, 1990);
		aStudents.add(MaribethRundle);
		Student IsabelMccallie = new Student("Isabel Mccallie", 5, 5, 1995);
		aStudents.add(IsabelMccallie);
		//create modules
		Module CT417 = new Module("Software Engineering", "CT417");
		Module CT420 = new Module("Real Time Systems", "CT420");
		Module CT422 = new Module("Modern Information Management", "CT422");
		//add students to modules
		CT417.addStudent(RossBiro);
		CT420.addStudent(RossBiro);
		CT422.addStudent(RossBiro);
		CT417.addStudent(JosphineGreenwood);
		CT420.addStudent(JosphineGreenwood);
		CT417.addStudent(CaritaZarate);
		CT422.addStudent(CaritaZarate);
		CT417.addStudent(TimothyHull);
		CT420.addStudent(TimothyHull);
		CT422.addStudent(TimothyHull);
		CT417.addStudent(JeffreyHanlon);
		CT420.addStudent(JeffreyHanlon);
		CT417.addStudent(AlicaHollins);
		CT422.addStudent(AlicaHollins);
		CT417.addStudent(StevieAlfonso);
		CT420.addStudent(StevieAlfonso);
		CT422.addStudent(StevieAlfonso);
		CT417.addStudent(IrmaNagler);
		CT420.addStudent(IrmaNagler);
		CT417.addStudent(MaribethRundle);
		CT422.addStudent(MaribethRundle);
		CT417.addStudent(IsabelMccallie);
		//create  course
		Course CSIT = new Course("CS&IT", 1, 9, 2017, 30, 5, 2018);
		//add modules to course
		CSIT.addModule(CT417);
		CSIT.addModule(CT420);
		CSIT.addModule(CT422);
		
		/*
		//print out students by module
		System.out.println("----------------------------------------");
		System.out.println(CSIT.getName());
		for(int i=0;i<CSIT.getaModules().size();i++){
			//for each module
			System.out.println("----------------------------------------");
			System.out.println(CSIT.getaModules().get(i).getName());
			System.out.println("----------------------------------------");
			for(int j=0;j<CSIT.getaModules().get(i).getaStudents().size();j++) {
				
				System.out.println(CSIT.getaModules().get(i).getaStudents().get(j).getName());
			}
					}
		System.out.println("----------------------------------------");
		*/
		
		
		//For each student 
		for(int i=0;i<aStudents.size();i++) {
			//check if student is registered in each module
			System.out.println("----------------------------------------");
			System.out.println("Student: "+aStudents.get(i).getName());
			System.out.println("Course: "+CSIT.getName());
			System.out.println("Moudules:");
			for(int j=0;j<CSIT.getaModules().size();j++) {
				//System.out.println("Moudule"+j);
				for(int k=0;k<CSIT.getaModules().get(j).getaStudents().size();k++) {
					//StudentCheck
					if(CSIT.getaModules().get(j).getaStudents().get(k).getUsername().equals(aStudents.get(i).getUsername())) {
						//if student is in module print out module ID and name
						System.out.println(CSIT.getaModules().get(j).getID()+": "+CSIT.getaModules().get(j).getName());
					}
				}
			}
		}
		System.out.println("----------------------------------------");

		

	}

}
