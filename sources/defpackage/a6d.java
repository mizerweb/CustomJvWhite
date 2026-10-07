package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class a6d extends View {
    public static final /* synthetic */ zv8[] f = {new z8b(a6d.class, "activeColor", "getActiveColor()I"), zo5.e(zfe.a, a6d.class, "passiveColor", "getPassiveColor()I")};
    public static final Paint g;
    public final v56 a;
    public final v56 b;
    public final float c;
    public ValueAnimator d;
    public float e;

    static {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        g = paint;
    }

    public a6d(Context context) {
        super(context);
        this.a = new v56(11, (byte) 0);
        this.b = new v56(11, (byte) 0);
        this.c = yl5.d().getDisplayMetrics().density * 8.0f;
    }

    public static void a(a6d a6dVar, ValueAnimator valueAnimator) {
        a6dVar.setProgressForced(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final int getActiveColor() {
        return ((Number) this.a.m(this, f[0])).intValue();
    }

    private final int getPassiveColor() {
        return ((Number) this.b.m(this, f[1])).intValue();
    }

    private final void setActiveColor(int i) {
        zv8 zv8Var = f[0];
        this.a.b = Integer.valueOf(i);
    }

    private final void setPassiveColor(int i) {
        zv8 zv8Var = f[1];
        this.b.b = Integer.valueOf(i);
    }

    private final void setProgressForced(float f2) {
        this.e = oc9.u(f2, 0.0f, 100.0f);
        postInvalidateOnAnimation();
    }

    public final void b(xac xacVar) {
        setActiveColor(xacVar.c.c);
        setPassiveColor(xacVar.a.l.c);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        int passiveColor = getPassiveColor();
        Paint paint = g;
        paint.setColor(passiveColor);
        float f2 = this.c;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f2, f2, paint);
        paint.setColor(getActiveColor());
        float fMax = Math.max((this.e / 100.0f) * width, this.c);
        float f3 = this.c;
        canvas.drawRoundRect(0.0f, 0.0f, fMax, height, f3, f3, paint);
    }
}
