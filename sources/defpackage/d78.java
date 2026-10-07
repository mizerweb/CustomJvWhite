package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d78 {
    public final h85 a;
    public final lhb b;
    public final a8g c;
    public final j85 d;
    public final Context e;
    public final at5 f;
    public final dn5 g;
    public final ia5 h;
    public final ee6 i;
    public final lhb j;
    public final ia5 k;
    public final sm5 l;
    public final mhb m;
    public final sb8 n;
    public final bbd o;
    public final t3a p;
    public final Set q;
    public final Set r;
    public final c76 s;
    public final boolean t;
    public final sm5 u;
    public final f68 v;
    public final vbf w;
    public final boolean x;
    public final cy5 y;
    public final ku6 z;

    public d78(c78 c78Var) {
        lhb lhbVar;
        qe7.v();
        ks6 ks6Var = c78Var.l;
        vbf vbfVar = new vbf();
        Object obj = (c4h) ks6Var.a;
        vbfVar.a = obj == null ? new khb(18) : obj;
        vbfVar.b = (h85) ks6Var.b;
        vbfVar.c = (a8g) ks6Var.c;
        this.w = vbfVar;
        Object systemService = c78Var.b.getSystemService("activity");
        if (systemService == null) {
            ore.k("Required value was null.");
            throw null;
        }
        this.a = new h85(0, (ActivityManager) systemService);
        this.b = new lhb(14);
        this.c = new a8g(20);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        j85 j85Var = c78Var.a;
        if (j85Var == null) {
            synchronized (j85.class) {
                try {
                    if (j85.b == null) {
                        j85.b = new j85(0);
                    }
                    j85Var = j85.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = j85Var;
        this.e = c78Var.b;
        this.f = c78Var.c;
        this.h = new ia5(0);
        synchronized (lhb.class) {
            try {
                if (lhb.b == null) {
                    lhb.b = new lhb(0);
                }
                lhbVar = lhb.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.j = lhbVar;
        this.k = gm0.e;
        sm5 sm5Var = c78Var.e;
        if (sm5Var == null) {
            Context context = c78Var.b;
            qe7.v();
            sm5Var = new sm5(new rm5(context));
        }
        this.l = sm5Var;
        this.m = mhb.b();
        qe7.v();
        sb8 sb8Var = c78Var.f;
        this.n = sb8Var == null ? new o28() : sb8Var;
        bbd bbdVar = c78Var.g;
        bbdVar = bbdVar == null ? new bbd(new abd(new gvb())) : bbdVar;
        this.o = bbdVar;
        this.p = new t3a(19);
        Set set = c78Var.h;
        this.q = set == null ? c76.a : set;
        Set set2 = c78Var.i;
        this.r = set2 == null ? c76.a : set2;
        this.s = c76.a;
        this.t = true;
        sm5 sm5Var2 = c78Var.j;
        this.u = sm5Var2 != null ? sm5Var2 : sm5Var;
        this.v = c78Var.k;
        int i = bbdVar.a.c.d;
        ee6 ee6Var = c78Var.d;
        this.i = ee6Var == null ? new g85(i) : ee6Var;
        this.x = true;
        this.y = c78Var.m;
        this.z = new ku6(16);
        this.g = new dn5(new j85(17), this);
        qe7.v();
    }
}
