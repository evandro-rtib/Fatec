/*
	Arquivo de INTERFACE para a implementação do TDA de Lista de número inteiro
*/

#define TRUE	1
#define FALSE	0
#define MAXIMO	50
typedef int TItem;

typedef struct
{	int inicio, final, qtde, soma;
	TItem lista[MAXIMO];	
} TLista;

/* Prototipos das funcoes */
void ImprimeLista(TLista *, char *);
void InicializaLista(TLista *);
int IncluiItem(TLista *, int);
int ExcluiItem(TLista *, int);