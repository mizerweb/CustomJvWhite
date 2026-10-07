package defpackage;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class tse implements fbh, ebh {
    public static final TreeMap h = new TreeMap();
    public volatile String a;
    public final long[] b;
    public final double[] c;
    public final String[] d;
    public final byte[][] e;
    public final int[] f;
    public int g;

    public tse(int i) {
        int i2 = i + 1;
        this.f = new int[i2];
        this.b = new long[i2];
        this.c = new double[i2];
        this.d = new String[i2];
        this.e = new byte[i2][];
    }

    @Override // defpackage.ebh
    public final void a(int i, double d) {
        this.f[i] = 3;
        this.c[i] = d;
    }

    @Override // defpackage.ebh
    public final void c(int i, long j) {
        this.f[i] = 2;
        this.b[i] = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ebh
    public final void d(int i, byte[] bArr) {
        this.f[i] = 5;
        this.e[i] = bArr;
    }

    @Override // defpackage.ebh
    public final void e(int i) {
        this.f[i] = 1;
    }

    @Override // defpackage.ebh
    public final void g0(int i, String str) {
        this.f[i] = 4;
        this.d[i] = str;
    }

    @Override // defpackage.fbh
    public final String l() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        ore.k("Required value was null.");
        return null;
    }

    @Override // defpackage.fbh
    public final void y(ebh ebhVar) {
        int i = this.g;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f[i2];
            if (i3 == 1) {
                ebhVar.e(i2);
            } else if (i3 == 2) {
                ebhVar.c(i2, this.b[i2]);
            } else if (i3 == 3) {
                ebhVar.a(i2, this.c[i2]);
            } else if (i3 == 4) {
                String str = this.d[i2];
                if (str == null) {
                    ore.p("Required value was null.");
                    return;
                }
                ebhVar.g0(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.e[i2];
                if (bArr == null) {
                    ore.p("Required value was null.");
                    return;
                }
                ebhVar.d(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }
}
