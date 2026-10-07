package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ku5 {
    public final long a;
    public final int b;
    public final float c;
    public final List d;
    public final Rect e;

    public ku5(long j, int i, float f, List list, Rect rect) {
        this.a = j;
        this.b = i;
        this.c = f;
        this.d = list;
        this.e = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku5)) {
            return false;
        }
        ku5 ku5Var = (ku5) obj;
        return this.a == ku5Var.a && this.b == ku5Var.b && Float.compare(this.c, ku5Var.c) == 0 && this.d.equals(ku5Var.d) && this.e.equals(ku5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qv1.c(nbh.m(zo5.c(this.b, Long.hashCode(this.a) * 31, 31), this.c, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "DrawingLayerModel(id=", ", color=");
        sbQ.append(", width=");
        sbQ.append(this.c);
        sbQ.append(", primitives=");
        sbQ.append(this.d);
        sbQ.append(", bounds=");
        sbQ.append(this.e);
        sbQ.append(")");
        return sbQ.toString();
    }
}
