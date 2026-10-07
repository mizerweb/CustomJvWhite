package defpackage;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class so implements Provider {
    public volatile ro a;
    public final /* synthetic */ xe4 b;

    public so(xe4 xe4Var) {
        this.b = xe4Var;
    }

    public final ro a() {
        xe4 xe4Var = this.b;
        to toVarA = xe4Var.a();
        if (((uvc) xe4Var.b) == null) {
            xe4Var.b = xo.q(uo.e.d("CMBGJFMGDIHBABABA"));
        }
        uvc uvcVar = (uvc) xe4Var.b;
        if (((wp) xe4Var.f) == null) {
            if (((fvb) xe4Var.g) != null) {
                to toVarA2 = xe4Var.a();
                if (((String) xe4Var.a) == null) {
                    xe4Var.a = "test";
                }
                xe4Var.f = new dc9(toVarA2, (String) xe4Var.a, (fvb) xe4Var.g);
            } else {
                to toVarA3 = xe4Var.a();
                if (((String) xe4Var.a) == null) {
                    xe4Var.a = "test";
                }
                String str = (String) xe4Var.a;
                xe4Var.f = new kzi(str != null ? str : "test", toVarA3);
            }
        }
        return no.b(toVarA, uvcVar, (wp) xe4Var.f);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }
}
