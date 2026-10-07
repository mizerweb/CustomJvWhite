package defpackage;

import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class k8e extends vpg implements eph {
    public final TextView d;

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
    public k8e(FrameLayout frameLayout) {
        super(frameLayout);
        TextView textView = (TextView) frameLayout.getChildAt(0);
        this.d = textView;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.topMargin = iK;
        layoutParams.bottomMargin = iK;
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(4);
        q9i.i.b(textView, bx5.b);
        int iK2 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        textView.setPadding(iK3, iK2, iK3, iK2);
        onThemeChanged(pq3.j.h(textView));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.d.setTextColor(kbcVar.getText().e);
        this.a.setBackgroundColor(kbcVar.b().f);
    }
}
