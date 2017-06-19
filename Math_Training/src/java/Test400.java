/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author guest1Day
 */
public class Test400 extends HttpServlet {

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
    
        HttpSession session = request.getSession();
        request.setCharacterEncoding("UTF-8");//セッションに格納する文字コードをUTF-8に変更
        
        int i = 0;
        int j = 0;
        int ans = 0;
        int xy = -1;
        boolean tf = true;
        
        //正誤判定
        try{
            i = (int)session.getAttribute("x");
            j = (int)session.getAttribute("y");
            ans = Integer.parseInt(request.getParameter("ans"));
            xy = i*j;
            tf = xy==ans;
        }catch(Exception e){
            System.out.print(e.getMessage());
            
        }
        //問題作成
        Random rand_x = new Random();
        int x = 1 + rand_x.nextInt(20);
        Random rand_y = new Random();
        int y = 1 + rand_y.nextInt(20);
        
        //セッションにセット
        session.setAttribute("x",x);
        session.setAttribute("y",y);
        session.setAttribute("xy",xy);
        session.setAttribute("tf",tf);
        
        request.getRequestDispatcher("/Test400.jsp").forward(request, response);
            
        
        
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
