package Classification_Parameter;
import Exception.InputRangeException;
import Exception.Exception;
import Store.Customer;
import Store.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Customer_Data.CustomerAdd.customerlist;
import static Store.Customer.memberType.*;
import static Store.Customer.memberType.NONE;

public class Parameter_Menu {

    public static void classifiCationMenu(){
        int menu = classifiCationSelect();
        boolean status=false;
        switch (menu){
            case 1:
                //Set_Parameter.settingParameter();//분류기준 설정
                Set_Parameter.setParameter();
                break;
            case 2:
                //Update_Parameter.updateParameter();//분류기준 수정
                View_Parameter.viewParameter();
                break;
            case 3:
                //View_Parameter.viewParameter();//분류기준 출력
                Update_Parameter.editParameter();
                break;
            case 4:
                status = true;
                break;
        }

        if(status){
            Main.mainMenu();
        }else if(!status){
            classifiCationMenu();
        }

    }


    public static int classifiCationSelect(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("==============================");
                System.out.println(" 1. 분류기준 설정");
                System.out.println(" 2. 분류기준 확인");
                System.out.println(" 3. 분류기준 수정");
                System.out.println(" 4. 뒤로가기");
                System.out.println("==============================");
                System.out.print("메뉴 선택: ");
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

    ////////////////////////////////////////////////////////////////////////////////////////////////





}
