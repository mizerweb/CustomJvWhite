package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class unf extends Drawable {
    public final Bitmap a;
    public final Paint b = new Paint(2);
    public float c;

    public unf(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fHeight = getBounds().height() * this.c;
        int iSave = canvas.save();
        try {
            canvas.save();
            canvas.clipRect(0.0f, fHeight, getBounds().width(), getBounds().height());
            canvas.drawBitmap(this.a, (Rect) null, getBounds(), this.b);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
