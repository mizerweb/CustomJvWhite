package one.me.devmenu.utils;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.bb;
import defpackage.cu8;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.i5d;
import defpackage.ifh;
import defpackage.jac;
import defpackage.jt8;
import defpackage.kt8;
import defpackage.ln5;
import defpackage.mp5;
import defpackage.n1g;
import defpackage.o37;
import defpackage.ore;
import defpackage.p;
import defpackage.poe;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qs8;
import defpackage.s66;
import defpackage.vv;
import defpackage.xs8;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z36;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\u000f"}, d2 = {"Lone/me/devmenu/utils/JsonBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "buttonId", "", "propertyName", "Lha9;", "localAccountId", "(JLjava/lang/String;Lha9;)V", "xs8", "one/me/devmenu/DevMenuFeatureTogglesPageScreen", "dev-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JsonBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] z = {new dwd(JsonBottomSheet.class, "buttonId", "getButtonId()J", 0), zo5.f(zfe.a, JsonBottomSheet.class, "propertyName", "getPropertyName()Ljava/lang/String;", 0)};
    public final vv u;
    public final i5d v;
    public final ifh w;
    public final ArrayList x;
    public LinearLayout y;

    public JsonBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = new vv("arg:button_id", Long.class);
        vv vvVar = new vv("arg:prop_name", String.class);
        e5d e5dVar = (e5d) new h(m35getAccountScopeuqN4xOY()).getAccessor().d(26).getValue();
        zv8 zv8Var = z[1];
        i5d i5dVar = (i5d) e5dVar.o().get((String) vvVar.a(this));
        if (i5dVar == null) {
            ore.p("Required value was null.");
            throw null;
        }
        this.v = i5dVar;
        this.w = e5dVar.a;
        this.x = new ArrayList();
        ln5 ln5Var = new ln5(this, new mp5(29, this));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 8));
        }
    }

    public static void F1(xs8 xs8Var, boolean z2, boolean z3) {
        if (z2 || z3) {
            jac jacVar = xs8Var.a;
            if (z2) {
                if (jacVar == null) {
                    jacVar = null;
                }
                jacVar.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 0.7f));
                jac jacVar2 = xs8Var.b;
                if (jacVar2 == null) {
                    jacVar2 = null;
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 0.3f);
                layoutParams.leftMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                jacVar2.setLayoutParams(layoutParams);
            } else {
                if (jacVar == null) {
                    jacVar = null;
                }
                jacVar.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 0.3f));
                jac jacVar3 = xs8Var.b;
                if (jacVar3 == null) {
                    jacVar3 = null;
                }
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 0.7f);
                layoutParams2.leftMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                jacVar3.setLayoutParams(layoutParams2);
            }
            ImageView imageView = xs8Var.c;
            (imageView != null ? imageView : null).setVisibility(8);
        } else {
            jac jacVar4 = xs8Var.a;
            if (jacVar4 == null) {
                jacVar4 = null;
            }
            jacVar4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 0.5f));
            jac jacVar5 = xs8Var.b;
            if (jacVar5 == null) {
                jacVar5 = null;
            }
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 0.5f);
            layoutParams3.leftMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
            jacVar5.setLayoutParams(layoutParams3);
            ImageView imageView2 = xs8Var.c;
            (imageView2 != null ? imageView2 : null).setVisibility(0);
        }
        xs8Var.d.requestLayout();
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
        Object poeVar;
        i5d i5dVar = this.v;
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        boolean z2 = true;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Редактирование JSON");
        q9i.a(q9i.b, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().b);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        int i = 0;
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        scrollView.setFillViewport(true);
        LinearLayout linearLayout2 = new LinearLayout(scrollView.getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.y = linearLayout2;
        try {
            poeVar = kt8.g(((qs8) this.w.getValue()).c(i5dVar.d(i5dVar.i())));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Object cu8Var = new cu8(s66.a);
        if (poeVar instanceof poe) {
            poeVar = cu8Var;
        }
        for (Map.Entry entry : ((cu8) poeVar).a.entrySet()) {
            xs8 xs8Var = new xs8(this, (String) entry.getKey(), (jt8) entry.getValue());
            this.x.add(xs8Var);
            LinearLayout linearLayout3 = this.y;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            linearLayout3.addView(xs8Var.d);
        }
        scrollView.addView(linearLayout2);
        linearLayout.addView(scrollView);
        cyb cybVar = new cyb(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        cybVar.setLayoutParams(layoutParams2);
        cybVar.setAppearance(zxb.SECONDARY);
        cybVar.setSize(ayb.h);
        cybVar.setText("+ Добавить свойство");
        qe7.H(cybVar, 300L, new o37(15, this));
        linearLayout.addView(cybVar);
        Object[] objArr = (Object[]) i5dVar.g.getValue();
        int length = objArr.length;
        while (i < length) {
            String str = (String) objArr[i];
            TextView textView2 = new TextView(linearLayout.getContext());
            textView2.setText(str);
            textView2.setTextColor(p.d(textView2, q9i.f, a8gVar, textView2).b);
            textView2.setTextIsSelectable(z2);
            textView2.setGravity(8388611);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
            textView2.setLayoutParams(layoutParams3);
            linearLayout.addView(textView2);
            i++;
            z2 = true;
        }
        cyb cybVar2 = new cyb(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        layoutParams4.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams4.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams4.rightMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        cybVar2.setLayoutParams(layoutParams4);
        cybVar2.setAppearance(zxb.PRIMARY);
        cybVar2.setSize(ayb.g);
        cybVar2.setText("Установить");
        qe7.H(cybVar2, 300L, new z36(this, 13, cybVar2));
        linearLayout.addView(cybVar2);
        return linearLayout;
    }

    public JsonBottomSheet(long j, String str, ha9 ha9Var) {
        this(n1g.i(new ylc("arg:button_id", Long.valueOf(j)), new ylc("arg:prop_name", str), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
