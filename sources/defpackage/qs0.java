package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qs0 implements rg6 {
    public final hyh a;
    public final int b;
    public final int[] c;
    public final b87[] d;
    public final long[] e;
    public int f;

    public qs0(int i, hyh hyhVar, int[] iArr) {
        b87[] b87VarArr;
        int i2 = 0;
        lvb.b0(iArr.length > 0);
        hyhVar.getClass();
        this.a = hyhVar;
        int length = iArr.length;
        this.b = length;
        this.d = new b87[length];
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            b87VarArr = this.d;
            if (i3 >= length2) {
                break;
            }
            b87VarArr[i3] = hyhVar.d[iArr[i3]];
            i3++;
        }
        Arrays.sort(b87VarArr, new ps0(i2));
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 >= i4) {
                this.e = new long[i4];
                return;
            } else {
                this.c[i2] = hyhVar.b(this.d[i2]);
                i2++;
            }
        }
    }

    @Override // defpackage.rg6
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.rg6
    public final b87 d(int i) {
        return this.d[i];
    }

    @Override // defpackage.rg6
    public final int e(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            qs0 qs0Var = (qs0) obj;
            if (this.a.equals(qs0Var.a) && Arrays.equals(this.c, qs0Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rg6
    public void f() {
    }

    @Override // defpackage.rg6
    public final boolean g(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zA) {
            zA = (i2 == i || a(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], vqi.a(jElapsedRealtime, j));
        return true;
    }

    @Override // defpackage.rg6
    public void h(float f) {
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.rg6
    public final int k(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.rg6
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.rg6
    public final hyh m() {
        return this.a;
    }

    @Override // defpackage.rg6
    public final int n(b87 b87Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == b87Var) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.rg6
    public final void o(boolean z) {
    }

    @Override // defpackage.rg6
    public void p() {
    }

    @Override // defpackage.rg6
    public int q(long j, List list) {
        return list.size();
    }

    @Override // defpackage.rg6
    public final int r() {
        return this.c[b()];
    }

    @Override // defpackage.rg6
    public final b87 s() {
        return this.d[b()];
    }
}
