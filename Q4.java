package classicetasktogithub;
public class Q4 {
    
      private double salary;
      public Q4  (double salary) {
          this.salary = salary;
      }
      public void work() {
          System.out.println("Employee is working");
      }
      public double getSalary() {
          return salary;
      }
}
class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }
    public void work() {
        System.out.println("HR Manager is managing human resources");
    }
    public void addEnloyee(String employeeName) {
        System.out.println("HR Manager added a new employee:" + employeeName);
    }
    public static void main(String[] args) {
        Employee employee = new Employee(5000.00);
        HRManager hrManager = new HRManager(1000.00);
        employee.work();
        System.out.println("Employee salary:"+ employee.getSalary());
        
        hrManager.work();
        System.out.println("HR Manager salary:"+ hrManager.getSalary());
        
        hrManager.addEmployee("Florance France");
    }
private void addEmployee(String florance_France) {
    }
}