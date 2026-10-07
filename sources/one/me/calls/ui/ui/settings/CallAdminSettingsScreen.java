package one.me.calls.ui.ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a8g;
import defpackage.ab1;
import defpackage.ae9;
import defpackage.b95;
import defpackage.bb1;
import defpackage.bc1;
import defpackage.br4;
import defpackage.ca1;
import defpackage.chb;
import defpackage.da1;
import defpackage.due;
import defpackage.dwd;
import defpackage.dz4;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gc;
import defpackage.gcc;
import defpackage.ha9;
import defpackage.hb1;
import defpackage.hve;
import defpackage.j11;
import defpackage.j8e;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ns4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ol0;
import defpackage.pq3;
import defpackage.r;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sa2;
import defpackage.sbf;
import defpackage.sfd;
import defpackage.sx1;
import defpackage.t3g;
import defpackage.tbb;
import defpackage.ul9;
import defpackage.va;
import defpackage.w8;
import defpackage.wbc;
import defpackage.x02;
import defpackage.ya1;
import defpackage.ylc;
import defpackage.z4f;
import defpackage.za1;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/ui/settings/CallAdminSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lchb;", "Lz4f;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallAdminSettingsScreen extends Widget implements chb, z4f {
    public static final /* synthetic */ zv8[] j = {new dwd(CallAdminSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zo5.f(zfe.a, CallAdminSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final oi8 a;
    public final sx1 b;
    public final ny8 c;
    public final ca1 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final j8e h;
    public final ny8 i;

    public CallAdminSettingsScreen(Bundle bundle) {
        super(bundle);
        this.a = new oi8(3, 3, 3, new j11(3, 3, false));
        sx1 sx1Var = new sx1(m35getAccountScopeuqN4xOY());
        this.b = sx1Var;
        this.c = createViewModelLazy(hb1.class, new r(12, new ab1(this, 0)));
        ca1 ca1Var = new ca1(new due(this), sx1Var.b().a());
        this.d = ca1Var;
        this.e = rx8.P(3, new ab1(this, 1));
        this.f = rx8.P(3, new va(18));
        this.g = rx8.P(3, new va(19));
        viewBinding(R.id.call_info_admin_setting_toolbar);
        this.h = viewBinding(R.id.call_info_admin_setting_action_list);
        e9i.j0(new fz6(o1().h, new w8(2, ca1Var, ca1.class, "submitList", "submitList(Ljava/util/List;)V", 4, 1), 3), getLifecycleScope());
        this.i = rx8.P(3, new ab1(this, 2));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    public final hb1 o1() {
        return (hb1) this.c.getValue();
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
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.call_info_admin_setting_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.call_admins_settings_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new ol0(2, this)));
        a8g a8gVar = pq3.j;
        rccVar.setCustomTheme(a8gVar.l(rccVar).b);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.call_info_admin_setting_action_list);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.d);
        recyclerView.setItemAnimator(null);
        recyclerView.h((sbf) this.e.getValue(), -1);
        recyclerView.h((za1) this.f.getValue(), -1);
        linearLayoutJ.addView(rccVar);
        linearLayoutJ.addView(recyclerView);
        linearLayoutJ.setBackgroundColor(a8gVar.l(linearLayoutJ).b.b().b);
        return linearLayoutJ;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        if (((t3g) this.g.getValue()) != null) {
            t3g.a();
        }
        br4 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            hveVarU1.M((bb1) this.i.getValue());
        }
        zv8[] zv8VarArr = j;
        zv8 zv8Var = zv8VarArr[1];
        j8e j8eVar = this.h;
        ((RecyclerView) j8eVar.m(this, zv8Var)).setAdapter(null);
        ((RecyclerView) j8eVar.m(this, zv8VarArr[1])).o0((za1) this.f.getValue());
        ((RecyclerView) j8eVar.m(this, zv8VarArr[1])).o0((sbf) this.e.getValue());
        hb1 hb1VarO1 = o1();
        ny8 ny8Var = hb1VarO1.e;
        ny8 ny8Var2 = hb1VarO1.e;
        ((b95) ny8Var.getValue()).l.remove(hb1VarO1);
        if (((x02) ((b95) ny8Var2.getValue()).i.a.getValue()).C()) {
            da1 da1VarB = hb1VarO1.B();
            da1VarB.getClass();
            gc gcVar = (gc) ((ya1) da1VarB).v.getValue();
            sa2 sa2Var = (sa2) hb1VarO1.f.getValue();
            boolean z = gcVar.b;
            boolean z2 = gcVar.c;
            boolean z3 = gcVar.d;
            boolean z4 = gcVar.e;
            boolean z5 = gcVar.g;
            String strA = ns4.a(((dz4) ((x02) ((b95) ny8Var2.getValue()).i.a.getValue()).z().getValue()).c);
            sa2Var.getClass();
            ul9 ul9Var = new ul9();
            Integer numC = ((tbb) sa2Var.b.getValue()).c();
            if (numC != null) {
                ul9Var.put("screen", Integer.valueOf(numC.intValue()));
            }
            ul9Var.put("camera", Boolean.valueOf(z));
            ul9Var.put("microphone", Boolean.valueOf(z2));
            ul9Var.put("screenshare", Boolean.valueOf(z3));
            ul9Var.put("recording", Boolean.valueOf(z4));
            ul9Var.put("waiting", Boolean.valueOf(z5));
            if (strA != null) {
                ul9Var.put("call_id", strA);
            }
            ae9.k((ae9) sa2Var.a.getValue(), "CALL", "ADMIN_CALL_SETTINGS", ul9Var.b(), 8);
        }
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        br4 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        lq4 lq4Var = null;
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            hveVarU1.a((bb1) this.i.getValue());
        }
        e9i.j0(new fz6(n1g.v(o1().i, getViewLifecycleOwner().f(), n09.d), new sfd(24, lq4Var, this), 3), getViewLifecycleScope());
    }

    public CallAdminSettingsScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
