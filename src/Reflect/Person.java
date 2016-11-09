package Reflect;

interface China{  
    public static final String name="Rollen";  
    public static  int age=20;  
    public void sayChina();  
    public void sayHello(String name, int age);  
}  
   
class Person implements China{  
    public Person() {  
           
    }
    public Person(String name){  
        this.name=name;  
    }  
    public Person(int age){  
        this.age=age;  
    }  
    public Person(String name, int age) {  
        this.age=age;  
        this.name=name;  
    }  
   /* public Person(String sex,String name){  
        this.sex=sex;
        this.name=name;
    }*/  
    public String getSex() {  
        return sex;  
    }  
    public void setSex(String sex) {  
        this.sex = sex;  
    }  
    @Override  
    public void sayChina(){  
        System.out.println("hello ,china");  
    }  
    @Override  
    public void sayHello(String name, int age){  
        System.out.println(name+"  "+age);  
    }
    @Override  
    public String toString(){  
        return "["+this.name+"  "+this.age+"]";  
    }  
    private String sex; 
    private String name;  
    private int age;  
}  
   
class hello{  
    public static void main(String[] args) {  
        Class<?> demo=null;  
        try{  
            demo=Class.forName("Reflect.Person");  
        }catch (Exception e) {  
            e.printStackTrace();  
        }  
        //保存所有的接口  
        Class<?> intes[]=demo.getInterfaces();  
        for (int i = 0; i < intes.length; i++) {  
            System.out.println("实现的接口   "+intes[i].getName());  
        }  
    }  
}  