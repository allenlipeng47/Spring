package restful.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pli on 5/11/2016.
 */
public class CorsFilter extends OncePerRequestFilter {
    private static final Log LOG = LogFactory.getLog(CorsFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        System.out.println("in filter");
        response.addHeader("Access-Control-Allow-Origin", "*");
        if (request.getHeader("Access-Control-Request-Method") != null
                && "OPTIONS".equals(request.getMethod())) {
            // CORS "pre-flight" request
            response.addHeader("Access-Control-Allow-Methods",
                    "GET, POST, PUT, DELETE");
            response.addHeader("Access-Control-Allow-Headers",
                    "X-Requested-With,Origin,Content-Type, Accept");
        }
        filterChain.doFilter(request, response);
    }

}