package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes.dex */
public final class wf8 extends sia {
    public vf8[] a;

    public wf8() {
        if (vf8.u == null) {
            synchronized (ck8.b) {
                try {
                    if (vf8.u == null) {
                        vf8.u = new vf8[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = vf8.u;
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        vf8[] vf8VarArr = this.a;
        int i = 0;
        if (vf8VarArr == null || vf8VarArr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            vf8[] vf8VarArr2 = this.a;
            if (i >= vf8VarArr2.length) {
                return i2;
            }
            vf8 vf8Var = vf8VarArr2[i];
            if (vf8Var != null) {
                i2 = uu3.i(1, vf8Var) + i2;
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
                vf8[] vf8VarArr = this.a;
                int length = vf8VarArr == null ? 0 : vf8VarArr.length;
                int i = I + length;
                vf8[] vf8VarArr2 = new vf8[i];
                if (length != 0) {
                    System.arraycopy(vf8VarArr, 0, vf8VarArr2, 0, length);
                }
                while (length < i - 1) {
                    vf8 vf8Var = new vf8();
                    vf8VarArr2[length] = vf8Var;
                    su3Var.j(vf8Var);
                    su3Var.s();
                    length++;
                }
                vf8 vf8Var2 = new vf8();
                vf8VarArr2[length] = vf8Var2;
                su3Var.j(vf8Var2);
                this.a = vf8VarArr2;
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        vf8[] vf8VarArr = this.a;
        if (vf8VarArr == null || vf8VarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            vf8[] vf8VarArr2 = this.a;
            if (i >= vf8VarArr2.length) {
                return;
            }
            vf8 vf8Var = vf8VarArr2[i];
            if (vf8Var != null) {
                uu3Var.y(1, vf8Var);
            }
            i++;
        }
    }
}
