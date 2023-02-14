import java.util.*;

class Employee{
    private int employee_no;
    private String employee_name;
    private int employee_salary;

    Employee(int employee_no, String employee_name, int employee_salary){
        this.employee_no = employee_no;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public int getEmployee_no(){
        return employee_no;
    }
    
    public String getEmployee_name() {
        return employee_name;
    }
    
    public int getEmployee_salary() {
        return employee_salary;
    }

    public String toString(){
        return employee_no+" "+employee_name+" "+employee_salary;
    }
    
}

class EmployeeCollection{
    public static void main(String[] args){

        List<Employee> employees = new ArrayList<Employee>();
        Scanner getInput = new Scanner(System.in);
        Scanner getString = new Scanner(System.in);
        int data, eno, esalary;
        String ename;

        do {

            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. UPDATE");
            System.out.println("5. DELETE");
            System.out.print("ENTER YOUR CHOICE: ");
            data = getInput.nextInt();

            System.out.println("");

            switch(data){
                case 1:
                    System.out.println("-=-=-=-=-= INSERT EMPLOYEE DATA -=-=-=-=-=");
                    System.out.print("Enter Employee No: ");
                    eno = getInput.nextInt();
                    System.out.print("Enter Employee Name: ");
                    ename = getString.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    esalary = getInput.nextInt();
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=/n");
                break;
            }



            System.out.println("");
        }while(data != 0);

    }

}