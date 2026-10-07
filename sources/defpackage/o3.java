package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class o3 {
    public final Context a;
    public final pzf b = e9i.b(0, Integer.MAX_VALUE, 1);
    public final String c;
    public final ry8 d;

    public o3(Context context, String str, cs6 cs6Var) {
        this.a = context;
        this.c = "Prefs/".concat(z5h.J0(str, ".prefs", ""));
        this.d = new ry8(context, new bs6(str), cs6Var, new v56(2, this), new g3(0, this), 8);
    }

    public void b() {
        gm0.m(this.c, "clear: %s", getClass().getSimpleName());
        zr6 zr6Var = (zr6) this.d.edit();
        zr6Var.clear();
        zr6Var.commit();
    }

    public final void c(String str, boolean z) {
        zr6 zr6Var = (zr6) this.d.edit();
        zr6Var.putBoolean(str, z);
        zr6Var.apply();
    }

    public final void d(int i, String str) {
        zr6 zr6Var = (zr6) this.d.edit();
        zr6Var.putInt(str, i);
        zr6Var.apply();
    }

    public final void e(String str, String str2) {
        zr6 zr6Var = (zr6) this.d.edit();
        zr6Var.putString(str, str2);
        zr6Var.apply();
    }
}
