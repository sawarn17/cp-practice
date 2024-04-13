package designpattern;
class PrototypeDesignMain implements Cloneable{
    private String name;
    private Long userId;

    public PrototypeDesignMain(String name, Long id){
        this.name = name;
        this.userId = id;
    }

    private String getName(){
        return this.name;
    }

    private Long getId(){
        return this.userId;
    }

    private void setName(String name){
        this.name = name;
    }

    private void setUserId(Long userId){
        this.userId = userId;
    }

    
}

public class PrototypeDesign {
    
}
