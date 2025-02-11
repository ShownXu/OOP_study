package test2;

public class MysqlDAO extends IDAO implements Dao{

    @Override
    public void add() {
        System.out.println("添加内容");
    }

    @Override
    public void del() {
        System.out.println("删除内容");
    }

    @Override
    public void upd() {
        System.out.println("更新内容");
    }

    @Override
    public void sel() {
        System.out.println("查找内容");

    }

    public void conn(){
        System.out.println("连接");
    }
}
