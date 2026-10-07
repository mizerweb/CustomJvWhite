package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.StateSet;

/* JADX INFO: loaded from: classes2.dex */
public final class qjg extends Drawable implements Drawable.Callback {
    public pjg a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public boolean f;
    public boolean h;
    public pi i;
    public long j;
    public long k;
    public pj l;
    public pjg m;
    public boolean n;
    public int e = 255;
    public int g = -1;

    public qjg(pjg pjgVar, Resources resources) {
        pjg pjgVar2 = new pjg(pjgVar, this, resources);
        this.a = pjgVar2;
        int i = this.g;
        if (i >= 0) {
            Drawable drawableB = pjgVar2.b(i);
            this.c = drawableB;
            if (drawableB != null) {
                d(drawableB);
            }
        }
        this.d = null;
        this.m = pjgVar2;
        onStateChange(getState());
    }

    public final void a(int[] iArr, Drawable drawable) {
        pjg pjgVar = this.m;
        int i = pjgVar.h;
        Drawable[] drawableArr = pjgVar.g;
        if (i >= drawableArr.length) {
            int i2 = i + 10;
            Drawable[] drawableArr2 = new Drawable[i2];
            System.arraycopy(drawableArr, 0, drawableArr2, 0, i);
            pjgVar.g = drawableArr2;
            int[][] iArr2 = new int[i2][];
            System.arraycopy(pjgVar.D, 0, iArr2, 0, i);
            pjgVar.D = iArr2;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(pjgVar.a);
        pjgVar.g[i] = drawable;
        pjgVar.h++;
        pjgVar.e = drawable.getChangingConfigurations() | pjgVar.e;
        pjgVar.p = false;
        pjgVar.r = false;
        pjgVar.j = null;
        pjgVar.i = false;
        pjgVar.k = false;
        pjgVar.s = false;
        pjgVar.D[i] = iArr;
        onStateChange(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        c(theme);
        onStateChange(getState());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void b(boolean z) {
        boolean z2;
        Drawable drawable;
        long j;
        boolean z3 = true;
        this.f = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            long j2 = this.j;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.e);
                    this.j = 0L;
                } else {
                    this.a.getClass();
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / 0)) * this.e) / 255);
                    z2 = true;
                }
            }
            drawable = this.d;
            if (drawable != null) {
                j = this.k;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.d = null;
                        this.k = 0L;
                    } else {
                        this.a.getClass();
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / 0) * this.e) / 255);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.i, jUptimeMillis + 16);
                return;
            }
            this.k = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.j = 0L;
        z2 = false;
        drawable = this.d;
        if (drawable != null) {
            j = this.k;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.d = null;
                    this.k = 0L;
                } else {
                    this.a.getClass();
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / 0) * this.e) / 255);
                }
            }
            if (z) {
            }
        }
        this.k = 0L;
        z3 = z2;
        if (z) {
        }
    }

    public final void c(Resources.Theme theme) {
        pjg pjgVar = this.a;
        if (theme == null) {
            pjgVar.getClass();
            return;
        }
        pjgVar.a();
        int i = pjgVar.h;
        Drawable[] drawableArr = pjgVar.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i2].applyTheme(theme);
                pjgVar.e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            pjgVar.b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = pjgVar.c;
            pjgVar.c = i3;
            if (i4 != i3) {
                pjgVar.k = false;
                pjgVar.i = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.l == null) {
            this.l = new pj();
        }
        pj pjVar = this.l;
        pjVar.b = drawable.getCallback();
        drawable.setCallback(pjVar);
        try {
            this.a.getClass();
            if (this.f) {
                drawable.setAlpha(this.e);
            }
            pjg pjgVar = this.a;
            if (pjgVar.y) {
                drawable.setColorFilter(pjgVar.x);
            } else {
                if (pjgVar.B) {
                    drawable.setTintList(pjgVar.z);
                }
                pjg pjgVar2 = this.a;
                if (pjgVar2.C) {
                    drawable.setTintMode(pjgVar2.A);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.u);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.a.w);
            Rect rect = this.b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            pj pjVar2 = this.l;
            Drawable.Callback callback = (Drawable.Callback) pjVar2.b;
            pjVar2.b = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final Drawable e() {
        if (!this.h && super.mutate() == this) {
            pjg pjgVar = new pjg(this.m, this, null);
            pjgVar.d();
            this.a = pjgVar;
            int i = this.g;
            if (i >= 0) {
                Drawable drawableB = pjgVar.b(i);
                this.c = drawableB;
                if (drawableB != null) {
                    d(drawableB);
                }
            }
            this.d = null;
            this.m = pjgVar;
            this.h = true;
        }
        return this;
    }

    public final boolean f(int[] iArr) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        pjg pjgVar = this.a;
        if (!pjgVar.s) {
            pjgVar.a();
            pjgVar.s = true;
            int i = pjgVar.h;
            Drawable[] drawableArr = pjgVar.g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    pjgVar.t = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    pjgVar.t = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = pjgVar.t;
        }
        if (!z) {
            return null;
        }
        this.a.d = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        this.a.getClass();
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.a.getClass();
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        this.a.getClass();
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        this.a.getClass();
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.c;
        int opacity = -2;
        if (drawable != null && drawable.isVisible()) {
            pjg pjgVar = this.a;
            if (pjgVar.p) {
                return pjgVar.q;
            }
            pjgVar.a();
            int i = pjgVar.h;
            Drawable[] drawableArr = pjgVar.g;
            opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            pjgVar.q = opacity;
            pjgVar.p = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        pjg pjgVar = this.a;
        pjgVar.getClass();
        Rect rect2 = pjgVar.j;
        boolean padding = false;
        if (rect2 == null && !pjgVar.i) {
            pjgVar.a();
            Rect rect3 = new Rect();
            int i = pjgVar.h;
            Drawable[] drawableArr = pjgVar.g;
            Rect rect4 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect4 == null) {
                        rect4 = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect4.left) {
                        rect4.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect4.top) {
                        rect4.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect4.right) {
                        rect4.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect4.bottom) {
                        rect4.bottom = i6;
                    }
                }
            }
            pjgVar.i = true;
            pjgVar.j = rect4;
            rect2 = rect4;
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.a.w && getLayoutDirection() == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        pjg pjgVar = this.a;
        if (pjgVar != null) {
            pjgVar.p = false;
            pjgVar.r = false;
        }
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.a.w;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.k != 0) {
            this.k = 0L;
            z = true;
        }
        if (this.j != 0) {
            this.j = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.n) {
            e();
            this.m.d();
            this.n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        pjg pjgVar = this.a;
        int i2 = this.g;
        int i3 = pjgVar.h;
        Drawable[] drawableArr = pjgVar.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zC = tsl.c(i, drawable);
                if (i4 == i2) {
                    z = zC;
                }
            }
        }
        pjgVar.v = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zF = f(iArr);
        int iC = this.m.c(iArr);
        if (iC < 0) {
            iC = this.m.c(StateSet.WILD_CARD);
        }
        if (iC == this.g) {
            return zF;
        }
        SystemClock.uptimeMillis();
        this.a.getClass();
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
        if (iC >= 0) {
            pjg pjgVar = this.a;
            if (iC < pjgVar.h) {
                Drawable drawableB = pjgVar.b(iC);
                this.c = drawableB;
                this.g = iC;
                if (drawableB != null) {
                    this.a.getClass();
                    d(drawableB);
                }
            } else {
                this.c = null;
                this.g = -1;
            }
        } else {
            this.c = null;
            this.g = -1;
        }
        if (this.j != 0 || this.k != 0) {
            pi piVar = this.i;
            if (piVar == null) {
                this.i = new pi(14, this);
            } else {
                unscheduleSelf(piVar);
            }
            b(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f && this.e == i) {
            return;
        }
        this.f = true;
        this.e = i;
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.j == 0) {
                drawable.setAlpha(i);
            } else {
                b(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        pjg pjgVar = this.a;
        if (pjgVar.w != z) {
            pjgVar.w = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        pjg pjgVar = this.a;
        pjgVar.y = true;
        if (pjgVar.x != colorFilter) {
            pjgVar.x = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        pjg pjgVar = this.a;
        if (pjgVar.u != z) {
            pjgVar.u = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        pjg pjgVar = this.a;
        pjgVar.B = true;
        if (pjgVar.z != colorStateList) {
            pjgVar.z = colorStateList;
            this.c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        pjg pjgVar = this.a;
        pjgVar.C = true;
        if (pjgVar.A != mode) {
            pjgVar.A = mode;
            this.c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
