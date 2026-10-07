package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class wue extends wf4 {
    public static final /* synthetic */ zv8[] H = {new z8b(wue.class, "mode", "getMode()Lone/me/calls/ui/view/RoundButtonView$Companion$ButtonStyle;"), zo5.e(zfe.a, wue.class, "shape", "getShape()Lone/me/calls/ui/view/RoundButtonView$Companion$ButtonShape;"), new z8b(wue.class, "imageSize", "getImageSize()Lone/me/calls/ui/view/RoundButtonView$Companion$IconSize;")};
    public final rda A;
    public final ny8 B;
    public final ny8 C;
    public final ny8 D;
    public final vue E;
    public final vue F;
    public final vue G;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final ny8 w;
    public tue x;
    public boolean y;
    public final Handler z;

    public wue(Context context) {
        super(context, null);
        this.s = rx8.P(3, new bzb(context, 25));
        this.t = rx8.P(3, new bzb(context, 26));
        this.u = rx8.P(3, new bzb(context, 27));
        this.v = rx8.P(3, new xre(context, 2, this));
        this.w = rx8.P(3, new bzb(context, 28));
        this.z = new Handler(Looper.getMainLooper());
        this.A = new rda(10, this);
        this.B = rx8.P(3, new tyd(19));
        this.C = rx8.P(3, new a8d(28, this));
        this.D = rx8.P(3, new tyd(20));
        this.E = new vue(this, 0);
        this.F = new vue(this, 1);
        this.G = new vue(new sue(bc1.f(52.0f), bc1.f(52.0f)), this);
        addView(getIconView(), bc1.f(52.0f), gm0.K(yl5.c() * 52.0f));
        addView(getStubCounterView());
        addView(getStubTitleView());
        qe7.H(this, 300L, new gwc(16, this));
        D();
        eg4 eg4VarH = ch3.h(this);
        int id = getIconView().getId();
        eg4VarH.d(id, 3, 0, 3);
        new bsb(3, eg4VarH, id).a(gm0.K(yl5.c() * 4.0f));
        eg4VarH.d(id, 7, 0, 7);
        new bsb(7, eg4VarH, id).a(gm0.K(yl5.c() * 4.0f));
        eg4VarH.d(id, 6, 0, 6);
        new bsb(6, eg4VarH, id).a(gm0.K(yl5.c() * 4.0f));
        if (n7j.n(getStubTitleView())) {
            eg4VarH.d(id, 4, getStubTitleView().getId(), 3);
            new bsb(4, eg4VarH, id).a(gm0.K(yl5.c() * 4.0f));
        } else {
            eg4VarH.d(id, 4, 0, 4);
            new bsb(4, eg4VarH, id).a(gm0.K(yl5.c() * 4.0f));
        }
        int id2 = getStubCounterView().getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 7, 0, 7);
        int id3 = getStubTitleView().getId();
        eg4VarH.d(id3, 3, getIconView().getId(), 4);
        new bsb(3, eg4VarH, id3).a(gm0.K(yl5.c() * 8.0f));
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 7, 0, 7);
        eg4VarH.a(this);
    }

    public final Animatable getAnimationDrawable() {
        Object drawable = getIconView().getDrawable();
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    private final int getContrastColor() {
        return pq3.j.l(this).b.b().d;
    }

    private final v0c getCounterView() {
        return (v0c) this.v.getValue();
    }

    private final ShapeDrawable getCurrentShape() {
        int i = uue.$EnumSwitchMapping$0[getShape().ordinal()];
        if (i == 1) {
            return getShapeOvalDrawable();
        }
        if (i == 2) {
            return getShapeRectDrawable();
        }
        ore.o();
        return null;
    }

    private final float[] getIconBgRadius() {
        return (float[]) this.B.getValue();
    }

    public final ImageView getIconView() {
        return (ImageView) this.u.getValue();
    }

    private final int getInactiveColor() {
        return ((ix2) pq3.j.l(this).b.u().d.e).b;
    }

    private final int getNegativeColor() {
        return pq3.j.l(this).b.h().d;
    }

    private final int getNeutralColor() {
        return pq3.j.l(this).b.h().b;
    }

    private final int getPositiveColor() {
        return pq3.j.l(this).b.h().f;
    }

    private final int getSecondaryContrast() {
        return pq3.j.l(this).b.h().c;
    }

    private final int getSelectedColor() {
        pq3.j.l(this);
        return -1;
    }

    private final ShapeDrawable getShapeOvalDrawable() {
        return (ShapeDrawable) this.D.getValue();
    }

    private final ShapeDrawable getShapeRectDrawable() {
        return (ShapeDrawable) this.C.getValue();
    }

    private final ViewStub getStubCounterView() {
        return (ViewStub) this.s.getValue();
    }

    private final ViewStub getStubTitleView() {
        return (ViewStub) this.t.getValue();
    }

    private final int getThemedColor() {
        return pq3.j.l(this).b.h().a;
    }

    private final TextView getTitleView() {
        return (TextView) this.w.getValue();
    }

    public static ShapeDrawable u(wue wueVar) {
        return new ShapeDrawable(new RoundRectShape(wueVar.getIconBgRadius(), null, null));
    }

    public static void z(wue wueVar, int i) {
        pq3.j.l(wueVar);
        wueVar.x(i, -1);
    }

    public final void B() {
        if (this.y || getAnimationDrawable() == null) {
            return;
        }
        this.y = true;
        this.z.post(this.A);
    }

    public final void C() {
        if (!this.y || getAnimationDrawable() == null) {
            return;
        }
        this.y = false;
        this.z.removeCallbacks(this.A);
        Animatable animationDrawable = getAnimationDrawable();
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    public final void D() {
        Integer numValueOf;
        RippleDrawable rippleDrawableB;
        switch (getMode().ordinal()) {
            case 0:
                numValueOf = Integer.valueOf(getNeutralColor());
                break;
            case 1:
                numValueOf = Integer.valueOf(getSecondaryContrast());
                break;
            case 2:
                numValueOf = Integer.valueOf(getPositiveColor());
                break;
            case 3:
                numValueOf = Integer.valueOf(getNegativeColor());
                break;
            case 4:
                numValueOf = Integer.valueOf(getSelectedColor());
                break;
            case 5:
                numValueOf = Integer.valueOf(getContrastColor());
                break;
            case 6:
                numValueOf = Integer.valueOf(getInactiveColor());
                break;
            case 7:
                numValueOf = Integer.valueOf(getThemedColor());
                break;
            case 8:
                numValueOf = null;
                break;
            default:
                ore.o();
                return;
        }
        ImageView iconView = getIconView();
        a8g a8gVar = pq3.j;
        if (numValueOf != null) {
            a8gVar.l(this);
            ShapeDrawable currentShape = getCurrentShape();
            currentShape.getPaint().setColor(numValueOf.intValue());
            rippleDrawableB = col.c(-1315861, currentShape, null, 4);
        } else {
            int i = ((bs0) a8gVar.h(this).u().c.g).c;
            ShapeDrawable currentShape2 = getCurrentShape();
            currentShape2.getPaint().setColor(-1);
            rippleDrawableB = col.b(i, null, currentShape2);
        }
        iconView.setBackground(rippleDrawableB);
    }

    public final Drawable getIconDrawable() {
        return getIconView().getDrawable();
    }

    public final sue getImageSize() {
        zv8 zv8Var = H[2];
        return (sue) this.G.b;
    }

    public final rue getMode() {
        zv8 zv8Var = H[0];
        return (rue) this.E.b;
    }

    public final que getShape() {
        zv8 zv8Var = H[1];
        return (que) this.F.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        B();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C();
    }

    public final void setAccessibility(Integer num) {
        String string;
        ImageView iconView = getIconView();
        if (num != null) {
            string = getContext().getString(num.intValue());
        } else {
            string = null;
        }
        iconView.setContentDescription(string);
    }

    public final void setButtonPadding(int i) {
        ImageView iconView = getIconView();
        int iK = gm0.K(yl5.c() * i);
        iconView.setPadding(iK, iK, iK, iK);
    }

    public final void setCounter(int i) {
        if (n7j.n(getStubCounterView()) || i != 0) {
            n7j.m(getStubCounterView(), getCounterView(), null);
            pu4.c(getCounterView(), Integer.valueOf(i), false, 4);
            getCounterView().setVisibility(i == 0 ? 8 : 0);
        }
    }

    public final void setIcon(Drawable drawable) {
        getIconView().setImageDrawable(drawable);
        B();
    }

    public final void setIconScaleType(ImageView.ScaleType scaleType) {
        getIconView().setScaleType(scaleType);
    }

    public final void setIconTint(int i) {
        getIconView().setImageTintList(ColorStateList.valueOf(i));
    }

    public final void setImageSize(sue sueVar) {
        this.G.B(this, H[2], sueVar);
    }

    public final void setListener(tue tueVar) {
        this.x = tueVar;
    }

    public final void setMode(rue rueVar) {
        this.E.B(this, H[0], rueVar);
    }

    public final void setShape(que queVar) {
        this.F.B(this, H[1], queVar);
    }

    public final void setTextColor(int i) {
        getCounterView().setTextColor(i);
    }

    public final void setTitle(ynh ynhVar) {
        if (n7j.n(getStubTitleView()) || ynhVar != null) {
            ViewStub stubTitleView = getStubTitleView();
            TextView titleView = getTitleView();
            if (!n7j.n(stubTitleView)) {
                ViewGroup viewGroup = (ViewGroup) stubTitleView.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(stubTitleView);
                viewGroup.removeViewInLayout(stubTitleView);
                ViewGroup.LayoutParams layoutParams = stubTitleView.getLayoutParams();
                layoutParams.height = titleView.getLayoutParams().height;
                layoutParams.width = titleView.getLayoutParams().width;
                titleView.setId(stubTitleView.getId());
                viewGroup.addView(titleView, iIndexOfChild, layoutParams);
                eg4 eg4Var = new eg4();
                eg4Var.c(this);
                int id = getIconView().getId();
                eg4Var.d(id, 3, 0, 3);
                new bsb(3, eg4Var, id).a(gm0.K(yl5.c() * 4.0f));
                eg4Var.d(id, 7, 0, 7);
                new bsb(7, eg4Var, id).a(gm0.K(yl5.c() * 4.0f));
                eg4Var.d(id, 6, 0, 6);
                new bsb(6, eg4Var, id).a(gm0.K(yl5.c() * 4.0f));
                eg4Var.d(id, 4, getStubTitleView().getId(), 3);
                new bsb(4, eg4Var, id).a(gm0.K(yl5.c() * 4.0f));
                eg4Var.a(this);
            }
            getTitleView().setText(ynhVar != null ? ynhVar.b(getContext()) : null);
            getTitleView().setVisibility(ynhVar == null ? 8 : 0);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            B();
        } else {
            C();
        }
    }

    public final void x(int i, int i2) {
        getIconView().setImageResource(i);
        getIconView().setImageTintList(ColorStateList.valueOf(i2));
    }

    public final void y(int i, Drawable drawable) {
        getIconView().setImageDrawable(drawable);
        getIconView().setImageTintList(ColorStateList.valueOf(i));
        B();
    }

    public final void setAccessibility(ynh ynhVar) {
        getIconView().setContentDescription(ynhVar != null ? ynhVar.b(getContext()) : null);
    }

    public final void setAccessibility(String str) {
        getIconView().setContentDescription(str);
    }
}
