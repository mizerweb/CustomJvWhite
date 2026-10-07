package defpackage;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class nyj implements rj6 {
    public final Provider a;
    public final Provider b;
    public final k3f c;
    public final Provider d;

    public nyj(Provider provider, Provider provider2, k3f k3fVar, Provider provider3) {
        this.a = provider;
        this.b = provider2;
        this.c = k3fVar;
        this.d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new xde((Executor) this.a.get(), (uxe) this.b.get(), (kr6) this.c.get(), (uxe) this.d.get(), 18);
    }
}
