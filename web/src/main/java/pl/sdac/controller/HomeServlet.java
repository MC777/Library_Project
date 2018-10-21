package pl.sdac.controller;

import pl.sdac.dto.BookDto;
import pl.sdac.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {

    BookService bookService = new BookService();
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
////        Action action = Action.valueOf(request.getParameter("action"));
////        Long bookId = Long.valueOf(request.getParameter("bookId"));
////
////        switch (action) {
////            case ADD:
////                response.sendRedirect("/AddBookServlet");
////            case EDIT:
////                response.sendRedirect("EditBookServlet?bookId=" + bookId);
////            case SHOW:
////                response.sendRedirect("/ShowBookDetailServlet?bookId=" + bookId);
////                break;
////            case DELETE:
////                bookService.delete(bookId);
////                response.sendRedirect("/HomeServlet");
////                break;
////            default:
////                throw new UnsupportedOperationException("no action");
////        }
////    }
//
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<BookDto> books = bookService.findAll();
        request.setAttribute("books", books);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
