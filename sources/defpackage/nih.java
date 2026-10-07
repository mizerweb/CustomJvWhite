package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RenderScript;

/* JADX INFO: loaded from: classes3.dex */
public final class nih implements pz0 {
    public final Paint a;
    public final ny8 b;

    public nih(Context context) {
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.a = paint;
        this.b = rx8.P(2, new twf(context, 13));
    }

    @Override // defpackage.pz0
    public final void a(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.a);
    }

    @Override // defpackage.pz0
    public final void b(int i) {
        this.a.setAlpha(i);
    }

    @Override // defpackage.pz0
    public final void c(Bitmap bitmap, float f) {
        ((u58) this.b.getValue()).a(bitmap, gm0.K(f), true);
    }

    @Override // defpackage.pz0
    public final void onDestroy() {
        ifh ifhVar = ((u58) this.b.getValue()).a;
        if (ifhVar.d()) {
            ((RenderScript) ifhVar.getValue()).destroy();
        }
    }
}
