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
		printf("Informe area [km2] da cidade:\n");
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

	ImprimeLista(&listaCidades, "Conteudo da lista:",FALSE);
	ImprimeLista(&listaCidades, "Conteudo da lista invertido:",TRUE);
		
	while (TRUE)
	{
		printf("Informe o valor de IDH: ");
		scanf("%d", &idh);
	
		if (idh < 0)
			break;
		
		if (ExcluiItem(&listaCidades, idh) == FALSE)
			puts("Valor de IDH nao encontrado");
		else
		{
			ImprimeLista(&listaCidades, "Novo conteudo da lista:",FALSE);			
			ImprimeLista(&listaCidades, "Novo conteudo da lista invertido:",TRUE);
		}
	}
	
	return 0;
}