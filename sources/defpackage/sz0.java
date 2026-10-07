package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class sz0 extends Drawable {
    public static final int[] n = new int[2];
    public static final int[] o = new int[2];
    public final int a;
    public final boolean b;
    public pz0 c;
    public final ifh d;
    public final rz0 e;
    public boolean f;
    public Bitmap g;
    public qz0 h;
    public af7 i;
    public af7 j;
    public float k;
    public boolean l;
    public final ga0 m;

    public sz0(Context context, int i, float f, boolean z) {
        this.a = i;
        this.b = z;
        this.c = Build.VERSION.SDK_INT >= 31 ? new o44(1) : new nih(context);
        this.d = new ifh(new ca0(context, 1));
        this.e = new rz0(0, this);
        this.k = f;
        this.m = new ga0(this, 1, context);
    }

    public final View a() {
        Object callback = getCallback();
        while (callback != null) {
            if (callback instanceof Drawable) {
                callback = ((Drawable) callback).getCallback();
            }
            if (callback instanceof View) {
                return (View) callback;
            }
        }
        return null;
    }

    public final void b(boolean z) {
        View rootView;
        View viewA = a();
        if (viewA == null || (rootView = viewA.getRootView()) == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = viewA.getViewTreeObserver();
        rz0 rz0Var = this.e;
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(rz0Var);
        }
        ViewTreeObserver viewTreeObserver2 = rootView.getViewTreeObserver();
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.removeOnPreDrawListener(rz0Var);
        }
        if (z) {
            rootView.getViewTreeObserver().addOnPreDrawListener(rz0Var);
            if (cqk.d(rootView.getWindowId(), viewA.getWindowId())) {
                return;
            }
            viewA.getViewTreeObserver().addOnPreDrawListener(rz0Var);
        }
    }

    public final void c() {
        Bitmap bitmap;
        View viewA;
        pz0 pz0Var;
        qz0 qz0Var = this.h;
        if (qz0Var == null || (bitmap = this.g) == null || (viewA = a()) == null || (pz0Var = this.c) == null) {
            return;
        }
        View rootView = viewA.getRootView();
        bitmap.eraseColor(0);
        qz0Var.save();
        af7 af7Var = this.i;
        if (af7Var != null) {
            af7Var.invoke();
        }
        int[] iArr = n;
        rootView.getLocationOnScreen(iArr);
        int[] iArr2 = o;
        viewA.getLocationOnScreen(iArr2);
        int i = iArr2[0] - iArr[0];
        int i2 = iArr2[1] - iArr[1];
        float height = viewA.getHeight() / bitmap.getHeight();
        float width = viewA.getWidth() / bitmap.getWidth();
        qz0Var.translate((-i) / width, (-i2) / height);
        qz0Var.scale(1.0f / width, 1.0f / height);
        try {
            rootView.draw(qz0Var);
        } catch (Throwable th) {
            gm0.V(sz0.class.getName(), "fail to draw blur", th);
        }
        qz0Var.restore();
        if (!bitmap.isRecycled()) {
            pz0Var.c(bitmap, this.k);
            this.f = true;
        }
        af7 af7Var2 = this.j;
        if (af7Var2 != null) {
            af7Var2.invoke();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f || (canvas instanceof qz0) || (bitmap = this.g) == null || bitmap.isRecycled()) {
            return;
        }
        float fWidth = getBounds().width() / bitmap.getWidth();
        float fHeight = getBounds().height() / bitmap.getHeight();
        int iSave = canvas.save();
        canvas.scale(fWidth, fHeight, 0.0f, 0.0f);
        try {
            if (canvas.isHardwareAccelerated()) {
                pz0 pz0Var = this.c;
                if (pz0Var != null) {
                    pz0Var.a(canvas, bitmap);
                }
            } else {
                ((nih) this.d.getValue()).a(canvas, bitmap);
            }
            canvas.restoreToCount(iSave);
            int i = this.a;
            if (i != 0) {
                canvas.drawColor(i);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        c();
        if (this.l) {
            return;
        }
        View viewA = a();
        if (viewA != null) {
            viewA.addOnAttachStateChangeListener(this.m);
        }
        this.l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        b(this.b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (((int) Math.ceil(iWidth / 6.0f)) == 0 || ((int) Math.ceil(iHeight / 6.0f)) == 0) {
            return;
        }
        this.f = false;
        int iCeil = (int) Math.ceil(rect.width() / 6.0f);
        int i = iCeil % 64;
        if (i != 0) {
            iCeil = (iCeil - i) + 64;
        }
        int iCeil2 = (int) Math.ceil(rect.height() / (rect.width() / iCeil));
        Bitmap bitmapCreateBitmap = this.g;
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled() || iCeil >= bitmapCreateBitmap.getWidth() || iCeil2 >= bitmapCreateBitmap.getHeight()) {
            bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.g;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.g = bitmapCreateBitmap;
        } else {
            bitmapCreateBitmap.reconfigure(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
        }
        this.h = new qz0(bitmapCreateBitmap);
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        pz0 pz0Var = this.c;
        if (pz0Var != null) {
            pz0Var.b(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
