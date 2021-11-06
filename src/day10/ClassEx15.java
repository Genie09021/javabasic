package day10;
import java.util.Scanner;
/*
 Tv 클래스 기능 구현
// 1. 채녈 = 배열 [10]개 생성후, 랜덤값 10개 생성해 낮은값부터 대입
// 2. 채널 (up, down) = 위 랜덤 뽑힌 채널 번호로 이동 // channelchange이용 
//3. 채널 값을 입력받아 변경 (입력값이 채널배열에 없는 번호면 이동 못함)
//4. 볼륨은 0~10까지 증감
//5. 볼륨 음소거 기능
 6. Tv 정보 출력 - 메서드 호출되면 Tv상태(전원, 채널, 볼륨)
 7. 전원이 꺼져있는 경우 모든 기능 동작 안함.
 */

class Tv {
	boolean power = false; // 전원 상태값 저장할 변수
	int vol = 0; // 볼륨 상태값 저장할 변수
	int [] channel = new int [10]; // 채널들 저장할 저장소
	int chIdx =0; // 볼륨 상태값 저장할 변수

	// 전원 켜기 / 끄기 메서드
	void powerOnoff() { 
		power = !power;
	}
	// 채널 셋팅 메서드
	void setChannel () {
		if (power) {
			// 랜덤 10개 채우기 (중복없어야함)
			for (int i = 0; i<channel.length; i++) {
				channel[i] = (int)(Math.random()*100)+1; // 1~100 랜덤값
				// 중복체크
				for (int j = 0; j<i; j++) {
					if (channel[i] == channel[j]) {
						i--;
						break; //중복 체크 (내부) for문 종료 
					}
				}		
			}
			// 정렬 (오름차순) 선택정렬 (가장낮은거 찾아서 앞으로 이동)
			int min = 0; // 낮은 값의 인덱스번호를 가지고 있을 변수 초기값을 0번 인덱스
			for (int i = 0; i<channel.length-1; i++) {
				min = i;
				for (int j = 0; j<channel.length; j++) {
					if (channel[min] > channel[j]) {
						min = j;
					}
				}
				int temp = channel[i];
				channel[i] = channel[min];
				channel[min] = temp;
			}
		}
	}		
	void printCh () { // 채널 출력하는 메서드 정의
		if (power) {
			System.out.println("ch >> " );
			for (int c : channel) System.out.print(c + " ");
			System.out.println();
		}
	}
	void setTv () { // 티비 처음 세팅하는 메서드 정의
		if (power) {
			System.out.println("전원 : " + (power? "ON" : "OFF"));
			setChannel(); //채널세팅 메서드 호출
			printCh(); // 채널출력메서드 호출
		} else { 
			System.out.println("전원을 켜주세요");
		}
	}	
	// 채널 업
	void chUp () {
		if (power) {
			chIdx++;
			if (chIdx == 10) chIdx = 0;
			System.out.println("채널 Up: " + channel[chIdx]);
		}
	}	
	void chDown () {
		if (power) {
			chIdx--;
			if (chIdx == -1) chIdx = 9;
			System.out.println("채널 Down: " + channel[chIdx]);
		}
	}	
	// 채널번호 입력해서 변경하기
	void chChange (int c) {
		for (int i= 0; i<channel.length; i++) {
			if (channel[i] == c) {
				chIdx = i; // 해당채널로 변경
				System.out.println("채널 변경 : " + channel[chIdx]);
				break;
			} 
		}
	}
	// 볼륨 조정
	void volUp () {
		if (power) {
			if(vol < 10) vol++;
			System.out.println("볼륨 Up :" + vol);
		}
	}	
	void volDown() {
		if (power) {
			if (vol >= 0) vol--;
			System.out.println("볼륨 Down :" + vol);
		}
	}	
	// 음소거
	void mute () {
		if (power) {
			vol = 0;
		}
	}
	// Tv 정보출력
	void tvInfo () {
		System.out.println("******* TV 정보 *******");
		System.out.println("전원 : " + (power? "ON" : "OFF"));	
		printCh();
		System.out.println("채널 : " + channel[chIdx] + "볼륨 : " + vol);
		
	}
	
	
}	
	
public class ClassEx15 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Tv tv = new Tv(); // 선언 + 생성
		//tv.powerOnoff(); // 전원 켜기
		tv.setTv(); // 채널셋팅
		//tv.chDown();
		//tv.chUp();
		tv.mute();
		tv.volUp();
		tv.volUp();
		tv.volUp();
		tv.tvInfo();
			
	}	
				
}


