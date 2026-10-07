package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.vk.push.core.base.AidlException;

/* JADX INFO: loaded from: classes3.dex */
public final class dkg extends sia {
    public int a = 0;
    public long b = 0;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public long f = 0;
    public long g = 0;
    public long h = 0;
    public long i = 0;
    public long j = 0;
    public int k = 0;
    public boolean l = false;
    public int m = 0;
    public String[] n = sb8.h;
    public long o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public long t = 0;

    public dkg() {
        this.cachedSize = -1;
    }

    public static dkg a(byte[] bArr) {
        return (dkg) sia.mergeFrom(new dkg(), bArr);
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int i = this.a;
        int i2 = 0;
        int iF = i != 0 ? uu3.f(1, i) : 0;
        long j = this.b;
        if (j != 0) {
            iF += uu3.h(2, j);
        }
        long j2 = this.c;
        if (j2 != 0) {
            iF += uu3.h(3, j2);
        }
        long j3 = this.d;
        if (j3 != 0) {
            iF += uu3.h(4, j3);
        }
        long j4 = this.e;
        if (j4 != 0) {
            iF += uu3.h(5, j4);
        }
        long j5 = this.f;
        if (j5 != 0) {
            iF += uu3.h(6, j5);
        }
        long j6 = this.g;
        if (j6 != 0) {
            iF += uu3.h(7, j6);
        }
        long j7 = this.h;
        if (j7 != 0) {
            iF += uu3.h(8, j7);
        }
        long j8 = this.i;
        if (j8 != 0) {
            iF += uu3.h(9, j8);
        }
        long j9 = this.j;
        if (j9 != 0) {
            iF += uu3.h(10, j9);
        }
        int i3 = this.k;
        if (i3 != 0) {
            iF += uu3.f(11, i3);
        }
        if (this.l) {
            iF += uu3.a(12);
        }
        int i4 = this.m;
        if (i4 != 0) {
            iF += uu3.f(13, i4);
        }
        String[] strArr = this.n;
        if (strArr != null && strArr.length > 0) {
            int iJ = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.n;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i5++;
                    int iQ = uu3.q(str);
                    iJ = uu3.j(iQ) + iQ + iJ;
                }
                i2++;
            }
            iF = iF + iJ + i5;
        }
        long j10 = this.o;
        if (j10 != 0) {
            iF += uu3.h(15, j10);
        }
        int i6 = this.p;
        if (i6 != 0) {
            iF += uu3.f(16, i6);
        }
        int i7 = this.q;
        if (i7 != 0) {
            iF += uu3.f(17, i7);
        }
        int i8 = this.r;
        if (i8 != 0) {
            iF += uu3.f(18, i8);
        }
        int i9 = this.s;
        if (i9 != 0) {
            iF += uu3.f(19, i9);
        }
        long j11 = this.t;
        return j11 != 0 ? uu3.h(20, j11) + iF : iF;
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            switch (iS) {
                case 0:
                    break;
                case 8:
                    this.a = su3Var.p();
                    break;
                case 16:
                    this.b = su3Var.q();
                    break;
                case 24:
                    this.c = su3Var.q();
                    break;
                case 32:
                    this.d = su3Var.q();
                    break;
                case 40:
                    this.e = su3Var.q();
                    break;
                case 48:
                    this.f = su3Var.q();
                    break;
                case 56:
                    this.g = su3Var.q();
                    break;
                case 64:
                    this.h = su3Var.q();
                    break;
                case 72:
                    this.i = su3Var.q();
                    break;
                case 80:
                    this.j = su3Var.q();
                    break;
                case 88:
                    this.k = su3Var.p();
                    break;
                case 96:
                    this.l = su3Var.f();
                    break;
                case AidlException.SDK_IS_NOT_INITIALIZED /* 104 */:
                    this.m = su3Var.p();
                    break;
                case 114:
                    int I = sb8.I(su3Var, 114);
                    String[] strArr = this.n;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = I + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = su3Var.r();
                        su3Var.s();
                        length++;
                    }
                    strArr2[length] = su3Var.r();
                    this.n = strArr2;
                    break;
                case 120:
                    this.o = su3Var.q();
                    break;
                case np0.m /* 128 */:
                    this.p = su3Var.p();
                    break;
                case 136:
                    this.q = su3Var.p();
                    break;
                case 144:
                    this.r = su3Var.p();
                    break;
                case 152:
                    this.s = su3Var.p();
                    break;
                case 160:
                    this.t = su3Var.q();
                    break;
                default:
                    if (!su3Var.u(iS)) {
                    }
                    break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        int i = this.a;
        if (i != 0) {
            uu3Var.w(1, i);
        }
        long j = this.b;
        if (j != 0) {
            uu3Var.x(2, j);
        }
        long j2 = this.c;
        if (j2 != 0) {
            uu3Var.x(3, j2);
        }
        long j3 = this.d;
        if (j3 != 0) {
            uu3Var.x(4, j3);
        }
        long j4 = this.e;
        if (j4 != 0) {
            uu3Var.x(5, j4);
        }
        long j5 = this.f;
        if (j5 != 0) {
            uu3Var.x(6, j5);
        }
        long j6 = this.g;
        if (j6 != 0) {
            uu3Var.x(7, j6);
        }
        long j7 = this.h;
        if (j7 != 0) {
            uu3Var.x(8, j7);
        }
        long j8 = this.i;
        if (j8 != 0) {
            uu3Var.x(9, j8);
        }
        long j9 = this.j;
        if (j9 != 0) {
            uu3Var.x(10, j9);
        }
        int i2 = this.k;
        if (i2 != 0) {
            uu3Var.w(11, i2);
        }
        boolean z = this.l;
        if (z) {
            uu3Var.r(12, z);
        }
        int i3 = this.m;
        if (i3 != 0) {
            uu3Var.w(13, i3);
        }
        String[] strArr = this.n;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.n;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    uu3Var.E(14, str);
                }
                i4++;
            }
        }
        long j10 = this.o;
        if (j10 != 0) {
            uu3Var.x(15, j10);
        }
        int i5 = this.p;
        if (i5 != 0) {
            uu3Var.w(16, i5);
        }
        int i6 = this.q;
        if (i6 != 0) {
            uu3Var.w(17, i6);
        }
        int i7 = this.r;
        if (i7 != 0) {
            uu3Var.w(18, i7);
        }
        int i8 = this.s;
        if (i8 != 0) {
            uu3Var.w(19, i8);
        }
        long j11 = this.t;
        if (j11 != 0) {
            uu3Var.x(20, j11);
        }
    }
}
