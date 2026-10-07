package org.apache.http.impl;

import defpackage.ore;
import java.io.IOException;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.HttpRequestParser;
import org.apache.http.impl.io.HttpResponseWriter;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractHttpServerConnection implements HttpServerConnection {
    private SessionInputBuffer inbuffer = null;
    private SessionOutputBuffer outbuffer = null;
    private HttpMessageParser requestParser = null;
    private HttpMessageWriter responseWriter = null;
    private HttpConnectionMetricsImpl metrics = null;
    private final EntitySerializer entityserializer = createEntitySerializer();
    private final EntityDeserializer entitydeserializer = createEntityDeserializer();

    public abstract void assertOpen() throws IllegalStateException;

    public EntityDeserializer createEntityDeserializer() {
        return new EntityDeserializer(new LaxContentLengthStrategy());
    }

    public EntitySerializer createEntitySerializer() {
        return new EntitySerializer(new StrictContentLengthStrategy());
    }

    public HttpRequestFactory createHttpRequestFactory() {
        return new DefaultHttpRequestFactory();
    }

    public HttpMessageParser createRequestParser(SessionInputBuffer sessionInputBuffer, HttpRequestFactory httpRequestFactory, HttpParams httpParams) {
        return new HttpRequestParser(sessionInputBuffer, null, httpRequestFactory, httpParams);
    }

    public HttpMessageWriter createResponseWriter(SessionOutputBuffer sessionOutputBuffer, HttpParams httpParams) {
        return new HttpResponseWriter(sessionOutputBuffer, null, httpParams);
    }

    public void doFlush() throws IOException {
        this.outbuffer.flush();
    }

    @Override // org.apache.http.HttpServerConnection
    public void flush() throws IOException {
        assertOpen();
        doFlush();
    }

    @Override // org.apache.http.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        return this.metrics;
    }

    public void init(SessionInputBuffer sessionInputBuffer, SessionOutputBuffer sessionOutputBuffer, HttpParams httpParams) {
        if (sessionInputBuffer == null) {
            ore.p("Input session buffer may not be null");
            return;
        }
        if (sessionOutputBuffer == null) {
            ore.p("Output session buffer may not be null");
            return;
        }
        this.inbuffer = sessionInputBuffer;
        this.outbuffer = sessionOutputBuffer;
        this.requestParser = createRequestParser(sessionInputBuffer, createHttpRequestFactory(), httpParams);
        this.responseWriter = createResponseWriter(sessionOutputBuffer, httpParams);
        this.metrics = new HttpConnectionMetricsImpl(sessionInputBuffer.getMetrics(), sessionOutputBuffer.getMetrics());
    }

    @Override // org.apache.http.HttpConnection
    public boolean isStale() {
        assertOpen();
        try {
            this.inbuffer.isDataAvailable(1);
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    @Override // org.apache.http.HttpServerConnection
    public void receiveRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) throws HttpException, IOException {
        if (httpEntityEnclosingRequest == null) {
            ore.p("HTTP request may not be null");
        } else {
            assertOpen();
            httpEntityEnclosingRequest.setEntity(this.entitydeserializer.deserialize(this.inbuffer, httpEntityEnclosingRequest));
        }
    }

    @Override // org.apache.http.HttpServerConnection
    public HttpRequest receiveRequestHeader() throws HttpException, IOException {
        assertOpen();
        HttpRequest httpRequest = (HttpRequest) this.requestParser.parse();
        this.metrics.incrementRequestCount();
        return httpRequest;
    }

    @Override // org.apache.http.HttpServerConnection
    public void sendResponseEntity(HttpResponse httpResponse) throws HttpException, IOException {
        if (httpResponse.getEntity() == null) {
            return;
        }
        this.entityserializer.serialize(this.outbuffer, httpResponse, httpResponse.getEntity());
    }

    @Override // org.apache.http.HttpServerConnection
    public void sendResponseHeader(HttpResponse httpResponse) throws HttpException, IOException {
        if (httpResponse == null) {
            ore.p("HTTP response may not be null");
            return;
        }
        assertOpen();
        this.responseWriter.write(httpResponse);
        if (httpResponse.getStatusLine().getStatusCode() >= 200) {
            this.metrics.incrementResponseCount();
        }
    }
}
