package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class hi0 {
    public final Object a;
    public final ge6 b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final gd2 h;

    public hi0(Object obj, ge6 ge6Var, int i, Size size, Rect rect, int i2, Matrix matrix, gd2 gd2Var) {
        if (obj == null) {
            ore.n("Null data");
            throw null;
        }
        this.a = obj;
        this.b = ge6Var;
        this.c = i;
        this.d = size;
        if (rect == null) {
            ore.n("Null cropRect");
            throw null;
        }
        this.e = rect;
        this.f = i2;
        if (matrix == null) {
            ore.n("Null sensorToBufferTransform");
            throw null;
        }
        this.g = matrix;
        if (gd2Var != null) {
            this.h = gd2Var;
        } else {
            ore.n("Null cameraCaptureResult");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hi0) {
            hi0 hi0Var = (hi0) obj;
            if (this.a.equals(hi0Var.a)) {
                ge6 ge6Var = hi0Var.b;
                ge6 ge6Var2 = this.b;
                if (ge6Var2 == null) {
                    if (ge6Var == null) {
                    }
                } else if (ge6Var2 != ge6Var) {
                    return false;
                }
                if (this.c == hi0Var.c && this.d.equals(hi0Var.d) && this.e.equals(hi0Var.e) && this.f == hi0Var.f && this.g.equals(hi0Var.g) && this.h.equals(hi0Var.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        ge6 ge6Var = this.b;
        return this.h.hashCode() ^ ((((((((((((iHashCode ^ (ge6Var == null ? 0 : ge6Var.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
