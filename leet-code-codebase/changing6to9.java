class changing6to9 {
    public int maximum69Number(int num) {

        int temp = num;
        int position = 0;
        int changePos = -1;
//sbse phle temp mae store kar hae

        while (temp > 0) {
            if (temp % 10 == 6) {
                changePos = position;
            }
            temp /= 10;
            position++;
        }

        if (changePos != -1) {
            num += 3 * (int)Math.pow(10, changePos);
        }
        return num;
    }
}