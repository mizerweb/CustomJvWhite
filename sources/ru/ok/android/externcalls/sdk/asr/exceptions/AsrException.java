package ru.ok.android.externcalls.sdk.asr.exceptions;

import defpackage.j95;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u00020\u0006X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/exceptions/AsrException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "jsonObject", "Lorg/json/JSONObject;", "message", "", "cause", "", "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Throwable;)V", "getJsonObject", "()Lorg/json/JSONObject;", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AsrException extends RuntimeException {
    private final Throwable cause;
    private final JSONObject jsonObject;
    private final String message;

    public /* synthetic */ AsrException(JSONObject jSONObject, String str, Throwable th, int i, j95 j95Var) {
        this(jSONObject, (i & 2) != 0 ? jSONObject.toString() : str, (i & 4) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public AsrException(JSONObject jSONObject, String str) {
        this(jSONObject, str, null, 4, null);
    }

    public AsrException(JSONObject jSONObject, String str, Throwable th) {
        super(str, th);
        this.jsonObject = jSONObject;
        this.message = str;
        this.cause = th;
    }

    public AsrException(JSONObject jSONObject) {
        this(jSONObject, null, null, 6, null);
    }
}
