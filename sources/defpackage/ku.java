package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ku extends gu {
    public final String b;
    public final ny8 c;
    public final z8l d;

    public ku(ny8 ny8Var, ny8 ny8Var2, Context context) {
        t3a t3aVar;
        super(ny8Var2);
        this.b = ku.class.getName();
        this.c = ny8Var;
        synchronized (cqk.class) {
            try {
                if (cqk.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    cqk.a = new t3a(new c1k(applicationContext != null ? applicationContext : context, false));
                }
                t3aVar = cqk.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = (z8l) ((lnk) t3aVar.a).zza();
    }

    @Override // defpackage.gu
    public final void a(Activity activity) {
        if (!((oqg) this.c.getValue()).e()) {
            sb8.P(new va(this, 6), activity, (String) this.a.getValue());
            return;
        }
        kam kamVarA = this.d.a();
        int i = 3;
        kamVarA.e(vjh.a, new ot4(i, new tc(this, i, activity)));
        kamVarA.k(new hu(activity, 0, this));
    }

    @Override // defpackage.gu
    public final Object b(Context context, nq4 nq4Var) {
        if (!((oqg) this.c.getValue()).e()) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Google services not available", null);
                }
            }
            return Boolean.FALSE;
        }
        ek2 ek2Var = new ek2(1, p90.B(nq4Var));
        ek2Var.u();
        kam kamVarA = this.d.a();
        kamVarA.e(vjh.a, new b1k(2, new iu(ek2Var, 0)));
        kamVarA.k(new ju(ek2Var));
        return ek2Var.s();
    }
}
