package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.Protos;

/* JADX INFO: loaded from: classes3.dex */
public final class uwd extends sia {
    public String a = "";
    public long b = 0;
    public long c = 0;
    public Protos.Attaches d = null;
    public Protos.MessageElements e = null;
    public long f = 0;

    public uwd() {
        this.cachedSize = -1;
    }

    public static uwd a(byte[] bArr) {
        return (uwd) sia.mergeFrom(new uwd(), bArr);
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int iL = !this.a.equals("") ? uu3.l(2, this.a) : 0;
        long j = this.b;
        if (j != 0) {
            iL += uu3.h(3, j);
        }
        long j2 = this.c;
        if (j2 != 0) {
            iL += uu3.h(4, j2);
        }
        Protos.Attaches attaches = this.d;
        if (attaches != null) {
            iL += uu3.i(7, attaches);
        }
        Protos.MessageElements messageElements = this.e;
        if (messageElements != null) {
            iL += uu3.i(9, messageElements);
        }
        long j3 = this.f;
        return j3 != 0 ? uu3.h(11, j3) + iL : iL;
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 18) {
                this.a = su3Var.r();
            } else if (iS == 24) {
                this.b = su3Var.q();
            } else if (iS == 32) {
                this.c = su3Var.q();
            } else if (iS == 58) {
                if (this.d == null) {
                    this.d = new Protos.Attaches();
                }
                su3Var.j(this.d);
            } else if (iS == 74) {
                if (this.e == null) {
                    this.e = new Protos.MessageElements();
                }
                su3Var.j(this.e);
            } else if (iS == 88) {
                this.f = su3Var.q();
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        if (!this.a.equals("")) {
            uu3Var.E(2, this.a);
        }
        long j = this.b;
        if (j != 0) {
            uu3Var.x(3, j);
        }
        long j2 = this.c;
        if (j2 != 0) {
            uu3Var.x(4, j2);
        }
        Protos.Attaches attaches = this.d;
        if (attaches != null) {
            uu3Var.y(7, attaches);
        }
        Protos.MessageElements messageElements = this.e;
        if (messageElements != null) {
            uu3Var.y(9, messageElements);
        }
        long j3 = this.f;
        if (j3 != 0) {
            uu3Var.x(11, j3);
        }
    }
}
