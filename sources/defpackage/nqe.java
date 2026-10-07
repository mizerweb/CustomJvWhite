package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class nqe extends Drawable implements Animatable {
    public static final int m = Color.parseColor("#330F8EC2");
    public static final int n = Color.parseColor("#800F8EC2");
    public final int a;
    public final int b;
    public float c = (yl5.d().getDisplayMetrics().density * 16.0f) / 2.0f;
    public float d = (yl5.d().getDisplayMetrics().density * 16.0f) / 2.0f;
    public float e = 0.7f;
    public long f = qx6.a(-1.0f, -1.0f);
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public RadialGradient i;
    public RadialGradient j;
    public final ValueAnimator k;
    public final ifg l;

    public nqe(int i, int i2) {
        this.a = i;
        this.b = i2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(2500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ak(28, this));
        this.k = valueAnimatorOfFloat;
        ux6 ux6Var = new ux6();
        ux6Var.a = 0.0f;
        ifg ifgVar = new ifg(ux6Var);
        jfg jfgVar = new jfg();
        jfgVar.b(6.54f);
        jfgVar.a(0.7f);
        jfgVar.i = 1.0d;
        ifgVar.m = jfgVar;
        zw5 zw5Var = new zw5() { // from class: mqe
            @Override // defpackage.zw5
            public final void g(float f) {
                this.a.invalidateSelf();
            }
        };
        if (ifgVar.f) {
            c.i("Error: Update listeners must be added beforethe animation.");
            throw null;
        }
        ArrayList arrayList = ifgVar.l;
        if (!arrayList.contains(zw5Var)) {
            arrayList.add(zw5Var);
        }
        this.l = ifgVar;
    }

    public final void a() {
        if (Float.intBitsToFloat((int) (this.f >> 32)) == -1.0f || Float.intBitsToFloat((int) (this.f & 4294967295L)) == -1.0f) {
            return;
        }
        long j = this.f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f = this.c;
        int i = this.a;
        int i2 = this.b;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.i = new RadialGradient(fIntBitsToFloat, fIntBitsToFloat2, f, new int[]{i, i2}, (float[]) null, tileMode);
        this.j = new RadialGradient(fIntBitsToFloat, fIntBitsToFloat2, this.d, new int[]{i, i2}, (float[]) null, tileMode);
        this.g.setShader(this.i);
        this.h.setShader(this.j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (Float.intBitsToFloat((int) (this.f >> 32)) == -1.0f || Float.intBitsToFloat((int) (this.f & 4294967295L)) == -1.0f) {
            return;
        }
        long j = this.f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        int i = (int) (this.e * 255.0f);
        Paint paint = this.g;
        paint.setAlpha(i);
        int i2 = (int) (255.0f * this.e * 0.5f);
        Paint paint2 = this.h;
        paint2.setAlpha(i2);
        canvas.drawCircle(fIntBitsToFloat, fIntBitsToFloat2, this.d, paint2);
        canvas.drawCircle(fIntBitsToFloat, fIntBitsToFloat2, this.c, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.k.isRunning() || this.l.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.k.start();
        ifg ifgVar = this.l;
        ifgVar.b = 0.0f;
        ifgVar.c = true;
        ifgVar.g();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.k.end();
        ifg ifgVar = this.l;
        if (ifgVar.m.b > 0.0d) {
            ifgVar.f();
        } else {
            ifgVar.b();
        }
    }
}
