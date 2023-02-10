public class Main {
    public static void main(String[] args) {


//        StringBuilder builder = new StringBuilder();
//        builder.append("Hello");
//        System.out.println(builder);

//        String s = "Java";
//        String a = "Java";
//        String s1 = new String("Java");
//        System.out.println( s== a);
//        System.out.println(s.equals(s1));
//        String j = s.concat("Hello");
//        System.out.println(j);
//    }
        StringBuilder word = new StringBuilder();
        int[] nums = {1,2,3,4,5};

        for (int num : nums) {
            word.append(num);

        }
        System.out.println(word);



    }
    }