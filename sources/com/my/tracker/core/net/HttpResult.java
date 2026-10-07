package com.my.tracker.core.net;

/* JADX INFO: loaded from: classes.dex */
public final class HttpResult {
    public final String error;
    public final String response;
    public final boolean successful;

    public HttpResult(boolean z, String str, String str2) {
        this.successful = z;
        this.response = str;
        this.error = str2;
    }
}
