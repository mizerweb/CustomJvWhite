package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class nof extends w97 {
    public final Object d;
    public final m68 e;
    public final int f;
    public final int g;

    public nof(l78 l78Var, Size size, m68 m68Var) {
        super(l78Var);
        this.d = new Object();
        if (size == null) {
            this.f = this.b.getWidth();
            this.g = this.b.getHeight();
        } else {
            this.f = size.getWidth();
            this.g = size.getHeight();
        }
        this.e = m68Var;
    }

    public final void g(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f, this.g)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.d) {
        }
    }

    @Override // defpackage.w97, defpackage.l78
    public final int getHeight() {
        return this.g;
    }

    @Override // defpackage.w97, defpackage.l78
    public final m68 getImageInfo() {
        return this.e;
    }

    @Override // defpackage.w97, defpackage.l78
    public final int getWidth() {
        return this.f;
    }
}
