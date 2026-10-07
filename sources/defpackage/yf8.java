package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes.dex */
public final class yf8 extends sia {
    public xf8[] a;

    public yf8() {
        if (xf8.f == null) {
            synchronized (ck8.b) {
                try {
                    if (xf8.f == null) {
                        xf8.f = new xf8[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = xf8.f;
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        xf8[] xf8VarArr = this.a;
        int i = 0;
        if (xf8VarArr == null || xf8VarArr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            xf8[] xf8VarArr2 = this.a;
            if (i >= xf8VarArr2.length) {
                return i2;
            }
            xf8 xf8Var = xf8VarArr2[i];
            if (xf8Var != null) {
                i2 = uu3.i(1, xf8Var) + i2;
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
                xf8[] xf8VarArr = this.a;
                int length = xf8VarArr == null ? 0 : xf8VarArr.length;
                int i = I + length;
                xf8[] xf8VarArr2 = new xf8[i];
                if (length != 0) {
                    System.arraycopy(xf8VarArr, 0, xf8VarArr2, 0, length);
                }
                while (length < i - 1) {
                    xf8 xf8Var = new xf8();
                    xf8VarArr2[length] = xf8Var;
                    su3Var.j(xf8Var);
                    su3Var.s();
                    length++;
                }
                xf8 xf8Var2 = new xf8();
                xf8VarArr2[length] = xf8Var2;
                su3Var.j(xf8Var2);
                this.a = xf8VarArr2;
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        xf8[] xf8VarArr = this.a;
        if (xf8VarArr == null || xf8VarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            xf8[] xf8VarArr2 = this.a;
            if (i >= xf8VarArr2.length) {
                return;
            }
            xf8 xf8Var = xf8VarArr2[i];
            if (xf8Var != null) {
                uu3Var.y(1, xf8Var);
            }
            i++;
        }
    }
}
