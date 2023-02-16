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
            System.out.println("4. DELETE");
            System.out.println("5. UPDATE");
            System.out.print("ENTER YOUR CHOICE: ");
            data = getInput.nextInt();

            System.out.println("");

            switch(data){
                // INSERT
                case 1:
                    System.out.println("-=-=-=-=-= INSERT EMPLOYEE DATA -=-=-=-=-=");
                    System.out.print("Enter Employee No: ");
                    eno = getInput.nextInt();
                    System.out.print("Enter Employee Name: ");
                    ename = getString.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    esalary = getInput.nextInt();
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("");

                    employees.add(new Employee(eno, ename, esalary));
                break;

                // DISPLAY
                case 2:
                    System.out.println("-=-=-=-=-= DISPLAY EMPLOYEE DATA -=-=-=-=-=");
                    Iterator<Employee> i = employees.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("");
                break;

                // SEARCH
                case 3:
                    Boolean found = false;
                    System.out.println("-=-=-=-=-= SEARCH EMPLOYEE DATA -=-=-=-=-=");
                    System.out.print("Enter Employee No: ");
                    eno = getInput.nextInt();

                    i = employees.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                            if(e.getEmployee_no() == eno){
                                System.out.println(e);
                                found = true;
                            }
                    }

                    if(!found){
                        System.out.println("RECORD NOT FOUND!");
                    }
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("");
                break;

                // DELETE
                case 4:
                    found = false;
                    System.out.println("-=-=-=-=-= DELETE EMPLOYEE DATA -=-=-=-=-=");
                    System.out.print("Enter Employee No: ");
                    eno = getInput.nextInt();

                    i = employees.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                            if(e.getEmployee_no() == eno){
                                i.remove();
                                found = true;
                            }
                    }

                    if(!found){
                        System.out.println("RECORD NOT FOUND!");
                    } else {
                        System.out.println("RECORD IS DELETED SUCCESSFULLY!");
                    }
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("");
                break;

                // SEARCH
            case 5:
                found = false;
                System.out.println("-=-=-=-=-= UPDATE EMPLOYEE DATA -=-=-=-=-=");
                System.out.print("Enter Employee No. to Update: ");
                eno = getInput.nextInt();
                
                ListIterator<Employee> li = employees.listIterator();
                while (li.hasNext()) {
                    Employee e = li.next();
                    if (e.getEmployee_no() == eno) {
                        System.out.println("");
                        System.out.println("Update the following:");
                        System.out.print("Enter Employee Name: ");
                        ename = getString.nextLine();
                        System.out.print("Enter Employee Salary: ");
                        esalary = getInput.nextInt();

                        li.set(new Employee(eno, ename, esalary));
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("RECORD NOT FOUND!");
                } else {
                    System.out.println("RECORD IS UPDATED SUCCESSFULLY!");
                }
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("");
            }



            System.out.println("");
        }while(data != 0);

    }

}