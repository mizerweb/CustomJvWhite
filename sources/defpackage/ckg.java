package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.vk.push.core.base.AidlException;

/* JADX INFO: loaded from: classes3.dex */
public final class ckg extends sia {
    public long a = 0;
    public long b = 0;
    public long c = 0;
    public long d = 0;
    public int e = 0;
    public long f = 0;
    public long g = 0;
    public long h = 0;
    public long i = 0;
    public long j = 0;
    public long k = 0;
    public long l = 0;
    public int m = 0;
    public boolean n = false;
    public boolean o = false;
    public long p = 0;
    public long q = 0;

    public ckg() {
        this.cachedSize = -1;
    }

    public static ckg a(byte[] bArr) {
        return (ckg) sia.mergeFrom(new ckg(), bArr);
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        long j = this.a;
        int iH = j != 0 ? uu3.h(1, j) : 0;
        long j2 = this.b;
        if (j2 != 0) {
            iH += uu3.h(2, j2);
        }
        long j3 = this.c;
        if (j3 != 0) {
            iH += uu3.h(3, j3);
        }
        long j4 = this.d;
        if (j4 != 0) {
            iH += uu3.h(4, j4);
        }
        int i = this.e;
        if (i != 0) {
            iH += uu3.f(5, i);
        }
        long j5 = this.f;
        if (j5 != 0) {
            iH += uu3.h(6, j5);
        }
        long j6 = this.g;
        if (j6 != 0) {
            iH += uu3.h(7, j6);
        }
        long j7 = this.h;
        if (j7 != 0) {
            iH += uu3.h(8, j7);
        }
        long j8 = this.i;
        if (j8 != 0) {
            iH += uu3.h(9, j8);
        }
        long j9 = this.j;
        if (j9 != 0) {
            iH += uu3.h(10, j9);
        }
        long j10 = this.k;
        if (j10 != 0) {
            iH += uu3.h(11, j10);
        }
        long j11 = this.l;
        if (j11 != 0) {
            iH += uu3.h(12, j11);
        }
        int i2 = this.m;
        if (i2 != 0) {
            iH += uu3.f(13, i2);
        }
        if (this.n) {
            iH += uu3.a(14);
        }
        if (this.o) {
            iH += uu3.a(15);
        }
        long j12 = this.p;
        if (j12 != 0) {
            iH += uu3.h(16, j12);
        }
        long j13 = this.q;
        return j13 != 0 ? uu3.h(17, j13) + iH : iH;
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            switch (iS) {
                case 0:
                    break;
                case 8:
                    this.a = su3Var.q();
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
                    this.e = su3Var.p();
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
                    this.k = su3Var.q();
                    break;
                case 96:
                    this.l = su3Var.q();
                    break;
                case AidlException.SDK_IS_NOT_INITIALIZED /* 104 */:
                    this.m = su3Var.p();
                    break;
                case 112:
                    this.n = su3Var.f();
                    break;
                case 120:
                    this.o = su3Var.f();
                    break;
                case np0.m /* 128 */:
                    this.p = su3Var.q();
                    break;
                case 136:
                    this.q = su3Var.q();
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
        long j = this.a;
        if (j != 0) {
            uu3Var.x(1, j);
        }
        long j2 = this.b;
        if (j2 != 0) {
            uu3Var.x(2, j2);
        }
        long j3 = this.c;
        if (j3 != 0) {
            uu3Var.x(3, j3);
        }
        long j4 = this.d;
        if (j4 != 0) {
            uu3Var.x(4, j4);
        }
        int i = this.e;
        if (i != 0) {
            uu3Var.w(5, i);
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
        long j10 = this.k;
        if (j10 != 0) {
            uu3Var.x(11, j10);
        }
        long j11 = this.l;
        if (j11 != 0) {
            uu3Var.x(12, j11);
        }
        int i2 = this.m;
        if (i2 != 0) {
            uu3Var.w(13, i2);
        }
        boolean z = this.n;
        if (z) {
            uu3Var.r(14, z);
        }
        boolean z2 = this.o;
        if (z2) {
            uu3Var.r(15, z2);
        }
        long j12 = this.p;
        if (j12 != 0) {
            uu3Var.x(16, j12);
        }
        long j13 = this.q;
        if (j13 != 0) {
            uu3Var.x(17, j13);
        }
    }
}
