package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zci extends tee implements eph {
    public final qpa a;
    public final k96 b;
    public long c;
    public FrameLayout f;
    public int g;
    public final v56 d = new v56(9, (byte) 0);
    public final Rect e = new Rect();
    public bx5 h = bx5.b;

    public zci(qpa qpaVar, k96 k96Var) {
        this.a = qpaVar;
        this.b = k96Var;
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        super.f(rect, view, recyclerView, hfeVar);
        int iP = RecyclerView.P(view);
        v56 v56Var = this.d;
        if (iP >= 0) {
            qpa qpaVar = this.a;
            if (iP < qpaVar.d.f.size()) {
                long j = this.c;
                if (j != 0) {
                    int iO = qpaVar.O(j);
                    MessageModel messageModelQ = qpaVar.Q(iO);
                    Long lValueOf = messageModelQ != null ? Long.valueOf(messageModelQ.c) : null;
                    if (iO == iP && (lValueOf == null || lValueOf.longValue() != j)) {
                        rect.top = i().getMeasuredHeight() + rect.top;
                    }
                }
                v56Var.J(rect, view, recyclerView);
                return;
            }
        }
        v56Var.J(rect, view, recyclerView);
    }

    @Override // defpackage.tee
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int iO;
        MessageModel messageModelQ;
        if (recyclerView.getChildCount() <= 0) {
            return;
        }
        qpa qpaVar = this.a;
        if (qpaVar.l() <= 0) {
            return;
        }
        long j = this.c;
        if (j == 0 || (iO = qpaVar.O(j)) == -1) {
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                ore.i();
                return;
            }
            int iP = RecyclerView.P(childAt);
            if (iP == iO && (messageModelQ = qpaVar.Q(iP)) != null && messageModelQ.c != this.c) {
                ViewGroup viewGroupI = i();
                v56 v56Var = this.d;
                Rect rect = this.e;
                v56Var.E(rect, childAt, iP);
                int i3 = rect.top;
                ViewGroup.LayoutParams layoutParams = viewGroupI.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i4 = ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) / 2) + i3;
                canvas.save();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroupI.getLayoutParams();
                int i5 = marginLayoutParams2.leftMargin;
                yab.j0(i5, marginLayoutParams2.topMargin, (viewGroupI.getMeasuredWidth() + i5) - marginLayoutParams2.rightMargin, (viewGroupI.getMeasuredHeight() + marginLayoutParams2.topMargin) - marginLayoutParams2.bottomMargin, viewGroupI, this.b);
                canvas.translate(0.0f, i4);
                viewGroupI.draw(canvas);
                canvas.restore();
            }
            i = i2;
        }
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
    public final ViewGroup i() {
        FrameLayout frameLayout;
        k96 k96Var = this.b;
        int measuredWidth = k96Var.getMeasuredWidth();
        if (this.f == null || this.g != measuredWidth) {
            int measuredWidth2 = k96Var.getMeasuredWidth();
            int measuredHeight = k96Var.getMeasuredHeight();
            if (measuredWidth2 == 0 || measuredHeight == 0) {
                frameLayout = new FrameLayout(k96Var.getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
            } else {
                frameLayout = new FrameLayout(k96Var.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                int iK = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
                layoutParams.topMargin = iK;
                layoutParams.bottomMargin = iK;
                frameLayout.setLayoutParams(layoutParams);
                GradientDrawable gradientDrawable = new GradientDrawable();
                a8g a8gVar = pq3.j;
                gradientDrawable.setColors(((pac) ((qg7) a8gVar.h(frameLayout).t().d).c).a);
                frameLayout.setBackground(gradientDrawable);
                TextView textView = new TextView(k96Var.getContext());
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 17);
                int iK2 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                layoutParams2.topMargin = iK2;
                layoutParams2.bottomMargin = iK2;
                textView.setLayoutParams(layoutParams2);
                textView.setTextAlignment(4);
                textView.setTextColor(a8gVar.h(textView).getText().b);
                textView.setText(textView.getContext().getString(R.string.chat_screen_new_messages_decor_title));
                q9i.t.h().b(textView, this.h);
                frameLayout.addView(textView);
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), ViewGroup.getChildMeasureSpec(k96Var.getMeasuredHeight(), 0, frameLayout.getLayoutParams().height));
            }
            this.f = frameLayout;
            this.g = measuredWidth;
        }
        FrameLayout frameLayout2 = this.f;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        ore.p("Required value was null.");
        return null;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            if (frameLayout.getChildCount() <= 0) {
                frameLayout = null;
            }
            if (frameLayout != null) {
                Drawable background = frameLayout.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColors(((pac) ((qg7) kbcVar.t().d).c).a);
                }
                View childAt = frameLayout.getChildAt(0);
                TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
                if (textView != null) {
                    textView.setTextColor(kbcVar.getText().b);
                }
            }
        }
    }
}
