package bitcamp.pms.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import bitcamp.pms.dao.MemberDao;

@WebListener
public class contextLoaderListener implements ServletContextListener{
    
   @Override
public void contextInitialized(ServletContextEvent sce) {
    MemberDao memberDao = new MemberDao("jdbc:mysql://13.125.253.74:3306/studydb",
            "study", "1111");
    ServletContext sc = sce.getServletContext();
    sc.setAttribute("memberDao", memberDao);
}

}
