package org.apache.http.impl.client;

import defpackage.ore;
import defpackage.qv1;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ProtocolException;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DefaultRedirectHandler implements RedirectHandler {
    private static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    private final Log log = LogFactory.getLog(getClass());

    @Override // org.apache.http.client.RedirectHandler
    public URI getLocationURI(HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        URI uriRewriteURI;
        if (httpResponse == null) {
            ore.p("HTTP response may not be null");
            return null;
        }
        Header firstHeader = httpResponse.getFirstHeader("location");
        if (firstHeader == null) {
            throw new ProtocolException("Received redirect response " + httpResponse.getStatusLine() + " but no location header");
        }
        String value = firstHeader.getValue();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Redirect requested to location '" + value + "'");
        }
        try {
            URI uri = new URI(value);
            HttpParams params = httpResponse.getParams();
            if (!uri.isAbsolute()) {
                if (params.isParameterTrue(ClientPNames.REJECT_RELATIVE_REDIRECT)) {
                    throw new ProtocolException("Relative redirect location '" + uri + "' not allowed");
                }
                HttpHost httpHost = (HttpHost) httpContext.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
                if (httpHost == null) {
                    ore.k("Target host not available in the HTTP context");
                    return null;
                }
                try {
                    uri = URIUtils.resolve(URIUtils.rewriteURI(new URI(((HttpRequest) httpContext.getAttribute(ExecutionContext.HTTP_REQUEST)).getRequestLine().getUri()), httpHost, true), uri);
                } catch (URISyntaxException e) {
                    throw new ProtocolException(e.getMessage(), e);
                }
            }
            if (!params.isParameterFalse(ClientPNames.ALLOW_CIRCULAR_REDIRECTS)) {
                return uri;
            }
            RedirectLocations redirectLocations = (RedirectLocations) httpContext.getAttribute(REDIRECT_LOCATIONS);
            if (redirectLocations == null) {
                redirectLocations = new RedirectLocations();
                httpContext.setAttribute(REDIRECT_LOCATIONS, redirectLocations);
            }
            if (uri.getFragment() != null) {
                try {
                    uriRewriteURI = URIUtils.rewriteURI(uri, new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme()), true);
                } catch (URISyntaxException e2) {
                    throw new ProtocolException(e2.getMessage(), e2);
                }
            } else {
                uriRewriteURI = uri;
            }
            if (!redirectLocations.contains(uriRewriteURI)) {
                redirectLocations.add(uriRewriteURI);
                return uri;
            }
            throw new CircularRedirectException("Circular redirect to '" + uriRewriteURI + "'");
        } catch (URISyntaxException e3) {
            throw new ProtocolException(qv1.k("Invalid redirect URI: ", value), e3);
        }
    }

    @Override // org.apache.http.client.RedirectHandler
    public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        if (httpResponse == null) {
            ore.p("HTTP response may not be null");
            return false;
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 307) {
            return true;
        }
        switch (statusCode) {
            case 301:
            case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
            case HttpStatus.SC_SEE_OTHER /* 303 */:
                return true;
            default:
                return false;
        }
    }
}
