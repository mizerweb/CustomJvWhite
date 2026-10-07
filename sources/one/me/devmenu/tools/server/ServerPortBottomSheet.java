package one.me.devmenu.tools.server;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a3;
import defpackage.aeb;
import defpackage.ayb;
import defpackage.bjf;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.et3;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.hcd;
import defpackage.ize;
import defpackage.j8e;
import defpackage.jac;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.uf4;
import defpackage.xb9;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/devmenu/tools/server/ServerPortBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "dev-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ServerPortBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] y = {new dwd(ServerPortBottomSheet.class, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), zo5.f(zfe.a, ServerPortBottomSheet.class, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final h u;
    public final ny8 v;
    public final j8e w;
    public final j8e x;

    public ServerPortBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = new h(m35getAccountScopeuqN4xOY());
        this.v = createViewModelLazy(hcd.class, new ztd(16, new ize(8, this)));
        this.w = viewBinding(R.id.server_port_input);
        this.x = viewBinding(R.id.server_port_custom_btn);
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
        textView.setText("Порт сервера");
        q9i.a(q9i.c, textView);
        textView.setTextColor(pq3.j.h(textView).getText().b);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        jac jacVar = new jac(linearLayout.getContext());
        jacVar.setId(R.id.server_port_input);
        String strX = ((xb9) ((et3) ((hcd) this.v.getValue()).c.getValue())).X();
        if (strX == null) {
            strX = "";
        }
        jacVar.setText(strX);
        jacVar.setLayoutParams(new uf4(-1, -2));
        jacVar.setBackgroundColorAttr(Integer.valueOf(R.attr.button_secondary));
        jacVar.setHint("Введите кастомный порт");
        jacVar.setInputType(2);
        jacVar.b.addTextChangedListener(new a3(6, new bjf(this, 1)));
        linearLayout.addView(jacVar);
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setId(R.id.server_port_custom_btn);
        uf4 uf4Var = new uf4(-1, -2);
        ((ViewGroup.MarginLayoutParams) uf4Var).topMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        cybVar.setLayoutParams(uf4Var);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setSize(ayb.g);
        cybVar.setText("Установить");
        qe7.H(cybVar, 300L, new aeb(this, 22, cybVar));
        linearLayout.addView(cybVar);
        return linearLayout;
    }

    public ServerPortBottomSheet(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
