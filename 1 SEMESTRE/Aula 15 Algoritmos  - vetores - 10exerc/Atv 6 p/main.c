#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int TAM=10;
    float vendas[TAM];
    int percetual[TAM];
    char vendedores[TAM][20];
    int i;

  for (i = 0; i < TAM; i++){
        printf("Digite as vendas\n");
        scanf("%f%*c",&vendas[i]);
        printf("Digite o percentual\n");
        scanf("%d%*c",&percetual[i]);
        printf("Digite o nome do vendedor\n");
        scanf("%s%*c",vendedores[i]);
    }

   
    for ( i = 0; i <TAM; i++){
        float valor= (vendas[i]*percetual[i])/100;
        printf("O VENDENDOR %s - Total de vendas %.1f valor a receber %.1f\n",vendedores[i],vendas[i],valor );
    }
    int maiorVenda=0;
    int menorVenda=0;
    float totalVenda=0;

     for (i = 0; i <TAM; i++){
         if(vendas[maiorVenda]<vendas[i]){
             maiorVenda=i;
         }
          if(vendas[menorVenda]>vendas[i]){
             menorVenda=i;
         }
         totalVenda+=vendas[i];
      }
    printf("VENDEDOR DO MES: %s\n", vendedores[maiorVenda]);
    printf("VALOR : %.1f\n", vendas[maiorVenda]);
    printf("PIOR DESEMPENHO DO MES: %s\n", vendedores[menorVenda]);
    printf("VALOR : %.1f\n", vendas[menorVenda]);
    printf("TOTAL DE VENDAS %.1f\n",totalVenda);
	return 0;
}
