package one.me.devmenu.utils;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a3;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.bb;
import defpackage.bjf;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.gm0;
import defpackage.j8e;
import defpackage.jac;
import defpackage.jvf;
import defpackage.ln5;
import defpackage.p;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.vbi;
import defpackage.vv;
import defpackage.yl5;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lone/me/devmenu/utils/ValueBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "hri", "dev-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class ValueBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] z = {new dwd(ValueBottomSheet.class, "buttonId", "getButtonId()J", 0), zo5.f(zfe.a, ValueBottomSheet.class, "descriptions", "getDescriptions()[Ljava/lang/String;", 0), new dwd(ValueBottomSheet.class, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new dwd(ValueBottomSheet.class, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final String u;
    public final vv v;
    public final vv w;
    public final j8e x;
    public final j8e y;

    public ValueBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = "";
        this.v = new vv("arg:button_id", Long.class);
        this.w = new vv("arg:descriptions", String[].class);
        this.x = viewBinding(R.id.long_bottom_sheet_input);
        this.y = viewBinding(R.id.long_bottom_sheet_button);
        ln5 ln5Var = new ln5(this, new vbi(6, this));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 19));
        }
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
        textView.setText("Значение рубильника");
        q9i.a(q9i.c, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().b);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        jac jacVar = new jac(linearLayout.getContext());
        jacVar.setId(R.id.long_bottom_sheet_input);
        jacVar.setText(getU());
        jacVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        jacVar.setBackgroundColorAttr(Integer.valueOf(R.attr.button_secondary));
        jacVar.setHint("Введите кастомное значение");
        if (getA()) {
            jacVar.setInputType(2);
        }
        jacVar.b.addTextChangedListener(new a3(6, new bjf(this, 2)));
        linearLayout.addView(jacVar);
        zv8 zv8Var = z[1];
        for (String str : (String[]) this.w.a(this)) {
            TextView textView2 = new TextView(linearLayout.getContext());
            textView2.setText(str);
            textView2.setTextColor(p.d(textView2, q9i.g, a8gVar, textView2).b);
            textView2.setGravity(8388611);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
            textView2.setLayoutParams(layoutParams2);
            linearLayout.addView(textView2);
        }
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setId(R.id.long_bottom_sheet_button);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        cybVar.setLayoutParams(layoutParams3);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setSize(ayb.g);
        cybVar.setText("Установить");
        qe7.H(cybVar, 300L, new jvf(this, 20, cybVar));
        linearLayout.addView(cybVar);
        return linearLayout;
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public String getU() {
        return this.u;
    }

    /* JADX INFO: renamed from: G1 */
    public boolean getA() {
        return false;
    }
}
