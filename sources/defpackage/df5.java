package defpackage;

import android.content.Context;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class df5 implements fn7 {
    public final due a;
    public final g7b b;
    public final wm7 c;
    public final r6a d;
    public final o02 e;
    public final SparseArray f;
    public boolean g;
    public final p11 h;
    public final c70 i;
    public final c70 j;
    public er3 k;
    public ex3 l;
    public EGLDisplay m;
    public EGLSurface n;
    public int o;

    public df5(Context context, xp9 xp9Var, ScheduledExecutorService scheduledExecutorService, due dueVar, g7b g7bVar) {
        this.a = dueVar;
        this.b = g7bVar;
        this.c = xp9Var;
        r6a r6aVar = new r6a();
        r6aVar.c = context;
        r6aVar.a = new jj0();
        this.d = r6aVar;
        this.o = -1;
        this.f = new SparseArray();
        this.h = new p11(false, 1);
        this.i = new c70(1);
        this.j = new c70(1);
        this.k = er3.m;
        o02 o02Var = new o02((ExecutorService) scheduledExecutorService, false, (owi) new s63(16, dueVar));
        this.e = o02Var;
        o02Var.q(new ye5(this, 1), true);
    }

    public final synchronized ghe a() {
        if (this.h.e() == 0) {
            a98 a98Var = c98.b;
            return ghe.e;
        }
        for (int i = 0; i < this.f.size(); i++) {
            if (((cf5) this.f.valueAt(i)).a.isEmpty()) {
                a98 a98Var2 = c98.b;
                return ghe.e;
            }
        }
        z88 z88Var = new z88(4);
        bf5 bf5Var = (bf5) ((cf5) this.f.get(this.o)).a.element();
        z88Var.c(bf5Var);
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (this.f.keyAt(i2) != this.o) {
                cf5 cf5Var = (cf5) this.f.valueAt(i2);
                if (cf5Var.a.size() == 1 && !cf5Var.b) {
                    a98 a98Var3 = c98.b;
                    return ghe.e;
                }
                Iterator it = cf5Var.a.iterator();
                long j = BuildConfig.MAX_TIME_TO_UPLOAD;
                bf5 bf5Var2 = null;
                while (it.hasNext()) {
                    bf5 bf5Var3 = (bf5) it.next();
                    long j2 = bf5Var3.b.b;
                    long jAbs = Math.abs(j2 - bf5Var.b.b);
                    if (jAbs < j) {
                        bf5Var2 = bf5Var3;
                        j = jAbs;
                    }
                    if (j2 > bf5Var.b.b || (!it.hasNext() && cf5Var.b)) {
                        bf5Var2.getClass();
                        z88Var.c(bf5Var2);
                        break;
                    }
                }
            }
        }
        ghe gheVarH = z88Var.h();
        if (gheVarH.d == this.f.size()) {
            return gheVarH;
        }
        return ghe.e;
    }

    public final synchronized void b() {
        try {
            ghe gheVarA = a();
            if (gheVarA.isEmpty()) {
                return;
            }
            bf5 bf5Var = (bf5) gheVarA.get(this.o);
            oc9.p(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            int i = 0;
            int i2 = 0;
            while (i < gheVarA.d) {
                dn7 dn7Var = ((bf5) gheVarA.get(i)).b.a;
                lag lagVar = new lag(dn7Var.c, dn7Var.d);
                int i3 = i2 + 1;
                int iB = r88.b(objArrCopyOf.length, i3);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i2] = lagVar;
                i++;
                i2 = i3;
            }
            er3 er3Var = this.k;
            ghe gheVarJ = c98.j(objArrCopyOf, i2);
            er3Var.getClass();
            lag lagVar2 = (lag) gheVarJ.get(0);
            this.h.d(this.c, lagVar2.a, lagVar2.b);
            dn7 dn7VarF = this.h.f();
            long j = bf5Var.b.b;
            this.i.b(j);
            this.d.y(gheVarA, dn7VarF);
            this.j.b(tab.m());
            this.b.a(this, dn7VarF, j);
            cf5 cf5Var = (cf5) this.f.get(this.o);
            e(cf5Var, 1);
            c();
            if (this.g && cf5Var.a.isEmpty()) {
                this.a.B();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        for (int i = 0; i < this.f.size(); i++) {
            if (this.f.keyAt(i) != this.o) {
                d((cf5) this.f.valueAt(i));
            }
        }
    }

    public final synchronized void d(cf5 cf5Var) {
        int iG;
        cf5 cf5Var2 = (cf5) this.f.get(this.o);
        if (cf5Var2.a.isEmpty() && cf5Var2.b) {
            e(cf5Var, cf5Var.a.size());
            return;
        }
        bf5 bf5Var = (bf5) cf5Var2.a.peek();
        final long j = bf5Var != null ? bf5Var.b.b : -9223372036854775807L;
        ArrayDeque arrayDeque = cf5Var.a;
        ddd dddVar = new ddd() { // from class: af5
            @Override // defpackage.ddd
            public final boolean apply(Object obj) {
                return ((bf5) obj).b.b <= j;
            }
        };
        arrayDeque.getClass();
        Iterable tn8Var = new tn8(arrayDeque, dddVar);
        if (tn8Var instanceof Collection) {
            iG = ((Collection) tn8Var).size();
        } else {
            Iterator it = tn8Var.iterator();
            long j2 = 0;
            while (true) {
                un8 un8Var = (un8) it;
                if (!un8Var.hasNext()) {
                    break;
                }
                un8Var.next();
                j2++;
            }
            iG = k4m.g(j2);
        }
        e(cf5Var, Math.max(iG - 1, 0));
    }

    public final synchronized void e(cf5 cf5Var, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            bf5 bf5Var = (bf5) cf5Var.a.remove();
            bf5Var.a.f(bf5Var.b.b);
        }
    }

    @Override // defpackage.fn7
    public final void f(long j) {
        this.e.q(new ze5(this, j, 0), true);
    }
}
