#include <stdio.h>
#include <stdlib.h>

/*  Faça um programa que receba do usuário dois vetores, A e B, com 10 números inteiros cada. Crie um novo vetor denominado C calculando C = A - B. Mostre na tela os dados do vetor C.
*/

int main(int argc, char *argv[]) {
	
	int A[10];
	int B[10];
	int C[10];
	int i;
	
	for(i=0; i<10; i++){
		printf("digite para o vetor A: ");
		scanf("%i%*c", &A[i]);
	}
	
	for(i=0; i<10; i++){
		printf("digite para o vetor B: ");
		scanf("%i%*c", &B[i]);
	}
	
	for(i=0; i<10; i++){
		C[i] = A[i] - B[i];
		printf("\nOs valores do Vetor C sera: %d\n ", C[i]);
	}
	

	
	return 0;
}
