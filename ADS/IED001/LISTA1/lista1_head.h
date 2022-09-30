#define TRUE	1
#define FALSE	0

//# # # # # # # # CRIAR A ESTRUTURA DA LISTA
struct dadosCidade
{	
	char [31] nome;
	int populacao;
	float area,pib,idh;
	struct dadosCidade *ant,*prox;
};
typedef struct dadosCidade TCidades;
//# # # # # # # # # # # # # # # # # # # # # # # # # # # # 

//# # # # # # # # CRIAR DESCRITORES
/*
FORMA AMPLIADA 
struct descList
{
	struct dadosCidade *inicio,*final;
}

typedef struct descList descCidades;

*/

typedef struct
{
	TCidades *inicio,*final;
} descCidades;



/* Prototipos das funcoes */
