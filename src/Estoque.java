import java.util.ArrayList;
import java.util.List;

public class Estoque {

	int idProduto =0;
	int idTransacao =0;
	List <Produto> listaProdutos = new ArrayList<Produto>();
	List <Transacao> listaTransacoes = new ArrayList<Transacao>();
	
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
			listaAuxiliar = listaAuxiliar+listaProdutos.get(i).getIdProduto()+" - "+listaProdutos.get(i).getNomeProduto()+" - "+listaProdutos.get(i).getQuantidadeProduto();
			}
		return listaAuxiliar;
		}
	
	public Produto buscarProduto (String nomeProduto) {
		Produto produtoAuxiliar = null;
		for (int i=0;i<listaProdutos.size();i++) {
			if (nomeProduto==listaProdutos.get(i).getNomeProduto()) {
					produtoAuxiliar = listaProdutos.get(i);
					}
			}
		if (produtoAuxiliar == null) {
			System.out.println("Produto não encontrado! :(");
			}
		
	return produtoAuxiliar;
	}
	
	public void cadastrarProduto (String nomeProduto, int quantidadeProduto) {
		Produto produtoAuxiliar = buscarProduto(nomeProduto);
		if (produtoAuxiliar == null) {
			
		}
		
		
	}
	

}
