package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class t38 extends ViewGroup implements eph {
    public final int a;
    public final cyb b;
    public final TextView c;

    public t38(Context context) {
        super(context, null);
        this.a = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        cyb cybVar = new cyb(context);
        cybVar.setSize(ayb.h);
        cybVar.setAppearance(zxb.SECONDARY);
        this.b = cybVar;
        TextView textView = new TextView(context);
        a8g a8gVar = pq3.j;
        a8gVar.h(textView);
        textView.setTextColor(-1);
        textView.setGravity(17);
        q9i.a(q9i.s, textView);
        this.c = textView;
        addView(cybVar);
        addView(textView);
        setBackground(col.c(((bs0) a8gVar.h(this).u().c.g).c, null, null, 6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart;
        int paddingTop = getPaddingTop();
        TextView textView = this.c;
        int measuredWidth = textView.getMeasuredWidth();
        cyb cybVar = this.b;
        if (measuredWidth > cybVar.getMeasuredWidth()) {
            paddingStart = ((textView.getMeasuredWidth() / 2) - (cybVar.getMeasuredWidth() / 2)) + getPaddingStart();
        } else {
            paddingStart = getPaddingStart();
        }
        cybVar.layout(paddingStart, paddingTop, cybVar.getMeasuredWidth() + paddingStart, cybVar.getMeasuredHeight() + paddingTop);
        int paddingStart2 = textView.getMeasuredWidth() > cybVar.getMeasuredWidth() ? getPaddingStart() : getPaddingStart() + ((cybVar.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2));
        int bottom = cybVar.getBottom() + paddingTop + this.a;
        textView.layout(paddingStart2, bottom, textView.getMeasuredWidth() + paddingStart2, textView.getMeasuredHeight() + bottom);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        cyb cybVar = this.b;
        cybVar.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMakeMeasureSpec3 = View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.makeMeasureSpec(size, 1073741824) : View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        TextView textView = this.c;
        textView.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        setMeasuredDimension(getPaddingEnd() + getPaddingStart() + Math.max(cybVar.getMeasuredWidth(), textView.getMeasuredWidth()), getPaddingBottom() + getPaddingTop() + textView.getMeasuredHeight() + cybVar.getMeasuredHeight() + this.a);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.b.e();
        a8g a8gVar = pq3.j;
        a8gVar.h(this);
        this.c.setTextColor(-1);
        setBackground(col.c(((bs0) a8gVar.h(this).u().c.g).c, null, null, 6));
    }

    public final void setIcon(int i) {
        this.b.setIconResource(i);
    }

    public final void setLabel(int i) {
        this.c.setText(i);
    }
}
