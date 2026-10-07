package one.me.members.list;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a8j;
import defpackage.b65;
import defpackage.b9a;
import defpackage.baa;
import defpackage.c;
import defpackage.c0a;
import defpackage.c9a;
import defpackage.ch8;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.g9a;
import defpackage.gl1;
import defpackage.h;
import defpackage.h47;
import defpackage.h8a;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j8e;
import defpackage.k96;
import defpackage.n09;
import defpackage.n11;
import defpackage.n1g;
import defpackage.n9a;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p3c;
import defpackage.p63;
import defpackage.q84;
import defpackage.qh1;
import defpackage.qyj;
import defpackage.r66;
import defpackage.r84;
import defpackage.t3f;
import defpackage.tp3;
import defpackage.tre;
import defpackage.v9a;
import defpackage.vo8;
import defpackage.vp4;
import defpackage.vv;
import defpackage.x9a;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.z9a;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zsj;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lone/me/members/list/MembersListWidget;", "Lone/me/sdk/arch/Widget;", "Lb9a;", "Lh8a;", "Lvp4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Lc9a;", "(Lt3f;Lc9a;)V", "members-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MembersListWidget extends Widget implements b9a, h8a, vp4 {
    public static final /* synthetic */ zv8[] t = {new dwd(MembersListWidget.class, "membersListArgs", "getMembersListArgs()Lone/me/members/list/MembersListArgs;", 0), zo5.e(zfe.a, MembersListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new z8b(MembersListWidget.class, "selectedMemberIdForAction", "getSelectedMemberIdForAction()Ljava/lang/Long;"), new dwd(MembersListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final h a;
    public final vv b;
    public final long c;
    public final p63 d;
    public final Integer e;
    public final p3c f;
    public final ny8 g;
    public final vv h;
    public final oi8 i;
    public final h47 j;
    public final zsj k;
    public final zsj l;
    public final qh1 m;
    public final qh1 n;
    public final ny8 o;
    public final r84 p;
    public final j8e q;
    public tp3 r;
    public b65 s;

    public MembersListWidget(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.a = hVar;
        this.b = new vv("memberslist:args", c9a.class);
        this.c = o1().a;
        this.d = o1().b;
        this.e = o1().d;
        this.f = qyj.S();
        Object objF0 = tre.f0(bundle, "arg_scope_id", t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.g = getSharedViewModel((t3f) ((Parcelable) objF0), n9a.class, null);
        this.h = new vv(Long.class, null, "selected_member_id_for_action");
        this.i = oi8.e;
        h47 h47Var = new h47(this, hVar.a(), 8);
        this.j = h47Var;
        zsj zsjVar = new zsj(this, hVar.a(), 7);
        this.k = zsjVar;
        zsj zsjVar2 = new zsj(this, hVar.a(), 7);
        this.l = zsjVar2;
        qh1 qh1Var = new qh1(hVar.a(), 6);
        this.m = qh1Var;
        qh1 qh1Var2 = new qh1(hVar.a(), 1);
        this.n = qh1Var2;
        this.o = createViewModelLazy(v9a.class, new ch8(25, new x9a(this, 0)));
        this.p = new r84(new q84(false, 1), zsjVar, h47Var, zsjVar2, qh1Var, qh1Var2);
        this.q = viewBinding(R.id.members_list_rv);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        zv8[] zv8VarArr = t;
        zv8 zv8Var = zv8VarArr[2];
        vv vvVar = this.h;
        Long l = (Long) vvVar.a(this);
        if (l != null) {
            a8j.x(q1().f, new g9a(i, l.longValue()));
        }
        zv8 zv8Var2 = zv8VarArr[2];
        vvVar.b(this, null);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.i;
    }

    public final c9a o1() {
        zv8 zv8Var = t[0];
        return (c9a) this.b.a(this);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        ((baa) r1().i.getValue()).g();
        ic6 ic6Var = q1().g;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new z9a(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().k, getViewLifecycleOwner().f(), n09Var), new z9a(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(r1().o, getViewLifecycleOwner().f(), n09Var), new z9a(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().i, getViewLifecycleOwner().f(), n09Var), new z9a(null, this, 3), 3), getViewLifecycleScope());
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k96 k96Var = new k96(getContext());
        k96Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        k96Var.setId(R.id.members_list_rv);
        k96Var.setItemAnimator(null);
        r84 r84Var = this.p;
        k96Var.setAdapter(r84Var);
        k96Var.getContext();
        k96Var.setLayoutManager(new LinearLayoutManager(1, false));
        k96Var.setClipToPadding(false);
        tre.Y(k96Var);
        k96Var.setIgnoreRefreshingFlagsForScrollEvent(true);
        k96Var.setThreshold(10);
        r66 r66Var = r66.a;
        qh1 qh1Var = this.m;
        qh1Var.H(r66Var);
        k96Var.setDelegate(new n11(9, qh1Var));
        if (r84Var.l() > 0) {
            k96Var.measure(View.MeasureSpec.makeMeasureSpec(k96Var.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(k96Var.getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        }
        return k96Var;
    }

    @Override // defpackage.vp4
    public final void onDismiss() {
        zv8[] zv8VarArr = t;
        zv8 zv8Var = zv8VarArr[2];
        this.h.b(this, null);
        vo8 vo8Var = (vo8) this.f.m(this, zv8VarArr[1]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        p1().setPager(new gl1(this, 6));
    }

    public final k96 p1() {
        return (k96) this.q.m(this, t[3]);
    }

    public final n9a q1() {
        return (n9a) this.g.getValue();
    }

    public final v9a r1() {
        return (v9a) this.o.getValue();
    }

    public MembersListWidget(t3f t3fVar, c9a c9aVar) {
        this(n1g.i(new ylc("arg_scope_id", t3fVar), new ylc("memberslist:args", c9aVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(t3fVar.b().a))));
    }
}
