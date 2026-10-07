package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class rwe {
    public final zvj a;
    public final ArrayList b = new ArrayList();

    public rwe(zvj zvjVar) {
        this.a = null;
        this.a = zvjVar;
    }

    public static long c(uh5 uh5Var, long j) {
        zvj zvjVar = uh5Var.d;
        ArrayList arrayList = uh5Var.k;
        if (zvjVar instanceof xu7) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            qh5 qh5Var = (qh5) arrayList.get(i);
            if (qh5Var instanceof uh5) {
                uh5 uh5Var2 = (uh5) qh5Var;
                if (uh5Var2.d != zvjVar) {
                    jMin = Math.min(jMin, c(uh5Var2, ((long) uh5Var2.f) + j));
                }
            }
        }
        uh5 uh5Var3 = zvjVar.i;
        uh5 uh5Var4 = zvjVar.h;
        if (uh5Var != uh5Var3) {
            return jMin;
        }
        long j2 = j - zvjVar.j();
        return Math.min(Math.min(jMin, c(uh5Var4, j2)), j2 - ((long) uh5Var4.f));
    }

    public static long d(uh5 uh5Var, long j) {
        zvj zvjVar = uh5Var.d;
        ArrayList arrayList = uh5Var.k;
        if (zvjVar instanceof xu7) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            qh5 qh5Var = (qh5) arrayList.get(i);
            if (qh5Var instanceof uh5) {
                uh5 uh5Var2 = (uh5) qh5Var;
                if (uh5Var2.d != zvjVar) {
                    jMax = Math.max(jMax, d(uh5Var2, ((long) uh5Var2.f) + j));
                }
            }
        }
        uh5 uh5Var3 = zvjVar.h;
        uh5 uh5Var4 = zvjVar.i;
        if (uh5Var != uh5Var3) {
            return jMax;
        }
        long j2 = zvjVar.j() + j;
        return Math.max(Math.max(jMax, d(uh5Var4, j2)), j2 - ((long) uh5Var4.f));
    }

    public final void a(zvj zvjVar) {
        this.b.add(zvjVar);
    }

    public final long b(ig4 ig4Var, int i) {
        float f;
        long j;
        zvj zvjVar = this.a;
        if (!(zvjVar instanceof wo2) ? i != 0 ? (zvjVar instanceof bti) : (zvjVar instanceof cz7) : ((wo2) zvjVar).f == i) {
            return 0L;
        }
        uh5 uh5Var = (i == 0 ? ig4Var.d : ig4Var.e).h;
        uh5 uh5Var2 = (i == 0 ? ig4Var.d : ig4Var.e).i;
        uh5 uh5Var3 = zvjVar.h;
        uh5 uh5Var4 = zvjVar.h;
        uh5 uh5Var5 = zvjVar.i;
        boolean zContains = uh5Var3.l.contains(uh5Var);
        boolean zContains2 = uh5Var5.l.contains(uh5Var2);
        long j2 = zvjVar.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(d(uh5Var4, uh5Var4.f), ((long) uh5Var4.f) + j2);
            }
            if (zContains2) {
                return Math.max(-c(uh5Var5, uh5Var5.f), ((long) (-uh5Var5.f)) + j2);
            }
            return (zvjVar.j() + ((long) uh5Var4.f)) - ((long) uh5Var5.f);
        }
        long jD = d(uh5Var4, 0L);
        long jC = c(uh5Var5, 0L);
        long j3 = jD - j2;
        int i2 = uh5Var5.f;
        if (j3 >= (-i2)) {
            j3 += (long) i2;
        }
        long j4 = uh5Var4.f;
        long j5 = ((-jC) - j2) - j4;
        if (j5 >= j4) {
            j5 -= j4;
        }
        hg4 hg4Var = zvjVar.b;
        if (i == 0) {
            f = hg4Var.c0;
        } else if (i == 1) {
            f = hg4Var.d0;
        } else {
            hg4Var.getClass();
            f = -1.0f;
        }
        if (f > 0.0f) {
            j = (long) ((j3 / (1.0f - f)) + (j5 / f));
        } else {
            j = 0;
        }
        float f2 = j;
        return (((long) uh5Var4.f) + ((((long) ((f2 * f) + 0.5f)) + j2) + ((long) c0a.c(1.0f, f, f2, 0.5f)))) - ((long) uh5Var5.f);
    }
}
