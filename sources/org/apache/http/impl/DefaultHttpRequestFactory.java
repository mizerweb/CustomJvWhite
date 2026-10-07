package org.apache.http.impl;

import defpackage.ore;
import defpackage.zo5;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.message.BasicHttpRequest;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DefaultHttpRequestFactory implements HttpRequestFactory {
    private static final String[] RFC2616_COMMON_METHODS = {HttpGet.METHOD_NAME};
    private static final String[] RFC2616_ENTITY_ENC_METHODS = {HttpPost.METHOD_NAME, HttpPut.METHOD_NAME};
    private static final String[] RFC2616_SPECIAL_METHODS = {HttpHead.METHOD_NAME, HttpOptions.METHOD_NAME, HttpDelete.METHOD_NAME, HttpTrace.METHOD_NAME};

    private static boolean isOneOf(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.http.HttpRequestFactory
    public HttpRequest newHttpRequest(RequestLine requestLine) throws MethodNotSupportedException {
        if (requestLine == null) {
            ore.p("Request line may not be null");
            return null;
        }
        String method = requestLine.getMethod();
        if (isOneOf(RFC2616_COMMON_METHODS, method)) {
            return new BasicHttpRequest(requestLine);
        }
        if (isOneOf(RFC2616_ENTITY_ENC_METHODS, method)) {
            return new BasicHttpEntityEnclosingRequest(requestLine);
        }
        if (isOneOf(RFC2616_SPECIAL_METHODS, method)) {
            return new BasicHttpRequest(requestLine);
        }
        throw new MethodNotSupportedException(zo5.o(method, " method not supported"));
    }

    @Override // org.apache.http.HttpRequestFactory
    public HttpRequest newHttpRequest(String str, String str2) throws MethodNotSupportedException {
        if (isOneOf(RFC2616_COMMON_METHODS, str)) {
            return new BasicHttpRequest(str, str2);
        }
        if (isOneOf(RFC2616_ENTITY_ENC_METHODS, str)) {
            return new BasicHttpEntityEnclosingRequest(str, str2);
        }
        if (isOneOf(RFC2616_SPECIAL_METHODS, str)) {
            return new BasicHttpRequest(str, str2);
        }
        throw new MethodNotSupportedException(zo5.o(str, " method not supported"));
    }
}
