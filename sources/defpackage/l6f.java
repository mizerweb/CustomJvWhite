package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class l6f extends pee {
    public final /* synthetic */ m6f a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ nee c;

    public l6f(m6f m6fVar, RecyclerView recyclerView, nee neeVar) {
        this.a = m6fVar;
        this.b = recyclerView;
        this.c = neeVar;
    }

    @Override // defpackage.pee
    public final void d(int i, int i2) {
        je9 je9Var = je9.d;
        m6f m6fVar = this.a;
        if (i2 == 1 && m6f.d(m6fVar, this.b, i)) {
            String str = this.a.d;
            RecyclerView recyclerView = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("onItemRangeInserted start. isComputingLayout:", recyclerView.Y()), null);
            }
            m6f.e(this.a, this.c);
            String str2 = this.a.d;
            RecyclerView recyclerView2 = this.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, zo5.s("onItemRangeInserted end. isComputingLayout:", recyclerView2.Y()), null);
            }
        }
    }

    @Override // defpackage.pee
    public final void e(int i, int i2) {
        m6f m6fVar = this.a;
        RecyclerView recyclerView = this.b;
        boolean zD = m6f.d(m6fVar, recyclerView, i);
        nee neeVar = this.c;
        if (zD) {
            m6f.e(m6fVar, neeVar);
        } else if (m6f.d(m6fVar, recyclerView, i2)) {
            m6f.e(m6fVar, neeVar);
        }
    }

    @Override // defpackage.pee
    public final void f(int i, int i2) {
        if (i2 == 1) {
            RecyclerView recyclerView = this.b;
            m6f m6fVar = this.a;
            if (m6f.d(m6fVar, recyclerView, i)) {
                m6f.e(m6fVar, this.c);
            }
        }
    }
}
