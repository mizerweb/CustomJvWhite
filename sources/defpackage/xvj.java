package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class xvj extends ViewGroup implements eph {
    public final t58 a;
    public final TextView b;
    public final TextView c;
    public final ng8 d;
    public final eeh e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public ewj l;

    public xvj(Context context) {
        super(context, null);
        t58 t58Var = new t58(context);
        t58Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.a = t58Var;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setGravity(1);
        textView.setVisibility(0);
        this.b = textView;
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView2.setGravity(1);
        if (h59.a == null) {
            h59.a = new h59();
        }
        textView2.setMovementMethod(h59.a);
        q9i.a(q9i.i, textView2);
        this.c = textView2;
        ng8 ng8Var = new ng8(context);
        ng8Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.d = ng8Var;
        deh dehVar = new deh(4);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 40.0f);
        int iK2 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        dehVar.d = iK;
        dehVar.e = iK2;
        this.e = new eeh(dehVar);
        this.f = gm0.K(274.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        this.g = iK3;
        this.h = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        this.i = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        this.j = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        this.k = yl5.d().getDisplayMetrics().density * 12.0f;
        setPadding(getPaddingLeft(), iK3, getPaddingRight(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        addView(t58Var);
        addView(textView);
        addView(textView2);
        onThemeChanged(pq3.j.h(this));
    }

    public final void a(kbc kbcVar) {
        int i = kbcVar.getText().d;
        TextView textView = this.c;
        textView.setTextColor(i);
        CharSequence text = textView.getText();
        int length = text.length();
        Object[] spans = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                spans = spanned.getSpans(0, length, k59.class);
            }
        } catch (Throwable unused) {
        }
        k59[] k59VarArr = (k59[]) spans;
        if (k59VarArr != null) {
            for (k59 k59Var : k59VarArr) {
                k59Var.a = ((xac) kbcVar.f().a).b.l;
                k59Var.b = pq3.j.e(getContext()).n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        ewj ewjVar = this.l;
        if (ewjVar == null) {
            return;
        }
        ArrayList arrayList = ewjVar.b;
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() / 2;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            awj awjVar = (awj) arrayList.get(i5);
            if (awjVar instanceof bwj) {
                ng8 ng8Var = this.d;
                int measuredWidth2 = measuredWidth - (ng8Var.getMeasuredWidth() / 2);
                paddingTop += this.g;
                qyj.M(ng8Var, measuredWidth2, paddingTop, 0, 12);
            } else {
                if (awjVar instanceof cwj) {
                    t58 t58Var = this.a;
                    qyj.M(t58Var, measuredWidth - (t58Var.getMeasuredWidth() / 2), paddingTop, 0, 12);
                    measuredHeight = t58Var.getMeasuredHeight() + this.h;
                } else {
                    if (!(awjVar instanceof dwj)) {
                        ore.o();
                        return;
                    }
                    if (((dwj) awjVar).c) {
                        TextView textView = this.c;
                        int measuredWidth3 = measuredWidth - (textView.getMeasuredWidth() / 2);
                        paddingTop += this.j;
                        qyj.M(textView, measuredWidth3, paddingTop, 0, 12);
                        measuredHeight = textView.getMeasuredHeight();
                    } else {
                        TextView textView2 = this.b;
                        qyj.M(textView2, measuredWidth - (textView2.getMeasuredWidth() / 2), paddingTop, 0, 12);
                        measuredHeight = textView2.getMeasuredHeight();
                    }
                }
                paddingTop = measuredHeight + paddingTop;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredHeight2;
        int i3;
        ewj ewjVar = this.l;
        if (ewjVar == null) {
            super.onMeasure(i, i2);
            return;
        }
        ArrayList arrayList = ewjVar.b;
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            int i5 = this.f;
            if (i4 >= size) {
                setMeasuredDimension(i5, paddingBottom);
                return;
            }
            awj awjVar = (awj) arrayList.get(i4);
            boolean z = awjVar instanceof bwj;
            int i6 = this.g;
            if (z) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5 - (this.i * 2), 1073741824);
                ng8 ng8Var = this.d;
                ng8Var.measure(iMakeMeasureSpec, i2);
                measuredHeight = ng8Var.getMeasuredHeight() + i6;
            } else {
                if (awjVar instanceof cwj) {
                    Size size2 = ((cwj) awjVar).a;
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5 - (i6 * 2), gm0.K(size2.getWidth() * yl5.d().getDisplayMetrics().density)), 1073741824);
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(gm0.K(size2.getHeight() * yl5.d().getDisplayMetrics().density), 1073741824);
                    t58 t58Var = this.a;
                    t58Var.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                    measuredHeight2 = t58Var.getMeasuredHeight();
                    i3 = this.h;
                } else {
                    if (!(awjVar instanceof dwj)) {
                        ore.o();
                        return;
                    }
                    if (((dwj) awjVar).c) {
                        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i5 - (i6 * 2), Integer.MIN_VALUE);
                        TextView textView = this.c;
                        textView.measure(iMakeMeasureSpec4, i2);
                        measuredHeight2 = textView.getMeasuredHeight();
                        i3 = this.j;
                    } else {
                        int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i5 - (i6 * 2), Integer.MIN_VALUE);
                        TextView textView2 = this.b;
                        textView2.measure(iMakeMeasureSpec5, i2);
                        measuredHeight = textView2.getMeasuredHeight();
                    }
                }
                measuredHeight = measuredHeight2 + i3;
            }
            paddingBottom = measuredHeight + paddingBottom;
            i4++;
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        t58 t58Var = this.a;
        if (t58Var.getColorFilter() != null) {
            t58Var.setColorFilter(kbcVar.getIcon().h);
        }
        this.b.setTextColor(kbcVar.getText().b);
        a(kbcVar);
    }

    public final void setKeyboardListener(mg8 mg8Var) {
        this.d.setClickListener(mg8Var);
    }
}
