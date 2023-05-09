package oop;

import StoneGame.StoneGame;
import StoneGame.Player;

public class Main {
    public static void main(String[] args){
        //アカウント情報を作成
        Account myAccount = new Account("富永","123-4567-8910","javaensyu@sample.com","沖縄県");
        myAccount.getAccountInfo();

        //スマートフォンを作成
        SmartPhone myPhone = new SmartPhone("iphone14 plus","16.2");
        myPhone.setAccount(myAccount);

        //アドレスを登録
        AddressBook addressBook1 = new AddressBook("aaa","0987654321","awawaw@email.com");
        AddressBook addressBook2 = new AddressBook("bbb","1234567890","bwbwbw@email.com");
        AddressBook addressBook3 = new AddressBook("ccc","1029384756","cwcwcw@email.com");
        myPhone.addAddressBook(addressBook1);
        myPhone.addAddressBook(addressBook2);
        myPhone.addAddressBook(addressBook3);

        //appの登録
        myPhone.apps = new App[]{};

        myPhone.displayDeviceInfo();
        System.out.println();

        myPhone.displayMyAccount();
        System.out.println();

        // アドレス帳の一覧を表示
        System.out.println("アドレス帳");
        for(AddressBook addressBook : myPhone.addressBooks){
            if(addressBook != null){
                System.out.println("名前：" + addressBook.name);
                System.out.println("TEL：" + addressBook.tel);
                System.out.println("E-mail：" + addressBook.email);
                System.out.println();
            }
        }
//         インストールされたアプリ一覧を表示
        System.out.println("インストールされたアプリ");
        myPhone.displayAppList();
        Player[] players = {new Player("A"),new Player("B")};
        StoneGame game = new StoneGame(players);
//        StoneGame player = new StoneGame(players);
        myPhone.install(game);
        System.out.println(game);
    }
}