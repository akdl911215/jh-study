package Sixth;

public class FirstArrayTest {
    public static void main(String[] args) {
        // 배열을 왜 사용하는가?
        // 계좌 금액
        // 4000만개의 int형 변수를 만들것인가 ?
        // 4000만개를 직접 입력하기가 너무 빡세다.
        // 그러니까 배여을 사용해서 손쉽게 4000만개를 할당하는 것이다.

        // 아래 예의 경우 만약 배열이 없었다면
        // int arr1, arr2, arr3, arr4, arr5;
        // int arr6, arr7, arr8, arr9, arr10;
        // 위와 같이 변수를 만들어야 했을 것이다.
        // 그러나 배열을 사용하니 아래 코드로 끝이났다.

        // 배열을 만드는 방법
        // 1. 데이터타입을 적는다.
        // 2. 대괄호를 열고 닫는다.
        // 3. 변수 이름을 지정하듯이 배열의 이름을 지정한다.
        // 4. 필요하다면 값을 할당한다.
        //    값을 할당하는 방법
        //    4-1. new 를 적는다.
        //    4-2. 데이터타입을 적고 대괄호를 열고 닫는다.
        //    4-3. 몇 개를 만들것인지 대괄호 내부에 숫자를 적는다.
        //    * 변칙수:
        //      중괄호를 열고 닫은 이후
        //      아래와 같이 미리 값을 할당할 수도 있다.
        //      {1, 2, 4, 5, 2342, 25335, 30}

        // int 형 다발을 이름 arr 로 만들겠다.
        // int 형 공간을 10 개 만들겠다.
        // 위의 두 문장이 결합되어
        // int 형 배열 arr 는 int 형 공간 10 개를 가진다.
        int[] arr = new int[10];

        // 배열의 시작 인덱스 무조건 0 부터 시작하낟.
        // ------------------------------------------
        // | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |  for 문이 끝났을 때
        // ------------------------------------------
        //  [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]

        // 배열의 시작 인덱스 무조건 0 부터 시작하낟.
        // ------------------------------------------
        // |   |   |   |   |   |   |   |   |   |    |  for 문 이전
        // ------------------------------------------
        //  [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
        for(int i = 0; i < 10; i++) {
            arr[i] = i + 1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
