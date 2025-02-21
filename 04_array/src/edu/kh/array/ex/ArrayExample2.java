package edu.kh.array.ex;

import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample2 {

	public void shallowCopy1() {

		
		//얕은 복사 (shallowCopy)
		// -> 주소를 복사하여 서로 다른 두 참조변수가
		// 하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사 방법
		
		int[]arr = {1, 2, 3, 4, 5};
		
		// 얕은 복사 진행
		int[] copyArr = arr; // 주소만 복사
		
		System.out.println("변경 전");
		System.out.println("arr 주소 : " + arr);
		System.out.println("copyArr 주소 : " + copyArr);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		// 얕은 복사한 배열의 값을 변경
		copyArr[2] = 999;
		
		System.out.println("변경 후");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		}

	public void deepCopy() {
		// 깊은 복사 (deep copy)
		// -> 같은 자료형의 새로운 배열을 만들어서
		// 기존 배열의 데이터를 모두 복사하는 방법
		
		int[] arr = {1,2,3,4,5}; // 원본
		
		// 1. for문을 이용한 깊은 복사
		int[] copyArr1 = new int[arr.length]; //5칸짜리 배열 생성
		
		for(int i = 0; i < arr.length; i++) {
			copyArr1[i] = arr[i];
		}
		
		System.out.println("arr 주소 : " + arr);
		System.out.println("copyArr 주소 : " + copyArr1);
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr1 : " + Arrays.toString(copyArr1));
	
		// 2. System.arraycopy(원본배열, 원본복사 시작 인덱스,
		//						복사배열, 복사배열의 삽입 시작 인덱스, 복사길이);
		int[] copyArr2 = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		
		// 3. 복사할 배열 참조변수 = Arrays.copyOf(원본배열, 복사할 길이);
		int[] copyArr3 = Arrays.copyOf(arr, arr.length);
		System.out.println("copyArr3 :  " + Arrays.toString(copyArr3));
		
		//값 변경 후 확인
		copyArr1[4] = 0;		
		copyArr2[4] = 999;		
		copyArr3[4] = 5000;
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr1 : " + Arrays.toString(copyArr1));	
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));	
		System.out.println("copyArr3 : " + Arrays.toString(copyArr3));

	}

	public void createLottoNumber() {
		
		// 로또 번호 생성기
		//배열을 이용한 중복데이터 제거 + 정렬
		
		// 1. 1~45 사이 중복되지 않은 난수 6개 생성
		// 2. 생성된 난수가 오름차순 정렬
		// [5, 11, 13, 18, 24, 25]
		
		// 1) 정수 6개 저장할 배열 선언 및 할당
		
		int[] lotto = new int[6];
		
		// 2) 생성된 배열(lotto)을 처음부터 끝까지 순차 접근하는 for문 작성
		for(int i = 0; i < lotto.length; i++) {
			
			// 3) 1 ~ 45 사이 난수 생성
			int random = (int)(Math.random() * 45 + 1); // 1 ~ 45
			
			// 4) 생성된 난수를 순서대로 배열 요소에 대입
			lotto[i] = random;
			
			//5) 중복 검사를 위한 for문 작성
			for(int x = 0; x < i; x++) {
				
				// 6) 현재 생성된 난수와 같은 수가
				// 앞쪽 요소에 있는지 검사
				if(random == lotto[x]) {
					i--;
					// i가 1씩 증가할 때마다 난수가 하나 생성됨
					// -> 중복값이 있으면 난수를 새로 하나 더 생성
					// -> i값을 인위적으로 1 감소 시켜서 난수 발생의 기회를 한번 더 주는 것
					break;
					// 앞쪽에서 중복 데이터를 발견하면
					// 남은 값은 비교할 필요 없다
					// -> 효율 향상을 위해서 중복 검사용 for문 종료
					
					
				}
				
			}
			
		}
		
		// 정렬은 되어있지 않지만, 중복 제거가 된 배열이 완성됨
		
		// 7) 오름차순 정렬
		// -> 선택, 삽입, 버블, 퀵 등등
		// --> 자바가 정렬 방법을 미리 만들어서 제공하고 있음
		// Arrays.sort(배열명) : 배열 내 요소값들이 오름차순 정렬됨
		
		Arrays.sort(lotto);
		
		//결과 출력
		System.out.println( Arrays.toString(lotto));
		
		
		
		
		
	}
	
	public void practice1() {
		
		/* 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

		[실행 화면]
		1 2 3 4 5 6 7 8 9
		짝수 번째 인덱스 합 : 25
		 */
		
		// 배열 생성 및 초기화
		
		int[]arr = new int [9];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		
		
		// 배열 출력
		System.out.print(arr[i] + " ");
		}
		
		// 짝수번째 인덱스 합 구하기
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i %2 == 0)
				sum += i;
		}
		
		// 결과 출력
		System.out.println();
		System.out.println("짝수번째 인덱스 합의 값" + sum);
		
	}
	
	public void practice2() {

// 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
// 홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

// [실행 화면]
// 9 8 7 6 5 4 3 2 1
// 홀수 번째 인덱스 합 : 20
		int[]arr = new int [9];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i %2 == 0) {
				sum += arr[i];
			}
		}
			System.out.println();
			System.out.println("짝수번째 인덱스 합의 값 : " + sum);
	
	
	}

	public void practice3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		// [실행 화면]
		//양의 정수 : 5
		//1 2 3 4 5
//=========================================		
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		// 정수 입력받기
		System.out.println("정수 입력 : ");
		// 사용자 입력값 받기
		int n = sc.nextInt();
		//배열 크기 설정
		int[]arr = new int [n];
		// 배열에 1부터 n까지 대입
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			}
		
		// 배열 출력
		for(int i = 0; i < arr.length; i++) {
		// 배열 값 출력
			System.out.println(arr[i] + " ");
			}
	
		}
	
		
	public void practice4() {
		//사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		//배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		//그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

		//[실행 화면]
		//정수 : 5
		//배열 0번째 인덱스에 넣을 값 : 4
		//배열 1번째 인덱스에 넣을 값 : -4
		//배열 2번째 인덱스에 넣을 값 : 3
		//배열 3번째 인덱스에 넣을 값 : -3
		//배열 4번째 인덱스에 넣을 값 : 2
		//4 -4 3 -3 2
		//총 합 : 2
		
		
	}
	
 	public void practice5() {
		//문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		//개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

		//[실행 화면]
		//문자열 : application
		//문자 : i
		//application에 i가 존재하는 위치(인덱스) : 4 8
		//i 개수 : 2
//=======================================================
		Scanner sc = new Scanner(System.in);
		// 사용자에게 문자열 입력받기
		System.out.println("문자열");
		String str = sc.nextLine();
		
		// 사용자가 입력한 문자열을 하나하나 char 배열에 넣기
		// -> 사용자가 입력한 문자열의 길이만큼의 char 배열을 할당
		char[] arr = new char[str.length()];
		
		// 반복문을 통해 str.charAt(i) 값을 arr[i]에 담는 과정
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		// 문자 입력받기(검색할 문자)
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		// 검색할 문자가 문자열에 몇개가 존재하는지, 어느 인덱스에 있는지 파악
		int count = 0; // 검색할 문자가 몇개 들어있는지 세어줄 변수
		// 문자열에서 동일한 문자가 발견될 때마다 1씩 증가
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) { //해당 인덱스 값이 검색될 문자와 같을 경우
				System.out.println(i + " "); //해당되는 인덱스 이어서 출력해주기(print)
				
				count++; // count 값을 증가
			}
		}
		
	System.out.println();
	System.out.println(ch + "개수 : " + count);
	}
	
}
	



