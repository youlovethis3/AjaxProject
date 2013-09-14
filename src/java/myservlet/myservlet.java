/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import myjava.MyCalculator;
/**
 *
 * @author youlovethis
 */
public class myservlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws java.io.IOException {

        Enumeration headers = req.getHeaderNames();
        while (headers.hasMoreElements()) {
            String header = (String) headers.nextElement();
            System.out.println(header + ": " + req.getHeader(header));
        }
        HttpSession session = req.getSession(true);
        String action = req.getParameter("action");
        String first = req.getParameter("firstnumber");
        
        String second=req.getParameter("secondnumber");
        String result="";
        if(first==null||second==null){
            result="Wrong_Input_Number";
        }
        else {
         MyCalculator mc=new MyCalculator(action,first,second);
         result=mc.process();
        }
      //  res.setContentType("text/xml");
        res.setContentType("text/plain");
        res.getWriter().write(result);
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws java.io.IOException {
        // Bounce to post, for debugging use
        // Hit this servlet directly from the browser to see XML
        System.out.println("fuck");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

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
