package oop;

public class SmartPhone {
    //フィールド
    String model;//スマホの機種名
    String os;//OSの種類
    Account account;//自分のアカウント情報
    AddressBook[] addressBooks = new AddressBook[10];//アドレス帳
    String[] apps;//インストールされたアプリ

    public SmartPhone(String model,String os){
        this.model = model;
        this.os = os;
    }
     public void setAccount(Account account) {
        this.account = account;
    }
    public void displayDeviceInfo(){
        System.out.println("modelは " + this.model + " です。");
        System.out.println("osは " + this.os + " です。");
    }
    public void displayMyAccount(){
        System.out.println(account.getAccountInfo());
    }

    public void addAddressBook(AddressBook addressBook){
        for(int i = 0;i < this.addressBooks.length; i++){
            if(this.addressBooks[i] == null){
                this.addressBooks[i] = addressBook;
                return;
            }
        }
    }
    public void displayAppList(){
        for(String app : apps){
                System.out.println(">" + app);
        }
    }
}
