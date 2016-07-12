package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		while(true){
		System.out.print( "숫자를 입력하세요: " );
		int inputNumber = scanner.nextInt(); // 입력받기
		int sum=0;
		
		if(inputNumber%2 !=0){ //입력한 값이 홀수면
		for(int i=1; i<=inputNumber; i++){
			if(i%2!=0){
				sum+=i;
			} }
		}else{
			for(int i=1; i<=inputNumber; i++){
				if(i%2==0){
					sum+=i;
				} }
		}
		System.out.println(sum);
		}
	}
	
}