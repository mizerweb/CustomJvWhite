package defpackage;

import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* JADX INFO: loaded from: classes4.dex */
public final class zvd extends ShapeDrawable.ShaderFactory {
    public final int[] a;
    public final float b = 0.8f;
    public final float[] c;
    public int d;
    public int e;
    public ComposeShader f;

    public zvd(int[] iArr) {
        this.a = iArr;
        int length = iArr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = i / (this.a.length - 1);
        }
        this.c = fArr;
        this.d = -1;
        this.e = -1;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        if (this.f == null || i != this.d || i2 != this.e) {
            this.d = i;
            this.e = i2;
            double radians = Math.toRadians(63.08d);
            float fCos = (float) Math.cos(radians);
            float fSin = (float) Math.sin(radians);
            float f = i;
            float f2 = f / 2.0f;
            float f3 = i2;
            float f4 = f3 / 2.0f;
            float fHypot = (float) Math.hypot(f2, f4);
            float f5 = this.b;
            float f6 = fCos * fHypot * f5;
            float f7 = fSin * fHypot * f5;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(f2 - f6, f4 - f7, f6 + f2, f7 + f4, this.a, this.c, tileMode);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 0.5f, new int[]{0, lvb.I0(-1, 0.2f)}, o7j.a, tileMode);
            Matrix matrix = new Matrix();
            matrix.preTranslate(f2, f4);
            matrix.preRotate(-5.0f);
            matrix.preScale(f, f3);
            radialGradient.setLocalMatrix(matrix);
            this.f = new ComposeShader(linearGradient, radialGradient, PorterDuff.Mode.SRC_OVER);
        }
        ComposeShader composeShader = this.f;
        if (composeShader != null) {
            return composeShader;
        }
        ore.p("Required value was null.");
        return null;
    }
}
