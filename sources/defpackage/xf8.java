package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes.dex */
public final class xf8 extends sia {
    public static volatile xf8[] f;
    public String a = "";
    public String b = "";
    public int c = 0;
    public f67 d = null;
    public ag8[] e = ag8.a();

    public xf8() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int i = 0;
        int iL = !this.a.equals("") ? uu3.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            iL += uu3.l(2, this.b);
        }
        int i2 = this.c;
        if (i2 != 0) {
            iL += uu3.n(3, i2);
        }
        f67 f67Var = this.d;
        if (f67Var != null) {
            iL += uu3.i(4, f67Var);
        }
        ag8[] ag8VarArr = this.e;
        if (ag8VarArr != null && ag8VarArr.length > 0) {
            while (true) {
                ag8[] ag8VarArr2 = this.e;
                if (i >= ag8VarArr2.length) {
                    break;
                }
                ag8 ag8Var = ag8VarArr2[i];
                if (ag8Var != null) {
                    iL = uu3.i(17, ag8Var) + iL;
                }
                i++;
            }
        }
        return iL;
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
            } else if (iS == 18) {
                this.b = su3Var.r();
            } else if (iS == 24) {
                this.c = su3Var.p();
            } else if (iS == 34) {
                if (this.d == null) {
                    this.d = new f67(1);
                }
                su3Var.j(this.d);
            } else if (iS == 138) {
                int I = sb8.I(su3Var, 138);
                ag8[] ag8VarArr = this.e;
                int length = ag8VarArr == null ? 0 : ag8VarArr.length;
                int i = I + length;
                ag8[] ag8VarArr2 = new ag8[i];
                if (length != 0) {
                    System.arraycopy(ag8VarArr, 0, ag8VarArr2, 0, length);
                }
                while (length < i - 1) {
                    ag8 ag8Var = new ag8();
                    ag8VarArr2[length] = ag8Var;
                    su3Var.j(ag8Var);
                    su3Var.s();
                    length++;
                }
                ag8 ag8Var2 = new ag8();
                ag8VarArr2[length] = ag8Var2;
                su3Var.j(ag8Var2);
                this.e = ag8VarArr2;
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
        if (!this.b.equals("")) {
            uu3Var.E(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            uu3Var.G(3, i);
        }
        f67 f67Var = this.d;
        if (f67Var != null) {
            uu3Var.y(4, f67Var);
        }
        ag8[] ag8VarArr = this.e;
        if (ag8VarArr == null || ag8VarArr.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            ag8[] ag8VarArr2 = this.e;
            if (i2 >= ag8VarArr2.length) {
                return;
            }
            ag8 ag8Var = ag8VarArr2[i2];
            if (ag8Var != null) {
                uu3Var.y(17, ag8Var);
            }
            i2++;
        }
    }
}
