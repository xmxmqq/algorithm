# 스택

## 10828번
<https://www.acmicpc.net/problem/10828>
## 문제

정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.  

명령은 총 다섯 가지이다.  

- push X: 정수 X를 스택에 넣는 연산이다.
- pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
- size: 스택에 들어있는 정수의 개수를 출력한다.
- empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
- top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.  

## 입력  

첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.  

## 출력  
출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.



# 풀이 과정

기존 스택 구조를 먼저 구현해 본 뒤 입력되는 명령어마다 해당 함수를 호출하는 방식으로 진행했는데  

top을 호출 시 값이 이상하게 나오는 문제가 발생  

~~~c
100
push 10
push 20
push 30
top
30
pop
1782352
top
1778232
pop
1778232
pop
pop
10
pop
1782352
pop
1778232
pop
1769664
1782352
~~~  

백준 컴파일러에서는 런타임 오류로 나옴  

메모리 해제 과정에서 나오는 오류로 나와서 메모리 해제를 모두 주석 처리했다.
~~~c
        else if(!strcmp(order,"top")){
            Node* n = PeekNode(&stack);

            if(n==NULL)
                printf("-1\n");
            else
                printf("%d\n",n -> data);
            
            //free(n); <-이부분
            
        }
~~~

pop에서는 정상 작동하는 것이 왜 top에서는 안되는것인지 이해가 안됐다.  

스택 구현시 노드는 데이터와 이전 노드를 가리키는 포인터로 구성되어 있다.
