package review_java;

public enum NewEnum {
    NORTH("North"),
    EAST("East"),
    SOUTH("South"),
    WEST("West");

    String name;

    private NewEnum(String name){
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public static NewEnum xformToEnum(String strx) {
        for (NewEnum enumX : NewEnum.values()) {
            if (enumX.getName().equals(strx)) {
                return enumX;
            }

        }
        throw new IllegalArgumentException("bad enum arg");
        
    }


}
