class CustomException extends Exception {
    public CustomException(String str) {
        super(str);
    }
}

class strLen_cusExp_4 {
    String name;

    public strLen_cusExp_4(String str) throws CustomException {
        if (str.length() >= 8) {
            System.out.println("Valid String");
        } else {
            throw new CustomException("Invalid string length");
        }
    }

    public static void main(String[] args) {
        try {
            strLen_cusExp_4 cusExp = new strLen_cusExp_4("rupeshkumar");
        } catch (CustomException e) {
            System.out.println(e);
        }
    }
}
