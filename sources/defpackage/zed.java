package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class zed {
    public final xb9 a;
    public final e5d b;
    public final nni c;
    public final wd0 d;
    public final u9c e;

    public zed(xb9 xb9Var, e5d e5dVar, nni nniVar, wd0 wd0Var, u9c u9cVar) {
        this.a = xb9Var;
        this.b = e5dVar;
        this.c = nniVar;
        this.d = wd0Var;
        this.e = u9cVar;
    }

    public final void a() {
        this.a.b();
        e5d e5dVar = this.b;
        e5dVar.q().edit().clear().commit();
        ((SharedPreferences) e5dVar.g.getValue()).edit().clear().commit();
        ((SharedPreferences) e5dVar.f.getValue()).edit().clear().commit();
        for (i5d i5dVar : e5dVar.o().values()) {
            i5dVar.g().edit().remove(i5dVar.a).commit();
            i5dVar.o = 5;
            i5dVar.p.a();
            ((f9b) i5dVar.q.getValue()).setValue(i5dVar.b);
        }
        this.c.b();
        this.d.b();
        this.e.b();
    }
}
