package HomeWork5;
public class Q7 {
     private String name;
   private double salary;

    public Q7() {
        name = "Ali";
        salary = 500000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double salary_percentage(){
        this.salary=salary+salary*0.1;
        return this.salary;
    }
}
