package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ika {
    public static final /* synthetic */ int g = 0;
    public final gu4 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final AtomicBoolean e = new AtomicBoolean();
    public final ifh f;

    public ika(gu4 gu4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = gu4Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var4;
        this.f = new ifh(new fu(ny8Var3, 6));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r11 == r5) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.nq4 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.hka
            if (r0 == 0) goto L13
            r0 = r12
            hka r0 = (defpackage.hka) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            hka r0 = new hka
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.d
            int r1 = r0.f
            ny8 r2 = r11.b
            sbi r3 = defpackage.sbi.a
            r4 = 2
            hu4 r5 = defpackage.hu4.a
            r6 = 1
            java.lang.String r7 = "ika"
            if (r1 == 0) goto L41
            if (r1 == r6) goto L3b
            if (r1 != r4) goto L34
            defpackage.ch3.d0(r12)     // Catch: java.lang.Exception -> L31
            goto La1
        L31:
            r11 = move-exception
            goto La7
        L34:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            r11 = 0
            return r11
        L3b:
            defpackage.ch3.d0(r12)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            goto L5b
        L3f:
            r11 = move-exception
            goto L7f
        L41:
            defpackage.ch3.d0(r12)
            java.lang.String r12 = "clear: "
            defpackage.gm0.n(r7, r12)
            java.lang.Object r12 = r2.getValue()     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            nka r12 = (defpackage.nka) r12     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            r0.f = r6     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            r12.getClass()     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            java.io.Serializable r12 = defpackage.nka.b(r12, r0)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            if (r12 != r5) goto L5b
            goto La0
        L5b:
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
        L61:
            boolean r1 = r12.hasNext()     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            if (r1 == 0) goto L84
            java.lang.Object r1 = r12.next()     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            gka r1 = (defpackage.gka) r1     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            ny8 r8 = r11.d     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            cq6 r8 = (defpackage.cq6) r8     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            pia r1 = r1.a     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            long r9 = r1.a     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            defpackage.cq6.b(r8, r9)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L7d
            goto L61
        L7d:
            r11 = move-exception
            goto Lad
        L7f:
            java.lang.String r12 = "clear failure!"
            defpackage.gm0.V(r7, r12, r11)
        L84:
            java.lang.Object r11 = r2.getValue()     // Catch: java.lang.Exception -> L31
            nka r11 = (defpackage.nka) r11     // Catch: java.lang.Exception -> L31
            r0.f = r4     // Catch: java.lang.Exception -> L31
            rre r11 = r11.a     // Catch: java.lang.Exception -> L31
            s9a r12 = new s9a     // Catch: java.lang.Exception -> L31
            r1 = 9
            r12.<init>(r1)     // Catch: java.lang.Exception -> L31
            r1 = 0
            java.lang.Object r11 = defpackage.ch3.I(r0, r11, r1, r6, r12)     // Catch: java.lang.Exception -> L31
            if (r11 != r5) goto L9d
            goto L9e
        L9d:
            r11 = r3
        L9e:
            if (r11 != r5) goto La1
        La0:
            return r5
        La1:
            java.lang.String r11 = "clear: cleared message upload repository"
            defpackage.gm0.n(r7, r11)     // Catch: java.lang.Exception -> L31
            goto Lac
        La7:
            java.lang.String r12 = "clear: failed to clear message upload repository"
            defpackage.gm0.V(r7, r12, r11)
        Lac:
            return r3
        Lad:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ika.a(nq4):java.lang.Object");
    }

    public final void b() {
        gm0.n(ika.class.getName(), "try to restore uploads");
        if (this.e.compareAndSet(false, true)) {
            ((ExecutorService) this.f.getValue()).execute(new e6(23, this));
        }
    }
}
