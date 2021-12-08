package fr.lernejo.todo;

import org.jetbrains.annotations.NotNull;
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
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, @NotNull FilterChain filterChain) throws ServletException, IOException {
		((HttpServletResponse)servletResponse).setHeader("Instance-Id", uuid);
		filterChain.doFilter(servletRequest, servletResponse);
	}
}
