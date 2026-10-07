package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class d2i {
    public static final ghe r;
    public final Context a;
    public String b;
    public String c;
    public b2i d;
    public ghe e;
    public final boolean f;
    public long g;
    public int h;
    public final u89 i;
    public final so2 j;
    public final lf5 k;
    public iu3 l;
    public p9b m;
    public final Looper n;
    public final p51 o;
    public final nfh p;
    public final i1m q;

    static {
        a98 a98Var = c98.b;
        Object[] objArr = {0, 90, 180, 270};
        ch3.e(objArr, 4);
        r = c98.j(objArr, 4);
    }

    public d2i(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.g = g2i.A;
        this.h = -1;
        ghe gheVar = ghe.e;
        this.j = new so2(22);
        k84 k84Var = new k84(2);
        k84Var.e = true;
        k84Var.f = true;
        k84Var.h = true;
        this.k = k84Var.b();
        this.l = new ka5(new ka5(applicationContext));
        this.m = new mc5();
        Looper looperB = vqi.B();
        this.n = looperB;
        this.o = p51.c;
        this.p = qt3.a;
        this.i = new u89(looperB);
        if (Build.VERSION.SDK_INT >= 35) {
            this.f = true;
            this.q = new i1m(context);
        }
        this.e = r;
    }

    public final g2i a() {
        p21 p21VarA;
        b2i b2iVar = this.d;
        if (b2iVar == null) {
            p21VarA = new p21();
            p21VarA.a = -1;
        } else {
            p21VarA = b2iVar.a();
        }
        String str = this.b;
        if (str != null) {
            p21VarA.d(str);
        }
        String str2 = this.c;
        if (str2 != null) {
            p21VarA.j(str2);
        }
        b2i b2iVarC = p21VarA.c();
        this.d = b2iVarC;
        String str3 = b2iVarC.b;
        if (str3 != null) {
            lvb.c0(this.m.a(uya.h(str3)).contains(str3), "Unsupported sample MIME type %s", str3);
        }
        String str4 = this.d.c;
        if (str4 != null) {
            lvb.c0(this.m.a(uya.h(str4)).contains(str4), "Unsupported sample MIME type %s", str4);
        }
        String.format("Muxer.Factory %s does not support writing negative timestamps to an edit list.", this.m);
        return new g2i(this.a, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }
}
