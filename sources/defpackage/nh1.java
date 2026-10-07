package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.FrameLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nh1 extends FrameLayout {
    public final TextView a;
    public final ny8 b;

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
    public nh1(Context context) {
        super(context, null);
        this.b = rx8.P(3, new va(26));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setId(R.id.call_event_icon);
        textView.setBackground(getBackgroundView());
        textView.setMaxLines(1);
        q9i.a(q9i.i, textView);
        textView.setTextColor(pq3.j.l(textView).b.getText().b);
        textView.setGravity(17);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), textView.getPaddingTop(), gm0.K(8.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingBottom());
        l8j.a(textView);
        this.a = textView;
        addView(textView);
    }

    private final Drawable getBackgroundView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), null, null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    private final float[] getBgRadius() {
        return (float[]) this.b.getValue();
    }

    public final void setLabel(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
