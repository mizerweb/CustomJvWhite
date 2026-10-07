package defpackage;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class jd5 implements rj6 {
    public final Provider a;
    public final Provider b;
    public final k3f c;
    public final Provider d;
    public final Provider e;

    public jd5(Provider provider, Provider provider2, k3f k3fVar, Provider provider3, Provider provider4) {
        this.a = provider;
        this.b = provider2;
        this.c = k3fVar;
        this.d = provider3;
        this.e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new id5((Executor) this.a.get(), (nwa) this.b.get(), (kr6) this.c.get(), (uxe) this.d.get(), (uxe) this.e.get());
    }
}
