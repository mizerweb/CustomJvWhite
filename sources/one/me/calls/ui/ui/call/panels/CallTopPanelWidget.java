package one.me.calls.ui.ui.call.panels;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a42;
import defpackage.b1k;
import defpackage.dwd;
import defpackage.e42;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.g42;
import defpackage.gm0;
import defpackage.h02;
import defpackage.h42;
import defpackage.i19;
import defpackage.j8e;
import defpackage.mvh;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.ore;
import defpackage.osi;
import defpackage.q32;
import defpackage.qt4;
import defpackage.r;
import defpackage.r32;
import defpackage.r8e;
import defpackage.sx1;
import defpackage.t3f;
import defpackage.vv;
import defpackage.yk1;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallTopPanelWidget;", "Lone/me/sdk/arch/Widget;", "Lr32;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallTopPanelWidget extends Widget implements r32 {
    public static final /* synthetic */ zv8[] e = {new dwd(CallTopPanelWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, CallTopPanelWidget.class, "callTopPanel", "getCallTopPanel()Lone/me/calls/ui/view/controls/CallTopControlViewNew;", 0)};
    public final ny8 a;
    public final sx1 b;
    public final ny8 c;
    public final j8e d;

    public CallTopPanelWidget(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(t3f.class, t3f.d, Widget.ARG_SCOPE_ID);
        zv8 zv8Var = e[0];
        this.a = getSharedViewModel((t3f) vvVar.a(this), h02.class, null);
        this.b = new sx1(m35getAccountScopeuqN4xOY());
        this.c = createViewModelLazy(e42.class, new r(28, new yk1(11, this)));
        this.d = viewBinding(R.id.call_top_control);
    }

    @Override // defpackage.r32
    public final void D(q32 q32Var) {
        boolean z;
        ImageSpan[] imageSpanArr;
        int length;
        int i;
        if (getView() == null) {
            return;
        }
        int i2 = q32Var != null ? q32Var.a : 0;
        int i3 = i2 == 0 ? -1 : g42.$EnumSwitchMapping$0[qt4.D(i2)];
        if (i3 != -1) {
            Object[] spans = null;
            if (i3 != 1) {
                if (i3 != 2) {
                    ore.o();
                    return;
                } else {
                    o1().setTitle(null);
                    o1().setStatus(null);
                    return;
                }
            }
            a42 a42VarO1 = o1();
            CharSequence charSequence = q32Var.b;
            CharSequence charSequence2 = q32Var.c;
            a42VarO1.setTitle(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence3 = q32Var.b;
            if (charSequence3 == null) {
                z = false;
                break;
            }
            int length2 = charSequence3.length();
            try {
                Spanned spanned = charSequence3 instanceof Spanned ? (Spanned) charSequence3 : null;
                if (spanned != null) {
                    spans = spanned.getSpans(0, length2, ImageSpan.class);
                }
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else {
                        if (imageSpanArr[i].getDrawable() instanceof osi) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
            if (spans == null) {
                spans = new ImageSpan[0];
            }
            imageSpanArr = (ImageSpan[]) spans;
            length = imageSpanArr.length;
            i = 0;
            o1().setVerified(z);
            StringBuilder sb = new StringBuilder();
            CharSequence charSequence4 = q32Var.d;
            boolean z2 = charSequence4 != null;
            if (z2) {
                sb.append(charSequence4);
            }
            if (charSequence2 != null) {
                if (z2) {
                    sb.append("  · ");
                }
                sb.append(charSequence2);
            }
            o1().setStatus(sb.toString());
        }
    }

    public final a42 o1() {
        return (a42) this.d.m(this, e[1]);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        e9i.j0(new fz6(n1g.v(p1().f, getViewLifecycleOwner().f(), n09.d), new h42(null, this, 0), 3), getViewLifecycleScope());
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a42 a42Var = new a42(getContext());
        a42Var.setId(R.id.call_top_control);
        a42Var.setLayoutParams(new FrameLayout.LayoutParams(-1, gm0.K(68.0f * yl5.d().getDisplayMetrics().density)));
        a42Var.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density), gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        return a42Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        mvh mvhVar = o1().u;
        if (mvhVar != null) {
            mvhVar.a();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        o1().setClickListener(new b1k(6, this));
        r8e r8eVar = p1().e;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new h42(null, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().c.I, getViewLifecycleOwner().f(), n09Var), new h42(null, this, 2), i), getViewLifecycleScope());
    }

    public final e42 p1() {
        return (e42) this.c.getValue();
    }

    public CallTopPanelWidget(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
