class X {
    public static void main(String srg[]) {

        String str = "PROGRAM";
        for (int i = 0; i < str.length(); i++) {
            int len = str.length();
            for (int j = 0; j < len; j++) {
                if (i == j || j == len - i - 1) {
                    System.out.print(str.charAt(j));
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}