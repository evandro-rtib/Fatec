/*
	0030481921018 - Evandro Rodrigues Tiburcio
	0030482121012 - Regiane Corrêa de Lara
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
const int TRUE = 1;
const int FALSE = 0;
struct regNo
{
	struct regNo *esq;
	int valor;
	struct regNo *dir;
};
typedef struct regNo TNo;

TNo *AchaPai(TNo *, int);
void ImprimeArvore(TNo *, int, int);
int ContaNos(TNo *);
int MaiorValor(TNo *);
int QuantidadeFolhas(TNo *);
int AlturaArvore(TNo *,int);
int Pesquisa(TNo *,int);
void MontaTextoRaiz(TNo *);
TNo * DestruirArvore(TNo *);
int ArvoreEquivante(TNo *,TNo*);


int main(void)
{
	TNo *raiz = NULL,*raiz1=NULL,*raiz2=NULL, *aux, *pai;

	int numero,arvoreEq;

	while (TRUE)
	{
		printf("\nInforme o valor:\n");
		scanf("%d", &numero);

		if (numero < 0)
			break;

		aux = (TNo *)malloc(sizeof(TNo));
		aux->valor = numero;
		aux->dir = NULL;
		aux->esq = NULL;

		/* Fazendo o encadeamento do novo noh */
		pai = AchaPai(raiz, numero);
		if (pai == NULL)
			raiz = aux;
		else if (numero <= pai->valor)
			pai->esq = aux;
		else
			pai->dir = aux;
	}

	printf("\n\nA arvore possui %d elementos:\n", ContaNos(raiz));
	ImprimeArvore(raiz, 0, 0);
	
	if (MaiorValor(raiz)>-1){
		printf("O maior valor da arvore eh: %i\n",MaiorValor(raiz));
	}

	printf("# # # # # # # # # # # # # # #  EXERCICIO 2\n");
	printf("A quantidade de folhas eh de: %i\n",QuantidadeFolhas(raiz));

	if(AlturaArvore(raiz,0) > -1){
		printf("A altura da arvore eh de: %i\n",AlturaArvore(raiz,0));
	} 

	while (TRUE)
	{
		printf("\nInforme o valor a pesquisar:\n");
		scanf("%d", &numero);

		if (numero < 0)
			break;

		if(Pesquisa(raiz,numero)> -1)
			printf("O valor %i existe na arvore",numero);
		else
			printf("O valor %i nao existe na arvore",numero);
	}

	printf("# # # # # # # # # # # # # # #  EXERCICIO 3\n");
	MontaTextoRaiz(raiz);
	printf("\n");
	
	printf("# # # # # # # # # # # # # # #  EXERCICIO 4\n");
	
	while (TRUE)
	{
		printf("\nInforme o valor para preencher a primeira arvore:\n");
		scanf("%d", &numero);

		if (numero < 0)
			break;

		aux = (TNo *)malloc(sizeof(TNo));
		aux->valor = numero;
		aux->dir = NULL;
		aux->esq = NULL;

		/* Fazendo o encadeamento do novo noh */
		pai = AchaPai(raiz1, numero);
		if (pai == NULL)
			raiz1 = aux;
		else if (numero <= pai->valor)
			pai->esq = aux;
		else
			pai->dir = aux;
	}
	while (TRUE)
	{
		printf("\nInforme o valor para preencher a segunda arvore:\n");
		scanf("%d", &numero);

		if (numero < 0)
			break;

		aux = (TNo *)malloc(sizeof(TNo));
		aux->valor = numero;
		aux->dir = NULL;
		aux->esq = NULL;

		/* Fazendo o encadeamento do novo noh */
		pai = AchaPai(raiz2, numero);
		if (pai == NULL)
			raiz2 = aux;
		else if (numero <= pai->valor)
			pai->esq = aux;
		else
			pai->dir = aux;
	}


	if (ArvoreEquivante(raiz1,raiz2)>-1)
		printf("arvores equivalentes\n");
	else
		printf("arvores diferentes\n");
	

	printf("# # # # # # # # # # # # # # #  EXERCICIO 5\n");
	raiz=DestruirArvore(raiz);
	raiz1=DestruirArvore(raiz1);
	raiz2=DestruirArvore(raiz1);
	printf("Arvore deletada\n");
	ImprimeArvore(raiz, 0, 0);
	ImprimeArvore(raiz1, 0, 0);
	ImprimeArvore(raiz2, 0, 0);
	return 0;

}

