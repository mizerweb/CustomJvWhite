package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class li1 implements y3e {
    @Override // defpackage.y3e
    public final void log(String str, String str2) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallsSdk", qv1.l("[", str, "] ", str2), null);
        }
    }

    @Override // defpackage.y3e
    public final void logException(String str, String str2, Throwable th) {
        gm0.X("CallsSdk", th, "[%s] %s", str, str2);
    }
}
