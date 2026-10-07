package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class e6e extends FrameLayout {
    public final String a;
    public int b;

    public e6e(Context context) {
        super(context, null, 0);
        this.a = e6e.class.getName();
        this.b = 3;
        setBackgroundColor(0);
        setClipChildren(false);
    }

    public static void a(e6e e6eVar, long j, RLottieDrawable rLottieDrawable, Rect rect, int i) {
        boolean z = (i & 8) == 0;
        int i2 = 16;
        boolean z2 = (i & 16) == 0;
        String str = e6eVar.a;
        pu6 pu6Var = new pu6(yhf.m0(e6eVar.getLotties(), new aa2(j, i2)));
        while (pu6Var.hasNext()) {
            RLottieImageView rLottieImageView = (RLottieImageView) pu6Var.next();
            rLottieImageView.stopAnimation();
            e6eVar.removeView(rLottieImageView);
        }
        if (z && e6eVar.getChildCount() >= e6eVar.b) {
            gm0.Y(str, "Reaction effect. Reached max count of lotties effects");
            return;
        }
        int intrinsicWidth = rLottieDrawable.getIntrinsicWidth();
        int intrinsicHeight = rLottieDrawable.getIntrinsicHeight();
        RLottieImageView rLottieImageView2 = new RLottieImageView(e6eVar.getContext());
        RLottieImageViewUtils.setLottieDrawable(rLottieImageView2, rLottieDrawable);
        rLottieImageView2.playAnimation();
        tre.E0(R.id.tag_reaction_effects_view, rLottieImageView2, Long.valueOf(j));
        e6eVar.setLayoutDirection(0);
        rLottieImageView2.setLayoutParams(new FrameLayout.LayoutParams(intrinsicWidth, intrinsicHeight));
        rLottieImageView2.setX(z2 ? rect.centerX() - (intrinsicWidth / 2.0f) : c(intrinsicWidth, rect));
        rLottieImageView2.setY(rect.centerY() - (intrinsicHeight / 2.0f));
        e6eVar.addView(rLottieImageView2);
        c6e c6eVar = new c6e(e6eVar, rLottieImageView2);
        rLottieDrawable.addDrawableLoadListener(c6eVar);
        d6e d6eVar = new d6e(e6eVar, rLottieImageView2);
        rLottieDrawable.addOnAllFramesRenderedListener(d6eVar);
        if (rLottieImageView2.isAttachedToWindow()) {
            rLottieImageView2.addOnAttachStateChangeListener(new b6e(rLottieImageView2, e6eVar, rLottieDrawable, c6eVar, d6eVar));
            return;
        }
        gm0.n(str, "onDetach");
        rLottieDrawable.removeDrawableLoadListener(c6eVar);
        rLottieDrawable.removeOnAllFramesRenderedListener(d6eVar);
    }

    public static float c(int i, Rect rect) {
        return ((gm0.K(20.0f * yl5.d().getDisplayMetrics().density) / 2) + zo5.b(10.0f, yl5.d().getDisplayMetrics().density, rect.left)) - (i / 2.0f);
    }

    private final ohf getLotties() {
        return yhf.m0(new sw(4, this), dz7.o);
    }

    public final void b() {
        for (RLottieImageView rLottieImageView : getLotties()) {
            rLottieImageView.stopAnimation();
            removeView(rLottieImageView);
        }
    }

    public final void d(long j, Rect rect) {
        Object next;
        Iterator it = getLotties().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(tre.h0((RLottieImageView) next, R.id.tag_reaction_effects_view), Long.valueOf(j)));
        RLottieImageView rLottieImageView = (RLottieImageView) next;
        if (rLottieImageView == null) {
            return;
        }
        if (!rLottieImageView.isPlaying()) {
            gm0.n(this.a, "Reaction effect. Skip move");
            return;
        }
        Drawable drawable = rLottieImageView.getDrawable();
        rLottieImageView.setX(c(drawable.getIntrinsicWidth(), rect));
        rLottieImageView.setY(rect.centerY() - (drawable.getIntrinsicHeight() / 2.0f));
    }

    public final int getLottieMaxCount() {
        return this.b;
    }

    public final void setLottieMaxCount(int i) {
        this.b = i;
    }

    public final void setScrollOffset(int i) {
        float f = i;
        y1 y1Var = new y1(2, this);
        while (y1Var.hasNext()) {
            View view = (View) y1Var.next();
            view.setTranslationY(view.getTranslationY() + f);
        }
    }
}
