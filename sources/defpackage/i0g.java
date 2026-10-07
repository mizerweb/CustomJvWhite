package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i0g {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public i0g() {
        this.c = new long[10];
        this.d = new Object[10];
    }

    public synchronized void a(long j, Object obj) {
        int i = this.b;
        if (i > 0) {
            if (j <= ((long[]) this.c)[((this.a + i) - 1) % ((Object[]) this.d).length]) {
                synchronized (this) {
                    this.a = 0;
                    this.b = 0;
                    Arrays.fill((Object[]) this.d, (Object) null);
                }
            }
        }
        b();
        int i2 = this.a;
        int i3 = this.b;
        Object[] objArr = (Object[]) this.d;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.c)[length] = j;
        objArr[length] = obj;
        this.b = i3 + 1;
    }

    public void b() {
        int length = ((Object[]) this.d).length;
        if (this.b < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.a;
        int i3 = length - i2;
        System.arraycopy((long[]) this.c, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.d, this.a, objArr, 0, i3);
        int i4 = this.a;
        if (i4 > 0) {
            System.arraycopy((long[]) this.c, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.d, 0, objArr, i3, this.a);
        }
        this.c = jArr;
        this.d = objArr;
        this.a = 0;
    }

    public synchronized Object c() {
        return this.b == 0 ? null : e();
    }

    public synchronized Object d(long j) {
        Object objE;
        objE = null;
        while (this.b > 0 && j - ((long[]) this.c)[this.a] >= 0) {
            objE = e();
        }
        return objE;
    }

    public Object e() {
        lvb.b0(this.b > 0);
        Object[] objArr = (Object[]) this.d;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = (i + 1) % objArr.length;
        this.b--;
        return obj;
    }

    public synchronized int f() {
        return this.b;
    }

    public i0g(int i, int i2, vt4 vt4Var, xx6 xx6Var) {
        this.c = xx6Var;
        this.a = i;
        this.b = i2;
        this.d = vt4Var;
    }
}
