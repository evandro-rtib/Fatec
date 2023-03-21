/*
0030481921018 - Evandro Rodrigues Tiburcio
0030482121012 - Regiane Corrêa de Lara
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "ex2_Cabec_Cont.h"

void InicializaLista(TLCidades *listaCidades)
{	/* inicializa o conjunto de descritores da lista de cidades*/

	listaCidades->inicio = 0;
	listaCidades->final = 0;
}

int IncluiItem(TLCidades *listaCidades, char *nome, int populacao,
 				float area, float pib, float idh)
{
	TCidades cidade;
	strcpy(cidade.nome,nome);
	cidade.populacao=populacao;
	cidade.area=area;
	cidade.pib=pib;
	cidade.idh = idh;
	listaCidades->cidades[listaCidades->final] = cidade;

	listaCidades->final = listaCidades->final+1;
	return TRUE;
}

void ImprimeLista(TLCidades *listaCidades, char *cabec, int invertido)
{	/* imprimindo os valores da lista */
	int cont;

	if (listaCidades->final == 0)
		puts("Lista vazia");
	else
	{	
		printf("\n\n\n%s\n", cabec);
		printf("- - - - - - - - - - - - - - - - - - - - - - -\n");
		if (invertido == TRUE)
		{
			cont = listaCidades->final-1;
			while (cont != listaCidades->inicio-1)
			{	
				printf("Indice: %i\n",cont);
				printf("Nome: %s\n", listaCidades->cidades[cont].nome);
				printf("Populacao: %i\n", listaCidades->cidades[cont].populacao);
				printf("Area: %.2f [km2]\n", listaCidades->cidades[cont].area);
				printf("PIB: %.2f\n", listaCidades->cidades[cont].pib);
				printf("IDH: %.2f\n", listaCidades->cidades[cont].idh);
				printf("- - - - - - - - - - - - - - - - - - - - - - -\n");
				
				cont = cont - 1;
			}
		}
		else
		{
			cont = 0;
			while (cont != listaCidades->final)
			{	
				printf("Indice: %i\n",cont);
				printf("Nome: %s\n", listaCidades->cidades[cont].nome);
				printf("Populacao: %i\n", listaCidades->cidades[cont].populacao);
				printf("Area: %.2f [km2]\n", listaCidades->cidades[cont].area);
				printf("PIB: %.2f\n", listaCidades->cidades[cont].pib);
				printf("IDH: %.2f\n", listaCidades->cidades[cont].idh);
				printf("- - - - - - - - - - - - - - - - - - - - - - -\n");
				cont = cont + 1;
			}
		}
		
	}
}

int ExcluiItem(TLCidades *listaCidades, float idh)
{	
	int cont_1, cont_2, controle=FALSE;

	/* Procurando o item a ser excluido */
	cont_1 = 0;
	while (cont_1 < listaCidades->final)
	{
		if (listaCidades->cidades[cont_1].idh >= idh)
		{			
			/* trazendo os elementos posteriores ao eliminado
				para o elemento anterior */
			cont_2=cont_1;
			while (cont_2 < listaCidades->final)
			{	listaCidades->cidades[cont_2] = listaCidades->cidades[cont_2 + 1];
				cont_2 = cont_2 + 1;
			}
			listaCidades->final = listaCidades->final -1;
			controle=TRUE;
		}
		else
		{
			cont_1=cont_1 + 1;
		}
	}
	if (controle == TRUE)
		return TRUE;

	return FALSE;
}
