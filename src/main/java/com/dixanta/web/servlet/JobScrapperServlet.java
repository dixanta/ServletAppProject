/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dixanta.web.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(name = "jobScrapper",urlPatterns = "/scrap")
public class JobScrapperServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        HttpURLConnection conn=(HttpURLConnection)new URL("http://www.jobsnepal.com")
                .openConnection();
        String userAgent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36";
        conn.setRequestProperty("User-Agent", userAgent);
        BufferedReader reader=new BufferedReader(
        new InputStreamReader(conn.getInputStream()));
        String line="";
        PrintWriter out=response.getWriter();
        while((line=reader.readLine())!=null){
            out.println(line);
        }
        reader.close();
        
    }
    
}
