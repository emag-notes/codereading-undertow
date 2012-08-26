/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.undertow.servlet.api;

import java.util.List;

import javax.servlet.ServletContainerInitializer;

/**
 * @author Stuart Douglas
 */
public class ServletContainerInitializerInfo {

    private final Class<? extends ServletContainerInitializer> servletContainerInitializerClass;
    private final List<Class<?>> handlesTypes;

    public ServletContainerInitializerInfo(final Class<? extends ServletContainerInitializer> servletContainerInitializerClass, final List<Class<?>> handlesTypes) {
        this.servletContainerInitializerClass = servletContainerInitializerClass;
        this.handlesTypes = handlesTypes;
    }

    public Class<? extends ServletContainerInitializer> getServletContainerInitializerClass() {
        return servletContainerInitializerClass;
    }

    /**
     * Returns the actual types present in the deployment that are handled by this ServletContainerInitializer.
     *
     * (i.e. not the types in the {@link javax.servlet.annotation.HandlesTypes} annotation, but rather actual types
     * the container has discovered that meet the criteria)
     *
     * @return The handled types
     */
    public List<Class<?>> getHandlesTypes() {
        return handlesTypes;
    }

}