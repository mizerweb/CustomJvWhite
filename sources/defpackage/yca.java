package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class yca implements az4 {
    public static final l84 b = new l84(new p61(new f4a(17), lbb.a), new p61(new f4a(18), qpe.a));
    public final ArrayList a = new ArrayList();

    @Override // defpackage.az4
    public final boolean c(bz4 bz4Var, long j) {
        long j2 = bz4Var.b;
        lvb.R(j2 != -9223372036854775807L);
        lvb.R(bz4Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < bz4Var.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((bz4) arrayList.get(size)).b) {
                arrayList.add(size + 1, bz4Var);
                return z;
            }
        }
        arrayList.add(0, bz4Var);
        return z;
    }

    @Override // defpackage.az4
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.az4
    public final c98 k(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((bz4) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    bz4 bz4Var = (bz4) arrayList.get(i);
                    if (j >= bz4Var.b && j < bz4Var.d) {
                        arrayList2.add(bz4Var);
                    }
                    if (j < bz4Var.b) {
                        break;
                    }
                }
                ghe gheVarX = c98.x(arrayList2, b);
                z88 z88VarL = c98.l();
                for (int i2 = 0; i2 < gheVarX.d; i2++) {
                    z88VarL.f(((bz4) gheVarX.get(i2)).a);
                }
                return z88VarL.h();
            }
        }
        a98 a98Var = c98.b;
        return ghe.e;
    }

    @Override // defpackage.az4
    public final long l(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((bz4) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((bz4) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((bz4) arrayList.get(i)).b;
            long j3 = ((bz4) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // defpackage.az4
    public final long o(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((bz4) arrayList.get(i)).b;
            long j3 = ((bz4) arrayList.get(i)).d;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.az4
    public final void x(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((bz4) arrayList.get(i)).b;
            if (j > j2 && j > ((bz4) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
