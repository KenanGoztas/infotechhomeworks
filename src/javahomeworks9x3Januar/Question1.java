package javahomeworks9x3Januar;

import java.time.*;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
//        1. Tokyo-Kahire arasi ucak seferi duzenleyen bir hava yolu sirketi icin
//        bilet satis programina bir ek program yazmaniz istendi. Kalkis Tokyo
//        ve inis Kahire sehridir. Sartlar; Kullanicidan seyahat tarihi ve saati
//        istenecek, Tokyo saatiyle kalkis saati ve tarihi, Kahire saatiyle inis
//        saati ve tarihi verilecek. (Kullanicidan istenilen bilgileri “VeriGirisi”
//        adiyla olusturulmus class’ tan alinip “Sonuc” adiyla olusturulmus
//        class icinde olusturacaginiz static bir method’ tan kullaniciya
//        sunulacaktir.)
        LocalDate ld= LocalDate.now();
        System.out.println("localdatenow " + ld);
        LocalDate ld2= LocalDate.of(2022, 1,5);
        System.out.println(ld2);
        LocalTime lt1= LocalTime.now();
        System.out.println("localtimenow " + lt1);
        LocalTime lt2= LocalTime.of(3,5,7);
        System.out.println(lt2);
        LocalDateTime ltd1= LocalDateTime.now();
        System.out.println("localdatetime now " +ltd1);
        LocalDateTime ldt2 = LocalDateTime.of(2022, 3,4,5,6,5,3);
        System.out.println(ldt2);
        System.out.println("**********\n");

        System.out.println("zoneid kahire " + ZoneId.of("Africa/Cairo"));
        System.out.println(lt2.now(ZoneId.of("Asia/Tokyo")));
        System.out.println(lt2.now(ZoneId.of("Africa/Cairo")));


        Period period = Period.between(LocalDate.from(ldt2), ld2);

        Scanner input = new Scanner(System.in);
        System.out.println("Tokyodan hangi gün ve saat uçağa bineceksiniz?");
        LocalDateTime localDateTime= LocalDateTime.of(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println("Tokyodan kalkış tarihi : "+ localDateTime);
        localDateTime.plusHours(7);
        System.out.println("zoneid kahirede şu anki saat " + LocalDateTime.now(ZoneId.of("Africa/Cairo")));
        ZonedDateTime zonedDateTime= ZonedDateTime.of(localDateTime, ZoneId.of("Africa/Cairo"));
        //tüm zonidleri yazdırmak için..
//        for (String zone: ZoneId.getAvailableZoneIds()) {
//            System.out.println(zone);
//        }
        System.out.println("tokyonun saatine göre kahire saati " + zonedDateTime);
        System.out.println(LocalDateTime.now(ZoneId.of("Africa/Cairo")));
        System.out.println(ZoneId.of("Africa/Cairo"));
        System.out.println(lt2.now(ZoneId.of("Asia/Tokyo")));
        System.out.println(lt2.now(ZoneId.of("Africa/Cairo")));





    }
}
class Verigirisi{
    LocalDateTime localDateTime;
    LocalDateTime localDateTime2;

//    System.out.println(lt1.now(ZoneId.of("Asia/Tokyo")));
//        System.out.println(lt1.now(ZoneId.of("Africa/Cairo")));

}
