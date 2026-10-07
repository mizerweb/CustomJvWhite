package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class qyh {
    public boolean A;
    public c98 B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public HashMap H;
    public HashSet I;
    public int e;
    public int f;
    public int g;
    public int h;
    public c98 m;
    public c98 n;
    public c98 o;
    public int p;
    public c98 q;
    public c98 r;
    public int s;
    public int t;
    public int u;
    public c98 v;
    public pyh w;
    public boolean x;
    public c98 y;
    public int z;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;
    public boolean l = true;

    public qyh() {
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        this.m = gheVar;
        this.n = gheVar;
        this.o = gheVar;
        this.p = 0;
        this.q = gheVar;
        this.r = gheVar;
        this.s = 0;
        this.t = Integer.MAX_VALUE;
        this.u = Integer.MAX_VALUE;
        this.v = gheVar;
        this.w = pyh.d;
        this.x = false;
        this.y = gheVar;
        this.z = 0;
        this.A = true;
        this.B = gheVar;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static ghe e(String[] strArr) {
        z88 z88VarL = c98.l();
        for (String str : strArr) {
            str.getClass();
            z88VarL.c(vqi.Y(str));
        }
        return z88VarL.h();
    }

    public void a(nyh nyhVar) {
        this.H.put(nyhVar.a, nyhVar);
    }

    public ryh b() {
        return new ryh(this);
    }

    public qyh c() {
        this.H.clear();
        return this;
    }

    public final void d(ryh ryhVar) {
        this.a = ryhVar.a;
        this.b = ryhVar.b;
        this.c = ryhVar.c;
        this.d = ryhVar.d;
        this.e = ryhVar.e;
        this.f = ryhVar.f;
        this.g = ryhVar.g;
        this.h = ryhVar.h;
        this.i = ryhVar.i;
        this.j = ryhVar.j;
        this.k = ryhVar.k;
        this.l = ryhVar.l;
        this.n = ryhVar.n;
        this.m = ryhVar.m;
        this.o = ryhVar.o;
        this.p = ryhVar.p;
        this.q = ryhVar.q;
        this.s = ryhVar.s;
        this.r = ryhVar.r;
        this.t = ryhVar.t;
        this.u = ryhVar.u;
        this.v = ryhVar.v;
        this.w = ryhVar.w;
        this.x = ryhVar.x;
        this.y = ryhVar.y;
        this.z = ryhVar.A;
        this.A = ryhVar.B;
        this.B = ryhVar.z;
        this.C = ryhVar.C;
        this.D = ryhVar.D;
        this.E = ryhVar.E;
        this.F = ryhVar.F;
        this.G = ryhVar.G;
        this.I = new HashSet(ryhVar.I);
        this.H = new HashMap(ryhVar.H);
    }

    public qyh f(nyh nyhVar) {
        int iA = nyhVar.a();
        Iterator it = this.H.values().iterator();
        while (it.hasNext()) {
            if (((nyh) it.next()).a() == iA) {
                it.remove();
            }
        }
        this.H.put(nyhVar.a, nyhVar);
        return this;
    }

    public qyh g(String... strArr) {
        this.y = e(strArr);
        this.A = false;
        return this;
    }

    public void h(int i, boolean z) {
        HashSet hashSet = this.I;
        if (z) {
            hashSet.add(Integer.valueOf(i));
        } else {
            hashSet.remove(Integer.valueOf(i));
        }
    }
}
