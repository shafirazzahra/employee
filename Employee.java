public class Employee {
    private double salary;
    private String name;

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*Constructor nama sama dengan nama Class */
    public Employee() {
        salary = 0;
        name = "";

    }
    //Constructor Parameter
    public Employee( String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    //pethod
    public void print() {
        System.out.println("Name: "+name);
        System.out.println("salary: "+salary);

    }
}

