import java.util.Scanner;
import java.util.Random;
public class random{
	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			Random r = new Random();
			int count=1;
			int k = r.nextInt(100); // 0~99까지의 임의의 정수 생성
			System.out.println("Up & Down게임입니다. 숨겨진 수를 맞추어 보세요");
			System.out.println("0-99");
			int max = 99;
			int min =0;
			while(true)
			{	
		
			System.out.print(count+">> ");
			
			
			
				int number = in.nextInt(); // 정수 입력 받음
			
			if(number<k)
			{
				System.out.println("더 높게");
				System.out.println(number+"-"+max);
				count++;
				max = k;
				min = number;
			}
			else if(number>k)
			{
				System.out.println("더 낮게");
				System.out.println(min+"-"+number);
				count++;
				max = number;
				min = k;
			}
			if(number==k)
			{
				System.out.println("맞췄습니다");
				System.out.println("다시하시겠습니까(y/n)>>");
				if(in.next().equals("y"))
				{	System.out.println("Up & Down게임입니다. 숨겨진 수를 맞추어 보세요");
					System.out.println("0-99");
					count =1;
					max =99;
					min =0;
					 continue;
				}
				else if(in.next().equals("n"))
				{
					 break;
				}
			}
			
			
		
		}	
			
	}
}