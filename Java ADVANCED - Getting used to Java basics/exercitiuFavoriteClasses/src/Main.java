// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static class FavoriteClasses<Class1,Class2,Class3>{
        private Class1 favorite1;
        private Class2 favorite2;
        private Class3 favorite3;
        FavoriteClasses(Class1 fav1,Class2 fav2,Class3 fav3){
            this.favorite1=fav1;
            this.favorite2=fav2;
            this.favorite3=fav3;
        }
        public Class1 getFav1(){
            return(this.favorite1);
        }
        public Class2 getFav2(){
            return(this.favorite2);
        }
        public Class3 getFav3(){
            return(this.favorite3);
        }
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        List<Double> r=new ArrayList<>();
        r.add(6.3);
        r.add(5.9);
        FavoriteClasses<String ,Integer,Double> a=new FavoriteClasses("Hello",67,r.get(0));
        System.out.println("My favorites are " + a.getFav1() + ", "+ a.getFav2() + ", and " + a.getFav3() + ".");


    }
}