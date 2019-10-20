/*
How does it works, basically
it create a vector full of 0's
and than adds +1, if the value of
the number equals the index of the vector
*/

#include <stdio.h>

int main(void)
{
    int v[10000] = {0};
    int qtd, number;
    
    printf("Enter the amount of numbers to sort: \n");
    //amount of numbers
    scanf("%d", &qtd);
    printf("Enter the numbers: \n");

    for(int i=0; i<qtd; i++){
        //reading number
        //and adding +1
        scanf("%d", &number);
        v[number] += 1;
    }

    printf("The sorting array is:");
    for(int i=0; i<100; i++){
        //checking
        //if the number is 0, means there are no number in the vector
        if(v[i]!=0){
            //if so, the number represents the amount of time
            //it appears in the sequence
            while(v[i] != 0){
                printf(" %d",i);
                v[i]--;
            }
        }
    }
    printf("\n");

    return 0;
}