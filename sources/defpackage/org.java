package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class org extends ViewGroup {
    public final int a;
    public final int b;
    public final fsg c;
    public final int d;
    public final t66 e;
    public List f;
    public int g;
    public boolean h;
    public boolean i;
    public float j;
    public af7 k;

    public org(int i, int i2, Context context) {
        super(context);
        this.a = i;
        this.b = i2;
        fsg fsgVar = new fsg(context, i);
        fsgVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.c = fsgVar;
        int iK = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        this.d = iK;
        t66 t66Var = new t66(context);
        t66Var.setLayoutParams(new ViewGroup.LayoutParams(iK, iK));
        t66Var.setVisibility(8);
        t66Var.setOnClickListener(new ze3(5, this));
        this.e = t66Var;
        this.f = r66.a;
        this.h = true;
        addView(fsgVar);
        addView(t66Var);
        setClipChildren(false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(List list, boolean z) {
        fsg fsgVar = this.c;
        fsgVar.getClass();
        fsgVar.p = Math.min(3, list.size());
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            osg osgVar = (osg) obj;
            View childAt = fsgVar.getChildAt(i);
            esg esgVar = childAt instanceof esg ? (esg) childAt : null;
            if (esgVar == null) {
                esgVar = new esg(fsgVar.getContext());
                fsgVar.addView(esgVar);
            }
            esgVar.setModel(osgVar);
            i = i2;
        }
        if (z && fsgVar.getChildCount() > list.size()) {
            fsgVar.removeViews(list.size(), fsgVar.getChildCount() - list.size());
        }
        setProgress(this.j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        qyj.M(this.c, 0, 0, 0, 12);
        qyj.M(this.e, 0, ((this.a - this.d) - gm0.K(16.0f * yl5.d().getDisplayMetrics().density)) / 2, 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        fsg fsgVar = this.c;
        fsgVar.measure(i, i2);
        int i3 = this.d;
        this.e.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(fsgVar.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.a, 1073741824));
    }

    public final void setOnCollapsedClickListener(af7 af7Var) {
        this.k = af7Var;
        this.c.setOnCollapsedClickListener(af7Var);
    }

    public final void setProgress(float f) {
        this.j = f;
        int i = this.a;
        if (i == 0) {
            return;
        }
        float fU = this.h ? 1.0f : oc9.u(1.0f - (f / 0.2f), 0.0f, 1.0f);
        if (f <= 0.0f) {
            fU = 0.0f;
        }
        setAlpha(fU);
        boolean z = this.i;
        t66 t66Var = this.e;
        fsg fsgVar = this.c;
        if (z) {
            fsgVar.setAlpha(oc9.u(1.0f - (f / 0.8f), 0.0f, 1.0f));
            t66Var.setAlpha(oc9.u((f - 0.8f) / 0.19999999f, 0.0f, 1.0f));
        } else {
            fsgVar.setAlpha(1.0f);
            t66Var.setAlpha(0.0f);
        }
        fsgVar.setProgress(f);
        fsgVar.setPivotX(0.0f);
        fsgVar.setPivotY(i / 2.0f);
        float f2 = (((this.b - i) * f) + i) / i;
        fsgVar.setScaleX(f2);
        fsgVar.setScaleY(f2);
        postInvalidateOnAnimation();
    }
}
