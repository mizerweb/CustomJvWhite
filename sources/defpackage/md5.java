package defpackage;

import android.content.Context;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class md5 extends er0 implements cn7 {
    public static final ghe w;
    public static final float[] x;
    public static final float[] y;
    public final v30 h;
    public final c98 i;
    public final c98 j;
    public final boolean k;
    public final float[][] l;
    public final float[][] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public final int q;
    public ghe r;
    public Gainmap s;
    public int t;
    public boolean u;
    public boolean v;

    static {
        a98 a98Var = c98.b;
        Object[] objArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}};
        ch3.e(objArr, 4);
        w = c98.j(objArr, 4);
        x = new float[]{1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
        y = new float[]{1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};
    }

    public md5(v30 v30Var, c98 c98Var, c98 c98Var2, boolean z) {
        super(z, 1);
        this.h = v30Var;
        this.i = c98Var;
        this.j = c98Var2;
        this.k = z;
        int[] iArr = {c98Var.size(), 16};
        Class cls = Float.TYPE;
        this.l = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        this.m = (float[][]) Array.newInstance((Class<?>) cls, c98Var2.size(), 16);
        this.n = tab.j();
        this.o = tab.j();
        this.p = new float[16];
        this.r = w;
        this.t = -1;
        int iMax = 9729;
        for (int i = 0; i < c98Var.size(); i++) {
            iMax = Math.max(iMax, ((po9) c98Var.get(i)).c());
        }
        this.q = iMax;
    }

    public static md5 j(Context context, ghe gheVar, ghe gheVar2, boolean z) {
        return new md5(l(context, "shaders/vertex_shader_transformation_es2.glsl", gheVar2.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl"), c98.n(gheVar), c98.n(gheVar2), z);
    }

    public static md5 k(Context context, ghe gheVar, List list, ex3 ex3Var, int i) throws VideoFrameProcessingException {
        String str;
        boolean zH = ex3.h(ex3Var);
        boolean z = i == 2;
        String str2 = zH ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl";
        if (zH) {
            str = "shaders/fragment_shader_oetf_es3.glsl";
        } else if (z) {
            str = "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl";
        } else {
            str = list.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl";
        }
        v30 v30VarL = l(context, str2, str);
        int i2 = ex3Var.c;
        if (zH) {
            lvb.R(i2 == 7 || i2 == 6);
            v30VarL.B(i2, "uOutputColorTransfer");
        } else if (z) {
            lvb.R(i2 == 3 || i2 == 10);
            v30VarL.B(i2, "uOutputColorTransfer");
        }
        return new md5(v30VarL, c98.n(gheVar), c98.n(list), zH);
    }

    public static v30 l(Context context, String str, String str2) throws VideoFrameProcessingException {
        try {
            v30 v30Var = new v30(context, str, str2);
            v30Var.A("uTexTransformationMatrix", tab.j());
            return v30Var;
        } catch (GlUtil$GlException | IOException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    public static md5 m(v30 v30Var, ex3 ex3Var, ex3 ex3Var2, c98 c98Var) {
        boolean zH = ex3.h(ex3Var);
        int i = ex3Var.a;
        boolean z = (i == 1 || i == 2) && ex3Var2.a == 6;
        int i2 = ex3Var2.c;
        if (zH) {
            if (i2 == 3) {
                i2 = 10;
            }
            lvb.R(i2 == 1 || i2 == 10 || i2 == 6 || i2 == 7);
            v30Var.B(i2, "uOutputColorTransfer");
        } else if (z) {
            lvb.R(i2 == 1 || i2 == 6 || i2 == 7);
            v30Var.B(i2, "uOutputColorTransfer");
        } else {
            v30Var.B(0, "uSdrWorkingColorSpace");
            lvb.R(i2 == 3 || i2 == 1);
            v30Var.B(i2, "uOutputColorTransfer");
        }
        return new md5(v30Var, c98Var, ghe.e, zH || z);
    }

    public static boolean n(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr3 = fArr[i];
            float[] fArr4 = fArr2[i];
            if (!Arrays.equals(fArr3, fArr4)) {
                lvb.Z("A 4x4 transformation matrix must have 16 elements", fArr4.length == 16);
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.er0
    public final lag f(int i, int i2) {
        return pwe.d(i, i2, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.er0
    public final void h(int i, long j) throws VideoFrameProcessingException {
        boolean z;
        int i2;
        int i3;
        v30 v30Var = this.h;
        c98 c98Var = this.j;
        int i4 = 1;
        int[] iArr = {c98Var.size(), 16};
        int i5 = 0;
        Class cls = Float.TYPE;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        if (c98Var.size() > 0) {
            c98Var.get(0).getClass();
            ore.m();
            return;
        }
        boolean zN = n(this.m, fArr);
        float[] fArr2 = this.o;
        if (zN) {
            Matrix.setIdentityM(fArr2, 0);
            if (c98Var.size() > 0) {
                c98Var.get(0).getClass();
                ore.m();
                return;
            }
            z = true;
        } else {
            z = false;
        }
        c98 c98Var2 = this.i;
        float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) cls, c98Var2.size(), 16);
        int i6 = 0;
        while (true) {
            i2 = 4;
            if (i6 >= c98Var2.size()) {
                break;
            }
            float[] fArr4 = new float[9];
            ((po9) c98Var2.get(i6)).b().getValues(fArr4);
            float[] fArr5 = new float[16];
            fArr5[10] = 1.0f;
            int i7 = 0;
            while (i7 < 3) {
                int i8 = i4;
                int i9 = 0;
                while (i9 < 3) {
                    fArr5[((i7 == 2 ? 3 : i7) * 4) + (i9 == 2 ? 3 : i9)] = fArr4[(i7 * 3) + i9];
                    i9++;
                }
                i7++;
                i4 = i8;
            }
            int i10 = i4;
            float[] fArr6 = new float[16];
            Matrix.transposeM(fArr6, 0, fArr5, 0);
            fArr3[i6] = fArr6;
            i6++;
            i4 = i10;
        }
        int i11 = i4;
        float[][] fArr7 = this.l;
        boolean zN2 = n(fArr7, fArr3);
        int i12 = 6;
        float[] fArr8 = this.n;
        if (zN2) {
            Matrix.setIdentityM(fArr8, 0);
            this.r = w;
            int length = fArr7.length;
            int i13 = 0;
            while (true) {
                float[] fArr9 = this.p;
                if (i13 >= length) {
                    int i14 = i5;
                    i3 = i2;
                    Matrix.invertM(fArr9, i14, fArr8, i14);
                    this.r = pwe.f(fArr9, this.r);
                    break;
                }
                float[] fArr10 = fArr7[i13];
                Matrix.multiplyMM(this.p, 0, fArr10, 0, this.n, 0);
                System.arraycopy(fArr9, i5, fArr8, i5, fArr9.length);
                ghe gheVarF = pwe.f(fArr10, this.r);
                lvb.O("A polygon must have at least 3 vertices.", gheVarF.d >= 3 ? i11 : i5);
                z88 z88Var = new z88(i2);
                z88Var.f(gheVarF);
                int i15 = i5;
                while (i15 < i12) {
                    float[] fArr11 = pwe.a[i15];
                    ghe gheVarH = z88Var.h();
                    z88 z88Var2 = new z88(i2);
                    int i16 = i2;
                    for (int i17 = i5; i17 < gheVarH.d; i17++) {
                        float[] fArr12 = (float[]) gheVarH.get(i17);
                        int i18 = gheVarH.d;
                        float[] fArr13 = (float[]) gheVarH.get(((i18 + i17) - 1) % i18);
                        if (pwe.e(fArr12, fArr11)) {
                            if (!pwe.e(fArr13, fArr11)) {
                                float[] fArrC = pwe.c(fArr11, fArr11, fArr13, fArr12);
                                if (!Arrays.equals(fArr12, fArrC)) {
                                    z88Var2.c(fArrC);
                                }
                            }
                            z88Var2.c(fArr12);
                        } else if (pwe.e(fArr13, fArr11)) {
                            float[] fArrC2 = pwe.c(fArr11, fArr11, fArr13, fArr12);
                            if (!Arrays.equals(fArr13, fArrC2)) {
                                z88Var2.c(fArrC2);
                            }
                        }
                    }
                    i15++;
                    z88Var = z88Var2;
                    i2 = i16;
                    i12 = 6;
                    i5 = 0;
                }
                i3 = i2;
                ghe gheVarH2 = z88Var.h();
                this.r = gheVarH2;
                if (gheVarH2.d < 3) {
                    break;
                }
                i13++;
                i2 = i3;
                i12 = 6;
                i5 = 0;
            }
            i5 = i11;
        } else {
            i3 = 4;
        }
        int i19 = (z || i5 != 0) ? i11 : 0;
        if (this.r.d < 3) {
            return;
        }
        if (this.u && i19 == 0 && this.v) {
            return;
        }
        try {
            int i20 = v30Var.b;
            HashMap map = (HashMap) v30Var.g;
            GLES20.glUseProgram(i20);
            tab.e();
            if (this.s != null) {
                if (Build.VERSION.SDK_INT < 34) {
                    throw new IllegalStateException("Gainmaps not supported under API 34.");
                }
                v30Var.C(this.t, i11, "uGainmapTexSampler");
                rzl.e(v30Var, this.s, -1);
            }
            int i21 = this.q;
            ym7 ym7Var = (ym7) map.get("uTexSampler");
            ym7Var.getClass();
            ym7Var.e = i;
            ym7Var.f = 0;
            ym7Var.g = i21;
            v30Var.A("uTransformationMatrix", fArr8);
            ym7 ym7Var2 = (ym7) map.get("uRgbMatrix");
            if (ym7Var2 != null) {
                System.arraycopy(fArr2, 0, ym7Var2.c, 0, fArr2.length);
            }
            ghe gheVar = this.r;
            float[] fArr14 = new float[gheVar.d * 4];
            int i22 = 0;
            while (i22 < gheVar.d) {
                int i23 = i3;
                System.arraycopy(gheVar.get(i22), 0, fArr14, i22 * 4, i23);
                i22++;
                i3 = i23;
            }
            v30Var.y(fArr14);
            v30Var.g();
            GLES20.glDrawArrays(6, 0, this.r.d);
            tab.e();
            this.v = true;
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(j, e);
        }
    }

    @Override // defpackage.er0
    public final boolean i() {
        return (this.v && this.u) ? false : true;
    }

    @Override // defpackage.cn7
    public final void release() throws VideoFrameProcessingException {
        try {
            this.a.c();
            try {
                GLES20.glDeleteProgram(this.h.b);
                tab.e();
                int i = this.t;
                if (i != -1) {
                    GLES20.glDeleteTextures(1, new int[]{i}, 0);
                    tab.e();
                }
            } catch (GlUtil$GlException e) {
                throw new VideoFrameProcessingException(e);
            }
        } catch (GlUtil$GlException e2) {
            throw new VideoFrameProcessingException(e2);
        }
    }
}
