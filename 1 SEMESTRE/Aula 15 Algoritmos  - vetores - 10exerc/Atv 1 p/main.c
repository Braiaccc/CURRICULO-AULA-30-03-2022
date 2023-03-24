#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int vetor[7];
	int i;
	int pares = 0;
	int impares = 0;
	
	for(i=0;i<7;i++){
		printf("Digite %dº do vetor\n", i + 1);
		scanf("%d%*c", &vetor[i]);
		if(vetor[i]%2==0){
			pares++;
		}else{
			impares++;
		}
	}
	
	printf("O total de pares é: %d\n", pares);
	for( i = 0; i < 7; i++){
		if(vetor[i]%2==0){
			printf("%d\n",vetor[i]);
		}
	}
	
	printf("O total de impares é: %d\n", impares);
	for( i = 0; i < 7; i++){
		if(vetor[i]%2!=0){
			printf("%d\n",vetor[i]);
		}
	}
	return 0;
}
