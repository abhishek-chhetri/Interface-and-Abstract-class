package Abstractclass;
public class Programming extends FirstYearCourse 
{
    public void printName()
    {
        System.out.println("Course Name:Java");
    }
    public void printCode()
    {
          System.out.println("Course code: CSE101");
    }
    public static void main(String[] args)
    {
        Programming course = new Programming();
        course.printName();
        course.printCode();
        course.printTotalWeeks();
    }

}
