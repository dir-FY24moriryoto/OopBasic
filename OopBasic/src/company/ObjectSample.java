package company;

public class ObjectSample {

    public static void main(String[] args) {
        //インスタンスの作成
        var department = new Department("営業部", "xx", 1000000);
        var employee = new Employee("鈴木",department,"課長",100);
        
        //インスタンスメソッドの呼び出し
        employee.report();
        employee.report(2);
        
        System.out.println("");
        var engineer = new Employee("田中", department, "一般社員", 88);
        
        engineer.report();
        engineer.joinMeeting();
    }

}
