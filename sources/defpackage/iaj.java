package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class iaj {
    public final String a;
    public final yp7 b;
    public final gu4 c;
    public final int d;
    public final Object e;
    public boolean f;
    public daj g;
    public final pzf h;
    public final xx6 i;
    public jh2 j;
    public sgg k;
    public m9b l;

    public iaj(String str, yp7 yp7Var, gu4 gu4Var) {
        this.a = str;
        this.b = yp7Var;
        this.c = gu4Var;
        g40 g40Var = haj.a;
        g40Var.getClass();
        this.d = g40.b.incrementAndGet(g40Var);
        this.e = new Object();
        pzf pzfVarB = e9i.b(1, 3, 4);
        this.h = pzfVarB;
        this.i = e9i.I(pzfVarB);
        uh2 uh2Var = uh2.a;
        this.j = uh2Var;
        if (pzfVarB.a(uh2Var)) {
            return;
        }
        ore.k("Check failed.");
        throw null;
    }

    public final void a(ne2 ne2Var) {
        jh2 jh2Var;
        synchronized (this.e) {
            try {
                if (this.f) {
                    return;
                }
                this.f = true;
                Log.i("CXCP", "Disconnecting " + this);
                daj dajVar = this.g;
                if (dajVar != null) {
                    synchronized (dajVar.b) {
                        dajVar.c = true;
                    }
                }
                sgg sggVar = this.k;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                m9b m9bVar = this.l;
                if (m9bVar != null) {
                    m9bVar.b();
                }
                synchronized (this.e) {
                    jh2Var = this.j;
                }
                if (!(jh2Var instanceof mh2)) {
                    if (!(jh2Var instanceof nh2)) {
                        b(new nh2(null));
                    }
                    b(new mh2(this.a, 2, null, null, null, null, null, null, ne2Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(jh2 jh2Var) {
        this.j = jh2Var;
        if (this.h.a(jh2Var)) {
            return;
        }
        throw new IllegalStateException(("Failed to emit " + jh2Var + " in " + this).toString());
    }

    public final String toString() {
        return "VirtualCamera-" + this.d;
    }
}
