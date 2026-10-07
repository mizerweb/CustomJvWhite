package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes.dex */
public final class zf8 extends sia {
    public String[] a = sb8.h;

    public zf8() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        String[] strArr = this.a;
        int i = 0;
        if (strArr == null || strArr.length <= 0) {
            return 0;
        }
        int iJ = 0;
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.a;
            if (i >= strArr2.length) {
                return iJ + i2;
            }
            String str = strArr2[i];
            if (str != null) {
                i2++;
                int iQ = uu3.q(str);
                iJ = uu3.j(iQ) + iQ + iJ;
            }
            i++;
        }
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                int I = sb8.I(su3Var, 10);
                String[] strArr = this.a;
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
                this.a = strArr2;
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        String[] strArr = this.a;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            String[] strArr2 = this.a;
            if (i >= strArr2.length) {
                return;
            }
            String str = strArr2[i];
            if (str != null) {
                uu3Var.E(1, str);
            }
            i++;
        }
    }
}
