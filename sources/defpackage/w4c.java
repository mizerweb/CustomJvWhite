package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w4c implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ y4c c;

    public /* synthetic */ w4c(y4c y4cVar, Context context) {
        this.a = 4;
        this.c = y4cVar;
        this.b = context;
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
    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        a8g a8gVar = pq3.j;
        Context context = this.b;
        y4c y4cVar = this.c;
        switch (i) {
            case 0:
                TextView textViewE = qv1.e(context, R.id.oneme_middle_banner_title);
                uf4 uf4Var = new uf4(0, -2);
                uf4Var.t = 0;
                uf4Var.i = 0;
                ny8 ny8Var = y4cVar.x;
                int i2 = y4cVar.u;
                ny8 ny8Var2 = y4cVar.w;
                uf4Var.u = ny8Var.d() ? ((ImageView) ny8Var.getValue()).getId() : 0;
                uf4Var.k = ny8Var2.d() ? ((TextView) ny8Var2.getValue()).getId() : 0;
                uf4Var.setMarginStart(i2);
                ((ViewGroup.MarginLayoutParams) uf4Var).topMargin = gm0.K(26.0f * yl5.d().getDisplayMetrics().density);
                uf4Var.setMarginEnd(i2);
                textViewE.setLayoutParams(uf4Var);
                textViewE.setMaxLines(2);
                textViewE.setEllipsize(TextUtils.TruncateAt.END);
                a8gVar.h(textViewE);
                textViewE.setTextColor(-1);
                q9i.a(q9i.c, textViewE);
                return textViewE;
            case 1:
                TextView textViewE2 = qv1.e(context, R.id.oneme_middle_banner_subtitle);
                uf4 uf4Var2 = new uf4(0, -2);
                uf4Var2.t = 0;
                ny8 ny8Var3 = y4cVar.v;
                int i3 = y4cVar.u;
                ny8 ny8Var4 = y4cVar.x;
                uf4Var2.j = ny8Var3.d() ? ((TextView) ny8Var3.getValue()).getId() : 0;
                uf4Var2.u = ny8Var4.d() ? ((ImageView) ny8Var4.getValue()).getId() : 0;
                uf4Var2.l = 0;
                uf4Var2.setMarginStart(i3);
                ((ViewGroup.MarginLayoutParams) uf4Var2).topMargin = y4cVar.s;
                uf4Var2.setMarginEnd(i3);
                ((ViewGroup.MarginLayoutParams) uf4Var2).bottomMargin = gm0.K(26.0f * yl5.d().getDisplayMetrics().density);
                textViewE2.setLayoutParams(uf4Var2);
                textViewE2.setMaxLines(2);
                textViewE2.setEllipsize(TextUtils.TruncateAt.END);
                a8gVar.h(textViewE2);
                textViewE2.setTextColor(tre.I0(-1, 0.7f));
                q9i.a(q9i.i, textViewE2);
                return textViewE2;
            case 2:
                return y4c.u(y4cVar, context);
            case 3:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.oneme_middle_banner_image_container);
                uf4 uf4Var3 = new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 60.0f), gm0.K(60.0f * yl5.d().getDisplayMetrics().density));
                uf4Var3.i = 0;
                uf4Var3.v = 0;
                uf4Var3.l = 0;
                uf4Var3.setMarginEnd(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
                frameLayout.setLayoutParams(uf4Var3);
                frameLayout.setBackground(y4cVar.z);
                return frameLayout;
            default:
                Drawable drawableMutate = y4cVar.getContext().getDrawable(R.drawable.icon_chevron_right).mutate();
                drawableMutate.setTint(c0a.h(a8gVar, context).b);
                return drawableMutate;
        }
    }

    public /* synthetic */ w4c(Context context, y4c y4cVar, int i) {
        this.a = i;
        this.b = context;
        this.c = y4cVar;
    }
}
