public class ATM {
        public int countBanknotes(int sum){
            int[] arr = {500, 200, 100, 50, 20, 10, 5, 2, 1};

            int count = 0;
            int a = 0;
            int b = sum;

            while (a < arr.length){
                if (b >= arr[a]){
                    count += b / arr[a];
                    b %= arr[a];
                }
                a++;
            }
            return count;
        }

        public static void main(String[] args){}
    }

    /*public int countBanknotes(int sum){
        int[] arr = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        String text = "\nСумма " + sum + " будет выдана банкнотами:\n";
        int count = 0;
        int a = 0;
        int b = sum;

        while (a < arr.length){
            if (b >= arr[a]){
                int c = b / arr[a];
                count += c;
                b %= arr[a];
                text += "номиналом " + arr[a] + " - " + c + " шт\n";
            }
            a++;
        }
        System.out.println(text);
        return count;
    }

    public static void main(String[] args){
        ATM test = new ATM();
        System.out.println("И того " + test.countBanknotes(2419) + " банкнот");
        System.out.println("И того " + test.countBanknotes(52142) + " банкнот");
        System.out.println("И того " + test.countBanknotes(247423254) + " банкнот");
    }*/

    /*public int countBanknotes(int sum){
        int count = 0;
        int a = sum;

        if (a > 500){
            count += a / 500;
            a %= 500;
        }

        if (a > 200){
            count += a / 200;
            a %= 200;
        }

        if (a > 100){
            count += a / 100;
            a %= 100;
        }

        if (a > 50){
            count += a / 50;
            a %= 50;
        }

        if (a > 20){
            count += a / 20;
            a %= 20;
        }

        if (a > 10){
            count += a / 10;
            a %= 10;
        }

        if (a > 5){
            count += a / 5;
            a %= 5;
        }

        if (a > 2){
            count += a / 2;
            a %= 2;
        }

        if (a != 0)
            count += 1;

        return count;
    }

    public static void main(String[] args){}
}*/
