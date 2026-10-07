package defpackage;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import one.video.calls.sdk_private.bD;
import one.video.calls.sdk_private.bJ;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x7k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7k b;

    public /* synthetic */ x7k(z7k z7kVar, int i) {
        this.a = i;
        this.b = z7kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 0;
        z7k z7kVar = this.b;
        switch (i) {
            case 0:
                z7kVar.B.a(y4k.a);
                b5k b5kVar = z7kVar.e;
                b5kVar.j[0] = true;
                b5kVar.f[0] = null;
                b5kVar.g[0] = null;
                break;
            case 1:
                Thread threadCurrentThread = Thread.currentThread();
                b5k b5kVar2 = z7kVar.e;
                f8k f8kVar = z7kVar.a;
                b6k b6kVar = z7kVar.G;
                int i3 = b6kVar.a;
                byte[] bArr = b6kVar.g;
                b8k b8kVar = new b8k(z7kVar, new b8k(new h8k(new b8k(z7kVar, new b8k(z7kVar, z7kVar, z7kVar.c), 2))), i2);
                mw1 mw1Var = new mw1(23, z7kVar);
                ku8 ku8Var = z7kVar.c;
                g8k g8kVar = new g8k();
                g8kVar.a = b5kVar2;
                g8kVar.b = f8kVar;
                g8kVar.c = i3;
                g8kVar.d = b8kVar;
                g8kVar.g = mw1Var;
                g8kVar.e = ku8Var;
                g8kVar.f = new long[y4k.values().length];
                g8kVar.h = bArr;
                z7kVar.D = g8kVar;
                zfh zfhVar = new zfh(z7kVar.D);
                while (!threadCurrentThread.isInterrupted()) {
                    try {
                        ubk ubkVar = (ubk) z7kVar.C.e.poll(15L, TimeUnit.SECONDS);
                        if (ubkVar != null) {
                            z7kVar.J.getClass();
                            Duration durationBetween = Duration.between(ubkVar.a, Instant.now());
                            i2++;
                            ubkVar.b.limit();
                            ubkVar.b.limit();
                            durationBetween.toMillis();
                            zfhVar.c(ubkVar.b, new c4h(ubkVar.a, i2));
                            z7kVar.B.h();
                            z7kVar.l();
                            z7kVar.C.e.isEmpty();
                        }
                    } catch (InterruptedException unused) {
                        return;
                    } catch (bD unused2) {
                        e = new bJ(11);
                        z7kVar.e(ewi.c(e.a), e.getMessage(), 1);
                        z7kVar.B.h();
                        z7kVar.l();
                        return;
                    } catch (RuntimeException e) {
                        z7kVar.j(e);
                        return;
                    } catch (bJ e2) {
                        e = e2;
                        z7kVar.e(ewi.c(e.a), e.getMessage(), 1);
                        z7kVar.B.h();
                        z7kVar.l();
                        return;
                    }
                }
                break;
            case 2:
                z7kVar.p();
                break;
            case 3:
                z7kVar.p();
                break;
            default:
                z7kVar.p();
                break;
        }
    }
}
