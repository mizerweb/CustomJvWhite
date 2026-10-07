package one.me.calllist.ui.callpresettings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.ayb;
import defpackage.br1;
import defpackage.bsb;
import defpackage.ch3;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.gv1;
import defpackage.h;
import defpackage.ha9;
import defpackage.i19;
import defpackage.j8e;
import defpackage.jv1;
import defpackage.kv1;
import defpackage.lv1;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nl9;
import defpackage.np4;
import defpackage.nv1;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ol0;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.r;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sbf;
import defpackage.w8;
import defpackage.wbc;
import defpackage.wf4;
import defpackage.x7;
import defpackage.yk1;
import defpackage.yl5;
import defpackage.z2;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zo7;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calllist/ui/callpresettings/CallPresettingsScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lha9;", "localAccountId", "(JLha9;)V", "call-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallPresettingsScreen extends Widget {
    public static final /* synthetic */ zv8[] i = {new dwd(CallPresettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zo5.f(zfe.a, CallPresettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(CallPresettingsScreen.class, "saveButton", "getSaveButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final h a;
    public final ny8 b;
    public final gv1 c;
    public final ny8 d;
    public final ny8 e;
    public final j8e f;
    public final j8e g;
    public final j8e h;

    public CallPresettingsScreen(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.a = hVar;
        this.b = createViewModelLazy(nv1.class, new r(25, new z2(this, 20, bundle)));
        gv1 gv1Var = new gv1(new zo7(7, this), ((a2c) hVar.getAccessor().c(27)).a());
        this.c = gv1Var;
        this.d = rx8.P(3, new yk1(7, this));
        this.e = rx8.P(3, new br1(12));
        this.f = viewBinding(R.id.call_info_presettings_toolbar);
        this.g = viewBinding(R.id.call_info_presettings_action_list);
        this.h = viewBinding(R.id.call_presettings_call_save_changes);
        e9i.j0(new fz6(o1().j, new w8(2, gv1Var, gv1.class, "submitList", "submitList(Ljava/util/List;)V", 4, 5), 3), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getA() {
        oi8 oi8Var = oi8.e;
        return oi8.f;
    }

    public final nv1 o1() {
        return (nv1) this.b.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        wf4 wf4Var = new wf4(context);
        wf4Var.setLayoutParams(layoutParams);
        rcc rccVar = new rcc(wf4Var.getContext());
        rccVar.setFocusable(true);
        rccVar.setFocusableInTouchMode(true);
        rccVar.setId(R.id.call_info_presettings_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.call_presettings_change_call_name_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new ol0(4, this)));
        RecyclerView recyclerView = new RecyclerView(wf4Var.getContext());
        recyclerView.setId(R.id.call_info_presettings_action_list);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.c);
        recyclerView.setItemAnimator(null);
        recyclerView.h((sbf) this.d.getValue(), -1);
        recyclerView.h((jv1) this.e.getValue(), -1);
        cyb cybVar = new cyb(wf4Var.getContext());
        cybVar.setId(R.id.call_presettings_call_save_changes);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        qe7.H(cybVar, 300L, new x7(2, this));
        cybVar.setText(np4.q(cybVar.getContext(), R.string.call_presettings_call_save_changes));
        cybVar.setVisibility(8);
        wf4Var.addView(rccVar);
        wf4Var.addView(recyclerView);
        wf4Var.addView(cybVar);
        n1g.N(new kv1(3, null, 0), wf4Var);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = rccVar.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = recyclerView.getId();
        eg4VarH.d(id2, 3, rccVar.getId(), 4);
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 7, 0, 7);
        eg4VarH.d(id2, 4, cybVar.getId(), 3);
        int id3 = cybVar.getId();
        eg4VarH.d(id3, 4, 0, 4);
        eg4VarH.d(id3, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id3));
        eg4VarH.d(id3, 7, 0, 7);
        new bsb(7, eg4VarH, id3).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(wf4Var);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        zv8[] zv8VarArr = i;
        zv8 zv8Var = zv8VarArr[1];
        j8e j8eVar = this.g;
        ((RecyclerView) j8eVar.m(this, zv8Var)).setAdapter(null);
        ((RecyclerView) j8eVar.m(this, zv8VarArr[1])).o0((jv1) this.e.getValue());
        ((RecyclerView) j8eVar.m(this, zv8VarArr[1])).o0((sbf) this.d.getValue());
        ((rcc) this.f.m(this, zv8VarArr[0])).requestFocus();
        nl9.c(view);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        r8e r8eVar = o1().h;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new lv1(null, this, 0), 3), getViewLifecycleScope());
        ((rcc) this.f.m(this, i[0])).requestFocus();
        e9i.j0(new fz6(n1g.v(o1().k, getViewLifecycleOwner().f(), n09Var), new lv1(null, this, 1), 3), getViewLifecycleScope());
    }

    public CallPresettingsScreen(long j, ha9 ha9Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id_arg", j);
        bundle.putInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, ha9Var.a);
        this(bundle);
    }
}
