package mainpack;


   public enum Gender {
       MALE("He", "His"),
       FEMALE("She", "Her");

       public String value, value2;
       Gender(String value, String value2){

           this.value = value;
           this.value2 = value2;
       }
    public String getValue() {
           return value;
    }
    public  String getValue2() {
           return value2;
    }

}
