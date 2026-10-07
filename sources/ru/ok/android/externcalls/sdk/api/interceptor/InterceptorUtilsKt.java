package ru.ok.android.externcalls.sdk.api.interceptor;

import defpackage.fq;
import defpackage.op;
import defpackage.st0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lop;", "request", "", "getMethod", "(Lop;)Ljava/lang/String;", "calls-sdk"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class InterceptorUtilsKt {
    public static final String getMethod(op opVar) {
        if (opVar instanceof st0) {
            return null;
        }
        return fq.c(opVar.getUri());
    }
}
