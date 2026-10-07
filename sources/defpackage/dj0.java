package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class dj0 {
    public final Rect a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Matrix e;
    public final boolean f;

    public dj0(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect == null) {
            ore.n("Null getCropRect");
            throw null;
        }
        this.a = rect;
        this.b = i;
        this.c = i2;
        this.d = z;
        if (matrix == null) {
            ore.n("Null getSensorToBufferTransform");
            throw null;
        }
        this.e = matrix;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dj0) {
            dj0 dj0Var = (dj0) obj;
            if (this.a.equals(dj0Var.a) && this.b == dj0Var.b && this.c == dj0Var.c && this.d == dj0Var.d && this.e.equals(dj0Var.e) && this.f == dj0Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.a);
        sb.append(", getRotationDegrees=");
        sb.append(this.b);
        sb.append(", getTargetRotation=");
        sb.append(this.c);
        sb.append(", hasCameraTransform=");
        sb.append(this.d);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", isMirroring=");
        return qt4.r(sb, this.f, "}");
    }
}
