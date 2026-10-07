package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class gic extends ViewGroup implements eph {
    public final axf a;
    public final l1c b;
    public final TextView c;
    public final TextView d;
    public final eeh e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public eic j;

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
    public gic(Context context) {
        super(context);
        Drawable drawableP = wk8.p(context, R.drawable.ic_media_empty_squircle);
        Drawable drawableP2 = wk8.p(context, R.drawable.icon_case_fill);
        a8g a8gVar = pq3.j;
        axf axfVar = new axf(drawableP, drawableP2, a8gVar.e(context).m(), gm0.K(28.0f * yl5.d().getDisplayMetrics().density), new fic(this, 0), new fic(this, 1));
        this.a = axfVar;
        l1c l1cVar = new l1c(context);
        l1cVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 72.0f), gm0.K(yl5.d().getDisplayMetrics().density * 72.0f)));
        wj7 wj7Var = (wj7) l1cVar.getHierarchy();
        i1f i1fVar = i1f.o;
        wj7Var.i(1, axfVar);
        wj7Var.f(1).q(i1fVar);
        wj7 wj7Var2 = (wj7) l1cVar.getHierarchy();
        wj7Var2.i(5, axfVar);
        wj7Var2.f(5).q(i1fVar);
        this.b = l1cVar;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setGravity(1);
        q9i.a(q9i.i, textView);
        textView.setText(R.string.organization_placeholder_description);
        textView.setTextColor(tre.I0(a8gVar.h(textView).getText().d, 0.44f));
        this.c = textView;
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView2.setGravity(1);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setTextColor(tre.I0(a8gVar.h(textView2).getText().b, 0.8f));
        this.d = textView2;
        deh dehVar = new deh(4);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 72.0f);
        int iK2 = gm0.K(72.0f * yl5.d().getDisplayMetrics().density);
        dehVar.d = iK;
        dehVar.e = iK2;
        this.e = new eeh(dehVar);
        this.f = gm0.K(274.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        this.g = iK3;
        this.h = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        this.i = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        ip7 ip7Var = new ip7(context);
        ip7Var.c = new float[]{0.5f, 1.0f, 0.5f, 1.0f};
        ip7Var.invalidateSelf();
        setBackground(ip7Var);
        setForeground(new b6h(context));
        setPadding(getPaddingLeft(), iK3, getPaddingRight(), iK3);
        addView(l1cVar);
        addView(textView);
        addView(textView2);
        onThemeChanged(a8gVar.h(this));
    }

    private static /* synthetic */ void getSteps$annotations() {
    }

    public final void a(kbc kbcVar) {
        int iI0 = tre.I0(kbcVar.getText().b, 0.8f);
        TextView textView = this.d;
        textView.setTextColor(iI0);
        CharSequence text = textView.getText();
        int length = text.length();
        Object[] spans = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                spans = spanned.getSpans(0, length, k59.class);
            }
        } catch (Throwable unused) {
        }
        k59[] k59VarArr = (k59[]) spans;
        if (k59VarArr != null) {
            for (k59 k59Var : k59VarArr) {
                k59Var.a = ((xac) kbcVar.f().a).b.l;
                k59Var.b = pq3.j.e(getContext()).n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        eic eicVar = this.j;
        if (eicVar == null) {
            return;
        }
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() / 2;
        l1c l1cVar = this.b;
        if (l1cVar.getVisibility() == 0) {
            qyj.M(l1cVar, measuredWidth - (l1cVar.getMeasuredWidth() / 2), paddingTop, 0, 12);
            paddingTop += l1cVar.getMeasuredHeight() + this.h;
        }
        TextView textView = this.c;
        qyj.M(textView, measuredWidth - (textView.getMeasuredWidth() / 2), paddingTop, 0, 12);
        int measuredHeight = textView.getMeasuredHeight() + paddingTop;
        CharSequence charSequence = eicVar.a;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        int i5 = measuredHeight + this.i;
        TextView textView2 = this.d;
        qyj.M(textView2, measuredWidth - (textView2.getMeasuredWidth() / 2), i5, 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        eic eicVar = this.j;
        if (eicVar == null) {
            super.onMeasure(i, i2);
            return;
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        l1c l1cVar = this.b;
        if (l1cVar.getVisibility() == 0) {
            l1cVar.measure(qv1.a(72.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(72.0f * yl5.d().getDisplayMetrics().density), 1073741824));
            paddingBottom += l1cVar.getMeasuredHeight() + this.h;
        }
        int i3 = this.g;
        int i4 = this.f;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4 - (i3 * 2), Integer.MIN_VALUE);
        TextView textView = this.c;
        textView.measure(iMakeMeasureSpec, i2);
        int measuredHeight = textView.getMeasuredHeight() + paddingBottom;
        CharSequence charSequence = eicVar.a;
        if (charSequence != null && charSequence.length() != 0) {
            int i5 = measuredHeight + this.i;
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4 - (i3 * 2), 1073741824);
            TextView textView2 = this.d;
            textView2.measure(iMakeMeasureSpec2, i2);
            measuredHeight = i5 + textView2.getMeasuredHeight();
        }
        setMeasuredDimension(i4, measuredHeight);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.onThemeChanged(kbcVar);
        this.c.setTextColor(tre.I0(kbcVar.getText().d, 0.44f));
        a(kbcVar);
        Drawable background = getBackground();
        ip7 ip7Var = background instanceof ip7 ? (ip7) background : null;
        if (ip7Var != null) {
            ip7Var.b.B(ip7Var, ip7.g[0], (int[]) ((t84) kbcVar.f().c).d);
            ip7Var.h(kbcVar);
        }
        Drawable foreground = getForeground();
        b6h b6hVar = foreground instanceof b6h ? (b6h) foreground : null;
        if (b6hVar != null) {
            b6hVar.b((int[]) ((t84) kbcVar.f().c).g);
            b6hVar.h(kbcVar);
        }
    }
}
