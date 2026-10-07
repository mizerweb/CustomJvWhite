package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w19 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iM;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((lfe) this.k.get(i2)).a;
            wee weeVar = (wee) view3.getLayoutParams();
            if (view3 != view && !weeVar.a.s() && (iM = (weeVar.a.m() - this.d) * this.e) >= 0 && iM < i) {
                view2 = view3;
                if (iM == 0) {
                    break;
                } else {
                    i = iM;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((wee) view2.getLayoutParams()).a.m();
        }
    }

    public final View b(cfe cfeVar) {
        List list = this.k;
        if (list == null) {
            View viewD = cfeVar.d(this.d);
            this.d += this.e;
            return viewD;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((lfe) this.k.get(i)).a;
            wee weeVar = (wee) view.getLayoutParams();
            if (!weeVar.a.s() && this.d == weeVar.a.m()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
