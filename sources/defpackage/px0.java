package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class px0 {
    public final k2d a;
    public final ux0 b;
    public final due c;
    public final ri d;
    public final boolean e;
    public final vx0 f;
    public final g85 g;
    public final Bitmap.Config h = Bitmap.Config.ARGB_8888;
    public final Paint i = new Paint(6);
    public Rect j;
    public int k;
    public int l;

    public px0(k2d k2dVar, ux0 ux0Var, due dueVar, ri riVar, boolean z, vx0 vx0Var, g85 g85Var) {
        this.a = k2dVar;
        this.b = ux0Var;
        this.c = dueVar;
        this.d = riVar;
        this.e = z;
        this.f = vx0Var;
        this.g = g85Var;
        new Path();
        new Matrix();
        d();
    }

    public final void a() {
        if (!this.e) {
            this.b.clear();
            return;
        }
        vx0 vx0Var = this.f;
        if (vx0Var != null) {
            vx0Var.d();
        }
    }

    public final boolean b(int i, au3 au3Var, Canvas canvas, int i2) {
        if (au3Var == null || !au3.W(au3Var)) {
            return false;
        }
        Bitmap bitmap = (Bitmap) au3Var.K();
        Rect rect = this.j;
        Paint paint = this.i;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        } else {
            rect.width();
            rect.height();
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        }
        if (i2 == 3 || this.e) {
            return true;
        }
        this.b.e(i, au3Var);
        return true;
    }

    public final boolean c(Canvas canvas, int i, int i2) throws Throwable {
        au3 au3VarX;
        boolean zB;
        boolean zA;
        boolean zA2;
        au3 au3Var = null;
        try {
            boolean z = false;
            int i3 = 1;
            if (this.e) {
                vx0 vx0Var = this.f;
                au3 au3VarC = vx0Var != null ? vx0Var.c(i, canvas.getWidth(), canvas.getHeight()) : null;
                if (au3VarC != null) {
                    try {
                        if (au3VarC.P()) {
                            Bitmap bitmap = (Bitmap) au3VarC.K();
                            Paint paint = this.i;
                            Rect rect = this.j;
                            if (rect == null) {
                                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                            } else {
                                rect.width();
                                rect.height();
                                canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                            }
                            au3VarC.close();
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        au3Var = au3VarC;
                        au3.E(au3Var);
                        throw th;
                    }
                }
                if (vx0Var != null) {
                    vx0Var.h(canvas.getWidth(), canvas.getHeight());
                }
                au3.E(au3VarC);
                return false;
            }
            ux0 ux0Var = this.b;
            if (i2 != 0) {
                ri riVar = this.d;
                if (i2 == 1) {
                    au3VarX = ux0Var.i();
                    if (au3VarX == null || !au3VarX.P()) {
                        zA = false;
                    } else {
                        zA = riVar.a((Bitmap) au3VarX.K(), i);
                        if (!zA) {
                            au3VarX.close();
                        }
                    }
                    if (zA && b(i, au3VarX, canvas, 1)) {
                        z = true;
                    }
                    zB = z;
                    i3 = 2;
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            au3VarX = ux0Var.d();
                            zB = b(i, au3VarX, canvas, 3);
                            i3 = -1;
                        }
                        return false;
                    }
                    try {
                        au3VarX = this.a.c(this.k, this.l, this.h);
                        if (au3VarX.P()) {
                            zA2 = riVar.a((Bitmap) au3VarX.K(), i);
                            if (!zA2) {
                                au3VarX.close();
                            }
                        } else {
                            zA2 = false;
                        }
                        if (zA2 && b(i, au3VarX, canvas, 2)) {
                            z = true;
                        }
                        zB = z;
                        i3 = 3;
                    } catch (RuntimeException e) {
                        pj6.i(px0.class, "Failed to create frame bitmap", e);
                    }
                }
            } else {
                au3VarX = ux0Var.x(i);
                zB = b(i, au3VarX, canvas, 0);
            }
            au3.E(au3VarX);
            return (zB || i3 == -1) ? zB : c(canvas, i, i3);
        } catch (Throwable th2) {
            th = th2;
            au3.E(au3Var);
            throw th;
        }
    }

    public final void d() {
        ri riVar = this.d;
        int width = ((si) riVar.c).c.getWidth();
        this.k = width;
        if (width == -1) {
            Rect rect = this.j;
            this.k = rect != null ? rect.width() : -1;
        }
        int height = ((si) riVar.c).c.getHeight();
        this.l = height;
        if (height == -1) {
            Rect rect2 = this.j;
            this.l = rect2 != null ? rect2.height() : -1;
        }
    }
}
