package task_02;

class Main{
    public static void main(String[] args) {
        Employee asim = new Employee();
        Worker Waqar = new Worker(3000);
        Manager hasan = new Manager(50000);

        asim.calculate_salary();
        Waqar.calculate_salary();
        hasan.calculate_salary();

    }
}

