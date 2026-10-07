package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class a76 extends LinearLayout implements eph {
    public final cs a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final cyb d;

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
    public a76(Context context) {
        super(context, null);
        cs csVar = new cs(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 188.0f), gm0.K(188.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.setMargins(0, 0, 0, gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        csVar.setLayoutParams(layoutParams);
        setGravity(17);
        a8g a8gVar = pq3.j;
        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar).getIcon().e));
        this.a = csVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, 0, gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        appCompatTextView.setLayoutParams(layoutParams2);
        q9i.a(q9i.d, appCompatTextView);
        appCompatTextView.setTextColor(a8gVar.h(appCompatTextView).getText().b);
        appCompatTextView.setGravity(17);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        appCompatTextView2.setLayoutParams(layoutParams3);
        q9i.a(q9i.i, appCompatTextView2);
        appCompatTextView2.setTextColor(a8gVar.h(appCompatTextView2).getText().d);
        appCompatTextView2.setGravity(17);
        this.c = appCompatTextView2;
        cyb cybVar = new cyb(context);
        cybVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        cybVar.setSize(ayb.h);
        cybVar.setAppearance(zxb.PRIMARY);
        setGravity(17);
        this.d = cybVar;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setPaddingRelative(gm0.J(((double) yl5.d().getDisplayMetrics().density) * 21.5d), 0, gm0.J(((double) yl5.d().getDisplayMetrics().density) * 21.5d), 0);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(cybVar);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().e));
        this.b.setTextColor(kbcVar.getText().b);
        this.c.setTextColor(kbcVar.getText().d);
    }

    public final void setButtonAction(af7 af7Var) {
        qe7.H(this.d, 300L, new d8(5, af7Var));
    }

    public final void setButtonTitle(int i) {
        this.d.setText(np4.q(getContext(), i));
    }

    public final void setDescription(int i) {
        this.c.setText(np4.q(getContext(), i));
    }

    public final void setImage(int i) {
        this.a.setImageDrawable(getContext().getDrawable(i).mutate());
    }

    public final void setIsButtonVisible(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    public final void setTitle(int i) {
        this.b.setText(np4.q(getContext(), i));
    }

    public final void setDescription(String str) {
        this.c.setText(str);
    }
}
