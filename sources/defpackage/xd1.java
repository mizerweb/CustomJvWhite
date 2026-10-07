package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xd1 extends LinearLayout {
    public static final /* synthetic */ zv8[] f;
    public final int a;
    public final int b;
    public final TextView c;
    public final zb d;
    public final yd1 e;

    static {
        z8b z8bVar = new z8b(xd1.class, "pullViewMovementParams", "getPullViewMovementParams$calls_ui()Lone/me/calls/ui/view/CallChangeModeHintView$MovementParams;");
        zfe.a.getClass();
        f = new zv8[]{z8bVar};
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
    public xd1(Context context) {
        super(context, null);
        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        this.a = iK;
        this.b = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setText(np4.q(context, R.string.call_change_mode_text_hint));
        textView.setGravity(17);
        textView.setTextColor(pq3.j.l(textView).b.getText().d);
        q9i.a(q9i.i, textView);
        this.c = textView;
        this.d = new zb(wd1.d, 4, this);
        yd1 yd1Var = new yd1(context, 0);
        long j = getPullViewMovementParams$calls_ui().a;
        yd1Var.setLayoutParams(new LinearLayout.LayoutParams((int) (j >> 32), (int) (j & 4294967295L)));
        yd1Var.setPadding(iK, iK, iK, iK);
        this.e = yd1Var;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(17);
        addView(textView);
        addView(yd1Var);
    }

    public final void a(float f2) {
        long j = getPullViewMovementParams$calls_ui().a;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        long j2 = getPullViewMovementParams$calls_ui().b;
        int i3 = this.a;
        int iK = gm0.K(((this.b - i3) * f2) + i3);
        float f3 = ((((int) (j2 >> 32)) - i) * f2) + i;
        float f4 = ((((int) (4294967295L & j2)) - i2) * f2) + i2;
        yd1 yd1Var = this.e;
        int iOrdinal = ((vd1) yd1Var.b).ordinal();
        if (iOrdinal == 0) {
            setPadding(iK, iK, iK, iK);
        } else if (iOrdinal == 1) {
            yd1Var.setPadding(gm0.K(0.0f * yl5.d().getDisplayMetrics().density), iK, iK, iK);
        } else {
            if (iOrdinal != 2) {
                ore.o();
                return;
            }
            yd1Var.setPadding(iK, iK, gm0.K(0.0f * yl5.d().getDisplayMetrics().density), iK);
        }
        ViewGroup.LayoutParams layoutParams = yd1Var.getLayoutParams();
        if (layoutParams == null) {
            p51.d();
            return;
        }
        layoutParams.width = gm0.K(f3);
        layoutParams.height = gm0.K(f4);
        yd1Var.setLayoutParams(layoutParams);
        float f5 = f2 * 3.0f;
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        this.c.setAlpha(f5);
    }

    public final wd1 getPullViewMovementParams$calls_ui() {
        zv8 zv8Var = f[0];
        return (wd1) this.d.b;
    }

    public final void setHintTextVisibility(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public final void setPullViewMovementParams$calls_ui(wd1 wd1Var) {
        this.d.B(this, f[0], wd1Var);
    }
}
