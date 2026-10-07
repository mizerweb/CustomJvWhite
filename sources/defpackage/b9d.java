package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class b9d extends ViewGroup implements eph {
    public final TextView a;
    public final l9d b;

    public b9d(Context context) {
        super(context);
        TextView textView = new TextView(context);
        q9i.a(q9i.f, textView);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        this.a = textView;
        l9d l9dVar = new l9d(context, q9i.g);
        this.b = l9dVar;
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(l9dVar, new ViewGroup.LayoutParams(-2, -2));
        onThemeChanged(pq3.j.h(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int measuredHeight = getMeasuredHeight() / 2;
        TextView textView = this.a;
        qyj.M(textView, iK, measuredHeight - (textView.getMeasuredHeight() / 2), 0, 12);
        int measuredWidth = getMeasuredWidth();
        l9d l9dVar = this.b;
        qyj.M(l9dVar, zo5.D(6.0f, yl5.d().getDisplayMetrics().density, measuredWidth - l9dVar.getMeasuredWidth()), (getMeasuredHeight() / 2) - (l9dVar.getMeasuredHeight() / 2), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iD = zo5.D(12.0f, yl5.d().getDisplayMetrics().density, View.MeasureSpec.getSize(i));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm0.K(20.0f * yl5.d().getDisplayMetrics().density), 1073741824);
        l9d l9dVar = this.b;
        l9dVar.measure(i, iMakeMeasureSpec);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(qv1.b(6.0f, yl5.d().getDisplayMetrics().density, zo5.b(12.0f, yl5.d().getDisplayMetrics().density, l9dVar.getMeasuredWidth()), iD), 1073741824), i2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(iD, 1073741824), qv1.a(56.0f, yl5.d().getDisplayMetrics().density, 1073741824));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setTextColor(kbcVar.getText().b);
        this.b.onThemeChanged(kbcVar);
    }

    public final void setAnswerText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
