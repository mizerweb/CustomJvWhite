package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes4.dex */
public final class zi0 {
    public final Size a;
    public final Rect b;
    public final pf2 c;
    public final int d;
    public final boolean e;

    public zi0(Size size, Rect rect, pf2 pf2Var, int i, boolean z) {
        if (size == null) {
            ore.n("Null inputSize");
            throw null;
        }
        this.a = size;
        if (rect == null) {
            ore.n("Null inputCropRect");
            throw null;
        }
        this.b = rect;
        this.c = pf2Var;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zi0) {
            zi0 zi0Var = (zi0) obj;
            if (this.a.equals(zi0Var.a) && this.b.equals(zi0Var.b)) {
                pf2 pf2Var = zi0Var.c;
                pf2 pf2Var2 = this.c;
                if (pf2Var2 != null ? pf2Var2.equals(pf2Var) : pf2Var == null) {
                    if (this.d == zi0Var.d && this.e == zi0Var.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        pf2 pf2Var = this.c;
        return (this.e ? 1231 : 1237) ^ ((((iHashCode ^ (pf2Var == null ? 0 : pf2Var.hashCode())) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return qt4.r(sb, this.e, "}");
    }
}
