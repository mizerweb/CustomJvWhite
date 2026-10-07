package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class qi extends Drawable implements Animatable {
    public static final l6m p = new l6m(16);
    public final xj a;
    public final gj2 b;
    public volatile boolean c;
    public long d;
    public long e;
    public long f;
    public int g;
    public long h;
    public long i;
    public int j;
    public int l;
    public qt5 n;
    public final long k = 8;
    public volatile l6m m = p;
    public final pi o = new pi(0, this);

    public qi(xj xjVar) {
        this.a = xjVar;
        this.b = new gj2(xjVar);
    }

    public final void a() {
        xj xjVar = this.a;
        if (xjVar != null) {
            xjVar.a.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0135  */
    /* JADX WARN: Code duplicated, block: B:74:0x0143  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) throws Throwable {
        long j;
        int iB;
        long j2;
        long j3;
        g85 g85Var;
        vx0 vx0Var;
        if (this.a == null || this.b == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jMax = this.c ? jUptimeMillis - this.d : (long) Math.max(this.e, 0.0d);
        gj2 gj2Var = this.b;
        xj xjVar = (xj) gj2Var.c;
        long jK = gj2Var.K();
        if (jK == 0) {
            long jC = 0;
            iB = 0;
            while (true) {
                jC += (long) xjVar.c(iB);
                int i = iB + 1;
                if (0 < jC) {
                    break;
                } else {
                    iB = i;
                }
            }
            j = 0;
        } else {
            if (xjVar.d() == 0) {
                j = 0;
            } else {
                j = 0;
                if (jMax / jK >= xjVar.d()) {
                    iB = -1;
                }
            }
            long j4 = jMax % jK;
            iB = 0;
            long jC2 = j;
            while (true) {
                jC2 += (long) xjVar.c(iB);
                int i2 = iB + 1;
                if (j4 < jC2) {
                    break;
                } else {
                    iB = i2;
                }
            }
        }
        if (iB == -1) {
            iB = this.a.b() - 1;
            this.m.getClass();
            this.c = false;
        } else if (iB == 0 && this.g != -1 && jUptimeMillis >= this.f) {
            this.m.getClass();
        }
        xj xjVar2 = this.a;
        xjVar2.e = xjVar2.b.now();
        px0 px0Var = xjVar2.a;
        boolean zC = px0Var.c(canvas, iB, 0);
        if (!px0Var.e && (g85Var = px0Var.g) != null && (vx0Var = px0Var.f) != null) {
            vx0Var.e(g85Var, px0Var.b, px0Var, iB);
        }
        boolean z = zC;
        xjVar2.e();
        if (z) {
            this.m.getClass();
            this.g = iB;
        }
        if (!z) {
            this.l++;
            if (pj6.a.h(2)) {
                pj6.d(qi.class, Integer.valueOf(this.l), "Dropped a frame. Count: %s");
            }
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (this.c) {
            gj2 gj2Var2 = this.b;
            long j5 = jUptimeMillis2 - this.d;
            xj xjVar3 = (xj) gj2Var2.c;
            long jK2 = gj2Var2.K();
            if (jK2 == j) {
                j2 = -1;
            } else {
                if (xjVar3.d() == 0) {
                    j2 = -1;
                } else {
                    j2 = -1;
                    if (j5 / jK2 >= xjVar3.d()) {
                    }
                    if (j3 != j2) {
                        long j6 = this.d + j3 + this.k;
                        this.f = j6;
                        scheduleSelf(this.o, j6);
                    } else {
                        this.m.getClass();
                        this.c = false;
                    }
                }
                long j7 = j5 % jK2;
                int iB2 = xjVar3.b();
                long jC3 = j;
                for (int i3 = 0; i3 < iB2 && jC3 <= j7; i3++) {
                    jC3 += (long) xjVar3.c(i3);
                }
                j3 = (jC3 - j7) + j5;
                if (j3 != j2) {
                    long j8 = this.d + j3 + this.k;
                    this.f = j8;
                    scheduleSelf(this.o, j8);
                } else {
                    this.m.getClass();
                    this.c = false;
                }
            }
            j3 = j2;
            if (j3 != j2) {
                long j9 = this.d + j3 + this.k;
                this.f = j9;
                scheduleSelf(this.o, j9);
            } else {
                this.m.getClass();
                this.c = false;
            }
        }
        this.e = jMax;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        xj xjVar = this.a;
        return xjVar != null ? xjVar.a.l : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        xj xjVar = this.a;
        return xjVar != null ? xjVar.a.k : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        xj xjVar = this.a;
        if (xjVar != null) {
            px0 px0Var = xjVar.a;
            px0Var.j = rect;
            ri riVar = px0Var.d;
            si siVar = (si) riVar.c;
            if (!si.a(siVar.c, rect).equals(siVar.d)) {
                siVar = new si(siVar.a, siVar.b, rect, siVar.j);
            }
            if (siVar != ((si) riVar.c)) {
                riVar.c = siVar;
                riVar.d = new ae7(siVar, riVar.a, (ft0) riVar.e);
            }
            px0Var.d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.c) {
            return false;
        }
        long j = i;
        if (this.e == j) {
            return false;
        }
        this.e = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.n == null) {
            this.n = new qt5();
        }
        this.n.a = i;
        xj xjVar = this.a;
        if (xjVar != null) {
            xjVar.a.i.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.n == null) {
            this.n = new qt5();
        }
        qt5 qt5Var = this.n;
        qt5Var.c = colorFilter;
        qt5Var.b = colorFilter != null;
        xj xjVar = this.a;
        if (xjVar != null) {
            xjVar.a.i.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        xj xjVar;
        if (this.c || (xjVar = this.a) == null || xjVar.b() <= 1) {
            return;
        }
        this.c = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - this.h;
        this.d = j;
        this.f = j;
        this.e = jUptimeMillis - this.i;
        this.g = this.j;
        invalidateSelf();
        this.m.getClass();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.c) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.h = jUptimeMillis - this.d;
            this.i = jUptimeMillis - this.e;
            this.j = this.g;
            this.c = false;
            this.d = 0L;
            this.f = 0L;
            this.e = -1L;
            this.g = -1;
            unscheduleSelf(this.o);
            this.m.getClass();
        }
    }
}
