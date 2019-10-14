#include<iostream>
using namespace std;
struct Node{
	int data;
	struct Node* next;
	Node(){
		next=NULL;
		data=0;
	}
};
struct Node* start=NULL;
void enqueue(int);
void dequeue();
void print();
int main(){
	int input,number;
	for(; ;){
	cout<<"what do u want to perform\n";
	cout<<"1.enqueue\n";
	cout<<"2.dequeue\n";
	cout<<"enter input\n";
	cin>>input;
	if(input==1){
		cout<<"enter the no. to be inserted \n";
		cin>>number;
		enqueue(number);
		print();
	}
	else if(input==2){
		dequeue();
		print();
	}
	else{
		break;
	}
	}
}
void enqueue(int x){
	Node*p =new Node();
	p->data=x;
	
	if(start == NULL) {
		start = p;
	} else {
		Node* temp=start;
		while(temp->next!=NULL){
			temp=temp->next;
		}
		temp->next = p;
	}
	
}
void dequeue(){
//	if(start==NULL){
//		cout<<"list is empty";
//	}
//	else{
//		Node* temp=start;
//		while(temp->next->next!=NULL){
//			 temp=temp->next;
//		}
//		
//		Node* u = temp->next;
//		temp->next=NULL;
//		delete u;
//	}
	if(start==NULL){
		cout<<"list is empty";
	}
	else{
		Node* temp=start;
		start=start->next;
		delete temp;
	}
}
void print() {
	Node* temp = start;
	while(temp != NULL) {
		std::cout << temp->data << "->";
		temp = temp->next;
	}
	cout<<"\n";
}
