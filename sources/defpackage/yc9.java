package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import java.util.ArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yc9 extends ViewGroup {
    public final int a;
    public final int b;
    public final int c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;

    public yc9(Context context) {
        super(context);
        this.a = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        this.b = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        this.c = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        TextView textView = new TextView(context);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        n1g.N(new f7(3, null, 29), textView);
        q9i.a(q9i.g, textView);
        this.d = textView;
        TextView textView2 = new TextView(context);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        n1g.N(new f7(3, null, 27), textView2);
        noh nohVar = q9i.i;
        q9i.a(nohVar, textView2);
        this.e = textView2;
        TextView textView3 = new TextView(context);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        n1g.N(new xc9(3, null, 0), textView3);
        q9i.a(nohVar, textView3);
        this.f = textView3;
        TextView textView4 = new TextView(context);
        textView4.setMaxLines(1);
        textView4.setEllipsize(truncateAt);
        n1g.N(new f7(3, null, 28), textView4);
        q9i.a(q9i.f, textView4);
        textView4.setCompoundDrawablePadding(iK);
        textView4.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        Drawable drawable = context.getDrawable(R.drawable.icon_external_link);
        ArrayList arrayList = soh.a;
        textView4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        textView4.setGravity(16);
        this.g = textView4;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-1, -2));
        addView(textView3, new ViewGroup.LayoutParams(-1, -2));
        addView(textView4, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        n1g.N(new ud9(3, (lq4) null, 26), this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.d;
        int i5 = this.a;
        int i6 = this.c;
        qyj.M(textView, i5, i6, 0, 12);
        int iE = c0a.e(2.0f, yl5.d().getDisplayMetrics().density, textView.getMeasuredHeight(), i6);
        TextView textView2 = this.e;
        qyj.M(textView2, i5, iE, 0, 12);
        qyj.M(this.f, i5, c0a.e(2.0f, yl5.d().getDisplayMetrics().density, textView2.getMeasuredHeight(), iE), 0, 12);
        int measuredWidth = getMeasuredWidth() - i5;
        TextView textView3 = this.g;
        qyj.M(textView3, measuredWidth - textView3.getMeasuredWidth(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = size - (this.a * 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        TextView textView = this.g;
        textView.measure(iMakeMeasureSpec, i2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((i3 - textView.getMeasuredWidth()) - this.b, Integer.MIN_VALUE);
        TextView textView2 = this.d;
        textView2.measure(iMakeMeasureSpec2, i2);
        TextView textView3 = this.e;
        textView3.measure(iMakeMeasureSpec2, i2);
        TextView textView4 = this.f;
        textView4.measure(iMakeMeasureSpec2, i2);
        setMeasuredDimension(size, Math.max(gm0.K(96.0f * yl5.d().getDisplayMetrics().density), gm0.K(32.0f * yl5.d().getDisplayMetrics().density) + textView4.getMeasuredHeight() + zo5.b(2.0f, yl5.d().getDisplayMetrics().density, textView3.getMeasuredHeight() + zo5.b(2.0f, yl5.d().getDisplayMetrics().density, textView2.getMeasuredHeight() + this.c))));
    }
}
