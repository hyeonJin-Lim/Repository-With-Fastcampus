package Summary;

import Store.Customer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import static Summary.Summary.*;
import static Summary.Summary.getNoneList;

public class SummaryBySpentTime {
    public static void showByTime_Menu() {
        boolean result = true;
        while (result) {
            int menu = selectMenu();
            switch (menu) {
                case 1:
                    viewTimeTypeA();//오름차순
                    break;
                case 2:
                    viewTimeTypeD();//내림차순
                    break;
                case 3:
                    System.out.println("뒤로가기");
                    SummaryMain.SummaryMenu();
                    result=false;
                    break;
            }
        }


    }

    private static int selectMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {

                System.out.println("====================");
                System.out.println("1. 오름차순으로 보기");
                System.out.println("2. 내림차순으로 보기");
                System.out.println("3. 뒤로가기");
                System.out.println("====================");
                System.out.print("메뉴 선택: ");
                int menu = Integer.parseInt(sc.next());
                if (menu < 0 || menu > 4) {
                    throw new InputMismatchException();
                }
                return menu;
            } catch (InputMismatchException e) {
                System.out.println("==========================");
                System.out.println("다시 입력하세요");
            } catch (NumberFormatException e) {
                System.out.println("==========================");
                System.out.println("다시 입력하세요");
            } catch (NegativeArraySizeException e) {
                System.out.println("==========================");
                System.out.println("다시 입력하세요");
            }
        }
    }


    public static void viewTimeTypeA() {
        groupTypeSet();
        System.out.println("\n ====사용 시간순 출력====\n");
        System.out.println("** VVIP등급 **");
        for(int i = 0; i< getVVipList().length; i++) {
            Arrays.sort(getVVipList(), new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o1.getUsingTime() - o2.getUsingTime();
                }
            });
            System.out.println(getVVipList()[i]);
        }


        System.out.println("\n** VIP등급 **");
        for(int i = 0; i< getVipList().length; i++) {
            Arrays.sort(getVipList(), new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o1.getUsingTime() - o2.getUsingTime();
                }
            });
            System.out.println(getVipList()[i]);
        }


        System.out.println("\n** GENERAL등급 **");
        for(int i = 0; i< getGeneralList().length; i++) {
            Arrays.sort(getGeneralList(), new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o1.getUsingTime() - o2.getUsingTime();
                }
            });
            System.out.println(getGeneralList()[i]);
        }


        System.out.println("\n** NONE등급 **");
        for(int i = 0; i< getNoneList().length; i++) {
            Arrays.sort(getNoneList(), new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o1.getUsingTime() - o2.getUsingTime();
                }
            });
            System.out.println(getNoneList()[i]);
        }

    }

    public static void viewTimeTypeD() {
        groupTypeSet();
        System.out.println("\n ====사용 시간순 출력====\n");
        System.out.println("** VVIP등급 **");
        for(int i = 0; i< getVVipList().length; i++) {
            Arrays.sort(getVVipList(), new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o2.getUsingTime() - o1.getUsingTime();
                }
            });
            System.out.println(getVVipList()[i]);
        }


        System.out.println("\n** VIP등급 **");
        for(int i = 0; i< getVipList().length; i++) {
            Arrays.sort(getVipList(), new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o2.getUsingTime() - o1.getUsingTime();
                }
            });
            System.out.println(getVipList()[i]);
        }


        System.out.println("\n** GENERAL등급 **");
        for(int i = 0; i< getGeneralList().length; i++) {
            Arrays.sort(getGeneralList(), new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o2.getUsingTime() - o1.getUsingTime();
                }
            });
            System.out.println(getGeneralList()[i]);
        }


        System.out.println("\n** NONE등급 **");
        for(int i = 0; i< getNoneList().length; i++) {
            Arrays.sort(getNoneList(), new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o2.getUsingTime() - o1.getUsingTime();
                }
            });
            System.out.println(getNoneList()[i]);
        }

    }


    class customerTimesortA implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.getUsingTime() - o2.getUsingTime();
        }
    }
    class customerTimesortD implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            return o2.getUsingTime() - o1.getUsingTime();
        }
    }



}
