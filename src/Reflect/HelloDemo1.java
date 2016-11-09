package Reflect;

import java.lang.reflect.Method;

public class HelloDemo1 {

	public static void main(String[] args) throws Exception{
		Class<?> demo=null;  
        try{  
            demo=Class.forName("Reflect.Person");            
        }catch (Exception e) {  
            e.printStackTrace();  
        }
//获取接口
		/*  
         
        //保存所有的接口  
        Class<?> intes[]=demo.getInterfaces();  
        for (int i = 0; i < intes.length; i++) {  
            System.out.println("实现的接口   "+intes[i].getName());  
        }  
    */
//获取所有方法
		/*  
        Method method[]=demo.getMethods();  
        for(int i=0;i<method.length;++i){  
            Class<?> returnType=method[i].getReturnType();  
            Class<?> para[]=method[i].getParameterTypes();  
            int temp=method[i].getModifiers();  
            System.out.print(Modifier.toString(temp)+" ");  
            System.out.print(returnType.getName()+"  ");  
            System.out.print(method[i].getName()+" ");  
            System.out.print("(");  
            for(int j=0;j<para.length;++j){  
                System.out.print(para[j].getName()+" "+"arg"+j);  
                if(j<para.length-1){  
                    System.out.print(",");  
                }  
            }  
            Class<?> exce[]=method[i].getExceptionTypes();   
            if(exce.length>0){  
                System.out.print(") throws ");  
                for(int k=0;k<exce.length;++k){  
                    System.out.print(exce[k].getName()+" ");  
                    if(k<exce.length-1){  
                        System.out.print(",");  
                    }  
                }  
            }else{  
                System.out.print(")");  
            }  
            System.out.println();  
        } */
		
//获取构造器
		/*  
        Person per1=null;  
        Person per2=null;  
        Person per3=null;  
        Person per4=null;  
        //取得全部的构造函数  
        Constructor<?> cons[]=demo.getConstructors();  
        for (Constructor<?> constructor : cons) {
			System.out.println(constructor);
		}
        try{  
        	per1=(Person)cons[0].newInstance("Rollen",20);
            per2=(Person)cons[1].newInstance(20);
            per3=(Person)cons[2].newInstance("Rollen");  
            per4=(Person)cons[3].newInstance();  
        }catch(Exception e){  
            e.printStackTrace();  
        }  
        System.out.println(per1);  
        System.out.println(per2);  
        System.out.println(per3);  
        System.out.println(per4);  */
        
//使用get，set方法
        Object obj=demo.newInstance();
        setter(obj, "Sex", "男", String.class);
        getter(obj, "Sex");
        

	}
	public static void getter(Object obj,String att) {
		try {
			Method method=obj.getClass().getMethod("get"+att);
			System.out.println(method.invoke(obj));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void setter(Object obj,String att,Object value,Class<?> type) {
		try {
			Method method=obj.getClass().getMethod("set"+att, String.class);
			method.invoke(obj, value);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
