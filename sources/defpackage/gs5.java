package defpackage;

import android.os.Handler;
import android.util.SparseIntArray;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gs5 {
    public static final pe5 p;
    public final jy9 a;
    public final ur0 b;
    public final int c;
    public final ve5 d;
    public final due e;
    public final SparseIntArray f;
    public final Handler g;
    public boolean h;
    public boolean i;
    public g85 j;
    public fs5 k;
    public iyh[] l;
    public om9[] m;
    public List[][] n;
    public List[][] o;

    static {
        pe5 pe5Var = pe5.F0;
        pe5Var.getClass();
        oe5 oe5Var = new oe5(pe5Var);
        oe5Var.G = true;
        oe5Var.N = false;
        p = new pe5(oe5Var);
    }

    public gs5(ry9 ry9Var, ur0 ur0Var, pe5 pe5Var, due dueVar) {
        int i;
        jy9 jy9Var = ry9Var.b;
        jy9Var.getClass();
        this.a = jy9Var;
        this.b = ur0Var;
        if (ur0Var == null) {
            i = 0;
        } else {
            i = ur0Var instanceof yvd ? 1 : 2;
        }
        this.c = i;
        ve5 ve5Var = new ve5(pe5Var, new zpe(24), null);
        this.d = ve5Var;
        this.e = dueVar;
        this.f = new SparseIntArray();
        o75 o75Var = new o75(14);
        es5 es5Var = new es5();
        lvb.b0(ve5Var.a == null);
        ve5Var.a = o75Var;
        ve5Var.b = es5Var;
        this.g = vqi.q(null);
    }

    public static void a(gs5 gs5Var) {
        ve5 ve5Var = gs5Var.d;
        gs5Var.k.getClass();
        gs5Var.k.j.getClass();
        gs5Var.k.h.getClass();
        int i = gs5Var.c;
        boolean z = false;
        if (i == 2) {
            int length = gs5Var.k.j.length;
            int iE = gs5Var.e.E();
            gs5Var.n = (List[][]) Array.newInstance((Class<?>) List.class, length, iE);
            gs5Var.o = (List[][]) Array.newInstance((Class<?>) List.class, length, iE);
            for (int i2 = 0; i2 < length; i2++) {
                for (int i3 = 0; i3 < iE; i3++) {
                    gs5Var.n[i2][i3] = new ArrayList();
                    gs5Var.o[i2][i3] = Collections.unmodifiableList(gs5Var.n[i2][i3]);
                }
            }
            gs5Var.l = new iyh[length];
            gs5Var.m = new om9[length];
            for (int i4 = 0; i4 < length; i4++) {
                gs5Var.l[i4] = gs5Var.k.j[i4].t();
                Object obj = gs5Var.e(i4).f;
                ve5Var.getClass();
                om9 om9Var = (om9) obj;
                om9[] om9VarArr = gs5Var.m;
                om9Var.getClass();
                om9VarArr[i4] = om9Var;
            }
            gs5Var.h = true;
            gs5Var.i = true;
            z = true;
        } else {
            lvb.b0(i == 1);
            gs5Var.k.i.getClass();
            gs5Var.h = true;
        }
        Handler handler = gs5Var.g;
        handler.getClass();
        handler.post(new nb0(gs5Var, z, 5));
    }

    public final void b(int i, pe5 pe5Var) {
        ve5 ve5Var = this.d;
        ve5Var.c(pe5Var);
        e(i);
        pci it = pe5Var.H.values().iterator();
        while (it.hasNext()) {
            nyh nyhVar = (nyh) it.next();
            oe5 oe5Var = new oe5(pe5Var);
            oe5Var.f(nyhVar);
            ve5Var.c(oe5Var.b());
            e(i);
        }
    }

    public final void c() {
        lvb.b0(this.c == 2);
        lvb.b0(this.h);
        lvb.b0(this.i);
    }

    public final int d() {
        int i = this.c;
        if (i == 0) {
            return 0;
        }
        lvb.b0(i != 0);
        lvb.b0(this.h);
        return this.k.j.length;
    }

    public final vyh e(int i) {
        vyh vyhVarB = this.d.b(this.e.z(), this.l[i], new x4a(this.k.h.l(i)), this.k.h);
        for (int i2 = 0; i2 < vyhVarB.b; i2++) {
            rg6 rg6Var = ((rg6[]) vyhVarB.d)[i2];
            if (rg6Var != null) {
                List list = this.n[i][i2];
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        list.add(rg6Var);
                        break;
                    }
                    rg6 rg6Var2 = (rg6) list.get(i3);
                    if (rg6Var2.m().equals(rg6Var.m())) {
                        SparseIntArray sparseIntArray = this.f;
                        sparseIntArray.clear();
                        for (int i4 = 0; i4 < rg6Var2.length(); i4++) {
                            sparseIntArray.put(rg6Var2.e(i4), 0);
                        }
                        for (int i5 = 0; i5 < rg6Var.length(); i5++) {
                            sparseIntArray.put(rg6Var.e(i5), 0);
                        }
                        int[] iArr = new int[sparseIntArray.size()];
                        for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                            iArr[i6] = sparseIntArray.keyAt(i6);
                        }
                        list.set(i3, new ds5(0, rg6Var2.m(), iArr));
                        break;
                    }
                    i3++;
                }
            }
        }
        return vyhVarB;
    }
}
