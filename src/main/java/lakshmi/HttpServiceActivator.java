/*
 * Copyright © 2011 jbundle.org. All rights reserved.
 */
package lakshmi;

/**
 * Start up the web service listener.
 * @author don
 */
public class HttpServiceActivator extends lakshmi.osgi.HttpServiceActivator
{
    public String getServletClass()
    {
        return org.apache.catalina.servlets.DefaultServlet.class.getName();    // Override this to enable config admin.
    }
}
