package HomeWork_6.SRP;

public class EmployeeSalaryCalculate {

    /**
     * Класс для отделения вычисления ЗП,
     * чтобы не редактировать класс Employee при будущем изменении правил вычисления зарплаты.
     */
    private int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculate(){
        return this.baseSalary * 1.5;
    }
}
