package practice;

import java.util.Scanner;

public class PrEx01 {

	public static void main(String[] args) {

		//문제 1-1. int 형의 방 5개 배열을 만들고, 10,20,30,40,50을 저장하고 출력.
		// 배열은 new를 이용해서 메모리를 할당해야 사용 가능
		/*
		int [] room = {10,20,30,40,50};
		for (int i = 0; i < room.length; i++) {
			System.out.println(room[i]);
		}
		*/
		//문제 1-2. 위에서 만든 배열을 이용하여, 인덱스번호 1번과 3번안에 있는 데이터의 합을 출력
		/*
		int [] room = {10,20,30,40,50};
		for (int i = 0; i < room.length; i++) {
			System.out.println(room[i]);
		}
		System.out.println("인덱스 번호 1번화 3번의 데이터 합은 : " + ( room[1] + room[3]));
		*/
		
		//문제 1-3. 인덱스 번호를 사용자로부터 입력받고, 해당 인덱스의 데이터를 출력
		/*
		int [] room = {10,20,30,40,50};
		for (int i = 0; i < room.length; i++) {
			System.out.println(room[i]+ "\t");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("인덱스 번호를 입력하세요 >>");
		int idx = sc.nextInt();
		System.out.println(room[idx]);
		*/
		
		//문제 1-4. 배열 안의 모든 요소를 다 더한 값을 출력
		/*
		int [] room = {10,20,30,40,50};
		for (int i = 0; i < room.length; i++) {
			System.out.println(room[i]+ "\t");
		}
		int sum = 0;
		for (int i = 0; i< room.length; i++) {
			sum += room[i];
		}
		System.out.println(sum);
		*/
		
		//문제 1-5. 배열 안에 있는 값중 한개를 입력하면, 그 값이 위치한 인덱스번호를 출력.
		
		/*int [] room = {10,20,30,40,50};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 안에 있는 값을 입력하세요 >>");
		int data = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < room.length; i++) {
			if (data == room[i]) {
				System.out.println(i);
			}
		}	
		*/
		//문제 1-6. 인덱스번호 2번과 4번방의 값을 교환해서 저장.
		/*
		int [] room = {10,20,30,40,50,};
		
		for (int i = 0; i< room.length; i++) {
			int temp = room[2];
			room[2] = room[4];
			room[4] = temp;
			System.out.println(room[i]);
		}
		*/
		
		//문제 1-7. (심화) 내림차순으로 정렬 (큰수 -> 작은수 순서로 다시 저장)
		int [] room = {10,20,30,40,50,};
		
		for (int i = 0; i<room.length; i++ ) {
			for (int j = 0; j<room.length; j++) {
				if (room[i] > room[j]) {
					int temp = room[i];
					room[i] = room[j];
					room[j] = temp;
				}
			}
		}
		for (int i = 0; i<room.length; i++) {
			System.out.println(room[i]);
		}
	}

}
