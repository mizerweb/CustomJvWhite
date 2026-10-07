package org.apache.http.client;

import org.apache.http.ProtocolException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class NonRepeatableRequestException extends ProtocolException {
    private static final long serialVersionUID = 82685265288806048L;

    public NonRepeatableRequestException() {
    }

    public NonRepeatableRequestException(String str) {
        super(str);
    }
}
