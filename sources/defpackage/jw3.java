package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jw3 extends v5a implements xu3 {
    public final xv3 x;
    public final yfj y;

    public jw3(Context context, ny8 ny8Var) {
        super(context);
        xv3 xv3Var = new xv3(ny8Var, context, this);
        xv3Var.f = true;
        this.x = xv3Var;
        this.y = new yfj(xv3Var);
        setTransitionGroup(true);
    }

    @Override // defpackage.rz9
    public final long I(int i, int i2, int i3, int i4) {
        xv3 xv3Var = this.x;
        xv3Var.g(i2);
        yfj yfjVar = this.y;
        if (yfjVar != null) {
            yfjVar.m(i3, i4);
        }
        return bj8.a(xv3Var.d, xv3Var.e);
    }

    @Override // defpackage.xu3
    public final void a(yv3 yv3Var) {
        setModel(yv3Var);
        yfj yfjVar = this.y;
        if (yfjVar != null) {
            yfjVar.n(yv3Var, this, getModelFlow());
        }
    }

    @Override // defpackage.kfa
    public final void c(MotionEvent motionEvent, int[] iArr) {
        this.x.k(gm0.K(motionEvent.getX()), gm0.K(motionEvent.getY()), iArr);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new fw3(this, drawable, 0));
        } else {
            post(new gw3(this, drawable, 0));
        }
    }

    @Override // defpackage.kfa
    public final yu3 j(MotionEvent motionEvent) {
        return this.x.c(gm0.K(motionEvent.getX()), gm0.K(motionEvent.getY()));
    }

    @Override // defpackage.kfa
    public final boolean l(MotionEvent motionEvent) {
        return this.x.e(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = 1.0f * yl5.d().getDisplayMetrics().density;
        float[] fArrA = ((fea) getBackground()).a();
        Rect bounds = ((fea) getBackground()).getBounds();
        float f2 = ((fea) getBackground()).r;
        float f3 = ((fea) getBackground()).s;
        float[] fArrA2 = ht9.a();
        int length = fArrA2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f4 = fArrA2[i];
            ht9.a()[i2] = Math.max(0.0f, fArrA[i2] - f);
            i++;
            i2++;
        }
        Path pathB = ht9.b();
        pathB.reset();
        pathB.addRoundRect(bounds.left + f, bounds.top + f, (bounds.right - f) - f3, (bounds.bottom - f) - f2, ht9.a(), Path.Direction.CW);
        Path pathB2 = ht9.b();
        int iSave = canvas.save();
        canvas.clipPath(pathB2);
        try {
            xv3 xv3Var = this.x;
            int length2 = xv3Var.k.length;
            for (int i3 = 0; i3 < length2; i3++) {
                ote oteVarD = xv3Var.g.b(i3).d();
                if (oteVarD != null) {
                    oteVarD.draw(canvas);
                }
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.x.g.j();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.x.b();
    }

    @Override // defpackage.rz9
    public final void q(iq9 iq9Var) {
        yv3 yv3Var = (yv3) iq9Var;
        this.x.j(yv3Var.a, yv3Var.b);
    }

    @Override // defpackage.gnh, defpackage.i59
    public final boolean r() {
        return false;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new hw3(this, drawable, runnable, j, 0));
        } else {
            post(new hw3(this, drawable, runnable, j, 1));
        }
    }

    public void setOnFinalImageSetCallback(cf7 cf7Var) {
        this.x.j = cf7Var;
    }

    @Override // defpackage.rz9
    public final int t(int i, int i2) {
        xv3 xv3Var = this.x;
        int i3 = xv3Var.d;
        List listF = xv3Var.f(i, i2, xv3Var.e + i2);
        yfj yfjVar = this.y;
        if (yfjVar != null) {
            yfjVar.l(listF);
        }
        return xv3Var.e;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new iw3(this, drawable, runnable, 0));
        } else {
            post(new iw3(this, drawable, runnable, 1));
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.x.p(drawable) || super.verifyDrawable(drawable);
    }

    @Override // defpackage.gnh, defpackage.kfa
    public final boolean y(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new fw3(this, drawable, 1));
        } else {
            post(new gw3(this, drawable, 1));
        }
    }
}
