package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ou5 {
    public final nu5 a;
    public final float[] b;

    public ou5(nu5 nu5Var, float[] fArr) {
        this.a = nu5Var;
        this.b = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ou5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ou5 ou5Var = (ou5) obj;
        if (this.a != ou5Var.a) {
            return false;
        }
        return Arrays.equals(this.b, ou5Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawingPrimitiveModel(primitiveType=" + this.a + ", points=" + Arrays.toString(this.b) + ")";
    }
}
