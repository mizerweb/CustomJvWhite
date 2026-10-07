package defpackage;

import android.webkit.WebView;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class zmj extends WebView.VisualStateCallback {
    public final /* synthetic */ WebAppRootScreen a;

    public zmj(WebAppRootScreen webAppRootScreen) {
        this.a = webAppRootScreen;
    }

    @Override // android.webkit.WebView.VisualStateCallback
    public final void onComplete(long j) {
        if (j == 99991) {
            qsj qsjVar = this.a.m;
            String str = qsjVar.g;
            owh owhVar = str != null ? new owh(str) : null;
            String str2 = owhVar != null ? owhVar.a : null;
            if (str2 == null || str2.length() == 0) {
                String str3 = qsjVar.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str3, "Invoked 'webapp_first_paint', but traceId is null or empty!", null);
                    }
                }
            } else {
                qsjVar.h = true;
                qrc.k(qsjVar, "first_paint", 1, str2, false, null, null, 120);
            }
            this.a.q = null;
        }
    }
}
