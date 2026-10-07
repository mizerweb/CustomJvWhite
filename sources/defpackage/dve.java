package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class dve extends cve {
    public dve(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // defpackage.cve, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        qe7.v();
        if (!this.b && !this.c && this.d <= 0.0f) {
            super.draw(canvas);
            qe7.v();
            return;
        }
        d();
        c();
        canvas.clipPath(this.e);
        super.draw(canvas);
        qe7.v();
    }
}
