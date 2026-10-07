package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes3.dex */
public final class dxg extends sia {
    public cxg[] a = cxg.a();

    public dxg() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        cxg[] cxgVarArr = this.a;
        int i = 0;
        if (cxgVarArr == null || cxgVarArr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            cxg[] cxgVarArr2 = this.a;
            if (i >= cxgVarArr2.length) {
                return i2;
            }
            cxg cxgVar = cxgVarArr2[i];
            if (cxgVar != null) {
                i2 = uu3.i(1, cxgVar) + i2;
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
                cxg[] cxgVarArr = this.a;
                int length = cxgVarArr == null ? 0 : cxgVarArr.length;
                int i = I + length;
                cxg[] cxgVarArr2 = new cxg[i];
                if (length != 0) {
                    System.arraycopy(cxgVarArr, 0, cxgVarArr2, 0, length);
                }
                while (length < i - 1) {
                    cxg cxgVar = new cxg();
                    cxgVarArr2[length] = cxgVar;
                    su3Var.j(cxgVar);
                    su3Var.s();
                    length++;
                }
                cxg cxgVar2 = new cxg();
                cxgVarArr2[length] = cxgVar2;
                su3Var.j(cxgVar2);
                this.a = cxgVarArr2;
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        cxg[] cxgVarArr = this.a;
        if (cxgVarArr == null || cxgVarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            cxg[] cxgVarArr2 = this.a;
            if (i >= cxgVarArr2.length) {
                return;
            }
            cxg cxgVar = cxgVarArr2[i];
            if (cxgVar != null) {
                uu3Var.y(1, cxgVar);
            }
            i++;
        }
    }
}
