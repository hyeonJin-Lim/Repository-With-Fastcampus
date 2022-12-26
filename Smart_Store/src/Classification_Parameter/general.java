package Classification_Parameter;
import Exception.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class general extends none{
    private static int minTime=10;
    private static int minMoney=50000;
    final private static String grade = "GENERAL";


    public static void setMinTime(int time){
        minTime = time;
    }
    public static int getMinTime(){
        return minTime;
    }
    public static void setMinMoney(int money){
        minMoney = money;
    }
    public static int getMinMoney(){
        return minMoney;
    }

    public static void showInfo(){
        System.out.println("---------------------");
        System.out.println("    "+grade+"등급" +
                "\n- 최소 사용시간: "+minTime+"시간"+
                "\n- 최소 사용금액: "+minMoney+"원");
        System.out.println("---------------------");
    }

    public static void set(){
        showInfo();
        select();

    }

    public static int select_menu(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.print("==========="+grade+"============\n"+
                        "1. 최소 사용 시간 설정\n"+
                        "2. 최소 사용 금액설정\n"+
                        "3. 뒤로가기.\n"+
                        "==============================\n"+
                        "메뉴 선택 :");
                int menu = Integer.parseInt(sc.next());
                if(menu<0 || menu > 3){
                    throw new InputMismatchException();
                }return menu;
            }catch (InputMismatchException e){
                System.out.println("==========================");
                System.out.println("다시 입력하세요\n");
            }catch(NumberFormatException e){
                System.out.println("==========================");
                System.out.println("다시 입력하세요\n");
            }catch (NegativeArraySizeException e){
                System.out.println("==========================\n");
                System.out.println("다시 입력하세요\n");
            }
        }
    }


    public static void select(){
        boolean status = true;
        int setmenu = select_menu();
        switch (setmenu){
            case 1:
                if(general.minTime ==0){
                    System.out.println("====="+grade+ "등급의 최소 사용 시간을 설정하세요.====");
                    System.out.print(grade+" 등급의 최소 사용시간을 입력하세요: ");
                    int time = Exception.scannerInt();
                    general.setMinTime(time);
                    System.out.println(grade+" 등급의 최소 사용시간이 "+time+"시간으로 설정되었습니다.");
                }else{
                    System.out.println(grade+"등급의 시간 초기 설정이 이미 설정 되어 있습니다.");
                    System.out.println();
                    set();
                }

                break;
            case 2:
                if(general.minMoney ==5000){
                    System.out.println("등급: "+grade);
                    System.out.println("기본 최소 사용금액: "+minMoney+"원");
                    System.out.println("최소 사용금액은 "+none.getMinMoney()+"원 보다 커야합니다.");
                    System.out.print("최소 사용금액을 입력하세요: ");
                    int money = Exception.scannerInt();
                    if(money>none.getMinMoney()) {
                        general.setMinMoney(money);
                        System.out.println(grade+" 등급의 최소 사용금액이 "+money+"원으로 설정되었습니다.");
                    }else {
                        System.out.println("올바른 형식이 아닙니다.\n");
                    }
                }
                else{
                    System.out.println(grade+"등급의 금액 초기 설정이 이미 설정 되어 있습니다.\n");
                    set();
                }

                break;
            case 3:
                System.out.println("=====등급 선택 메뉴로 돌아갑니다.====");
                status = false;
                break;
            default:
                System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                select();
        }
        if (status){
            set();
        } else if (!status) {
            Set_Parameter.set_menu();
        }
    }


    public static void set2(){
        showInfo();
        select2();
    }

    public static void select2(){
        boolean status = true;
        int set2menu = select_menu();
        switch (set2menu){
            case 1:
                if(general.minTime ==0){
                    System.out.println(grade +"등급의 최소 시간 초기 설정이 안되어 있습니다.");
                    System.out.println("초기 설정부터 해주세요.");
                    System.out.println();
                    set2();
                }else{
                    System.out.println(" ======"+grade+"등급의 최소 사용 시간을 변경하세요.======");
                    System.out.print(grade+" 등급의 최소 사용시간을 입력하세요: ");
                    int time = Exception.scannerInt();
                    general.setMinTime(time);
                    System.out.println(grade+" 등급의 최소 사용시간이 "+time+"시간으로 수정되었습니다.");
                }
                break;
            case 2:
                System.out.println(grade+" 등급의 최소 사용금액은 "+none.getMinMoney()+"원 보다 커야합니다.");
                System.out.print(grade+" 등급의 최소 사용금액을 입력하세요: ");
                int money = Exception.scannerInt();
                if(money>none.getMinMoney()) {
                    general.setMinMoney(money);
                    System.out.println(grade+" 등급의 최소 사용금액이 "+money+"원으로 설정되었습니다.");
                    System.out.println();
                }else {
                    System.out.println(none.getMinMoney()+"원 보다 커야합니다.");
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("=====등급 선택 메뉴로 돌아갑니다.=====");
                status = false;
                break;
            default:
                System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                select();
        }
        if (status){
            set2();
        } else if (!status) {
            Update_Parameter.set_menu();
        }
    }




}
