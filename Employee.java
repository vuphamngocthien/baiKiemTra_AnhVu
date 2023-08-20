public class Employee {
    String tenNhaVien;
    float salary_day;
   int day;

    public float CalcSalary()
    {   
        float salary = this.day * this.salary_day;
        return salary;
    }
}
