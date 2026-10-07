package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fea extends Drawable {
    public final Path g;
    public Path h;
    public final float i;
    public final float j;
    public final float[] k;
    public int l;
    public LinearGradient m;
    public LinearGradient n;
    public final Matrix o;
    public final eea p;
    public final eea q;
    public float r;
    public float s;
    public static final /* synthetic */ zv8[] v = {new z8b(fea.class, "incomingBackgroundColor", "getIncomingBackgroundColor()[I"), zo5.e(zfe.a, fea.class, "outgoingBackgroundColor", "getOutgoingBackgroundColor()[I")};
    public static final xr8 u = new xr8();
    public static final Paint w = new Paint(1);
    public boolean a = false;
    public int t = 3;
    public boolean b = true;
    public boolean c = true;
    public boolean d = false;
    public int e = 0;
    public final RectF f = new RectF();

    public fea(int[] iArr, int[] iArr2) {
        float[] fArr;
        new RectF();
        this.g = new Path();
        this.i = yl5.d().getDisplayMetrics().density * 6.0f;
        this.j = yl5.d().getDisplayMetrics().density * 16.0f;
        float f = yl5.d().getDisplayMetrics().density;
        gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        if (this.c) {
            fArr = new float[8];
            for (int i = 0; i < 8; i++) {
                fArr[i] = this.j;
            }
        } else {
            fArr = new float[8];
        }
        this.k = fArr;
        this.l = 255;
        this.o = new Matrix();
        this.p = new eea(iArr, this, 0);
        this.q = new eea(iArr2, this, 1);
    }

    public static boolean b(fea feaVar, boolean z, int i, boolean z2, boolean z3, int i2, boolean z4, int i3) {
        boolean z5 = true;
        if ((i3 & 4) != 0) {
            z2 = true;
        }
        if ((i3 & 16) != 0) {
            z3 = true;
        }
        if ((i3 & 32) != 0) {
            i2 = feaVar.e;
        }
        if ((i3 & np0.m) != 0) {
            z4 = false;
        }
        if (feaVar.b == z3 && feaVar.a == z && feaVar.t == i && feaVar.c == z2 && feaVar.d == z4) {
            z5 = false;
        }
        feaVar.b = z3;
        feaVar.e = i2;
        feaVar.a = z;
        feaVar.t = i;
        feaVar.c = z2;
        feaVar.d = z4;
        if (z5) {
            feaVar.c(feaVar.getBounds());
        }
        return z5;
    }

    public final float[] a() {
        float[] fArr = this.k;
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final void c(Rect rect) {
        int i = this.t;
        boolean z = this.a;
        boolean z2 = this.c;
        boolean z3 = this.d;
        float[] fArr = this.k;
        if (z2) {
            Arrays.fill(fArr, 0, fArr.length, this.j);
            int i2 = i == 0 ? -1 : gea.$EnumSwitchMapping$0[qt4.D(i)];
            if (i2 != -1) {
                float f = this.i;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                ore.o();
                                return;
                            } else if (z) {
                                fArr[0] = f;
                                fArr[1] = f;
                            } else {
                                fArr[3] = f;
                                fArr[2] = f;
                            }
                        } else if (z) {
                            fArr[0] = f;
                            fArr[1] = f;
                            fArr[6] = f;
                            fArr[7] = f;
                        } else {
                            fArr[2] = f;
                            fArr[3] = f;
                            fArr[4] = f;
                            fArr[5] = f;
                        }
                    } else if (z) {
                        fArr[7] = f;
                        fArr[6] = f;
                    } else {
                        fArr[5] = f;
                        fArr[4] = f;
                    }
                } else if (z3) {
                    fArr[4] = f;
                    fArr[5] = f;
                    fArr[6] = f;
                    fArr[7] = f;
                }
            }
        }
        Path path = this.g;
        path.reset();
        float f2 = rect.left + 0.0f;
        float f3 = rect.top + 0.0f;
        float f4 = (rect.right - 0.0f) - this.s;
        float f5 = (rect.bottom - 0.0f) - this.r;
        RectF rectF = this.f;
        rectF.set(f2, f3, f4, f5);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.h = null;
        zv8[] zv8VarArr = v;
        zv8 zv8Var = zv8VarArr[0];
        d((int[]) this.p.b, rect);
        zv8 zv8Var2 = zv8VarArr[1];
        e((int[]) this.q.b, rect);
    }

    public final void d(int[] iArr, Rect rect) {
        LinearGradient linearGradient = new LinearGradient(1.0f, 0.1f, 0.0f, 0.9f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.o;
        matrix.reset();
        matrix.setScale(rect.width(), rect.height());
        matrix.postTranslate(rect.left, rect.top);
        linearGradient.setLocalMatrix(matrix);
        this.m = linearGradient;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        if (getLayoutDirection() == 1) {
            canvas.scale(-1.0f, 1.0f, getBounds().width() / 2.0f, getBounds().height() / 2.0f);
        }
        if (this.b) {
            LinearGradient linearGradient = this.a ? this.m : this.n;
            Paint paint = w;
            paint.setShader(linearGradient);
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha(this.l);
            canvas.drawPath(this.g, paint);
        }
        canvas.restore();
    }

    public final void e(int[] iArr, Rect rect) {
        LinearGradient linearGradient = new LinearGradient(1.0f, 0.1f, 0.0f, 0.9f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.o;
        matrix.reset();
        matrix.setScale(rect.width(), rect.height());
        matrix.postTranslate(rect.left, rect.top);
        linearGradient.setLocalMatrix(matrix);
        this.n = linearGradient;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 30) {
            super.getOutline(outline);
            return;
        }
        Path path = this.h;
        if (path == null) {
            path = this.g;
        }
        outline.setPath(path);
        outline.setAlpha(0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.l = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
