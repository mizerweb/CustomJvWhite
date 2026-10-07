package defpackage;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class k3f implements rj6 {
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    public final rj6 d;

    public /* synthetic */ k3f(Provider provider, Provider provider2, rj6 rj6Var, int i) {
        this.a = i;
        this.b = provider;
        this.c = provider2;
        this.d = rj6Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.a;
        rj6 rj6Var = this.d;
        Provider provider = this.c;
        Provider provider2 = this.b;
        switch (i) {
            case 0:
                return new kr6((Context) provider2.get(), (uxe) provider.get(), (si0) ((nd6) rj6Var).get());
            default:
                return new g4i(new lu8(), new nv8(13), (id5) ((jd5) provider2).get(), (z18) ((eki) provider).get(), (xde) ((nyj) rj6Var).get());
        }
    }
}
