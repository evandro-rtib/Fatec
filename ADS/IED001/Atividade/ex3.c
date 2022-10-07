#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

struct registroLista
{	
	int valor;
	struct registroLista *ant,*prox;
};
typedef struct registroLista TLista;

typedef struct
{	
	TLista *inicio,*final;
} TRLista;
	
void InicializaLista(TRLista *);
int IncluiItem(TRLista *, int);
void ImprimeLista(TRLista *,TRLista *);
void ExcluiItem(TRLista *,TRLista *);

int main(void)
{

	TRLista lista1,lista2;
	int valor;
	
	InicializaLista(&lista1);
	InicializaLista(&lista2);

	while (TRUE)
	{	
		printf("Informe o valor para lista 1:\n");
		scanf("%i", &valor);
		if (valor==-999)
			break;
		if (IncluiItem(&lista1, valor) == FALSE)
		{	
			puts("Memoria insuficiente para esta operacao\n");
			return 2;
		}
	}
	printf("\n- - - - - - - - - - - - - - - - - - - -\n");

	while (TRUE)
	{	
		printf("Informe o valor para lista 2:\n");
		scanf("%i", &valor);
		if (valor==-999)
			break;
		if (IncluiItem(&lista2, valor) == FALSE)
		{	
			puts("Memoria insuficiente para esta operacao\n");
			return 2;
		}
	}
	ImprimeLista(&lista1,&lista2);
	ExcluiItem(&lista1,&lista2);
	ImprimeLista(&lista1,&lista2);

	return 0;
}

void InicializaLista(TRLista *lista)
{
	lista->inicio=NULL;
	lista->final=NULL;
	
}

int IncluiItem(TRLista *lista, int valor)
{
	TLista *aux;
	aux = (TLista *) malloc(sizeof(TLista));

	if (aux==NULL)
		return FALSE;
	aux->valor=valor;
	aux->prox=NULL;
	
	if (lista->inicio == NULL)
	{
		aux->ant = NULL;
		lista->inicio = aux;
		lista->final = aux;
	}
	else
	{
		aux->ant=lista->final;
		lista->final->prox=aux;
		lista->final=aux;
	}
	return TRUE;
}
void ImprimeLista(TRLista *lista1, TRLista *lista2)
{
	TLista *aux_1,*aux_2;
	aux_1 = lista1->inicio;
	aux_2 = lista2->inicio;
	int controle;
	if (aux_1==NULL || aux_2==NULL)
	{
		printf("lista 1 ou lista 2 nao podem ser vazias");
	}
	else
	{
		printf("Lista 1: ");
		controle = TRUE;
		while (aux_1 != NULL)
		{
			if (controle == TRUE)
			{
				printf("%i",aux_1->valor);
				controle = FALSE;
			}
			else
				printf(", %i",aux_1->valor);
			aux_1 = aux_1->prox;
		}
		printf("\n");
		controle = TRUE;
		printf("Lista 2: ");
		while (aux_2 != NULL)
		{
			if (controle == TRUE)
			{
				printf("%i",aux_2->valor);
				controle = FALSE;
			}
			else
				printf(", %i",aux_2->valor);
			aux_2 = aux_2->prox;
		}
		printf("\n");
	}
}

void ExcluiItem(TRLista *lista1,TRLista *lista2)
{
	TLista *aux_1,*aux_2, *aux_2_remove;
	aux_1 = lista1->inicio;
	aux_2 = lista2->inicio;
	aux_2_remove = lista2->inicio;
	if (aux_1==NULL || aux_2==NULL)
	{
		printf("lista 1 ou lista 2 nao podem ser vazias");
	}
	else
	{
		while (aux_1!=NULL)
		{
			aux_2 = lista2->inicio;
			while (aux_2!=NULL)
			{
				if (aux_2->valor == aux_1->valor)
				{
					aux_2_remove = aux_2;
					aux_2->ant->prox=aux_2->prox;
					if (aux_2->prox!=NULL)
						aux_2->prox->ant = aux_2->ant;
					aux_2=aux_2->ant;
					free(aux_2_remove);
				}
				aux_2=aux_2->prox;
			}
			aux_1=aux_1->prox;
		}
	}
}