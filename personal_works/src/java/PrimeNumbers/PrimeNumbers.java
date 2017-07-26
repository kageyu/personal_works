/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeNumbers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kageyu
 */
public class PrimeNumbers extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");//セッションに格納する文字コードをUTF-8に変更
        
        try (PrintWriter out = response.getWriter()) {

            HttpSession session = request.getSession();
            int ans ;

            try{
                ans = Integer.parseInt(request.getParameter("ans"));
                
            //NumberFormatExeptionは握りつぶす
            }catch(Exception e){
                ans = 1;
            }
            
            ArrayList<Integer> PNs = new ArrayList<>();
            PNs.add(2);
            Boolean flagPN = true;

            //ループ数カウント用変数配列
            ArrayList<Integer> roops = new ArrayList<>();
            if(ans == 1){ roops.add(1); }
            
            int x = 0;
            int i = 1;

            while (PNs.size() < ans) {
                i++;
                for (int n : PNs) {
                    x++;
                    if (i % n == 0) {
                        flagPN = false;
                        break;
                    }
                }
                if (flagPN) {
                    PNs.add(i);
                } else {
                    flagPN = true;
                }
                roops.add(x);
                x = 0;
            }


            PrimeNumbersBeans PNB = new PrimeNumbersBeans();
            PNB.setPNs(PNs);
            PNB.setRoops(roops);
            PNB.setAns(ans);
            session.setAttribute("PNB",PNB);
            
            
//            session.setAttribute("ans", ans);
//            session.setAttribute("roops", roops);
//
//            if (ans != 0) {
//                session.setAttribute("pn", PNs.get(ans - 1));
//            } else {
//                session.setAttribute("pn", "表示できません");
//            }
             
            
            request.getRequestDispatcher("./WEB-INF/PrimeNumbers.jsp").forward(request, response);
        }catch(Exception e){
            System.out.print(e.getMessage());
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
