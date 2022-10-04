package New;

public class Human {
    String name;
    String surName;
    String middleName;
    int age;
    Human(){
    }
    Human(String name,String surName,String middleName,int age){
        this.name=name;
        this.surName=surName;
        this.middleName=middleName;
        this.age=age;
    }
    void setName(String name){
        this.name=name;
    }String getName(){
        return name;
    }void setSurName(String surName){
        this.surName=surName;
    }String getSurName(){
        return surName;
    }void setMiddleName(String middleName){
        this.middleName=middleName;
    }String getMiddleName(){
        return middleName;
    }void setAge(int age){
        this.age=age;
    }int getAge(){
        return age;
    }public String toString(){
        return "Name-"+name + " ,surname-"+surName+
                " ,middlename-"+middleName+
                " ,age-"+age;
    }
}
