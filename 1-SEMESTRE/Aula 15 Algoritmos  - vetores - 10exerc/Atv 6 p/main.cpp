#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	
	float vendas[2];
	
	float com[2];
	
	char nome[2][20];
	
	int i;
	
// entrada de dados	

	for(i=0;i<2; i++){
		printf("digite o total de vendas ");
		scanf("%f%*c", &vendas[i]);
		
		printf("digite a porcetagem de comissao: ");
		scanf("%f%*c", &com[i]);
		
		printf("digite o nome do vendedor ");
		scanf("%s%*c", &nome[i]);
	}
	
// Valores a receber dos vendedores	
	
	int j;
	float totalCom[2];
	for(j=0;j<2; j++){
		totalCom[j] = vendas[j] * (com[j]/100);
		printf("%.0s tem a receber %.0f\n", nome[j], totalCom[j]);
	}
	
	
// somar o total de todas as vendas	
	
	int y;
	float soma=0;
	for(y=0; y<2; y++){
		soma += vendas[y];
	}
	printf("a soma das vendas todas e: %.2f", soma);
	
	
// calcular o maior valor a receber


	int x;
	float maior = totalCom[0];
	float menor = totalCom[0];
	int nomeMaior,nomeMenor;
	for(x=0; x<2; x++){
		if(maior < totalCom[x] ){
			nomeMaior=x;
			maior = totalCom[x];
			
		}else if(menor > totalCom[x]){
			nomeMenor=x;
			menor = totalCom[x];
		
	}
}
	printf("\nMaior valor a receber é : %.f", maior);
	printf("\ne sera de %s", nome[nomeMaior]);
	printf("\nMenor valor a receber é : %.f", menor);
	printf("\ne sera de %s", nome[nomeMenor]);
	
	return 0;
}
