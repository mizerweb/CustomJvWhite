package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes3.dex */
public final class fxg extends sia {
    public float a;
    public float b;
    public float c;
    public float d;

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int iE = Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f) ? uu3.e(1) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            iE += uu3.e(2);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            iE += uu3.e(3);
        }
        return Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f) ? uu3.e(4) + iE : iE;
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 13) {
                this.a = su3Var.i();
            } else if (iS == 21) {
                this.b = su3Var.i();
            } else if (iS == 29) {
                this.c = su3Var.i();
            } else if (iS == 37) {
                this.d = su3Var.i();
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        if (Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f)) {
            uu3Var.v(1, this.a);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            uu3Var.v(2, this.b);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            uu3Var.v(3, this.c);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            uu3Var.v(4, this.d);
        }
    }
}
