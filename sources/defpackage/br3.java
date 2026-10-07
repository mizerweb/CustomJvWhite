package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class br3 extends Drawable {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public float e;
    public float f;
    public final Path g = new Path();

    public br3(float f, float f2, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f > 0.0f) {
            float f = this.e;
            if (f <= 0.0f) {
                return;
            }
            int i = (((int) (f * 255.0f)) << 24) | (this.a & 16777215);
            Path path = this.g;
            path.reset();
            path.addCircle(this.c, this.d, this.f, Path.Direction.CW);
            canvas.drawColor(i);
            int iSave = canvas.save();
            try {
                canvas.clipPath(path);
                canvas.drawColor(this.b);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
