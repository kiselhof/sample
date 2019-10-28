package sample;

public class Human {
    private String _name;
    private String _surname;

    public Human(){
        this._name = "Anna";
        this._surname = "Kiselhof";
    }

    public void Print(){
        System.out.println(_name+ " "+_surname);
    }

    public String get_name(){ return _name;}
    public String get_surname(){ return _surname;}

    public void set_name(String name) {_name = name;}
    public void set_surname(String surname) {_surname = surname;}

}
