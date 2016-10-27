package com.JavaCore;
import java.util.Arrays;
public class Imooc {

	 public void print() {
			System.out.println("Hello World");
		}
	 public   void  showMyLove() {
			System.out.println("我爱慕课网!");
		}
	public static void main(String[] args) {
		/*
		 * Arrays排序然后输出
		 * 
		 * */
		//String[] hobbys={"sport","game","movie"};
		/*String hobbys[]=new String[3];
		hobbys[0]="sport";
		hobbys[1]="game";
		hobbys[2]="movie";
		System.out.println(Arrays.toString(hobbys));
		
		Arrays.sort(hobbys);
		System.out.println(Arrays.toString(hobbys));*/
		
		
		/*
		 * 
		 * 定义一个二维数组
		 * 然后输出
		 * 
		 * */
		
		// 定义两行三列的二维数组并赋值
		/*String[][]  names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
                 
		// 通过二重循环输出二维数组中元素的值
		for (int i = 0; i <names.length  ; i++) {
            for (int j = 0; j < names[i].length; j++) {
              	System.out.println( names[i][j] );
			}
            	System.out.println();
		}	*/	
	
		Imooc test=new Imooc();
		test.print();
		test.showMyLove();
		
	}

}
