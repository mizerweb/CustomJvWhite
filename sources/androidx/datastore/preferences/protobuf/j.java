package androidx.datastore.preferences.protobuf;

import defpackage.b1k;
import defpackage.c71;
import defpackage.qr7;
import defpackage.vu3;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class j {
    public static final j f = new j(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public j(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static j b() {
        return new j(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iM;
        int iO;
        int i;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = this.b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.c[i4]).getClass();
                    i = vu3.i(i6);
                } else if (i7 == 2) {
                    i = vu3.f(i6, (c71) this.c[i4]);
                } else if (i7 == 3) {
                    iM = vu3.m(i6) * 2;
                    iO = ((j) this.c[i4]).a();
                } else {
                    if (i7 != 5) {
                        qr7.w(InvalidProtocolBufferException.b());
                        return 0;
                    }
                    ((Integer) this.c[i4]).getClass();
                    i = vu3.h(i6);
                }
                i3 = i + i3;
            } else {
                long jLongValue = ((Long) this.c[i4]).longValue();
                iM = vu3.m(i6);
                iO = vu3.o(jLongValue);
            }
            i3 = iO + iM + i3;
        }
        this.d = i3;
        return i3;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final void d(b1k b1kVar) {
        if (this.a == 0) {
            return;
        }
        b1kVar.getClass();
        vu3 vu3Var = (vu3) b1kVar.b;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                vu3Var.J(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                vu3Var.y(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                b1kVar.H(i3, (c71) obj);
            } else if (i4 == 3) {
                vu3Var.G(i3, 3);
                ((j) obj).d(b1kVar);
                vu3Var.G(i3, 4);
            } else {
                if (i4 != 5) {
                    qr7.o(InvalidProtocolBufferException.b());
                    return;
                }
                vu3Var.w(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        int i = this.a;
        if (i == jVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = jVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = jVar.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
