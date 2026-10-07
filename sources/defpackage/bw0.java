package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class bw0 implements baa {
    public final long a;
    public final p63 b;
    public final xhh c;
    public final int d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final dq4 h;
    public final mjg i;
    public final r8e j;
    public final mjg k;
    public final r8e l;
    public final AtomicLong m;
    public final AtomicLong n;
    public final AtomicBoolean o;
    public final String p;

    public bw0(long j, p63 p63Var, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, int i) {
        this.a = j;
        this.b = p63Var;
        this.c = xhhVar;
        this.d = i;
        this.e = ny8Var3;
        this.f = ny8Var2;
        this.g = ny8Var;
        n0c n0cVar = (n0c) xhhVar;
        dq4 dq4VarA = cqk.a(n0cVar.b());
        this.h = dq4VarA;
        mjg mjgVarA = p90.a(r66.a);
        this.i = mjgVarA;
        this.j = new r8e(mjgVarA);
        lq4 lq4Var = null;
        mjg mjgVarA2 = p90.a(null);
        this.k = mjgVarA2;
        mjg mjgVarA3 = p90.a(null);
        this.l = new r8e(mjgVarA3);
        this.m = new AtomicLong(0L);
        this.n = new AtomicLong(0L);
        this.o = new AtomicBoolean(false);
        String name = bw0.class.getName();
        this.p = name;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, nbh.s(j, "Init big members loader chat(localId = ", ")"), null);
            }
        }
        yab.i0(dq4VarA, null, 0, new f00(ny8Var, this, ny8Var4, lq4Var, 6), 3);
        int i2 = 2;
        e9i.j0(e9i.T(new fz6(new ie(e9i.I(e9i.F(mjgVarA2, 200L)), this, i2), new m20(i2, mjgVarA3, f9b.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), 3), n0cVar.b()), dq4VarA);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public static final Object h(bw0 bw0Var, String str, long j, nq4 nq4Var) {
        zv0 zv0Var;
        long j2;
        Object objA;
        long j3;
        q63 q63Var;
        long j4;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        String str2;
        a4c a4cVar;
        je9 je9Var = je9.d;
        if (nq4Var instanceof zv0) {
            zv0Var = (zv0) nq4Var;
            int i = zv0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                zv0Var.j = i - Integer.MIN_VALUE;
            } else {
                zv0Var = new zv0(bw0Var, nq4Var);
            }
        } else {
            zv0Var = new zv0(bw0Var, nq4Var);
        }
        zv0 zv0Var2 = zv0Var;
        Object obj = zv0Var2.h;
        Object obj2 = hu4.a;
        int i2 = zv0Var2.j;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = zv0Var2.g;
                j3 = zv0Var2.f;
                ch3.d0(obj);
                objA = ((roe) obj).a;
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = zv0Var2.f;
                linkedHashMap = zv0Var2.e;
                q63Var = zv0Var2.d;
                ch3.d0(obj);
            }
            arrayList = new ArrayList();
            for (Object obj3 : (Iterable) obj) {
                if (!((vg4) obj3).I()) {
                    arrayList.add(obj3);
                }
            }
            str2 = bw0Var.p;
            a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, qt4.k(q63Var.d, ". New marker = ", c0a.q(arrayList.size(), j4, "For marker = ", ", we loaded contacts = ")), null);
            }
            return new xv0(q63Var.d, arrayList, linkedHashMap);
        }
        ch3.d0(obj);
        rt2 rt2Var = (rt2) ((xn3) bw0Var.g.getValue()).k(bw0Var.a).a.getValue();
        if (rt2Var == null) {
            gm0.Y(bw0.class.getName(), "Early return in internalLoadByPage cuz of chatFlow is null");
            return null;
        }
        long jA = rt2Var.A();
        String str3 = bw0Var.p;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            boolean z = str == null || str.length() == 0;
            int i3 = bw0Var.d;
            StringBuilder sb = new StringBuilder("Start loading contacts page. Has query = ");
            sb.append(!z);
            sb.append(", marker = ");
            sb.append(j);
            a4cVar2.c(je9Var, str3, zo5.v(sb, ", limit = ", i3), null);
        }
        gm7 gm7Var = (gm7) bw0Var.e.getValue();
        p63 p63Var = bw0Var.b;
        Integer num = new Integer(bw0Var.d);
        if (num.intValue() == Integer.MAX_VALUE) {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : -1;
        zv0Var2.f = j;
        zv0Var2.g = jA;
        zv0Var2.j = 1;
        j2 = jA;
        objA = gm7Var.a(j2, p63Var, j, str, iIntValue, zv0Var2);
        if (objA != obj2) {
            j3 = j;
        }
        return obj2;
        if (objA instanceof poe) {
            objA = null;
        }
        q63 q63Var2 = (q63) objA;
        if (q63Var2 == null) {
            gm0.Y(bw0.class.getName(), "Early return in internalLoadByPage cuz of response is null");
            return null;
        }
        List list = q63Var2.c;
        ArrayList arrayList2 = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0a.t(((o63) it.next()).a.a, arrayList2);
        }
        List list2 = q63Var2.c;
        int iP0 = wm9.P0(yw3.W0(list2, 10));
        if (iP0 < 16) {
            iP0 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP0);
        for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
            o63 o63Var = (o63) it2.next();
            linkedHashMap2.put(new Long(o63Var.a.a), new ylc(new Long(o63Var.d), new Long(o63Var.e)));
        }
        zv0Var2.d = q63Var2;
        zv0Var2.e = linkedHashMap2;
        zv0Var2.f = j3;
        zv0Var2.g = j2;
        zv0Var2.j = 2;
        Object objI = bw0Var.i(arrayList2, zv0Var2);
        if (objI != obj2) {
            q63Var = q63Var2;
            obj = objI;
            j4 = j3;
            linkedHashMap = linkedHashMap2;
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                if (!((vg4) obj3).I()) {
                    arrayList.add(obj3);
                }
            }
            str2 = bw0Var.p;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                a4cVar.c(je9Var, str2, qt4.k(q63Var.d, ". New marker = ", c0a.q(arrayList.size(), j4, "For marker = ", ", we loaded contacts = ")), null);
            }
            return new xv0(q63Var.d, arrayList, linkedHashMap);
        }
        return obj2;
    }

    @Override // defpackage.baa
    public final boolean a() {
        boolean z = this.m.get() != -1;
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("canLoadNext = ", z), null);
            }
        }
        return z;
    }

    @Override // defpackage.baa
    public final r8e b() {
        return this.j;
    }

    @Override // defpackage.baa
    public final xx6 c() {
        return this.l;
    }

    @Override // defpackage.baa
    public final void cancel() {
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "cancel loader", null);
            }
        }
        this.m.set(0L);
        this.n.set(0L);
        vd7.d(this.h.a);
    }

    @Override // defpackage.baa
    public final void d() {
        long andSet = this.n.getAndSet(0L);
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(andSet, "Reload last page. Marker = "), null);
            }
        }
        this.m.updateAndGet(new w53(andSet));
        g();
    }

    @Override // defpackage.baa
    public final void e(String str) {
        this.k.setValue(str);
    }

    @Override // defpackage.baa
    public final void g() {
        if (this.o.compareAndSet(false, true)) {
            yab.i0(this.h, null, 0, new vq(this, (lq4) null, 3), 3).Y(new m(17, this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ArrayList arrayList, nq4 nq4Var) {
        yv0 yv0Var;
        if (nq4Var instanceof yv0) {
            yv0Var = (yv0) nq4Var;
            int i = yv0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                yv0Var.f = i - Integer.MIN_VALUE;
            } else {
                yv0Var = new yv0(this, nq4Var);
            }
        } else {
            yv0Var = new yv0(this, nq4Var);
        }
        Object objC = yv0Var.d;
        int i2 = yv0Var.f;
        if (i2 == 0) {
            ch3.d0(objC);
            vt4 vt4VarA = ((n0c) this.c).a();
            if (vt4VarA == null) {
                vt4VarA = yv0Var.getContext();
            }
            dq4 dq4VarA = cqk.a(vt4VarA);
            ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(yab.h(dq4VarA, null, 0, new i26(it.next(), (lq4) null, this), 3));
            }
            yv0Var.f = 1;
            objC = ch3.c(arrayList2, yv0Var);
            hu4 hu4Var = hu4.a;
            if (objC == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objC);
        }
        return ww3.o1((Iterable) objC);
    }
}
