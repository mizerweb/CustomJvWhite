package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class y9f implements z9f {
    public final String[] a;
    public final qw2 b;
    public final daf c;

    public y9f(String[] strArr, qw2 qw2Var, daf dafVar) {
        this.a = strArr;
        this.b = qw2Var;
        this.c = dafVar;
    }

    @Override // defpackage.z9f
    public final Object a(String str, nq4 nq4Var) {
        daf dafVar = this.c;
        rt2 rt2Var = (rt2) this.b.R().getValue();
        r66 r66Var = r66.a;
        if (rt2Var != null) {
            try {
                if (dafVar.e(rt2Var, str)) {
                    return Collections.singletonList(dafVar.a(rt2Var, str));
                }
                for (String str2 : this.a) {
                    if (dafVar.g(str2, str)) {
                        return Collections.singletonList(dafVar.a(rt2Var, str2));
                    }
                }
            } catch (Throwable th) {
                gm0.V(y9f.class.getName(), "fail to search saved messages chat", th);
                return r66Var;
            }
        }
        return r66Var;
    }
}
