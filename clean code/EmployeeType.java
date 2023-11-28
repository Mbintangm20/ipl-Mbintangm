public class EmployeeType {
    class EmployeeType {
        abstract int payAmount(Employee emp);
    }
        class Salesman {
        int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
        }
    }
        class Manager {
        int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
        }
    }
}
