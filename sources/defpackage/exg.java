package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes3.dex */
public final class exg extends sia {
    public gxg[] a;
    public fxg b;

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        gxg[] gxgVarArr = this.a;
        int i = 0;
        if (gxgVarArr != null && gxgVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                gxg[] gxgVarArr2 = this.a;
                if (i >= gxgVarArr2.length) {
                    break;
                }
                gxg gxgVar = gxgVarArr2[i];
                if (gxgVar != null) {
                    i2 = uu3.i(1, gxgVar) + i2;
                }
                i++;
            }
            i = i2;
        }
        fxg fxgVar = this.b;
        return fxgVar != null ? uu3.i(2, fxgVar) + i : i;
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
                gxg[] gxgVarArr = this.a;
                int length = gxgVarArr == null ? 0 : gxgVarArr.length;
                int i = I + length;
                gxg[] gxgVarArr2 = new gxg[i];
                if (length != 0) {
                    System.arraycopy(gxgVarArr, 0, gxgVarArr2, 0, length);
                }
                while (length < i - 1) {
                    gxg gxgVar = new gxg();
                    gxgVarArr2[length] = gxgVar;
                    su3Var.j(gxgVar);
                    su3Var.s();
                    length++;
                }
                gxg gxgVar2 = new gxg();
                gxgVarArr2[length] = gxgVar2;
                su3Var.j(gxgVar2);
                this.a = gxgVarArr2;
            } else if (iS == 18) {
                if (this.b == null) {
                    fxg fxgVar = new fxg();
                    fxgVar.a = 0.0f;
                    fxgVar.b = 0.0f;
                    fxgVar.c = 0.0f;
                    fxgVar.d = 0.0f;
                    fxgVar.cachedSize = -1;
                    this.b = fxgVar;
                }
                su3Var.j(this.b);
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        gxg[] gxgVarArr = this.a;
        if (gxgVarArr != null && gxgVarArr.length > 0) {
            int i = 0;
            while (true) {
                gxg[] gxgVarArr2 = this.a;
                if (i >= gxgVarArr2.length) {
                    break;
                }
                gxg gxgVar = gxgVarArr2[i];
                if (gxgVar != null) {
                    uu3Var.y(1, gxgVar);
                }
                i++;
            }
        }
        fxg fxgVar = this.b;
        if (fxgVar != null) {
            uu3Var.y(2, fxgVar);
        }
    }
}
