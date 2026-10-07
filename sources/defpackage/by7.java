package defpackage;

import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class by7 implements xye {
    public final int a;
    public final fy7 b;
    public int c = -1;

    public by7(fy7 fy7Var, int i) {
        this.b = fy7Var;
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void a() {
        lvb.R(this.c == -1);
        fy7 fy7Var = this.b;
        fy7Var.f();
        fy7Var.K.getClass();
        int[] iArr = fy7Var.K;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = fy7Var.Z;
            if (zArr[i2]) {
                i2 = -2;
            } else {
                zArr[i2] = true;
            }
        } else if (fy7Var.J.contains(fy7Var.I.a(i))) {
            i2 = -3;
        } else {
            i2 = -2;
        }
        this.c = i2;
    }

    @Override // defpackage.xye
    public final void b() throws IOException {
        int i = this.c;
        fy7 fy7Var = this.b;
        if (i == -2) {
            fy7Var.f();
            throw new SampleQueueMappingException(c0a.o("Unable to bind a sample queue to TrackGroup with MIME type ", fy7Var.I.a(this.a).d[0].n, "."));
        }
        if (i == -1) {
            fy7Var.H();
        } else if (i != -3) {
            fy7Var.H();
            fy7Var.v[i].z();
        }
    }

    public final boolean c() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.xye
    public final int f(v2a v2aVar, u55 u55Var, int i) {
        b87 b87Var;
        if (this.c == -3) {
            u55Var.a(4);
            return -4;
        }
        if (c()) {
            int i2 = this.c;
            fy7 fy7Var = this.b;
            ArrayList arrayList = fy7Var.n;
            if (!fy7Var.E()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((ix7) arrayList.get(i4)).k;
                        int length = fy7Var.v.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (fy7Var.Z[i6] && fy7Var.v[i6].B() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    vqi.f0(0, i4, arrayList);
                    ix7 ix7Var = (ix7) arrayList.get(0);
                    b87 b87Var2 = ix7Var.d;
                    if (!b87Var2.equals(fy7Var.G)) {
                        fy7Var.k.E(fy7Var.b, b87Var2, ix7Var.e, ix7Var.f, ix7Var.g);
                    }
                    fy7Var.G = b87Var2;
                }
                if (arrayList.isEmpty() || ((ix7) arrayList.get(0)).f()) {
                    int iC = fy7Var.v[i2].C(v2aVar, u55Var, i, fy7Var.s1);
                    if (iC == -5) {
                        b87 b87VarF = (b87) v2aVar.c;
                        b87VarF.getClass();
                        if (i2 == fy7Var.B) {
                            int iB = k4m.b(fy7Var.v[i2].B());
                            while (i3 < arrayList.size() && ((ix7) arrayList.get(i3)).k != iB) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                b87Var = ((ix7) arrayList.get(i3)).d;
                            } else {
                                b87Var = fy7Var.F;
                                b87Var.getClass();
                            }
                            b87VarF = b87VarF.f(b87Var);
                        }
                        v2aVar.c = b87VarF;
                    }
                    return iC;
                }
            }
        }
        return -3;
    }

    @Override // defpackage.xye
    public final boolean m() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i = this.c;
        fy7 fy7Var = this.b;
        return !fy7Var.E() && fy7Var.v[i].x(fy7Var.s1);
    }

    @Override // defpackage.xye
    public final int o(long j) throws Throwable {
        if (!c()) {
            return 0;
        }
        int i = this.c;
        fy7 fy7Var = this.b;
        if (fy7Var.E()) {
            return 0;
        }
        ey7 ey7Var = fy7Var.v[i];
        int iV = ey7Var.v(j, fy7Var.s1);
        ArrayList arrayList = fy7Var.n;
        Object next = null;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            next = arrayList.get(arrayList.size() - 1);
        }
        ix7 ix7Var = (ix7) next;
        if (ix7Var != null && !ix7Var.f()) {
            iV = Math.min(iV, ix7Var.e(i) - ey7Var.t());
        }
        ey7Var.G(iV);
        return iV;
    }
}
