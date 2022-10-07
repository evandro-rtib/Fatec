/*
	Versao inicial do programa da lista linear de números
	implementada por ENCADEAMENTO.
	Faz a exclusão de elementos da lista. Utiliza subrotina para 
	impressao.
	Utiliza descritor estruturado e subrotinas.
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "app_Cabec_Cont.h"

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

void ImprimeLista(TLCidades *listaCidades, char *cabec)
{	/* imprimindo os valores da lista */
	int cont;

	if (listaCidades->final == 0)
		puts("Lista vazia");
	else
	{	
		printf("\n\n\n%s\n", cabec);
		printf("- - - - - - - - - - - - - - - - - - - - - - -\n");
		cont = 0;
		while (cont != listaCidades->final)
		{	
			printf("Indice: %i\n",cont);
			printf("Nome: %s\n", listaCidades->cidades[cont].nome);
			printf("Populacao: %i\n", listaCidades->cidades[cont].populacao);
			printf("Area: %.2f\n", listaCidades->cidades[cont].area);
			printf("PIB: %.2f\n", listaCidades->cidades[cont].pib);
			printf("IDH: %.2f\n", listaCidades->cidades[cont].idh);
			printf("- - - - - - - - - - - - - - - - - - - - - - -\n");
			cont = cont + 1;
		}
	}
}
void ImprimeListaInverso(TLCidades *listaCidades, char *cabec)
{	/* imprimindo os valores da lista */
	int cont;

	if (listaCidades->final == 0)
		puts("Lista vazia");
	else
	{
		printf("\n\n\n%s\n", cabec);
		printf("- - - - - - - - - - - - - - - - - - - - - - -\n");
		cont = listaCidades->final-1;
		while (cont != listaCidades->inicio-1)
		{	
			printf("Indice: %i\n",cont);
			printf("Nome: %s\n", listaCidades->cidades[cont].nome);
			printf("Populacao: %i\n", listaCidades->cidades[cont].populacao);
			printf("Area: %.2f\n", listaCidades->cidades[cont].area);
			printf("PIB: %.2f\n", listaCidades->cidades[cont].pib);
			printf("IDH: %.2f\n", listaCidades->cidades[cont].idh);
			printf("- - - - - - - - - - - - - - - - - - - - - - -\n");
			
			cont = cont - 1;
		}
	}
}