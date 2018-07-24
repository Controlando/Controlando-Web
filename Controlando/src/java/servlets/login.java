/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bancoDados.Adm;
import bancoDados.ConexaoBancoDados;
import bancoDados.Contador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.C_Adm;
import model.C_Contador;

/**
 *
 * @author FerreiraDaniel
 */
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String emailEmpresa, emailIndividual, password;
        PrintWriter out = null;
        HttpSession session = request.getSession(); 
        
        emailEmpresa = request.getParameter("txtEmailEmp");
        emailIndividual= request.getParameter("txtEmailInd");
        password = request.getParameter("txtSenha");
        
        
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        
        try {
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<body style='background-color: #E6E6FA'>");
            
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Contador cont = new Contador();
            Adm administrador = new Adm();
            /*C_Adm C_administrador = new C_Adm(emailIndividual, password, emailEmpresa, 
            C_Contador Adm = new C_Contador(0, "", "", emailIndividual, "");
            */
            C_Contador Cont = new C_Contador("", password, emailIndividual, 0, 0, 0, 1);
            if (conexao.abrirConexao()) {
                
                int id;
                boolean contadorBool = false, administradorBool = false;
                
                cont.configurarConexao(conexao.obterConexao());
                //encontrar contador ou admin
                /*contadorBool = cont.localizarContador(emailIndividual, password);
                administradorBool = administrador.lerRegistro(emailIndividual, password, emailEmpresa);
                */
                administradorBool = cont.localizarAdmin(emailIndividual, password, emailEmpresa);
                System.err.println("ADMIN: "+ administradorBool);
                id = cont.localizarContadorId(emailIndividual, password);
                
                //carrega o dado da sessao
                session.setAttribute("password", password);
                session.setAttribute("emailIndividual", emailIndividual);
                session.setAttribute("administrador", administradorBool);     
                session.setAttribute("emailEmpresa", emailEmpresa); 
                session.setAttribute("idPessoa", id); 
                 
                if ((id > 0) || (administradorBool == true) ) {
                    response.sendRedirect("telaPrincipal.jsp");
                } else {
                    System.err.println("ASASA  "+emailIndividual+ "  "+password);
                    response.sendRedirect("telaInicial.html");
                }
                conexao.fecharConexao();
            } else {
                out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
                out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
                out.println("<h2 style='color: #8A2BE2'>Não foi possível estabelecer conexão com o banco de dados!</h2>");
                out.println("</fieldset");
            }
        } catch (Exception erro) {
           erro.printStackTrace();
            out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
            out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
            out.println("<h2 style='color: #8A2BE2'>Erro do sistema: Login!</h2>");
            out.println("</fieldset");
        }

        out.println("</body>");
        out.println("</html>");
    }
        
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    
}