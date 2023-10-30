# Algorithm
This is a auto push repository for Baekjoon Online Judge created with [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub).

자바로 백준 풀 때의 주의사항

1. 클래스명은 'Main', 패키지는 없어야 한다.

2. Main 이외의 클래스를 추가로 쓰고싶다면 public이 아닌 클래스 혹은 Inner 클래스를 쓰면 된다.

3. main 함수에서 바로 작성 시, 당연하게도 모든걸 static으로 작성해야 한다.

4. 빠르게 입력 받기! Scanner는 느리다. BufferedReader를 사용하자.
   - 마찬가지로 String에 대한 split() 보다는 StringTokenizer로 짜르는게 더 빠르다. 따라서 입력받을 때 BufferedReader와 StringTokenizer로 입력받는다면 빠르게 입력받을 수 있다.
  
5. 입력을 위한 클래스는 하나만 쓸 것!

6. 출력도 System.out.println()은 느리다!
   -System.out.println() 부분을 BufferedWriter로 출력

7. 자바로 풀 수 없는 문제가 간혹 있다.
