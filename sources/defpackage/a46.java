package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import one.me.rlottie.RLottieDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class a46 extends s7g implements r46 {
    public kbc u;
    public z46 v;
    public final gn w;

    public a46(Context context, b1k b1kVar, boolean z) {
        ImageView imageView = new ImageView(context);
        super(imageView);
        this.w = new gn(1, this);
        int iK = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(iK, iK));
        x05.j(4.0f, yl5.d().getDisplayMetrics().density, imageView);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setOnClickListener(new z36(this, 0, b1kVar));
        imageView.addOnAttachStateChangeListener(new vn2(2, this));
        if (z) {
            return;
        }
        n1g.N(new zu(this, (lq4) null, 8), imageView);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof z46) {
            z46 z46Var = (z46) k79Var;
            Drawable drawable = z46Var.e;
            boolean z = z46Var.g;
            this.v = z46Var;
            if (z46Var.f == 0) {
                H(true);
            }
            int iD = !z ? c0a.d(4.0f, yl5.d().getDisplayMetrics().density, 2) : gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
            View view = this.a;
            view.setPadding(iD, iD, iD, iD);
            ImageView imageView = (ImageView) view;
            imageView.setAlpha(!z ? 0.4f : 1.0f);
            Drawable drawable2 = null;
            if (z) {
                imageView.setImageDrawable(drawable);
                Drawable drawable3 = ((ImageView) view).getDrawable();
                qn qnVar = drawable3 instanceof qn ? (qn) drawable3 : null;
                if (qnVar != null) {
                    qnVar.d(this.w);
                    qnVar.start();
                    return;
                }
                return;
            }
            H(true);
            qn qnVar2 = drawable instanceof qn ? (qn) drawable : null;
            if (qnVar2 != null) {
                RLottieDrawable rLottieDrawable = qnVar2.o;
                if (rLottieDrawable != null) {
                    rLottieDrawable.setCurrentFrame(0);
                }
                drawable2 = qnVar2.m;
            }
            imageView.setImageDrawable(drawable2);
        }
    }

    public final void H(boolean z) {
        Drawable drawable = ((ImageView) this.a).getDrawable();
        qn qnVar = drawable instanceof qn ? (qn) drawable : null;
        if (qnVar != null) {
            RLottieDrawable rLottieDrawable = qnVar.o;
            gn gnVar = this.w;
            if (rLottieDrawable != null) {
                rLottieDrawable.removeParentView(gnVar);
            }
            qnVar.r.remove(gnVar);
            RLottieDrawable rLottieDrawable2 = qnVar.o;
            if (rLottieDrawable2 == null || !rLottieDrawable2.hasParentViews() || z) {
                qnVar.stop();
            }
        }
    }

    @Override // defpackage.r46
    public final void g() {
        z46 z46Var = this.v;
        if ((z46Var != null ? z46Var.e : null) == null) {
            return;
        }
        View view = this.a;
        Drawable drawable = ((ImageView) view).getDrawable();
        if (drawable != null) {
            ((ImageView) view).invalidateDrawable(drawable);
        }
    }
}
