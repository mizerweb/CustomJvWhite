package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dd6 {
    public final ifh a;
    public final mjg b;
    public final AtomicBoolean c;

    public dd6(Context context, ite iteVar, xt4 xt4Var) {
        this.a = new ifh(new rgb(context, 4));
        mjg mjgVarA = p90.a(0);
        this.b = mjgVarA;
        this.c = new AtomicBoolean(false);
        xx6 xx6VarI = e9i.I(new fz6(new fz6(mjgVarA, new wyj(this, null, 8), 1), new qob(this, (lq4) null, 22)));
        ghb ghbVar = ew5.b;
        e9i.j0(e9i.T(new fz6(new jz(e9i.G(xx6VarI, qe7.O(1, lw5.SECONDS)), 10), new qn6(this, (lq4) null, 15), 3), xt4Var), iteVar);
    }

    public final SharedPreferences a() {
        return (SharedPreferences) this.a.getValue();
    }

    public final void b() {
        gm0.Y(dd6.class.getName(), "safeClear");
        try {
            SharedPreferences sharedPreferencesA = a();
            if (sharedPreferencesA != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                editorEdit.clear();
                editorEdit.apply();
            }
        } catch (Throwable unused) {
        }
    }
}
