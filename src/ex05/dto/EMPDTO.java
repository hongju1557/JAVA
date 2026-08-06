package ex05.dto;


public class EMPDTO {
    String empId;
    String empName;
    int salary;

    
    public EMPDTO(String empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "%s %s %s".formatted(null);
    }

    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    
}
