/*
	Arquivo de INTERFACE para a implementação do TDA de Lista de número inteiro
*/
#define TRUE	1
#define FALSE	0

struct regLista
{	int valor;
	struct regLista *prox;
};
typedef struct regLista TItem;

typedef struct
{	TItem *inicio, *final;
	int qtde, soma;
} TLista;


/* Prototipos das funcoes */
void ImprimeLista(TLista *, char *);
void InicializaLista(TLista *);
int IncluiItem(TLista *, int);
int ExcluiItem(TLista *, int);