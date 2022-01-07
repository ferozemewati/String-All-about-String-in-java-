import java.util.Scanner;

//public class Chap3_String {
//    public static void main(String[] args) {

//        String name="Feroze";
//        int size=name.length();
//        System.out.println(size);


//        String name="Feroze";
//        System.out.println(name);
//        String ls=name.toLowerCase();
//        System.out.println(ls);


//        String name="feroze";
//        System.out.println(name);
//        String up=name.toUpperCase();
//        System.out.println(up);


//        String name="Feroze";
//        System.out.println(name);
//        String nonTrimString="  Feroze  ";
//        System.out.println(nonTrimString);


//        String name="Feroze";
//        System.out.println(name);
//        System.out.println(name.substring(0));
//        System.out.println(name.substring(1,5));


//        String name="Feroze";
//        System.out.println(name.replace('e','k'));
//        System.out.println(name.replace('k','e'));


//        String name="Feroze";
//        System.out.println(name.charAt(3));


        //Quest:- Wap to convert a string into toLowerCase.

//        String name="Feroze";
//        System.out.println(name);
//        String ls=name.toLowerCase();
//        System.out.println(ls);


        // Wap to replace space with underscores.

//        String rep="Feroze Khan Mewati";
//        rep=rep.replace(' ','_');
//        System.out.println(rep);


        //Wap to fill in a letter template which look like below.

//        String letter="Dear name, Thanks a lot!";
//        letter=letter.replace("name","Feroze Khan Mewati");
//        System.out.println(letter);


        //Wap to format the following letter using escape sequence characters.

//        String myletter = "Dear james,\n\t This java course is nyc, Thanks!";
//        System.out.println(myletter);


        //Wap to Replace element in string.

//        class replace {
//            public void findrep() {
//                String name = "Feroze mewati";
//                char[] arr = name.toCharArray();
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] == 'a' || arr[i] == 'o') {
//                        arr[i] = 'f';
//                    }
//                }
//                String str = String.valueOf(arr);
//                System.out.println(str);
//            }
//        }
//        public class Chap3_String{
//            public static void main(String[] args) {
//
//                replace obj=new replace();
//                obj.findrep();
//            }
//        }


        // Wap how to find index value in string.

//        class findindex{
//            public void index(){
//                char values ='a';
//                String name="Feroze mewati";
//                char arr[]=name.toCharArray();
//                for (int i=0; i<arr.length; i++){
//                    if (values == name.charAt(i)){
//                        System.out.println(i);
//                    }
//                }
//            }
//        }
//
//        public class Chap3_String{
//            public static void main(String[] args) {
//
//                findindex obj=new findindex();
//                obj.index();
//            }
//        }

//Wap to remove white space from string;

//public class Chap3_String {
//    public static void main(String[] args) {

//        String name = "Feroze khan mewati";
//        char arr[] = name.toCharArray();
//        String ss = "  ";
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != ' ') {
//                ss = ss + arr[i];
//            }
//        }
//        System.out.println(ss);
//    }
//}


        //Wap to find index number of any character in string.
//        public class Chap3_String{
//            public static void main(String[] args) {
//        char value = 'k';
//        String name = "Ferozekhanmewati";
//        char arr[] = name.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            if (value == name.charAt(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//}



        //Wap how to reverse string.  Method:-1

//public class Chap3_String {
//    public static void main(String[] args) {
//        String name = "Aarif Ali Saifi";
//        String str = "";
//        for (int i = name.length() - 1; i >= 0; i--) {
//            str = str + name.charAt(i);
//        }
//        System.out.println("the reverse string is :" + str);
//    }
//}

        //Wap to reverse a string using array.  method:-2

//        class RevStrr {
//            public void findRS() {
//                String name = "Feroze khan mewati";
//                char arr[] = name.toCharArray();
//                String newString = " ";
//                for (int i = arr.length - 1; i >= 0; i--) {
//                    newString = newString + arr[i];
//                }
//                System.out.println(newString);
//            }
//        }

//public class Chap3_String{
//    public static void main(String[] args) {
//        RevStrr obj= new RevStrr();
//        obj.findRS();
//    }
//}



        //Wap to reverse string in array without using new string. Method:- 3

//public class Chap3_String{
//    public static void main(String[] args) {
//        String name = "Feroze Mewati";
//        char arr[] = name.toCharArray();
//        int i = 0, j = arr.length -1;
//        while (i < j) {
//            char temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        String value = String.valueOf(arr);
//        System.out.println(value);
//    }
//}


        // Wap to reverse a string to using split method.\

//        class RevvStr{
//            public void findRs(){
//                String name="Aarif Ali Saifi";
//                int i=name.length()-1;
//                String newString=" ";
//                while (i>=0){
//                    while (i>=0 && name.charAt(i)==' ') i--;
//                    int j=i;
//                    if (i<=0)break;
//                    while (i>=0 && name.charAt(i)!=' ') i--;
//                    if (newString.isEmpty()){
//                        newString=newString+(name.substring(i+1,j+1));
//                    }
//                    else {
//                        newString=newString+(' '+name.substring(i+1,j+1));
//                    }
//                }
//                System.out.println(newString);
//            }
//        }
//
//        public class Chap3_String {
//            public static void main(String[] args) {
//                RevvStr obj=new RevvStr();
//                obj.findRs();
//            }
//        }


        // Wap to reverse a string to using split method.\

//        import java.util.Scanner;
//        class RevSttr{
//            public void findRS(){
//                Scanner sc=new Scanner(System.in);
//                System.out.println("Enter any value");
//                String orinstr=sc.nextLine();
//                System.out.println("This is original string: " +orinstr);
//                String words[]=orinstr.split(" ");
//                String newStr=" ";
//                int length=words.length-1;
//                for (int i=length; i>=0; i--){
//                    newStr=newStr+words[i]+' ';
//                }
//                System.out.println("Reverse string is: "+ newStr);
//            }
//        }
//        public class Chap3_String {
//            public static void main(String[] args) {
//                RevSttr obj=new RevSttr();
//                obj.findRS();
//            }
//        }


// Wap to reverse string using of StringBuffer and StringBuilder.

//        class RevStr{
//            public void findRS(){
//                StringBuffer sb=new StringBuffer("Feroze Khan");
//                System.out.println(sb.reverse());
//
//                StringBuilder sbb=new StringBuilder("Feroze Mewati");
//                System.out.println(sbb.reverse());
//            }
//        }
//
//        public class Chap3{
//            public static void main(String[]args){
//                RevStr obj=new RevStr();
//                obj.findRs();
//            }
//        }


        /* Wap to change a string value using StringBuffer / StringBuilder.

          1. StringBuilder append() method                               */

//        StringBuilder sb=new StringBuilder("Hello Yaar");
//        sb.append(" Hello mr. feroze");
//        System.out.println(sb);


        // 2. String Builder insert() method

//        StringBuilder sb =new StringBuilder("Feroze");
//        sb.insert(3,"kk");
//        System.out.println(sb);


        // 3. StringBuilder replace() method.

//        StringBuilder sb =new StringBuilder("Mr khan");
//        sb.replace(0,2, "Feroze");
//        System.out.println(sb);


//         4. StringBuilder delete() method.
//
//        StringBuilder sb =new StringBuilder("Mr khan");
//        sb.delete(0,2);
//        System.out.println(sb);


        // 5. StringBuilder delete() method.

//        StringBuilder sb =new StringBuilder("Mr khan");
//        sb.reverse();
//        System.out.println(sb);

//    }
//}



