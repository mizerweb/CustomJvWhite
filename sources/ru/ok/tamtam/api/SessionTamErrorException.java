package ru.ok.tamtam.api;

import defpackage.thh;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/api/SessionTamErrorException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "tamtam-java-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SessionTamErrorException extends RuntimeException {
    public final thh a;

    public SessionTamErrorException(thh thhVar) {
        this.a = thhVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        thh thhVar = this.a;
        String str = thhVar.c;
        if (str != null) {
            return str;
        }
        String str2 = thhVar.b;
        return str2 == null ? "TamError in session" : str2;
    }
}
