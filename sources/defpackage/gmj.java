package defpackage;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class gmj {
    public final qsj a;

    public gmj(qsj qsjVar) {
        this.a = qsjVar;
    }

    @JavascriptInterface
    public final void trackFcp(long j) {
        qsj qsjVar = this.a;
        String str = qsjVar.g;
        owh owhVar = str != null ? new owh(str) : null;
        String str2 = owhVar != null ? owhVar.a : null;
        if (str2 != null && str2.length() != 0) {
            qsjVar.i(str2, new ylc("fcp", Long.valueOf(j)));
            return;
        }
        String str3 = qsjVar.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str3, "Invoked 'fcp', but traceId is null or empty!", null);
        }
    }
}
