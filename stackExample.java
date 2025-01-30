import java.util.Scanner;

public class stackExample {
  private int size;
  private int capacity;
  private int top;
  private int arr[];

  stackExample(int size) {
    arr = new int[size];
    capacity = size;
    top = -1;
  }

  void push(int x) {
    if (top == capacity - 1) {
      System.out.println("stack is overflow");
      return;
    } else {
      arr[++top] = x;
    }
  }

  int pop() {
    if (top == -1) {
      System.out.println("stack is underflow");
      return -1;
    }
    return arr[top--];

  }

  int peek() {
    if (top == -1) {
      System.out.print("stack underflow ");
    }
    return arr[top];
  }

  void display() {
    if (top == -1) {
      System.out.println("stack is empty");
    } else {
      System.out.print("stack element:");
      for (int i : arr) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    int size = sn.nextInt();
    stackExample stack = new stackExample(size);
    System.out.println(" enter the number");
    for (int i = 0; i < size; i++) {
      stack.push(sn.nextInt());
    }
    stack.display();

    System.out.println(stack.pop());
    System.out.println(stack.peek());

  }
}
