package one.me.stories.publish;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.a8d;
import defpackage.ayb;
import defpackage.bc1;
import defpackage.c0a;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.dyd;
import defpackage.e9i;
import defpackage.eyd;
import defpackage.fyd;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.gyd;
import defpackage.ha9;
import defpackage.i19;
import defpackage.ic6;
import defpackage.ih;
import defpackage.j8e;
import defpackage.je9;
import defpackage.jz;
import defpackage.k9d;
import defpackage.kbc;
import defpackage.mjg;
import defpackage.mt5;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.nyd;
import defpackage.p26;
import defpackage.pq3;
import defpackage.pxg;
import defpackage.q35;
import defpackage.qe7;
import defpackage.qyb;
import defpackage.rcc;
import defpackage.sbf;
import defpackage.skd;
import defpackage.t3f;
import defpackage.tre;
import defpackage.uik;
import defpackage.vp4;
import defpackage.vv;
import defpackage.w1h;
import defpackage.wtc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import org.apache.http.cookie.ClientCookie;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eB!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lone/me/stories/publish/PublishStoryBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lvp4;", "Lz4f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", ClientCookie.PATH_ATTR, "Lha9;", "localAccountId", "(Lt3f;Ljava/lang/String;Lha9;)V", "", "editStoryId", "", "editSettings", "(JILha9;)V", "stories"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PublishStoryBottomSheet extends BaseBottomSheetWidget implements vp4, z4f {
    public static final /* synthetic */ zv8[] t = {new dwd(PublishStoryBottomSheet.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, PublishStoryBottomSheet.class, "selectStoryTtlButton", "getSelectStoryTtlButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final wtc m;
    public final String n;
    public final ny8 o;
    public final ny8 p;
    public final gyd q;
    public final j8e r;
    public g8c s;

    public PublishStoryBottomSheet(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(t3f.class, t3f.a(pxg.a, getB().b().a, 1), "arg_story_editor_parent_scope_id");
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.m = wtcVar;
        this.n = PublishStoryBottomSheet.class.getName();
        zv8 zv8Var = t[0];
        this.o = getSharedViewModel((t3f) vvVar.a(this), p26.class, null);
        this.p = createViewModelLazy(nyd.class, new ztd(1, new k9d(this, 16, bundle)));
        gyd gydVar = new gyd(new uik(21, this), ((a2c) wtcVar.getAccessor().c(27)).a(), new a8d(19, this));
        this.q = gydVar;
        this.r = viewBinding(R.id.oneme_stories_publish_bottom_sheet_ttl_button);
        tre.m0(new fz6(E1().p, new dyd(2, gydVar, gyd.class, "submitList", "submitList(Ljava/util/List;)V", 4, 0), 3), getLifecycleScope());
    }

    public static final Integer D1(PublishStoryBottomSheet publishStoryBottomSheet, int i) {
        gyd gydVar = publishStoryBottomSheet.q;
        if (i < 0 || i >= gydVar.l()) {
            return null;
        }
        return Integer.valueOf(gydVar.n(i));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void C1(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.oneme_stories_publish_bottom_sheet_toolbar);
        rccVar.setCustomTheme(t1());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        rccVar.setLayoutParams(layoutParams);
        rccVar.setForm(gcc.Compact);
        rccVar.setTitle(R.string.publication);
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.oneme_stories_publish_bottom_sheet_settings);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.q);
        recyclerView.setItemAnimator(null);
        recyclerView.h(new sbf(t1(), new qyb(15, this), new skd(11), null, t1(), 20), -1);
        recyclerView.h(new q35(4), -1);
        recyclerView.h(new w1h(recyclerView.getContext(), t1(), new ih(this, np4.q(getContext(), R.string.oneme_stories_publish_privacy_title)), t1()), -1);
        linearLayoutJ.addView(recyclerView);
        LinearLayout linearLayoutJ2 = bc1.j(linearLayoutJ.getContext(), new ViewGroup.LayoutParams(-1, -1), 0);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        linearLayoutJ2.setPadding(iK, iK, iK, iK);
        if (!F1()) {
            cyb cybVar = new cyb(linearLayoutJ2.getContext());
            cybVar.setId(R.id.oneme_stories_publish_bottom_sheet_ttl_button);
            cybVar.setCustomTheme(t1());
            cybVar.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(104.0f * yl5.d().getDisplayMetrics().density), -2));
            cybVar.setSize(ayb.h);
            cybVar.setAppearance(zxb.SECONDARY);
            cybVar.setIcon(cybVar.getContext().getDrawable(R.drawable.icon_clock_timer).mutate());
            qe7.H(cybVar, 300L, new fyd(this));
            linearLayoutJ2.addView(cybVar);
        }
        cyb cybVar2 = new cyb(linearLayoutJ2.getContext());
        cybVar2.setId(R.id.oneme_stories_publish_bottom_sheet_publish_button);
        cybVar2.setCustomTheme(t1());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        if (!F1()) {
            layoutParams2.setMargins(gm0.K(8.0f * yl5.d().getDisplayMetrics().density), 0, 0, 0);
        }
        cybVar2.setLayoutParams(layoutParams2);
        cybVar2.setSize(ayb.h);
        cybVar2.setAppearance(zxb.PRIMARY);
        cybVar2.setText(F1() ? np4.q(getContext(), R.string.to_save) : np4.q(getContext(), R.string.oneme_stories_publish_action));
        qe7.H(cybVar2, 300L, new fyd(this, cybVar2));
        linearLayoutJ2.addView(cybVar2);
        linearLayoutJ.addView(linearLayoutJ2);
        frameLayout.addView(linearLayoutJ);
        mt5 mt5Var = new mt5(frameLayout.getContext());
        mt5Var.setTranslationY(gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        mt5Var.setCustomTheme(t1());
        frameLayout.addView(mt5Var);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        Object value;
        nyd nydVarE1 = E1();
        String str = nydVarE1.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(i, "onActionClick: "), null);
            }
        }
        if (a.L0(i, nydVarE1.r)) {
            mjg mjgVar = nydVarE1.s;
            do {
                value = mjgVar.getValue();
                ((Number) value).intValue();
            } while (!mjgVar.h(value, Integer.valueOf(i)));
            return;
        }
        String str2 = nydVarE1.f;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null) {
            return;
        }
        je9 je9Var2 = je9.f;
        if (a4cVar2.b(je9Var2)) {
            a4cVar2.c(je9Var2, str2, c0a.k(i, "onActionClick: ", " is not supported yet"), null);
        }
    }

    public final nyd E1() {
        return (nyd) this.p.getValue();
    }

    public final boolean F1() {
        return getArgs().getLong("edit_story_id") != 0;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final boolean handleBack() {
        g8c g8cVar = this.s;
        if (g8cVar != null) {
            g8cVar.a();
        }
        v1(true);
        return true;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        g8c g8cVar = this.s;
        if (g8cVar != null) {
            g8cVar.a();
        }
        super.onDetach(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ic6 ic6Var = E1().g;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new eyd(null, this, 0), 3), getViewLifecycleScope());
        if (!F1()) {
            e9i.j0(new fz6(n1g.v(new jz(E1().t, 13), getViewLifecycleOwner().f(), n09Var), new eyd(null, this, 1), 3), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(E1().h, getViewLifecycleOwner().f(), n09Var), new eyd(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(E1().n, getViewLifecycleOwner().f(), n09Var), new eyd(null, this, 3), 3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        return pq3.j.k(getContext()).b;
    }

    public PublishStoryBottomSheet(t3f t3fVar, String str, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("arg_story_editor_parent_scope_id", t3fVar), new ylc(ClientCookie.PATH_ATTR, str)));
    }

    public PublishStoryBottomSheet(long j, int i, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("edit_story_id", Long.valueOf(j)), new ylc("edit_settings", Integer.valueOf(i))));
    }
}
