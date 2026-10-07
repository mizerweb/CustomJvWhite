package one.me.calls.ui.ui.call.panels;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a80;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h;
import defpackage.h02;
import defpackage.i19;
import defpackage.j8e;
import defpackage.jd1;
import defpackage.k42;
import defpackage.l11;
import defpackage.ld1;
import defpackage.lq4;
import defpackage.m02;
import defpackage.md1;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.p3c;
import defpackage.qc1;
import defpackage.qo7;
import defpackage.qp4;
import defpackage.qyj;
import defpackage.r;
import defpackage.rj5;
import defpackage.sc1;
import defpackage.sg1;
import defpackage.sx1;
import defpackage.t3f;
import defpackage.tc1;
import defpackage.uc1;
import defpackage.ufe;
import defpackage.vc1;
import defpackage.vp4;
import defpackage.vv;
import defpackage.wc1;
import defpackage.wsc;
import defpackage.xc1;
import defpackage.xx6;
import defpackage.yc1;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yp9;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallBottomPanelWidget;", "Lone/me/sdk/arch/Widget;", "Lvp4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallBottomPanelWidget extends Widget implements vp4 {
    public static final /* synthetic */ zv8[] l = {new dwd(CallBottomPanelWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.e(zfe.a, CallBottomPanelWidget.class, "audioLevelJob", "getAudioLevelJob()Lkotlinx/coroutines/Job;"), new dwd(CallBottomPanelWidget.class, "callBottomPanel", "getCallBottomPanel()Lone/me/calls/ui/view/controls/CallBottomControlViewNew;", 0)};
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final sx1 e;
    public final ny8 f;
    public final p3c g;
    public qp4 h;
    public Boolean i;
    public final j8e j;
    public md1 k;

    public CallBottomPanelWidget(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(t3f.class, t3f.d, Widget.ARG_SCOPE_ID);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.a = hVar.getAccessor().d(34);
        this.b = hVar.getAccessor().d(61);
        this.c = hVar.getAccessor().d(66);
        zv8 zv8Var = l[0];
        this.d = getSharedViewModel((t3f) vvVar.a(this), h02.class, null);
        this.e = new sx1(m35getAccountScopeuqN4xOY());
        this.f = createViewModelLazy(jd1.class, new r(14, new qo7(26, this)));
        this.g = qyj.S();
        this.j = viewBinding(R.id.call_bottom_control);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        Object next;
        a80 a80VarN;
        jd1 jd1VarP1 = p1();
        Iterator it = jd1VarP1.C().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((sg1) next).getId() != i);
        sg1 sg1Var = (sg1) next;
        if (sg1Var == null || (a80VarN = sg1Var.n()) == null) {
            gm0.Y(jd1.class.getName(), "Early return in setAudioDevice cuz of getAvailableDeviceInfo().firstOrNull { it.id == deviceId }?.device is null");
        } else {
            jd1VarP1.E().j(a80VarN);
        }
    }

    public final qc1 o1() {
        return (qc1) this.j.m(this, l[2]);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        xx6 xx6Var = p1().k;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(xx6Var, i19VarF, n09Var), new ld1(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().l, getViewLifecycleOwner().f(), n09Var), new ld1(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().p, getViewLifecycleOwner().f(), n09Var), new ld1(lq4Var, this, 2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().m, getViewLifecycleOwner().f(), n09Var), new ld1(lq4Var, this, i), i), getViewLifecycleScope());
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yc1 yc1Var;
        qc1 qc1Var = new qc1(getContext());
        qc1Var.setId(R.id.call_bottom_control);
        qc1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Context context = qc1Var.getContext();
        boolean z = ((l11) p1().p.a.getValue()).f;
        float fA = yl5.a(context);
        if (z) {
            if (fA >= 390.0f) {
                yc1Var = uc1.a;
            } else {
                yc1Var = fA >= 360.0f ? tc1.a : sc1.a;
            }
        } else if (fA >= 390.0f) {
            yc1Var = xc1.a;
        } else {
            yc1Var = fA >= 360.0f ? wc1.a : vc1.a;
        }
        qc1Var.setControlsSize(yc1Var);
        return qc1Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.g.B(this, l[1], null);
        this.i = null;
        qp4 qp4Var = this.h;
        if (qp4Var != null) {
            qp4Var.dismiss();
        }
        this.h = null;
        md1 md1Var = this.k;
        if (md1Var != null) {
            view.getContext().unregisterComponentCallbacks(md1Var);
        }
        this.k = null;
    }

    @Override // defpackage.vp4
    public final void onDismiss() {
        this.h = null;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ny8 ny8Var = this.a;
        boolean z = false;
        boolean z2 = i == 159 && ((wsc) ny8Var.getValue()).c(wsc.n);
        if (i == 160 && ((wsc) ny8Var.getValue()).c(wsc.i)) {
            z = true;
        }
        yp9 yp9Var = yp9.b;
        if (z2) {
            p1().G(yp9Var);
        } else if (z) {
            p1().F(yp9Var);
        }
        if (z2 || z) {
            ((m02) this.b.getValue()).a(requireActivity(), (k42) this.c.getValue());
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        o1().setClickListener(new rj5(5, this));
        Context context = view.getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 0);
        context.registerComponentCallbacks(md1Var);
        this.k = md1Var;
    }

    public final jd1 p1() {
        return (jd1) this.f.getValue();
    }

    public CallBottomPanelWidget(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
