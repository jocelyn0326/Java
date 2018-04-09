package hw11_collection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Member {
    private String name, address,phone;
    private int deposit;
    private Date birthday;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBirthday(Date birthday){
        this.birthday=birthday;
    }
    public Date getBirthday(){
        return birthday;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone(){
        return phone;
    }
    public void setDeposit(String deposit){
        this.deposit= Integer.parseInt(deposit);
    }
    public int getDeposit(){
        return deposit;
    }
    @Override
    public String toString(){
        DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        return String.format("  姓名：%-10s 生日：%-12s 電話：%-12s 住址：%-8s 存款：%-10d",name,df.format(birthday),phone, address, deposit);
  }
}
