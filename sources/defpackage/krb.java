package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class krb extends fqb {
    public final z2f a;
    public final long b;
    public final TimeUnit c;

    public krb(long j, TimeUnit timeUnit, z2f z2fVar) {
        this.b = j;
        this.c = timeUnit;
        this.a = z2fVar;
    }

    @Override // defpackage.fqb
    public final void g(rrb rrbVar) {
        jrb jrbVar = new jrb(rrbVar);
        rrbVar.c(jrbVar);
        ko5 ko5VarC = this.a.c(jrbVar, this.b, this.c);
        while (!jrbVar.compareAndSet(null, ko5VarC)) {
            if (jrbVar.get() != null) {
                if (jrbVar.get() == oo5.a) {
                    ko5VarC.dispose();
                    return;
                }
                return;
            }
        }
    }
}
