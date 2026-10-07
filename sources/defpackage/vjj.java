package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class vjj extends lc6 {
    public final /* synthetic */ yjj b;

    public vjj(yjj yjjVar) {
        this.b = yjjVar;
    }

    public static final String f(vjj vjjVar, y8e y8eVar) {
        return vjjVar.b.b(y8eVar.b.a.h);
    }

    @Override // defpackage.lc6
    public final void a(y8e y8eVar) {
        String str = this.b.g;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, qv1.k("Call end: ", f(this, y8eVar)), null);
        }
    }

    @Override // defpackage.lc6
    public final void b(y8e y8eVar, IOException iOException) {
        String str = this.b.g;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, nbh.w("Call (url=", f(this, y8eVar), ") failed with error=", iOException.getMessage(), "}"), null);
        }
    }

    @Override // defpackage.lc6
    public final void c(y8e y8eVar) {
        String str = this.b.g;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, qv1.k("Call start: ", f(this, y8eVar)), null);
        }
    }

    @Override // defpackage.lc6
    public final void d(y8e y8eVar, IOException iOException) {
        String str = this.b.g;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, qv1.l("Connect (url=", f(this, y8eVar), ") failed with error: ", iOException.getMessage()), null);
        }
    }

    @Override // defpackage.lc6
    public final void e(pne pneVar) {
        int i = pneVar.d;
        if (i != 307 && i != 308) {
            switch (i) {
            }
            return;
        }
        yjj yjjVar = this.b;
        String str = yjjVar.g;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            String strA = pneVar.f.a("Location");
            if (strA == null) {
                strA = null;
            }
            a4cVar.c(je9Var, str, qv1.k("Redirect to ", strA != null ? yjjVar.b(strA) : null), null);
        }
    }
}
