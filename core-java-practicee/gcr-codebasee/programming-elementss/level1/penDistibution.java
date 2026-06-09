class penDistibution {
    int students;
    int pen;
    penDistibution(int students,int pen){
        this.students=students;
        this.pen=pen;
    }
    void penOne(){
        System.out.println("The Pen Per Student is "+(students % pen)+" and the remaining pen not distributed is "+ (students/pen));
    }
    public static void main(String[] args) {
        penDistibution obj = new penDistibution(14, 3);
        obj.penOne();
    }
}
