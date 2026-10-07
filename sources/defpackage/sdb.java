package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes2.dex */
public final class sdb extends l1c implements eph {
    public boolean o;
    public final ny8 p;

    public sdb(Context context) {
        super(context);
        this.o = true;
        this.p = rx8.P(3, new iua(8, this));
        setClipToOutline(true);
        xj7 xj7Var = new xj7(getResources());
        xj7Var.d = getShimmerDrawable();
        xj7Var.p = eve.a();
        setHierarchy(xj7Var.a());
    }

    private final rdb getShimmerDrawable() {
        return (rdb) this.p.getValue();
    }

    public static m0g l(kbc kbcVar) {
        ex8 ex8Var = new ex8(28);
        m0g m0gVar = (m0g) ex8Var.b;
        m0gVar.j = false;
        ex8Var.M(kbcVar.h().b);
        m0gVar.d = kbcVar.b().c;
        ex8Var.L(1.0f);
        ex8Var.O(gm0.K(64.0f * yl5.d().getDisplayMetrics().density));
        return ex8Var.s();
    }

    @Override // defpackage.l1c
    public final void k(l68 l68Var, Animatable animatable) {
        this.o = false;
        getShimmerDrawable().d();
        setClickable(!this.o);
    }

    @Override // defpackage.fu5, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClickable(!this.o);
        if (this.o) {
            return;
        }
        getShimmerDrawable().c();
    }

    @Override // defpackage.fu5, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.o) {
            return;
        }
        getShimmerDrawable().d();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        getShimmerDrawable().b(l(kbcVar));
    }
}
