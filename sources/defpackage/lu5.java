package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class lu5 {
    public final long a;
    public final jy8 b;
    public final Rect c;

    public lu5(long j, jy8 jy8Var, Rect rect) {
        this.a = j;
        this.b = jy8Var;
        this.c = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu5)) {
            return false;
        }
        lu5 lu5Var = (lu5) obj;
        return this.a == lu5Var.a && cqk.d(this.b, lu5Var.b) && cqk.d(this.c, lu5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "DrawingLayerState(id=" + this.a + ", source=" + this.b + ", sourceBounds=" + this.c + ")";
    }
}
