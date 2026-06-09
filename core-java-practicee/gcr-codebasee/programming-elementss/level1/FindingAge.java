class FindingAge {
    int birthYear;
    int currentYear;
    
    //parametrised constructor is used like if we change the year so we hve to wrte code again and again
    // that's why we used it
    FindingAge(int birthYear,int currentYear){
        this.birthYear=birthYear;
        this.currentYear=currentYear;
    }
    void age(){
        System.out.println(" Harry's age in 2024 is:- "+(currentYear-birthYear));
    }
    public static void main(String[] args) {
        FindingAge obj = new FindingAge(2000,2024);
        obj.age();
    }
    /*public static void main(String[] args) {
        int  birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear-birthYear;
        System.out.println(" Harry's age in 2024 is :- "+ age);
    }*/
}
