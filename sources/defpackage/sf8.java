package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes3.dex */
public final class sf8 extends sia {
    public int a = 0;
    public long b = 0;
    public int c = 0;
    public boolean d = false;

    public sf8() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int i = this.a;
        int iN = i != 0 ? uu3.n(1, i) : 0;
        long j = this.b;
        if (j != 0) {
            iN += uu3.h(2, j);
        }
        int i2 = this.c;
        if (i2 != 0) {
            iN += uu3.f(3, i2);
        }
        return this.d ? uu3.a(4) + iN : iN;
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 8) {
                this.a = su3Var.p();
            } else if (iS == 16) {
                this.b = su3Var.q();
            } else if (iS == 24) {
                this.c = su3Var.p();
            } else if (iS == 32) {
                this.d = su3Var.f();
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        int i = this.a;
        if (i != 0) {
            uu3Var.G(1, i);
        }
        long j = this.b;
        if (j != 0) {
            uu3Var.x(2, j);
        }
        int i2 = this.c;
        if (i2 != 0) {
            uu3Var.w(3, i2);
        }
        boolean z = this.d;
        if (z) {
            uu3Var.r(4, z);
        }
    }
}
