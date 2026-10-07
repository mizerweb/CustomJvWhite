package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class z6e implements Runnable {
    public final /* synthetic */ b7e a;
    public final /* synthetic */ lfe b;
    public final /* synthetic */ long c;
    public final /* synthetic */ y6e d;
    public final /* synthetic */ boolean e;

    public z6e(View view, b7e b7eVar, lfe lfeVar, long j, y6e y6eVar, boolean z) {
        this.a = b7eVar;
        this.b = lfeVar;
        this.c = j;
        this.d = y6eVar;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.e(this.b.l())) {
            return;
        }
        this.a.f.remove(Long.valueOf(this.c));
        this.a.e.remove(this.d);
        View viewFindViewById = this.b.a.findViewById(this.d.c.a.toString().hashCode());
        Rect rectD = viewFindViewById == null ? null : n9j.d(viewFindViewById, (View) this.a.c.b);
        if (rectD == null) {
            return;
        }
        String str = this.a.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Play pending reaction effect, by place:" + rectD + ", onCreation:" + this.e, null);
            }
        }
        b7e b7eVar = this.a;
        y6e y6eVar = this.d;
        b7e.c(b7eVar, y6eVar.b, y6eVar.a, rectD);
        if (this.e) {
            this.b.a.addOnLayoutChangeListener(new a7e(this.a, viewFindViewById, this.c));
        }
    }
}
