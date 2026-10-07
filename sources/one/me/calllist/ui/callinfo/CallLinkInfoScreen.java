package one.me.calllist.ui.callinfo;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.ca2;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.et4;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.i19;
import defpackage.i1m;
import defpackage.ic6;
import defpackage.ifh;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.ldf;
import defpackage.ll6;
import defpackage.lq4;
import defpackage.m8j;
import defpackage.mc4;
import defpackage.md1;
import defpackage.mq1;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.oq1;
import defpackage.ore;
import defpackage.pq1;
import defpackage.q72;
import defpackage.qq1;
import defpackage.r;
import defpackage.r5h;
import defpackage.rcc;
import defpackage.rq;
import defpackage.rx8;
import defpackage.sa2;
import defpackage.spc;
import defpackage.tn1;
import defpackage.tre;
import defpackage.ufe;
import defpackage.va;
import defpackage.vq1;
import defpackage.xu1;
import defpackage.yl5;
import defpackage.z2;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B7\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lone/me/calllist/ui/callinfo/CallLinkInfoScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "link", "title", "", "isLinkCall", "Lha9;", "localAccountId", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLha9;)V", "ldf", "call-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallLinkInfoScreen extends Widget implements mc4 {
    public final h a;
    public final ca2 b;
    public final ny8 c;
    public final ny8 d;
    public final ifh e;
    public final ny8 f;
    public final ny8 g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public final j8e o;
    public m8j p;
    public final tn1 q;
    public md1 r;
    public final ks6 s;
    public static final /* synthetic */ zv8[] u = {new dwd(CallLinkInfoScreen.class, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0), zo5.f(zfe.a, CallLinkInfoScreen.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), new dwd(CallLinkInfoScreen.class, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(CallLinkInfoScreen.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new dwd(CallLinkInfoScreen.class, "linkTextView", "getLinkTextView()Landroid/widget/TextView;", 0), new dwd(CallLinkInfoScreen.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(CallLinkInfoScreen.class, "icon", "getIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), new dwd(CallLinkInfoScreen.class, "actionList", "getActionList()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public static final ldf t = new ldf(19);

    public CallLinkInfoScreen(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.a = hVar;
        this.b = new ca2(m35getAccountScopeuqN4xOY());
        this.c = hVar.getAccessor().d(236);
        this.d = createViewModelLazy(vq1.class, new r(22, new z2(this, 16, bundle)));
        this.e = new ifh(new pq1(this, 0));
        this.f = rx8.P(3, new pq1(this, 1));
        this.g = rx8.P(3, new pq1(this, 2));
        this.h = viewBinding(R.id.call_info_collapsiblecontainerlinearlayout);
        this.i = viewBinding(R.id.call_info_appbarlayout);
        this.j = viewBinding(R.id.call_info_onemetoolbar);
        this.k = viewBinding(R.id.call_info_title);
        this.l = viewBinding(R.id.call_info_link_state);
        this.m = viewBinding(R.id.call_info_button);
        this.n = viewBinding(R.id.call_info_icon);
        this.o = viewBinding(R.id.call_info_action_list);
        this.q = new tn1(new i1m(this), ((a2c) hVar.getAccessor().c(27)).a());
        this.s = tre.G(this, new va(29));
    }

    public static final CharSequence o1(CallLinkInfoScreen callLinkInfoScreen, CharSequence charSequence, TextView textView, int i) {
        if (charSequence != null && charSequence.length() != 0 && i > 0) {
            TextPaint paint = textView.getPaint();
            float paddingLeft = (i - textView.getPaddingLeft()) - textView.getPaddingRight();
            if (paint.measureText(charSequence.toString()) > paddingLeft) {
                float fMeasureText = paint.measureText("…");
                int iQ0 = r5h.Q0(charSequence);
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, 0);
                CharSequence charSequenceSubSequence2 = charSequence.subSequence(iQ0, charSequence.length());
                int i2 = 0;
                while (i2 < iQ0) {
                    CharSequence charSequenceSubSequence3 = charSequence.subSequence(0, i2);
                    CharSequence charSequenceSubSequence4 = charSequence.subSequence(iQ0, charSequence.length());
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) charSequenceSubSequence3);
                    sb.append((Object) charSequenceSubSequence4);
                    if (paint.measureText(sb.toString()) > paddingLeft - fMeasureText) {
                        break;
                    }
                    i2++;
                    iQ0--;
                    charSequenceSubSequence = charSequenceSubSequence3;
                    charSequenceSubSequence2 = charSequenceSubSequence4;
                }
                return ((Object) charSequenceSubSequence) + "…" + ((Object) charSequenceSubSequence2);
            }
        }
        return charSequence;
    }

    public static final RecyclerView p1(CallLinkInfoScreen callLinkInfoScreen) {
        return (RecyclerView) callLinkInfoScreen.o.m(callLinkInfoScreen, u[7]);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        ((xu1) this.g.getValue()).g(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getA() {
        oi8 oi8Var = oi8.e;
        return oi8.f;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.s;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mq1 mq1Var = new mq1(this, 0);
        et4 et4Var = new et4(getContext());
        et4Var.setId(R.id.call_info_coordinator_layout);
        et4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        mq1Var.invoke(et4Var);
        return et4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.p = null;
        md1 md1Var = this.r;
        if (md1Var != null) {
            view.getContext().unregisterComponentCallbacks(md1Var);
        }
        this.r = null;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((xu1) this.g.getValue()).b(i, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ll6 ll6Var = new ll6();
        zv8[] zv8VarArr = u;
        zv8 zv8Var = zv8VarArr[1];
        j8e j8eVar = this.i;
        int i = 0;
        ((rq) j8eVar.m(this, zv8Var)).a(spc.d(new oq1(ll6Var, this, i), (rq) j8eVar.m(this, zv8VarArr[1]), getViewLifecycleOwner()));
        ic6 ic6Var = t1().m;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        q72 q72VarV = n1g.v(ic6Var, i19VarF, n09Var);
        lq4 lq4Var = null;
        qq1 qq1Var = new qq1(lq4Var, this, i);
        int i2 = 3;
        e9i.j0(new fz6(q72VarV, qq1Var, i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().k, getViewLifecycleOwner().f(), n09Var), new qq1(lq4Var, this, 1), i2), getViewLifecycleScope());
        Context context = view.getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 4);
        context.registerComponentCallbacks(md1Var);
        if (ufeVar.a == 1) {
            cyb cybVarQ1 = q1();
            ViewGroup.LayoutParams layoutParams = cybVarQ1.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams.width = -1;
            cybVarQ1.setLayoutParams(layoutParams);
            RecyclerView recyclerViewP1 = p1(this);
            ViewGroup.LayoutParams layoutParams2 = recyclerViewP1.getLayoutParams();
            if (layoutParams2 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams2.width = -1;
                recyclerViewP1.setLayoutParams(layoutParams2);
            }
        } else {
            cyb cybVarQ2 = q1();
            ViewGroup.LayoutParams layoutParams3 = cybVarQ2.getLayoutParams();
            if (layoutParams3 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams3.width = gm0.K(yl5.d().getDisplayMetrics().density * 360.0f);
            cybVarQ2.setLayoutParams(layoutParams3);
            RecyclerView recyclerViewP2 = p1(this);
            ViewGroup.LayoutParams layoutParams4 = recyclerViewP2.getLayoutParams();
            if (layoutParams4 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams4.width = gm0.K(360.0f * yl5.d().getDisplayMetrics().density);
                recyclerViewP2.setLayoutParams(layoutParams4);
            }
        }
        this.r = md1Var;
    }

    public final cyb q1() {
        return (cyb) this.m.m(this, u[5]);
    }

    public final sa2 r1() {
        return (sa2) this.c.getValue();
    }

    public final rcc s1() {
        return (rcc) this.j.m(this, u[2]);
    }

    public final vq1 t1() {
        return (vq1) this.d.getValue();
    }

    public CallLinkInfoScreen(Long l, String str, String str2, boolean z, ha9 ha9Var) {
        Bundle bundle = new Bundle();
        bundle.putString("link_param", str);
        bundle.putString("title_param", str2);
        if (l != null) {
            bundle.putLong("id_param", l.longValue());
        }
        bundle.putBoolean("is_link_call", z);
        bundle.putInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, ha9Var.a);
        this(bundle);
    }
}
