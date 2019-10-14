//reverse of array
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void reverse(int[],int);

int main(){
	int size,i;
	
	//asking for the size of the array
	printf("Enter array size: ");
	scanf("%d",&size);
	
	//creating an array dynamically of size equal to variable size.
	int *arr = (int*)malloc(size*sizeof(int));  //dynamic array declaration
	
	//taking input in array
	printf("Enter Array Elements: ");
	for(i=0;i<size;i++)
		scanf("%d",&arr[i]);
	
	//printing normal arry
	printf("Array before: ");
	for(i=0;i<size;i++)
		printf("%d ",arr[i]);
	
	//calling reverse function
	reverse(arr,size);
	
	//freeing up the allocated memory for the array , so that their is no memory leak
	free(arr);
	
    getch();
	return(0);
}

void reverse(int arr[],int size){
	int i,j;   //counter variable
	int temp;  //temporary variable
	
	//swaping the array elements for reversing the array elements
	for(i=0;i<size/2;i++){
	    //swap logic
		temp = arr[i];
		arr[i] = arr[size - i - 1];
		arr[size - i - 1] = temp;
	}
	
	//printing reversed array
	printf("\nArray after: ");
	for(i=0;i<size;i++){
		printf("%d ",arr[i]);
	}
}
