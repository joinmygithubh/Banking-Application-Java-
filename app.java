class app{
    int empId;
    String name;
    static String companyName="Smart programming";

    app(int empId, String name){
        this.empId = empId;
        this.name = name;
    }

    void display(){
        System.out.println(empId+" "+name+" "+ companyName);
    }

    public static void main(String[] args) {
        app a1=new app(101, "sameer");
        a1.display();

        app a2=new app(102, "akash");
        a2.display();
    }
}