package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class uxb extends ViewGroup {
    public final GradientDrawable a;
    public final ny8 b;
    public final TextView c;

    public uxb(Context context) {
        super(context);
        GradientDrawable gradientDrawableT = qyj.T(-1, -1, bc1.k(1.0f, yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        this.a = gradientDrawableT;
        this.b = rx8.P(3, new vx9(context, 15, this));
        TextView textView = new TextView(context);
        q9i.a(q9i.q, textView);
        textView.setGravity(17);
        this.c = textView;
        setOutlineProvider(new nt4(gm0.K(12.0f * yl5.d().getDisplayMetrics().density)));
        setClipToOutline(true);
        setBackground(gradientDrawableT);
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
    }

    private final q9c getAvatarStack() {
        return (q9c) this.b.getValue();
    }

    public final void a(xac xacVar) {
        this.c.setTextColor(xacVar.b.l);
        int i = xacVar.a.e;
        GradientDrawable gradientDrawable = this.a;
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(gm0.K(1.0f * yl5.d().getDisplayMetrics().density), xacVar.d.e);
        getBackground().invalidateSelf();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iB;
        TextView textView = this.c;
        int measuredWidth = textView.getMeasuredWidth();
        ny8 ny8Var = this.b;
        if (n7j.o(ny8Var)) {
            iB = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, getAvatarStack().getMeasuredWidth());
        } else {
            iB = 0;
        }
        int measuredWidth2 = (getMeasuredWidth() / 2) - ((measuredWidth + iB) / 2);
        if (n7j.o(ny8Var)) {
            qyj.M((q9c) ny8Var.getValue(), measuredWidth2, (getMeasuredHeight() / 2) - (getAvatarStack().getMeasuredHeight() / 2), 0, 12);
            measuredWidth2 = c0a.e(8.0f, yl5.d().getDisplayMetrics().density, getAvatarStack().getMeasuredWidth(), measuredWidth2);
        }
        qyj.M(textView, measuredWidth2, (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        if (n7j.o(this.b)) {
            getAvatarStack().measure(iMakeMeasureSpec, i2);
        }
        this.c.measure(iMakeMeasureSpec, i2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), qv1.a(40.0f, yl5.d().getDisplayMetrics().density, 1073741824));
    }

    public final void setAvatars(List<ylc> list) {
        if (!list.isEmpty()) {
            getAvatarStack().setVisibility(0);
            getAvatarStack().setAvatars(list);
        } else {
            ny8 ny8Var = this.b;
            if (n7j.o(ny8Var)) {
                ((q9c) ny8Var.getValue()).setVisibility(8);
            }
        }
    }

    public final void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
