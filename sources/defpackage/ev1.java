package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class ev1 extends FrameLayout {
    public static final /* synthetic */ zv8[] k = {new z8b(ev1.class, "boundariesOffset", "getBoundariesOffset()Lone/me/calls/ui/ui/pip/fake/boundaries/PipBoundariesOffset;"), zo5.e(zfe.a, ev1.class, "pipTheme", "getPipTheme()Lone/me/sdk/design/theme/OneMeTheme;"), new z8b(ev1.class, "pipMode", "getPipMode()Lone/me/calls/ui/view/pip/CallPipView$Companion$PipMode;")};
    public final ny8 a;
    public final ifh b;
    public final ny8 c;
    public o1d d;
    public final PointF e;
    public Rect f;
    public final dv1 g;
    public final dv1 h;
    public cv1 i;
    public final dv1 j;

    public ev1(Context context, ha9 ha9Var) {
        super(context);
        l1d.a = yl5.e(context) ? new n1d(178, 118) : new n1d(200, 132);
        this.a = rx8.P(3, new br1(10));
        this.b = new ifh(new wre(context, ha9Var, this, 2));
        r7 r7Var = r7.a;
        this.c = new sx1(r7.d(ha9Var)).getAccessor().d(872);
        this.d = l1d.b;
        this.e = new PointF();
        this.g = new dv1(new d1d(0, 0), this);
        this.h = new dv1(this, 0);
        this.j = new dv1(this, 1);
        setLayoutParams(new FrameLayout.LayoutParams(gm0.K(l1d.a.b * yl5.d().getDisplayMetrics().density), gm0.K(l1d.a.a * yl5.d().getDisplayMetrics().density)));
        addView(getFakePipView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s52 getFakePipView() {
        return (s52) this.b.getValue();
    }

    private final int getFlag() {
        return ((Number) this.a.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qn1 getPipPositionMediator() {
        return (qn1) this.c.getValue();
    }

    public final void c(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i2;
        this.d.l(f, f2, i3 - i, i4 - i2, getBoundariesOffset());
        PointF pointF = this.e;
        if (pointF.x == 0.0f || pointF.y == 0.0f) {
            pointF = null;
        }
        if (pointF == null) {
            return;
        }
        this.d.q(pointF.x - f, pointF.y - f2);
    }

    public final void d(qgc qgcVar) {
        s52 fakePipView = getFakePipView();
        CharSequence charSequence = qgcVar.j;
        zv8[] zv8VarArr = s52.C1;
        fakePipView.I(null, charSequence);
        fakePipView.setAvatar(qgcVar.a);
        fakePipView.setButtonAction(e61.a(e61.e, qgcVar.h, 11));
        fakePipView.E(qgcVar.d);
        fakePipView.D(qgcVar.f);
        fakePipView.setOpponentVideo(qgcVar.g);
    }

    public final cv1 getApplicationPipDepended() {
        return this.i;
    }

    public final d1d getBoundariesOffset() {
        zv8 zv8Var = k[0];
        return (d1d) this.g.b;
    }

    public final bv1 getPipMode() {
        zv8 zv8Var = k[2];
        return (bv1) this.j.b;
    }

    public final kbc getPipTheme() {
        zv8 zv8Var = k[1];
        return (kbc) this.h.b;
    }

    public final WindowManager.LayoutParams getWindowsViewLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(gm0.K(l1d.a.b * yl5.d().getDisplayMetrics().density), gm0.K(l1d.a.a * yl5.d().getDisplayMetrics().density), 1000, getFlag(), -3);
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.gravity = 51;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.d.n(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = this.f;
        if (rect != null && rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return;
        }
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || activity.isInPictureInPictureMode() || !activity.hasWindowFocus()) {
            return;
        }
        c(i, i2, i3, i4);
        this.f = new Rect(i, i2, i3, i4);
    }

    public final void setApplicationPipDepended(cv1 cv1Var) {
        this.i = cv1Var;
    }

    public final void setBackgroundCorners(float f) {
        getFakePipView().setBackgroundCorners(f);
    }

    public final void setBoundariesOffset(d1d d1dVar) {
        this.g.B(this, k[0], d1dVar);
    }

    public final void setListener(p52 p52Var) {
        s52 fakePipView = getFakePipView();
        fakePipView.x1 = fu1.c;
        fakePipView.s1 = p52Var;
    }

    public final void setPipMode(bv1 bv1Var) {
        this.j.B(this, k[2], bv1Var);
    }

    public final void setPipTheme(kbc kbcVar) {
        this.h.B(this, k[1], kbcVar);
    }

    public final void setStartPosition(PointF pointF) {
        if (pointF != null) {
            float f = pointF.x;
            float f2 = pointF.y;
            PointF pointF2 = this.e;
            pointF2.x = f;
            pointF2.y = f2;
        }
        c(getLeft(), getTop(), getRight(), getBottom());
    }

    public final void setVideoLayoutUpdatesControllerProvider(af7 af7Var) {
        getFakePipView().setVideoLayoutUpdatesControllerProvider(af7Var);
    }
}
