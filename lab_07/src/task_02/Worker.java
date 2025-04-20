package task_02;

class Worker extends Employee {

    int bonus;

    Worker(int bonus){
        this.bonus=bonus;
    }

    void calculate_salary(){
        System.out.println(super.base_salary+bonus); ;

    }
}

