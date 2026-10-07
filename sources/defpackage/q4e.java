package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q4e extends LinearLayout {
    public o4e a;
    public int b;
    public List c;

    private final void setDataList(List<p4e> list) {
        int size = list.size();
        int i = this.b;
        if (size <= i) {
            this.c = list;
            a();
            return;
        }
        this.c = ww3.N1(list, i);
        a();
        String name = q4e.class.getName();
        String strH = zo5.h(list.size(), "Buttons count out of limit. Size -> ");
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.g, name, strH, null, null, 8);
        }
    }

    private final void setMaxButtonsCount(int i) {
        if (i < 1) {
            return;
        }
        this.b = i;
        requestLayout();
    }

    public final void a() {
        if (getChildCount() < this.c.size()) {
            int size = this.c.size() - getChildCount();
            for (int i = 0; i < size; i++) {
                n4e n4eVar = new n4e(getContext());
                n4eVar.setId(View.generateViewId());
                addView(n4eVar);
            }
        }
        int i2 = 0;
        while (true) {
            if (!(i2 < getChildCount())) {
                int i3 = 0;
                for (Object obj : this.c) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    p4e p4eVar = (p4e) obj;
                    n4e n4eVar2 = (n4e) getChildAt(i3);
                    n4eVar2.setId(p4eVar.a);
                    n4eVar2.setVisibility(0);
                    n4eVar2.setSize(m4e.b);
                    n4eVar2.setEnabled(p4eVar.c);
                    n4eVar2.setImage(p4eVar.b);
                    qe7.H(n4eVar2, 300L, new aeb(this, 17, p4eVar));
                    ViewGroup.LayoutParams layoutParams = n4eVar2.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (i3 != 0) {
                        marginLayoutParams.setMarginStart(gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
                        n4eVar2.setLayoutParams(marginLayoutParams);
                    }
                    i3 = i4;
                }
                return;
            }
            int i5 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                ore.i();
                return;
            } else {
                childAt.setVisibility(8);
                i2 = i5;
            }
        }
    }

    public final void setButtonToolDataList(List<p4e> list) {
        setDataList(list);
    }

    public final void setListener(o4e o4eVar) {
        this.a = o4eVar;
    }
}
