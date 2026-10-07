package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class sm5 {
    public final int a;
    public final String b;
    public final oah c;
    public final long d;
    public final long e;
    public final long f;
    public final ghb g;
    public final ghb h;
    public final n71 i;
    public final Context j;

    public sm5(rm5 rm5Var) {
        ghb ghbVar;
        Context context = rm5Var.h;
        this.j = context;
        oah oahVar = rm5Var.b;
        int i = 0;
        if (!((oahVar == null && context == null) ? false : true)) {
            ore.k("Either a non-null context or a base directory path or supplier must be provided.");
            throw null;
        }
        if (oahVar == null && context != null) {
            rm5Var.b = new qm5(this);
        }
        this.a = 1;
        this.b = rm5Var.a;
        oah oahVar2 = rm5Var.b;
        oahVar2.getClass();
        this.c = oahVar2;
        this.d = rm5Var.c;
        this.e = rm5Var.d;
        this.f = rm5Var.e;
        this.g = rm5Var.f;
        synchronized (ghb.class) {
            try {
                if (ghb.b == null) {
                    ghb.b = new ghb(i);
                }
                ghbVar = ghb.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.h = ghbVar;
        n71 n71Var = rm5Var.g;
        this.i = n71Var == null ? hhb.b() : n71Var;
        synchronized (khb.class) {
            if (khb.b == null) {
                khb.b = new khb(i);
            }
        }
    }
}
