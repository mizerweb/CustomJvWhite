package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class bl2 extends LayerDrawable {
    public static final /* synthetic */ zv8[] g;
    public final int a;
    public final zb b;
    public float c;
    public int[] d;
    public final Paint e;
    public LinearGradient f;

    static {
        z8b z8bVar = new z8b(bl2.class, "isGradientEnabled", "isGradientEnabled()Z");
        zfe.a.getClass();
        g = new zv8[]{z8bVar};
    }

    public bl2() {
        super(new Drawable[0]);
        this.a = addLayer(new ColorDrawable());
        this.b = new zb(this);
        this.d = new int[2];
        this.e = new Paint(1);
    }

    public final void a(boolean z) {
        this.b.B(this, g[0], Boolean.valueOf(z));
    }

    public final void b() {
        zv8 zv8Var = g[0];
        if (!((Boolean) this.b.b).booleanValue() || this.c == 0.0f) {
            this.f = null;
            invalidateSelf();
        } else {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.c, this.d, (float[]) null, Shader.TileMode.CLAMP);
            this.f = linearGradient;
            this.e.setShader(linearGradient);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        zv8 zv8Var = g[0];
        if (!((Boolean) this.b.b).booleanValue() || this.f == null) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getBounds().width(), this.c, this.e);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b();
    }
}
