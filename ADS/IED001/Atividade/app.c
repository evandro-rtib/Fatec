#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "app_Cabec_Cont.h"

int main(void)
{	
	char nome[CHAR_CIDADE];
	int populacao;
	float area,pib,idh;
	TLCidades listaCidades;
	
	InicializaLista(&listaCidades);

	while (TRUE)
	{	
		printf("Informe o nome da cidade:\n");
		scanf("%s", &nome);
		if (strcmp(nome,"FIM")==0)
			break;
		printf("Informe a populacao da cidade:\n");
		scanf("%i", &populacao);
		printf("Informe area da cidade:\n");
		scanf("%f", &area);
		printf("Informe o PIB:\n");
		scanf("%f", &pib);
		printf("Informe o IDH:\n");
		scanf("%f", &idh);

		if (IncluiItem(&listaCidades, nome,populacao,area,pib,idh) == FALSE)
		{	puts("Memoria insuficiente para esta operacao");
			return 2;
		}
	}

	ImprimeLista(&listaCidades, "Conteudo da lista:");
	ImprimeListaInverso(&listaCidades, "Conteudo da lista invertido:");
		
	/*while (TRUE)
	{	printf("Informe o valor a excluir: ");
		scanf("%d", &numero);
	
		if (numero < 0)
			break;
		
		if (ExcluiItem(&lista, numero) == FALSE)
			puts("Valor nao encontrado");
		else
			ImprimeLista(&lista, "Novo conteudo da lista:");			
	}
	*/
	return 0;
}