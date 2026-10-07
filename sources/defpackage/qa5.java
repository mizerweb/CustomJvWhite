package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class qa5 implements kj6 {
    public final q25 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[np0.r];

    static {
        sz9.a("media3.extractor");
    }

    public qa5(q25 q25Var, long j, long j2) {
        this.b = q25Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.kj6
    public final int B(int i, byte[] bArr, int i2) throws EOFException, InterruptedIOException {
        qa5 qa5Var;
        int iMin;
        a(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            qa5Var = this;
            iMin = qa5Var.b(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            qa5Var.g += iMin;
        } else {
            qa5Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(qa5Var.e, qa5Var.f, bArr, i, iMin);
        qa5Var.f += iMin;
        return iMin;
    }

    @Override // defpackage.kj6
    public final int C(int i) throws EOFException, InterruptedIOException {
        qa5 qa5Var;
        int iMin = Math.min(this.g, i);
        c(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            qa5Var = this;
            iMin = qa5Var.b(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            qa5Var = this;
        }
        if (iMin != -1) {
            qa5Var.d += (long) iMin;
        }
        return iMin;
    }

    @Override // defpackage.kj6
    public final void E(int i) throws EOFException, InterruptedIOException {
        k(i, false);
    }

    @Override // defpackage.kj6
    public final boolean I(int i, boolean z) throws EOFException, InterruptedIOException {
        a(i);
        int iB = this.g - this.f;
        while (iB < i) {
            qa5 qa5Var = this;
            int i2 = i;
            boolean z2 = z;
            iB = qa5Var.b(this.e, this.f, i2, iB, z2);
            if (iB == -1) {
                return false;
            }
            qa5Var.g = qa5Var.f + iB;
            this = qa5Var;
            i = i2;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final void a(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, vqi.j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int b(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        c.n();
        return 0;
    }

    public final void c(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // defpackage.kj6
    public final long getLength() {
        return this.c;
    }

    @Override // defpackage.kj6
    public final long getPosition() {
        return this.d;
    }

    @Override // defpackage.kj6
    public final boolean k(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        c(iMin);
        int iB = iMin;
        while (iB < i && iB != -1) {
            byte[] bArr = this.a;
            iB = b(bArr, -iB, Math.min(i, bArr.length + iB), iB, z);
        }
        if (iB != -1) {
            this.d += (long) iB;
        }
        return iB != -1;
    }

    @Override // defpackage.kj6
    public final boolean m(byte[] bArr, int i, int i2, boolean z) {
        if (!I(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.kj6
    public final void q() {
        this.f = 0;
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        qa5 qa5Var;
        int i3 = this.g;
        int iB = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            c(iMin);
            iB = iMin;
        }
        if (iB == 0) {
            qa5Var = this;
            iB = qa5Var.b(bArr, i, i2, 0, true);
        } else {
            qa5Var = this;
        }
        if (iB != -1) {
            qa5Var.d += (long) iB;
        }
        return iB;
    }

    @Override // defpackage.kj6
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        t(bArr, i, i2, false);
    }

    @Override // defpackage.kj6
    public final boolean t(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            c(iMin);
        }
        int iB = iMin;
        while (iB < i2 && iB != -1) {
            iB = b(bArr, i, i2, iB, z);
        }
        if (iB != -1) {
            this.d += (long) iB;
        }
        return iB != -1;
    }

    @Override // defpackage.kj6
    public final void u(int i, byte[] bArr, int i2) {
        m(bArr, i, i2, false);
    }

    @Override // defpackage.kj6
    public final long y() {
        return this.d + ((long) this.f);
    }

    @Override // defpackage.kj6
    public final void z(int i) throws EOFException, InterruptedIOException {
        I(i, false);
    }
}
