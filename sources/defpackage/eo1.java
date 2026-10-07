package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eo1 extends dag {
    public eo1(erc ercVar) {
        super(ercVar);
    }

    public final void z(boolean z, boolean z2) {
        String str = this.g;
        if (str != null) {
            long[] jArr = q1f.a;
            b9b b9bVar = new b9b();
            b9bVar.k("group_call", Boolean.valueOf(z));
            b9bVar.k("call_initialized", Boolean.valueOf(z2));
            qrc.k(this, "call_initialized", 0, str, true, null, b9bVar, 80);
            return;
        }
        String str2 = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str2, "Invoked 'callInitFinished', but traceId is null or empty!", null);
        }
    }
}
