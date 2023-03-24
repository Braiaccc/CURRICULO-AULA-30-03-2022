#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int TAM=3;
    char nomes[TAM][10];
    float notas[TAM];
    int i;
 for (i = 0; i < TAM; i++)
    {
        printf("Digite o nome %d \n", i+1);
        scanf("%s",nomes[i]);
        printf("Digite a nota %d \n", i+1);
        scanf("%f",&notas[i]);
    }
    int maiorMedia=0;

    for (i = 0; i < TAM; i++){
        if(notas[i]<7){
            float nota=10-notas[i];
            printf("Aluno %s precisa %f\n",nomes[i],nota);
        }

        if(notas[maiorMedia]<notas[i]){
            maiorMedia=i;
        }

    }
    

    for (i = 0; i < TAM; i++) {
       printf("%s\n ",nomes[i]);
    }

    printf("A maior media e do %s - %f",nomes[maiorMedia],notas[maiorMedia]);
	return 0;
}
