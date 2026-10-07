package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hbh extends jbh {
    public int[] d;
    public long[] e;
    public double[] f;
    public String[] g;
    public byte[][] h;
    public Cursor i;

    public hbh(id7 id7Var, String str) {
        super(id7Var, str);
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.h = new byte[0][];
    }

    public static void E(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            n1g.a0(25, "column index out of range");
            throw null;
        }
    }

    public final void A() {
        if (this.i == null) {
            this.i = this.a.W(new pgg(this));
        }
    }

    @Override // defpackage.vxe
    public final void B(int i, String str) {
        l();
        y(3, i);
        this.d[i] = 3;
        this.g[i] = str;
    }

    @Override // defpackage.vxe
    public final String B0(int i) {
        l();
        Cursor cursorI = I();
        E(cursorI, i);
        return cursorI.getString(i);
    }

    public final Cursor I() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        n1g.a0(21, "no row");
        throw null;
    }

    @Override // defpackage.vxe
    public final boolean M0() {
        l();
        A();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        ore.k("Required value was null.");
        return false;
    }

    @Override // defpackage.vxe
    public final void a(int i, double d) {
        l();
        y(2, i);
        this.d[i] = 2;
        this.f[i] = d;
    }

    @Override // defpackage.vxe
    public final void c(int i, long j) {
        l();
        y(1, i);
        this.d[i] = 1;
        this.e[i] = j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            u();
            reset();
        }
        this.c = true;
    }

    @Override // defpackage.vxe
    public final void d(int i, byte[] bArr) {
        l();
        y(4, i);
        this.d[i] = 4;
        this.h[i] = bArr;
    }

    @Override // defpackage.vxe
    public final void e(int i) {
        l();
        y(5, i);
        this.d[i] = 5;
    }

    @Override // defpackage.vxe
    public final byte[] getBlob(int i) {
        l();
        Cursor cursorI = I();
        E(cursorI, i);
        return cursorI.getBlob(i);
    }

    @Override // defpackage.vxe
    public final int getColumnCount() {
        l();
        A();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.vxe
    public final String getColumnName(int i) {
        l();
        A();
        Cursor cursor = this.i;
        if (cursor != null) {
            E(cursor, i);
            return cursor.getColumnName(i);
        }
        ore.k("Required value was null.");
        return null;
    }

    @Override // defpackage.vxe
    public final double getDouble(int i) {
        l();
        Cursor cursorI = I();
        E(cursorI, i);
        return cursorI.getDouble(i);
    }

    @Override // defpackage.vxe
    public final long getLong(int i) {
        l();
        Cursor cursorI = I();
        E(cursorI, i);
        return cursorI.getLong(i);
    }

    @Override // defpackage.vxe
    public final boolean isNull(int i) {
        l();
        Cursor cursorI = I();
        E(cursorI, i);
        return cursorI.isNull(i);
    }

    @Override // defpackage.jbh, defpackage.vxe
    public final void reset() {
        l();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.jbh, defpackage.vxe
    public final void u() {
        l();
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.h = new byte[0][];
    }

    public final void y(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.d;
        if (iArr.length < i3) {
            this.d = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.e;
            if (jArr.length < i3) {
                this.e = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f;
            if (dArr.length < i3) {
                this.f = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.g;
            if (strArr.length < i3) {
                this.g = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.h;
        if (bArr.length < i3) {
            this.h = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }
}
