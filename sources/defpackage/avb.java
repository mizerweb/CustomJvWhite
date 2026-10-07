package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class avb extends ViewGroup {
    public final /* synthetic */ bvb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avb(bvb bvbVar, Context context) {
        super(context);
        this.a = bvbVar;
        setElevation(yl5.d().getDisplayMetrics().density * 7.0f);
        setBackground(bvbVar.c);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) + (bvbVar.a == tub.a ? gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) : 0), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(10.0f * yl5.d().getDisplayMetrics().density) + (bvbVar.a == tub.b ? gm0.K(8.0f * yl5.d().getDisplayMetrics().density) : 0));
        addView(bvbVar.e);
        addView(bvbVar.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        bvb bvbVar = this.a;
        TextView textView = bvbVar.e;
        qyj.M(textView, getPaddingLeft(), ((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - textView.getMeasuredHeight()) / 2) + getPaddingTop(), 0, 12);
        qyj.A(this, textView, getPaddingLeft(), getPaddingTop(), 0, getPaddingBottom(), 8);
        ImageView imageView = bvbVar.d;
        qyj.M(imageView, zo5.b(10.0f, yl5.d().getDisplayMetrics().density, yab.J(textView)), ((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - imageView.getMeasuredHeight()) / 2) + getPaddingTop(), 0, 12);
        qyj.z(gm0.K(10.0f * yl5.d().getDisplayMetrics().density), getPaddingTop(), getPaddingRight(), getPaddingBottom(), this, imageView);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        bvb bvbVar = this.a;
        ImageView imageView = bvbVar.d;
        TextView textView = bvbVar.e;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int iB = zo5.b(10.0f, yl5.d().getDisplayMetrics().density, gm0.K(yl5.d().getDisplayMetrics().density * 20.0f));
        int iK = (gm0.K(yl5.d().getDisplayMetrics().density * 240.0f) - paddingRight) - iB;
        if (iK < 0) {
            iK = 0;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(iK, Integer.MIN_VALUE), i2);
        imageView.measure(qv1.a(20.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(20.0f * yl5.d().getDisplayMetrics().density), 1073741824));
        setMeasuredDimension(oc9.v(textView.getMeasuredWidth() + paddingRight + iB, gm0.K(61.0f * yl5.d().getDisplayMetrics().density), gm0.K(240.0f * yl5.d().getDisplayMetrics().density)), getPaddingBottom() + getPaddingTop() + Math.max(textView.getMeasuredHeight(), imageView.getMeasuredHeight()));
    }
}
