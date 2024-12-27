package org.wildfly.cadastroInfotera17;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GettingStartedService {

    public String hello(String name) {
        return String.format("Hello '%s'.", name);
    }
}