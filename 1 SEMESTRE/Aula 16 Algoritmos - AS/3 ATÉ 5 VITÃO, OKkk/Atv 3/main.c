#include <stdio.h>
#include <stdlib.h>

/* Faça um programa que leia um vetor de 10 posições e verifique se existem valores iguais  e os escreva na tela.*/

int main(int argc, char *argv[]) {
	int vetor[10];
	int	i = 0;
	int	j = 0;
	int aux;
	
	printf("digite 10 numeros\n");
	
	for(i=0;i<10;i++){
		
		printf("[%i]", i+1);
		
		scanf("%d", &vetor[i]);
		
	}
	
	printf("os numeros repetidos são:\n");
	
	for(i=0;i<10;i++){
		
		for(j=i+1;j<10;j++){
			
			if(vetor[j] == vetor[i]){
				
				aux = vetor[i];
				
				printf("%d\n",aux);
				
			}
		}
	}
	
	
	return 0;
}


