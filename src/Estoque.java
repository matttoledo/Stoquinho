import java.util.ArrayList;
import java.util.List;

public class Estoque {

	int idProduto =0;
	int idTransacao =0;
	List <Produto> listaProdutos = new ArrayList<Produto>();
	List <Transacao> listaTransacoes = new ArrayList<Transacao>();
	
	public void setProduto(Produto novoProduto) {
		this.listaProdutos.add(novoProduto);
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public int getIdTransacao() {
		return idTransacao;
	}
	public void setIdTransacao(int idTransacao) {
		this.idTransacao = idTransacao;
	}
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	public List<Transacao> getListaTransacoes() {
		return listaTransacoes;
	}
	public void setListaTransacoes(List<Transacao> listaTransacoes) {
		this.listaTransacoes = listaTransacoes;
	}
	
	
	public int retornarQuantidadeItens() {
			return listaProdutos.size();
			
	}
	
	public String listarProdutos() {
		String listaAuxiliar = "";
		for (int i=0;i<listaProdutos.size();i++) {
			listaAuxiliar = listaAuxiliar+listaProdutos.get(i).getIdProduto()+" - "+listaProdutos.get(i).getNomeProduto()+" - "+listaProdutos.get(i).getQuantidadeProduto()+"\n";
			
			}
		System.out.println(listaAuxiliar);
		return listaAuxiliar;
		}
	
	public Produto buscarProduto (String nomeProduto) {
		Produto produtoAuxiliar = null;
		for (int i=0;i<listaProdutos.size();i++) {
			if (listaProdutos.get(i).getNomeProduto().equals(nomeProduto)) {
					produtoAuxiliar = listaProdutos.get(i);					
					return produtoAuxiliar;
				}
			}
		return null;
	}
	
	public void cadastrarProduto (String nomeProduto, int quantidadeProduto) {
		Produto produtoAuxiliar = buscarProduto(nomeProduto);
		Produto novoProduto = new Produto();
		if (produtoAuxiliar == null) {
			idProduto++;
			novoProduto.setNomeProduto(nomeProduto);
			novoProduto.setQuantidadeProduto(quantidadeProduto);
			novoProduto.setIdProduto(idProduto);
			setProduto(novoProduto);
			}
		}
	
	public int verificarProduto (String nomeProduto) {
        for (Produto produto:listaProdutos) {
            if (produto.getNomeProduto().toLowerCase().equals(nomeProduto.toLowerCase())) {
                return listaProdutos.indexOf(produto);
            }
        }
        return -1;
 }

	public void alterarProduto (String antigoProduto, String novoProduto) {
	        int n = verificarProduto(antigoProduto);
	        if (n>=0) {
	            listaProdutos.get(verificarProduto(antigoProduto)).setNomeProduto(novoProduto);
	        }
	        else {
	            System.out.println("Erro: Produto não cadastrado.");
	        }
	    }	
	public void excluirProduto (String produtoVelho) {
		int idProdutoVelho = verificarProduto(produtoVelho);
		if(idProdutoVelho>=0) {
			listaProdutos.remove(idProdutoVelho);
			System.out.println("Produto removido com sucesso!");
			
		}
		else {
			System.out.println("Produto não cadastrado!");
		}
		
	}
	
	public void adicionarEstoque (String aumentoProduto, int NovaQuantidadeProduto) {
        int indiceProduto = verificarProduto(aumentoProduto);
            if (indiceProduto>=0) {
                NovaQuantidadeProduto = listaProdutos.get(indiceProduto).getQuantidadeProduto() + qtdNovaProduto;
                listProduto.get(existirProduto(aumentoProduto)).setQtdProduto(qtdNovaProduto);
                System.out.println("");
                System.out.println("Quantidade adicionada com sucesso!");
                }
            else {
                System.out.println("");
                System.out.println("Ops! O produto atualmente não está cadastrado.");
            }

    }
}

