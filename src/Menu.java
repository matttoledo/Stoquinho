import java.util.Scanner;

public class Menu {
	public static int op=0;
public static void main (String[] args) {
	
	Estoque stoque = new Estoque();
	
	while(op!=9) {
        System.out.println("|------------MENU-----------------------|");
        System.out.println("|1: Cadastrar produto			|");
        System.out.println("|2: Alterar produto			|");
        System.out.println("|3: Excluir produto			|");
        System.out.println("|4: Acrescentar estoque			|");
        System.out.println("|5: Remover quantidade de estoque	|");
        System.out.println("|6: Listar estoque			|");
        System.out.println("|7: Fluxo de estoque			|");
        System.out.println("|8: Histórico				|");
        System.out.println("|9: Encerrar atividade			|");
        System.out.println("|Insira a opção desejada:		|");
        System.out.println("|---------------------------------------|");
        Scanner sc1 = new Scanner(System.in);
        op = sc1.nextInt();
        
        switch (op) {
        case 1:
        	System.out.println("Digite o nome do produto que deseja cadastrar:");
        	String nomeProduto = sc1.next();
        	stoque.cadastrarProduto(nomeProduto,0);
        	break;
        	
        	
        case 2:
        	System.out.println("Digite o nome do produto que deseja alterar:");
        	String nomeProduto2 = sc1.next();
        	stoque.buscarProduto(nomeProduto2);
        	if (!stoque.buscarProduto(nomeProduto2).equals(null)) {
        		System.out.println("Digite o novo nome para renomear o produto:");
        		String nomeProduto3=sc1.next();
        		stoque.alterarProduto(nomeProduto2, nomeProduto3);
        		System.out.println("Produto alterado com sucesso!");
        		}
        	break;
        case 3:
        	System.out.println("Digite o nome do produto que deseja remover:");
        	String nomeProduto4 = sc1.next();
        	stoque.excluirProduto(nomeProduto4);
        	break;
        
        case 4:
        	System.out.println("Digite o nome do produto que deseja acrescentar o estoque:");
        	String nomeProduto5=sc1.next();
        	System.out.println("Digite a quantidade que deseja acrescentar:");
        	int quantidadeProduto = sc1.nextInt();
        	stoque.aumentarEstoque(nomeProduto5, quantidadeProduto);
        	break;
        	
        	
  
        case 5:
        	System.out.println("Digite o nome do produto que deseja diminuir o estoque:");
        	String nomeProduto6=sc1.next();
        	System.out.println("Digite a quantidade que deseja acrescentar:");
        	int quantidadeProduto2 = sc1.nextInt();
        	stoque.diminuirEstoque(nomeProduto6, quantidadeProduto2);
        	break;
        	
        case 6:
        	stoque.listarProdutos();
        	break; 	
        
        case 7:
        	stoque.listarTransacoes();
        	break;
        
        case 8:
        	System.out.println("Digite o nome do produto para mostrar o histórico do mesmo:");
        	String nomeProduto7=sc1.next();
        	stoque.listarHistorico(nomeProduto7);
        	break;
        	
	}
	}
	
	
        	
        	
        
	
	
	
}

public static void clear() { System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); }
	
}


