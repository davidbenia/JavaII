package com.example.david_benia.Servlets;

import com.example.david_benia.Processing.Animal;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/animalservlet")
public class AnimalServlet extends HttpServlet {

    static final String VIEW = "/showInfo.jsp";

    Animal animal = new Animal();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setAttribute("animal", animal);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        animal.setName(request.getParameter("name"));
        animal.setBreed(request.getParameter("breed"));
        animal.setGender(request.getParameter("gender"));
        animal.setAge(Integer.parseInt(request.getParameter("age")));

        System.out.format("\nName: %s\nBreed: %s\nGender: %s\nAge: %d\n", animal.getName(), animal.getBreed(), animal.getGender(), animal.getAge());

        RequestDispatcher dispatcher = request.getRequestDispatcher(VIEW);
        dispatcher.forward(request, response);
    }
}
