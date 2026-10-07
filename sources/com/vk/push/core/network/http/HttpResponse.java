package com.vk.push.core.network.http;

import defpackage.cqk;
import defpackage.x05;
import defpackage.zo5;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\nR\u0011\u0010\u001e\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/vk/push/core/network/http/HttpResponse;", "", "", "body", "", "code", "message", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/vk/push/core/network/http/HttpResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBody", "b", "I", "getCode", DatabaseHelper.COMPRESSED_COLUMN_NAME, "getMessage", "isSuccessful", "()Z", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class HttpResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String body;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String message;

    public HttpResponse(String str, int i, String str2) {
        this.body = str;
        this.code = i;
        this.message = str2;
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = httpResponse.body;
        }
        if ((i2 & 2) != 0) {
            i = httpResponse.code;
        }
        if ((i2 & 4) != 0) {
            str2 = httpResponse.message;
        }
        return httpResponse.copy(str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final HttpResponse copy(String body, int code, String message) {
        return new HttpResponse(body, code, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) other;
        return this.body.equals(httpResponse.body) && this.code == httpResponse.code && cqk.d(this.message, httpResponse.message);
    }

    public final String getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iC = zo5.c(this.code, this.body.hashCode() * 31, 31);
        String str = this.message;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && i < 300;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse(body=");
        sb.append(this.body);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", message=");
        return x05.i(sb, this.message, ')');
    }
}
