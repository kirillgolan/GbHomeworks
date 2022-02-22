/**
 * Java 1. HomeWork #5
 *
 * @author KirillGolan
 * @version 22.02.22.
 */
class HomeWork5 {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("John Smith","Manager","john.@mail.com","555-55-15",80000,15);
        empArray[1] = new Employee("Kevin Smith","Manager","kevin.@mail.com","615-12-15",80000,45);
        empArray[2] = new Employee("Jason Smith","CEO","jason.@mail.com","717-55-15",180000,96);
        empArray[3] = new Employee("Morgan Smith","Manager","morgan.@mail.com","888-55-15",80000,40);
        empArray[4] = new Employee("Marvin Branagah","Manager","marvin.@mail.com","124-55-15",69000,39);
        //System.out.println(empArray[0]);
        //System.out.println(empArray[1]);
        //System.out.println(empArray[2]);
        //System.out.println(empArray[3]);
        //System.out.println(empArray[4]);
        for (Employee oldEmployee : empArray)
            if (oldEmployee.getAge() > 40) {
                System.out.println(oldEmployee);
            }
    }
}
class Employee {
    private String fullName;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Employee(String fullName, String post, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return fullName + "|" + post  + "|" + email + "|" + phone + "|" + salary + "|" + age;
    }

}