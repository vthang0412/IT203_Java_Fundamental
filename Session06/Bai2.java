package Session06;

class Account{
    private String userName;
    private String passWord;
    private String email;

    public Account(String userName, String passWord, String email){
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }
    public void changePass(String passWord){
        this.passWord = passWord;
        System.out.println("Đổi mật khẩu thành công");
    }
    public void displayAccount(){
        System.out.println("User: "+userName);
        System.out.println("Email: "+email);
        System.out.println("--------------------");

    }
}

public class Bai2 {
    public static void main (String[] args){
        Account ac1 = new Account("DangVanThang","vthang06","vthang0412@gmail.com");
        ac1.changePass("thang123");
        ac1.displayAccount();
    }
}
