#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define TRUE 1
#define FALSE 0
#define MAXIMO 30

struct registroLista
{	
	char palavra[MAXIMO];
	struct registroLista *ant,*prox;
};
typedef struct registroLista TLista;

typedef struct
{	
	TLista *inicio,*final;
} TRLista;
	
void InicializaLista(TRLista *);
int IncluiItem(TRLista *, char *);
void ImprimeLista(TRLista *,char *);
void ExcluiItem(TRLista *,TRLista *);
void UniaoLista(TRLista *,TRLista *,TRLista *);
int pesquisaLista(TRLista *,char *);

int main(void)
{

	TRLista conjunto1,conjunto2,conjuntoUniao;
	char palavra[MAXIMO];
	
	InicializaLista(&conjunto1);
	InicializaLista(&conjunto2);
	InicializaLista(&conjuntoUniao);

	while (TRUE)
	{	
		printf("Informe a palavra para conjunto 1:\n");
		scanf("%s", &palavra);
		if (strcmp(palavra,"*") == FALSE)
			break;
		if (IncluiItem(&conjunto1, palavra) == FALSE)
		{	
			puts("Memoria insuficiente para esta operacao\n");
			return 2;
		}
	}
	printf("\n- - - - - - - - - - - - - - - - - - - -\n");

	while (TRUE)
	{	
		printf("Informe a palavra para conjunto 2:\n");
		scanf("%s", &palavra);
		if (strcmp(palavra,"*") == FALSE)
			break;
		if (IncluiItem(&conjunto2, palavra) == FALSE)
		{	
			puts("Memoria insuficiente para esta operacao\n");
			return 2;
		}
	}
	ImprimeLista(&conjunto1,"Conjunto 1");
	ImprimeLista(&conjunto2,"Conjunto 2");
	UniaoLista(&conjunto1,&conjunto2,&conjuntoUniao);
	ImprimeLista(&conjuntoUniao,"Uniao dos Conjuntos");
	ExcluiItem(&conjunto1,&conjunto2);

	return 0;
}

void InicializaLista(TRLista *conjunto)
{
	conjunto->inicio=NULL;
	conjunto->final=NULL;
	
}

int IncluiItem(TRLista *conjunto, char *palavra)
{
	TLista *aux;
	aux = (TLista *) malloc(sizeof(TLista));

	if (aux==NULL)
		return FALSE;
	strcpy(aux->palavra,palavra);
	aux->prox=NULL;
	
	if (conjunto->inicio == NULL)
	{
		aux->ant = NULL;
		conjunto->inicio = aux;
		conjunto->final = aux;
	}
	else
	{
		aux->ant=conjunto->final;
		conjunto->final->prox=aux;
		conjunto->final=aux;
	}
	return TRUE;
}
void ImprimeLista(TRLista *conjunto,char *cabec)
{
	TLista *aux;
	aux = conjunto->inicio;
	int controle;
	if (aux==NULL)
	{
		printf("%s nao podem ser vazia", cabec);
	}
	else
	{
		printf("%s:\n",cabec);
		controle = TRUE;
		while (aux != NULL)
		{
			if (controle == TRUE)
			{
				printf("{%s",aux->palavra);
				controle = FALSE;
			}
			else
				printf(", %s",aux->palavra);
			aux = aux->prox;
		}
		printf("}");
		printf("\n");
	}
}

void UniaoLista(TRLista *conjunto1,TRLista *conjunto2,TRLista *conjuntoUniao)
{
	TLista *aux_1,*aux_2,*aux_3;
	aux_1 = conjunto1->inicio;
	aux_2 = conjunto2->inicio;
	if (aux_1==NULL || aux_2==NULL)
	{
		printf("Conjunto 1 ou Conjunto 2 não podem ser  vazios");
	}
	else
		while (aux_1!=NULL)
		{
			if (pesquisaLista(conjuntoUniao,aux_1->palavra)==0)
				IncluiItem(conjuntoUniao,aux_1->palavra);
			aux_1= aux_1->prox;
		}
		while (aux_2!=NULL)
		{
			if (pesquisaLista(conjuntoUniao,aux_2->palavra)==0)
				IncluiItem(conjuntoUniao,aux_2->palavra);
			aux_2= aux_2->prox;
		}
}

int pesquisaLista(TRLista *conjunto, char *palavra)
{
	TLista *aux;
	aux = conjunto->inicio;
	if (aux == NULL)
		return FALSE;
	while (aux != NULL)
	{
		if (strcmp(aux->palavra,palavra)==0)
			return TRUE;
		aux = aux->prox;	
	}
	return FALSE;
}
void ExcluiItem(TRLista *conjunto1,TRLista *conjunto2)
{
	TLista *aux_1,*aux_2, *aux_2_remove;
	aux_1 = conjunto1->inicio;
	aux_2 = conjunto2->inicio;
	aux_2_remove = conjunto2->inicio;
	if (aux_1==NULL || aux_2==NULL)
	{
		printf("Conjunto 1 ou conjunto 2 nao podem ser vazias");
	}
	else
	{
		while (aux_1!=NULL)
		{
			aux_2 = conjunto2->inicio;
			while (aux_2!=NULL)
			{
				if (aux_2->palavra == aux_1->palavra)
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