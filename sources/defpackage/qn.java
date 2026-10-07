package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import java.util.LinkedHashSet;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class qn extends Drawable implements Animatable, j8j {
    public final long a;
    public final int b;
    public boolean c;
    public final gm d;
    public final bm e;
    public final String f;
    public final dq4 g;
    public final p3c h;
    public int i;
    public final zb j;
    public boolean k;
    public final pj l;
    public final Drawable m;
    public final ny8 n;
    public RLottieDrawable o;
    public on p;
    public final ny8 q;
    public final LinkedHashSet r;
    public final r8e s;
    public static final /* synthetic */ zv8[] u = {new z8b(qn.class, "observeAnimojiJob", "getObserveAnimojiJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, qn.class, "state", "getState()Lone/me/sdk/animoji/AnimojiStateDrawable$State;")};
    public static final l6m t = new l6m(15);
    public static final ThreadLocal v = ThreadLocal.withInitial(new kn(0));
    public static final ny8 w = rx8.P(3, new va(5));

    public qn(long j, int i, boolean z, gm gmVar, bm bmVar, Context context, xx6 xx6Var, xt4 xt4Var) {
        Drawable drawable;
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = gmVar;
        this.e = bmVar;
        String name = qn.class.getName();
        this.f = name;
        dq4 dq4VarA = cqk.a(lvb.x0(wk8.a(), xt4Var));
        this.g = dq4VarA;
        this.h = qyj.S();
        this.i = 255;
        this.j = new zb(this);
        final int i2 = 1;
        pj pjVar = new pj(1, this);
        this.l = pjVar;
        final int i3 = 0;
        ny8 ny8VarP = rx8.P(3, new af7(this) { // from class: ln
            public final /* synthetic */ qn b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                qn qnVar = this.b;
                switch (i4) {
                    case 0:
                        m66 m66Var = new m66();
                        m66Var.setCallback(qnVar.l);
                        return m66Var;
                    default:
                        return new pn(qnVar);
                }
            }
        });
        if (gmVar instanceof em) {
            drawable = ((em) gmVar).a;
            drawable.setCallback(pjVar);
        } else {
            if (!(gmVar instanceof fm)) {
                ore.o();
                throw null;
            }
            drawable = (m66) ny8VarP.getValue();
        }
        this.m = drawable;
        this.n = rx8.P(3, new z2(context, 4, this));
        this.q = rx8.P(3, new af7(this) { // from class: ln
            public final /* synthetic */ qn b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i2;
                qn qnVar = this.b;
                switch (i4) {
                    case 0:
                        m66 m66Var = new m66();
                        m66Var.setCallback(qnVar.l);
                        return m66Var;
                    default:
                        return new pn(qnVar);
                }
            }
        });
        this.r = new LinkedHashSet();
        this.s = e9i.G0(xx6Var, dq4VarA, j0g.a, null);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.j(j, "init: "), null);
            }
        }
        m();
    }

    @Override // defpackage.j8j
    public final void a(boolean z) {
        this.c = z;
    }

    @Override // defpackage.j8j
    public final void b(View view) {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onAttach: " + this.a + " state " + k(), null);
            }
        }
        this.k = true;
        int iOrdinal = k().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                ((vki) this.n.getValue()).b(view);
            } else {
                if (iOrdinal == 3 || iOrdinal == 4) {
                    return;
                }
                ore.o();
            }
        }
    }

    @Override // defpackage.j8j
    public final void c(View view) {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onDetach: " + this.a + " state " + k(), null);
            }
        }
        this.k = false;
        int iOrdinal = k().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                ((vki) this.n.getValue()).c(view);
            } else {
                if (iOrdinal == 3 || iOrdinal == 4) {
                    return;
                }
                ore.o();
            }
        }
    }

    public final void d(ImageReceiver imageReceiver) {
        Drawable drawableG = g();
        RLottieDrawable rLottieDrawable = this.o;
        if (drawableG != rLottieDrawable) {
            this.r.add(imageReceiver);
        } else if (rLottieDrawable != null) {
            rLottieDrawable.addParentView(imageReceiver);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fHeight = g().getBounds().height();
        t.getClass();
        e(canvas, fHeight, (Paint) w.getValue());
    }

    public final void e(Canvas canvas, float f, Paint paint) {
        Canvas canvasBeginRecording;
        je9 je9Var = je9.f;
        Drawable drawableG = g();
        int iSave = canvas.save();
        float f2 = f - 0.0f;
        canvas.translate(0.0f, f2 > ((float) drawableG.getBounds().height()) ? (f2 / 2.0f) - (drawableG.getBounds().height() / 2) : f - drawableG.getBounds().height());
        if (this.c && paint.getAlpha() != 255) {
            paint.setAlpha(255);
        }
        RLottieDrawable rLottieDrawable = this.o;
        if (drawableG == rLottieDrawable) {
            Picture picture = (Picture) v.get();
            if (picture != null) {
                try {
                    canvasBeginRecording = picture.beginRecording(((RLottieDrawable) drawableG).getBounds().width(), ((RLottieDrawable) drawableG).getBounds().height());
                } catch (IllegalStateException unused) {
                    picture.endRecording();
                    RLottieDrawable rLottieDrawable2 = (RLottieDrawable) drawableG;
                    canvasBeginRecording = picture.beginRecording(rLottieDrawable2.getBounds().width(), rLottieDrawable2.getBounds().height());
                }
            } else {
                canvasBeginRecording = null;
            }
            try {
                ((RLottieDrawable) drawableG).draw(canvasBeginRecording, paint);
            } catch (IllegalStateException e) {
                String name = qn.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.j(this.a, "fail to draw drawable "), e);
                }
                if (r5h.L0(e.toString(), "Underflow in restore", false) && isRunning()) {
                    Drawable drawableG2 = g();
                    RLottieDrawable rLottieDrawable3 = this.o;
                    if (drawableG2 != rLottieDrawable3) {
                        g().invalidateSelf();
                    } else if (rLottieDrawable3 != null) {
                        rLottieDrawable3.invalidateInternal();
                    }
                }
            }
            if (picture != null) {
                picture.endRecording();
            }
        } else {
            if (this.c || (drawableG.getAlpha() != paint.getAlpha() && paint.getAlpha() != 255)) {
                drawableG.setAlpha(paint.getAlpha());
            }
            drawableG.draw(canvas);
        }
        canvas.restoreToCount(iSave);
        if (rLottieDrawable == null || drawableG != rLottieDrawable) {
            return;
        }
        Bitmap renderingBitmap = rLottieDrawable.getRenderingBitmap();
        if (renderingBitmap != null) {
            canvas.save();
            canvas.translate(0.0f, f - rLottieDrawable.getBounds().height());
            canvas.scale(rLottieDrawable.getBounds().width() / rLottieDrawable.getIntrinsicWidth(), rLottieDrawable.getBounds().height() / rLottieDrawable.getIntrinsicHeight());
            canvas.drawBitmap(renderingBitmap, 0.0f, 0.0f, paint);
            canvas.restore();
            return;
        }
        String name2 = qn.class.getName();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, name2, ewi.d(this.a, "Can't draw lottie ", " because bitmap is null. Draw static, url:", rLottieDrawable.getCurrentUrl()), null);
        }
        if (!rLottieDrawable.hasOnNextFrameRenderedListener((pn) this.q.getValue())) {
            rLottieDrawable.addOnNextFrameRenderedListener((pn) this.q.getValue());
        }
        ny8 ny8Var = this.n;
        (ny8Var.d() ? (Drawable) ny8Var.getValue() : this.m).draw(canvas);
        if (rLottieDrawable.isRunning()) {
            String str = this.f;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str, nbh.s(this.a, "lottie ", " will invalidate"), null);
            }
            Drawable drawableG3 = g();
            RLottieDrawable rLottieDrawable4 = this.o;
            if (drawableG3 != rLottieDrawable4) {
                g().invalidateSelf();
            } else if (rLottieDrawable4 != null) {
                rLottieDrawable4.invalidateInternal();
            }
        }
    }

    public final long f() {
        return this.a;
    }

    public final Drawable g() {
        int iOrdinal = k().ordinal();
        Drawable drawable = this.m;
        if (iOrdinal == 0) {
            return drawable;
        }
        ny8 ny8Var = this.n;
        if (iOrdinal == 1 || iOrdinal == 2) {
            return (Drawable) ny8Var.getValue();
        }
        if (iOrdinal != 3 && iOrdinal != 4) {
            ore.o();
            return null;
        }
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            if (rLottieDrawable.isRecycled() || rLottieDrawable.isLoadingFailed()) {
                rLottieDrawable = null;
            }
            if (rLottieDrawable != null) {
                return rLottieDrawable;
            }
        }
        if (!(this.d instanceof em)) {
            drawable = null;
        }
        return drawable == null ? (Drawable) ny8Var.getValue() : drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return g().getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return g().getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return g().getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return g().getOpacity();
    }

    public final mn h() {
        return k();
    }

    public final boolean i() {
        return this.c;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawableG = g();
        RLottieDrawable rLottieDrawable = this.o;
        return drawableG == rLottieDrawable && rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    public final int j() {
        return this.b;
    }

    public final mn k() {
        zv8 zv8Var = u[1];
        return (mn) this.j.b;
    }

    public final void l(String str) {
        vki vkiVar = (vki) this.n.getValue();
        o(mn.b);
        vkiVar.setBounds(getBounds());
        Drawable drawable = this.m;
        du5 du5Var = vkiVar.d.d;
        du5Var.getClass();
        ((wj7) du5Var).i(1, drawable);
        vkiVar.invalidateSelf();
        vkiVar.g = new kzi(this, vkiVar, false);
        if (!this.k) {
            vkiVar.i(null, str);
            return;
        }
        String str2 = vkiVar.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "[" + Thread.currentThread().getName() + "] " + ((Object) ("onAttach: " + vki.e(vkiVar) + ", bounds: " + vkiVar.getBounds())), null);
            }
        }
        vkiVar.t = str;
        Uri uriC = f55.c(str);
        vkiVar.k = uriC != null ? w78.d(uriC).a() : null;
        vkiVar.f.removeCallbacks(vkiVar.p);
        l0m.b(vkiVar.f, vkiVar.p);
    }

    public final void m() {
        zv8[] zv8VarArr = u;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.h;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var == null || !vo8Var.isActive()) {
            p3cVar.B(this, zv8VarArr[0], yab.i0(this.g, null, 2, new m5(this, null, 3), 1));
        }
    }

    public final void n(int i) {
        this.m.setAlpha(i);
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setAlpha(i);
        }
        ny8 ny8Var = this.n;
        if (ny8Var.d()) {
            ((vki) ny8Var.getValue()).setAlpha(i);
        }
    }

    public final void o(mn mnVar) {
        this.j.B(this, u[1], mnVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        ny8 ny8Var = this.n;
        if (ny8Var.d()) {
            ((vki) ny8Var.getValue()).setBounds(rect);
        }
        this.m.setBounds(rect);
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.i = i;
        n(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setColorFilter(colorFilter);
        }
        ny8 ny8Var = this.n;
        if (ny8Var.d()) {
            ((vki) ny8Var.getValue()).setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "start: " + this.a + " state: " + k(), null);
            }
        }
        m();
        this.m.setCallback(this.l);
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(this.l);
        }
        ny8 ny8Var = this.n;
        if (ny8Var.d()) {
            ((vki) ny8Var.getValue()).setCallback(this.l);
        }
        RLottieDrawable rLottieDrawable2 = this.o;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.invalidateInternal();
        }
        Drawable drawableG = g();
        RLottieDrawable rLottieDrawable3 = this.o;
        if (drawableG != rLottieDrawable3 || rLottieDrawable3 == null) {
            return;
        }
        rLottieDrawable3.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "stop: " + this.a + " state: " + k(), null);
            }
        }
        vo8 vo8Var = (vo8) this.h.m(this, u[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        this.m.setCallback(null);
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(null);
        }
        RLottieDrawable rLottieDrawable2 = this.o;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.stop();
        }
    }
}
