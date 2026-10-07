package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class sif implements dk5, SharedPreferences.OnSharedPreferenceChangeListener {
    public final et3 a;
    public final ny8 b;
    public final long c;
    public final long d;
    public final mjg e;
    public final r8e f;

    /* JADX WARN: Multi-variable type inference failed */
    public sif(ny8 ny8Var, et3 et3Var) {
        this.a = et3Var;
        this.b = ny8Var;
        AtomicLong atomicLong = ej5.b;
        this.c = atomicLong.incrementAndGet();
        this.d = atomicLong.incrementAndGet();
        mjg mjgVarA = p90.a(d());
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
        o3 o3Var = et3Var instanceof o3 ? (o3) et3Var : null;
        if (o3Var != null) {
            o3Var.d.registerOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // defpackage.dk5
    public final gjg a() {
        return this.f;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        long j = e55Var.a;
        boolean zA = ej5.a(j, this.c);
        ny8 ny8Var = this.b;
        if (zA) {
            o65 o65Var = (o65) ny8Var.getValue();
            ij5.c.getClass();
            o65.c(o65Var, v65.a(ij5.k.a), null, null, 6);
        } else if (ej5.a(j, this.d)) {
            o65 o65Var2 = (o65) ny8Var.getValue();
            ij5.c.getClass();
            o65.c(o65Var2, v65.a(ij5.l.a), null, null, 6);
        }
    }

    public final List d() {
        xb9 xb9Var = (xb9) this.a;
        String strW = xb9Var.W();
        if (strW == null) {
            strW = "";
        }
        e55 e55Var = new e55(this.c, new xnh(strW), 0, new xnh("Адрес сервера"), null, 20);
        String strX = xb9Var.X();
        return xw3.P0(e55Var, new e55(this.d, new xnh(strX != null ? strX : ""), 0, new xnh("Порт сервера"), null, 20));
    }

    @Override // defpackage.dk5
    public final void onDestroy() {
        Object obj = this.a;
        o3 o3Var = obj instanceof o3 ? (o3) obj : null;
        if (o3Var != null) {
            o3Var.d.unregisterOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List listD = d();
        mjg mjgVar = this.e;
        mjgVar.getClass();
        mjgVar.j(null, listD);
    }
}
