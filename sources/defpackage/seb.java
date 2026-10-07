package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class seb extends LinearLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y1 y1Var = new y1(2, this);
        while (y1Var.hasNext()) {
            ((q0g) ((View) y1Var.next())).b();
        }
    }

    public final void setTabs(int i) {
        removeAllViews();
        for (int i2 = 0; i2 < i; i2++) {
            View q0gVar = new q0g(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(gm0.K(86.0f * yl5.d().getDisplayMetrics().density), gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
            marginLayoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
            marginLayoutParams.setMarginEnd(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
            q0gVar.setLayoutParams(marginLayoutParams);
            q0gVar.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 8.0f));
            q0gVar.setBackgroundColor(pq3.j.h(q0gVar).b().c);
            int i3 = 3;
            n1g.N(new vqa(i3, (lq4) null, i3), q0gVar);
            addView(q0gVar, i2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            int i2 = 0;
            while (true) {
                if (!(i2 < getChildCount())) {
                    return;
                }
                int i3 = i2 + 1;
                View childAt = getChildAt(i2);
                if (childAt == null) {
                    ore.i();
                    return;
                } else {
                    ((q0g) childAt).b.c();
                    i2 = i3;
                }
            }
        } else {
            int i4 = 0;
            while (true) {
                if (!(i4 < getChildCount())) {
                    return;
                }
                int i5 = i4 + 1;
                View childAt2 = getChildAt(i4);
                if (childAt2 == null) {
                    ore.i();
                    return;
                } else {
                    ((q0g) childAt2).b();
                    i4 = i5;
                }
            }
        }
    }
}
