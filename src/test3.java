import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
            int mat,fiz,tr,kim,muz;
            double ort;
             Scanner input = new Scanner(System.in);

                System.out.print("Matematik notunu giriniz: ");
                mat = input.nextInt();

                if ((mat<=100) && (mat>=0)){
                    System.out.println("diger notu giriniz.");
                }   else {
                    mat=0;
                    System.out.println("100 ile 0 arasi deger giriniz.");
                }

                System.out.print("Fizik notunu giriniz: ");
                fiz = input.nextInt();

                if ((fiz<=100) && (fiz>=0)){
                    System.out.println("diger notu giriniz.");
                }   else {
                    fiz=0;
                    System.out.println("100 ile 0 arasi deger giriniz.");
                }

                System.out.print("Turkce notunu giriniz: ");
                tr = input.nextInt();

                if ((tr<=100) && (tr>=0)){
                    System.out.println("diger notu giriniz.");
                }   else {
                    tr=0;
                    System.out.println("100 ile 0 arasi deger giriniz.");
                }


                System.out.print("Kimya notunu giriniz: ");
                kim = input.nextInt();

                if ((kim<=100) && (kim>=0)){
                    System.out.println("diger notu giriniz.");
                }   else {
                    kim=0;
                    System.out.println("100 ile 0 arasi deger giriniz.");
                }

                System.out.print("Muzik notunu giriniz: ");
                muz = input.nextInt();

                if ((muz<=100) && (muz>=0)){
                    System.out.println("hesaplanıyor....");
                }   else {
                    muz=0;
                    System.out.println("100 ile 0 arasi deger giriniz.");
                }
                ort = (mat+fiz+tr+kim+muz)/5;

                if (ort>55){
                    System.out.println("Gectiniz! ortalma: " +ort);
                    }else {
                    System.out.println("Kaldiniz. ortalma: " +ort);
                    }


       }
    }



