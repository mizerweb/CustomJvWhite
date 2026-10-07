package one.me.devmenu.tools.server;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a3;
import defpackage.ayb;
import defpackage.b08;
import defpackage.bjf;
import defpackage.cjf;
import defpackage.cyb;
import defpackage.d97;
import defpackage.dtd;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.gwc;
import defpackage.h;
import defpackage.h47;
import defpackage.ha9;
import defpackage.i19;
import defpackage.ize;
import defpackage.j6c;
import defpackage.j8e;
import defpackage.jac;
import defpackage.lq4;
import defpackage.m6c;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.r6c;
import defpackage.uf4;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/devmenu/tools/server/ServerHostBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "dev-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ServerHostBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] D = {new dwd(ServerHostBottomSheet.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), zo5.f(zfe.a, ServerHostBottomSheet.class, "loaderView", "getLoaderView()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar;", 0), new dwd(ServerHostBottomSheet.class, "customContainer", "getCustomContainer()Landroid/widget/LinearLayout;", 0), new dwd(ServerHostBottomSheet.class, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new dwd(ServerHostBottomSheet.class, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final j8e A;
    public final j8e B;
    public final j8e C;
    public final h u;
    public final ny8 v;
    public final AutoTransition w;
    public final h47 x;
    public final j8e y;
    public final j8e z;

    public ServerHostBottomSheet(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.u = hVar;
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(b08.class, new ztd(15, new ize(7, this)));
        this.v = ny8VarCreateViewModelLazy;
        this.w = new AutoTransition();
        this.x = new h47(new cjf((b08) ny8VarCreateViewModelLazy.getValue()), ((a2c) hVar.getAccessor().c(27)).a(), 6);
        this.y = viewBinding(R.id.server_host_recycler);
        this.z = viewBinding(R.id.server_host_loader);
        this.A = viewBinding(R.id.server_host_container);
        this.B = viewBinding(R.id.server_host_input);
        this.C = viewBinding(R.id.server_host_custom_btn);
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
    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Адрес сервера");
        q9i.a(q9i.c, textView);
        textView.setTextColor(pq3.j.h(textView).getText().b);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
        recyclerView.setId(R.id.server_host_recycler);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setAdapter(this.x);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        linearLayout.addView(recyclerView);
        r6c r6cVar = new r6c(linearLayout.getContext());
        r6cVar.setId(R.id.server_host_loader);
        linearLayout.setGravity(17);
        r6cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r6cVar.setAppearance(j6c.a);
        r6cVar.setSize(m6c.a);
        r6cVar.setVisibility(8);
        linearLayout.addView(r6cVar);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setId(R.id.server_host_container);
        linearLayout2.setOrientation(1);
        linearLayout2.setVisibility(8);
        jac jacVar = new jac(linearLayout2.getContext());
        jacVar.setId(R.id.server_host_input);
        jacVar.setLayoutParams(new uf4(-1, -2));
        jacVar.setBackgroundColorAttr(Integer.valueOf(R.attr.button_secondary));
        jacVar.setHint("Введите кастомный адрес");
        jacVar.b.addTextChangedListener(new a3(6, new bjf(this, 0)));
        linearLayout2.addView(jacVar);
        cyb cybVar = new cyb(linearLayout2.getContext());
        cybVar.setId(R.id.server_host_custom_btn);
        uf4 uf4Var = new uf4(-1, -2);
        ((ViewGroup.MarginLayoutParams) uf4Var).topMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        cybVar.setLayoutParams(uf4Var);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setSize(ayb.g);
        cybVar.setText("Установить");
        qe7.H(cybVar, 300L, new gwc(21, this));
        linearLayout2.addView(cybVar);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ny8 ny8Var = this.v;
        mjg mjgVar = ((b08) ny8Var.getValue()).h;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(mjgVar, i19VarF, n09Var), new dtd((lq4) null, this, 18), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((b08) ny8Var.getValue()).i, getViewLifecycleOwner().f(), n09Var), new d97((lq4) null, this, view, 29), 3), getViewLifecycleScope());
    }

    public ServerHostBottomSheet(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
