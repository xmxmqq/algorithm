#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
    int data; // 데이터가 들어갈 자리
    struct Node* prev; // 이전 노드를 가리키는 포인터

}Node;


typedef struct Stack{
    Node* top; // 스택의 상단을 가리키는 포인터

}Stack;


void InitStack(Stack** s){ // 스택 생성 함수
    (*s) = (Stack*)malloc(sizeof(Stack)); // 메모리 할당
    (*s)->top = NULL; // top값 초기화
}

Node* CreateNode(int data){ // 새로운 노드 생성
    Node* n = (Node*)malloc(sizeof(Node));
    n -> data = data;
    n -> prev = NULL;
    return n;
}

void PushNode(Stack** stack, Node * node){ //새로 생성된 노드를 가리키게
    if((!stack)) return;

    node -> prev = (*stack) -> top;
    (*stack) -> top = node;
} // 호출은 PushNode(&myStack, CreateNode(5));

Node* PopNode(Stack** stack){
    if (!(*stack) || !((*stack)->top)) return NULL; // 데이터가 없을 경우 NULL을 리턴해준다 

    Node* n = (*stack) -> top;
    (*stack)->top = n -> prev;
    return n;
}

int main()
{
    Stack* stack = NULL;
    InitStack(&stack);
    PushNode(&stack, CreateNode(1));
    PushNode(&stack, CreateNode(2));
    PushNode(&stack, CreateNode(3));
    PushNode(&stack, CreateNode(4));
    PushNode(&stack, CreateNode(5));
    PushNode(&stack, CreateNode(6));
    PushNode(&stack, CreateNode(100));
    PushNode(&stack, CreateNode(101));
    PushNode(&stack, CreateNode(102));
    PushNode(&stack, CreateNode(103));
 
    for (int i = 0; i < 5; i++)
    {
        Node* n = PopNode(&stack);

        printf("%d\n",n  -> data);
        free(n);
    }
    //DestroyStack(&stack);
    return 0;
}

