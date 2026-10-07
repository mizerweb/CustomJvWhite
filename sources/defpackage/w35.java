package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class w35 extends vpg implements eph {
    public final TextView d;
    public final GradientDrawable e;

    public w35(FrameLayout frameLayout, bx5 bx5Var) {
        super(frameLayout);
        this.d = (TextView) frameLayout.getChildAt(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f = yl5.d().getDisplayMetrics().density * 10.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        gradientDrawable.setCornerRadii(fArr);
        TextView textView = this.d;
        a8g a8gVar = pq3.j;
        gradientDrawable.setColor(a8gVar.h(textView).t().b);
        this.e = gradientDrawable;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView textView2 = this.d;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.topMargin = iK;
        layoutParams.bottomMargin = iK;
        textView2.setLayoutParams(layoutParams);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        q9i.t.h().b(textView2, bx5Var);
        textView2.setMinHeight(gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
        textView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 1.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(1.0f * yl5.d().getDisplayMetrics().density));
        textView2.setBackground(textView2.getBackground());
        onThemeChanged(a8gVar.h(textView2));
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
    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        a8g a8gVar = pq3.j;
        TextView textView = this.d;
        a8gVar.h(textView);
        textView.setTextColor(-1);
        int i = a8gVar.h(textView).t().b;
        GradientDrawable gradientDrawable = this.e;
        gradientDrawable.setColor(i);
        textView.setBackground(gradientDrawable);
    }
}
