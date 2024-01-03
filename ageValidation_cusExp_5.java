class CustomException extends Exception {
    public CustomException(String str){
        super(str);
    }
}
class ageValidation_cusExp_5 {
    public ageValidation_cusExp_5(int age) throws CustomException{
        if(age >=60){
            System.out.println("Valid Age");
        } else{
            throw new CustomException("Invalid age");
        }
    }
    public static void main(String[] args) {
        try {
            ageValidation_cusExp_5 age = new ageValidation_cusExp_5(87);
        } catch (CustomException c) {
            System.out.println(c.getMessage());
        }
    }
}
