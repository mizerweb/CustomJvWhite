package defpackage;

import android.graphics.Color;

/* JADX INFO: loaded from: classes4.dex */
public final class va2 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    public va2(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public static va2 a(int i) {
        caj cajVar = caj.k;
        float fK = xd2.k(Color.red(i));
        float fK2 = xd2.k(Color.green(i));
        float fK3 = xd2.k(Color.blue(i));
        float[][] fArr = xd2.d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fK3) + (fArr2[1] * fK2) + (fArr2[0] * fK);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fK3) + (fArr3[1] * fK2) + (fArr3[0] * fK);
        float[] fArr4 = fArr[2];
        float f3 = (fK3 * fArr4[2]) + (fK2 * fArr4[1]) + (fK * fArr4[0]);
        float[][] fArr5 = xd2.a;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = cajVar.g;
        float f7 = cajVar.i;
        float f8 = cajVar.d;
        float f9 = cajVar.a;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = cajVar.h;
        float fPow = (float) Math.pow(((double) (Math.abs(f10) * f13)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f12) * f13)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f14 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f18 * cajVar.b) / f9, cajVar.j * f8)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f20 = f9 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, cajVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * cajVar.e) * cajVar.c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f8) / f20);
        float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f7 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new va2(fAtan2, fSqrt, fPow4, f21, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static va2 b(float f, float f2, float f3) {
        caj cajVar = caj.k;
        float f4 = cajVar.d;
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        float f5 = cajVar.a + 4.0f;
        float f6 = cajVar.i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * cajVar.d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new va2(f3, f2, f, f7, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static int e(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        caj cajVar = caj.k;
        float f8 = f2;
        if (f8 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return xd2.h(f3);
        }
        float f9 = 0.0f;
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f10 = f8;
        float f11 = 0.0f;
        va2 va2Var = null;
        boolean z = true;
        while (Math.abs(f11 - f8) >= 0.4f) {
            float f12 = 100.0f;
            float f13 = 1000.0f;
            float f14 = f9;
            float f15 = 100.0f;
            float f16 = 1000.0f;
            va2 va2Var2 = null;
            while (true) {
                if (Math.abs(f14 - f15) <= 0.01f) {
                    f4 = fMin;
                    f5 = f8;
                    f9 = f9;
                    break;
                }
                f9 = f9;
                float f17 = ((f15 - f14) / 2.0f) + f14;
                int iF = b(f17, f10, fMin).f(caj.k);
                float fK = xd2.k(Color.red(iF));
                float fK2 = xd2.k(Color.green(iF));
                float fK3 = xd2.k(Color.blue(iF));
                float[] fArr = xd2.d[1];
                float f18 = ((fK3 * fArr[2]) + ((fK2 * fArr[1]) + (fK * fArr[0]))) / f12;
                float fCbrt = f18 <= 0.008856452f ? f18 * 903.2963f : (((float) Math.cbrt(f18)) * 116.0f) - 16.0f;
                float fAbs = Math.abs(f3 - fCbrt);
                if (fAbs < 0.2f) {
                    va2 va2VarA = a(iF);
                    f5 = f8;
                    va2 va2VarB = b(va2VarA.c, va2VarA.b, fMin);
                    f4 = fMin;
                    float f19 = va2VarA.d - va2VarB.d;
                    float f20 = va2VarA.e - va2VarB.e;
                    float f21 = va2VarA.f - va2VarB.f;
                    float f22 = (f21 * f21) + (f20 * f20) + (f19 * f19);
                    f6 = f17;
                    double dSqrt = Math.sqrt(f22);
                    f7 = fCbrt;
                    float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                    if (fPow <= 1.0f) {
                        f16 = fPow;
                        f13 = fAbs;
                        va2Var2 = va2VarA;
                    }
                } else {
                    f4 = fMin;
                    f5 = f8;
                    f6 = f17;
                    f7 = fCbrt;
                }
                if (f13 == f9 && f16 == f9) {
                    break;
                }
                if (f7 < f3) {
                    f14 = f6;
                } else {
                    f15 = f6;
                }
                f9 = f9;
                f13 = f13;
                f8 = f5;
                fMin = f4;
                f12 = 100.0f;
            }
            if (!z) {
                if (va2Var2 == null) {
                    f8 = f10;
                } else {
                    f11 = f10;
                    va2Var = va2Var2;
                    f8 = f5;
                }
                f10 = ((f8 - f11) / 2.0f) + f11;
            } else {
                if (va2Var2 != null) {
                    return va2Var2.f(cajVar);
                }
                f10 = ((f5 - f11) / 2.0f) + f11;
                z = false;
                f8 = f5;
            }
            fMin = f4;
        }
        return va2Var == null ? xd2.h(f3) : va2Var.f(cajVar);
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public int f(caj cajVar) {
        float fSqrt;
        float f = this.c;
        float f2 = this.b;
        if (f2 != 0.0d) {
            double d = f;
            if (d == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f2 / ((float) Math.sqrt(d / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f3 = cajVar.f;
        float f4 = cajVar.h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f3), 0.73d), 1.1111111111111112d);
        double d2 = (this.a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f;
        float fPow2 = cajVar.a * ((float) Math.pow(((double) f) / 100.0d, (1.0d / ((double) cajVar.d)) / ((double) cajVar.j)));
        float f5 = fCos * 3846.1538f * cajVar.e * cajVar.c;
        float f6 = fPow2 / cajVar.b;
        float fSin = (float) Math.sin(d2);
        float fCos2 = (float) Math.cos(d2);
        float f7 = (((0.305f + f6) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f5 * 23.0f)));
        float f8 = fCos2 * f7;
        float f9 = f7 * fSin;
        float f10 = f6 * 460.0f;
        float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
        float f14 = 100.0f / f4;
        float fSignum = Math.signum(f11) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float[] fArr = cajVar.g;
        float f15 = fSignum / fArr[0];
        float f16 = fSignum2 / fArr[1];
        float f17 = fSignum3 / fArr[2];
        float[][] fArr2 = xd2.b;
        float[] fArr3 = fArr2[0];
        float f18 = (fArr3[2] * f17) + (fArr3[1] * f16) + (fArr3[0] * f15);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
        float[] fArr5 = fArr2[2];
        return mx3.a(f18, f19, (f17 * fArr5[2]) + (f16 * fArr5[1]) + (f15 * fArr5[0]));
    }
}
