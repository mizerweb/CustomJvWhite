package one.me.devmenu.utils;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.bb;
import defpackage.cyb;
import defpackage.dbc;
import defpackage.dwd;
import defpackage.gm0;
import defpackage.ln5;
import defpackage.mp5;
import defpackage.p;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.t8;
import defpackage.vv;
import defpackage.yl5;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lone/me/devmenu/utils/FeatureValueInfoBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "one/me/devmenu/DevMenuFeatureTogglesPageScreen", "dev-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FeatureValueInfoBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] C = {new dwd(FeatureValueInfoBottomSheet.class, "toggleId", "getToggleId()J", 0), zo5.f(zfe.a, FeatureValueInfoBottomSheet.class, "title", "getTitle()Ljava/lang/String;", 0), new dwd(FeatureValueInfoBottomSheet.class, "currentValue", "getCurrentValue()Ljava/lang/String;", 0), new dwd(FeatureValueInfoBottomSheet.class, "defaultValue", "getDefaultValue()Ljava/lang/String;", 0), new dwd(FeatureValueInfoBottomSheet.class, "valueSource", "getValueSource()Ljava/lang/String;", 0), new dwd(FeatureValueInfoBottomSheet.class, "localValue", "getLocalValue()Ljava/lang/String;", 0), new dwd(FeatureValueInfoBottomSheet.class, "serverValue", "getServerValue()Ljava/lang/String;", 0), new dwd(FeatureValueInfoBottomSheet.class, "experimentValue", "getExperimentValue()Ljava/lang/String;", 0)};
    public final vv A;
    public final vv B;
    public final vv u;
    public final vv v;
    public final vv w;
    public final vv x;
    public final vv y;
    public final vv z;

    public FeatureValueInfoBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = new vv(Long.class, 0L, "arg:toggle_id");
        this.v = new vv(String.class, "", "arg:title");
        this.w = new vv(String.class, "", "arg:current_value");
        this.x = new vv(String.class, null, "arg:default_value");
        this.y = new vv(String.class, "", "arg:value_source");
        this.z = new vv(String.class, null, "arg:local_value");
        this.A = new vv(String.class, null, "arg:server_value");
        this.B = new vv(String.class, null, "arg:experiment_value");
        ln5 ln5Var = new ln5(this, new mp5(6, this));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 4));
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
    public static void F1(LinearLayout linearLayout, String str, String str2, boolean z) {
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(str);
        q9i.a(q9i.g, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().c);
        textView.setGravity(8388611);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(0.0f * yl5.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setText(str2);
        q9i.a(z ? q9i.f : q9i.e, textView2);
        dbc text = a8gVar.h(textView2).getText();
        textView2.setTextColor(z ? text.h : text.b);
        textView2.setGravity(8388611);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(2.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        textView2.setLayoutParams(layoutParams2);
        linearLayout.addView(textView2);
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
        zv8[] zv8VarArr = C;
        zv8 zv8Var = zv8VarArr[1];
        textView.setText((String) this.v.a(this));
        q9i.a(q9i.c, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().b);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        F1(linearLayout, "Priority: Local > Experiment > Server > Default", "", false);
        zv8 zv8Var2 = zv8VarArr[2];
        F1(linearLayout, "Current", (String) this.w.a(this), true);
        zv8 zv8Var3 = zv8VarArr[5];
        String str = (String) this.z.a(this);
        if (str == null) {
            str = "Not set";
        }
        F1(linearLayout, "Local Value", str, false);
        zv8 zv8Var4 = zv8VarArr[7];
        String str2 = (String) this.B.a(this);
        if (str2 == null) {
            str2 = "Not set";
        }
        F1(linearLayout, "Experiment Value", str2, false);
        zv8 zv8Var5 = zv8VarArr[6];
        String str3 = (String) this.A.a(this);
        if (str3 == null) {
            str3 = "Not set";
        }
        F1(linearLayout, "Server Value", str3, false);
        zv8 zv8Var6 = zv8VarArr[3];
        String str4 = (String) this.x.a(this);
        F1(linearLayout, "Default Value", str4 != null ? str4 : "Not set", false);
        TextView textView2 = new TextView(linearLayout.getContext());
        zv8 zv8Var7 = zv8VarArr[4];
        textView2.setText("Source: " + ((String) this.y.a(this)));
        textView2.setTextColor(p.d(textView2, q9i.g, a8gVar, textView2).d);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        textView2.setLayoutParams(layoutParams2);
        linearLayout.addView(textView2);
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setSize(ayb.h);
        cybVar.setText("Reset");
        linearLayout.setGravity(17);
        qe7.H(cybVar, 300L, new t8(28, this));
        linearLayout.addView(cybVar);
        return linearLayout;
    }
}
