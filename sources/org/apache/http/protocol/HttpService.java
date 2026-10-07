package org.apache.http.protocol;

import defpackage.ore;
import java.io.IOException;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.HttpServerConnection;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.UnsupportedHttpVersionException;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.DefaultedHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EncodingUtils;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class HttpService {
    private HttpParams params = null;
    private HttpProcessor processor = null;
    private HttpRequestHandlerResolver handlerResolver = null;
    private ConnectionReuseStrategy connStrategy = null;
    private HttpResponseFactory responseFactory = null;
    private HttpExpectationVerifier expectationVerifier = null;

    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory) {
        setHttpProcessor(httpProcessor);
        setConnReuseStrategy(connectionReuseStrategy);
        setResponseFactory(httpResponseFactory);
    }

    public void doService(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        HttpRequestHandler httpRequestHandlerLookup;
        if (this.handlerResolver != null) {
            httpRequestHandlerLookup = this.handlerResolver.lookup(httpRequest.getRequestLine().getUri());
        } else {
            httpRequestHandlerLookup = null;
        }
        if (httpRequestHandlerLookup != null) {
            httpRequestHandlerLookup.handle(httpRequest, httpResponse, httpContext);
        } else {
            httpResponse.setStatusCode(HttpStatus.SC_NOT_IMPLEMENTED);
        }
    }

    public HttpParams getParams() {
        return this.params;
    }

    public void handleException(HttpException httpException, HttpResponse httpResponse) {
        if (httpException instanceof MethodNotSupportedException) {
            httpResponse.setStatusCode(HttpStatus.SC_NOT_IMPLEMENTED);
        } else if (httpException instanceof UnsupportedHttpVersionException) {
            httpResponse.setStatusCode(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED);
        } else if (httpException instanceof ProtocolException) {
            httpResponse.setStatusCode(HttpStatus.SC_BAD_REQUEST);
        } else {
            httpResponse.setStatusCode(500);
        }
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(EncodingUtils.getAsciiBytes(httpException.getMessage()));
        byteArrayEntity.setContentType("text/plain; charset=US-ASCII");
        httpResponse.setEntity(byteArrayEntity);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0097 A[Catch: HttpException -> 0x0074, TryCatch #0 {HttpException -> 0x0074, blocks: (B:3:0x0007, B:6:0x002a, B:8:0x0031, B:10:0x003a, B:18:0x0076, B:20:0x0080, B:15:0x0059, B:22:0x008f, B:24:0x0097, B:25:0x00bd, B:27:0x00c1, B:29:0x00c9, B:12:0x0054), top: B:36:0x0007, inners: #1 }] */
    public void handleRequest(HttpServerConnection httpServerConnection, HttpContext httpContext) throws HttpException, IOException {
        HttpResponse httpResponseNewHttpResponse;
        HttpEntity entity;
        httpContext.setAttribute(ExecutionContext.HTTP_CONNECTION, httpServerConnection);
        try {
            HttpRequest httpRequestReceiveRequestHeader = httpServerConnection.receiveRequestHeader();
            httpRequestReceiveRequestHeader.setParams(new DefaultedHttpParams(httpRequestReceiveRequestHeader.getParams(), this.params));
            ProtocolVersion protocolVersion = httpRequestReceiveRequestHeader.getRequestLine().getProtocolVersion();
            HttpVersion httpVersion = HttpVersion.HTTP_1_1;
            if (!protocolVersion.lessEquals(httpVersion)) {
                protocolVersion = httpVersion;
            }
            httpResponseNewHttpResponse = null;
            if (httpRequestReceiveRequestHeader instanceof HttpEntityEnclosingRequest) {
                if (((HttpEntityEnclosingRequest) httpRequestReceiveRequestHeader).expectContinue()) {
                    HttpResponse httpResponseNewHttpResponse2 = this.responseFactory.newHttpResponse(protocolVersion, 100, httpContext);
                    httpResponseNewHttpResponse2.setParams(new DefaultedHttpParams(httpResponseNewHttpResponse2.getParams(), this.params));
                    HttpExpectationVerifier httpExpectationVerifier = this.expectationVerifier;
                    if (httpExpectationVerifier != null) {
                        try {
                            httpExpectationVerifier.verify(httpRequestReceiveRequestHeader, httpResponseNewHttpResponse2, httpContext);
                        } catch (HttpException e) {
                            HttpResponse httpResponseNewHttpResponse3 = this.responseFactory.newHttpResponse(HttpVersion.HTTP_1_0, 500, httpContext);
                            httpResponseNewHttpResponse3.setParams(new DefaultedHttpParams(httpResponseNewHttpResponse3.getParams(), this.params));
                            handleException(e, httpResponseNewHttpResponse3);
                            httpResponseNewHttpResponse2 = httpResponseNewHttpResponse3;
                        }
                    }
                    if (httpResponseNewHttpResponse2.getStatusLine().getStatusCode() < 200) {
                        httpServerConnection.sendResponseHeader(httpResponseNewHttpResponse2);
                        httpServerConnection.flush();
                        httpServerConnection.receiveRequestEntity((HttpEntityEnclosingRequest) httpRequestReceiveRequestHeader);
                    } else {
                        httpResponseNewHttpResponse = httpResponseNewHttpResponse2;
                    }
                } else {
                    httpServerConnection.receiveRequestEntity((HttpEntityEnclosingRequest) httpRequestReceiveRequestHeader);
                }
                if (httpResponseNewHttpResponse == null) {
                    httpResponseNewHttpResponse = this.responseFactory.newHttpResponse(protocolVersion, 200, httpContext);
                    httpResponseNewHttpResponse.setParams(new DefaultedHttpParams(httpResponseNewHttpResponse.getParams(), this.params));
                    httpContext.setAttribute(ExecutionContext.HTTP_REQUEST, httpRequestReceiveRequestHeader);
                    httpContext.setAttribute(ExecutionContext.HTTP_RESPONSE, httpResponseNewHttpResponse);
                    this.processor.process(httpRequestReceiveRequestHeader, httpContext);
                    doService(httpRequestReceiveRequestHeader, httpResponseNewHttpResponse, httpContext);
                }
                if (httpRequestReceiveRequestHeader instanceof HttpEntityEnclosingRequest) {
                    entity.consumeContent();
                }
            } else {
                if (httpResponseNewHttpResponse == null) {
                    httpResponseNewHttpResponse = this.responseFactory.newHttpResponse(protocolVersion, 200, httpContext);
                    httpResponseNewHttpResponse.setParams(new DefaultedHttpParams(httpResponseNewHttpResponse.getParams(), this.params));
                    httpContext.setAttribute(ExecutionContext.HTTP_REQUEST, httpRequestReceiveRequestHeader);
                    httpContext.setAttribute(ExecutionContext.HTTP_RESPONSE, httpResponseNewHttpResponse);
                    this.processor.process(httpRequestReceiveRequestHeader, httpContext);
                    doService(httpRequestReceiveRequestHeader, httpResponseNewHttpResponse, httpContext);
                }
                if ((httpRequestReceiveRequestHeader instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpRequestReceiveRequestHeader).getEntity()) != null) {
                    entity.consumeContent();
                }
            }
        } catch (HttpException e2) {
            httpResponseNewHttpResponse = this.responseFactory.newHttpResponse(HttpVersion.HTTP_1_0, 500, httpContext);
            httpResponseNewHttpResponse.setParams(new DefaultedHttpParams(httpResponseNewHttpResponse.getParams(), this.params));
            handleException(e2, httpResponseNewHttpResponse);
        }
        this.processor.process(httpResponseNewHttpResponse, httpContext);
        httpServerConnection.sendResponseHeader(httpResponseNewHttpResponse);
        httpServerConnection.sendResponseEntity(httpResponseNewHttpResponse);
        httpServerConnection.flush();
        if (this.connStrategy.keepAlive(httpResponseNewHttpResponse, httpContext)) {
            return;
        }
        httpServerConnection.close();
    }

    public void setConnReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        if (connectionReuseStrategy != null) {
            this.connStrategy = connectionReuseStrategy;
        } else {
            ore.p("Connection reuse strategy may not be null");
        }
    }

    public void setExpectationVerifier(HttpExpectationVerifier httpExpectationVerifier) {
        this.expectationVerifier = httpExpectationVerifier;
    }

    public void setHandlerResolver(HttpRequestHandlerResolver httpRequestHandlerResolver) {
        this.handlerResolver = httpRequestHandlerResolver;
    }

    public void setHttpProcessor(HttpProcessor httpProcessor) {
        if (httpProcessor != null) {
            this.processor = httpProcessor;
        } else {
            ore.p("HTTP processor may not be null.");
        }
    }

    public void setParams(HttpParams httpParams) {
        this.params = httpParams;
    }

    public void setResponseFactory(HttpResponseFactory httpResponseFactory) {
        if (httpResponseFactory != null) {
            this.responseFactory = httpResponseFactory;
        } else {
            ore.p("Response factory may not be null");
        }
    }
}
