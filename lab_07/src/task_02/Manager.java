package task_02;


class Manager extends Employee{

    int bonus_salary ;

    Manager(int bonus_salary){
        this.bonus_salary=bonus_salary;
    }

    void calculate_salary(){
        System.out.println(super.base_salary+bonus_salary); ;

    }
}

