package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes3.dex */
public final class uf8 extends sia {
    public int a = 0;
    public String b = "";

    public uf8() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int i = this.a;
        int iN = i != 0 ? uu3.n(1, i) : 0;
        return !this.b.equals("") ? uu3.l(2, this.b) + iN : iN;
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
            } else if (iS == 18) {
                this.b = su3Var.r();
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
        if (this.b.equals("")) {
            return;
        }
        uu3Var.E(2, this.b);
    }
}
