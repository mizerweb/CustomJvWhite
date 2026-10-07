package org.apache.http.impl.client;

import defpackage.c;
import defpackage.c0a;
import defpackage.ore;
import defpackage.qr7;
import defpackage.qv1;
import defpackage.zo5;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.NonRepeatableRequestException;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.AbortableHttpRequest;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.BasicManagedEntity;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DefaultRequestDirector implements RequestDirector {
    private static Method cleartextTrafficPermittedMethod;
    private static Object networkSecurityPolicy;
    protected final ClientConnectionManager connManager;
    protected final HttpProcessor httpProcessor;
    protected final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log = LogFactory.getLog(getClass());
    protected ManagedClientConnection managedConn;
    private int maxRedirects;
    protected final HttpParams params;
    private final AuthenticationHandler proxyAuthHandler;
    private final AuthState proxyAuthState;
    private int redirectCount;
    protected final RedirectHandler redirectHandler;
    protected final HttpRequestExecutor requestExec;
    protected final HttpRequestRetryHandler retryHandler;
    protected final ConnectionReuseStrategy reuseStrategy;
    protected final HttpRoutePlanner routePlanner;
    private final AuthenticationHandler targetAuthHandler;
    private final AuthState targetAuthState;
    private final UserTokenHandler userTokenHandler;

    public DefaultRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        if (httpRequestExecutor == null) {
            ore.p("Request executor may not be null.");
            throw null;
        }
        if (clientConnectionManager == null) {
            ore.p("Client connection manager may not be null.");
            throw null;
        }
        if (connectionReuseStrategy == null) {
            ore.p("Connection reuse strategy may not be null.");
            throw null;
        }
        if (connectionKeepAliveStrategy == null) {
            ore.p("Connection keep alive strategy may not be null.");
            throw null;
        }
        if (httpRoutePlanner == null) {
            ore.p("Route planner may not be null.");
            throw null;
        }
        if (httpProcessor == null) {
            ore.p("HTTP protocol processor may not be null.");
            throw null;
        }
        if (httpRequestRetryHandler == null) {
            ore.p("HTTP request retry handler may not be null.");
            throw null;
        }
        if (redirectHandler == null) {
            ore.p("Redirect handler may not be null.");
            throw null;
        }
        if (authenticationHandler == null) {
            ore.p("Target authentication handler may not be null.");
            throw null;
        }
        if (authenticationHandler2 == null) {
            ore.p("Proxy authentication handler may not be null.");
            throw null;
        }
        if (userTokenHandler == null) {
            ore.p("User token handler may not be null.");
            throw null;
        }
        if (httpParams == null) {
            ore.p("HTTP parameters may not be null");
            throw null;
        }
        this.requestExec = httpRequestExecutor;
        this.connManager = clientConnectionManager;
        this.reuseStrategy = connectionReuseStrategy;
        this.keepAliveStrategy = connectionKeepAliveStrategy;
        this.routePlanner = httpRoutePlanner;
        this.httpProcessor = httpProcessor;
        this.retryHandler = httpRequestRetryHandler;
        this.redirectHandler = redirectHandler;
        this.targetAuthHandler = authenticationHandler;
        this.proxyAuthHandler = authenticationHandler2;
        this.userTokenHandler = userTokenHandler;
        this.params = httpParams;
        this.managedConn = null;
        this.redirectCount = 0;
        this.maxRedirects = httpParams.getIntParameter(ClientPNames.MAX_REDIRECTS, 100);
        this.targetAuthState = new AuthState();
        this.proxyAuthState = new AuthState();
    }

    private void abortConnection() {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            this.managedConn = null;
            try {
                managedClientConnection.abortConnection();
            } catch (IOException e) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug(e.getMessage(), e);
                }
            }
            try {
                managedClientConnection.releaseConnection();
            } catch (IOException e2) {
                this.log.debug("Error releasing connection", e2);
            }
        }
    }

    private static boolean isCleartextTrafficPermitted(String str) {
        Object obj;
        Method method;
        try {
            synchronized (DefaultRequestDirector.class) {
                try {
                    if (cleartextTrafficPermittedMethod == null) {
                        Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                        networkSecurityPolicy = cls.getMethod("getInstance", null).invoke(null, null);
                        cleartextTrafficPermittedMethod = cls.getMethod("isCleartextTrafficPermitted", String.class);
                    }
                    obj = networkSecurityPolicy;
                    method = cleartextTrafficPermittedMethod;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return ((Boolean) method.invoke(obj, str)).booleanValue();
        } catch (ReflectiveOperationException unused) {
            return true;
        }
    }

    private void processChallenges(Map<String, Header> map, AuthState authState, AuthenticationHandler authenticationHandler, HttpResponse httpResponse, HttpContext httpContext) throws AuthenticationException, MalformedChallengeException {
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme == null) {
            authScheme = authenticationHandler.selectScheme(map, httpResponse, httpContext);
            authState.setAuthScheme(authScheme);
        }
        String schemeName = authScheme.getSchemeName();
        Header header = map.get(schemeName.toLowerCase(Locale.ENGLISH));
        if (header == null) {
            throw new AuthenticationException(schemeName.concat(" authorization challenge expected, but not found"));
        }
        authScheme.processChallenge(header);
        this.log.debug("Authorization challenge processed");
    }

    private void updateAuthState(AuthState authState, HttpHost httpHost, CredentialsProvider credentialsProvider) {
        if (authState.isValid()) {
            String hostName = httpHost.getHostName();
            int port = httpHost.getPort();
            if (port < 0) {
                port = this.connManager.getSchemeRegistry().getScheme(httpHost).getDefaultPort();
            }
            AuthScheme authScheme = authState.getAuthScheme();
            AuthScope authScope = new AuthScope(hostName, port, authScheme.getRealm(), authScheme.getSchemeName());
            if (this.log.isDebugEnabled()) {
                this.log.debug("Authentication scope: " + authScope);
            }
            Credentials credentials = authState.getCredentials();
            if (credentials == null) {
                credentials = credentialsProvider.getCredentials(authScope);
                if (this.log.isDebugEnabled()) {
                    Log log = this.log;
                    if (credentials != null) {
                        log.debug("Found credentials");
                    } else {
                        log.debug("Credentials not found");
                    }
                }
            } else if (authScheme.isComplete()) {
                this.log.debug("Authentication failed");
                credentials = null;
            }
            authState.setAuthScope(authScope);
            authState.setCredentials(credentials);
        }
    }

    private RequestWrapper wrapRequest(HttpRequest httpRequest) throws ProtocolException {
        return httpRequest instanceof HttpEntityEnclosingRequest ? new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest) : new RequestWrapper(httpRequest);
    }

    public HttpRequest createConnectRequest(HttpRoute httpRoute, HttpContext httpContext) {
        HttpHost targetHost = httpRoute.getTargetHost();
        String hostName = targetHost.getHostName();
        int port = targetHost.getPort();
        if (port < 0) {
            port = this.connManager.getSchemeRegistry().getScheme(targetHost.getSchemeName()).getDefaultPort();
        }
        StringBuilder sb = new StringBuilder(hostName.length() + 6);
        sb.append(hostName);
        sb.append(':');
        sb.append(Integer.toString(port));
        return new BasicHttpRequest("CONNECT", sb.toString(), HttpProtocolParams.getVersion(this.params));
    }

    public boolean createTunnelToProxy(HttpRoute httpRoute, int i, HttpContext httpContext) throws HttpException, IOException {
        throw new UnsupportedOperationException("Proxy chains are not supported.");
    }

    /* JADX WARN: Code duplicated, block: B:59:0x014d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0153  */
    /* JADX WARN: Code duplicated, block: B:64:0x0178  */
    public boolean createTunnelToTarget(HttpRoute httpRoute, HttpContext httpContext) throws HttpException, IOException {
        DefaultRequestDirector defaultRequestDirector;
        HttpEntity entity;
        HttpContext httpContext2;
        HttpHost proxyHost = httpRoute.getProxyHost();
        HttpHost targetHost = httpRoute.getTargetHost();
        HttpResponse httpResponse = null;
        boolean z = false;
        while (true) {
            if (z) {
                defaultRequestDirector = this;
                break;
            }
            if (!this.managedConn.isOpen()) {
                this.managedConn.open(httpRoute, httpContext, this.params);
            }
            HttpRequest httpRequestCreateConnectRequest = this.createConnectRequest(httpRoute, httpContext);
            String userAgent = HttpProtocolParams.getUserAgent(this.params);
            if (userAgent != null) {
                httpRequestCreateConnectRequest.addHeader(HTTP.USER_AGENT, userAgent);
            }
            httpRequestCreateConnectRequest.addHeader(HTTP.TARGET_HOST, targetHost.toHostString());
            AuthScheme authScheme = this.proxyAuthState.getAuthScheme();
            AuthScope authScope = this.proxyAuthState.getAuthScope();
            Credentials credentials = this.proxyAuthState.getCredentials();
            if (credentials != null && (authScope != null || !authScheme.isConnectionBased())) {
                try {
                    httpRequestCreateConnectRequest.addHeader(authScheme.authenticate(credentials, httpRequestCreateConnectRequest));
                } catch (AuthenticationException e) {
                    if (this.log.isErrorEnabled()) {
                        this.log.error("Proxy authentication error: " + e.getMessage());
                    }
                }
            }
            HttpResponse httpResponseExecute = this.requestExec.execute(httpRequestCreateConnectRequest, this.managedConn, httpContext);
            if (httpResponseExecute.getStatusLine().getStatusCode() < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + httpResponseExecute.getStatusLine());
            }
            CredentialsProvider credentialsProvider = (CredentialsProvider) httpContext.getAttribute(ClientContext.CREDS_PROVIDER);
            boolean z2 = true;
            if (credentialsProvider == null || !HttpClientParams.isAuthenticating(this.params)) {
                defaultRequestDirector = this;
                httpContext2 = httpContext;
            } else if (this.proxyAuthHandler.isAuthenticationRequested(httpResponseExecute, httpContext)) {
                this.log.debug("Proxy requested authentication");
                try {
                    defaultRequestDirector = this;
                    httpContext2 = httpContext;
                    try {
                        defaultRequestDirector.processChallenges(this.proxyAuthHandler.getChallenges(httpResponseExecute, httpContext), this.proxyAuthState, this.proxyAuthHandler, httpResponseExecute, httpContext2);
                    } catch (AuthenticationException e2) {
                        e = e2;
                        AuthenticationException authenticationException = e;
                        if (defaultRequestDirector.log.isWarnEnabled()) {
                            defaultRequestDirector.log.warn("Authentication error: " + authenticationException.getMessage());
                            httpResponse = httpResponseExecute;
                            if (httpResponse.getStatusLine().getStatusCode() > 299) {
                                defaultRequestDirector.managedConn.markReusable();
                                return false;
                            }
                            entity = httpResponse.getEntity();
                            if (entity != null) {
                                httpResponse.setEntity(new BufferedHttpEntity(entity));
                            }
                            defaultRequestDirector.managedConn.close();
                            throw new TunnelRefusedException("CONNECT refused by proxy: " + httpResponse.getStatusLine(), httpResponse);
                        }
                    }
                } catch (AuthenticationException e3) {
                    e = e3;
                    defaultRequestDirector = this;
                    httpContext2 = httpContext;
                }
                defaultRequestDirector.updateAuthState(defaultRequestDirector.proxyAuthState, proxyHost, credentialsProvider);
                if (defaultRequestDirector.proxyAuthState.getCredentials() != null) {
                    if (defaultRequestDirector.reuseStrategy.keepAlive(httpResponseExecute, httpContext2)) {
                        defaultRequestDirector.log.debug("Connection kept alive");
                        HttpEntity entity2 = httpResponseExecute.getEntity();
                        if (entity2 != null) {
                            entity2.consumeContent();
                        }
                    } else {
                        defaultRequestDirector.managedConn.close();
                    }
                    z2 = false;
                }
            } else {
                defaultRequestDirector = this;
                httpContext2 = httpContext;
                defaultRequestDirector.proxyAuthState.setAuthScope(null);
            }
            z = z2;
            this = defaultRequestDirector;
            httpResponse = httpResponseExecute;
            httpContext = httpContext2;
        }
        if (httpResponse.getStatusLine().getStatusCode() > 299) {
            defaultRequestDirector.managedConn.markReusable();
            return false;
        }
        entity = httpResponse.getEntity();
        if (entity != null) {
            httpResponse.setEntity(new BufferedHttpEntity(entity));
        }
        defaultRequestDirector.managedConn.close();
        throw new TunnelRefusedException("CONNECT refused by proxy: " + httpResponse.getStatusLine(), httpResponse);
    }

    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
        String path;
        String scheme;
        String host;
        URI uri;
        if (httpHost == null) {
            httpHost = (HttpHost) httpRequest.getParams().getParameter(ClientPNames.DEFAULT_HOST);
        }
        if (httpHost != null) {
            return this.routePlanner.determineRoute(httpHost, httpRequest, httpContext);
        }
        if (!(httpRequest instanceof HttpUriRequest) || (uri = ((HttpUriRequest) httpRequest).getURI()) == null) {
            path = null;
            scheme = null;
            host = null;
        } else {
            scheme = uri.getScheme();
            host = uri.getHost();
            path = uri.getPath();
        }
        qr7.m(qv1.q("Target host must not be null, or set in parameters. scheme=", scheme, ", host=", host, ", path="), path);
        return null;
    }

    public void establishRoute(HttpRoute httpRoute, HttpContext httpContext) throws HttpException, IOException {
        int iNextStep;
        BasicRouteDirector basicRouteDirector = new BasicRouteDirector();
        do {
            HttpRoute route = this.managedConn.getRoute();
            iNextStep = basicRouteDirector.nextStep(httpRoute, route);
            switch (iNextStep) {
                case -1:
                    c.s("Unable to establish route.\nplanned = ", httpRoute, "\ncurrent = ", route);
                    return;
                case 0:
                    break;
                case 1:
                case 2:
                    this.managedConn.open(httpRoute, httpContext, this.params);
                    break;
                case 3:
                    boolean zCreateTunnelToTarget = createTunnelToTarget(httpRoute, httpContext);
                    this.log.debug("Tunnel to target created.");
                    this.managedConn.tunnelTarget(zCreateTunnelToTarget, this.params);
                    break;
                case 4:
                    int hopCount = route.getHopCount() - 1;
                    boolean zCreateTunnelToProxy = createTunnelToProxy(httpRoute, hopCount, httpContext);
                    this.log.debug("Tunnel to proxy created.");
                    this.managedConn.tunnelProxy(httpRoute.getHopTarget(hopCount), zCreateTunnelToProxy, this.params);
                    break;
                case 5:
                    this.managedConn.layerProtocol(httpContext, this.params);
                    break;
                default:
                    ore.k(c0a.k(iNextStep, "Unknown step indicator ", " from RouteDirector."));
                    return;
            }
        } while (iNextStep > 0);
    }

    @Override // org.apache.http.client.RequestDirector
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        HttpRequest httpRequest2 = httpRequest;
        RequestWrapper requestWrapperWrapRequest = wrapRequest(httpRequest2);
        requestWrapperWrapRequest.setParams(this.params);
        RoutedRequest routedRequest = new RoutedRequest(requestWrapperWrapRequest, determineRoute(httpHost, requestWrapperWrapRequest, httpContext));
        long timeout = ConnManagerParams.getTimeout(this.params);
        HttpResponse response = null;
        int i = 0;
        boolean zKeepAlive = false;
        int i2 = 0;
        while (i == 0) {
            try {
                try {
                    RequestWrapper request = routedRequest.getRequest();
                    HttpRoute route = routedRequest.getRoute();
                    Object attribute = httpContext.getAttribute(ClientContext.USER_TOKEN);
                    ManagedClientConnection managedClientConnection = this.managedConn;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (managedClientConnection == null) {
                        ClientConnectionRequest clientConnectionRequestRequestConnection = this.connManager.requestConnection(route, attribute);
                        if (httpRequest2 instanceof AbortableHttpRequest) {
                            ((AbortableHttpRequest) httpRequest2).setConnectionRequest(clientConnectionRequestRequestConnection);
                        }
                        try {
                            this.managedConn = clientConnectionRequestRequestConnection.getConnection(timeout, timeUnit);
                            if (HttpConnectionParams.isStaleCheckingEnabled(this.params)) {
                                this.log.debug("Stale connection check");
                                if (this.managedConn.isStale()) {
                                    this.log.debug("Stale connection detected");
                                    try {
                                        this.managedConn.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                        } catch (InterruptedException e) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException();
                            interruptedIOException.initCause(e);
                            throw interruptedIOException;
                        }
                    }
                    if (httpRequest2 instanceof AbortableHttpRequest) {
                        ((AbortableHttpRequest) httpRequest2).setReleaseTrigger(this.managedConn);
                    }
                    boolean zIsOpen = this.managedConn.isOpen();
                    ManagedClientConnection managedClientConnection2 = this.managedConn;
                    if (zIsOpen) {
                        managedClientConnection2.setSocketTimeout(HttpConnectionParams.getSoTimeout(this.params));
                    } else {
                        managedClientConnection2.open(route, httpContext, this.params);
                    }
                    try {
                        establishRoute(route, httpContext);
                        request.resetHeaders();
                        rewriteRequestURI(request, route);
                        HttpHost targetHost = (HttpHost) request.getParams().getParameter(ClientPNames.VIRTUAL_HOST);
                        if (targetHost == null) {
                            targetHost = route.getTargetHost();
                        }
                        HttpHost proxyHost = route.getProxyHost();
                        httpContext.setAttribute(ExecutionContext.HTTP_TARGET_HOST, targetHost);
                        httpContext.setAttribute(ExecutionContext.HTTP_PROXY_HOST, proxyHost);
                        httpContext.setAttribute(ExecutionContext.HTTP_CONNECTION, this.managedConn);
                        httpContext.setAttribute(ClientContext.TARGET_AUTH_STATE, this.targetAuthState);
                        httpContext.setAttribute(ClientContext.PROXY_AUTH_STATE, this.proxyAuthState);
                        this.requestExec.preProcess(request, this.httpProcessor, httpContext);
                        httpContext.setAttribute(ExecutionContext.HTTP_REQUEST, request);
                        int i3 = 1;
                        int i4 = i2;
                        HttpResponse httpResponseExecute = response;
                        int i5 = i4;
                        boolean z = true;
                        while (z) {
                            i5++;
                            request.incrementExecCount();
                            if (request.getExecCount() > i3 && !request.isRepeatable()) {
                                throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity");
                            }
                            try {
                                if (this.log.isDebugEnabled()) {
                                    this.log.debug("Attempt " + i5 + " to execute request");
                                }
                                if (!route.isSecure() && !isCleartextTrafficPermitted(route.getTargetHost().getHostName())) {
                                    throw new IOException("Cleartext traffic not permitted: " + route.getTargetHost());
                                }
                                httpResponseExecute = this.requestExec.execute(request, this.managedConn, httpContext);
                                i3 = 1;
                                z = false;
                            } catch (IOException e2) {
                                this.log.debug("Closing the connection.");
                                this.managedConn.close();
                                if (!this.retryHandler.retryRequest(e2, i5, httpContext)) {
                                    throw e2;
                                }
                                if (this.log.isInfoEnabled()) {
                                    this.log.info("I/O exception (" + e2.getClass().getName() + ") caught when processing request: " + e2.getMessage());
                                }
                                if (this.log.isDebugEnabled()) {
                                    this.log.debug(e2.getMessage(), e2);
                                }
                                this.log.info("Retrying request");
                                if (route.getHopCount() != 1) {
                                    throw e2;
                                }
                                this.log.debug("Reopening the direct connection.");
                                this.managedConn.open(route, httpContext, this.params);
                                i3 = 1;
                                timeout = timeout;
                            }
                        }
                        long j = timeout;
                        int i6 = i3;
                        httpResponseExecute.setParams(this.params);
                        this.requestExec.postProcess(httpResponseExecute, this.httpProcessor, httpContext);
                        zKeepAlive = this.reuseStrategy.keepAlive(httpResponseExecute, httpContext);
                        if (zKeepAlive) {
                            this.managedConn.setIdleDuration(this.keepAliveStrategy.getKeepAliveDuration(httpResponseExecute, httpContext), timeUnit);
                        }
                        RoutedRequest routedRequestHandleResponse = handleResponse(routedRequest, httpResponseExecute, httpContext);
                        if (routedRequestHandleResponse == null) {
                            i = i6;
                        } else {
                            if (zKeepAlive) {
                                this.log.debug("Connection kept alive");
                                HttpEntity entity = httpResponseExecute.getEntity();
                                if (entity != null) {
                                    entity.consumeContent();
                                }
                                this.managedConn.markReusable();
                            } else {
                                this.managedConn.close();
                            }
                            if (!routedRequestHandleResponse.getRoute().equals(routedRequest.getRoute())) {
                                releaseConnection();
                            }
                            routedRequest = routedRequestHandleResponse;
                        }
                        Object userToken = this.userTokenHandler.getUserToken(httpContext);
                        httpContext.setAttribute(ClientContext.USER_TOKEN, userToken);
                        ManagedClientConnection managedClientConnection3 = this.managedConn;
                        if (managedClientConnection3 != null) {
                            managedClientConnection3.setState(userToken);
                        }
                        HttpResponse httpResponse = httpResponseExecute;
                        i2 = i5;
                        response = httpResponse;
                        httpRequest2 = httpRequest;
                        timeout = j;
                    } catch (TunnelRefusedException e3) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug(e3.getMessage());
                        }
                        response = e3.getResponse();
                    }
                } catch (RuntimeException e4) {
                    abortConnection();
                    throw e4;
                } catch (HttpException e5) {
                    abortConnection();
                    throw e5;
                }
            } catch (IOException e6) {
                abortConnection();
                throw e6;
            }
        }
        if (response == null || response.getEntity() == null || !response.getEntity().isStreaming()) {
            if (zKeepAlive) {
                this.managedConn.markReusable();
            }
            releaseConnection();
        } else {
            response.setEntity(new BasicManagedEntity(response.getEntity(), this.managedConn, zKeepAlive));
        }
        return response;
    }

    public RoutedRequest handleResponse(RoutedRequest routedRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        HttpRoute route = routedRequest.getRoute();
        HttpHost proxyHost = route.getProxyHost();
        RequestWrapper request = routedRequest.getRequest();
        HttpParams params = request.getParams();
        if (HttpClientParams.isRedirecting(params) && this.redirectHandler.isRedirectRequested(httpResponse, httpContext)) {
            int i = this.redirectCount;
            if (i >= this.maxRedirects) {
                throw new RedirectException(zo5.t(new StringBuilder("Maximum redirects ("), this.maxRedirects, ") exceeded"));
            }
            this.redirectCount = i + 1;
            URI locationURI = this.redirectHandler.getLocationURI(httpResponse, httpContext);
            HttpHost httpHost = new HttpHost(locationURI.getHost(), locationURI.getPort(), locationURI.getScheme());
            HttpGet httpGet = new HttpGet(locationURI);
            httpGet.setHeaders(request.getOriginal().getAllHeaders());
            RequestWrapper requestWrapper = new RequestWrapper(httpGet);
            requestWrapper.setParams(params);
            HttpRoute httpRouteDetermineRoute = determineRoute(httpHost, requestWrapper, httpContext);
            RoutedRequest routedRequest2 = new RoutedRequest(requestWrapper, httpRouteDetermineRoute);
            if (this.log.isDebugEnabled()) {
                this.log.debug("Redirecting to '" + locationURI + "' via " + httpRouteDetermineRoute);
            }
            return routedRequest2;
        }
        CredentialsProvider credentialsProvider = (CredentialsProvider) httpContext.getAttribute(ClientContext.CREDS_PROVIDER);
        if (credentialsProvider != null && HttpClientParams.isAuthenticating(params)) {
            if (this.targetAuthHandler.isAuthenticationRequested(httpResponse, httpContext)) {
                HttpHost targetHost = (HttpHost) httpContext.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
                if (targetHost == null) {
                    targetHost = route.getTargetHost();
                }
                HttpHost httpHost2 = targetHost;
                this.log.debug("Target requested authentication");
                try {
                    processChallenges(this.targetAuthHandler.getChallenges(httpResponse, httpContext), this.targetAuthState, this.targetAuthHandler, httpResponse, httpContext);
                } catch (AuthenticationException e) {
                    if (this.log.isWarnEnabled()) {
                        this.log.warn("Authentication error: " + e.getMessage());
                        return null;
                    }
                }
                updateAuthState(this.targetAuthState, httpHost2, credentialsProvider);
                if (this.targetAuthState.getCredentials() == null) {
                    return null;
                }
            } else {
                this.targetAuthState.setAuthScope(null);
                if (this.proxyAuthHandler.isAuthenticationRequested(httpResponse, httpContext)) {
                    this.log.debug("Proxy requested authentication");
                    try {
                        processChallenges(this.proxyAuthHandler.getChallenges(httpResponse, httpContext), this.proxyAuthState, this.proxyAuthHandler, httpResponse, httpContext);
                    } catch (AuthenticationException e2) {
                        if (this.log.isWarnEnabled()) {
                            this.log.warn("Authentication error: " + e2.getMessage());
                            return null;
                        }
                    }
                    updateAuthState(this.proxyAuthState, proxyHost, credentialsProvider);
                    if (this.proxyAuthState.getCredentials() == null) {
                        return null;
                    }
                } else {
                    this.proxyAuthState.setAuthScope(null);
                }
            }
            return routedRequest;
        }
        return null;
    }

    public void releaseConnection() {
        try {
            this.managedConn.releaseConnection();
        } catch (IOException e) {
            this.log.debug("IOException releasing connection", e);
        }
        this.managedConn = null;
    }

    public void rewriteRequestURI(RequestWrapper requestWrapper, HttpRoute httpRoute) throws ProtocolException {
        try {
            URI uri = requestWrapper.getURI();
            if (httpRoute.getProxyHost() == null || httpRoute.isTunnelled()) {
                if (uri.isAbsolute()) {
                    requestWrapper.setURI(URIUtils.rewriteURI(uri, null));
                }
            } else {
                if (uri.isAbsolute()) {
                    return;
                }
                requestWrapper.setURI(URIUtils.rewriteURI(uri, httpRoute.getTargetHost()));
            }
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid URI: " + requestWrapper.getRequestLine().getUri(), e);
        }
    }
}
