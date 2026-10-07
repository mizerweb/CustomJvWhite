package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes.dex */
public final class g67 extends sia {
    public static volatile g67[] i;
    public long a = 0;
    public String b = "";
    public String c = "";
    public String d = "";
    public long e = 0;
    public String f = "";
    public String g = "";
    public String h = "";

    public g67() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        long j = this.a;
        int iH = j != 0 ? uu3.h(1, j) : 0;
        if (!this.b.equals("")) {
            iH += uu3.l(2, this.b);
        }
        if (!this.c.equals("")) {
            iH += uu3.l(3, this.c);
        }
        if (!this.d.equals("")) {
            iH += uu3.l(4, this.d);
        }
        long j2 = this.e;
        if (j2 != 0) {
            iH += uu3.h(5, j2);
        }
        if (!this.f.equals("")) {
            iH += uu3.l(6, this.f);
        }
        if (!this.g.equals("")) {
            iH += uu3.l(7, this.g);
        }
        return !this.h.equals("") ? uu3.l(8, this.h) + iH : iH;
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 8) {
                this.a = su3Var.q();
            } else if (iS == 18) {
                this.b = su3Var.r();
            } else if (iS == 26) {
                this.c = su3Var.r();
            } else if (iS == 34) {
                this.d = su3Var.r();
            } else if (iS == 40) {
                this.e = su3Var.q();
            } else if (iS == 50) {
                this.f = su3Var.r();
            } else if (iS == 58) {
                this.g = su3Var.r();
            } else if (iS == 66) {
                this.h = su3Var.r();
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        long j = this.a;
        if (j != 0) {
            uu3Var.x(1, j);
        }
        if (!this.b.equals("")) {
            uu3Var.E(2, this.b);
        }
        if (!this.c.equals("")) {
            uu3Var.E(3, this.c);
        }
        if (!this.d.equals("")) {
            uu3Var.E(4, this.d);
        }
        long j2 = this.e;
        if (j2 != 0) {
            uu3Var.x(5, j2);
        }
        if (!this.f.equals("")) {
            uu3Var.E(6, this.f);
        }
        if (!this.g.equals("")) {
            uu3Var.E(7, this.g);
        }
        if (this.h.equals("")) {
            return;
        }
        uu3Var.E(8, this.h);
    }
}
