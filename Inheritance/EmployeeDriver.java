import java.util.ArrayList;

public class EmployeeDriver {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500));
        employees.add(new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32));
        employees.add(new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47));
        employees.add(new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000));
        employees.add(new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700));
        employees.add(new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000));
        employees.add(new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000));

        // Print table header
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "First Name", "Last Name", "Social Sec #",
                "Weekly Salary", "Wage", "Hours Worked", "Com Rate", "Gross Salary", "Base Salary");

        //Print employee information specific to employee type
        for(Employee employee: employees) {
            if(employee instanceof SalariedEmployee) {
                System.out.printf("%-15s%-15s%-15s$%-,14d\n", employee.getFirstName(), employee.getLastName(),
                        employee.getSocialSecurityNumber(), ((SalariedEmployee) employee).getWeeklySalary());
            }

            if(employee instanceof HourlyEmployee) {
                System.out.printf("%-15s%-15s%-15s%-15s$%-,14d%-,15d\n", employee.getFirstName(), employee.getLastName(),
                        employee.getSocialSecurityNumber(), "", ((HourlyEmployee) employee).getWage(),
                        ((HourlyEmployee) employee).getHoursWorked());
            }

            if(employee instanceof CommissionEmployee) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-,2d%-13s$%-,14d\n", employee.getFirstName(),
                        employee.getLastName(), employee.getSocialSecurityNumber(), "", "", "",
                        ((CommissionEmployee) employee).getCommissionRate(), "%", ((CommissionEmployee) employee).getGrossSales());
            }

            if (employee instanceof BaseEmployee) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s$%-,14d\n", employee.getFirstName(),
                        employee.getLastName(), employee.getSocialSecurityNumber(), "", "", "", "", "",
                        ((BaseEmployee) employee).getBaseSalary());
            }
        }
    }
}