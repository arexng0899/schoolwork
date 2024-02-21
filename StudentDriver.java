public class StudentDriver {

   public static void main(String args[]) {
      Student s1 = new Student("John Smith", "Computer Science");
      s1.addCourseRecord("CSC1301",4,"A");
      s1.addCourseRecord("CSC1302",4,"B");
      s1.addCourseRecord("CSC2720",3,"A");
      System.out.println(s1.getName()+"s GPA is: "+s1.gpa());
      System.out.println(s1);
      Student s2 = new Student("Jenna Smith", "Mathematics");
      s2.addCourseRecord("MATH1111",3,"B");
      s2.addCourseRecord("MATH1113",3,"C");
      s2.addCourseRecord("MATH2211",4,"C");
      s2.addCourseRecord("MATH2212",4,"D");
      s2.addCourseRecord("MATH3030",3,"B");
      System.out.println(s2.getName()+"s GPA is: "+s2.gpa());
      System.out.println(s2);
  }

}
