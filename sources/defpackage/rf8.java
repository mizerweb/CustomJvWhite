package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class rf8 extends sia {
    public byte[] a = sb8.i;

    public rf8() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        if (Arrays.equals(this.a, sb8.i)) {
            return 0;
        }
        return uu3.b(1, this.a);
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                this.a = su3Var.g();
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        if (Arrays.equals(this.a, sb8.i)) {
            return;
        }
        uu3Var.s(1, this.a);
    }
}
