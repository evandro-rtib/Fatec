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
#include "ex1_Cabec_Enc.h"

void InicializaLista(TLCidades *listaCidades)
{	/* inicializa o conjunto de descritores da lista de cidades*/

	listaCidades->inicio = NULL;
	listaCidades->final = NULL;
}

int IncluiItem(TLCidades *listaCidades, char *nome, int populacao,
 				float area, float pib, float idh)
{
	TCidades *aux;

	/* criando uma variável struct TCidades dinamicamente */
	aux = (TCidades *) malloc(sizeof(TCidades));

	if (aux==NULL)
		return FALSE;

	strcpy(aux->nome,nome);
	aux->populacao=populacao;
	aux->area=area;
	aux->pib=pib;
	aux->idh = idh;
	aux->prox=NULL;

	if (listaCidades->inicio == NULL)
	{
		aux->ant=NULL;
		listaCidades->inicio = aux;
		listaCidades->final = aux;
	}
	else
	{
		aux->ant=listaCidades->final;
		listaCidades->final->prox=aux;
		listaCidades->final=aux;
	}
	return TRUE;
}

void ImprimeLista(TLCidades *listaCidades, char *cabec, int invertido)
{	/* imprimindo os valores da lista */
	TCidades *aux;

	if (listaCidades->final == NULL)
		puts("Lista vazia");
	else
	{	
		printf("\n\n\n%s\n", cabec);
		printf("- - - - - - - - - - - - - - - - - - - - - - -\n");
		if (invertido == TRUE)
		{
			aux = listaCidades->final;
			while (aux!=NULL)
			{	
				printf("Nome: %s\n", aux->nome);
				printf("Populacao: %i\n", aux->populacao);
				printf("Area: %.2f [km2]\n", aux->area);
				printf("PIB: %.2f\n", aux->pib);
				printf("IDH: %.2f\n", aux->idh);
				printf("- - - - - - - - - - - - - - - - - - - - - - -\n");
				aux = aux->ant;
			}
		}
		else
		{
			aux = listaCidades->inicio;
			while (aux != NULL)
			{	
				printf("Nome: %s\n", aux->nome);
				printf("Populacao: %i\n", aux->populacao);
				printf("Area: %.2f [km2]\n", aux->area);
				printf("PIB: %.2f\n", aux->pib);
				printf("IDH: %.2f\n", aux->idh);
				printf("- - - - - - - - - - - - - - - - - - - - - - -\n");
				aux = aux->prox;
			}
		}
		
	}
}

int ExcluiItem(TLCidades *listaCidades, float idh)
{	
	int controle=FALSE;

	/* Procurando o item a ser excluido */
	TCidades *aux, *remove;
	aux = listaCidades->inicio;
	while (TRUE)
	{
		if (aux->idh >= idh)
		{
			remove = aux;
			/*quando for o primeiro registro da lista*/
			if(aux->ant == NULL)
			{
				/*quando não for o ultimo registro da lista*/
				if (aux->prox != NULL)
				{
					listaCidades->inicio=aux->prox;
					aux->prox->ant=aux->ant;
					aux=listaCidades->inicio;
				}
				else
				{
					listaCidades->inicio=NULL;
					listaCidades->final=NULL;
					aux=listaCidades->inicio;
				}
			}
			/*quando não for o primeiro registro da lista*/
			else
			{
				aux->ant->prox=aux->prox;
				/*quando for o ultimo registro da lista*/
				if (aux->prox == NULL)
				{
					listaCidades->final=aux->ant;
					aux=listaCidades->final;
					aux=NULL;
				}
				else
				{
					aux->prox->ant=aux->ant;
					aux=aux->ant;
				}
			}
			controle=TRUE;
			free(remove);
		}
		else
		{
			aux=aux->prox;
		}
		if (aux==NULL)
			break;
	}
	return controle;
}
