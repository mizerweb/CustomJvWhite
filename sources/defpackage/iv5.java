package defpackage;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes2.dex */
public final class iv5 extends zt5 {
    public boolean b;

    @Override // defpackage.zt5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b) {
            super.draw(canvas);
        }
    }

    @Override // defpackage.zt5, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.b) {
            super.setHotspot(f, f2);
        }
    }

    @Override // defpackage.zt5, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.b) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // defpackage.zt5, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.b) {
            return this.a.setState(iArr);
        }
        return false;
    }

    @Override // defpackage.zt5, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
