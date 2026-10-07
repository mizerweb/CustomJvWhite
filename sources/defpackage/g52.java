package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class g52 extends wf4 implements wy1, uy1, zr4 {
    public static final /* synthetic */ zv8[] a2 = {new z8b(g52.class, "mode", "getMode()Lone/me/calls/ui/view/CallUserLargeView$Companion$ActionsMode;"), zo5.e(zfe.a, g52.class, "backgroundState", "getBackgroundState()Lone/me/calls/ui/view/CallUserLargeView$Companion$BackgroundState;")};
    public final ny8 A;
    public CharSequence A1;
    public final ny8 B;
    public CharSequence B1;
    public final ny8 C;
    public CharSequence C1;
    public final ny8 D;
    public CharSequence D1;
    public final ny8 E;
    public boolean E1;
    public final xme F;
    public e52 F1;
    public final ViewStub G;
    public af7 G1;
    public final ViewStub H;
    public as4 H1;
    public final ViewStub I;
    public fu1 I1;
    public final ViewStub J;
    public final ny8 J1;
    public final ViewStub K;
    public final ny8 K1;
    public final ny8 L1;
    public final View M1;
    public final ny8 N1;
    public final ny8 O1;
    public final ny8 P1;
    public final ny8 Q1;
    public final ny8 R1;
    public final ViewStub S1;
    public final ny8 T1;
    public final ViewStub U1;
    public final ny8 V1;
    public final ViewStub W1;
    public final f52 X1;
    public final f52 Y1;
    public boolean Z1;
    public final ViewStub n1;
    public final ViewStub o1;
    public final ViewStub p1;
    public final ViewStub q1;
    public final ViewStub r1;
    public final kwb s;
    public final ViewStub s1;
    public final ny8 t;
    public final ViewStub t1;
    public final ny8 u;
    public final View u1;
    public final ny8 v;
    public final GestureDetector v1;
    public final ny8 w;
    public i72 w1;
    public final ny8 x;
    public Boolean x1;
    public final ny8 y;
    public Boolean y1;
    public final ny8 z;
    public Boolean z1;

    public g52(Context context, ha9 ha9Var) {
        super(context);
        this.t = rx8.P(3, new ca0(context, 26));
        this.u = rx8.P(3, new ca0(context, 17));
        this.v = rx8.P(3, new ca0(context, 18));
        this.w = rx8.P(3, new ca0(context, 19));
        this.x = rx8.P(3, new ca0(context, 20));
        this.y = rx8.P(3, new ca0(context, 21));
        this.z = rx8.P(3, new wre(context, ha9Var, this, 7));
        this.A = rx8.P(3, new ca0(context, 22));
        this.B = rx8.P(3, new ca0(context, 23));
        this.C = rx8.P(3, new ca0(context, 24));
        this.D = rx8.P(3, new w42(context, this, 5));
        this.E = rx8.P(3, new w42(context, this, 6));
        xme xmeVarM = p90.M(new ca0(context, 27));
        this.F = xmeVarM;
        this.I1 = fu1.c;
        this.J1 = rx8.P(3, new ca0(context, 28));
        this.K1 = rx8.P(3, new x42(this, 2));
        this.L1 = rx8.P(3, new w42(this, context, 0));
        View view = new View(context);
        view.setId(R.id.call_user_hold_overlay);
        view.setAlpha(0.0f);
        view.setVisibility(8);
        this.M1 = view;
        this.N1 = rx8.P(3, new w42(this, context, 1));
        this.O1 = rx8.P(3, new ca0(context, 15));
        this.P1 = rx8.P(3, new x42(this, 0));
        this.Q1 = rx8.P(3, new ca0(context, 16));
        this.R1 = rx8.P(3, new w42(context, this, 2));
        this.T1 = rx8.P(3, new w42(context, this, 3));
        this.V1 = rx8.P(3, new w42(context, this, 4));
        this.X1 = new f52(this, 0);
        this.Y1 = new f52(this, 1);
        setLayoutParams(new uf4(-1, -1));
        View view2 = new View(context);
        view2.setId(R.id.call_user_top_spacer);
        view2.setLayoutParams(new uf4(0, gm0.K(104.0f * yl5.d().getDisplayMetrics().density) + ((k4f) xmeVarM.getValue()).e));
        this.u1 = view2;
        kwb kwbVar = new kwb(context);
        kwbVar.setId(R.id.call_user_full_avatar);
        kwbVar.setAvatarShape(awb.a);
        this.s = kwbVar;
        ViewStub viewStubI = bc1.i(context, R.id.call_user_full_name);
        this.I = viewStubI;
        ViewStub viewStubI2 = bc1.i(context, R.id.call_organization_name);
        this.J = viewStubI2;
        ViewStub viewStubI3 = bc1.i(context, R.id.call_user_full_status);
        this.H = viewStubI3;
        ViewStub viewStubI4 = bc1.i(context, R.id.call_users_large_video_view);
        this.K = viewStubI4;
        ViewStub viewStubI5 = bc1.i(context, R.id.call_users_action_negative);
        this.n1 = viewStubI5;
        ViewStub viewStubI6 = bc1.i(context, R.id.call_users_action_one_positive);
        this.o1 = viewStubI6;
        ViewStub viewStubI7 = bc1.i(context, R.id.call_users_action_two_positive);
        this.p1 = viewStubI7;
        ViewStub viewStubI8 = bc1.i(context, R.id.call_users_blocked_label);
        this.q1 = viewStubI8;
        ViewStub viewStubI9 = bc1.i(context, R.id.call_raise_hand_status);
        this.G = viewStubI9;
        ViewStub viewStubI10 = bc1.i(context, R.id.call_pip_camera_preview);
        this.S1 = viewStubI10;
        ViewStub viewStubI11 = bc1.i(context, R.id.call_incoming_camera_preview);
        this.U1 = viewStubI11;
        ViewStub viewStubI12 = bc1.i(context, R.id.call_incoming_avatar_preview_small);
        this.W1 = viewStubI12;
        ViewStub viewStubI13 = bc1.i(context, R.id.call_not_contact_warning);
        this.r1 = viewStubI13;
        ViewStub viewStubI14 = bc1.i(context, R.id.not_contact_view);
        this.s1 = viewStubI14;
        ViewStub viewStubI15 = bc1.i(context, R.id.not_contact_view_warning_icon);
        this.t1 = viewStubI15;
        this.v1 = new GestureDetector(context, new pi9(5, this));
        getRenderVideoView().setTouchEventHandler(new v42(this, 1));
        addView(viewStubI10);
        addView(view2);
        addView(kwbVar);
        addView(view, 0, 0);
        addView(viewStubI4, -1, -1);
        addView(viewStubI);
        addView(viewStubI2);
        addView(viewStubI3);
        addView(viewStubI12);
        addView(viewStubI11);
        addView(viewStubI5);
        addView(viewStubI6);
        addView(viewStubI7);
        addView(viewStubI8);
        addView(viewStubI9);
        addView(viewStubI13);
        addView(viewStubI14);
        addView(viewStubI15);
        eg4 eg4VarH = ch3.h(this);
        P(eg4VarH, getContext().getResources().getConfiguration().orientation == 1);
        eg4VarH.a(this);
        R(getContext().getResources().getConfiguration().orientation == 1);
    }

    public static ud1 B(Context context, g52 g52Var) {
        ud1 ud1Var = new ud1(context);
        ud1Var.setForeground(g52Var.getForegroundDrawable());
        ud1Var.setLayoutParams(new uf4(-1, -1));
        return ud1Var;
    }

    public static ImageView C(Context context, g52 g52Var) {
        ImageView imageViewD = qv1.d(context, R.id.call_raise_hand_status);
        imageViewD.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        imageViewD.setImageDrawable(g52Var.getRaiseHandIcon());
        qe7.H(imageViewD, 300L, new a52(g52Var, 0));
        return imageViewD;
    }

    public static void D(g52 g52Var, ok0 ok0Var, boolean z) {
        if (z) {
            return;
        }
        kwb.u(g52Var.getAvatarViewSmall(), ok0Var != null ? ok0Var.b : null, ok0Var != null ? ok0Var.a : null);
    }

    public static void E(g52 g52Var) {
        g52Var.getStatusTextView().setText(g52Var.C1);
    }

    public static ImageView F(Context context, g52 g52Var) {
        ImageView imageViewD = qv1.d(context, R.id.call_users_blocked_label);
        imageViewD.setLayoutParams(new ViewGroup.MarginLayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 64.0f), gm0.K(64.0f * yl5.d().getDisplayMetrics().density)));
        imageViewD.setVisibility(8);
        imageViewD.setBackground(g52Var.getLockedDrawable());
        imageViewD.setImageResource(R.drawable.icon_privacy_fill);
        imageViewD.setImageTintList(ColorStateList.valueOf(pq3.j.l(imageViewD).b.getIcon().b));
        return imageViewD;
    }

    public static final void I(g52 g52Var) {
        if (g52Var.Z1) {
            return;
        }
        g52Var.Z1 = true;
        js7 shineBackgroundView = g52Var.getShineBackgroundView();
        uf4 uf4Var = new uf4(0, 0);
        uf4Var.i = 0;
        uf4Var.l = 0;
        uf4Var.t = 0;
        uf4Var.v = 0;
        uf4Var.F = 0.0f;
        g52Var.addView(shineBackgroundView, 0, uf4Var);
    }

    public static /* synthetic */ void d0(g52 g52Var) {
        g52Var.c0(g52Var.getContext().getResources().getConfiguration().orientation == 1);
    }

    private final InsetDrawable getAvatarOvalDrawable() {
        return (InsetDrawable) this.O1.getValue();
    }

    private static /* synthetic */ void getAvatarOvalDrawable$annotations() {
    }

    private final kwb getAvatarViewSmall() {
        return (kwb) this.V1.getValue();
    }

    private final ImageView getBlockedLabelView() {
        return (ImageView) this.D.getValue();
    }

    private final qk0 getCallPlaceholder() {
        return (qk0) this.L1.getValue();
    }

    private final ud1 getCameraPreviewView() {
        return (ud1) this.R1.getValue();
    }

    private final cyb getEnableCameraPreviewButton() {
        return (cyb) this.T1.getValue();
    }

    private final GradientDrawable getForegroundDrawable() {
        return (GradientDrawable) this.P1.getValue();
    }

    private final jy7 getHoldOverlayController() {
        return (jy7) this.N1.getValue();
    }

    private final ShapeDrawable getLockedDrawable() {
        return (ShapeDrawable) this.K1.getValue();
    }

    private final yr4 getMarginTop() {
        yr4 yr4Var;
        as4 as4Var = this.H1;
        return (as4Var == null || (yr4Var = ((es4) as4Var).j) == null) ? yr4.d : yr4Var;
    }

    private final TextView getNameTextView() {
        return (TextView) this.w.getValue();
    }

    public final wue getNegativeButtonView() {
        return (wue) this.C.getValue();
    }

    private final aib getNotContactView() {
        return (aib) this.v.getValue();
    }

    private final ImageView getNotContactWarningIcon() {
        return (ImageView) this.t.getValue();
    }

    private final TextView getNotContactWarningView() {
        return (TextView) this.u.getValue();
    }

    private final TextView getOrganizationTextView() {
        return (TextView) this.x.getValue();
    }

    public final wue getPositiveButtonNeutralView() {
        return (wue) this.B.getValue();
    }

    public final wue getPositiveButtonSecondaryView() {
        return (wue) this.A.getValue();
    }

    private final f4e getRaiseHandIcon() {
        return (f4e) this.J1.getValue();
    }

    private final int getRaiseHandTopPadding() {
        return gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
    }

    private final ImageView getRaiseHandView() {
        return (ImageView) this.E.getValue();
    }

    private final c62 getRenderVideoView() {
        return (c62) this.z.getValue();
    }

    public final js7 getShineBackgroundView() {
        return (js7) this.Q1.getValue();
    }

    private final TextView getStatusTextView() {
        return (TextView) this.y.getValue();
    }

    public static c62 u(Context context, ha9 ha9Var, g52 g52Var) {
        c62 c62Var = new c62(context, ha9Var);
        c62Var.setId(R.id.call_users_large_video_view);
        c62Var.setForeground(g52Var.getForegroundDrawable());
        c62Var.setLayoutParams(new uf4(-1, -1));
        c62Var.setFullScreen(true);
        o7j.i(c62Var, false);
        c62Var.setListener(new z42(g52Var));
        c62Var.setVideoLayoutUpdatesControllerProvider(new x42(g52Var, 1));
        return c62Var;
    }

    public static void w(g52 g52Var, boolean z) {
        o7j.i(g52Var.getRenderVideoView(), z);
        boolean z2 = !z;
        if (isk.g(g52Var.s) != z2) {
            isk.d(g52Var.s, z2, 0L, new b52(g52Var, z2, 0), 2);
        }
    }

    public static kwb y(Context context, g52 g52Var) {
        kwb kwbVar = new kwb(context);
        kwbVar.setAvatarShape(awb.a);
        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 64.0f), gm0.K(64.0f * yl5.d().getDisplayMetrics().density)));
        kwbVar.setForeground(g52Var.getAvatarOvalDrawable());
        return kwbVar;
    }

    public static void z(g52 g52Var) {
        g52Var.getOrganizationTextView().setText(g52Var.B1);
    }

    @Override // defpackage.zr4
    public final void G(yr4 yr4Var) {
        if (n7j.n(this.G)) {
            o7j.h(getRaiseHandView(), yr4Var.b() + getRaiseHandTopPadding());
        }
    }

    @Override // defpackage.zr4
    public final List J(xr4 xr4Var, xr4 xr4Var2) {
        c79 c79VarW = yab.w();
        if (n7j.n(this.G)) {
            c79VarW.add(hsk.c((Math.abs(xr4Var.d) - xr4Var.f) * xr4Var.c, getRaiseHandView()));
        }
        return yab.j(c79VarW);
    }

    @Override // defpackage.zr4
    public final void M() {
        as4 as4Var;
        yr4 yr4Var;
        if (!n7j.n(this.G) || (as4Var = this.H1) == null || (yr4Var = ((es4) as4Var).j) == null) {
            return;
        }
        getRaiseHandView().setTranslationY(yr4Var.c ? 0.0f : -(yr4Var.b() - yr4Var.b));
    }

    public final void P(eg4 eg4Var, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        View view = this.u1;
        int id = view.getId();
        eg4Var.d(id, 3, 0, 3);
        eg4Var.d(id, 6, 0, 6);
        eg4Var.d(id, 7, 0, 7);
        int id2 = this.S1.getId();
        eg4Var.d(id2, 3, 0, 3);
        eg4Var.d(id2, 4, 0, 4);
        eg4Var.d(id2, 6, 0, 6);
        eg4Var.d(id2, 7, 0, 7);
        int id3 = this.W1.getId();
        eg4Var.d(id3, 4, view.getId(), 4);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(4, eg4Var, id3));
        eg4Var.d(id3, 6, 0, 6);
        eg4Var.d(id3, 7, 0, 7);
        ViewStub viewStub = this.I;
        qf4 qf4Var = new qf4(eg4Var, viewStub.getId());
        qf4Var.c(3);
        if (z) {
            qf4Var.p(view.getId());
        } else {
            qt4.w(56.0f, yl5.d().getDisplayMetrics().density, qf4Var.q(0));
        }
        qf4Var.o(0).a(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
        qf4Var.f(0).a(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
        ViewStub viewStub2 = this.J;
        int id4 = viewStub2.getId();
        eg4Var.d(id4, 3, viewStub.getId(), 4);
        qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4Var, id4));
        eg4Var.d(id4, 6, 0, 6);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4Var, id4));
        eg4Var.d(id4, 7, 0, 7);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4Var, id4));
        int id5 = this.H.getId();
        eg4Var.d(id5, 3, viewStub2.getId(), 4);
        new bsb(3, eg4Var, id5).a(gm0.K(z ? yl5.d().getDisplayMetrics().density * 16.0f : yl5.d().getDisplayMetrics().density * 4.0f));
        eg4Var.d(id5, 6, 0, 6);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4Var, id5));
        eg4Var.d(id5, 7, 0, 7);
        new bsb(7, eg4Var, id5).a(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
        kwb kwbVar = this.s;
        int id6 = kwbVar.getId();
        eg4Var.d(id6, 3, 0, 3);
        eg4Var.d(id6, 4, 0, 4);
        eg4Var.d(id6, 6, 0, 6);
        eg4Var.d(id6, 7, 0, 7);
        int id7 = this.M1.getId();
        eg4Var.d(id7, 3, kwbVar.getId(), 3);
        eg4Var.d(id7, 4, kwbVar.getId(), 4);
        eg4Var.d(id7, 6, kwbVar.getId(), 6);
        eg4Var.d(id7, 7, kwbVar.getId(), 7);
        int id8 = this.K.getId();
        eg4Var.d(id8, 4, 0, 4);
        eg4Var.d(id8, 3, 0, 3);
        eg4Var.d(id8, 6, 0, 6);
        eg4Var.d(id8, 7, 0, 7);
        int id9 = this.U1.getId();
        eg4Var.d(id9, 6, 0, 6);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4Var, id9));
        eg4Var.d(id9, 7, 0, 7);
        new bsb(7, eg4Var, id9).a(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        ViewStub viewStub3 = this.n1;
        eg4Var.d(id9, 4, viewStub3.getId(), 3);
        new bsb(4, eg4Var, id9).a(gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
        int id10 = viewStub3.getId();
        eg4Var.d(id10, 6, 0, 6);
        ViewStub viewStub4 = this.o1;
        eg4Var.d(id10, 7, viewStub4.getId(), 6);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4Var, id10));
        eg4Var.d(id10, 4, 0, 4);
        bsb bsbVar = new bsb(4, eg4Var, id10);
        if (z) {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 86.0f;
        } else {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 40.0f;
        }
        bsbVar.a(gm0.K(f2 * f));
        eg4Var.g(id10).d.V = 2;
        int id11 = viewStub4.getId();
        eg4Var.d(id11, 6, viewStub3.getId(), 7);
        new bsb(6, eg4Var, id11).a(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
        ViewStub viewStub5 = this.p1;
        eg4Var.d(id11, 7, viewStub5.getId(), 6);
        new bsb(7, eg4Var, id11).a(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
        eg4Var.d(id11, 3, viewStub3.getId(), 3);
        int id12 = viewStub5.getId();
        eg4Var.d(id12, 7, 0, 7);
        eg4Var.d(id12, 6, viewStub4.getId(), 7);
        new bsb(6, eg4Var, id12).a(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        eg4Var.d(id12, 3, viewStub3.getId(), 3);
        int id13 = this.q1.getId();
        eg4Var.d(id13, 4, kwbVar.getId(), 4);
        bsb bsbVar2 = new bsb(4, eg4Var, id13);
        if (p90.E(this)) {
            f3 = yl5.d().getDisplayMetrics().density;
            f4 = -4.0f;
        } else {
            f3 = yl5.d().getDisplayMetrics().density;
            f4 = -8.0f;
        }
        bsbVar2.a(gm0.K(f4 * f3));
        eg4Var.d(id13, 7, kwbVar.getId(), 7);
        new bsb(7, eg4Var, id13).a(p90.E(this) ? gm0.K(4.0f * yl5.d().getDisplayMetrics().density) : gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        int id14 = this.G.getId();
        eg4Var.d(id14, 3, 0, 3);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4Var, id14));
        eg4Var.d(id14, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4Var, id14));
        int id15 = this.s1.getId();
        eg4Var.d(id15, 3, 0, 3);
        eg4Var.d(id15, 4, 0, 4);
        eg4Var.d(id15, 6, 0, 6);
        eg4Var.d(id15, 7, 0, 7);
    }

    public final void Q(eg4 eg4Var, boolean z, boolean z2) {
        ViewStub viewStub = this.t1;
        ViewStub viewStub2 = this.r1;
        if (!z2) {
            qf4 qf4Var = new qf4(eg4Var, viewStub2.getId());
            qf4Var.c(4);
            qf4Var.q(0).a(gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
            qf4Var.n(viewStub.getId());
            qf4Var.f(0);
            int id = viewStub.getId();
            eg4Var.d(id, 3, viewStub2.getId(), 3);
            eg4Var.d(id, 4, viewStub2.getId(), 4);
            new bsb(4, eg4Var, id).a(0);
            eg4Var.d(id, 6, 0, 6);
            eg4Var.d(id, 7, viewStub2.getId(), 6);
            new bsb(7, eg4Var, id).a(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
            eg4Var.g(id).d.V = 2;
            return;
        }
        View view = this.u1;
        if (z) {
            qf4 qf4Var2 = new qf4(eg4Var, viewStub2.getId());
            qf4Var2.c(3);
            ViewStub viewStub3 = this.W1;
            qf4Var2.b(viewStub3.getId()).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
            qf4Var2.o(0);
            qf4Var2.f(0);
            int id2 = viewStub3.getId();
            eg4Var.d(id2, 4, view.getId(), 4);
            qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(4, eg4Var, id2));
            eg4Var.d(id2, 6, 0, 6);
            eg4Var.d(id2, 7, 0, 7);
            qf4 qf4Var3 = new qf4(eg4Var, viewStub.getId());
            qf4Var3.c(3);
            qf4Var3.b(viewStub2.getId()).a(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
            qf4Var3.o(0);
            qf4Var3.f(0);
            return;
        }
        qf4 qf4Var4 = new qf4(eg4Var, viewStub2.getId());
        qf4Var4.c(4);
        qf4Var4.p(view.getId()).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        qf4Var4.o(0);
        qf4Var4.f(0);
        int id3 = this.I.getId();
        eg4Var.d(id3, 3, viewStub2.getId(), 4);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4Var, id3));
        eg4Var.d(id3, 6, 0, 6);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4Var, id3));
        eg4Var.d(id3, 7, 0, 7);
        new bsb(7, eg4Var, id3).a(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        qf4 qf4Var5 = new qf4(eg4Var, viewStub.getId());
        qf4Var5.c(3);
        qf4Var5.b(viewStub2.getId()).a(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        qf4Var5.o(0);
        qf4Var5.f(0);
    }

    public final void R(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        if (z) {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 200.0f;
        } else {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 100.0f;
        }
        int iK = gm0.K(f2 * f);
        kwb kwbVar = this.s;
        ViewGroup.LayoutParams layoutParams = kwbVar.getLayoutParams();
        if (layoutParams == null) {
            p51.d();
            return;
        }
        layoutParams.width = iK;
        layoutParams.height = iK;
        kwbVar.setLayoutParams(layoutParams);
        int iK2 = z ? gm0.K(64.0f * yl5.d().getDisplayMetrics().density) : gm0.K(yl5.d().getDisplayMetrics().density * 32.0f);
        ImageView blockedLabelView = getBlockedLabelView();
        ViewGroup.LayoutParams layoutParams2 = blockedLabelView.getLayoutParams();
        if (layoutParams2 == null) {
            p51.d();
            return;
        }
        layoutParams2.width = iK2;
        layoutParams2.height = iK2;
        blockedLabelView.setLayoutParams(layoutParams2);
        int iK3 = z ? gm0.K(32.0f * yl5.d().getDisplayMetrics().density) : gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        ImageView notContactWarningIcon = getNotContactWarningIcon();
        ViewGroup.LayoutParams layoutParams3 = notContactWarningIcon.getLayoutParams();
        if (layoutParams3 == null) {
            p51.d();
            return;
        }
        layoutParams3.width = iK3;
        layoutParams3.height = iK3;
        notContactWarningIcon.setLayoutParams(layoutParams3);
        View view = this.u1;
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if (layoutParams4 == null) {
            p51.d();
            return;
        }
        layoutParams4.width = 0;
        layoutParams4.height = gm0.K(104.0f * yl5.d().getDisplayMetrics().density) + ((k4f) this.F.getValue()).e;
        view.setLayoutParams(layoutParams4);
        if (z) {
            f3 = yl5.d().getDisplayMetrics().density;
            f4 = 12.0f;
        } else {
            f3 = yl5.d().getDisplayMetrics().density;
            f4 = 4.0f;
        }
        int iK4 = gm0.K(f4 * f3);
        getBlockedLabelView().setPadding(iK4, iK4, iK4, iK4);
        getAvatarViewSmall().setVisibility(z ? 0 : 8);
        c0(z);
    }

    public final void S() {
        i72 i72Var = new i72(getRenderVideoView());
        i72Var.z = true;
        i72Var.A = true;
        this.w1 = i72Var;
        getRenderVideoView().setRendererListener(new z42(this));
    }

    public final void T(boolean z) {
        if (cqk.d(this.y1, Boolean.valueOf(z))) {
            return;
        }
        n7j.m(this.q1, getBlockedLabelView(), null);
        this.y1 = Boolean.valueOf(z);
        getBlockedLabelView().setVisibility(z ? 0 : 8);
    }

    public final void U(boolean z) {
        if (cqk.d(this.x1, Boolean.valueOf(z))) {
            return;
        }
        this.x1 = Boolean.valueOf(z);
        if (this.Z1) {
            getShineBackgroundView().setTalking(z);
        }
    }

    public final void V(boolean z, boolean z2) {
        this.F.b = khb.k;
        boolean zN = n7j.n(this.r1);
        eg4 eg4VarH = ch3.h(this);
        P(eg4VarH, z);
        if (zN) {
            Q(eg4VarH, z2, z);
        }
        eg4VarH.a(this);
        R(z);
        if (zN) {
            noh nohVar = q9i.a;
            q9i.a(z ? q9i.a : q9i.e, getNotContactWarningView());
        }
    }

    public final void W(boolean z, boolean z2) {
        ViewStub viewStub = this.S1;
        if (z || n7j.n(viewStub)) {
            n7j.m(viewStub, getCameraPreviewView(), null);
            ud1 cameraPreviewView = getCameraPreviewView();
            if (cameraPreviewView.b != z || !cameraPreviewView.c) {
                cameraPreviewView.b = z;
                cameraPreviewView.c = true;
                cameraPreviewView.a(z, true);
            }
            isk.e(getCameraPreviewView(), z, null, 6);
            isk.e(this.s, !z, null, 6);
        }
    }

    public final void X(int i, int i2, ynh ynhVar, af7 af7Var) {
        ViewStub viewStub = this.n1;
        n7j.n(viewStub);
        n7j.m(viewStub, getNegativeButtonView(), null);
        wue negativeButtonView = getNegativeButtonView();
        negativeButtonView.setVisibility(0);
        if (negativeButtonView.getVisibility() == 0) {
            negativeButtonView.setTitle(ynhVar);
            wue.z(negativeButtonView, i);
            negativeButtonView.setAccessibility(Integer.valueOf(i2));
            negativeButtonView.setListener(new y42(1, af7Var));
        }
        d0(this);
    }

    public final void Y(CharSequence charSequence, boolean z) {
        boolean z2 = charSequence == null || charSequence.length() == 0;
        ViewStub viewStub = this.r1;
        if ((!z2 || n7j.n(viewStub)) && !cqk.d(charSequence, this.D1)) {
            this.D1 = charSequence;
            TextView notContactWarningView = getNotContactWarningView();
            if (!n7j.n(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = notContactWarningView.getLayoutParams().height;
                layoutParams.width = notContactWarningView.getLayoutParams().width;
                notContactWarningView.setId(viewStub.getId());
                viewGroup.addView(notContactWarningView, iIndexOfChild, layoutParams);
                noh nohVar = q9i.a;
                q9i.a(p90.F(this) ? q9i.a : q9i.e, getNotContactWarningView());
            }
            n7j.m(this.t1, getNotContactWarningIcon(), null);
            getNotContactWarningIcon().setVisibility(!z2 ? 0 : 8);
            TextView notContactWarningView2 = getNotContactWarningView();
            notContactWarningView2.setVisibility(z2 ? 8 : 0);
            notContactWarningView2.setText(charSequence);
            eg4 eg4VarH = ch3.h(this);
            Q(eg4VarH, z, getContext().getResources().getConfiguration().orientation == 1);
            eg4VarH.a(this);
        }
    }

    public final void Z() {
        Long lValueOf = Long.valueOf(hashCode());
        kwb kwbVar = this.s;
        kwb.v(kwbVar, null, lValueOf, "");
        kwbVar.setOverlay(new yvb(getCallPlaceholder()));
    }

    public final void a0(boolean z, int i, int i2, ynh ynhVar, af7 af7Var) {
        ViewStub viewStub = this.p1;
        if (n7j.n(viewStub) || z) {
            n7j.m(viewStub, getPositiveButtonNeutralView(), null);
            wue positiveButtonNeutralView = getPositiveButtonNeutralView();
            positiveButtonNeutralView.setVisibility(z ? 0 : 8);
            if (positiveButtonNeutralView.getVisibility() == 0) {
                positiveButtonNeutralView.setTitle(ynhVar);
                wue.z(positiveButtonNeutralView, i);
                positiveButtonNeutralView.setAccessibility(Integer.valueOf(i2));
                positiveButtonNeutralView.setListener(new y42(0, af7Var));
            }
            d0(this);
        }
    }

    @Override // defpackage.wy1
    public final void b(boolean z) {
        if (z) {
            if (n7j.n(this.H)) {
                TextView statusTextView = getStatusTextView();
                statusTextView.setTranslationY(0.0f);
                statusTextView.setAlpha(1.0f);
            }
            if (n7j.n(this.I)) {
                TextView nameTextView = getNameTextView();
                nameTextView.setTranslationY(0.0f);
                nameTextView.setAlpha(1.0f);
            }
            if (n7j.n(this.W1)) {
                kwb avatarViewSmall = getAvatarViewSmall();
                avatarViewSmall.setTranslationY(0.0f);
                avatarViewSmall.setAlpha(1.0f);
            }
            kwb kwbVar = this.s;
            kwbVar.setTranslationY(0.0f);
            kwbVar.setAlpha(1.0f);
            float f = n7j.n(this.K) ? getRenderVideoView().q : false ? 0.0f : 1.0f;
            if (this.Z1 && getShineBackgroundView().getAlpha() != f) {
                getShineBackgroundView().setAlpha(f);
            }
        }
    }

    public final void b0(boolean z, int i, ynh ynhVar, af7 af7Var, cf7 cf7Var) {
        ViewStub viewStub = this.o1;
        if (n7j.n(viewStub) || z) {
            n7j.m(viewStub, getPositiveButtonSecondaryView(), null);
            wue positiveButtonSecondaryView = getPositiveButtonSecondaryView();
            positiveButtonSecondaryView.setVisibility(z ? 0 : 8);
            if (positiveButtonSecondaryView.getVisibility() == 0) {
                positiveButtonSecondaryView.setTitle(ynhVar);
                cf7Var.invoke(positiveButtonSecondaryView);
                positiveButtonSecondaryView.setAccessibility(Integer.valueOf(i));
                positiveButtonSecondaryView.setListener(new y42(2, af7Var));
            }
            d0(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0115  */
    public final void c0(boolean z) {
        int iK;
        float f;
        float f2;
        boolean z2;
        float f3;
        float f4;
        ViewStub viewStub = this.p1;
        boolean z3 = n7j.n(viewStub) && getPositiveButtonNeutralView().getVisibility() == 0;
        ViewStub viewStub2 = this.o1;
        if (n7j.n(viewStub2) && getPositiveButtonSecondaryView().getVisibility() == 0 && n7j.n(viewStub) && getPositiveButtonNeutralView().getVisibility() == 0) {
            if (z) {
                f3 = yl5.d().getDisplayMetrics().density;
                f4 = 28.0f;
            } else {
                f3 = yl5.d().getDisplayMetrics().density;
                f4 = 24.0f;
            }
            iK = gm0.K(f4 * f3);
        } else if ((n7j.n(viewStub2) && getPositiveButtonSecondaryView().getVisibility() == 0) || (n7j.n(viewStub) && getPositiveButtonNeutralView().getVisibility() == 0)) {
            if (z) {
                f = yl5.d().getDisplayMetrics().density;
                f2 = 40.0f;
            } else {
                f = yl5.d().getDisplayMetrics().density;
                f2 = 54.0f;
            }
            iK = gm0.K(f2 * f);
        } else {
            iK = gm0.K(0.0f * yl5.d().getDisplayMetrics().density);
        }
        if (n7j.n(this.n1)) {
            ViewGroup.LayoutParams layoutParams = getNegativeButtonView().getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0) != iK) {
                wue negativeButtonView = getNegativeButtonView();
                ViewGroup.LayoutParams layoutParams2 = negativeButtonView.getLayoutParams();
                if (layoutParams2 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.setMarginEnd(iK);
                    negativeButtonView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        int i = z3 ? iK : 0;
        ViewGroup.LayoutParams layoutParams3 = getPositiveButtonSecondaryView().getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart() : 0) == iK) {
            ViewGroup.LayoutParams layoutParams4 = getPositiveButtonSecondaryView().getLayoutParams();
            z2 = (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd() : 0) == i;
        }
        if (n7j.n(viewStub2) && !z2) {
            wue positiveButtonSecondaryView = getPositiveButtonSecondaryView();
            ViewGroup.LayoutParams layoutParams5 = positiveButtonSecondaryView.getLayoutParams();
            if (layoutParams5 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams5;
            marginLayoutParams2.setMarginStart(iK);
            marginLayoutParams2.setMarginEnd(i);
            positiveButtonSecondaryView.setLayoutParams(marginLayoutParams2);
        }
        if (n7j.n(viewStub)) {
            ViewGroup.LayoutParams layoutParams6 = getPositiveButtonNeutralView().getLayoutParams();
            if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams6).getMarginStart() : 0) != iK) {
                wue positiveButtonNeutralView = getPositiveButtonNeutralView();
                ViewGroup.LayoutParams layoutParams7 = positiveButtonNeutralView.getLayoutParams();
                if (layoutParams7 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams7;
                marginLayoutParams3.setMarginStart(iK);
                positiveButtonNeutralView.setLayoutParams(marginLayoutParams3);
            }
        }
    }

    public final void e0(CharSequence charSequence) {
        getNameTextView().setText(charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x0028 A[RETURN] */
    public final void f0(npi npiVar) {
        ViewStub viewStub = this.K;
        if (npiVar != null) {
            boolean z = npiVar.g;
            p4j p4jVar = null;
            if (!npiVar.b || !z) {
                if (z) {
                    p4jVar = npiVar.h;
                } else if (npiVar.c) {
                    p4jVar = npiVar.d;
                }
            }
            if (!(p4jVar != null ? p4jVar.a : false)) {
                if (!n7j.n(viewStub)) {
                    return;
                }
            }
        } else if (!n7j.n(viewStub)) {
            return;
        }
        c62 renderVideoView = getRenderVideoView();
        if (!n7j.n(viewStub)) {
            ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewStub);
            viewGroup.removeViewInLayout(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            layoutParams.height = renderVideoView.getLayoutParams().height;
            layoutParams.width = renderVideoView.getLayoutParams().width;
            renderVideoView.setId(viewStub.getId());
            viewGroup.addView(renderVideoView, iIndexOfChild, layoutParams);
            o7j.i(getRenderVideoView(), false);
        }
        c62 renderVideoView2 = getRenderVideoView();
        int i = c62.r;
        renderVideoView2.j = npiVar;
        renderVideoView2.k = false;
        getRenderVideoView().g();
    }

    public final d52 getBackgroundState() {
        zv8 zv8Var = a2[1];
        return (d52) this.Y1.b;
    }

    public final c52 getMode() {
        zv8 zv8Var = a2[0];
        return (c52) this.X1.b;
    }

    public final wue getPositiveButton() {
        return getPositiveButtonSecondaryView();
    }

    @Override // defpackage.uy1
    public /* bridge */ /* synthetic */ boolean getShouldScaleMainOpponent() {
        return false;
    }

    public final i72 getZoomHelper() {
        return this.w1;
    }

    @Override // defpackage.uy1
    public final void h(boolean z) {
        if (z) {
            if (n7j.n(this.I)) {
                getNameTextView().setAlpha(1.0f);
            }
            if (n7j.n(this.H)) {
                getStatusTextView().setAlpha(1.0f);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    @Override // defpackage.uy1
    public final void k(c79 c79Var, boolean z, long j) {
        boolean z2;
        long j2;
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (n7j.n(this.I)) {
            TextView nameTextView = getNameTextView();
            if (isk.h(nameTextView, z)) {
                z2 = z;
                j2 = j;
                c79Var.add(isk.b(nameTextView, z2, f, f2, j2));
            } else {
                z2 = z;
                j2 = j;
            }
        } else {
            z2 = z;
            j2 = j;
        }
        if (n7j.n(this.H)) {
            TextView statusTextView = getStatusTextView();
            if (isk.h(statusTextView, z2)) {
                c79Var.add(isk.b(statusTextView, z2, f, f2, j2));
            }
        }
    }

    @Override // defpackage.wy1
    public final void l(c79 c79Var, boolean z, long j) {
        if (n7j.n(this.H)) {
            isk.a(c79Var, getStatusTextView(), z);
        }
        if (n7j.n(this.I)) {
            isk.a(c79Var, getNameTextView(), z);
        }
        if (n7j.n(this.W1)) {
            isk.a(c79Var, getAvatarViewSmall(), z);
        }
        if (n7j.n(this.K) ? getRenderVideoView().q : false) {
            return;
        }
        if (this.Z1) {
            c79Var.add(ObjectAnimator.ofFloat(getShineBackgroundView(), (Property<js7, Float>) ViewGroup.ALPHA, z ? 0.0f : 1.0f, z ? 1.0f : 0.0f));
        }
        isk.a(c79Var, this.s, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getShineBackgroundView().getVisibility() == 0) {
            getShineBackgroundView().c();
        }
        if (n7j.n(this.G) && cqk.d(this.z1, Boolean.TRUE)) {
            getRaiseHandIcon().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getShineBackgroundView().d();
        if (n7j.n(this.G)) {
            getRaiseHandIcon().stop();
        }
    }

    @Override // defpackage.wf4, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e0(this.A1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e0(this.A1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.v1.onTouchEvent(motionEvent);
    }

    public final void setBackgroundState(d52 d52Var) {
        this.Y1.B(this, a2[1], d52Var);
    }

    public final void setCameraPreviewButtonEnable(CharSequence charSequence) {
        boolean z = charSequence == null || charSequence.length() == 0;
        boolean z2 = !z;
        ViewStub viewStub = this.U1;
        if (!z || n7j.n(viewStub)) {
            n7j.m(viewStub, getEnableCameraPreviewButton(), null);
            isk.d(getEnableCameraPreviewButton(), z2, 0L, null, 6);
            cyb enableCameraPreviewButton = getEnableCameraPreviewButton();
            if (charSequence == null) {
                charSequence = "";
            }
            enableCameraPreviewButton.setText(charSequence);
        }
    }

    public final void setControlsMediator(as4 as4Var) {
        this.H1 = as4Var;
    }

    public final void setCountry(String str) {
        aib notContactView = getNotContactView();
        ViewStub viewStub = this.s1;
        if (!n7j.n(viewStub)) {
            ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewStub);
            viewGroup.removeViewInLayout(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            layoutParams.height = notContactView.getLayoutParams().height;
            layoutParams.width = notContactView.getLayoutParams().width;
            notContactView.setId(viewStub.getId());
            viewGroup.addView(notContactView, iIndexOfChild, layoutParams);
            getNotContactView().setVisibility(0);
        }
        getNotContactView().setCountry(str);
    }

    public final void setHold(boolean z) {
        getHoldOverlayController().a(z, true);
    }

    public final void setListener(e52 e52Var) {
        this.F1 = e52Var;
    }

    public final void setMode(c52 c52Var) {
        this.X1.B(this, a2[0], c52Var);
    }

    public final void setName(CharSequence charSequence) {
        ViewStub viewStub = this.I;
        if ((n7j.n(viewStub) || charSequence != null) && !TextUtils.equals(this.A1, charSequence)) {
            n7j.m(viewStub, getNameTextView(), null);
            this.A1 = charSequence;
            if (charSequence != null && !r5h.X0(charSequence)) {
                e0(charSequence);
            }
            isk.d(getNameTextView(), !(charSequence == null || r5h.X0(charSequence)), 0L, new v42(this, 2), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setNameAutoSizeEnabled(boolean z) {
        if (this.E1 == z) {
            return;
        }
        this.E1 = z;
        if (z) {
            TextView nameTextView = getNameTextView();
            if (Build.VERSION.SDK_INT >= 27) {
                nameTextView.setAutoSizeTextTypeUniformWithConfiguration(20, 28, 1, 2);
                return;
            } else {
                if (nameTextView instanceof lg0) {
                    ((lg0) nameTextView).setAutoSizeTextTypeUniformWithConfiguration(20, 28, 1, 2);
                    return;
                }
                return;
            }
        }
        TextView nameTextView2 = getNameTextView();
        if (Build.VERSION.SDK_INT >= 27) {
            nameTextView2.setAutoSizeTextTypeWithDefaults(0);
        } else if (nameTextView2 instanceof lg0) {
            ((lg0) nameTextView2).setAutoSizeTextTypeWithDefaults(0);
        }
        noh nohVar = q9i.a;
        q9i.a(q9i.a, getNameTextView());
    }

    public final void setOrganization(CharSequence charSequence) {
        ViewStub viewStub = this.J;
        if ((n7j.n(viewStub) || charSequence != null) && !cqk.d(this.B1, charSequence)) {
            n7j.m(viewStub, getOrganizationTextView(), null);
            this.B1 = charSequence;
            if (charSequence != null && !r5h.X0(charSequence)) {
                getOrganizationTextView().setText(charSequence);
            }
            isk.d(getOrganizationTextView(), !(charSequence == null || r5h.X0(charSequence)), 0L, new v42(this, 3), 2);
        }
    }

    public final void setParticipantId(fu1 fu1Var) {
        this.I1 = fu1Var;
    }

    public final void setRaiseHand(boolean z) {
        ViewStub viewStub = this.G;
        if (n7j.n(viewStub) || z) {
            this.z1 = Boolean.valueOf(z);
            ImageView raiseHandView = getRaiseHandView();
            if (!n7j.n(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = raiseHandView.getLayoutParams().height;
                layoutParams.width = raiseHandView.getLayoutParams().width;
                raiseHandView.setId(viewStub.getId());
                viewGroup.addView(raiseHandView, iIndexOfChild, layoutParams);
                o7j.h(getRaiseHandView(), getMarginTop().b() + getRaiseHandTopPadding());
            }
            isk.d(getRaiseHandView(), z, 50L, null, 4);
            f4e raiseHandIcon = getRaiseHandIcon();
            if (z) {
                raiseHandIcon.start();
            } else {
                raiseHandIcon.stop();
            }
        }
    }

    public final void setRegistration(String str) {
        aib notContactView = getNotContactView();
        ViewStub viewStub = this.s1;
        if (!n7j.n(viewStub)) {
            ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewStub);
            viewGroup.removeViewInLayout(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            layoutParams.height = notContactView.getLayoutParams().height;
            layoutParams.width = notContactView.getLayoutParams().width;
            notContactView.setId(viewStub.getId());
            viewGroup.addView(notContactView, iIndexOfChild, layoutParams);
            getNotContactView().setVisibility(0);
        }
        getNotContactView().setRegistration(str);
    }

    public final void setSmallAvatar(ok0 ok0Var) {
        boolean z = ok0Var != null;
        ViewStub viewStub = this.W1;
        if (z || n7j.n(viewStub)) {
            n7j.m(viewStub, getAvatarViewSmall(), null);
            if (z) {
                kwb.u(getAvatarViewSmall(), ok0Var.b, ok0Var.a);
            }
            if (getContext().getResources().getConfiguration().orientation == 2) {
                return;
            }
            isk.e(getAvatarViewSmall(), z, new tc(this, 16, ok0Var), 2);
        }
    }

    public final void setStatus(CharSequence charSequence) {
        ViewStub viewStub = this.H;
        if ((n7j.n(viewStub) || charSequence != null) && !cqk.d(this.C1, charSequence)) {
            n7j.m(viewStub, getStatusTextView(), null);
            this.C1 = charSequence;
            if (charSequence != null && !r5h.X0(charSequence)) {
                getStatusTextView().setText(charSequence);
            }
            isk.d(getStatusTextView(), true ^ (charSequence == null || r5h.X0(charSequence)), 0L, new v42(this, 0), 2);
        }
    }

    public final void setVideoLayoutUpdatesControllerProvider(af7 af7Var) {
        this.G1 = af7Var;
    }
}
