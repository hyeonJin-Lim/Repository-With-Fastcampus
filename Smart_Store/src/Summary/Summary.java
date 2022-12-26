package Summary;
import Classification_Parameter.general;
import Classification_Parameter.vip;
import Classification_Parameter.vvip;
import Store.Customer;

import static Customer_Data.CustomerAdd.customerlist;
import static Store.Customer.memberType.*;
import static Store.Customer.memberType.NONE;

public class Summary {


    private static int VVIPCNT;
    private static int VIPCNT;
    private static int GENERALCNT;
    private static int NONECNT;

    private static Customer[] NoneList;
    private static Customer[] GeneralList;
    private static Customer[] VipList;
    private static Customer[] VVipList;

/////////getter////////////////
    public static int getVVIPCNT() {
        return VVIPCNT;
    }

    public static int getVIPCNT() {
        return VIPCNT;
    }

    public static int getGENERALCNT() {
        return GENERALCNT;
    }

    public static int getNONECNT() {
        return NONECNT;
    }

    public static Customer[] getNoneList() {
        return NoneList;
    }

    public static Customer[] getGeneralList() {
        return GeneralList;
    }

    public static Customer[] getVipList() {
        return VipList;
    }

    public static Customer[] getVVipList() {
        return VVipList;
    }
/////////////////////////////////////////////


    public static void groupTypeSet() {
        general.getMinMoney();
        general.getMinTime();
        vip.getMinMoney();
        vip.getMinTime();
        vvip.getMinMoney();
        vvip.getMinTime();

        VVIPCNT=0;
        VIPCNT=0;
        GENERALCNT=0;
        NONECNT=0;

        // 등급별 나누기
        for(int i=0; i<customerlist.length; i++){
            if(customerlist[i].getTotalpay()>vvip.getMinMoney() && customerlist[i].getUsingTime()>vvip.getMinTime()){
                customerlist[i].setMemberType(VVIP);
                VVIPCNT++;
            }
            else if(customerlist[i].getTotalpay()>vip.getMinMoney() && customerlist[i].getUsingTime()>vip.getMinTime()) {
                customerlist[i].setMemberType(VIP);
                VIPCNT++;
            }
            else if(customerlist[i].getTotalpay()>general.getMinMoney() && customerlist[i].getUsingTime()>general.getMinTime()){
                customerlist[i].setMemberType(GENERAL);
                GENERALCNT++;
            }
            else{
                customerlist[i].setMemberType(NONE);
                NONECNT++;
            }
        }


        makearr();

    }


    public static void makearr(){
        NoneList = new Customer[NONECNT];
        GeneralList = new Customer[GENERALCNT];
        VipList = new Customer[VIPCNT];
        VVipList = new Customer[VVIPCNT];

        int vvcnt=0;
        int vcnt=0;
        int gcnt=0;
        int ncnt=0;

        for(int i=0; i<customerlist.length; i++) {
            if(customerlist[i].getMemberType().equals(VVIP)){
                VVipList[vvcnt] = customerlist[i];
                vvcnt++;
            }
            else if(customerlist[i].getMemberType().equals(VIP)){
                VipList[vcnt] = customerlist[i];
                vcnt++;
            }else if(customerlist[i].getMemberType().equals(GENERAL)){
                GeneralList[gcnt] = customerlist[i];
                gcnt++;
            }else if(customerlist[i].getMemberType().equals(NONE)){
                NoneList[ncnt] = customerlist[i];
                ncnt++;
            }
        }


    }




    public static void viewGroupType(){
        groupTypeSet();
        System.out.println("\n ====등록순 출력====\n");
        System.out.println("** VVIP등급 **");
        for(int i = 0; i< VVipList.length; i++){
            System.out.println(VVipList[i]);
        }
        System.out.println("\n** VIP등급 **");
        for(int i = 0; i< VipList.length; i++){
            System.out.println(VipList[i]);
        }
        System.out.println("\n** GENERAL등급 **");
        for(int i = 0; i< GeneralList.length; i++){
            System.out.println(GeneralList[i]);
        }
        System.out.println("\n** NONE등급 **");
        for(int i = 0; i< NoneList.length; i++){
            System.out.println(NoneList[i]);
        }
        SummaryMain.SummaryMenu();
    }


}
