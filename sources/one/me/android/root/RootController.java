package one.me.android.root;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import defpackage.br4;
import defpackage.bt4;
import defpackage.c79;
import defpackage.cqk;
import defpackage.dwd;
import defpackage.gm0;
import defpackage.gte;
import defpackage.ha9;
import defpackage.hk9;
import defpackage.hn2;
import defpackage.hte;
import defpackage.hve;
import defpackage.j8e;
import defpackage.lve;
import defpackage.n1g;
import defpackage.n7j;
import defpackage.oc9;
import defpackage.ore;
import defpackage.pq3;
import defpackage.qd5;
import defpackage.qzb;
import defpackage.tp2;
import defpackage.v56;
import defpackage.ww3;
import defpackage.wy1;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/android/root/RootController;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RootController extends Widget {
    public static final /* synthetic */ zv8[] k = {new dwd(RootController.class, "fullScreenContainer", "getFullScreenContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), zo5.f(zfe.a, RootController.class, "topIndicatorView", "getTopIndicatorView()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(RootController.class, "dialogContainer", "getDialogContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new z8b(RootController.class, "fullScreenRouter", "getFullScreenRouter()Lcom/bluelinelabs/conductor/Router;"), new z8b(RootController.class, "dialogsRouter", "getDialogsRouter()Lcom/bluelinelabs/conductor/Router;"), new z8b(RootController.class, "topIndicatorRouter", "getTopIndicatorRouter()Lcom/bluelinelabs/conductor/Router;")};
    public final qzb a;
    public AnimatorSet b;
    public final j8e c;
    public final j8e d;
    public final j8e e;
    public final v56 f;
    public final v56 g;
    public final v56 h;
    public boolean i;
    public final hk9 j;

    public RootController(Bundle bundle) {
        super(bundle);
        this.a = new qzb(m35getAccountScopeuqN4xOY());
        this.c = viewBinding(R.id.root_screen);
        this.d = viewBinding(R.id.root_top_indicator);
        this.e = viewBinding(R.id.root_dialogs_container);
        this.f = new v56(11, (byte) 0);
        this.g = new v56(11, (byte) 0);
        this.h = new v56(11, (byte) 0);
        this.j = new hk9(2, this);
    }

    public static final boolean o1(RootController rootController, tp2 tp2Var) {
        Object tag = tp2Var.getTag(R.id.call_animation_indicator_show_tag);
        boolean zD = cqk.d(tag, "SHOW_ANIMATION_TAG");
        boolean zD2 = cqk.d(tag, "HIDE_ANIMATION_TAG");
        if (tag == null) {
            return tp2Var.getVisibility() == 0;
        }
        if (zD) {
            return true;
        }
        return !zD2 && tp2Var.getVisibility() == 0;
    }

    public static final void p1(RootController rootController, boolean z) {
        if (!z) {
            float translationY = rootController.z1().getTranslationY();
            int iK = gm0.K(64.0f * yl5.d().getDisplayMetrics().density);
            Integer numL = n7j.l(rootController.z1());
            if (translationY == (-(iK + (numL != null ? numL.intValue() : 0)))) {
                return;
            }
        } else if (rootController.z1().getTranslationY() == yl5.d().getDisplayMetrics().density * 0.0f) {
            return;
        }
        gm0.n("RootController", "validateStateIsNeeded for isVisible=" + z + ".");
        rootController.t1(z);
    }

    public final void A1() {
        if (this.i) {
            return;
        }
        gm0.n("RootController", "Initializing routers");
        zv8[] zv8VarArr = k;
        hve childRouter = getChildRouter((tp2) this.e.m(this, zv8VarArr[2]), "root:dialog");
        childRouter.e = 3;
        childRouter.S(true);
        zv8 zv8Var = zv8VarArr[4];
        this.g.b = childRouter;
        hve childRouter2 = getChildRouter(z1(), "root:topindicator");
        childRouter2.e = 1;
        childRouter2.S(false);
        zv8 zv8Var2 = zv8VarArr[5];
        this.h.b = childRouter2;
        hve childRouter3 = getChildRouter(v1(), "root:screen");
        childRouter3.e = 1;
        childRouter3.S(true);
        zv8 zv8Var3 = zv8VarArr[3];
        this.f.b = childRouter3;
        w1().a(this.j);
        this.a.h().e = this;
        this.i = true;
    }

    public final void B1(boolean z) {
        float f;
        float f2;
        if (z) {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 64.0f;
        } else {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 0.0f;
        }
        int iK = gm0.K(f2 * f);
        ViewGroup.LayoutParams layoutParams = v1().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) == iK) {
            return;
        }
        tp2 tp2VarV1 = v1();
        ViewGroup.LayoutParams layoutParams2 = tp2VarV1.getLayoutParams();
        if (layoutParams2 == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = iK;
        tp2VarV1.setLayoutParams(marginLayoutParams2);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        gm0.n("RootController", "RootController::onActivityResumed was called, dialog router initialized: " + this.i);
        this.a.h().e = this;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        hte hteVar = new hte(viewGroup.getContext());
        hteVar.setId(R.id.root_view_group);
        hteVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        View viewA = oc9.a(hteVar.getContext());
        viewA.setId(R.id.root_screen);
        bt4 bt4Var = new bt4(-1, -1);
        bt4Var.b(new AppBarLayout$ScrollingViewBehavior());
        viewA.setLayoutParams(bt4Var);
        hteVar.addView(viewA);
        tp2 tp2VarA = oc9.a(hteVar.getContext());
        tp2VarA.setId(R.id.root_top_indicator);
        tp2VarA.setLayoutParams(new bt4(-1, -2));
        tp2VarA.setTranslationY(-gm0.K(64.0f * yl5.d().getDisplayMetrics().density));
        hteVar.addView(tp2VarA);
        tp2 tp2VarA2 = oc9.a(hteVar.getContext());
        tp2VarA2.setId(R.id.root_dialogs_container);
        hteVar.addView(tp2VarA2, new bt4(-1, -1));
        hteVar.onThemeChanged(pq3.j.e(hteVar.getContext()).m());
        return hteVar;
    }

    @Override // defpackage.br4
    public final void onRestoreViewState(View view, Bundle bundle) {
        super.onRestoreViewState(view, bundle);
        gm0.n("RootController", "RootController::onRestoreViewState was called, routers initialized: " + this.i);
        A1();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        A1();
        gm0.n("RootController", "RootController::onViewCreated was called: routers initialized");
    }

    public final void q1(boolean z, br4 br4Var) {
        String str = z ? "SHOW_ANIMATION_TAG" : "HIDE_ANIMATION_TAG";
        if (z && !y1().o() && br4Var != null) {
            y1().T(oc9.e(br4Var, null, null));
        }
        z1().setTag(R.id.call_animation_indicator_show_tag, str);
        z1().setVisibility(0);
    }

    public final void r1(boolean z, boolean z2, CallIndicatorWidget callIndicatorWidget) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.b;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.b) != null) {
            animatorSet.cancel();
        }
        Integer numL = n7j.l(z1());
        float f = z ? yl5.d().getDisplayMetrics().density * 0.0f : -zo5.b(64.0f, yl5.d().getDisplayMetrics().density, numL != null ? numL.intValue() : 0);
        float y = z ? v1().getY() + gm0.K(64.0f * yl5.d().getDisplayMetrics().density) : v1().getY() - gm0.K(64.0f * yl5.d().getDisplayMetrics().density);
        q1(z, callIndicatorWidget);
        if (z2) {
            z1().setY(f);
            ViewGroup.LayoutParams layoutParams = v1().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = (int) y;
                v1().requestLayout();
            }
            t1(z);
            return;
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setDuration(250L);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(z1(), (Property<tp2, Float>) View.Y, z1().getY(), f);
        tp2 tp2VarV1 = v1();
        float y2 = v1().getY();
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("topMarginProp", y2, y));
        valueAnimatorOfPropertyValuesHolder.addUpdateListener(new gte(y2, tp2VarV1));
        animatorSet3.playTogether(objectAnimatorOfFloat, valueAnimatorOfPropertyValuesHolder);
        animatorSet3.addListener(new hn2(this, z));
        animatorSet3.start();
        this.b = animatorSet3;
    }

    public final void s1(boolean z, boolean z2, CallIndicatorWidget callIndicatorWidget) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.b;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.b) != null) {
            animatorSet.cancel();
        }
        KeyEvent.Callback callbackFindViewById = z1().findViewById(R.id.call_indicator_panel_container);
        wy1 wy1Var = callbackFindViewById instanceof wy1 ? (wy1) callbackFindViewById : null;
        float y = z ? v1().getY() + gm0.K(64.0f * yl5.d().getDisplayMetrics().density) : v1().getY();
        q1(z, callIndicatorWidget);
        if (z2) {
            if (wy1Var != null) {
                wy1Var.c(z);
            }
            z1().setTranslationY(0.0f);
            if (!z) {
                B1(false);
            }
            ViewGroup.LayoutParams layoutParams = v1().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = (int) y;
                v1().requestLayout();
            }
            t1(z);
            return;
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setDuration(250L);
        c79 c79VarW = yab.w();
        if (wy1Var != null) {
            wy1Var.l(c79VarW, z, animatorSet3.getDuration());
        }
        if (z) {
            tp2 tp2VarV1 = v1();
            float y2 = v1().getY();
            ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("topMarginProp", y2, y));
            valueAnimatorOfPropertyValuesHolder.addUpdateListener(new gte(y2, tp2VarV1));
            c79VarW.add(valueAnimatorOfPropertyValuesHolder);
        }
        animatorSet3.playTogether(yab.j(c79VarW));
        animatorSet3.addListener(new qd5(wy1Var, z, this));
        animatorSet3.start();
        this.b = animatorSet3;
    }

    public final void t1(boolean z) {
        float f;
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            KeyEvent.Callback callbackFindViewById = z1().findViewById(R.id.call_indicator_panel_container);
            wy1 wy1Var = callbackFindViewById instanceof wy1 ? (wy1) callbackFindViewById : null;
            if (wy1Var != null) {
                wy1Var.b(z);
            }
            z1().setTag(R.id.call_animation_indicator_show_tag, null);
            z1().setVisibility(z ? 0 : 8);
            tp2 tp2VarZ1 = z1();
            if (z) {
                f = yl5.d().getDisplayMetrics().density * 0.0f;
            } else {
                int iK = gm0.K(64.0f * yl5.d().getDisplayMetrics().density);
                Integer numL = n7j.l(z1());
                f = -(iK + (numL != null ? numL.intValue() : 0));
            }
            tp2VarZ1.setTranslationY(f);
            B1(z);
        }
        if (z || !y1().o()) {
            return;
        }
        y1().D();
        gm0.n("RootController", "call indicator was destroyed");
    }

    public final hve u1() {
        return (hve) this.g.m(this, k[4]);
    }

    public final tp2 v1() {
        return (tp2) this.c.m(this, k[0]);
    }

    public final hve w1() {
        return (hve) this.f.m(this, k[3]);
    }

    public final br4 x1() {
        lve lveVar = (lve) ww3.D1(w1().e());
        if (lveVar != null) {
            return lveVar.a;
        }
        return null;
    }

    public final hve y1() {
        return (hve) this.h.m(this, k[5]);
    }

    public final tp2 z1() {
        return (tp2) this.d.m(this, k[1]);
    }

    public RootController(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
