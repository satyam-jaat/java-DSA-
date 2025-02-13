//Question. How to convert array into string?


public class arraytostring {
    public static void main(String args[]) {

        //conversion of array into string
        
        char[] array = {'s','a','t','y','a','m'};

        String name = new String(array);
        System.out.println(name);
    }
}



/*
                 //or using stringbuilder


public class arraytostring {
    public static void main(String args[]) {

        char[] array = {'s','a','t','y','a','m'};
        StringBuilder name = new StringBuilder();
        for(char a : array) {
            name.append(a);
        }

        System.out.println(name);
    }
}




                //or using string



public class arraytostring {
    public static void main(String args[]) {
        char[] array = {'s','a','t','y','a','m'};
        String name = "";
        for(char a : array) {
            name+=a;
        }
        System.out.println(name);
    }
}
    
*/
