package Store;


import java.util.Objects;

public class Customer {

    public Customer() {

    }


/////////////////////////////////

    public enum memberType{
        NONE, GENERAL, VIP, VVIP
    }
    private memberType memberType;

    public Customer.memberType getMemberType() {
        return memberType;
    }

    public void setMemberType(Customer.memberType memberType) {
        this.memberType = memberType;
    }

    ///////////////////////////////
    private String serialNo;
    private String cutomerName;
    private String customerID;
    private int usingTime;
    private int totalpay;


    /////////////////////////////////////////

    private static int serialCnt = 0 ;

    public Customer(String serialNo, String cutomerName, String customerID, int usingTime, int totalpay) {
    }


    public String getSerialNo() {
        return serialNo;
    }

    public String getCutomerName() {
        return cutomerName;
    }

    public void setCutomerName(String cutomerName) {
        this.cutomerName = cutomerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getUsingTime() {
        return usingTime;
    }

    public void setUsingTime(int usingTime) {
        this.usingTime = usingTime;
    }

    public int getTotalpay() {
        return totalpay;
    }

    public void setTotalpay(int pay) {
        this.totalpay = pay;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return getTotalpay() == customer.getTotalpay() && Objects.equals(getCutomerName(), customer.getCutomerName()) && Objects.equals(getCustomerID(), customer.getCustomerID()) && Objects.equals(getUsingTime(), customer.getUsingTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCutomerName(), getCustomerID(), getUsingTime(), getTotalpay());
    }


    @Override
    public String toString() {
        return "Customer {" +
                "memberType=" + memberType +
                ", serialNo='" + serialNo + '\'' +
                ", cutomerName='" + cutomerName + '\'' +
                ", customerID='" + customerID + '\'' +
                ", usingTime=" + usingTime +
                ", totalpay=" + totalpay +
                '}';
    }

    public Customer(String cutomerName, String customerID, int usingTime, int pay) {
        serialCnt++;
        this.cutomerName = cutomerName;
        this.customerID = customerID;
        this.usingTime = usingTime;
        this.totalpay = pay;
        serialNo = String.format("%04d",serialCnt);
        this.memberType = memberType;

    }

    public String showCustomer(){
        String info = "serialNO:"+serialNo+", 고객 이름: "+cutomerName+", 고객 아이디: "+customerID+", 고객 사용 시간: "+usingTime+"시간, 고객 사용 총액: "
                +totalpay+"원, 등급: "+memberType+"입니다.";
        return info;
    }

    public String showCustomerGroup(){
        String info = "serialNO:"+serialNo+", 고객 이름: "+cutomerName+", 고객 아이디: "+customerID+", 고객 사용 시간: "+usingTime+"시간, 고객 사용 총액: "
                +totalpay+"원, 등급: "+memberType+"입니다.";
        return info;
    }

//////////////////////////////////////





}
