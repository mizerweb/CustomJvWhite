package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class dg5 implements scg {
    public final cg5 a;
    public scg b;

    public dg5(cg5 cg5Var) {
        this.a = cg5Var;
    }

    @Override // defpackage.scg
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // defpackage.scg
    public final boolean b() {
        return true;
    }

    @Override // defpackage.scg
    public final String c(SSLSocket sSLSocket) {
        scg scgVarE = e(sSLSocket);
        if (scgVarE != null) {
            return scgVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.scg
    public final void d(SSLSocket sSLSocket, String str, List list) {
        scg scgVarE = e(sSLSocket);
        if (scgVarE != null) {
            scgVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized scg e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.d(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
