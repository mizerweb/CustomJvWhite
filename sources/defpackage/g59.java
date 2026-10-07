package defpackage;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class g59 {
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final l59 d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public float j;
    public float k;
    public final RectF l = new RectF();

    public g59(long j, CharSequence charSequence, CharSequence charSequence2, l59 l59Var, int i, float f, float f2, float f3, float f4) {
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = l59Var;
        this.e = i;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g59)) {
            return false;
        }
        g59 g59Var = (g59) obj;
        return this.a == g59Var.a && this.b.equals(g59Var.b) && cqk.d(this.c, g59Var.c) && this.d == g59Var.d && this.e == g59Var.e && Float.compare(this.f, g59Var.f) == 0 && Float.compare(this.g, g59Var.g) == 0 && Float.compare(this.h, g59Var.h) == 0 && Float.compare(this.i, g59Var.i) == 0;
    }

    public final int hashCode() {
        int iF = mw7.f(Long.hashCode(this.a) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        return Float.hashCode(this.i) + nbh.m(nbh.m(nbh.m(zo5.c(this.e, (this.d.hashCode() + ((iF + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31, 31), this.f, 31), this.g, 31), this.h, 31);
    }

    public final String toString() {
        return "LinkLayerState(id=" + this.a + ", url=" + ((Object) this.b) + ", title=" + ((Object) this.c) + ", style=" + this.d + ", canvasWidth=" + this.e + ", translationX=" + this.f + ", translationY=" + this.g + ", scale=" + this.h + ", rotation=" + this.i + ")";
    }
}
