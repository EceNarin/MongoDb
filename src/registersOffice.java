import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class registersOffice {
static Scanner scan=new Scanner(System.in);
static Map<Integer,Student> stData=new TreeMap<>();
static TreeMap<Integer,Instructor> insData=new TreeMap<>();
static HashMap<Integer,String> findStudentIns=new HashMap<>();
 public static Map<Integer,Student> studentAdd() {

	 stData.put(10,new Student("John", "Walker"));
	 stData.put(11,new Student("Tom", "Hanks"));
	 stData.put(12, new Student ("Kevin", "Star"));
	 stData.put(13,new Student("Carl", "Wall"));
	 stData.put(14,new Student("Andrei", "Hawkings"));
	 stData.put(15, new Student ("Mark", "High"));
	 stData.put(16,new Student("Clara", "Star"));
	 stData.put(17,new Student("Jhon ", "Ocean"));
	 stData.put(18, new Student ("Carl", "Wallker"));
	 stData.put(19,new Student("John", "Walker"));
	 stData.put(20,new Student("Pamela", "Star"));
	 return stData;
 }
 public static TreeMap<Integer,Instructor> instructor(){
	insData.put(1,new Instructor("Mark","Adam","1244525535","Science"));
	insData.put(2,new Instructor("Eve","Sky","142435535", "Engineering"));
	insData.put(3,new Instructor("Leo","Ocean", "675653656", "Language"));
	insData.put(4,new Instructor("Andy","Mark", "64536672", "Health"));
	return insData;
	 
 }
    public static void findStudentInstructor() {
       String  srt="instructor is: " + instructor().get(2);
    	findStudentIns.put(11,srt);
    	String srt1=instructor().get(1)+ " " +instructor().get(3);
    	findStudentIns.put(12,srt1);
    	String srt2="instructor is: " +instructor().get(1);
    	findStudentIns.put(13,srt2);
    	String srt3="instructor is: " + instructor().get(1)+ "- Second instructor is: " + instructor().get(4);
    	findStudentIns.put(15, srt3);
    	String srt4="Instructor is : " + instructor().get(3);
    	findStudentIns.put(17, srt4);
    	System.out.println("please input your student number and check your instructor who is/are ");
    	int x=scan.nextInt();
    	if(findStudentIns.getOrDefault(x, null )==null) {
    		System.out.println("we couldnt find any instructor for this number ");
    	}else {
    		System.out.println(findStudentIns.get(x));
    	}
    }
    public static void main(String[] args) {
		findStudentInstructor();
	}

 
}
