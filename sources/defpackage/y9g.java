package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class y9g {
    public final rrc a;
    public final ifh b = new ifh(new irf(15));

    public y9g(rrc rrcVar) {
        this.a = rrcVar;
    }

    public static void c(y9g y9gVar, b9b b9bVar) {
        y9gVar.b("lottie", null, b9bVar);
    }

    public final void a(String str, String str2, b9b b9bVar) {
        ul9 ul9Var = new ul9();
        if (str2 != null) {
            ul9Var.put("errorDesc", str2);
        }
        if ((b9bVar.f() ? b9bVar : null) != null) {
            ul9Var.put("properties", b9bVar);
        }
        ((ae9) this.a.f.getValue()).j("ERROR", str, ul9Var.b(), false);
    }

    public final void b(String str, String str2, b9b b9bVar) {
        rrc rrcVar = this.a;
        if (rrcVar.c() == Integer.MAX_VALUE) {
            a(str, str2, b9bVar);
            return;
        }
        Integer num = (Integer) ((ConcurrentHashMap) this.b.getValue()).compute(str, new mw1(17, new wf0(27)));
        if ((num != null ? num.intValue() : 0) <= rrcVar.c()) {
            a(str, str2, b9bVar);
        }
    }
}
