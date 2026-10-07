package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vz7 extends wf4 implements eph {
    public final AppCompatTextView s;
    public final cs t;

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
    public vz7(Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(View.generateViewId());
        appCompatTextView.setGravity(8388611);
        q9i.a(q9i.f, appCompatTextView);
        a8g a8gVar = pq3.j;
        appCompatTextView.setTextColor(a8gVar.h(appCompatTextView).getText().b);
        this.s = appCompatTextView;
        cs csVar = new cs(context);
        csVar.setId(View.generateViewId());
        csVar.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar).getIcon().h));
        csVar.setImageResource(R.drawable.icon_check);
        this.t = csVar;
        setLayoutParams(new ViewGroup.LayoutParams(-1, gm0.K(48.0f * yl5.d().getDisplayMetrics().density)));
        setBackgroundColor(a8gVar.h(this).b().f);
        addView(appCompatTextView);
        addView(csVar);
        eg4 eg4VarH = ch3.h(this);
        int id = csVar.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 4, 0, 4);
        eg4VarH.d(id, 6, 0, 6);
        new bsb(6, eg4VarH, id).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id2 = appCompatTextView.getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 4, 0, 4);
        eg4VarH.d(id2, 6, csVar.getId(), 7);
        new bsb(6, eg4VarH, id2).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(this);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        setBackgroundColor(kbcVar.b().f);
        this.t.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().h));
        this.s.setTextColor(kbcVar.getText().b);
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        this.t.setVisibility(!z ? 4 : 0);
    }
}
