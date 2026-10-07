package one.me.devmenu.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.cu2;
import defpackage.e9i;
import defpackage.ew5;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.ghb;
import defpackage.h;
import defpackage.ha9;
import defpackage.ie;
import defpackage.ifh;
import defpackage.in1;
import defpackage.j22;
import defpackage.jz;
import defpackage.lq4;
import defpackage.lw5;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.oc9;
import defpackage.oi8;
import defpackage.oz2;
import defpackage.p90;
import defpackage.qe7;
import defpackage.rcc;
import defpackage.tp2;
import defpackage.wbc;
import defpackage.xhh;
import defpackage.yk1;
import defpackage.ylc;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/devmenu/tools/ChatInfoDevWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "dev-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatInfoDevWidget extends Widget {
    public final h a;
    public final mjg b;
    public TextView c;
    public final ifh d;
    public final oi8 e;

    public ChatInfoDevWidget(Bundle bundle) {
        super(bundle);
        this.a = new h(m35getAccountScopeuqN4xOY());
        this.b = p90.a(null);
        this.d = new ifh(new yk1(25, this));
        this.e = oi8.f;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getE() {
        return this.e;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        oz2 oz2Var = new oz2(this, getContext());
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.addView(oz2Var);
        tp2 tp2VarA = oc9.a(viewGroup.getContext());
        LinearLayout linearLayout = new LinearLayout(tp2VarA.getContext());
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new j22(9, this)));
        rccVar.setTitle("Chat info");
        linearLayout.addView(rccVar);
        linearLayout.addView(scrollView);
        tp2VarA.addView(linearLayout);
        return tp2VarA;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        this.c = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ghb ghbVar = ew5.b;
        ie ieVar = new ie(new cu2(new jz(n1g.v(e9i.G(this.b, qe7.O(1, lw5.SECONDS)), getViewLifecycleOwner().f(), n09.d), 13), 1), this, 15);
        h hVar = this.a;
        e9i.j0(e9i.T(new fz6(e9i.T(ieVar, ((n0c) ((xhh) hVar.getAccessor().d(23).getValue())).b()), new in1(this, (lq4) null, 14), 3), ((n0c) ((xhh) hVar.getAccessor().d(23).getValue())).c()), getViewLifecycleScope());
    }

    public ChatInfoDevWidget(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
