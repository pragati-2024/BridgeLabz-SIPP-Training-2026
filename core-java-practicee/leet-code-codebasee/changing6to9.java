class changing6to9 {
    public int maximum69Number(int num) {

        int temp = num;
        int position = 0;
        int changePos = -1;

        // 6 ki position find karna
        while (temp > 0) {
            if (temp % 10 == 6) {
                changePos = position;
            }
            temp /= 10;
            position++;
        }

        // 6 ko 9 me convert karna
        if (changePos != -1) {
            num += 3 * (int) Math.pow(10, changePos);
        }

        return num;
    }

    public static void main(String[] args) {
        changing6to9 obj = new changing6to9();

        int num = 9669;
        int result = obj.maximum69Number(num);

        System.out.println("Original Number: " + num);
        System.out.println("Maximum Number: " + result);
    }
}