package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day1014 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int r[] = new int[10];
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수 10개를 입력하세요! : ");
		for(int x=0; x<r.length; x++)	{
			r[x] = Integer.parseInt(inbr.readLine());
		}
		System.out.println("입력 데이터 값 : ");
		for(int x=0; x<r.length; x++)	{
			System.out.print(r[x] + "..");
		}
		System.out.println();
		//오름차순 정렬 시작
		/*for(int i=0; i<r.length; i++)	{	//버블정렬, 외워서 쓰는수밖에없음.
			for(int j=0; j<r.length-1; j++)	{
				if(r[i]<r[j])	{		//r[i]>r[j] 로 바꾸면 내림차순으로 변경됨.
					int temp = r[i];
					r[i] = r[j];
					r[j] = temp;
				}
			}
		}*/
		Arrays.sort(r);	//Arrays 클래스에서 제공하는 정렬 메서드, import해야됨. <오름차순정렬>
		
		System.out.print("오름차순 데이터 값 : ");
		for(int x=0; x<r.length; x++)	{
			System.out.print(r[x] + "..");
		}
		System.out.println();System.out.print("합계 : ");
		int sum = 0;
		for(int x=0; x<r.length; x++)	{
			sum = sum + r[x];
		}
		System.out.println(sum);
		System.out.println("평균 : " + (sum / r.length));
	}
}
