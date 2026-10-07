package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class q51 implements lj6 {
    public static final s8 k = new s8();
    public final jj6 a;
    public final int b;
    public final b87 c;
    public final SparseArray d;
    public final p51 e;
    public boolean f;
    public uvc g;
    public long h;
    public xbf i;
    public b87[] j;

    public q51(jj6 jj6Var, int i, b87 b87Var) {
        p51 p51Var = p51.b;
        this.a = jj6Var;
        this.b = i;
        this.c = b87Var;
        this.d = new SparseArray();
        this.e = p51Var;
    }

    @Override // defpackage.lj6
    public final void D() {
        SparseArray sparseArray = this.d;
        b87[] b87VarArr = new b87[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            b87 b87Var = ((o51) sparseArray.valueAt(i)).e;
            b87Var.getClass();
            b87VarArr[i] = b87Var;
        }
        this.j = b87VarArr;
    }

    @Override // defpackage.lj6
    public final kyh G(int i, int i2) {
        SparseArray sparseArray = this.d;
        o51 o51Var = (o51) sparseArray.get(i);
        if (o51Var == null) {
            lvb.b0(this.j == null);
            o51Var = new o51(i, i2, i2 == this.b ? this.c : null, this.e);
            uvc uvcVar = this.g;
            long j = this.h;
            if (uvcVar == null) {
                o51Var.f = o51Var.c;
            } else {
                o51Var.g = j;
                kyh kyhVarX = uvcVar.x(i2);
                o51Var.f = kyhVarX;
                b87 b87Var = o51Var.e;
                if (b87Var != null) {
                    kyhVarX.g(b87Var);
                }
            }
            sparseArray.put(i, o51Var);
        }
        return o51Var;
    }

    public final vq3 a() {
        xbf xbfVar = this.i;
        if (xbfVar instanceof vq3) {
            return (vq3) xbfVar;
        }
        if (xbfVar instanceof ro9) {
            return ((ro9) xbfVar).a;
        }
        return null;
    }

    public final void b(uvc uvcVar, long j, long j2) {
        this.g = uvcVar;
        this.h = j2;
        boolean z = this.f;
        jj6 jj6Var = this.a;
        if (!z) {
            jj6Var.A(this);
            if (j != -9223372036854775807L) {
                jj6Var.g(0L, j);
            }
            this.f = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        jj6Var.g(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i >= sparseArray.size()) {
                return;
            }
            o51 o51Var = (o51) sparseArray.valueAt(i);
            if (uvcVar == null) {
                o51Var.f = o51Var.c;
            } else {
                o51Var.g = j2;
                kyh kyhVarX = uvcVar.x(o51Var.a);
                o51Var.f = kyhVarX;
                b87 b87Var = o51Var.e;
                if (b87Var != null) {
                    kyhVarX.g(b87Var);
                }
            }
            i++;
        }
    }

    @Override // defpackage.lj6
    public final void r(xbf xbfVar) {
        this.i = xbfVar;
    }
}
