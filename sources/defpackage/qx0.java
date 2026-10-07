package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class qx0 {
    public int a;
    public long b;
    public final int c;
    public final int d;
    public final ft0 e;

    public qx0(int i, int i2) {
        oc9.i(Boolean.valueOf(i > 0));
        oc9.i(Boolean.valueOf(i2 > 0));
        this.c = i;
        this.d = i2;
        this.e = new ft0(this);
    }

    public final synchronized void a(Bitmap bitmap) {
        int iD = oy0.d(bitmap);
        oc9.j("No bitmaps registered.", this.a > 0);
        long j = iD;
        oc9.k(j <= this.b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iD), Long.valueOf(this.b));
        this.b -= j;
        this.a--;
    }

    public final synchronized int b() {
        return this.a;
    }

    public final synchronized int c() {
        return this.c;
    }

    public final synchronized int d() {
        return this.d;
    }

    public final ft0 e() {
        return this.e;
    }

    public final synchronized long f() {
        return this.b;
    }

    public final synchronized boolean g(Bitmap bitmap) {
        int iD = oy0.d(bitmap);
        int i = this.a;
        if (i < this.c) {
            long j = this.b + ((long) iD);
            if (j <= this.d) {
                this.a = i + 1;
                this.b = j;
                return true;
            }
        }
        return false;
    }
}
