#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	int A[] = {1,0,5,-2,-5,7};
	
	int soma = A[0] + A[1] + A[5];
	
	printf("a soma: %.i\n", soma);
	
	A[4] = 100;
	
	int i;
	for(i=0; i<6; i++){
		printf("\n%.i",A[i]);
	}	
	return 0;
}
