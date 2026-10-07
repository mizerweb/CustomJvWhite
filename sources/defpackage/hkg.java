package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes3.dex */
public final class hkg extends sia {
    public String a = "";
    public int b = 0;
    public int c = 0;

    public hkg() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int iL = !this.a.equals("") ? uu3.l(1, this.a) : 0;
        int i = this.b;
        if (i != 0) {
            iL += uu3.f(2, i);
        }
        int i2 = this.c;
        return i2 != 0 ? uu3.f(3, i2) + iL : iL;
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                this.a = su3Var.r();
            } else if (iS == 16) {
                this.b = su3Var.p();
            } else if (iS == 24) {
                int iP = su3Var.p();
                if (iP == 0 || iP == 1 || iP == 2) {
                    this.c = iP;
                }
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        if (!this.a.equals("")) {
            uu3Var.E(1, this.a);
        }
        int i = this.b;
        if (i != 0) {
            uu3Var.w(2, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            uu3Var.w(3, i2);
        }
    }
}
