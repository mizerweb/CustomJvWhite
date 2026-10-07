package defpackage;

import android.app.Application;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class o50 {
    public static final /* synthetic */ zv8[] g;
    public final i50 a;
    public final Application b;
    public final zk6 c;
    public final dq4 d;
    public final p3c e = qyj.S();
    public final mjg f = p90.a(null);

    static {
        z8b z8bVar = new z8b(o50.class, "updateAttachJob", "getUpdateAttachJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        g = new zv8[]{z8bVar};
    }

    public o50(xhh xhhVar, i50 i50Var, Application application, zk6 zk6Var) {
        this.a = i50Var;
        this.b = application;
        this.c = zk6Var;
        this.d = cqk.a(((n0c) xhhVar).a());
    }

    public final r8e a(long j, h50 h50Var) {
        return e9i.G0(new l50(new jz(this.f, 13), j, 0), this.d, j0g.a, h50Var);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001e  */
    public final h50 b(p5e p5eVar) {
        boolean z;
        long jLongValue;
        zk6 zk6Var = this.c;
        b5d b5dVar = zk6Var.b.S5;
        zv8[] zv8VarArr = e5d.S6;
        if (((Number) b5dVar.a(zv8VarArr[358]).i()).intValue() >= 1) {
            z = false;
        } else {
            boolean zBooleanValue = ((Boolean) ((f5d) zk6Var.a).a.P3.a(zv8VarArr[251]).i()).booleanValue();
            boolean z2 = p5eVar.a() == oji.VIDEO;
            if (zBooleanValue && z2) {
                z = true;
            } else {
                z = false;
            }
        }
        boolean z3 = p5eVar instanceof k5e;
        Application application = this.b;
        if (z3) {
            k5e k5eVar = (k5e) p5eVar;
            long j = k5eVar.b;
            Long l = k5eVar.f;
            Long l2 = k5eVar.e;
            if (l2 == null || l == null || l2.longValue() != 0) {
                jLongValue = k5eVar.d;
            } else {
                jLongValue = (long) ((k5eVar.c / 100.0f) * l.longValue());
            }
            return new c50(k5eVar.a, k5eVar.c, j > 0 ? new xnh(zo5.p(woh.v(jLongValue, false, application), " / ", woh.u(j, woh.m(j), true, application))) : new tnh(R.string.chat_screen_attach_file_downloading_status), k5eVar.g);
        }
        if (p5eVar instanceof o5e) {
            if (z) {
                float fA = zk6Var.a(p5eVar);
                o5e o5eVar = (o5e) p5eVar;
                return new g50(o5eVar.a, fA, new vnh(R.string.uploading_progress, a.n1(new Object[]{Integer.valueOf((int) fA)})), o5eVar.d);
            }
            o5e o5eVar2 = (o5e) p5eVar;
            long j2 = o5eVar2.b;
            return new g50(o5eVar2.a, o5eVar2.c, new xnh(zo5.p(woh.v((long) ((o5eVar2.c / 100.0f) * j2), false, application), " / ", woh.u(j2, woh.m(j2), true, application))), o5eVar2.d);
        }
        if (p5eVar instanceof l5e) {
            l5e l5eVar = (l5e) p5eVar;
            return new d50(l5eVar.a, new xnh(woh.v(l5eVar.b, true, application)), l5eVar.c);
        }
        if (p5eVar instanceof n5e) {
            xnh xnhVar = z ? new xnh(new vnh(R.string.uploading_progress, a.n1(new Object[]{100})).e()) : new xnh(woh.v(((n5e) p5eVar).b, true, application));
            n5e n5eVar = (n5e) p5eVar;
            return new f50(n5eVar.a, xnhVar, n5eVar.c);
        }
        if (!(p5eVar instanceof m5e)) {
            ore.o();
            return null;
        }
        if (!z) {
            m5e m5eVar = (m5e) p5eVar;
            return new e50(m5eVar.a, new tnh(R.string.processing), m5eVar.b);
        }
        float fA2 = zk6Var.a(p5eVar);
        m5e m5eVar2 = (m5e) p5eVar;
        return new g50(m5eVar2.a, fA2, new vnh(R.string.uploading_progress, a.n1(new Object[]{Integer.valueOf((int) fA2)})), m5eVar2.b);
    }
}
