/*
0030481921018 - Evandro Rodrigues Tiburcio
0030482121012 - Regiane Corrêa de Lara
*/
#define TRUE	1
#define FALSE	0
#define CHAR_CIDADE	31
//# # # # # # # # CRIAR A ESTRUTURA DA LISTA
struct dadosCidade
{	
	char nome[CHAR_CIDADE];
	int populacao;
	float area,pib,idh;
	struct dadosCidade *ant,*prox;
};
typedef struct dadosCidade TCidades;
//# # # # # # # # # # # # # # # # # # # # # # # # # # # # 

//# # # # # # # # CRIAR DESCRITORES
typedef struct
{
	TCidades *inicio,*final;
} TLCidades;



/* Prototipos das funcoes */
void InicializaLista(TLCidades *);
int IncluiItem(TLCidades *, char *, int populacao,
 				float area, float pib, float idh);
void ImprimeLista(TLCidades *, char *,int);
int ExcluiItem(TLCidades *, float);
