package one.me.calls.ui.ui.waitingroom.event;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import defpackage.b5b;
import defpackage.bdc;
import defpackage.c3;
import defpackage.c79;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.es4;
import defpackage.fz6;
import defpackage.hsk;
import defpackage.hu;
import defpackage.in1;
import defpackage.izb;
import defpackage.j8e;
import defpackage.l6m;
import defpackage.li;
import defpackage.lq4;
import defpackage.md1;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.o7j;
import defpackage.p51;
import defpackage.pq3;
import defpackage.q62;
import defpackage.r;
import defpackage.r62;
import defpackage.reh;
import defpackage.rx8;
import defpackage.sx1;
import defpackage.t3f;
import defpackage.u62;
import defpackage.ufe;
import defpackage.v62;
import defpackage.xp9;
import defpackage.xr4;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yr4;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zr4;
import defpackage.zv8;
import java.util.List;
import kotlin.Metadata;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/ui/waitingroom/event/CallWaitingRoomEventsWidget;", "Lone/me/sdk/arch/Widget;", "Lzr4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "hu", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallWaitingRoomEventsWidget extends Widget implements zr4 {
    public static final /* synthetic */ zv8[] m = {new dwd(CallWaitingRoomEventsWidget.class, "contactCellView", "getContactCellView()Lone/me/sdk/uikit/common/cellitem/OneMeCellSimpleView;", 0), zo5.f(zfe.a, CallWaitingRoomEventsWidget.class, "multiContactCellView", "getMultiContactCellView()Lone/me/calls/ui/view/event/MultiContactCellView;", 0), new dwd(CallWaitingRoomEventsWidget.class, "eventContainerView", "getEventContainerView()Landroid/widget/FrameLayout;", 0)};
    public es4 a;
    public final sx1 b;
    public final ny8 c;
    public ObjectAnimator d;
    public md1 e;
    public final Handler f;
    public final c3 g;
    public final ny8 h;
    public hu i;
    public final j8e j;
    public final j8e k;
    public final j8e l;

    public CallWaitingRoomEventsWidget(Bundle bundle) {
        super(bundle);
        this.b = new sx1(m35getAccountScopeuqN4xOY());
        this.c = createViewModelLazy(r62.class, new r(29, new u62(this, 0)));
        this.f = new Handler(Looper.getMainLooper());
        this.g = new c3(24, this);
        this.h = rx8.P(3, new u62(this, 1));
        this.j = viewBinding(R.id.call_waiting_room_events_view);
        this.k = viewBinding(R.id.call_waiting_room_events_multi_view);
        this.l = viewBinding(R.id.call_waiting_room_events_container);
    }

    public static void o1(FrameLayout frameLayout, boolean z) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            p51.d();
        } else {
            layoutParams.width = z ? -1 : -2;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public static void t1(CallWaitingRoomEventsWidget callWaitingRoomEventsWidget) {
        callWaitingRoomEventsWidget.s1(((q62) ((r62) callWaitingRoomEventsWidget.c.getValue()).f.a.getValue()).a());
    }

    @Override // defpackage.zr4
    public final List J(xr4 xr4Var, xr4 xr4Var2) {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
        c79 c79VarW = yab.w();
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            c79VarW.add(hsk.c((Math.abs(xr4Var.d) - xr4Var.f) * xr4Var.c, view2));
        }
        return yab.j(c79VarW);
    }

    @Override // defpackage.zr4
    public final void M() {
        yr4 yr4Var;
        es4 es4Var = this.a;
        if (es4Var == null || (yr4Var = es4Var.j) == null) {
            return;
        }
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.setTranslationY(yr4Var.c ? 0.0f : -(yr4Var.b() - yr4Var.b));
        }
        u1();
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        u1();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        reh rehVar = new reh(layoutInflater.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        rehVar.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(rehVar.getContext());
        frameLayout.setId(R.id.call_waiting_room_events_container);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 1;
        frameLayout.setLayoutParams(layoutParams2);
        o7j.f(yl5.d().getDisplayMetrics().density * 40.0f, frameLayout);
        frameLayout.setBackgroundColor(pq3.j.l(frameLayout).b.b().f);
        rehVar.setClipToPadding(false);
        rehVar.setClipChildren(false);
        rehVar.setClipToOutline(false);
        rehVar.addView(frameLayout);
        rehVar.setCallback(new xp9(this, 8, frameLayout));
        o1(frameLayout, getContext().getResources().getConfiguration().orientation == 1);
        bdc.a(rehVar, new v62(rehVar, rehVar, 0));
        return rehVar;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.d = null;
        md1 md1Var = this.e;
        if (md1Var != null) {
            view.getContext().unregisterComponentCallbacks(md1Var);
        }
        this.e = null;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        super.onDetach(view);
        this.f.removeCallbacks(this.g);
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((r62) this.c.getValue()).f, getViewLifecycleOwner().f(), n09.d), new in1((lq4) null, this, 7), 3), getViewLifecycleScope());
        Context context = view.getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 11);
        context.registerComponentCallbacks(md1Var);
        o1(q1(), ufeVar.a == 1);
        this.e = md1Var;
    }

    public final izb p1() {
        return (izb) this.j.m(this, m[0]);
    }

    public final FrameLayout q1() {
        return (FrameLayout) this.l.m(this, m[2]);
    }

    public final b5b r1() {
        return (b5b) this.k.m(this, m[1]);
    }

    public final void s1(long j) {
        getRouter().C(this);
        hu huVar = this.i;
        if (huVar != null) {
            CallScreen callScreen = (CallScreen) huVar.b;
            CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = (CallWaitingRoomEventsWidget) huVar.c;
            l6m l6mVar = CallScreen.D1;
            callScreen.R1().e.f(j);
            callScreen.N1().a.remove(callWaitingRoomEventsWidget);
            callScreen.M1().a();
        }
        this.i = null;
    }

    public final void u1() {
        yr4 yr4Var;
        ObjectAnimator objectAnimatorOfFloat = this.d;
        if (objectAnimatorOfFloat == null) {
            View view = getView();
            Object parent = view != null ? view.getParent() : null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                es4 es4Var = this.a;
                view2.setTranslationY((es4Var == null || (yr4Var = es4Var.j) == null || yr4Var.c) ? 0.0f : -(yr4Var.b() - yr4Var.b));
                float f = yl5.d().getDisplayMetrics().density * 4.0f;
                float f2 = -f;
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f, f2, f, f2, f, f2, f, 0.0f);
                objectAnimatorOfFloat.setStartDelay(10000L);
                objectAnimatorOfFloat.setRepeatMode(1);
                objectAnimatorOfFloat.setDuration(500L);
                objectAnimatorOfFloat.addListener(new li(3, this));
                this.d = objectAnimatorOfFloat;
            } else {
                objectAnimatorOfFloat = null;
            }
        }
        if (objectAnimatorOfFloat != null) {
            if (objectAnimatorOfFloat.isPaused()) {
                objectAnimatorOfFloat.resume();
            } else {
                if (objectAnimatorOfFloat.isRunning() || objectAnimatorOfFloat.isStarted()) {
                    return;
                }
                this.f.post(this.g);
            }
        }
    }

    public CallWaitingRoomEventsWidget(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
