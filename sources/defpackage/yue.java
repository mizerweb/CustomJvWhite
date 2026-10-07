package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class yue extends cve {
    public static final /* synthetic */ int C = 0;
    public WeakReference A;
    public RectF B;
    public final Paint x;
    public final Paint y;
    public final Bitmap z;

    public yue(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.x = paint2;
        Paint paint3 = new Paint(1);
        this.y = paint3;
        this.B = null;
        this.z = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.cve
    public final void d() {
        super.d();
        if (this.B == null) {
            this.B = new RectF();
        }
        this.t.mapRect(this.B, this.m);
    }

    @Override // defpackage.cve, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Shader shader;
        qe7.v();
        boolean z = this.b;
        Bitmap bitmap = this.z;
        if (!((z || this.c || this.d > 0.0f) && bitmap != null)) {
            super.draw(canvas);
            qe7.v();
            return;
        }
        d();
        c();
        WeakReference weakReference = this.A;
        Paint paint = this.x;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.A = new WeakReference(bitmap);
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f = true;
            }
        }
        if (this.f && (shader = paint.getShader()) != null) {
            shader.setLocalMatrix(this.t);
            this.f = false;
        }
        paint.setFilterBitmap(false);
        int iSave = canvas.save();
        canvas.concat(this.s);
        RectF rectF = this.B;
        Path path = this.e;
        if (rectF != null) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.B);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(iSave2);
        } else {
            canvas.drawPath(path, paint);
        }
        float f = this.d;
        if (f > 0.0f) {
            Paint paint2 = this.y;
            paint2.setStrokeWidth(f);
            paint2.setColor(np4.u(this.g, paint.getAlpha()));
            canvas.drawPath(this.h, paint2);
        }
        canvas.restoreToCount(iSave);
        qe7.v();
    }

    @Override // defpackage.cve, defpackage.xue
    public final void h() {
    }

    @Override // defpackage.cve, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = this.x;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // defpackage.cve, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.x.setColorFilter(colorFilter);
    }
}
