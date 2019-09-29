package aplicacao;
import dados.Jogo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Lista extends HttpServlet{
    ArrayList<Jogo> jogos = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String html="<html><head><title>Dados Fornecidos</title></head><body>"
                + "<h3>Informacoes dos Jogos Cadastrados</h3><br>";
        for(Jogo j:jogos){
            html+="<strong>Codigo: </strong>"+j.getCodigo()+"<br>"
                + "<strong>Titulo: </strong>"+j.getTitulo()+"<br>"
                + "<strong>Genero: </strong>"+j.getGenero()+"<br>"
                + "<strong>Ano: </strong>"+j.getAno()+"<br>"
                + "<strong>Preco: </strong>R$ "+j.getPreco()+"<br>"
                + "<strong>Classificacao Etaria: </strong>"+j.getClassificacaoEtaria()+"<br>"
                + "<strong>Requisitos Minimos: </strong>"+j.getRequisitosMinimos()+"<br><br>";
        }
        html+="<strong><a href=\"index.html\">Retonar a Pagina de Cadastro</a></strong></body></html>";
        PrintWriter saida=response.getWriter();
        saida.println(html);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        Jogo jogo=(Jogo)request.getAttribute("Jogo");
        jogos.add(jogo);
        String html="<html><head><title>Cadastro Realizado</title></head>"
                + "<body><h3>O jogo informado foi cadastrado com sucesso</h3><br>"
                + "<strong><a href=\"index.html\">Retonar a Pagina de Cadastro</a></strong></body></html>";
        PrintWriter saida=response.getWriter();
        saida.println(html);
    }
}