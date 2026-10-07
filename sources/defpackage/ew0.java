package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ew0 extends FrameLayout implements eph {
    public final dpe a;
    public final bne b;
    public final GradientDrawable c;
    public final TextView d;
    public final TextView e;
    public final t6g f;

    public ew0(Context context) {
        super(context);
        dpe dpeVar = new dpe();
        this.a = dpeVar;
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 32.0f);
        this.b = iK <= 0 ? null : new bne(iK, iK, 0.0f, 12);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 20.0f);
        this.c = gradientDrawable;
        TextView textView = new TextView(context);
        textView.setId(R.id.oneme_folder_widget_title);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        q9i.a(q9i.c, textView);
        this.d = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(R.id.oneme_folder_widget_description);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        q9i.a(q9i.i, textView2);
        this.e = textView2;
        t6g t6gVar = new t6g(context);
        t6gVar.setId(R.id.oneme_folder_widget_icon);
        t1d t1dVar = vd7.a.get();
        t1dVar.e = dpeVar;
        t1dVar.i = true;
        t6gVar.setController(t1dVar.a());
        this.f = t6gVar;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(t6gVar, new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
        addView(textView, new FrameLayout.LayoutParams(-2, -2));
        addView(textView2, new FrameLayout.LayoutParams(-2, -2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(pq3.j.h(this));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = getMeasuredHeight() / 2;
        TextView textView = this.d;
        int measuredHeight2 = textView.getMeasuredHeight();
        TextView textView2 = this.e;
        int iK = measuredHeight - ((gm0.K(yl5.d().getDisplayMetrics().density * 2.0f) + (textView2.getMeasuredHeight() + measuredHeight2)) / 2);
        qyj.M(textView, gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), iK, 0, 12);
        qyj.M(textView2, gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), c0a.e(2.0f, yl5.d().getDisplayMetrics().density, textView.getMeasuredHeight(), iK), 0, 12);
        int iD = zo5.D(24.0f, yl5.d().getDisplayMetrics().density, getMeasuredWidth());
        t6g t6gVar = this.f;
        t6gVar.layout(iD - t6gVar.getMeasuredWidth(), (getMeasuredHeight() / 2) - (t6gVar.getMeasuredHeight() / 2), zo5.D(24.0f, yl5.d().getDisplayMetrics().density, getMeasuredWidth()), (t6gVar.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iD = zo5.D(24.0f, yl5.d().getDisplayMetrics().density, zo5.D(32.0f, yl5.d().getDisplayMetrics().density, r5a.f(24.0f, yl5.d().getDisplayMetrics().density, 2, size)));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.e.measure(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f.measure(qv1.a(32.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(32.0f * yl5.d().getDisplayMetrics().density), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.d.setTextColor(kbcVar.getText().b);
        this.e.setTextColor(kbcVar.getText().c);
        int i = kbcVar.j().a;
        GradientDrawable gradientDrawable = this.c;
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(gm0.J(((double) yl5.d().getDisplayMetrics().density) * 0.5d), kbcVar.l().c);
    }
}
