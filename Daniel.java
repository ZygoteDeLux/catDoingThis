import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Daniel {
    public static void main(String[] args) {
        Daniel obj = new Daniel();
        obj.run();
    }
    public void run(){
        int i = sout("hej",5);

        if(i>5){
            System.out.print("har du det godt");
            List<Finger> fingerList = new ArrayList<>();
            fingerList=getFingered(i);
            Hand hand = new Hand();
            for (int j = 0; j < fingerList.size(); j++) {
                hand.addFinger(fingerList.get(j));
            }
            System.out.println(hand);

        }

    }

    public List<Finger> getFingered(int i){
        List<Finger> fingers = new ArrayList<>();
        int k =0;
        for (int j = 0; j < i; j++) {
            Random random = new Random();
            k =random.nextInt(1,5);
        }
        for (int j = 0; j < k; j++) {
            boolean b;
            if(LocalDate.now().getDayOfMonth()<10){
                b = false;
            } else{
                b = true;
            }
            Finger finger = new Finger(b,j);
            fingers.add(finger);
        }
        return fingers;

    }

    public int sout(String s,int i){
        System.out.print(s);
        if(i==1){
            System.out.print("Daniel");
        }
        if (i==2){
            System.out.print("daniel");
        }
        if (i==3){
            System.out.print("lasse");
        }
        if (i==4){
            System.out.print("jakob");
        } else {
            System.out.print("oscar");
        }
        System.out.print("hav en god dag");
        return 7;
    }

    public class Hand{
        private List<Finger> fingers = new ArrayList<>();



        public Hand(){

        }

        @Override
        public String toString() {
            return "Hand{" +
                    "fingers=" + fingers +
                    '}';
        }

        public void addFinger(Finger finger) {
            fingers.add(finger);
        }
    }
    public class Finger{
        boolean nail;
        int length;

        public Finger(boolean nail, int length) {
            this.nail = nail;
            this.length = length;
        }

        public void removeNail(){
            this.nail=false;
        }

        @Override
        public String toString() {
            return "Finger{" +
                    "nail=" + nail +
                    ", length=" + length +
                    '}';
        }
    }


}