package designpattern;


interface Salary {
    public int getSalary();    
}

class AndriodDeveloper implements Salary{
    @Override
    public int getSalary() {
        return 1000;
    }
}

class WebDeveloper implements Salary{
    @Override
    public int getSalary() {
        return 1000;
    }
}

public class FactoryDesign {
    public static void main(String[] args) {
        
    }
}
