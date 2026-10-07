package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e9 {
    public final mjg a = p90.a(0L);

    public final boolean a(long j) {
        return ((Number) this.a.getValue()).longValue() == j;
    }

    public final void b(long j, boolean z) {
        Object value;
        String name = e9.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, bc1.l(j, "update: #", ",isActive=", z), null);
            }
        }
        mjg mjgVar = this.a;
        do {
            value = mjgVar.getValue();
            ((Number) value).longValue();
        } while (!mjgVar.h(value, Long.valueOf(z ? j : 0L)));
    }
}
