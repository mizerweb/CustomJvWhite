package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class w22 extends wf4 implements zr4, wy1, uy1 {
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final ny8 D;
    public final ny8 E;
    public final ny8 F;
    public final ny8 G;
    public PointF H;
    public final ViewStub I;
    public final ViewStub J;
    public lxi K;
    public as4 n1;
    public final ny8 o1;
    public o22 p1;
    public ll9 q1;
    public qgc r1;
    public final Executor s;
    public boolean s1;
    public final g52 t;
    public s22 t1;
    public final ny8 u;
    public d1d u1;
    public final ny8 v;
    public md1 v1;
    public final ny8 w;
    public AnimatorSet w1;
    public final i22 x;
    public a y;
    public String z;

    public w22(Context context, ha9 ha9Var, ExecutorService executorService) {
        super(context);
        this.s = executorService;
        r7 r7Var = r7.a;
        sx1 sx1Var = new sx1(r7.d(ha9.b));
        this.u = sx1Var.getAccessor().d(872);
        this.v = sx1Var.getAccessor().d(874);
        this.w = rx8.P(3, new z2(this, 25, ha9Var));
        this.x = new i22(0);
        ifh ifhVar = ns4.b;
        this.z = oc9.b0();
        this.A = rx8.P(3, new z2(context, 26, this));
        this.B = rx8.P(3, new wre(context, ha9Var, this, 5));
        this.C = rx8.P(3, new ca0(context, 12));
        this.D = rx8.P(3, new ca0(context, 13));
        this.E = sx1Var.getAccessor().d(54);
        this.F = sx1Var.getAccessor().d(66);
        this.G = rx8.P(3, new r22(this, 3));
        this.o1 = rx8.P(3, new br1(26));
        setLayoutParams(new uf4(-1, -1));
        g52 g52Var = new g52(context, ha9Var);
        g52Var.setId(R.id.call_user_full_avatar);
        g52Var.setVideoLayoutUpdatesControllerProvider(new r22(this, 4));
        g52Var.S();
        i72 zoomHelper = g52Var.getZoomHelper();
        if (zoomHelper != null) {
            zoomHelper.B = new tc(this, 15, g52Var);
        }
        this.t = g52Var;
        ViewStub viewStubI = bc1.i(context, R.id.call_speaker_opponents_view);
        this.I = viewStubI;
        ViewStub viewStubI2 = bc1.i(context, R.id.call_users_speakers_pip_view);
        this.J = viewStubI2;
        addView(g52Var, -1, -1);
        addView(viewStubI2);
        addView(viewStubI);
        addView(getBottomSpaceView());
        addView(getZoomIndicatorView(), -2, -2);
        setClipChildren(false);
        eg4 eg4VarH = ch3.h(this);
        int id = viewStubI2.getId();
        eg4VarH.d(id, 7, 0, 7);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id));
        eg4VarH.d(id, 4, 0, 4);
        int id2 = g52Var.getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 4, 0, 4);
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 7, 0, 7);
        int id3 = getBottomSpaceView().getId();
        eg4VarH.d(id3, 4, 0, 4);
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 7, 0, 7);
        C(eg4VarH, getContext().getResources().getConfiguration().orientation == 1);
        eg4VarH.a(this);
        D(getContext().getResources().getConfiguration().orientation == 1);
    }

    private final Space getBottomSpaceView() {
        return (Space) this.C.getValue();
    }

    private final yr4 getBottomState() {
        yr4 yr4Var;
        as4 as4Var = this.n1;
        return (as4Var == null || (yr4Var = ((es4) as4Var).k) == null) ? yr4.d : yr4Var;
    }

    private final bn1 getCallIndicatorOrientationListener() {
        return (bn1) this.v.getValue();
    }

    private final k42 getCallsEngine() {
        return (k42) this.F.getValue();
    }

    private final ev1 getFakePipView() {
        return (ev1) this.B.getValue();
    }

    private final wo6 getFeaturePrefs() {
        return (wo6) this.E.getValue();
    }

    private final Runnable getHideZoomIndicatorRunnable() {
        return (Runnable) this.G.getValue();
    }

    private final ct1 getOpponentsAdapter() {
        return (ct1) this.w.getValue();
    }

    private final RecyclerView getOpponentsView() {
        return (RecyclerView) this.A.getValue();
    }

    private final f1d getPipAnimation() {
        return (f1d) this.o1.getValue();
    }

    private final qn1 getPipPositionMediator() {
        return (qn1) this.u.getValue();
    }

    private final yr4 getTopState() {
        yr4 yr4Var;
        as4 as4Var = this.n1;
        return (as4Var == null || (yr4Var = ((es4) as4Var).j) == null) ? yr4.d : yr4Var;
    }

    private final TextView getZoomIndicatorView() {
        return (TextView) this.D.getValue();
    }

    private final void setMainSpeaker(ll9 ll9Var) {
        d52 d52Var;
        fu1 fu1Var;
        o22 o22Var;
        ll9 ll9Var2 = this.q1;
        boolean zD = cqk.d(ll9Var2 != null ? ll9Var2.i : null, ll9Var != null ? ll9Var.i : null);
        this.q1 = ll9Var;
        int i = ll9Var != null ? ll9Var.o : 0;
        int i2 = i == 0 ? -1 : t22.$EnumSwitchMapping$0[qt4.D(i)];
        d52 d52Var2 = d52.e;
        if (i2 == -1 || i2 == 1) {
            d52Var = d52.f;
        } else if (i2 == 2) {
            d52Var = d52.b;
        } else if (i2 == 3) {
            d52Var = d52.a;
        } else if (i2 == 4) {
            d52Var = d52.d;
        } else {
            if (i2 != 5) {
                ore.o();
                return;
            }
            d52Var = d52Var2;
        }
        g52 g52Var = this.t;
        g52Var.setBackgroundState(d52Var);
        g52Var.setRaiseHand(ll9Var != null ? ll9Var.k : false);
        ok0 ok0Var = ll9Var != null ? ll9Var.a : null;
        kwb kwbVar = g52Var.s;
        kwb.u(kwbVar, ok0Var != null ? ok0Var.b : null, ok0Var != null ? ok0Var.a : null);
        kwbVar.setOverlay(null);
        if (ll9Var != null) {
            g52Var.setHold(d52Var == d52Var2);
        }
        g52Var.U(ll9Var != null ? ll9Var.e : false);
        g52Var.f0(ll9Var != null ? ll9Var.i : null);
        if (ll9Var == null || (fu1Var = ll9Var.c) == null) {
            fu1Var = fu1.c;
        }
        g52Var.setParticipantId(fu1Var);
        if (!zD && (o22Var = this.p1) != null) {
            npi npiVar = ll9Var != null ? ll9Var.i : null;
            p22 p22Var = (p22) o22Var;
            if (cqk.d(p22Var.b, npiVar)) {
                gm0.Y(p22.class.getName(), "Early return in updateSpeaker cuz of this.videoState == videoState");
            } else {
                p22Var.b = npiVar;
                Iterator it = p22Var.a.iterator();
                while (it.hasNext()) {
                    ((n22) it.next()).i();
                }
            }
        }
        O(this.s1, null);
    }

    public static void u(w22 w22Var, ll9 ll9Var) {
        w22Var.setMainSpeaker(ll9Var);
    }

    public static void v(w22 w22Var, g52 g52Var, int i) {
        int iIntValue;
        int iIntValue2;
        w22Var.getZoomIndicatorView().setText(i + "%");
        w22Var.getZoomIndicatorView().removeCallbacks(w22Var.getHideZoomIndicatorRunnable());
        isk.d(w22Var.getZoomIndicatorView(), true, 0L, null, 6);
        w22Var.getZoomIndicatorView().postDelayed(w22Var.getHideZoomIndicatorRunnable(), 1000L);
        k42 callsEngine = w22Var.getCallsEngine();
        i72 zoomHelper = g52Var.getZoomHelper();
        boolean z = false;
        if (zoomHelper != null && zoomHelper.y) {
            z = true;
        }
        j72 j72Var = ((n42) callsEngine).c;
        if (z) {
            Integer num = j72Var.a;
            if (num != null && (iIntValue2 = num.intValue()) >= i) {
                i = iIntValue2;
            }
            j72Var.a = Integer.valueOf(i);
            return;
        }
        Integer num2 = j72Var.b;
        if (num2 != null && (iIntValue = num2.intValue()) >= i) {
            i = iIntValue;
        }
        j72Var.b = Integer.valueOf(i);
    }

    public static void w(w22 w22Var, see seeVar) {
        w22Var.getOpponentsView().setItemAnimator(seeVar);
    }

    public static RecyclerView x(Context context, w22 w22Var) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.call_speaker_opponents_view);
        recyclerView.setAdapter(w22Var.getOpponentsAdapter());
        recyclerView.h(w22Var.x, -1);
        recyclerView.setLayoutParams(new uf4(-1, -2));
        a aVar = w22Var.y;
        if (aVar != null) {
            recyclerView.setRecycledViewPool(aVar);
        }
        recyclerView.k(new v22(0, w22Var));
        return recyclerView;
    }

    public static void y(w22 w22Var) {
        isk.d(w22Var.getZoomIndicatorView(), false, 0L, null, 6);
    }

    public static void z(boolean z, w22 w22Var, List list, boolean z2) {
        if (z) {
            w22Var.N(list, !z2);
        } else {
            w22Var.getOpponentsView().post(new jm(w22Var, list, z2, 1));
        }
    }

    @Override // defpackage.zr4
    public final void A(yr4 yr4Var) {
        o7j.g(getBottomSpaceView(), E(yr4Var));
        if (n7j.n(this.J) && this.H != null) {
            F(getFakePipView(), this.H);
        }
        this.t.getClass();
    }

    public final void B(boolean z) {
        yr4 yr4Var;
        AnimatorSet animatorSet = this.w1;
        boolean z2 = false;
        boolean z3 = animatorSet != null && animatorSet.isRunning();
        if (z && !z3 && isAttachedToWindow()) {
            float f = Resources.getSystem().getDisplayMetrics().widthPixels;
            c79 c79VarW = yab.w();
            if (n7j.n(this.J) && getFakePipView().getVisibility() == 0) {
                AnimatorSet animatorSetJ = isk.j(getFakePipView(), false, getFakePipView().getTranslationX(), getFakePipView().getTranslationX() + (getFakePipView().getX() + ((float) (getFakePipView().getWidth() / 2)) < f / 2.0f ? -(getFakePipView().getX() + getFakePipView().getWidth()) : f - getFakePipView().getX()));
                if (animatorSetJ != null) {
                    c79VarW.add(animatorSetJ);
                }
            }
            RecyclerView opponentsView = getOpponentsView();
            as4 as4Var = this.n1;
            if (as4Var != null && (yr4Var = ((es4) as4Var).k) != null && yr4Var.c) {
                z2 = true;
            }
            AnimatorSet animatorSetJ2 = isk.j(opponentsView, z2, f, 0.0f);
            if (animatorSetJ2 != null) {
                c79VarW.add(animatorSetJ2);
            }
            c79 c79VarJ = yab.j(c79VarW);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(c79VarJ);
            this.w1 = animatorSet2;
            animatorSet2.start();
        }
    }

    public final void C(eg4 eg4Var, boolean z) {
        ViewStub viewStub = this.I;
        qf4 qf4Var = new qf4(eg4Var, viewStub.getId());
        if (z) {
            qf4Var.c(3);
            qf4Var.b(getBottomSpaceView().getId());
            qf4Var.o(0);
        } else {
            qf4Var.c(6);
            qf4Var.a(0);
            qf4Var.q(0);
        }
        qf4Var.f(0);
        int id = getZoomIndicatorView().getId();
        if (z) {
            eg4Var.d(id, 4, viewStub.getId(), 3);
            bsb bsbVar = new bsb(4, eg4Var, id);
            ((eg4) bsbVar.c).g(bsbVar.b).d.P = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        } else {
            eg4Var.d(id, 4, getBottomSpaceView().getId(), 3);
            qt4.w(0.0f, yl5.d().getDisplayMetrics().density, new bsb(4, eg4Var, id));
        }
        eg4Var.d(id, 6, 0, 6);
        eg4Var.d(id, 7, 0, 7);
    }

    public final void D(boolean z) {
        RecyclerView opponentsView = getOpponentsView();
        ViewGroup.LayoutParams layoutParams = opponentsView.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        uf4 uf4Var = (uf4) layoutParams;
        ((ViewGroup.MarginLayoutParams) uf4Var).width = z ? -1 : -2;
        ((ViewGroup.MarginLayoutParams) uf4Var).height = z ? -2 : -1;
        opponentsView.setLayoutParams(uf4Var);
        int i = z ? 12 : 8;
        int i2 = z ? 8 : 16;
        int iK = gm0.K(i * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(i2 * yl5.d().getDisplayMetrics().density);
        i22 i22Var = this.x;
        i22Var.b = iK;
        i22Var.c = iK2;
        i22Var.d = iK3;
        getOpponentsView().X();
        int i3 = !z ? 1 : 0;
        RecyclerView opponentsView2 = getOpponentsView();
        getContext();
        opponentsView2.setLayoutManager(new LinearLayoutManager(i3, false));
    }

    public final int E(yr4 yr4Var) {
        if (yr4Var.c) {
            if (((f5d) getFeaturePrefs()).a()) {
                return zo5.b(24.0f, yl5.d().getDisplayMetrics().density, yr4Var.b());
            }
            return yr4Var.b();
        }
        boolean zF = p90.F(this);
        int i = yr4Var.b;
        return zF ? i : zo5.b(24.0f, yl5.d().getDisplayMetrics().density, i);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public final void F(ev1 ev1Var, PointF pointF) {
        PointF pointFC = o7j.c(ev1Var.getContext());
        if (getBottomState().b() == 0) {
            if (pointF == null) {
                pointF = pointFC;
            }
            this.H = pointF;
            return;
        }
        this.H = null;
        PointF pointF2 = new PointF(pointFC.x, pointFC.y - getBottomState().a);
        if (pointF == null) {
            pointF = pointF2;
        } else {
            if (pointF.x == 0.0f || pointF.y == 0.0f) {
                pointF = pointF2;
            } else if (pointF.y > pointF2.y) {
                pointF = new PointF(pointF.x, pointF2.y);
            }
        }
        ev1Var.setStartPosition(pointF);
    }

    @Override // defpackage.zr4
    public final void G(yr4 yr4Var) {
        this.t.G(yr4Var);
    }

    public final void H(d1d d1dVar) {
        this.u1 = d1dVar;
        if (n7j.n(this.J)) {
            getFakePipView().setBoundariesOffset(d1dVar);
        }
    }

    public final void I(ll9 ll9Var, qgc qgcVar, boolean z) {
        qgc qgcVar2 = this.r1;
        boolean z2 = (qgcVar2 == null || qgcVar == null || cqk.d(qgcVar2.c, qgcVar.c)) ? false : true;
        if (!n7j.n(this.J) || !z2) {
            setMainSpeaker(ll9Var);
            L(qgcVar, z);
            return;
        }
        L(qgcVar, false);
        f1d pipAnimation = getPipAnimation();
        ev1 fakePipView = getFakePipView();
        z2 z2Var = new z2(this, 24, ll9Var);
        pipAnimation.getClass();
        g52 g52Var = this.t;
        vx9 vx9Var = new vx9(z2Var, pipAnimation, g52Var);
        RectF rectF = new RectF(g52Var.getX(), g52Var.getY(), g52Var.getX() + g52Var.getMeasuredWidth(), g52Var.getY() + g52Var.getMeasuredHeight());
        RectF rectF2 = new RectF(fakePipView.getX(), fakePipView.getY(), fakePipView.getX() + fakePipView.getMeasuredWidth(), fakePipView.getY() + fakePipView.getMeasuredHeight());
        float fWidth = rectF2.width() / rectF.width();
        float fHeight = rectF2.height() / rectF.height();
        g52Var.setPivotX(rectF.top);
        g52Var.setPivotY(rectF.left);
        if (f1d.b()) {
            g52Var.setLayerType(2, null);
            fakePipView.setLayerType(2, null);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(g52Var, (Property<g52, Float>) View.X, rectF.left, rectF2.left);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(g52Var, (Property<g52, Float>) View.Y, rectF.top, rectF2.top);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(g52Var, (Property<g52, Float>) View.SCALE_X, 1.0f, fWidth);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(g52Var, (Property<g52, Float>) View.SCALE_Y, 1.0f, fHeight);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, yl5.d().getDisplayMetrics().density * 20.0f);
        valueAnimatorOfFloat.addUpdateListener(new z6(g52Var, 4));
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, valueAnimatorOfFloat, ObjectAnimator.ofFloat(fakePipView, (Property<ev1, Float>) View.ALPHA, 1.0f, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new e1d(pipAnimation, g52Var, fakePipView, rectF, vx9Var));
        animatorSet.start();
    }

    @Override // defpackage.zr4
    public final List J(xr4 xr4Var, xr4 xr4Var2) {
        boolean z = xr4Var2.a;
        c79 c79VarW = yab.w();
        Space bottomSpaceView = getBottomSpaceView();
        int iE = E(getBottomState());
        ViewGroup.LayoutParams layoutParams = bottomSpaceView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0, iE);
        valueAnimatorOfInt.addUpdateListener(new ak(0, bottomSpaceView));
        c79VarW.add(valueAnimatorOfInt);
        if (n7j.n(this.I)) {
            c79VarW.add(hsk.b(getOpponentsView(), z));
        }
        if (getZoomIndicatorView().getVisibility() == 0) {
            c79VarW.add(hsk.b(getZoomIndicatorView(), z));
        }
        c79VarW.addAll(this.t.J(xr4Var, xr4Var2));
        return yab.j(c79VarW);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [q22] */
    public final void K(List list, boolean z) {
        String strB0;
        wgc wgcVar = (wgc) ww3.t1(list);
        final List list2 = wgcVar != null ? wgcVar.c : null;
        if (list2 == null) {
            list2 = r66.a;
        }
        wgc wgcVar2 = (wgc) ww3.t1(list);
        if (wgcVar2 != null) {
            strB0 = wgcVar2.d;
        } else {
            ifh ifhVar = ns4.b;
            strB0 = oc9.b0();
        }
        final boolean z2 = (ns4.b(this.z) || ns4.b(strB0) || cqk.d(strB0, this.z)) ? false : true;
        if (!ns4.b(strB0)) {
            this.z = strB0;
        }
        boolean zIsEmpty = list2.isEmpty();
        ViewStub viewStub = this.I;
        if (!zIsEmpty || n7j.n(viewStub)) {
            AnimatorSet animatorSet = this.w1;
            if (animatorSet == null || !animatorSet.isRunning()) {
                RecyclerView opponentsView = getOpponentsView();
                if (!n7j.n(viewStub)) {
                    ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                    int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                    viewGroup.removeViewInLayout(viewStub);
                    ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                    layoutParams.height = opponentsView.getLayoutParams().height;
                    layoutParams.width = opponentsView.getLayoutParams().width;
                    opponentsView.setId(viewStub.getId());
                    viewGroup.addView(opponentsView, iIndexOfChild, layoutParams);
                    G(getTopState());
                    A(getBottomState());
                }
                if (z) {
                    getOpponentsAdapter().I(list2, null);
                    getOpponentsView().setVisibility(8);
                } else {
                    boolean z3 = !list2.isEmpty();
                    final boolean z4 = getOpponentsView().getVisibility() == 0;
                    this.s1 = z3;
                    O(z3, new cf7() { // from class: q22
                        @Override // defpackage.cf7
                        public final Object invoke(Object obj) {
                            ((Boolean) obj).getClass();
                            w22.z(z4, this, list2, z2);
                            return sbi.a;
                        }
                    });
                }
            }
        }
    }

    public final void L(qgc qgcVar, boolean z) {
        boolean z2;
        ViewStub viewStub = this.J;
        if ((qgcVar != null || n7j.n(viewStub)) && !cqk.d(this.r1, qgcVar)) {
            this.r1 = qgcVar;
            ev1 fakePipView = getFakePipView();
            if (n7j.n(viewStub)) {
                z2 = false;
            } else {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = fakePipView.getLayoutParams().height;
                layoutParams.width = fakePipView.getLayoutParams().width;
                fakePipView.setId(viewStub.getId());
                viewGroup.addView(fakePipView, iIndexOfChild, layoutParams);
                F(getFakePipView(), ((rn1) getPipPositionMediator()).e());
                d1d d1dVar = this.u1;
                if (d1dVar != null) {
                    getFakePipView().setBoundariesOffset(d1dVar);
                }
                z2 = true;
            }
            if (qgcVar != null) {
                getFakePipView().d(qgcVar);
            }
            getCallIndicatorOrientationListener().a(getFakePipView());
            AnimatorSet animatorSet = this.w1;
            if ((animatorSet == null || !animatorSet.isRunning()) && !z) {
                isk.d(getFakePipView(), qgcVar != null, z2 ? 0L : 150L, null, 4);
            }
        }
    }

    @Override // defpackage.zr4
    public final void M() {
        o7j.g(getBottomSpaceView(), E(getBottomState()));
        this.t.M();
    }

    public final void N(List list, boolean z) {
        see itemAnimator = getOpponentsView().getItemAnimator();
        if (z || itemAnimator == null) {
            getOpponentsAdapter().I(list, null);
        } else {
            getOpponentsView().setItemAnimator(null);
            getOpponentsAdapter().O(list, new z2(this, 23, itemAnimator));
        }
    }

    public final void O(boolean z, q22 q22Var) {
        yr4 yr4Var;
        if (n7j.n(this.I)) {
            as4 as4Var = this.n1;
            if (as4Var != null && (yr4Var = ((es4) as4Var).k) != null && !yr4Var.c) {
                z = false;
            }
            isk.d(getOpponentsView(), z, 0L, q22Var, 2);
        }
    }

    @Override // defpackage.wy1
    public final void b(boolean z) {
        if (z) {
            this.t.b(z);
        }
    }

    @Override // defpackage.uy1
    public final void d(RectF rectF, boolean z) {
        if (isk.h(this, z)) {
            float f = rectF.left;
            g52 g52Var = this.t;
            g52Var.setX(f);
            g52Var.setY(rectF.top);
            g52Var.setPivotX(0.0f);
            g52Var.setPivotY(0.0f);
            g52Var.setScaleX(rectF.width() / g52Var.getWidth());
            g52Var.setScaleY(rectF.height() / g52Var.getHeight());
        }
    }

    @Override // defpackage.uy1
    public boolean getShouldScaleMainOpponent() {
        npi npiVar;
        npi npiVar2;
        ll9 ll9Var = this.q1;
        qgc qgcVar = this.r1;
        boolean z = (ll9Var == null || (npiVar2 = ll9Var.i) == null || !npiVar2.c) ? false : true;
        boolean z2 = (qgcVar == null || (npiVar = qgcVar.g) == null || !npiVar.c) ? false : true;
        if (ll9Var == null || ll9Var.j || !z) {
            return (qgcVar == null || qgcVar.i || !z2) && ll9Var != null && ll9Var.j && z;
        }
        return true;
    }

    @Override // defpackage.uy1
    public final void h(boolean z) {
        if (z) {
            g52 g52Var = this.t;
            g52Var.h(z);
            g52Var.setX(0.0f);
            g52Var.setY(0.0f);
            g52Var.setPivotX(0.0f);
            g52Var.setPivotY(0.0f);
            g52Var.setScaleX(1.0f);
            g52Var.setScaleY(1.0f);
            if (n7j.n(this.J)) {
                getFakePipView().setAlpha(1.0f);
            }
        }
    }

    @Override // defpackage.uy1
    public final void j(boolean z) {
        if (n7j.n(this.J)) {
            ev1 fakePipView = getFakePipView();
            if (isk.h(fakePipView, z) && getShouldScaleMainOpponent()) {
                fakePipView.setAlpha(0.0f);
            }
        }
    }

    @Override // defpackage.uy1
    public final void k(c79 c79Var, boolean z, long j) {
        this.t.k(c79Var, z, j);
    }

    @Override // defpackage.wy1
    public final void l(c79 c79Var, boolean z, long j) {
        this.t.l(c79Var, z, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        yr4 yr4Var;
        super.onAttachedToWindow();
        Context context = getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 9);
        context.registerComponentCallbacks(md1Var);
        int i = ufeVar.a;
        boolean z = i == 1;
        eg4 eg4VarH = ch3.h(this);
        C(eg4VarH, z);
        eg4VarH.a(this);
        D(z);
        as4 as4Var = this.n1;
        if (as4Var != null && (yr4Var = ((es4) as4Var).k) != null) {
            A(yr4Var);
            boolean z2 = i == 1;
            zv8[] zv8VarArr = g52.a2;
            this.t.V(z2, false);
        }
        this.v1 = md1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.w1;
        if (animatorSet != null) {
            animatorSet.end();
        }
        this.w1 = null;
        getZoomIndicatorView().removeCallbacks(getHideZoomIndicatorRunnable());
        md1 md1Var = this.v1;
        if (md1Var != null) {
            getContext().unregisterComponentCallbacks(md1Var);
        }
        if (n7j.n(this.J)) {
            getCallIndicatorOrientationListener().e(getFakePipView());
        }
    }

    public final void setCallSpeakerMediator(o22 o22Var) {
        this.p1 = o22Var;
    }

    public final void setControlsMediator(as4 as4Var) {
        this.n1 = as4Var;
        this.t.setControlsMediator(as4Var);
    }

    public final void setListener(s22 s22Var) {
        this.t1 = s22Var;
        this.t.setListener(s22Var);
    }

    public final void setOpponentsViewPool(a aVar) {
        if (n7j.n(this.I)) {
            getOpponentsView().setRecycledViewPool(aVar);
        }
        this.y = aVar;
    }

    public final void setOrganization(CharSequence charSequence) {
        this.t.setOrganization(charSequence);
    }

    public final void setStatus(CharSequence charSequence) {
        this.t.setStatus(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.t.setName(charSequence);
    }

    public final void setVideoLayoutUpdatesController(lxi lxiVar) {
        this.K = lxiVar;
    }
}
