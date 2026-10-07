package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class ovh extends pee {
    public final /* synthetic */ pvh a;
    public final /* synthetic */ RecyclerView b;

    public ovh(pvh pvhVar, RecyclerView recyclerView) {
        this.a = pvhVar;
        this.b = recyclerView;
    }

    @Override // defpackage.pee
    public final void d(int i, int i2) {
        if (i == 0) {
            pvh.d(this.a, this.b);
        }
    }

    @Override // defpackage.pee
    public final void e(int i, int i2) {
        if (i == 0 || i2 == 0) {
            pvh.d(this.a, this.b);
        }
    }

    @Override // defpackage.pee
    public final void f(int i, int i2) {
        if (i == 0) {
            pvh.d(this.a, this.b);
        }
    }
}
