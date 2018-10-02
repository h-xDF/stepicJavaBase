package test;

public enum InitEnum {

    ONE("one"),
    TWO("two"),
    THRE("thre");

    private final String str;

    InitEnum(String value){
        this.str = value;
    }

    public String getValue() {
        return this.str;
    }
}
