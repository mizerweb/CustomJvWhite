package one.me.login.neuroavatars;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.aac;
import defpackage.bc1;
import defpackage.ca2;
import defpackage.ceb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.er3;
import defpackage.fz6;
import defpackage.g57;
import defpackage.gm0;
import defpackage.i19;
import defpackage.ib;
import defpackage.j8e;
import defpackage.lh9;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.odb;
import defpackage.ol0;
import defpackage.peb;
import defpackage.q91;
import defpackage.r07;
import defpackage.t3f;
import defpackage.vv;
import defpackage.w62;
import defpackage.wdb;
import defpackage.wpg;
import defpackage.xbd;
import defpackage.xdb;
import defpackage.xeb;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yr8;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zsj;
import defpackage.zv8;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\f"}, d2 = {"Lone/me/login/neuroavatars/NeuroAvatarPickerBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", "viewHeight", "(Lt3f;I)V", "dn2", "login"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NeuroAvatarPickerBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] E = {new dwd(NeuroAvatarPickerBottomSheet.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, NeuroAvatarPickerBottomSheet.class, "viewHeight", "getViewHeight()I", 0), new dwd(NeuroAvatarPickerBottomSheet.class, "tabsView", "getTabsView()Lone/me/common/tablayout/OneMeTabLayout;", 0), new dwd(NeuroAvatarPickerBottomSheet.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(NeuroAvatarPickerBottomSheet.class, "tabsShimmer", "getTabsShimmer()Lone/me/login/neuroavatars/NeuroAvatarsTabShimmerView;", 0)};
    public final xdb A;
    public final j8e B;
    public final j8e C;
    public final j8e D;
    public final vv u;
    public final ny8 v;
    public final ExecutorService w;
    public final zsj x;
    public final peb y;
    public final yr8 z;

    public NeuroAvatarPickerBottomSheet(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(t3f.class, t3f.d, Widget.ARG_SCOPE_ID);
        this.u = new vv(Integer.class, 0, "arg_view_height");
        zv8 zv8Var = E[0];
        this.v = getSharedViewModel((t3f) vvVar.a(this), xeb.class, null);
        ExecutorService executorServiceA = ((a2c) new ca2(m35getAccountScopeuqN4xOY()).getAccessor().c(27)).a();
        this.w = executorServiceA;
        zsj zsjVar = new zsj(executorServiceA, new ceb() { // from class: vdb
            @Override // defpackage.ceb
            public final void a(udb udbVar) {
                zv8[] zv8VarArr = NeuroAvatarPickerBottomSheet.E;
                NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = this.a;
                neuroAvatarPickerBottomSheet.G1().H(udbVar);
                neuroAvatarPickerBottomSheet.v1(true);
            }
        }, 8);
        this.x = zsjVar;
        this.y = new peb(zsjVar, new lh9(16, this));
        this.z = new yr8(3);
        this.A = new xdb(0, this);
        this.B = viewBinding(R.id.oneme_login_neuro_avatars_tabs);
        this.C = viewBinding(R.id.oneme_login_neuro_avatars_recycler_view);
        this.D = viewBinding(R.id.oneme_login_neuro_avatars_tabs_shimmer);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayoutJ = bc1.j(getContext(), new ViewGroup.LayoutParams(-1, -2), 1);
        Context context = linearLayoutJ.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        er3.K(frameLayout2);
        linearLayoutJ.addView(frameLayout2);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.oneme_login_neuro_avatars_recycler_view);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(4));
        zsj zsjVar = this.x;
        recyclerView.setAdapter(zsjVar);
        odb odbVar = new odb(recyclerView, zsjVar, new w62(zsjVar, 6, this));
        g57 g57Var = new g57(new ol0(18, zsjVar), recyclerView.getContext());
        recyclerView.h(odbVar, -1);
        recyclerView.h(g57Var, -1);
        recyclerView.h(new q91(gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 7), -1);
        linearLayoutJ.addView(recyclerView);
        recyclerView.k(this.y);
        return linearLayoutJ;
    }

    public final aac F1() {
        return (aac) this.B.m(this, E[2]);
    }

    public final xeb G1() {
        return (xeb) this.v.getValue();
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        F1().k(this.A);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        r07 r07Var = G1().o;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r07Var, i19VarF, n09Var), new wdb(null, this, 0), i), getViewLifecycleScope());
        F1().a(this.A);
        e9i.j0(new fz6(n1g.v(G1().q, getViewLifecycleOwner().f(), n09Var), new wdb(null, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(G1().n, getViewLifecycleOwner().f(), n09Var), new wdb(null, this, 2), i), getViewLifecycleScope());
        zsj zsjVar = this.x;
        zsjVar.C(new wpg(this, 1, zsjVar));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final xbd p1() {
        return new ib(this, 4);
    }

    public NeuroAvatarPickerBottomSheet(t3f t3fVar, int i) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("arg_view_height", Integer.valueOf(i))));
    }
}
