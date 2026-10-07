package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ux4 {
    public final float[] a;
    public final RectF b;
    public final RectF c;

    public ux4(float[] fArr, RectF rectF, RectF rectF2) {
        this.a = fArr;
        this.b = rectF;
        this.c = rectF2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ux4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ux4 ux4Var = (ux4) obj;
        return Arrays.equals(this.a, ux4Var.a) && cqk.d(this.b, ux4Var.b) && cqk.d(this.c, ux4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Arrays.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "CropResult(transformValues=" + Arrays.toString(this.a) + ", drawableCropRect=" + this.b + ", imageBounds=" + this.c + ")";
    }
}
