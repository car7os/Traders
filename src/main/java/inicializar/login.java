package inicializar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import configuracao.SQLite;

/**
 *
 * @author desktop
 */
@WebServlet(urlPatterns = {"/login"})
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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<!--");
            out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            out.println("-->");            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Traders - Gerenciador de Investimentos</title>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"visual/login/wallpaper.css\"/>");
            out.println("</head>");
            out.println("<body>");

            out.println("<form action=\"login\" class=\"login\" method=\"post\">");
            out.println("Usuario:<br>");
            out.println("<input type=\"text\" name=\"usuario\" value=\"\"><br>");
            out.println("Senha:<br>");
            out.println("<input type=\"password\" name=\"passwd\" value=\"\"><br>");
            out.println("<input type=\"submit\" value=\"Entrar\">");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
            
            SQLite dados = new SQLite();
            
            if (dados.isBancodeDados()){
                out.println("<script>alert(\" Arquivo existe \");</script>");
            }else{
                out.println("<script>alert(\" Arquivo NAO existe \");</script>");
                
            }
           
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
