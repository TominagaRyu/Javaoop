package oop;

public class Account {
    private String name;
    private String tel;
    private String email;
    private String address;

    public Account(String name, String tel, String email, String address) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getTel() {
//        return tel;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setTel(String tel) {
//        this.tel = tel;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
    public String getAccountInfo() {
        String AccountInfo = "名前：" + this.name + "\n"
                + "TEL：" + this.tel + "\n"
                + "E-mail：" + this.email + "\n"
                + "住所：" + this.address + "\n";
        return AccountInfo;
    }

}

