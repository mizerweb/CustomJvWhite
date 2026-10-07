package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ag8 extends sia {
    public static volatile ag8[] e;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public byte[] d = sb8.i;

    public ag8() {
        this.cachedSize = -1;
    }

    public static ag8[] a() {
        if (e == null) {
            synchronized (ck8.b) {
                try {
                    if (e == null) {
                        e = new ag8[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int i = this.a;
        int iF = i != 0 ? uu3.f(1, i) : 0;
        int i2 = this.b;
        if (i2 != 0) {
            iF += uu3.n(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            iF += uu3.n(3, i3);
        }
        return !Arrays.equals(this.d, sb8.i) ? uu3.b(4, this.d) + iF : iF;
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            if (iS != 0) {
                if (iS == 8) {
                    int iP = su3Var.p();
                    switch (iP) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.a = iP;
                            break;
                    }
                } else if (iS == 16) {
                    this.b = su3Var.p();
                } else if (iS == 24) {
                    this.c = su3Var.p();
                } else if (iS == 34) {
                    this.d = su3Var.g();
                } else if (!su3Var.u(iS)) {
                }
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
        int i2 = this.b;
        if (i2 != 0) {
            uu3Var.G(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            uu3Var.G(3, i3);
        }
        if (Arrays.equals(this.d, sb8.i)) {
            return;
        }
        uu3Var.s(4, this.d);
    }
}
