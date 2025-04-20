package task_1;

class SMS extends Message{

    int Contact_no;

    SMS(String text, int Contact_no){

        super(text);
        this.Contact_no=Contact_no;

    }



    void set_contact(int Contact_no)
    {
        this.Contact_no=Contact_no;
    }

    String tostring() {
        return "\nRecipient: "+ this.Contact_no +"\nMessage: "+ this.text;
    }


}

