package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class f94 extends e84 {
    public static final ry9 u;
    public final ArrayList k;
    public final HashSet l;
    public Handler m;
    public final ArrayList n;
    public final IdentityHashMap o;
    public final HashMap p;
    public final HashSet q;
    public boolean r;
    public HashSet s;
    public e4g t;

    static {
        jy9 jy9Var;
        by9 by9Var = new by9();
        fy9 fy9Var = new fy9();
        List list = Collections.EMPTY_LIST;
        ghe gheVar = ghe.e;
        hy9 hy9Var = new hy9();
        ly9 ly9Var = ly9.d;
        Uri uri = Uri.EMPTY;
        lvb.b0(fy9Var.b == null || fy9Var.a != null);
        gy9 gy9Var = null;
        if (uri != null) {
            if (fy9Var.a != null) {
                gy9Var = new gy9(fy9Var);
            }
            jy9Var = new jy9(uri, null, gy9Var, null, list, null, gheVar, -9223372036854775807L);
        } else {
            jy9Var = null;
        }
        u = new ry9("", new dy9(by9Var), jy9Var, new iy9(hy9Var), b0a.K, ly9Var);
    }

    public f94(ur0... ur0VarArr) {
        e4g e4gVar = new e4g();
        for (ur0 ur0Var : ur0VarArr) {
            ur0Var.getClass();
        }
        this.t = e4gVar.b.length > 0 ? e4gVar.a() : e4gVar;
        this.o = new IdentityHashMap();
        this.p = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.n = new ArrayList();
        this.s = new HashSet();
        this.l = new HashSet();
        this.q = new HashSet();
        List listAsList = Arrays.asList(ur0VarArr);
        synchronized (this) {
            D(arrayList.size(), listAsList, null);
        }
    }

    @Override // defpackage.e84
    public final void A(Object obj, ur0 ur0Var, ush ushVar) {
        a94 a94Var = (a94) obj;
        int i = a94Var.d + 1;
        ArrayList arrayList = this.n;
        if (i < arrayList.size()) {
            int iO = ushVar.o() - (((a94) arrayList.get(a94Var.d + 1)).e - a94Var.e);
            if (iO != 0) {
                E(a94Var.d + 1, 0, iO);
            }
        }
        H(null);
    }

    public final void C(int i, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a94 a94Var = (a94) it.next();
            int i2 = i + 1;
            ArrayList arrayList = this.n;
            if (i > 0) {
                a94 a94Var2 = (a94) arrayList.get(i - 1);
                int iO = a94Var2.a.o.e.o() + a94Var2.e;
                a94Var.d = i;
                a94Var.e = iO;
                a94Var.f = false;
                a94Var.c.clear();
            } else {
                a94Var.d = i;
                a94Var.e = 0;
                a94Var.f = false;
                a94Var.c.clear();
            }
            E(i, 1, a94Var.a.o.e.o());
            arrayList.add(i, a94Var);
            this.p.put(a94Var.b, a94Var);
            B(a94Var, a94Var.a);
            if (this.b.isEmpty() || !this.o.isEmpty()) {
                w(a94Var);
            } else {
                this.q.add(a94Var);
            }
            i = i2;
        }
    }

    public final void D(int i, List list, lg6 lg6Var) {
        lvb.R(true);
        Handler handler = this.m;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ur0) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new a94((ur0) it2.next()));
        }
        this.k.addAll(i, arrayList);
        if (handler == null || list.isEmpty()) {
            return;
        }
        handler.obtainMessage(1, new b94(i, arrayList, null)).sendToTarget();
    }

    public final void E(int i, int i2, int i3) {
        while (true) {
            ArrayList arrayList = this.n;
            if (i >= arrayList.size()) {
                return;
            }
            a94 a94Var = (a94) arrayList.get(i);
            a94Var.d += i2;
            a94Var.e += i3;
            i++;
        }
    }

    public final void F() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            a94 a94Var = (a94) it.next();
            if (a94Var.c.isEmpty()) {
                w(a94Var);
                it.remove();
            }
        }
    }

    public final synchronized void G(Set set) {
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((z84) it.next()).getClass();
            throw null;
        }
        this.l.removeAll(set);
    }

    public final void H(z84 z84Var) {
        if (this.r) {
            return;
        }
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(5).sendToTarget();
        this.r = true;
    }

    public final void I() {
        this.r = false;
        HashSet hashSet = this.s;
        this.s = new HashSet();
        p(new x84(this.n, this.t));
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(6, hashSet).sendToTarget();
    }

    @Override // defpackage.ur0
    public final u0a e(x4a x4aVar, qf qfVar, long j) {
        Object obj = x4aVar.a;
        int i = l0.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        x4a x4aVarA = x4aVar.a(pair.second);
        a94 a94Var = (a94) this.p.get(obj2);
        if (a94Var == null) {
            a94Var = new a94(new y84());
            a94Var.f = true;
            B(a94Var, a94Var.a);
        }
        this.q.add(a94Var);
        d84 d84Var = (d84) this.h.get(a94Var);
        d84Var.getClass();
        d84Var.a.h(d84Var.b);
        a94Var.c.add(x4aVarA);
        kn9 kn9VarE = a94Var.a.e(x4aVarA, qfVar, j);
        this.o.put(kn9VarE, a94Var);
        F();
        return kn9VarE;
    }

    @Override // defpackage.e84, defpackage.ur0
    public final void g() {
        super.g();
        this.q.clear();
    }

    @Override // defpackage.e84, defpackage.ur0
    public final void i() {
    }

    @Override // defpackage.ur0
    public final synchronized ush j() {
        e4g e4gVarB;
        try {
            int length = this.t.b.length;
            int size = this.k.size();
            e4gVarB = this.t;
            if (length != size) {
                e4gVarB = e4gVarB.a().b(0, this.k.size());
            }
        } catch (Throwable th) {
            throw th;
        }
        return new x84(this.k, e4gVarB);
    }

    @Override // defpackage.ur0
    public final ry9 k() {
        return u;
    }

    @Override // defpackage.ur0
    public final synchronized void o(v1i v1iVar) {
        try {
            this.j = v1iVar;
            this.i = vqi.p(null);
            this.m = new Handler(new w84(0, this));
            if (this.k.isEmpty()) {
                I();
            } else {
                this.t = this.t.b(0, this.k.size());
                C(0, this.k);
                H(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ur0
    public final void q(u0a u0aVar) {
        IdentityHashMap identityHashMap = this.o;
        a94 a94Var = (a94) identityHashMap.remove(u0aVar);
        a94Var.getClass();
        a94Var.a.q(u0aVar);
        ArrayList arrayList = a94Var.c;
        arrayList.remove(((kn9) u0aVar).a);
        if (!identityHashMap.isEmpty()) {
            F();
        }
        if (a94Var.f && arrayList.isEmpty()) {
            this.q.remove(a94Var);
            d84 d84Var = (d84) this.h.remove(a94Var);
            d84Var.getClass();
            ur0 ur0Var = d84Var.a;
            ur0Var.r(d84Var.b);
            c84 c84Var = d84Var.c;
            ur0Var.u(c84Var);
            ur0Var.t(c84Var);
        }
    }

    @Override // defpackage.e84, defpackage.ur0
    public final synchronized void s() {
        try {
            super.s();
            this.n.clear();
            this.q.clear();
            this.p.clear();
            this.t = this.t.a();
            Handler handler = this.m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.m = null;
            }
            this.r = false;
            this.s.clear();
            G(this.l);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.e84
    public final x4a x(Object obj, x4a x4aVar) {
        a94 a94Var = (a94) obj;
        for (int i = 0; i < a94Var.c.size(); i++) {
            if (((x4a) a94Var.c.get(i)).d == x4aVar.d) {
                Object obj2 = x4aVar.a;
                Object obj3 = a94Var.b;
                int i2 = l0.g;
                return x4aVar.a(Pair.create(obj3, obj2));
            }
        }
        return null;
    }

    @Override // defpackage.e84
    public final int z(int i, Object obj) {
        return i + ((a94) obj).e;
    }
}
