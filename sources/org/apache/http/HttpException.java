package org.apache.http;

import org.apache.http.util.ExceptionUtils;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class HttpException extends Exception {
    private static final long serialVersionUID = -5437299376222011036L;

    public HttpException(String str, Throwable th) {
        super(str);
        ExceptionUtils.initCause(this, th);
    }

    public HttpException(String str) {
        super(str);
    }

    public HttpException() {
    }
}
