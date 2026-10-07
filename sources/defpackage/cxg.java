package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes3.dex */
public final class cxg extends sia {
    public static volatile cxg[] c;
    public int a = 0;
    public float[] b = sb8.g;

    public cxg() {
        this.cachedSize = -1;
    }

    public static cxg[] a() {
        if (c == null) {
            synchronized (ck8.b) {
                try {
                    if (c == null) {
                        c = new cxg[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int i = this.a;
        int iF = i != 0 ? uu3.f(1, i) : 0;
        float[] fArr = this.b;
        return (fArr == null || fArr.length <= 0) ? iF : (fArr.length * 4) + iF + fArr.length;
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 8) {
                int iP = su3Var.p();
                if (iP == 0 || iP == 1 || iP == 2) {
                    this.a = iP;
                }
            } else if (iS == 18) {
                int iP2 = su3Var.p();
                int iE = su3Var.e(iP2);
                int i = iP2 / 4;
                float[] fArr = this.b;
                int length = fArr == null ? 0 : fArr.length;
                int i2 = i + length;
                float[] fArr2 = new float[i2];
                if (length != 0) {
                    System.arraycopy(fArr, 0, fArr2, 0, length);
                }
                while (length < i2) {
                    fArr2[length] = su3Var.i();
                    length++;
                }
                this.b = fArr2;
                su3Var.d(iE);
            } else if (iS == 21) {
                int I = sb8.I(su3Var, 21);
                float[] fArr3 = this.b;
                int length2 = fArr3 == null ? 0 : fArr3.length;
                int i3 = I + length2;
                float[] fArr4 = new float[i3];
                if (length2 != 0) {
                    System.arraycopy(fArr3, 0, fArr4, 0, length2);
                }
                while (length2 < i3 - 1) {
                    fArr4[length2] = su3Var.i();
                    su3Var.s();
                    length2++;
                }
                fArr4[length2] = su3Var.i();
                this.b = fArr4;
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
        float[] fArr = this.b;
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            float[] fArr2 = this.b;
            if (i2 >= fArr2.length) {
                return;
            }
            uu3Var.v(2, fArr2[i2]);
            i2++;
        }
    }
}
