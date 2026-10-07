package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class oj2 extends wod implements eph {
    public final cyb u;
    public final AppCompatTextView v;

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
    public oj2(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        super(linearLayout);
        cyb cybVar = new cyb(context);
        cybVar.setSize(ayb.j);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_profile_edit_cancel_delete_profile));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        layoutParams.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        cybVar.setLayoutParams(layoutParams);
        this.u = cybVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        Drawable drawable = context.getDrawable(R.drawable.icon_warning);
        ArrayList arrayList = soh.a;
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        a8g a8gVar = pq3.j;
        appCompatTextView.setCompoundDrawableTintList(ColorStateList.valueOf(a8gVar.h(linearLayout).getIcon().j));
        appCompatTextView.setCompoundDrawablePadding(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f));
        q9i.a(q9i.d, appCompatTextView);
        appCompatTextView.setTextColor(a8gVar.h(linearLayout).getText().j);
        int iK = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        appCompatTextView.setPaddingRelative(iK, gm0.K(10.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), iK2);
        this.v = appCompatTextView;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setBackground(null);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(cybVar);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        this.v.setText(((nj2) k79Var).a.b(this.a.getContext()));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        a8g a8gVar = pq3.j;
        View view = this.a;
        int i = a8gVar.h(view).getText().j;
        AppCompatTextView appCompatTextView = this.v;
        appCompatTextView.setTextColor(i);
        int i2 = a8gVar.h(view).getIcon().j;
        ArrayList arrayList = soh.a;
        appCompatTextView.setCompoundDrawableTintList(ColorStateList.valueOf(i2));
    }
}
