package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class l9d extends ViewGroup implements eph {
    public final ny8 a;
    public final TextView b;
    public final ny8 c;
    public final int d;
    public final int e;

    public l9d(Context context, noh nohVar) {
        super(context);
        this.a = rx8.P(3, new k9d(context, 0, this));
        TextView textView = new TextView(context);
        q9i.a(nohVar, textView);
        textView.setSingleLine(true);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        this.b = textView;
        this.c = rx8.P(3, new a8d(1, this));
        this.d = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        this.e = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
    }

    private final ImageView getIconView() {
        return (ImageView) this.a.getValue();
    }

    private final ShapeDrawable getWinnerBackgroundDrawable() {
        return (ShapeDrawable) this.c.getValue();
    }

    private static /* synthetic */ void getWinnerBackgroundDrawable$annotations() {
    }

    public final void a(CharSequence charSequence, boolean z) {
        if (z) {
            yab.d(this, getIconView(), new ViewGroup.LayoutParams(-2, -2));
            setBackground(getWinnerBackgroundDrawable());
            getIconView().setVisibility(0);
        } else {
            setBackground(null);
            ny8 ny8Var = this.a;
            if (ny8Var.d()) {
                ((ImageView) ny8Var.getValue()).setVisibility(8);
            }
        }
        this.b.setText(charSequence);
        onThemeChanged(pq3.j.h(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zO = n7j.o(this.a);
        int measuredWidth = this.d;
        if (zO) {
            qyj.M(getIconView(), measuredWidth, (getMeasuredHeight() / 2) - (getIconView().getMeasuredHeight() / 2), 0, 12);
            measuredWidth += getIconView().getMeasuredWidth() + this.e;
        }
        int measuredHeight = getMeasuredHeight() / 2;
        TextView textView = this.b;
        qyj.M(textView, measuredWidth, measuredHeight - (textView.getMeasuredHeight() / 2), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth = this.d * 2;
        if (n7j.o(this.a)) {
            int iA = qv1.a(12.0f, yl5.d().getDisplayMetrics().density, 1073741824);
            getIconView().measure(iA, iA);
            measuredWidth += getIconView().getMeasuredWidth() + this.e;
        }
        TextView textView = this.b;
        textView.measure(i, i2);
        setMeasuredDimension(textView.getMeasuredWidth() + measuredWidth, View.MeasureSpec.getSize(i2));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        boolean zO = n7j.o(this.a);
        TextView textView = this.b;
        if (!zO) {
            textView.setTextColor(kbcVar.getText().c);
            return;
        }
        ImageView iconView = getIconView();
        pq3.j.h(this);
        iconView.setImageTintList(ColorStateList.valueOf(-1));
        textView.setTextColor(-1);
        sb8.m0(kbcVar.getIcon().h, getWinnerBackgroundDrawable());
    }
}