TNo *AchaPai(TNo *raizPai, int valorInformado)
{
	if (raizPai == NULL)
		return NULL;
	else if (valorInformado <= raizPai->valor)
		/* n é descendente do lado esquerdo de r */
		if (raizPai->esq == NULL)
			return raizPai;
		else
			return AchaPai(raizPai->esq, valorInformado);
	else
		/* n é descendente do lado direito de r */
		if (raizPai->dir == NULL)
			return raizPai;
		else
			return AchaPai(raizPai->dir, valorInformado);
}

int ContaNos(TNo *raiz)
{
	if (raiz != NULL)
		return 1 + ContaNos(raiz->esq) + ContaNos(raiz->dir);
	return 0;
}

void ImprimeArvore(TNo *raiz, int nivel, int tipoOrdem)
{
	char imprimiNivel[100]="";

	if (nivel>0)
	{
		for(int i=0;i < nivel; i++){
			strcat(imprimiNivel,"  ");
		}
		strcat(imprimiNivel,"--");
	}
	if (raiz!=NULL)
		switch (tipoOrdem)
		{
			case 1:
				printf("%s%i\n", imprimiNivel,raiz->valor);
				ImprimeArvore(raiz->esq, nivel + 1, 1);
				ImprimeArvore(raiz->dir, nivel + 1, 1);
				break;
			case -1:
				printf("%s%i\n", imprimiNivel,raiz->valor);
				ImprimeArvore(raiz->esq,nivel+1,-1);
				ImprimeArvore(raiz->dir,nivel+1,-1);
				break;

			
			default :
				printf("%s%i\n", imprimiNivel,raiz->valor);
				ImprimeArvore(raiz->esq, nivel + 1, 0);
				ImprimeArvore(raiz->dir, nivel + 1, 0);
		}
		else
			printf("A arvore esta vazia\n");
}

int MaiorValor(TNo *raiz){
	if (raiz != NULL)
	{
		if (raiz->dir != NULL )
			return MaiorValor(raiz->dir);
		return raiz->valor;
	}
	return -1;
}
int QuantidadeFolhas(TNo *raiz){
	int qtd =0;
	if (raiz != NULL)
	{
		if (raiz->esq==NULL && raiz->dir==NULL){
			qtd+=1;
		}
		qtd += QuantidadeFolhas(raiz->esq);
		qtd += QuantidadeFolhas(raiz->dir);
	}
	return qtd;
}

int AlturaArvore(TNo *raiz,int altura){
	int alt,altE=0,altD=0;
	if (raiz != NULL)
	{
		if (raiz->esq!=NULL || raiz->dir!=NULL)
		{
			altE=AlturaArvore(raiz->esq,altura+1);
			altD=AlturaArvore(raiz->dir,altura+1);
		}
		else
			return altura;


		if (altE>altD)
			return altE;
		else
			return altD;
	}
	else
		return -1;
}

int Pesquisa(TNo *raiz,int pesquisa){
	if (raiz!=NULL)
	{
		if (raiz->valor == pesquisa)
			return pesquisa;
		
		return Pesquisa(raiz->esq,pesquisa) + Pesquisa(raiz->dir,pesquisa);
	}
	return -1;
}

void MontaTextoRaiz(TNo *raiz){
	if (raiz == NULL)
		printf("< >");
	else
	{
		MontaTextoRaiz(raiz->esq);
		printf("< ");
		printf(" >");
		MontaTextoRaiz(raiz->dir);
	}
}
TNo * DestruirArvore(TNo *raiz){
	if(raiz!=NULL)
	{
		if (raiz->dir != NULL)
			DestruirArvore(raiz->dir);
		if (raiz->esq != NULL)
			DestruirArvore(raiz->esq);
		free(raiz);
	}
	else
		return NULL;
}

int ArvoreEquivante(TNo *raiz1,TNo *raiz2)
{
	if (raiz1==NULL && raiz2 == NULL)
		return TRUE;
	else if (raiz1 != NULL && raiz2 != NULL)
		if (
				raiz1->valor == raiz2->valor &&
				ArvoreEquivante(raiz1->esq,raiz2->esq)==TRUE &&
				ArvoreEquivante(raiz1->dir,raiz2->dir)==TRUE
		)
			return TRUE;
		else 
			return -1;
}