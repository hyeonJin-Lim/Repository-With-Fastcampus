package Classification_Parameter;

import Customer_Data.Customer_Menu;
import Summary.SummaryMain;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import static Classification_Parameter.Parameter_Menu.*;


public class Set_Parameter {

    public static void setParameter() {
        boolean result = true;
        while (result) {
            int menu = set_menu();
            try {
                if (menu == 1) {//GENERAL
                    general.set();
                    break;
                }
                if (menu == 2) {// VIP
                    vip.set();
                    break;
                }
                if (menu == 3) {// VVIP
                    vvip.set();
                    break;
                }
                if (menu == 4) {// 종료
                    System.out.println("프로그램을 종료합니다.");
                    result = false;
                    break;
                }
                System.out.println("다시 입력해주세요");
            } catch (InputMismatchException e) {
                System.out.println("다시 입력해주세요");

            }
        }
    }

        public static int set_menu() {

            Scanner sc = new Scanner(System.in);
            while(true){
                try{
                    System.out.println("분류 기준을 설정할 등급을 선택 해주세요.");
                    System.out.print("==============================\n" +
                            "1. GENERAL\n" +
                            "2. VIP\n" +
                            "3. VVIP\n" +
                            "4. 뒤로가기.\n" +
                            "None 고객의 기준은 변경하실수 없습니다.(defalt)\n" +
                            "==============================\n" +
                            "등급을 선택해주세요 :");
                    int menu = Integer.parseInt(sc.next());
                    if(menu<0 || menu > 4){
                        throw new InputMismatchException();
                    }return menu;
                }catch (InputMismatchException e){
                    System.out.println("==========================");
                    System.out.println("다시 입력하세요");
                }catch(NumberFormatException e){
                    System.out.println("==========================");
                    System.out.println("다시 입력하세요");
                }catch (NegativeArraySizeException e){
                    System.out.println("==========================");
                    System.out.println("다시 입력하세요");
                }
            }
        }


    }




