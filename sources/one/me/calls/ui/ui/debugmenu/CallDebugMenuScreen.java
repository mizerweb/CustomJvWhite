package one.me.calls.ui.ui.debugmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a8g;
import defpackage.bc1;
import defpackage.bg1;
import defpackage.br4;
import defpackage.c7k;
import defpackage.chb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.ha9;
import defpackage.hve;
import defpackage.j8e;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ol0;
import defpackage.pq3;
import defpackage.r;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sbf;
import defpackage.sx1;
import defpackage.uf1;
import defpackage.va;
import defpackage.vf1;
import defpackage.w8;
import defpackage.wbc;
import defpackage.wf1;
import defpackage.xf1;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/ui/debugmenu/CallDebugMenuScreen;", "Lone/me/sdk/arch/Widget;", "Lchb;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "wf1", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallDebugMenuScreen extends Widget implements chb {
    public static final /* synthetic */ zv8[] i = {new dwd(CallDebugMenuScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zo5.f(zfe.a, CallDebugMenuScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final oi8 a;
    public final sx1 b;
    public final ny8 c;
    public final uf1 d;
    public final ny8 e;
    public final ny8 f;
    public final j8e g;
    public final ny8 h;

    public CallDebugMenuScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        sx1 sx1Var = new sx1(m35getAccountScopeuqN4xOY());
        this.b = sx1Var;
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(bg1.class, new r(15, new vf1(this, 0)));
        this.c = ny8VarCreateViewModelLazy;
        uf1 uf1Var = new uf1(new c7k(4, this), sx1Var.b().a());
        this.d = uf1Var;
        this.e = rx8.P(3, new vf1(this, 1));
        this.f = rx8.P(3, new va(25));
        viewBinding(R.id.call_debug_menu_settings_toolbar);
        this.g = viewBinding(R.id.call_debug_menu_settings_action_list);
        e9i.j0(new fz6(((bg1) ny8VarCreateViewModelLazy.getValue()).e, new w8(2, uf1Var, uf1.class, "submitList", "submitList(Ljava/util/List;)V", 4, 3), 3), getLifecycleScope());
        this.h = rx8.P(3, new vf1(this, 2));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
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
        rccVar.setId(R.id.call_debug_menu_settings_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.call_debug_menu_settings_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new ol0(3, this)));
        a8g a8gVar = pq3.j;
        rccVar.setCustomTheme(a8gVar.l(rccVar).b);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.call_debug_menu_settings_action_list);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.d);
        recyclerView.setItemAnimator(null);
        recyclerView.h((sbf) this.e.getValue(), -1);
        recyclerView.h((wf1) this.f.getValue(), -1);
        linearLayoutJ.addView(rccVar);
        linearLayoutJ.addView(recyclerView);
        linearLayoutJ.setBackgroundColor(a8gVar.l(linearLayoutJ).b.b().d);
        return linearLayoutJ;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        br4 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            hveVarU1.M((xf1) this.h.getValue());
        }
        zv8[] zv8VarArr = i;
        zv8 zv8Var = zv8VarArr[1];
        j8e j8eVar = this.g;
        ((RecyclerView) j8eVar.m(this, zv8Var)).setAdapter(null);
        ((RecyclerView) j8eVar.m(this, zv8VarArr[1])).o0((wf1) this.f.getValue());
        ((RecyclerView) j8eVar.m(this, zv8VarArr[1])).o0((sbf) this.e.getValue());
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        br4 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            hveVarU1.a((xf1) this.h.getValue());
        }
    }

    public CallDebugMenuScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
