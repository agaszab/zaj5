public class Company {

   private Employee [] emp=new Employee[10];
   private int index=0;

    void add (Employee employee) {
    emp[index]=employee;
    index++;
    }
}
