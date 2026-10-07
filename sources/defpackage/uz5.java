package defpackage;

import java.util.List;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes3.dex */
public final class uz5 {
    public final qfa a;
    public final qw2 b;
    public final b c;
    public final t51 d;
    public final et3 e;

    public uz5(qfa qfaVar, qw2 qw2Var, b bVar, t51 t51Var, et3 et3Var) {
        this.a = qfaVar;
        this.b = qw2Var;
        this.c = bVar;
        this.d = t51Var;
        this.e = et3Var;
    }

    public final void a(final long j, long j2, final String str, final List list, final wja wjaVar, final List list2, final boolean z) {
        long j3;
        this.c.g.remove(Long.valueOf(j));
        final long jF = ((s7f) this.e).f();
        af7 af7Var = new af7() { // from class: tz5
            @Override // defpackage.af7
            public final Object invoke() {
                uz5 uz5Var = this.a;
                qfa qfaVar = uz5Var.a;
                long j4 = j;
                qfaVar.t(j4, jF, null);
                if (z) {
                    ((ose) uz5Var.a.b.c()).C(j4, new zv2(6, list2));
                }
                uz5Var.a.s(j4, str, list, uz5Var.b, wjaVar);
                return null;
            }
        };
        qfa qfaVar = this.a;
        ((ose) qfaVar.b.c()).e().a(af7Var);
        qw2 qw2Var = this.b;
        rt2 rt2VarN = qw2Var.N(j2);
        if (rt2VarN == null || rt2VarN.b.j != j) {
            j3 = j2;
        } else {
            j3 = j2;
            this.b.g0(j3, qfaVar.l(j), true, null);
        }
        if (rt2VarN != null && rt2VarN.b.M == j && qfaVar.l(j) != null) {
            qw2Var.k0(j3);
        }
        this.d.c(new kfi(j3, j, false));
    }
}
