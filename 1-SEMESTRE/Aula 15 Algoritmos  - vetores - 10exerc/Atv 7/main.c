#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	float number[10];
	int i;
	float soma = 0;
	float calc;
	for(i=0;i<10;i++){
		printf("digite um valor: ");
		scanf("%f%*c", &number[i]);
		
		if(number[i] < 0){
			soma ++;
		}else if(number[i] > 0 ){
			calc += number[i]; 
		}
	}
	
	printf("total de negativos: %.2f", soma);
	printf("\nsoma dos positivos: %.2f", calc);
	
	return 0;
}
