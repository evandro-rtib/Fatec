/*
0030481921018 - Evandro Rodrigues Tiburcio
0030482121012 - Regiane Corr�a de Lara
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TRUE	1
#define FALSE	0
#define CHAR_EXPRESSAO	31


struct delimitadores
{
	char delimitador;
	struct delimitadores *prox,*ant;
};
typedef struct delimitadores TDelimitadores;

//# # # # # # # # CRIAR DESCRITORES
typedef struct
{
	TDelimitadores *inicio, *final;
} TLDelimitadores;

int verificaExpressao(TLDelimitadores *, char *);
void InicializaLista(TLDelimitadores *);
int empilharDelimitadores(TLDelimitadores *, char );
int desempilharDelimitadores(TLDelimitadores *,char );

int main(){
    TLDelimitadores lista;
   
	char expressao[CHAR_EXPRESSAO];
    InicializaLista(&lista);
	printf("Digite a expressao:\n");
	scanf("%s", &expressao);
	if(verificaExpressao(&lista, expressao) == TRUE)
	{
		printf("Expressao: %s e valida\n", expressao);
	}
	else
	{
		printf("Expressao: %s e invalida\n", expressao);
	}
}

void InicializaLista(TLDelimitadores *lista)
{
    lista->inicio=NULL;
    lista->final=NULL;
}

int verificaExpressao(TLDelimitadores *lista,char *expressao)
{
    int cont=0,controle=FALSE;
    while (cont < strlen(expressao))
    {
        if( expressao[cont] == '(' || 
            expressao[cont] == '[' ||
            expressao[cont] == '{')
        {
            empilharDelimitadores(lista, expressao[cont]);
        }
        else
        if( expressao[cont] == ')' || 
            expressao[cont] == ']' ||
            expressao[cont] == '}')
        {
            if (desempilharDelimitadores(lista, expressao[cont])==TRUE)
                controle=TRUE;
            else
                return FALSE;
        }

        cont++;
    }
    if (lista->inicio==NULL)
        return TRUE;
    else
        return FALSE;

}
int empilharDelimitadores(TLDelimitadores *lista, char delimitador){
    TDelimitadores *aux;
	aux = (TDelimitadores *) malloc(sizeof(TDelimitadores));

	if (aux==NULL)
	{
		printf("Erro ao alocar na memoria\n");
        return FALSE;
	}
	else
	{
		aux->delimitador=delimitador;
		aux->prox=NULL;
        if (lista->inicio == NULL)
        {
            lista->inicio=aux;
            lista->final=aux;
            aux->ant=NULL;
        }
        else
        {
            aux->ant=lista->final;
            lista->final->prox=aux;
            lista->final=aux;
        }
        return TRUE;
	}
    
}
int desempilharDelimitadores(TLDelimitadores *lista, char delimitador){
    TDelimitadores *aux;
    int controle=FALSE;
	
	if (lista->inicio==NULL)
	{
        return FALSE;
	}
	else
	{     
        if (lista->final->delimitador == '(' && delimitador == ')')
        {
           controle=TRUE;
        }
        else if (lista->final->delimitador == '[' && delimitador == ']')
        {
            controle=TRUE;
        }
        else if (lista->final->delimitador == '{' && delimitador == '}')
        {
            controle=TRUE;
        }
        else{}
        if (controle == TRUE)
        {
            aux = lista->final;
            
            lista->final=aux->ant;
            if (lista->final==NULL)
                lista->inicio=NULL;
            else
                lista->final->prox=NULL;
            free(aux);
            return TRUE;
        }
		return FALSE;
	}
    
}