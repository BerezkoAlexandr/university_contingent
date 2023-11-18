package mainpack;

public enum Activity {

    STUDENT("studies"),
    PROFESSOR("teaches");

    public String value;

    Activity(String value) {

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
