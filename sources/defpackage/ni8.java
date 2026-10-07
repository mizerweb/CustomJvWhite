package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ni8 extends tu3 {
    public final View c;
    public int d;
    public int e;
    public final int[] f;

    public ni8(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // defpackage.tu3
    public final void e(swj swjVar) {
        this.c.setTranslationY(0.0f);
    }

    @Override // defpackage.tu3
    public final void f(swj swjVar) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }

    @Override // defpackage.tu3
    public final ixj g(ixj ixjVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            swj swjVar = (swj) it.next();
            if ((swjVar.a.c() & 8) != 0) {
                this.c.setTranslationY(lk.c(this.e, swjVar.a.b(), 0));
                break;
            }
        }
        return ixjVar;
    }

    @Override // defpackage.tu3
    public final wze h(swj swjVar, wze wzeVar) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY(i);
        return wzeVar;
    }
}
