package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class k6h extends ViewGroup implements eph {
    public final kwb a;
    public final TextView b;
    public final TextView c;

    public k6h(Context context) {
        super(context);
        kwb kwbVar = new kwb(context);
        kwb.y(kwbVar, kwbVar.getContext().getDrawable(R.drawable.icon_megaphone_add).mutate(), awb.a, new nre(9), new nre(10), 4);
        this.a = kwbVar;
        TextView textView = new TextView(context);
        textView.setText(R.string.chat_list_chat_suggest_stub_title);
        q9i.a(q9i.f, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().b);
        this.b = textView;
        TextView textView2 = new TextView(context);
        q9i.a(q9i.i, textView2);
        int i = a8gVar.h(textView2).getIcon().d;
        Drawable drawableMutate = textView2.getContext().getDrawable(R.drawable.icon_arrow_down_mini).mutate();
        sb8.m0(i, drawableMutate);
        ArrayList arrayList = soh.a;
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate, (Drawable) null);
        textView2.setCompoundDrawablePadding(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        textView2.setText(R.string.chat_list_chat_suggest_stub_subtitle);
        textView2.setTextColor(a8gVar.h(textView2).getText().d);
        this.c = textView2;
        addView(kwbVar);
        addView(textView);
        addView(textView2);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int measuredHeight = getMeasuredHeight() / 2;
        kwb kwbVar = this.a;
        qyj.M(kwbVar, paddingStart, measuredHeight - (kwbVar.getMeasuredHeight() / 2), 0, 12);
        int iB = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, kwbVar.getRight());
        int measuredHeight2 = (getMeasuredHeight() / 2) - (gm0.K(yl5.d().getDisplayMetrics().density * 2.0f) / 2);
        TextView textView = this.b;
        qyj.M(textView, iB, measuredHeight2 - textView.getMeasuredHeight(), 0, 12);
        qyj.M(this.c, zo5.b(12.0f, yl5.d().getDisplayMetrics().density, kwbVar.getRight()), zo5.b(2.0f, yl5.d().getDisplayMetrics().density, textView.getBottom()), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        int iA = qv1.a(54.0f, yl5.d().getDisplayMetrics().density, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm0.K(54.0f * yl5.d().getDisplayMetrics().density), 1073741824);
        kwb kwbVar = this.a;
        kwbVar.measure(iA, iMakeMeasureSpec);
        int iB = qv1.b(12.0f, yl5.d().getDisplayMetrics().density, kwbVar.getMeasuredWidth(), paddingStart);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iB, Integer.MIN_VALUE);
        TextView textView = this.b;
        textView.measure(iMakeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(textView.getLineHeight(), 1073741824));
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iB, Integer.MIN_VALUE);
        TextView textView2 = this.c;
        textView2.measure(iMakeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(textView2.getLineHeight(), 1073741824));
        setMeasuredDimension(size, Math.max(textView2.getMeasuredHeight() + zo5.b(2.0f, yl5.d().getDisplayMetrics().density, textView.getMeasuredHeight() + getPaddingBottom() + getPaddingTop()), gm0.K(82.0f * yl5.d().getDisplayMetrics().density)));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.b.setTextColor(kbcVar.getText().b);
        int i = kbcVar.getText().d;
        TextView textView = this.c;
        textView.setTextColor(i);
        int i2 = kbcVar.getIcon().d;
        ArrayList arrayList = soh.a;
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(i2));
        this.a.onThemeChanged(kbcVar);
    }
}
