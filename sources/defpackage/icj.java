package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class icj extends f83 {
    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        if (cqk.d(obj, obj2)) {
            return;
        }
        String name = jcj.a.getClass().getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.e;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "new config " + jcj.a(), null);
        }
    }
}
