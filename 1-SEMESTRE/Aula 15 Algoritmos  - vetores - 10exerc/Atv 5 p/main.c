#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {

{
    int tLogica[5];
    int tLinguagem[3];
    int i;
    
    for (i = 0; i < 5; i++){
      printf("Digite o Código do aluno de Logica\n");
      scanf("%d%*c",&tLogica[i]);
    }
    
      for (i = 0; i < 3; i++){
      printf("Digite o Código do aluno de Linguagem\n");
      scanf("%d%*c",&tLinguagem[i]);
    }
    for ( i = 0; i < 3; i++){
    	int j;
        for( j=0;j<5;j++){
            if( tLinguagem[i]==tLogica[j]) {
                printf("Aluno nas duas turmas:%d\n",tLinguagem[i]);
            }
        }
      
    }
    
    

}
	return 0;
}
