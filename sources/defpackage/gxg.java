package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes3.dex */
public final class gxg extends sia {
    public static volatile gxg[] f;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public float d = 0.0f;
    public cxg[] e = cxg.a();

    public gxg() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int i = this.a;
        int i2 = 0;
        int iF = i != 0 ? uu3.f(1, i) : 0;
        int i3 = this.b;
        if (i3 != 0) {
            iF += uu3.f(2, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            iF += uu3.f(3, i4);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            iF += uu3.e(4);
        }
        cxg[] cxgVarArr = this.e;
        if (cxgVarArr != null && cxgVarArr.length > 0) {
            while (true) {
                cxg[] cxgVarArr2 = this.e;
                if (i2 >= cxgVarArr2.length) {
                    break;
                }
                cxg cxgVar = cxgVarArr2[i2];
                if (cxgVar != null) {
                    iF = uu3.i(5, cxgVar) + iF;
                }
                i2++;
            }
        }
        return iF;
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
                int iP = su3Var.p();
                if (iP == 0) {
                    this.b = iP;
                }
            } else if (iS == 24) {
                this.c = su3Var.p();
            } else if (iS == 37) {
                this.d = su3Var.i();
            } else if (iS == 42) {
                int I = sb8.I(su3Var, 42);
                cxg[] cxgVarArr = this.e;
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
                this.e = cxgVarArr2;
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
            uu3Var.w(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            uu3Var.w(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            uu3Var.w(3, i3);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            uu3Var.v(4, this.d);
        }
        cxg[] cxgVarArr = this.e;
        if (cxgVarArr == null || cxgVarArr.length <= 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            cxg[] cxgVarArr2 = this.e;
            if (i4 >= cxgVarArr2.length) {
                return;
            }
            cxg cxgVar = cxgVarArr2[i4];
            if (cxgVar != null) {
                uu3Var.y(5, cxgVar);
            }
            i4++;
        }
    }
}
