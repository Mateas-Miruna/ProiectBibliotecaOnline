package ro.uvt.info.splabmm1.service;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(1)
@Slf4j
public class TransactionFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        log.info("Starting a transaction for req: " + req.getRequestURI());

        try {
            chain.doFilter(request, response);
        } finally {
            log.info("Committing a transaction for req: " + req.getRequestURI());
        }
    }

}
