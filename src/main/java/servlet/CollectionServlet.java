package servlet;


import model.Collection;
import model.User;
import service.CollectionService;
import service.CourseService;
import service.impl.CollectionServiceImpl;
import service.impl.CourseServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Collection")
public class CollectionServlet extends BaseServlet {
    private CollectionService collectionService = new CollectionServiceImpl();
    private CourseService courseService = new CourseServiceImpl();
    public void addCollection(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Collection collection = new Collection();
        HttpSession session = request.getSession();
        User user = new User(1,"张三","zs","123");
        //User user = (User) request.getSession().getAttribute("user");
        collection.setCourse(courseService.findById(Integer.valueOf(request.getParameter("id"))));
        collection.setUser(user);
        if(collectionService.save(collection)){
            response.getWriter().write("true");
        }else {
            response.getWriter().write("false");
        }

    }
    public void deleteCollection(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Collection collection = new Collection();
        HttpSession session = request.getSession();
        User user = new User(1,"张三","zs","123");
        //User user = (User) request.getSession().getAttribute("user");
        collection.setCourse(courseService.findById(Integer.valueOf(request.getParameter("id"))));
        collection.setUser(user);
        if(collectionService.delete(collection)){
            response.getWriter().write("true");
        }else {
            response.getWriter().write("false");
        }

    }
}
