class findingQuoRem{
    int number1;
    int number2;
    findingQuoRem(int number1,int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    void quorem(){
        System.out.println(" The Quotient is "+(number1/number2)+" and Reminder is "+(number1 % number2)+" of two number "+number1+" and "+number2);
    }
    
    public static void main(String[] args) {
        findingQuoRem obj = new findingQuoRem(60, 20);
        obj.quorem();
    }
}