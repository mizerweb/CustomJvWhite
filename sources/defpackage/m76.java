package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes3.dex */
public final class m76 extends jj {
    public final View l;
    public final Rect m;
    public int n;
    public int o;
    public int p;
    public boolean q;

    public m76(ScrollView scrollView, View view) {
        super(scrollView, new oi8(0, 0, 0, null, 15), null, 56);
        this.l = view;
        this.m = new Rect();
    }

    @Override // defpackage.jj
    public final void h(ixj ixjVar, wze wzeVar) {
        exj exjVar = ixjVar.a;
        int i = exjVar.f(8).d;
        int i2 = exjVar.f(519).d;
        boolean z = i == 0;
        int i3 = ((mi8) wzeVar.c).d;
        this.p = i3;
        Rect rect = this.m;
        this.o = Math.abs(((this.a.getHeight() + ((z ? (rect.bottom + i2) - i3 : (rect.bottom + i3) - i2) - rect.top)) / 2) - this.n);
    }

    @Override // defpackage.jj
    public final ixj i(ixj ixjVar) {
        exj exjVar = ixjVar.a;
        if (this.q) {
            return ixjVar;
        }
        mi8 mi8VarF = exjVar.f(this.j);
        mi8 mi8VarF2 = exjVar.f(this.d);
        int i = mi8VarF2.d;
        mi8 mi8VarB = mi8.b(mi8VarF.a - mi8VarF2.a, mi8VarF.b - mi8VarF2.b, mi8VarF.c - mi8VarF2.c, mi8VarF.d - i);
        this.a.setTranslationY((mi8.b(Math.max(mi8VarB.a, 0), Math.max(mi8VarB.b, 0), Math.max(mi8VarB.c, 0), Math.max(mi8VarB.d, 0)).d / (this.p - i)) * this.o);
        return ixjVar;
    }

    @Override // defpackage.jj
    public final void j() {
        this.a.setTranslationY(0.0f);
        this.q = false;
    }

    @Override // defpackage.jj
    public final void k() {
        this.l.getGlobalVisibleRect(this.m);
        this.n = this.a.getBottom();
    }
}
