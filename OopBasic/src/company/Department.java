package company;

public class Department {

    private final String name;
//    private final String departmentId;
    public final String departmentId;
    private int budget;
    
    //コンストラクター
    public Department(String name, String departmentId, int budget) {
        this.name = name;
        this.departmentId = departmentId;
        this.budget = budget;
    }
    //会議を開催するっていうメソッドを作る
    public void meeting() {
        System.out.println("部内会議を開催します。部署：" + name + "、予算：" + budget);
    }
    public String getName() {
        return name;
    }
    public double getBudget() {
        return budget;
    }
    
    public String getDepId(){
        return departmentId;
    }
    
    public void setBudget(int bidget) {
        if(budget < 0) {
            throw new IllegalArgumentException("予算はマイナスにできません。");
        }
        this.budget = budget;
    }
}
