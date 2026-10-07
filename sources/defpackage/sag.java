package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class sag extends BitmapDrawable {
    public float a;

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = getBitmap();
        if (bitmap == null || !bitmap.isRecycled()) {
            int iSave = canvas.save();
            try {
                canvas.translate(this.a, 0.0f);
                super.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }
}
