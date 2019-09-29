package aplicacao;
import dados.Jogo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Cadastro extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        Integer codigo=Integer.parseInt(request.getParameter("Codigo"));
        String titulo=request.getParameter("Titulo");
        String genero=request.getParameter("Genero");
        Integer ano=Integer.parseInt(request.getParameter("Ano"));
        Double preco=Double.parseDouble(request.getParameter("Preco"));
        String classificacaoEtaria=request.getParameter("Classificacao Etaria");
        String requisitosMinimos=request.getParameter("Requisitos Minimos");
        Jogo jogo=new Jogo(codigo,titulo,genero,ano,preco,classificacaoEtaria,requisitosMinimos);
        request.setAttribute("Jogo",jogo);
        RequestDispatcher dispacheSolicitacao = request.getRequestDispatcher("Lista");
        dispacheSolicitacao.forward(request,response);
    }
}