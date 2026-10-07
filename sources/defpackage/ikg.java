package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes3.dex */
public final class ikg extends sia {
    public static volatile ikg[] g;
    public String c = "";
    public int d = 0;
    public int e = 0;
    public long f = 0;
    public int a = 0;
    public sia b = null;

    public ikg() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int iL = !this.c.equals("") ? uu3.l(1, this.c) : 0;
        int i = this.d;
        if (i != 0) {
            iL += uu3.f(2, i);
        }
        long j = this.f;
        if (j != 0) {
            iL += uu3.h(3, j);
        }
        int i2 = this.e;
        if (i2 != 0) {
            iL += uu3.f(4, i2);
        }
        if (this.a == 5) {
            iL += uu3.i(5, this.b);
        }
        if (this.a == 6) {
            iL += uu3.i(6, this.b);
        }
        if (this.a == 7) {
            iL += uu3.i(7, this.b);
        }
        if (this.a == 8) {
            iL += uu3.i(8, this.b);
        }
        return this.a == 9 ? uu3.i(9, this.b) + iL : iL;
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                this.c = su3Var.r();
            } else if (iS == 16) {
                this.d = su3Var.p();
            } else if (iS == 24) {
                this.f = su3Var.q();
            } else if (iS == 32) {
                int iP = su3Var.p();
                if (iP == 0 || iP == 1 || iP == 2) {
                    this.e = iP;
                }
            } else if (iS == 42) {
                if (this.a != 5) {
                    this.b = new hkg();
                }
                su3Var.j(this.b);
                this.a = 5;
            } else if (iS == 50) {
                if (this.a != 6) {
                    this.b = new gkg(3);
                }
                su3Var.j(this.b);
                this.a = 6;
            } else if (iS == 58) {
                if (this.a != 7) {
                    this.b = new gkg(1);
                }
                su3Var.j(this.b);
                this.a = 7;
            } else if (iS == 66) {
                if (this.a != 8) {
                    this.b = new gkg(2);
                }
                su3Var.j(this.b);
                this.a = 8;
            } else if (iS == 74) {
                if (this.a != 9) {
                    this.b = new gkg(0);
                }
                su3Var.j(this.b);
                this.a = 9;
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        if (!this.c.equals("")) {
            uu3Var.E(1, this.c);
        }
        int i = this.d;
        if (i != 0) {
            uu3Var.w(2, i);
        }
        long j = this.f;
        if (j != 0) {
            uu3Var.x(3, j);
        }
        int i2 = this.e;
        if (i2 != 0) {
            uu3Var.w(4, i2);
        }
        if (this.a == 5) {
            uu3Var.y(5, this.b);
        }
        if (this.a == 6) {
            uu3Var.y(6, this.b);
        }
        if (this.a == 7) {
            uu3Var.y(7, this.b);
        }
        if (this.a == 8) {
            uu3Var.y(8, this.b);
        }
        if (this.a == 9) {
            uu3Var.y(9, this.b);
        }
    }
}
