class FindingAverage {
    int physics;
    int chemistry;
    int maths;

    FindingAverage(int physics, int chemistry, int maths) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
    }

    

    void averageOne() {
        System.out.println(" Sams average mark in PCM is:- " + ((physics + chemistry + maths) / 3.0 + "%"));
    }

    public static void main(String[] args) {
        FindingAverage obj = new FindingAverage(95, 96, 94);
        obj.averageOne();
    }
}
