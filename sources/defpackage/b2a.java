package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b2a {
    public final w7b a;
    public final String b = b2a.class.getName();
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final dq4 m;
    public volatile s1a n;
    public final mjg o;
    public volatile p20 p;
    public volatile boolean q;
    public final AtomicReference r;
    public sgg s;
    public sgg t;
    public sgg u;
    public final p3c v;
    public final p3c w;
    public final v1a x;
    public final r8e y;
    public static final /* synthetic */ zv8[] z = {new z8b(b2a.class, "createJob", "getCreateJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, b2a.class, "nextJob", "getNextJob()Lkotlinx/coroutines/Job;")};
    public static final Set A = a.p1(new w50[]{w50.VIDEO_MSG, w50.AUDIO});

    public b2a(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, w7b w7bVar) {
        this.a = w7bVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
        this.g = ny8Var5;
        this.h = ny8Var6;
        this.i = ny8Var7;
        this.j = ny8Var9;
        this.k = ny8Var8;
        this.l = ny8Var10;
        xt4 xt4VarA = ((n0c) ((xhh) ny8Var8.getValue())).a();
        vt4 vt4Var = (vt4) ny8Var11.getValue();
        xt4VarA.getClass();
        dq4 dq4VarA = cqk.a(lvb.x0(xt4VarA, vt4Var));
        this.m = dq4VarA;
        mjg mjgVarA = p90.a(new t1a(0L, (LinkedHashSet) null, 7));
        this.o = mjgVarA;
        this.r = new AtomicReference(null);
        this.v = qyj.S();
        this.w = qyj.S();
        this.x = new v1a(this);
        this.y = e9i.G0(new yo0(mjgVarA, 6), dq4VarA, j0g.a, l4d.c);
    }

    public static final void a(b2a b2aVar, Long l) {
        long j = ((t1a) b2aVar.o.getValue()).a;
        if (j == 0 || l == null || j != l.longValue()) {
            return;
        }
        gm0.n(b2aVar.b, "Try play next from media playlist");
        b2aVar.h();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object b(b2a b2aVar, t1a t1aVar, rt2 rt2Var, nq4 nq4Var) {
        w1a w1aVar;
        long jLongValue;
        rt2 rt2Var2;
        if (nq4Var instanceof w1a) {
            w1aVar = (w1a) nq4Var;
            int i = w1aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1aVar.h = i - Integer.MIN_VALUE;
            } else {
                w1aVar = new w1a(b2aVar, nq4Var);
            }
        } else {
            w1aVar = new w1a(b2aVar, nq4Var);
        }
        w1a w1aVar2 = w1aVar;
        Object objF = w1aVar2.f;
        int i2 = w1aVar2.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objF);
            jLongValue = ((Number) b2aVar.e(t1aVar).a).longValue();
            if (jLongValue != 0) {
                sua suaVar = (sua) b2aVar.h.getValue();
                rt2Var2 = rt2Var;
                w1aVar2.d = rt2Var2;
                w1aVar2.e = jLongValue;
                w1aVar2.h = 1;
                objF = suaVar.f(jLongValue, w1aVar2);
                if (objF != hu4Var) {
                }
                return hu4Var;
            }
            return sbiVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objF);
                return sbiVar;
            }
            if (i2 == 3) {
                ch3.d0(objF);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jLongValue = w1aVar2.e;
        rt2Var2 = w1aVar2.d;
        ch3.d0(objF);
        sfa sfaVar = (sfa) objF;
        if (sfaVar != null && sfaVar.I()) {
            hyi hyiVar = (hyi) b2aVar.c.getValue();
            long j = rt2Var2.a;
            w1aVar2.d = null;
            w1aVar2.e = jLongValue;
            w1aVar2.h = 2;
            if (hyiVar.c(j, jLongValue, d3j.MEDIA_PLAYLIST, w1aVar2) == hu4Var) {
                return hu4Var;
            }
            return sbiVar;
        }
        if (sfaVar != null && sfaVar.J()) {
            e70 e70VarK = sfaVar.k(y60.e);
            if (e70VarK == null) {
                ore.p("Required value was null.");
                return null;
            }
            m80 m80Var = (m80) b2aVar.f.getValue();
            long j2 = sfaVar.h;
            String str = e70VarK.t;
            w1aVar2.d = null;
            w1aVar2.e = jLongValue;
            w1aVar2.h = 3;
            if (m80Var.e(j2, str, jLongValue, ns5.MEDIA_PLAYLIST, new vi2(20), new va(22), w1aVar2) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    public final void c() throws IllegalAccessException, InvocationTargetException {
        w7b w7bVar = this.a;
        v1a v1aVar = this.x;
        xte xteVar = w7bVar.a;
        synchronized (xteVar.i) {
            tte tteVar = (tte) xteVar.j.remove(v1aVar);
            if (tteVar != null) {
                xteVar.i.remove(tteVar);
            }
        }
        sgg sggVar = this.u;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.u = null;
        sgg sggVar2 = this.s;
        if (sggVar2 != null) {
            sggVar2.b(null);
        }
        sgg sggVar3 = this.t;
        if (sggVar3 != null) {
            sggVar3.b(null);
        }
        p3c p3cVar = this.v;
        zv8[] zv8VarArr = z;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8VarArr[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        vo8 vo8Var2 = (vo8) this.w.m(this, zv8VarArr[1]);
        if (vo8Var2 != null) {
            vo8Var2.b(null);
        }
        this.n = null;
        mjg mjgVar = this.o;
        t1a t1aVar = new t1a(0L, (LinkedHashSet) null, 7);
        mjgVar.getClass();
        mjgVar.j(null, t1aVar);
        p20 p20Var = this.p;
        if (p20Var != null) {
            p20Var.c();
        }
        this.p = null;
        this.q = false;
        this.r.set(null);
    }

    public final void d(long j, mg5 mg5Var, long j2, boolean z2) {
        boolean z3;
        s1a s1aVar;
        s1a s1aVar2;
        Object value;
        if (!((nni) this.l.getValue()).d.getBoolean("app.media.autoplay.playlist", true)) {
            c();
            return;
        }
        s1a s1aVar3 = this.n;
        if (s1aVar3 == null || s1aVar3.b != j || (s1aVar = this.n) == null || s1aVar.a != j2 || (s1aVar2 = this.n) == null) {
            z3 = z2;
        } else {
            z3 = z2;
            if (s1aVar2.c == z3) {
                t1a t1aVar = (t1a) this.o.getValue();
                if (!t1aVar.b.isEmpty()) {
                    mjg mjgVar = this.o;
                    do {
                        value = mjgVar.getValue();
                    } while (!mjgVar.h(value, t1a.a(t1aVar, j2, null, null, 6)));
                }
                gm0.n(this.b, "Skip create playlist because click on same initial message");
                return;
            }
        }
        sgg sggVar = this.u;
        if (sggVar == null || !sggVar.isActive()) {
            this.a.a(this.x);
            this.u = e9i.j0(new fz6(new xc3(((d0j) this.d.getValue()).j, 15), new y1a(this, null, 1), 3), this.m);
        }
        this.v.B(this, z[0], yab.i0(this.m, null, 2, new u1a(this, j2, j, z3, mg5Var, null), 1));
    }

    public final ylc e(t1a t1aVar) {
        LinkedHashSet linkedHashSet = t1aVar.b;
        long j = t1aVar.a;
        long j2 = 0;
        if (linkedHashSet.isEmpty() || (linkedHashSet.size() == 1 && linkedHashSet.contains(Long.valueOf(j)))) {
            gm0.n(this.b, "Can't play next because playlist is empty");
            return new ylc(0L, -1);
        }
        Iterator it = linkedHashSet.iterator();
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            long jLongValue = ((Number) it.next()).longValue();
            if (jLongValue == j) {
                z2 = true;
            } else if (z2) {
                i = i2;
                j2 = jLongValue;
                break;
            }
            i2 = i3;
        }
        return new ylc(Long.valueOf(j2), Integer.valueOf(i));
    }

    public final r8e f() {
        return this.y;
    }

    public final boolean g(long j) {
        t1a t1aVar = (t1a) this.o.getValue();
        ylc ylcVarE = e(t1aVar);
        LinkedHashSet linkedHashSet = t1aVar.b;
        if (((Number) ylcVarE.a).longValue() == 0) {
            if (!linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = 0;
                        break;
                    }
                    int i2 = i + 1;
                    if (j == ((Number) it.next()).longValue()) {
                        break;
                    }
                    i = i2;
                }
                if (i == linkedHashSet.size() - 1) {
                }
            }
            return false;
        }
        return true;
    }

    public final void h() {
        sgg sggVarI0 = yab.i0(this.m, null, 2, new uz8(this, null), 1);
        this.w.B(this, z[1], sggVarI0);
    }
}
