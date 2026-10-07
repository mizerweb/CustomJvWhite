package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class ote extends t97 {
    public Drawable e;
    public eu5 f;

    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            eu5 eu5Var = this.f;
            if (eu5Var != null && !eu5Var.a) {
                pj6.j(cu5.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(eu5Var)), Integer.valueOf(System.identityHashCode(eu5Var.e)), eu5Var.toString());
                eu5Var.b = true;
                eu5Var.c = true;
                eu5Var.b();
            }
            super.draw(canvas);
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.e.draw(canvas);
            }
        }
    }

    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        eu5 eu5Var = this.f;
        if (eu5Var != null) {
            eu5Var.h(z);
        }
        return super.setVisible(z, z2);
    }
}
