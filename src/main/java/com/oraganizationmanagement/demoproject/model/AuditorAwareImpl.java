package com.oraganizationmanagement.demoproject.model;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
	public Optional<String> getCurrentAuditor() {

			  String authentication = SecurityContextHolder.getContext().getAuthentication().getName();
			  return Optional.ofNullable(authentication);
	}

}
