public class Emplyoee {

    private Integer id;
    private String name;
    private Double salary;

    public Emplyoee(){
    }


    public Emplyoee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Double getSalary(){
        return salary;
    }

    public void Addsalary(double percentage){
        salary += salary * percentage / 100.0;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Salary: " +String.format("%.2f", salary);
    }
}
