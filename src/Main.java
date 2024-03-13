import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] students = new String[10];
        while (true) {


            System.out.println();
            System.out.println("               ÖĞRENCİ YÖNETİM SİSTEMİ");
            System.out.println("-----------------------------------------------------");
            System.out.println();
            System.out.println("ÖĞRENCİ LİSTESİ İÇİN LÜTFEN [ l ] tuşuna basınız ");
            System.out.println();
            System.out.println("ÖĞRENCİ BULMAK İÇİN LÜTFEN [ a ] tuşuna basınız ");
            System.out.println();
            System.out.println("ÖĞRENCİ EKLEMEK İÇİN LÜTFEN [ e ] tuşuna basınız ");
            System.out.println();
            System.out.println("ÖĞRENCİ SİLMEK İÇİN LÜTFEN [ s ] tuşuna basınız ");
            System.out.println();
            System.out.println("-----------------------------------------------------");

            System.out.println("Yapmak İstediğiniz İşlemi Seçin");

            String islem = scan.nextLine();
            if (islem.equals("e")) {
                System.out.println();
                System.out.println("----------ÖĞRENCİ EKLEME----------");
                System.out.println();
                System.out.println("Öğrenci adını giriniz:");
                String ogrenciAd = scan.nextLine();
                boolean kontenjanDolu = true;
                for (int i = 0; i < students.length; i++) {

                    if (students[i] == null) {
                        students[i] = ogrenciAd;
                        kontenjanDolu = false;
                        System.out.println();
                        System.out.println("Öğrenci başarıyla eklendi");
                        System.out.println("----------------------------------");
                        break;
                    }
                }
                if (kontenjanDolu) {
                    System.out.println("KONTENJAN FULL");
                }
                System.out.println();
                System.out.println("Menü'ye dönmek için [ herhangi bir harfe ] basınız");
                scan.nextLine();
            }


            if (islem.equals("l")) {
                System.out.println();
                System.out.println("----------ÖĞRENCİ LİSTESİ----------");
                for (String student : students) {
                    System.out.println(student);
                }
                System.out.println("-----------------------------------");
                System.out.println("Menü'ye dönmek için [ herhangi bir harfe ] basınız");
                scan.nextLine();


            }
            if (islem.equals("a")) {
                System.out.println();
                System.out.println("----------ÖĞRENCİ ARAMA----------");
                System.out.println();
                System.out.println("Öğrenci ismi giriniz");
                String ogrenciad = scan.nextLine();
                boolean ogrenciArama = false;
                for (int i = 0; i < students.length; i++) {
                    String item = students[i];
                    if (item != null && item.contains(ogrenciad)) {
                        System.out.println(item + " Bulundu");
                        ogrenciArama = true;
                    }
                }
                    if (!ogrenciArama) {
                        System.out.println("Öğrenci Bulunamadı");

                    }

                System.out.println("---------------------------------");
                System.out.println("Menü'ye dönmek için [ herhangi bir harfe ] basınız");
                scan.nextLine();

            }

            if (islem.equals("s")) {
                System.out.println("----------ÖĞRENCİ SİLME----------");
                for (int i = 0; i < students.length; i++) {
                    System.out.println(students[i] + " " + "[ " + i + " ]");
                }
                System.out.println("---------------------------------");
                System.out.println();
                System.out.println("SİLMEK İSTEDİĞİNİZ ÖĞRENCİ NUMARASINI GİRİN");
                try {
                    int ogrenciNo = scan.nextInt();
                    if (students[ogrenciNo] == null) {
                        System.out.println("GEÇERSİZ GİRİŞ");
                    } else {
                        students[ogrenciNo] = null;
                        System.out.println("ÖĞRENCİ BAŞARIYLA SİLİNMİŞTİR");
                    }
                } catch (InputMismatchException exception) {
                    System.out.println("Lütfen geçerli bir sayı giriniz");
                } finally {
                    System.out.println();
                    System.out.println("Menü'ye dönmek için [ herhangi bir harfe ] basınız");
                    scan.nextLine();
                    scan.nextLine();
                }

            }


        }
    }
}