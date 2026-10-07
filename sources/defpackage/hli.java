package defpackage;

import android.util.Log;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class hli {
    public final hmi a;
    public final omi b;
    public final kli c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final int g;
    public final b40 h;
    public final ifh i;
    public final ifh j;
    public final ifh k;

    public hli(hmi hmiVar, omi omiVar, kli kliVar, Provider provider, Provider provider2, Provider provider3) {
        this.a = hmiVar;
        this.b = omiVar;
        this.c = kliVar;
        this.d = provider;
        this.e = provider2;
        this.f = provider3;
        g40 g40Var = ili.a;
        g40Var.getClass();
        this.g = g40.b.incrementAndGet(g40Var);
        final int i = 0;
        this.h = gvk.a(false);
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        this.i = new ifh(new af7(this) { // from class: gli
            public final /* synthetic */ hli b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                hli hliVar = this.b;
                switch (i2) {
                    case 0:
                        return (nmi) hliVar.d.get();
                    case 1:
                        return (nmf) hliVar.e.get();
                    default:
                        return (pl2) hliVar.f.get();
                }
            }
        });
        final int i2 = 1;
        this.j = new ifh(new af7(this) { // from class: gli
            public final /* synthetic */ hli b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                hli hliVar = this.b;
                switch (i3) {
                    case 0:
                        return (nmi) hliVar.d.get();
                    case 1:
                        return (nmf) hliVar.e.get();
                    default:
                        return (pl2) hliVar.f.get();
                }
            }
        });
        final int i3 = 2;
        this.k = new ifh(new af7(this) { // from class: gli
            public final /* synthetic */ hli b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                hli hliVar = this.b;
                switch (i4) {
                    case 0:
                        return (nmi) hliVar.d.get();
                    case 1:
                        return (nmf) hliVar.e.get();
                    default:
                        return (pl2) hliVar.f.get();
                }
            }
        });
    }

    public final String toString() {
        return "UseCaseCamera-" + this.g;
    }
}
