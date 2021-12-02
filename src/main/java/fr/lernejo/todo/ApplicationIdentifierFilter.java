package fr.lernejo.todo;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class ApplicationIdentifierFilter implements Filter {
	private final String uuid;

	public ApplicationIdentifierFilter() {
		uuid = UUID.randomUUID().toString();
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
		((HttpServletResponse)servletResponse).setHeader("Instance-Id", uuid);
	}

	@Override
	public void destroy() {
		Filter.super.destroy();
	}
}
