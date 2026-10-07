package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class si {
    public final ou7 a;
    public final gj b;
    public final cj c;
    public final Rect d;
    public final int[] e;
    public final int f;
    public final ui[] g;
    public final Rect h = new Rect();
    public final Rect i = new Rect();
    public final boolean j;
    public final Paint k;
    public Bitmap l;

    public si(ou7 ou7Var, gj gjVar, Rect rect, boolean z) {
        this.a = ou7Var;
        this.b = gjVar;
        cj cjVar = gjVar.a;
        this.c = cjVar;
        int[] iArrI = cjVar.i();
        this.e = iArrI;
        ou7Var.getClass();
        int length = iArrI.length;
        for (int i = 0; i < length; i++) {
            if (iArrI[i] < 11) {
                iArrI[i] = 100;
            }
        }
        ou7 ou7Var2 = this.a;
        int[] iArr = this.e;
        ou7Var2.getClass();
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        this.f = i2;
        ou7 ou7Var3 = this.a;
        int[] iArr2 = this.e;
        ou7Var3.getClass();
        int[] iArr3 = new int[iArr2.length];
        int length2 = iArr2.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length2; i5++) {
            iArr3[i5] = i4;
            i4 += iArr2[i5];
        }
        this.d = a(this.c, rect);
        this.j = z;
        this.g = new ui[this.c.b()];
        for (int i6 = 0; i6 < this.c.b(); i6++) {
            this.g[i6] = this.c.e(i6);
        }
        Paint paint = new Paint();
        this.k = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static Rect a(cj cjVar, Rect rect) {
        return rect == null ? new Rect(0, 0, cjVar.getWidth(), cjVar.getHeight()) : new Rect(0, 0, Math.min(rect.width(), cjVar.getWidth()), Math.min(rect.height(), cjVar.getHeight()));
    }

    public final void b(Canvas canvas, float f, float f2, ui uiVar) {
        if (uiVar.f == 2) {
            int iCeil = (int) Math.ceil(uiVar.c * f);
            int iCeil2 = (int) Math.ceil(uiVar.d * f2);
            int iCeil3 = (int) Math.ceil(uiVar.a * f);
            int iCeil4 = (int) Math.ceil(uiVar.b * f2);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), this.k);
        }
    }

    public final synchronized Bitmap c(int i, int i2) {
        try {
            Bitmap bitmap = this.l;
            if (bitmap != null && (bitmap.getWidth() < i || this.l.getHeight() < i2)) {
                synchronized (this) {
                    Bitmap bitmap2 = this.l;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        this.l = null;
                    }
                }
            }
            if (this.l == null) {
                this.l = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            this.l.eraseColor(0);
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public final void d(Canvas canvas, int i) {
        cj cjVar = this.c;
        fj fjVarH = cjVar.h(i);
        try {
            if (fjVarH.getWidth() > 0 && fjVarH.getHeight() > 0) {
                if (cjVar.d()) {
                    f(canvas, fjVarH);
                } else {
                    e(canvas, fjVarH);
                }
            }
        } finally {
            fjVarH.dispose();
        }
    }

    public final void e(Canvas canvas, fj fjVar) {
        int width;
        int height;
        int iB;
        int iC;
        if (this.j) {
            float fMax = Math.max(fjVar.getWidth() / Math.min(fjVar.getWidth(), canvas.getWidth()), fjVar.getHeight() / Math.min(fjVar.getHeight(), canvas.getHeight()));
            width = (int) (fjVar.getWidth() / fMax);
            height = (int) (fjVar.getHeight() / fMax);
            iB = (int) (fjVar.b() / fMax);
            iC = (int) (fjVar.c() / fMax);
        } else {
            width = fjVar.getWidth();
            height = fjVar.getHeight();
            iB = fjVar.b();
            iC = fjVar.c();
        }
        synchronized (this) {
            Bitmap bitmapC = c(width, height);
            this.l = bitmapC;
            fjVar.a(width, height, bitmapC);
            canvas.save();
            canvas.translate(iB, iC);
            canvas.drawBitmap(this.l, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, fj fjVar) {
        double dWidth = ((double) this.d.width()) / ((double) this.c.getWidth());
        double dHeight = ((double) this.d.height()) / ((double) this.c.getHeight());
        int iRound = (int) Math.round(((double) fjVar.getWidth()) * dWidth);
        int iRound2 = (int) Math.round(((double) fjVar.getHeight()) * dHeight);
        int iB = (int) (((double) fjVar.b()) * dWidth);
        int iC = (int) (((double) fjVar.c()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.d.width();
                int iHeight = this.d.height();
                c(iWidth, iHeight);
                Bitmap bitmap = this.l;
                if (bitmap != null) {
                    fjVar.a(iRound, iRound2, bitmap);
                }
                this.h.set(0, 0, iWidth, iHeight);
                this.i.set(iB, iC, iWidth + iB, iHeight + iC);
                Bitmap bitmap2 = this.l;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.h, this.i, (Paint) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Canvas canvas, fj fjVar, ui uiVar, ui uiVar2) {
        Rect rect = this.d;
        if (rect == null || rect.width() <= 0 || this.d.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.d.width();
        if (uiVar2 != null) {
            b(canvas, width, width, uiVar2);
        }
        int width2 = fjVar.getWidth();
        int height = fjVar.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i = (int) (width2 * width);
        int i2 = (int) (height * width);
        int iB = (int) (fjVar.b() * width);
        int iC = (int) (fjVar.c() * width);
        Rect rect3 = new Rect(iB, iC, i + iB, i2 + iC);
        if (uiVar.e == 2) {
            canvas.drawRect(rect3, this.k);
        }
        synchronized (this) {
            Bitmap bitmapC = c(width2, height);
            fjVar.a(width2, height, bitmapC);
            canvas.drawBitmap(bitmapC, rect2, rect3, (Paint) null);
        }
    }

    public final void h(Canvas canvas, fj fjVar, ui uiVar, ui uiVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        int width = this.c.getWidth();
        int height = this.c.getHeight();
        float f5 = width;
        float f6 = height;
        int width2 = fjVar.getWidth();
        int height2 = fjVar.getHeight();
        int iB = fjVar.b();
        int iC = fjVar.c();
        if (f5 > canvas.getWidth() || f6 > canvas.getHeight()) {
            int iMin = Math.min(canvas.getWidth(), width);
            int iMin2 = Math.min(canvas.getHeight(), height);
            float f7 = f5 / f6;
            if (iMin > iMin2) {
                f2 = iMin;
                f = f2 / f7;
            } else {
                f = iMin2;
                f2 = f * f7;
            }
            f3 = f2 / f5;
            f4 = f / f6;
            width2 = (int) Math.ceil(fjVar.getWidth() * f3);
            height2 = (int) Math.ceil(fjVar.getHeight() * f4);
            iB = (int) Math.ceil(fjVar.b() * f3);
            iC = (int) Math.ceil(fjVar.c() * f4);
        } else {
            f3 = 1.0f;
            f4 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(iB, iC, iB + width2, iC + height2);
        if (uiVar2 != null) {
            b(canvas, f3, f4, uiVar2);
        }
        if (uiVar.e == 2) {
            canvas.drawRect(rect2, this.k);
        }
        synchronized (this) {
            Bitmap bitmapC = c(width2, height2);
            fjVar.a(width2, height2, bitmapC);
            canvas.drawBitmap(bitmapC, rect, rect2, (Paint) null);
        }
    }
}
