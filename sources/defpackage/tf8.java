package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tf8 extends sia {
    public int a = 0;
    public byte[] b = sb8.i;

    public tf8() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int i = this.a;
        int iN = i != 0 ? uu3.n(1, i) : 0;
        return !Arrays.equals(this.b, sb8.i) ? uu3.b(2, this.b) + iN : iN;
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
                this.b = su3Var.g();
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
        if (Arrays.equals(this.b, sb8.i)) {
            return;
        }
        uu3Var.s(2, this.b);
    }
}
