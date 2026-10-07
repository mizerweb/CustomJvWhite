package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import one.me.calls.ui.ui.call.CallScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bz1 extends wf4 implements wy1, uy1 {
    public final ViewStub A;
    public final ny8 B;
    public final ViewStub C;
    public final ny8 D;
    public final y8j E;
    public final ny8 F;
    public final ViewStub G;
    public final ny8 H;
    public final ViewStub I;
    public final ny8 J;
    public final sx1 s;
    public final xme t;
    public final ny8 u;
    public as4 v;
    public c1d w;
    public qq7 x;
    public zy1 y;
    public md1 z;

    public bz1(Context context, ha9 ha9Var) {
        super(context);
        r7 r7Var = r7.a;
        this.s = new sx1(r7.d(ha9.b));
        this.t = p90.M(new ca0(context, 8));
        this.u = rx8.P(3, new br1(20));
        ViewStub viewStubI = bc1.i(context, R.id.call_change_mode_tip_view);
        this.A = viewStubI;
        this.B = rx8.P(3, new ca0(context, 9));
        ViewStub viewStubI2 = bc1.i(context, R.id.call_change_mode_tab_view);
        this.C = viewStubI2;
        this.D = rx8.P(3, new ca0(context, 10));
        y8j y8jVar = new y8j(context);
        y8jVar.setId(R.id.call_modes_view_pager);
        y8jVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        y8jVar.setOrientation(1);
        this.E = y8jVar;
        yy1 yy1Var = new yy1(this, context);
        yy1Var.setId(R.id.call_modes_proxy_interceptor);
        yy1Var.setLayoutParams(new uf4(-1, -1));
        yy1Var.addView(y8jVar);
        this.F = rx8.P(3, new xy1(this, 2));
        ViewStub viewStubI3 = bc1.i(context, R.id.call_bottom_unavailable_control);
        this.G = viewStubI3;
        this.H = rx8.P(3, new wre(context, ha9Var, this, 3));
        ViewStub viewStubI4 = bc1.i(context, R.id.call_user_talking_view_label);
        this.I = viewStubI4;
        this.J = rx8.P(3, new z2(context, 22, this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(pq3.j.l(this).b.b().c);
        setId(R.id.call_screen_main_content_id);
        addView(yy1Var);
        addView(viewStubI4);
        addView(viewStubI3);
        addView(viewStubI2);
        addView(viewStubI);
        eg4 eg4VarH = ch3.h(this);
        int id = yy1Var.getId();
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 7, 0, 7);
        eg4VarH.d(id, 4, 0, 4);
        int id2 = viewStubI4.getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 7, 0, 7);
        int id3 = viewStubI3.getId();
        eg4VarH.d(id3, 3, 0, 3);
        eg4VarH.d(id3, 4, 0, 4);
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 7, 0, 7);
        int id4 = viewStubI2.getId();
        eg4VarH.d(id4, 3, y8jVar.getId(), 3);
        eg4VarH.d(id4, 4, y8jVar.getId(), 4);
        eg4VarH.d(id4, 6, 0, 6);
        int id5 = viewStubI.getId();
        eg4VarH.d(id5, 3, 0, 3);
        eg4VarH.d(id5, 6, 0, 6);
        eg4VarH.d(id5, 7, 0, 7);
        eg4VarH.a(this);
        x(getContext().getResources().getConfiguration().orientation == 1);
    }

    private final pd1 getCallBottomUnavailablePanel() {
        return (pd1) this.H.getValue();
    }

    private final xd1 getCallChangeModeHint() {
        return (xd1) this.B.getValue();
    }

    private final lgb getCallChangeModeTab() {
        return (lgb) this.D.getValue();
    }

    public final dr1 getCallModeChangeManager() {
        return (dr1) this.F.getValue();
    }

    private final m22 getCallSpeakerLabel() {
        return (m22) this.J.getValue();
    }

    private final o22 getCallSpeakerMediator() {
        return (o22) this.u.getValue();
    }

    private final w22 getSpeakerModeView() {
        y8j y8jVar = this.E;
        View childAt = y8jVar.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return null;
        }
        lfe lfeVarK = recyclerView.K(y8jVar.getCurrentItem());
        View view = lfeVarK != null ? lfeVarK.a : null;
        if (view instanceof w22) {
            return (w22) view;
        }
        return null;
    }

    private static /* synthetic */ void getViewPager$annotations() {
    }

    public static m22 u(bz1 bz1Var, Context context) {
        m22 m22Var = new m22(context);
        m22Var.setLayoutParams(new uf4(-1, -2));
        m22Var.setVisibility(8);
        WeakHashMap weakHashMap = i7j.a;
        if (!m22Var.isLaidOut() || m22Var.isLayoutRequested()) {
            m22Var.addOnLayoutChangeListener(new az1(bz1Var, 0));
        } else {
            c1d c1dVar = bz1Var.w;
            if (c1dVar != null) {
                c1dVar.c();
            }
        }
        m22Var.setControlsMediator(bz1Var.v);
        m22Var.setCallSpeakerMediator(bz1Var.getCallSpeakerMediator());
        m22Var.setPipBoundariesController(bz1Var.w);
        zy1 zy1Var = bz1Var.y;
        if (zy1Var != null) {
            m22Var.setListener(zy1Var);
        }
        as4 as4Var = bz1Var.v;
        if (as4Var != null) {
            ((es4) as4Var).b(m22Var);
        }
        return m22Var;
    }

    public static dr1 v(bz1 bz1Var) {
        dr1 dr1Var = new dr1(bz1Var.s.getAccessor().d(54), bz1Var.E, bz1Var.A, bz1Var.getCallChangeModeHint(), bz1Var.C, bz1Var.getCallChangeModeTab(), (mr1) bz1Var.E.getAdapter(), new m(28, bz1Var), new xy1(bz1Var, 3), new xy1(bz1Var, 0), new xy1(bz1Var, 1));
        dr1Var.a().g();
        return dr1Var;
    }

    public final boolean B() {
        return getCallModeChangeManager().a().e();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    public final void C(d62 d62Var) {
        String str;
        tj0 tj0Var;
        yr4 yr4Var;
        qe1 qe1Var;
        qk0 qk0Var;
        qe1 qe1Var2;
        vai vaiVar = d62Var.d;
        boolean z = vaiVar != null;
        pd1 callBottomUnavailablePanel = getCallBottomUnavailablePanel();
        ViewStub viewStub = this.G;
        n7j.m(viewStub, callBottomUnavailablePanel, null);
        pd1 callBottomUnavailablePanel2 = getCallBottomUnavailablePanel();
        ok0 ok0Var = (vaiVar == null || (qe1Var2 = vaiVar.c) == null) ? null : qe1Var2.d;
        yvb yvbVar = (vaiVar == null || (qe1Var = vaiVar.c) == null || (qk0Var = qe1Var.e) == null) ? null : new yvb(qk0Var);
        g52 g52Var = callBottomUnavailablePanel2.s;
        g52 g52Var2 = callBottomUnavailablePanel2.s;
        if ((ok0Var != null ? ok0Var.a : null) != null) {
            kwb kwbVar = g52Var.s;
            if (ok0Var != null) {
                str = ok0Var.b;
            } else {
                str = null;
            }
            if (ok0Var != null) {
                tj0Var = ok0Var.a;
            } else {
                tj0Var = null;
            }
            kwb.u(kwbVar, str, tj0Var);
            kwbVar.setOverlay(yvbVar);
        } else {
            if ((ok0Var != null ? ok0Var.b : null) == null && yvbVar == null) {
                g52Var.Z();
            } else {
                kwb kwbVar2 = g52Var.s;
                if (ok0Var != null) {
                    str = ok0Var.b;
                } else {
                    str = null;
                }
                if (ok0Var != null) {
                    tj0Var = ok0Var.a;
                } else {
                    tj0Var = null;
                }
                kwb.u(kwbVar2, str, tj0Var);
                kwbVar2.setOverlay(yvbVar);
            }
        }
        isk.d(callBottomUnavailablePanel2, z, 0L, null, 6);
        if (z) {
            CharSequence charSequence = vaiVar.a;
            g52Var2.setNameAutoSizeEnabled(vaiVar.i);
            g52Var2.setName(charSequence);
            callBottomUnavailablePanel2.setOrganization(vaiVar.j);
            callBottomUnavailablePanel2.setStatus(vaiVar.b);
            if (vaiVar.h) {
                callBottomUnavailablePanel2.s.a0(true, R.drawable.icon_call_by_number_fill, R.string.call_by_cellular, new tnh(R.string.call_by_cellular), new nd1(callBottomUnavailablePanel2, 1));
            } else {
                callBottomUnavailablePanel2.s.a0(vaiVar.d, vaiVar.e ? R.drawable.icon_video_call_fill : R.drawable.icon_call_fill, R.string.call_recall, new tnh(R.string.call_recall), new nd1(callBottomUnavailablePanel2, 3));
            }
            g52Var2.X(R.drawable.icon_cross, R.string.call_cancel, new tnh(R.string.call_cancel), new nd1(callBottomUnavailablePanel2, 0));
            callBottomUnavailablePanel2.u(vaiVar.g);
            g52Var2.T(vaiVar.f);
        }
        tx8 tx8Var = d62Var.e;
        boolean z2 = tx8Var != null;
        ViewStub viewStub2 = this.I;
        if (n7j.n(viewStub2) || z2) {
            m22 callSpeakerLabel = getCallSpeakerLabel();
            if (!n7j.n(viewStub2)) {
                ViewGroup viewGroup = (ViewGroup) viewStub2.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub2);
                viewGroup.removeViewInLayout(viewStub2);
                ViewGroup.LayoutParams layoutParams = viewStub2.getLayoutParams();
                layoutParams.height = callSpeakerLabel.getLayoutParams().height;
                layoutParams.width = callSpeakerLabel.getLayoutParams().width;
                callSpeakerLabel.setId(viewStub2.getId());
                viewGroup.addView(callSpeakerLabel, iIndexOfChild, layoutParams);
                as4 as4Var = this.v;
                if (as4Var != null && (yr4Var = ((es4) as4Var).j) != null) {
                    getCallSpeakerLabel().G(yr4Var);
                }
            }
            getCallSpeakerLabel().setActive(z2);
            m22 callSpeakerLabel2 = getCallSpeakerLabel();
            if (z2) {
                fu1 fu1Var = tx8Var.a;
                if (fu1Var == null) {
                    fu1Var = fu1.c;
                }
                callSpeakerLabel2.setParticipantId(fu1Var);
                int i = tx8Var.e;
                ImageView imageView = callSpeakerLabel2.v;
                if (callSpeakerLabel2.D == i) {
                    gm0.Y(m22.class.getName(), "Early return in showRotation cuz of buttonState == state");
                } else {
                    callSpeakerLabel2.D = i;
                    int iD = qt4.D(i);
                    if (iD == 0) {
                        imageView.setVisibility(0);
                        imageView.setImageResource(R.drawable.icon_dots_vertical);
                        imageView.setContentDescription(imageView.getContext().getString(R.string.call_user_item_more));
                        qe7.H(imageView, 300L, new ee(imageView, 9, callSpeakerLabel2));
                    } else if (iD == 1) {
                        imageView.setVisibility(0);
                        imageView.setImageResource(R.drawable.ic_rotation_view_16);
                        imageView.setContentDescription(imageView.getContext().getString(R.string.call_user_item_rotate));
                        qe7.H(imageView, 300L, new k22(callSpeakerLabel2, 1));
                    } else if (iD != 2 && iD != 3) {
                        ore.o();
                        return;
                    } else {
                        imageView.setVisibility(8);
                        imageView.setContentDescription(null);
                    }
                }
                boolean z3 = tx8Var.c;
                if (!cqk.d(callSpeakerLabel2.y, Boolean.valueOf(z3))) {
                    callSpeakerLabel2.y = Boolean.valueOf(z3);
                    callSpeakerLabel2.w.setVisibility(z3 ? 0 : 8);
                }
                callSpeakerLabel2.setLabel(tx8Var.b);
                boolean z4 = tx8Var.d;
                if (cqk.d(callSpeakerLabel2.z, Boolean.valueOf(z4))) {
                    gm0.Y(m22.class.getName(), "Early return in isTalking cuz of isTalking == talking");
                } else {
                    callSpeakerLabel2.z = Boolean.valueOf(z4);
                    callSpeakerLabel2.v();
                }
            }
        }
        ok0 ok0Var2 = d62Var.g;
        if (ok0Var2 != null) {
            String str2 = ok0Var2.b;
            if (vaiVar == null) {
                n7j.m(viewStub, getCallBottomUnavailablePanel(), null);
                g52 g52Var3 = getCallBottomUnavailablePanel().s;
                tj0 tj0Var2 = ok0Var2.a;
                if (tj0Var2 == null && str2 == null) {
                    g52Var3.Z();
                    return;
                }
                kwb kwbVar3 = g52Var3.s;
                kwb.u(kwbVar3, str2, tj0Var2);
                kwbVar3.setOverlay(null);
            }
        }
    }

    @Override // defpackage.wy1
    public final void b(boolean z) {
        if (z) {
            w22 speakerModeView = getSpeakerModeView();
            if (speakerModeView != null) {
                speakerModeView.b(true);
            }
            zy1 zy1Var = this.y;
            if (zy1Var != null) {
                CallScreen callScreen = ((fx1) zy1Var).a;
                l6m l6mVar = CallScreen.D1;
                callScreen.F1(false, true);
            }
        }
    }

    @Override // defpackage.wy1
    public final void c(boolean z) {
        zy1 zy1Var;
        if (z || (zy1Var = this.y) == null) {
            return;
        }
        CallScreen callScreen = ((fx1) zy1Var).a;
        l6m l6mVar = CallScreen.D1;
        callScreen.F1(false, false);
    }

    @Override // defpackage.uy1
    public final void d(RectF rectF, boolean z) {
        w22 speakerModeView = getSpeakerModeView();
        if (speakerModeView != null) {
            speakerModeView.d(rectF, z);
        }
    }

    @Override // defpackage.uy1
    public boolean getShouldScaleMainOpponent() {
        w22 speakerModeView = getSpeakerModeView();
        if (speakerModeView != null) {
            return speakerModeView.getShouldScaleMainOpponent();
        }
        return false;
    }

    @Override // defpackage.uy1
    public final void h(boolean z) {
        if (z) {
            if (n7j.n(this.I)) {
                m22 callSpeakerLabel = getCallSpeakerLabel();
                callSpeakerLabel.getClass();
                callSpeakerLabel.setAlpha(1.0f);
            }
            zy1 zy1Var = this.y;
            if (zy1Var != null) {
                CallScreen callScreen = ((fx1) zy1Var).a;
                l6m l6mVar = CallScreen.D1;
                callScreen.F1(false, true);
            }
            w22 speakerModeView = getSpeakerModeView();
            if (speakerModeView != null) {
                speakerModeView.h(true);
            }
        }
    }

    @Override // defpackage.uy1
    public final void j(boolean z) {
        zy1 zy1Var = this.y;
        if (zy1Var != null) {
            CallScreen callScreen = ((fx1) zy1Var).a;
            l6m l6mVar = CallScreen.D1;
            callScreen.F1(false, false);
        }
        w22 speakerModeView = getSpeakerModeView();
        if (speakerModeView != null) {
            speakerModeView.j(z);
        }
    }

    @Override // defpackage.uy1
    public final void k(c79 c79Var, boolean z, long j) {
        w22 speakerModeView = getSpeakerModeView();
        if (speakerModeView != null) {
            speakerModeView.k(c79Var, z, j);
        }
        if (n7j.n(this.I)) {
            getCallSpeakerLabel().k(c79Var, z, j);
        }
    }

    @Override // defpackage.wy1
    public final void l(c79 c79Var, boolean z, long j) {
        w22 speakerModeView = getSpeakerModeView();
        if (speakerModeView != null) {
            speakerModeView.l(c79Var, z, j);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 6);
        context.registerComponentCallbacks(md1Var);
        this.z = md1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        md1 md1Var = this.z;
        if (md1Var != null) {
            getContext().unregisterComponentCallbacks(md1Var);
        }
    }

    public final void setPipBoundariesController(c1d c1dVar) {
        this.w = c1dVar;
        if (n7j.n(this.I)) {
            c1dVar.a(getCallSpeakerLabel(), b1d.a);
        }
    }

    public final void setupCallModesAdapter(mr1 mr1Var) {
        this.E.setAdapter(mr1Var);
    }

    public final void setupControlsMediator(as4 as4Var) {
        this.v = as4Var;
        if (n7j.n(this.I)) {
            getCallSpeakerLabel().setControlsMediator(as4Var);
            ((es4) as4Var).b(getCallSpeakerLabel());
        }
    }

    public final void setupListener(zy1 zy1Var) {
        this.y = zy1Var;
        if (n7j.n(this.I)) {
            getCallSpeakerLabel().setListener(zy1Var);
        }
        if (n7j.n(this.G)) {
            getCallBottomUnavailablePanel().setClickListener(zy1Var);
        }
    }

    public final void x(boolean z) {
        int i = z ? 12 : 0;
        ViewStub viewStub = this.I;
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = gm0.K(i * yl5.d().getDisplayMetrics().density);
        viewStub.setLayoutParams(marginLayoutParams);
    }

    public final void y(int i, String str) {
        je9 je9Var = je9.d;
        if (getCallModeChangeManager().m.isIdle() && this.E.getCurrentItem() != i && this.E.getChildCount() != 0) {
            this.E.setUserInputEnabled(false);
            this.E.h(i, false);
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallModeScrollTag", nbh.r(i, "changeViewPagerPosition from=", str, " newPos="), null);
                return;
            }
            return;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            int currentItem = this.E.getCurrentItem();
            boolean z = this.E.r;
            StringBuilder sbR = c0a.r(currentItem, "skip changeViewPagerPosition from=", str, " currentPos=", " newPos=");
            sbR.append(i);
            sbR.append(" isUserInputEnabled=");
            sbR.append(z);
            a4cVar2.c(je9Var, "CallModeScrollTag", sbR.toString(), null);
        }
    }

    public final void z() {
        getCallModeChangeManager().a().d();
        getCallModeChangeManager().a().c();
    }
}
