package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class nd2 extends View {
    public static final /* synthetic */ zv8[] i;
    public static final float j;
    public static final float k;
    public static final float l;
    public static final float m;
    public static final float n;
    public static final float o;
    public final zb a;
    public final ArgbEvaluator b;
    public final FloatEvaluator c;
    public ValueAnimator d;
    public final Paint e;
    public final Paint f;
    public float g;
    public float h;

    static {
        z8b z8bVar = new z8b(nd2.class, "type", "getType()Lone/me/sdk/gallery/view/quickcamera/CameraCentralButton$Type;");
        zfe.a.getClass();
        i = new zv8[]{z8bVar};
        float f = yl5.d().getDisplayMetrics().density * 4.0f;
        j = f;
        k = f / 2.0f;
        l = yl5.d().getDisplayMetrics().density * 4.0f;
        m = yl5.d().getDisplayMetrics().density * 8.0f;
        n = yl5.d().getDisplayMetrics().density * 4.0f;
        o = yl5.d().getDisplayMetrics().density * 14.0f;
    }

    public nd2(Context context) {
        super(context, null);
        this.a = new zb(this);
        this.b = new ArgbEvaluator();
        this.c = new FloatEvaluator();
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(j);
        this.e = paint;
        Paint paint2 = new Paint();
        pq3.j.h(this);
        paint2.setColor(1308622847);
        this.f = paint2;
        this.g = l;
    }

    public final md2 getType() {
        zv8 zv8Var = i[0];
        return (md2) this.a.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        canvas.drawCircle(width, width, width - k, this.e);
        float f = j + this.g;
        float fFloatValue = this.c.evaluate(this.h, (Number) Float.valueOf(1.0f), (Number) Float.valueOf(0.5f)).floatValue() * ((getWidth() - f) / 2.0f);
        canvas.drawRoundRect(f, f, getWidth() - f, getHeight() - f, fFloatValue, fFloatValue, this.f);
        super.onDraw(canvas);
    }

    public final void setType(md2 md2Var) {
        this.a.B(this, i[0], md2Var);
    }
}
