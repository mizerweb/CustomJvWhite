package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class fkg extends sia {
    public int a = 0;
    public Serializable b = null;

    public fkg() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int iL = this.a == 1 ? uu3.l(1, (String) this.b) : 0;
        if (this.a == 2) {
            ((Boolean) this.b).getClass();
            iL += uu3.a(2);
        }
        if (this.a == 3) {
            iL += uu3.f(3, ((Integer) this.b).intValue());
        }
        if (this.a == 4) {
            iL += uu3.h(4, ((Long) this.b).longValue());
        }
        if (this.a == 5) {
            ((Float) this.b).getClass();
            iL += uu3.e(5);
        }
        if (this.a == 6) {
            ((Double) this.b).getClass();
            iL += uu3.c(6);
        }
        return this.a == 7 ? uu3.b(7, (byte[]) this.b) + iL : iL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.io.Serializable] */
    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                this.b = su3Var.r();
                this.a = 1;
            } else if (iS == 16) {
                this.b = Boolean.valueOf(su3Var.f());
                this.a = 2;
            } else if (iS == 24) {
                this.b = Integer.valueOf(su3Var.p());
                this.a = 3;
            } else if (iS == 32) {
                this.b = Long.valueOf(su3Var.q());
                this.a = 4;
            } else if (iS == 45) {
                this.b = Float.valueOf(su3Var.i());
                this.a = 5;
            } else if (iS == 49) {
                this.b = Double.valueOf(su3Var.h());
                this.a = 6;
            } else if (iS == 58) {
                this.b = su3Var.g();
                this.a = 7;
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        if (this.a == 1) {
            uu3Var.E(1, (String) this.b);
        }
        if (this.a == 2) {
            uu3Var.r(2, ((Boolean) this.b).booleanValue());
        }
        if (this.a == 3) {
            uu3Var.w(3, ((Integer) this.b).intValue());
        }
        if (this.a == 4) {
            uu3Var.x(4, ((Long) this.b).longValue());
        }
        if (this.a == 5) {
            uu3Var.v(5, ((Float) this.b).floatValue());
        }
        if (this.a == 6) {
            uu3Var.t(6, ((Double) this.b).doubleValue());
        }
        if (this.a == 7) {
            uu3Var.s(7, (byte[]) this.b);
        }
    }
}
