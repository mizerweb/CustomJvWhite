package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class dr3 extends ImageView {
    public static final /* synthetic */ zv8[] g = {new z8b(dr3.class, "strokeEnabled", "getStrokeEnabled()Z"), zo5.e(zfe.a, dr3.class, "strokeWidthPx", "getStrokeWidthPx()F"), new z8b(dr3.class, "strokeColor", "getStrokeColor()I"), new z8b(dr3.class, "innerColor", "getInnerColor()I")};
    public final cr3 a;
    public final cr3 b;
    public final cr3 c;
    public final cr3 d;
    public final Paint e;
    public final Paint f;

    public dr3(Context context) {
        super(context, null, 0, 0);
        this.a = new cr3(this, 0);
        this.b = new cr3(Float.valueOf(yl5.d().getDisplayMetrics().density * 2.0f), this);
        this.c = new cr3(this, 2);
        this.d = new cr3(this, 3);
        Paint paint = new Paint(1);
        paint.setDither(true);
        paint.setColor(getStrokeColor());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getStrokeWidthPx());
        this.e = paint;
        Paint paint2 = new Paint(1);
        paint2.setDither(true);
        paint2.setColor(getInnerColor());
        paint2.setStyle(Paint.Style.FILL);
        this.f = paint2;
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setOutlineProvider(new fn(1));
        setClipToOutline(true);
    }

    public final int getInnerColor() {
        zv8 zv8Var = g[3];
        return ((Number) this.d.b).intValue();
    }

    public final int getStrokeColor() {
        zv8 zv8Var = g[2];
        return ((Number) this.c.b).intValue();
    }

    public final boolean getStrokeEnabled() {
        zv8 zv8Var = g[0];
        return ((Boolean) this.a.b).booleanValue();
    }

    public final float getStrokeWidthPx() {
        zv8 zv8Var = g[1];
        return ((Number) this.b.b).floatValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float width = (getWidth() - getPaddingRight()) - paddingLeft;
        float height = (getHeight() - getPaddingBottom()) - paddingTop;
        float f = (width / 2.0f) + paddingLeft;
        float f2 = (height / 2.0f) + paddingTop;
        float fMin = Math.min(width, height) / 2.0f;
        boolean strokeEnabled = getStrokeEnabled();
        Paint paint = this.f;
        Paint paint2 = this.e;
        if (strokeEnabled && getInnerColor() != 0) {
            canvas.drawCircle(f, f2, fMin - (getStrokeWidthPx() / 2.0f), paint2);
            canvas.drawCircle(f, f2, (fMin - (getStrokeWidthPx() / 2.0f)) - gm0.K(2.0f * yl5.d().getDisplayMetrics().density), paint);
        } else if (getStrokeEnabled()) {
            canvas.drawCircle(f, f2, fMin - (getStrokeWidthPx() / 2.0f), paint2);
        } else if (getInnerColor() != 0) {
            canvas.drawCircle(f, f2, fMin, paint);
        }
        super.onDraw(canvas);
    }

    public final void setInnerColor(int i) {
        this.d.B(this, g[3], Integer.valueOf(i));
    }

    public final void setStrokeColor(int i) {
        this.c.B(this, g[2], Integer.valueOf(i));
    }

    public final void setStrokeEnabled(boolean z) {
        this.a.B(this, g[0], Boolean.valueOf(z));
    }

    public final void setStrokeWidthPx(float f) {
        this.b.B(this, g[1], Float.valueOf(f));
    }
}
