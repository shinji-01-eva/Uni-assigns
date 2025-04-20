package task_1;

class Email extends SMS{

    String sender;
    String receiver;
    String subject;

    Email(String sender, String receiver, String subject, String text, int Contact_no){
        super(text,Contact_no);
        this.receiver=receiver;
        this.sender=sender;
        this.subject=subject;

    }
    void setSender(String sender){
        this.sender=sender;
    }

    String getSender(){
        return this.sender;
    }


    void setReceiver(String receiver){
        this.receiver=receiver;
    }

    String getReceiver(){
        return this.receiver;
    }

    void setSubject(String subject){
        this.subject=subject;
    }

    String getSubject(){
        return this.subject;
    }

    String tostring() {

        return "Senndr: "+this.sender+"\nReceiver: "+this.receiver+"\nSubject: "+this.subject+ "\nRecipient: "+ this.Contact_no +"\nMessage: "+ this.text;


    }


}

