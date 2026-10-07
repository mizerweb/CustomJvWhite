package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class k29 implements l29 {
    public final int a;

    public k29(int i) {
        this.a = i;
    }

    @Override // defpackage.l29
    public final void a(Paint paint, RectF rectF) {
        paint.setShader(null);
        paint.setColor(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k29) && this.a == ((k29) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "Solid(color=", ")");
    }
}
