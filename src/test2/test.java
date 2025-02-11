package test2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("选择Mysql输入0，选择Oracle输入1");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        IDAO sql = null;
        if(a == 0){
            sql = new MysqlDAO();
            System.out.println("已进入Mysql");
        }else {
            sql = new OracleDAO();
            System.out.println("已进入Oracle");
        }
        System.out.println("请输入选项以选择操作");
        System.out.println("1.添加数据\n2.删除\n3.更新数据\n4.查找数据\n5.连接数据");

        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        switch (n){
            case 1:sql.add();break;
            case 2:sql.del();break;
            case 3:sql.upd();break;
            case 4:sql.sel();break;
            case 5:sql.del();break;
        }
    }
}
