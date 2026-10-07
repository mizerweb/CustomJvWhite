package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousByteChannel;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import one.me.sdk.transfer.upload.exceptions.UploadUnhandledException;

/* JADX INFO: loaded from: classes3.dex */
public final class guh {
    public static final AtomicInteger r = new AtomicInteger(0);
    public final SSLEngine a;
    public final AsynchronousByteChannel b;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public final t31 l;
    public final t31 m;
    public final t31 n;
    public jrc o;
    public int p;
    public final String c = qt4.j(r.incrementAndGet(), guh.class.getName(), ":");
    public final l9b d = new l9b();
    public final AtomicReference h = new AtomicReference(null);
    public final jrc q = new jrc(new ByteBuffer[]{ByteBuffer.allocate(0)});

    public guh(o31 o31Var, SSLEngine sSLEngine, AsynchronousByteChannel asynchronousByteChannel) {
        this.a = sSLEngine;
        this.b = asynchronousByteChannel;
        this.l = new t31("inEncrypted", false, o31Var);
        this.m = new t31("outEncrypted", false, o31Var);
        this.n = new t31("inPlain", true, o31Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r9.b(r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(defpackage.guh r9, defpackage.nq4 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.wth
            if (r0 == 0) goto L13
            r0 = r10
            wth r0 = (defpackage.wth) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            wth r0 = new wth
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            hu4 r1 = defpackage.hu4.a
            int r2 = r0.f
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            defpackage.ch3.d0(r10)
            goto L86
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            return r3
        L34:
            guh r9 = r0.d
            defpackage.ch3.d0(r10)
            goto L7b
        L3a:
            guh r9 = r0.d
            defpackage.ch3.d0(r10)
            goto L69
        L40:
            defpackage.ch3.d0(r10)
            java.lang.String r10 = r9.c
            a4c r2 = defpackage.gm0.f
            if (r2 != 0) goto L4a
            goto L57
        L4a:
            je9 r7 = defpackage.je9.d
            boolean r8 = r2.b(r7)
            if (r8 == 0) goto L57
            java.lang.String r8 = "finalWrite"
            r2.c(r7, r10, r8, r3)
        L57:
            r9.i = r6
            t31 r10 = r9.m
            r10.c()
            r0.d = r9
            r0.f = r6
            java.lang.Object r10 = r9.b(r0)
            if (r10 != r1) goto L69
            goto L85
        L69:
            javax.net.ssl.SSLEngine r10 = r9.a
            r10.closeOutbound()
            jrc r10 = r9.q
            r0.d = r9
            r0.f = r5
            java.lang.Object r10 = r9.n(r10, r0)
            if (r10 != r1) goto L7b
            goto L85
        L7b:
            r0.d = r3
            r0.f = r4
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto L86
        L85:
            return r1
        L86:
            sbi r9 = defpackage.sbi.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guh.f(guh, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bf, code lost:
    
        if (e(r9) == r10) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.nio.ByteBuffer r15, defpackage.nq4 r16) {
        /*
            r14 = this;
            r0 = r16
            sbi r8 = defpackage.sbi.a
            boolean r1 = r0 instanceof defpackage.qth
            if (r1 == 0) goto L18
            r1 = r0
            qth r1 = (defpackage.qth) r1
            int r2 = r1.g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L18
            int r2 = r2 - r4
            r1.g = r2
        L16:
            r9 = r1
            goto L1e
        L18:
            qth r1 = new qth
            r1.<init>(r14, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r9.e
            hu4 r10 = defpackage.hu4.a
            int r1 = r9.g
            r11 = 2
            r12 = 1
            r13 = 0
            if (r1 == 0) goto L44
            if (r1 == r12) goto L3a
            if (r1 != r11) goto L34
            java.lang.Object r1 = r9.d
            defpackage.ch3.d0(r0)
            goto Lc2
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r13
        L3a:
            java.lang.Object r1 = r9.d
            guh r1 = (defpackage.guh) r1
            defpackage.ch3.d0(r0)     // Catch: java.lang.Throwable -> L42
            goto L63
        L42:
            r0 = move-exception
            goto L7b
        L44:
            defpackage.ch3.d0(r0)
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L42
            rth r0 = new rth     // Catch: java.lang.Throwable -> L42
            r4 = 0
            r7 = 0
            r5 = r14
            r3 = r14
            r6 = r15
            r0.<init>(r1, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L42
            r9.d = r13     // Catch: java.lang.Throwable -> L42
            r9.g = r12     // Catch: java.lang.Throwable -> L42
            r1 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r0 = defpackage.lvb.J0(r1, r0, r9)     // Catch: java.lang.Throwable -> L42
            if (r0 != r10) goto L63
            goto Lc1
        L63:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L42
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L42
            r1 = -1
            if (r0 == r1) goto L6e
            r1 = r8
            goto L80
        L6e:
            one.me.sdk.transfer.upload.exceptions.UploadUnhandledException$ChannelReadException r0 = new one.me.sdk.transfer.upload.exceptions.UploadUnhandledException$ChannelReadException     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "Trying to read from channel, but end of channel (-1) returned"
            one.me.sdk.transfer.upload.exceptions.UploadUnhandledException$RetriableException r2 = new one.me.sdk.transfer.upload.exceptions.UploadUnhandledException$RetriableException     // Catch: java.lang.Throwable -> L42
            r2.<init>()     // Catch: java.lang.Throwable -> L42
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L42
            throw r0     // Catch: java.lang.Throwable -> L42
        L7b:
            poe r1 = new poe
            r1.<init>(r0)
        L80:
            java.lang.Throwable r0 = defpackage.roe.a(r1)
            if (r0 == 0) goto Lc2
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            java.lang.String r4 = r14.c
            if (r2 == 0) goto L94
            java.lang.String r0 = "Channel read cancelled"
            defpackage.gm0.n(r4, r0)
            r14.f = r12
            goto Lb7
        L94:
            a4c r2 = defpackage.gm0.f
            if (r2 != 0) goto L99
            goto La6
        L99:
            je9 r5 = defpackage.je9.d
            boolean r6 = r2.b(r5)
            if (r6 == 0) goto La6
            java.lang.String r6 = "Channel read failed"
            r2.c(r5, r4, r6, r0)
        La6:
            r14.g = r12
            java.util.concurrent.atomic.AtomicReference r2 = r14.h
        Laa:
            boolean r4 = r2.compareAndSet(r13, r0)
            if (r4 == 0) goto Lb1
            goto Lb7
        Lb1:
            java.lang.Object r4 = r2.get()
            if (r4 == 0) goto Laa
        Lb7:
            r9.d = r1
            r9.g = r11
            java.lang.Object r0 = r14.e(r9)
            if (r0 != r10) goto Lc2
        Lc1:
            return r10
        Lc2:
            defpackage.ch3.d0(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guh.a(java.nio.ByteBuffer, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #0 {all -> 0x004e, blocks: (B:16:0x0047, B:26:0x0073, B:28:0x0079, B:25:0x0069), top: B:63:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (defpackage.lvb.J0(60000, r10, r3) == r4) goto L58;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0098 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.nq4 r19) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guh.b(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(jrc jrcVar, nq4 nq4Var) {
        tth tthVar;
        if (nq4Var instanceof tth) {
            tthVar = (tth) nq4Var;
            int i = tthVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tthVar.f = i - Integer.MIN_VALUE;
            } else {
                tthVar = new tth(this, nq4Var);
            }
        } else {
            tthVar = new tth(this, nq4Var);
        }
        Object objV = tthVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = tthVar.f;
        try {
            try {
                if (i2 == 0) {
                    ch3.d0(objV);
                    this.l.e().flip();
                    nth nthVar = new nth(this, jrcVar, 1);
                    tthVar.f = 1;
                    objV = qyj.V(k66.a, nthVar, tthVar);
                    if (objV == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(objV);
                }
                SSLEngineResult sSLEngineResult = (SSLEngineResult) objV;
                this.l.e().compact();
                return sSLEngineResult;
            } catch (SSLException e) {
                this.g = true;
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                throw e;
            }
        } catch (Throwable th) {
            this.l.e().compact();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(jrc jrcVar, nq4 nq4Var) throws SSLException {
        uth uthVar;
        if (nq4Var instanceof uth) {
            uthVar = (uth) nq4Var;
            int i = uthVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                uthVar.f = i - Integer.MIN_VALUE;
            } else {
                uthVar = new uth(this, nq4Var);
            }
        } else {
            uthVar = new uth(this, nq4Var);
        }
        Object objV = uthVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = uthVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objV);
                nth nthVar = new nth(this, jrcVar, 0);
                uthVar.f = 1;
                objV = qyj.V(k66.a, nthVar, uthVar);
                if (objV == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objV);
            }
            return (SSLEngineResult) objV;
        } catch (SSLException e) {
            this.g = true;
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (f(r8, r2) == r3) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.nq4 r9) {
        /*
            r8 = this;
            je9 r0 = defpackage.je9.f
            java.lang.String r1 = "Final write to channel is not possible because channel is invalid: "
            boolean r2 = r9 instanceof defpackage.vth
            if (r2 == 0) goto L17
            r2 = r9
            vth r2 = (defpackage.vth) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f = r3
            goto L1c
        L17:
            vth r2 = new vth
            r2.<init>(r8, r9)
        L1c:
            java.lang.Object r9 = r2.d
            hu4 r3 = defpackage.hu4.a
            int r4 = r2.f
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L37
            if (r4 == r7) goto L2b
            if (r4 != r6) goto L31
        L2b:
            defpackage.ch3.d0(r9)     // Catch: java.lang.Throwable -> L2f
            goto L84
        L2f:
            r9 = move-exception
            goto L9b
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r5
        L37:
            defpackage.ch3.d0(r9)
            boolean r9 = r8.i
            if (r9 != 0) goto Lc5
            boolean r9 = r8.g     // Catch: java.lang.Throwable -> L2f
            if (r9 == 0) goto L65
            java.lang.String r9 = r8.c     // Catch: java.lang.Throwable -> L2f
            a4c r2 = defpackage.gm0.f     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L49
            goto L84
        L49:
            boolean r3 = r2.b(r0)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L84
            java.util.concurrent.atomic.AtomicReference r3 = r8.h     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            r4.append(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            r2.c(r0, r9, r1, r5)     // Catch: java.lang.Throwable -> L2f
            goto L84
        L65:
            boolean r9 = r8.f     // Catch: java.lang.Throwable -> L2f
            if (r9 == 0) goto L7b
            zhb r9 = defpackage.zhb.b     // Catch: java.lang.Throwable -> L2f
            fpf r1 = new fpf     // Catch: java.lang.Throwable -> L2f
            r4 = 12
            r1.<init>(r8, r5, r4)     // Catch: java.lang.Throwable -> L2f
            r2.f = r7     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = defpackage.yab.K0(r9, r1, r2)     // Catch: java.lang.Throwable -> L2f
            if (r9 != r3) goto L84
            goto L83
        L7b:
            r2.f = r6     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = f(r8, r2)     // Catch: java.lang.Throwable -> L2f
            if (r9 != r3) goto L84
        L83:
            return r3
        L84:
            java.nio.channels.AsynchronousByteChannel r9 = r8.b     // Catch: java.lang.Throwable -> L99
            r9.close()     // Catch: java.lang.Throwable -> L99
        L89:
            t31 r9 = r8.l
            r9.a()
            t31 r9 = r8.n
            r9.a()
            t31 r8 = r8.m
            r8.a()
            goto Lc5
        L99:
            r9 = move-exception
            goto La1
        L9b:
            java.nio.channels.AsynchronousByteChannel r1 = r8.b     // Catch: java.lang.Throwable -> L99
            r1.close()     // Catch: java.lang.Throwable -> L99
            throw r9     // Catch: java.lang.Throwable -> L99
        La1:
            java.lang.String r1 = r8.c     // Catch: java.lang.Throwable -> Lb4
            a4c r2 = defpackage.gm0.f     // Catch: java.lang.Throwable -> Lb4
            if (r2 != 0) goto La8
            goto L89
        La8:
            boolean r3 = r2.b(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r3 == 0) goto L89
            java.lang.String r3 = "Error doing TLS shutdown on close(), continuing"
            r2.c(r0, r1, r3, r9)     // Catch: java.lang.Throwable -> Lb4
            goto L89
        Lb4:
            r9 = move-exception
            t31 r0 = r8.l
            r0.a()
            t31 r0 = r8.n
            r0.a()
            t31 r8 = r8.m
            r8.a()
            throw r9
        Lc5:
            sbi r8 = defpackage.sbi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guh.e(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object g(nq4 nq4Var) throws Throwable {
        xth xthVar;
        j9b j9bVar;
        int i;
        j9b j9bVar2;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof xth) {
            xthVar = (xth) nq4Var;
            int i2 = xthVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xthVar.i = i2 - Integer.MIN_VALUE;
            } else {
                xthVar = new xth(this, nq4Var);
            }
        } else {
            xthVar = new xth(this, nq4Var);
        }
        Object obj = xthVar.g;
        Object obj2 = hu4.a;
        int i3 = xthVar.i;
        int i4 = 0;
        try {
            if (i3 == 0) {
                ch3.d0(obj);
                if (this.e) {
                    return sbiVar;
                }
                j9bVar = this.d;
                xthVar.d = j9bVar;
                xthVar.e = 0;
                xthVar.i = 1;
                if (j9bVar.b(xthVar) != obj2) {
                    i = 0;
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j9bVar2 = xthVar.d;
                    try {
                        ch3.d0(obj);
                        gm0.n(this.c, "Ended SSLEngine.beginHandshake()");
                        this.e = true;
                        j9bVar2.g(null);
                        return sbiVar;
                    } catch (Throwable th) {
                        th = th;
                        j9bVar2.g(null);
                        throw th;
                    }
                }
                i4 = xthVar.f;
                i = xthVar.e;
                j9b j9bVar3 = xthVar.d;
                try {
                    ch3.d0(obj);
                    j9bVar = j9bVar3;
                    xthVar.d = j9bVar;
                    xthVar.e = i;
                    xthVar.f = i4;
                    xthVar.i = 3;
                    if (p(xthVar) != obj2) {
                        j9bVar2 = j9bVar;
                        gm0.n(this.c, "Ended SSLEngine.beginHandshake()");
                        this.e = true;
                        j9bVar2.g(null);
                        return sbiVar;
                    }
                    return obj2;
                } catch (Throwable th2) {
                    th = th2;
                    j9bVar2 = j9bVar3;
                    j9bVar2.g(null);
                    throw th;
                }
            }
            i = xthVar.e;
            j9b j9bVar4 = xthVar.d;
            ch3.d0(obj);
            j9bVar = j9bVar4;
            if (this.e) {
                j9bVar.g(null);
                return sbiVar;
            }
            gm0.n(this.c, "Starting SSLEngine.beginHandshake()");
            mth mthVar = new mth(this, 0);
            xthVar.d = j9bVar;
            xthVar.e = i;
            xthVar.f = 0;
            xthVar.i = 2;
            if (qyj.V(k66.a, mthVar, xthVar) != obj2) {
                xthVar.d = j9bVar;
                xthVar.e = i;
                xthVar.f = i4;
                xthVar.i = 3;
                if (p(xthVar) != obj2) {
                    j9bVar2 = j9bVar;
                    gm0.n(this.c, "Ended SSLEngine.beginHandshake()");
                    this.e = true;
                    j9bVar2.g(null);
                    return sbiVar;
                }
            }
            return obj2;
        } catch (Throwable th3) {
            th = th3;
            j9bVar2 = j9bVar;
            j9bVar2.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006d -> B:33:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00a0 -> B:20:0x0043). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ae -> B:20:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(defpackage.nq4 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.yth
            if (r0 == 0) goto L13
            r0 = r9
            yth r0 = (defpackage.yth) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            yth r0 = new yth
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            hu4 r6 = defpackage.hu4.a
            if (r1 == 0) goto L40
            if (r1 == r4) goto L3c
            if (r1 == r5) goto L40
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            defpackage.ch3.d0(r9)
            goto L70
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            r8 = 0
            return r8
        L37:
            defpackage.ch3.d0(r9)
            goto Lac
        L3c:
            defpackage.ch3.d0(r9)
            goto L9a
        L40:
            defpackage.ch3.d0(r9)
        L43:
            javax.net.ssl.SSLEngine r9 = r8.a
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = r9.getHandshakeStatus()
            if (r9 != 0) goto L4d
            r1 = -1
            goto L55
        L4d:
            int[] r1 = defpackage.pth.$EnumSwitchMapping$0
            int r7 = r9.ordinal()
            r1 = r1[r7]
        L55:
            if (r1 == r4) goto La3
            if (r1 == r5) goto L8f
            if (r1 == r3) goto Lb0
            if (r1 == r2) goto L87
            r7 = 5
            if (r1 != r7) goto L73
            mth r9 = new mth
            r9.<init>(r8, r5)
            r0.f = r2
            k66 r1 = defpackage.k66.a
            java.lang.Object r9 = defpackage.qyj.V(r1, r9, r0)
            if (r9 != r6) goto L70
            goto Lab
        L70:
            sbi r9 = (defpackage.sbi) r9
            goto L43
        L73:
            one.me.sdk.transfer.upload.exceptions.UploadUnhandledException$SslEngineOperationException r8 = new one.me.sdk.transfer.upload.exceptions.UploadUnhandledException$SslEngineOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[handshakeLoop] Incorrect handshakeStatus: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            throw r8
        L87:
            one.me.sdk.transfer.upload.exceptions.UploadUnhandledException$SslEngineOperationException r8 = new one.me.sdk.transfer.upload.exceptions.UploadUnhandledException$SslEngineOperationException
            java.lang.String r9 = "[handshakeLoop] Incorrect handshakeStatus: FINISHED"
            r8.<init>(r9)
            throw r8
        L8f:
            r0.f = r4
            jrc r9 = r8.q
            java.lang.Object r9 = r8.n(r9, r0)
            if (r9 != r6) goto L9a
            goto Lab
        L9a:
            r0.f = r5
            java.lang.Object r9 = r8.b(r0)
            if (r9 != r6) goto L43
            goto Lab
        La3:
            r0.f = r3
            java.lang.Object r9 = r8.j(r0)
            if (r9 != r6) goto Lac
        Lab:
            return r6
        Lac:
            int r9 = r8.p
            if (r9 <= 0) goto L43
        Lb0:
            sbi r8 = defpackage.sbi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guh.h(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009c A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x010e, B:96:0x0142, B:49:0x0098, B:51:0x009c, B:53:0x00a0, B:56:0x00ac, B:57:0x00b3, B:60:0x00b8, B:62:0x00bc, B:64:0x00c2, B:69:0x00cc, B:71:0x00d3, B:70:0x00cf, B:74:0x00dd, B:84:0x00fa, B:88:0x0111, B:89:0x0127, B:90:0x0128, B:93:0x0135, B:77:0x00e7, B:97:0x0145, B:98:0x014a, B:22:0x0044, B:25:0x004b, B:38:0x0074, B:40:0x007c, B:48:0x0094, B:47:0x008a, B:29:0x005c, B:31:0x0060, B:33:0x0064, B:35:0x0068, B:99:0x014b, B:100:0x015a), top: B:105:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x010e, B:96:0x0142, B:49:0x0098, B:51:0x009c, B:53:0x00a0, B:56:0x00ac, B:57:0x00b3, B:60:0x00b8, B:62:0x00bc, B:64:0x00c2, B:69:0x00cc, B:71:0x00d3, B:70:0x00cf, B:74:0x00dd, B:84:0x00fa, B:88:0x0111, B:89:0x0127, B:90:0x0128, B:93:0x0135, B:77:0x00e7, B:97:0x0145, B:98:0x014a, B:22:0x0044, B:25:0x004b, B:38:0x0074, B:40:0x007c, B:48:0x0094, B:47:0x008a, B:29:0x005c, B:31:0x0060, B:33:0x0064, B:35:0x0068, B:99:0x014b, B:100:0x015a), top: B:105:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x010e, B:96:0x0142, B:49:0x0098, B:51:0x009c, B:53:0x00a0, B:56:0x00ac, B:57:0x00b3, B:60:0x00b8, B:62:0x00bc, B:64:0x00c2, B:69:0x00cc, B:71:0x00d3, B:70:0x00cf, B:74:0x00dd, B:84:0x00fa, B:88:0x0111, B:89:0x0127, B:90:0x0128, B:93:0x0135, B:77:0x00e7, B:97:0x0145, B:98:0x014a, B:22:0x0044, B:25:0x004b, B:38:0x0074, B:40:0x007c, B:48:0x0094, B:47:0x008a, B:29:0x005c, B:31:0x0060, B:33:0x0064, B:35:0x0068, B:99:0x014b, B:100:0x015a), top: B:105:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x010e, B:96:0x0142, B:49:0x0098, B:51:0x009c, B:53:0x00a0, B:56:0x00ac, B:57:0x00b3, B:60:0x00b8, B:62:0x00bc, B:64:0x00c2, B:69:0x00cc, B:71:0x00d3, B:70:0x00cf, B:74:0x00dd, B:84:0x00fa, B:88:0x0111, B:89:0x0127, B:90:0x0128, B:93:0x0135, B:77:0x00e7, B:97:0x0145, B:98:0x014a, B:22:0x0044, B:25:0x004b, B:38:0x0074, B:40:0x007c, B:48:0x0094, B:47:0x008a, B:29:0x005c, B:31:0x0060, B:33:0x0064, B:35:0x0068, B:99:0x014b, B:100:0x015a), top: B:105:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x010e, B:96:0x0142, B:49:0x0098, B:51:0x009c, B:53:0x00a0, B:56:0x00ac, B:57:0x00b3, B:60:0x00b8, B:62:0x00bc, B:64:0x00c2, B:69:0x00cc, B:71:0x00d3, B:70:0x00cf, B:74:0x00dd, B:84:0x00fa, B:88:0x0111, B:89:0x0127, B:90:0x0128, B:93:0x0135, B:77:0x00e7, B:97:0x0145, B:98:0x014a, B:22:0x0044, B:25:0x004b, B:38:0x0074, B:40:0x007c, B:48:0x0094, B:47:0x008a, B:29:0x005c, B:31:0x0060, B:33:0x0064, B:35:0x0068, B:99:0x014b, B:100:0x015a), top: B:105:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x010e, B:96:0x0142, B:49:0x0098, B:51:0x009c, B:53:0x00a0, B:56:0x00ac, B:57:0x00b3, B:60:0x00b8, B:62:0x00bc, B:64:0x00c2, B:69:0x00cc, B:71:0x00d3, B:70:0x00cf, B:74:0x00dd, B:84:0x00fa, B:88:0x0111, B:89:0x0127, B:90:0x0128, B:93:0x0135, B:77:0x00e7, B:97:0x0145, B:98:0x014a, B:22:0x0044, B:25:0x004b, B:38:0x0074, B:40:0x007c, B:48:0x0094, B:47:0x008a, B:29:0x005c, B:31:0x0060, B:33:0x0064, B:35:0x0068, B:99:0x014b, B:100:0x015a), top: B:105:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x010e, B:96:0x0142, B:49:0x0098, B:51:0x009c, B:53:0x00a0, B:56:0x00ac, B:57:0x00b3, B:60:0x00b8, B:62:0x00bc, B:64:0x00c2, B:69:0x00cc, B:71:0x00d3, B:70:0x00cf, B:74:0x00dd, B:84:0x00fa, B:88:0x0111, B:89:0x0127, B:90:0x0128, B:93:0x0135, B:77:0x00e7, B:97:0x0145, B:98:0x014a, B:22:0x0044, B:25:0x004b, B:38:0x0074, B:40:0x007c, B:48:0x0094, B:47:0x008a, B:29:0x005c, B:31:0x0060, B:33:0x0064, B:35:0x0068, B:99:0x014b, B:100:0x015a), top: B:105:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x010e, B:96:0x0142, B:49:0x0098, B:51:0x009c, B:53:0x00a0, B:56:0x00ac, B:57:0x00b3, B:60:0x00b8, B:62:0x00bc, B:64:0x00c2, B:69:0x00cc, B:71:0x00d3, B:70:0x00cf, B:74:0x00dd, B:84:0x00fa, B:88:0x0111, B:89:0x0127, B:90:0x0128, B:93:0x0135, B:77:0x00e7, B:97:0x0145, B:98:0x014a, B:22:0x0044, B:25:0x004b, B:38:0x0074, B:40:0x007c, B:48:0x0094, B:47:0x008a, B:29:0x005c, B:31:0x0060, B:33:0x0064, B:35:0x0068, B:99:0x014b, B:100:0x015a), top: B:105:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x010e, B:96:0x0142, B:49:0x0098, B:51:0x009c, B:53:0x00a0, B:56:0x00ac, B:57:0x00b3, B:60:0x00b8, B:62:0x00bc, B:64:0x00c2, B:69:0x00cc, B:71:0x00d3, B:70:0x00cf, B:74:0x00dd, B:84:0x00fa, B:88:0x0111, B:89:0x0127, B:90:0x0128, B:93:0x0135, B:77:0x00e7, B:97:0x0145, B:98:0x014a, B:22:0x0044, B:25:0x004b, B:38:0x0074, B:40:0x007c, B:48:0x0094, B:47:0x008a, B:29:0x005c, B:31:0x0060, B:33:0x0064, B:35:0x0068, B:99:0x014b, B:100:0x015a), top: B:105:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x010e, B:96:0x0142, B:49:0x0098, B:51:0x009c, B:53:0x00a0, B:56:0x00ac, B:57:0x00b3, B:60:0x00b8, B:62:0x00bc, B:64:0x00c2, B:69:0x00cc, B:71:0x00d3, B:70:0x00cf, B:74:0x00dd, B:84:0x00fa, B:88:0x0111, B:89:0x0127, B:90:0x0128, B:93:0x0135, B:77:0x00e7, B:97:0x0145, B:98:0x014a, B:22:0x0044, B:25:0x004b, B:38:0x0074, B:40:0x007c, B:48:0x0094, B:47:0x008a, B:29:0x005c, B:31:0x0060, B:33:0x0064, B:35:0x0068, B:99:0x014b, B:100:0x015a), top: B:105:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:93:0x0135 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x010e, B:96:0x0142, B:49:0x0098, B:51:0x009c, B:53:0x00a0, B:56:0x00ac, B:57:0x00b3, B:60:0x00b8, B:62:0x00bc, B:64:0x00c2, B:69:0x00cc, B:71:0x00d3, B:70:0x00cf, B:74:0x00dd, B:84:0x00fa, B:88:0x0111, B:89:0x0127, B:90:0x0128, B:93:0x0135, B:77:0x00e7, B:97:0x0145, B:98:0x014a, B:22:0x0044, B:25:0x004b, B:38:0x0074, B:40:0x007c, B:48:0x0094, B:47:0x008a, B:29:0x005c, B:31:0x0060, B:33:0x0064, B:35:0x0068, B:99:0x014b, B:100:0x015a), top: B:105:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0145 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x010e, B:96:0x0142, B:49:0x0098, B:51:0x009c, B:53:0x00a0, B:56:0x00ac, B:57:0x00b3, B:60:0x00b8, B:62:0x00bc, B:64:0x00c2, B:69:0x00cc, B:71:0x00d3, B:70:0x00cf, B:74:0x00dd, B:84:0x00fa, B:88:0x0111, B:89:0x0127, B:90:0x0128, B:93:0x0135, B:77:0x00e7, B:97:0x0145, B:98:0x014a, B:22:0x0044, B:25:0x004b, B:38:0x0074, B:40:0x007c, B:48:0x0094, B:47:0x008a, B:29:0x005c, B:31:0x0060, B:33:0x0064, B:35:0x0068, B:99:0x014b, B:100:0x015a), top: B:105:0x0024 }] */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x013f, code lost:
    
        if (p(r0) == r1) goto L95;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x010b -> B:87:0x010e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0132 -> B:96:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x013f -> B:96:0x0142). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.jrc r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guh.i(jrc, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042 A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #0 {all -> 0x002c, blocks: (B:12:0x0028, B:21:0x0042, B:24:0x004b, B:26:0x0059, B:29:0x0065, B:31:0x006d, B:32:0x0070, B:34:0x0078, B:36:0x007c, B:39:0x0081, B:41:0x008d, B:42:0x0092, B:18:0x0036), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b A[Catch: all -> 0x002c, PHI: r9
  0x004b: PHI (r9v4 java.lang.Object) = (r9v17 java.lang.Object), (r9v1 java.lang.Object) binds: [B:22:0x0048, B:18:0x0036] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x002c, blocks: (B:12:0x0028, B:21:0x0042, B:24:0x004b, B:26:0x0059, B:29:0x0065, B:31:0x006d, B:32:0x0070, B:34:0x0078, B:36:0x007c, B:39:0x0081, B:41:0x008d, B:42:0x0092, B:18:0x0036), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #0 {all -> 0x002c, blocks: (B:12:0x0028, B:21:0x0042, B:24:0x004b, B:26:0x0059, B:29:0x0065, B:31:0x006d, B:32:0x0070, B:34:0x0078, B:36:0x007c, B:39:0x0081, B:41:0x008d, B:42:0x0092, B:18:0x0036), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0070 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:12:0x0028, B:21:0x0042, B:24:0x004b, B:26:0x0059, B:29:0x0065, B:31:0x006d, B:32:0x0070, B:34:0x0078, B:36:0x007c, B:39:0x0081, B:41:0x008d, B:42:0x0092, B:18:0x0036), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0078 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:12:0x0028, B:21:0x0042, B:24:0x004b, B:26:0x0059, B:29:0x0065, B:31:0x006d, B:32:0x0070, B:34:0x0078, B:36:0x007c, B:39:0x0081, B:41:0x008d, B:42:0x0092, B:18:0x0036), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x008d A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:12:0x0028, B:21:0x0042, B:24:0x004b, B:26:0x0059, B:29:0x0065, B:31:0x006d, B:32:0x0070, B:34:0x0078, B:36:0x007c, B:39:0x0081, B:41:0x008d, B:42:0x0092, B:18:0x0036), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x009e -> B:21:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object j(defpackage.nq4 r9) {
        /*
            r8 = this;
            sbi r0 = defpackage.sbi.a
            boolean r1 = r9 instanceof defpackage.auh
            if (r1 == 0) goto L15
            r1 = r9
            auh r1 = (defpackage.auh) r1
            int r2 = r1.f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f = r2
            goto L1a
        L15:
            auh r1 = new auh
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.d
            hu4 r2 = defpackage.hu4.a
            int r3 = r1.f
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2f
            defpackage.ch3.d0(r9)     // Catch: java.lang.Throwable -> L2c
            goto L42
        L2c:
            r9 = move-exception
            goto La1
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            r8 = 0
            return r8
        L36:
            defpackage.ch3.d0(r9)     // Catch: java.lang.Throwable -> L2c
            goto L4b
        L3a:
            defpackage.ch3.d0(r9)
            t31 r9 = r8.l
            r9.c()
        L42:
            r1.f = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r8.l(r1)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r2) goto L4b
            goto La0
        L4b:
            javax.net.ssl.SSLEngineResult r9 = (javax.net.ssl.SSLEngineResult) r9     // Catch: java.lang.Throwable -> L2c
            javax.net.ssl.SSLEngine r3 = r8.a     // Catch: java.lang.Throwable -> L2c
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r3.getHandshakeStatus()     // Catch: java.lang.Throwable -> L2c
            int r6 = r9.bytesProduced()     // Catch: java.lang.Throwable -> L2c
            if (r6 <= 0) goto L65
            int r9 = r9.bytesProduced()     // Catch: java.lang.Throwable -> L2c
            r8.p = r9     // Catch: java.lang.Throwable -> L2c
        L5f:
            t31 r8 = r8.l
            r8.d()
            return r0
        L65:
            javax.net.ssl.SSLEngineResult$Status r6 = r9.getStatus()     // Catch: java.lang.Throwable -> L2c
            javax.net.ssl.SSLEngineResult$Status r7 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.Throwable -> L2c
            if (r6 != r7) goto L70
            r8.j = r5     // Catch: java.lang.Throwable -> L2c
            goto L5f
        L70:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = r9.getHandshakeStatus()     // Catch: java.lang.Throwable -> L2c
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch: java.lang.Throwable -> L2c
            if (r9 == r6) goto L5f
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.Throwable -> L2c
            if (r3 == r9) goto L5f
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch: java.lang.Throwable -> L2c
            if (r3 != r9) goto L81
            goto L5f
        L81:
            t31 r9 = r8.l     // Catch: java.lang.Throwable -> L2c
            java.nio.ByteBuffer r9 = r9.e()     // Catch: java.lang.Throwable -> L2c
            boolean r9 = r9.hasRemaining()     // Catch: java.lang.Throwable -> L2c
            if (r9 != 0) goto L92
            t31 r9 = r8.l     // Catch: java.lang.Throwable -> L2c
            r9.b()     // Catch: java.lang.Throwable -> L2c
        L92:
            t31 r9 = r8.l     // Catch: java.lang.Throwable -> L2c
            java.nio.ByteBuffer r9 = r9.e()     // Catch: java.lang.Throwable -> L2c
            r1.f = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r8.a(r9, r1)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r2) goto L42
        La0:
            return r2
        La1:
            t31 r8 = r8.l
            r8.d()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guh.j(nq4):java.lang.Object");
    }

    public final int k(jrc jrcVar) {
        t31 t31Var = this.n;
        t31Var.e().flip();
        ByteBuffer byteBufferE = t31Var.e();
        jrcVar.getClass();
        int i = jrcVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ByteBuffer byteBuffer = ((ByteBuffer[]) jrcVar.d)[i3];
            if (byteBufferE.hasRemaining()) {
                int iMin = Math.min(byteBufferE.remaining(), byteBuffer.remaining());
                if (iMin < 0) {
                    ore.p("negative length");
                    return 0;
                }
                if (byteBufferE.remaining() < iMin) {
                    c.o(nbh.u("source buffer does not have enough remaining capacity (", byteBufferE.remaining(), " < ", iMin, ")"));
                    return 0;
                }
                if (byteBuffer.remaining() < iMin) {
                    c.o(nbh.u("destination buffer does not have enough remaining capacity (", byteBuffer.remaining(), " < ", iMin, ")"));
                    return 0;
                }
                if (iMin != 0) {
                    byteBuffer.put(byteBufferE.array(), byteBufferE.position(), iMin);
                    byteBufferE.position(byteBufferE.position() + iMin);
                }
                i2 += iMin;
            }
        }
        t31Var.e().compact();
        if (!t31Var.d() && t31Var.e != null) {
            t31Var.f(t31Var.e().position());
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0050 -> B:21:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0062
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object l(defpackage.nq4 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.buh
            if (r0 == 0) goto L13
            r0 = r9
            buh r0 = (defpackage.buh) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            buh r0 = new buh
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 1
            t31 r3 = r8.n
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            jrc r1 = r0.d
            defpackage.ch3.d0(r9)
            goto L53
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            r8 = 0
            return r8
        L30:
            defpackage.ch3.d0(r9)
            jrc r9 = r8.o
            if (r9 == 0) goto L39
        L37:
            r1 = r9
            goto L46
        L39:
            r3.c()
            jrc r9 = new jrc
            java.nio.ByteBuffer r1 = r3.e()
            r9.<init>(r1)
            goto L37
        L46:
            r0.d = r1
            r0.g = r2
            java.lang.Object r9 = r8.c(r1, r0)
            hu4 r4 = defpackage.hu4.a
            if (r9 != r4) goto L53
            return r4
        L53:
            javax.net.ssl.SSLEngineResult r9 = (javax.net.ssl.SSLEngineResult) r9
            javax.net.ssl.SSLEngine r4 = r8.a
            javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = r4.getHandshakeStatus()
            int r5 = r9.bytesProduced()
            if (r5 <= 0) goto L62
            goto Lba
        L62:
            javax.net.ssl.SSLEngineResult$Status r5 = r9.getStatus()
            javax.net.ssl.SSLEngineResult$Status r6 = javax.net.ssl.SSLEngineResult.Status.CLOSED
            if (r5 != r6) goto L6b
            goto Lba
        L6b:
            javax.net.ssl.SSLEngineResult$Status r5 = r9.getStatus()
            javax.net.ssl.SSLEngineResult$Status r6 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW
            if (r5 != r6) goto L74
            goto Lba
        L74:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = r9.getHandshakeStatus()
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED
            if (r5 == r6) goto Lba
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK
            if (r4 == r5) goto Lba
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP
            if (r4 != r5) goto L85
            goto Lba
        L85:
            javax.net.ssl.SSLEngineResult$Status r9 = r9.getStatus()
            javax.net.ssl.SSLEngineResult$Status r4 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW
            if (r9 != r4) goto L46
            jrc r9 = r8.o
            boolean r9 = defpackage.cqk.d(r1, r9)
            if (r9 == 0) goto Lad
            r3.c()
            java.nio.ByteBuffer r9 = r3.e()
            int r9 = r9.capacity()
            long r4 = (long) r9
            long r6 = r1.A()
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto Lb0
            r3.b()
            goto Lb0
        Lad:
            r3.b()
        Lb0:
            jrc r1 = new jrc
            java.nio.ByteBuffer r9 = r3.e()
            r1.<init>(r9)
            goto L46
        Lba:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guh.l(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:37:0x0088, B:39:0x0092, B:25:0x0055, B:29:0x0066, B:31:0x0070, B:34:0x0079, B:43:0x00a4, B:44:0x00a9, B:20:0x0042), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:37:0x0088, B:39:0x0092, B:25:0x0055, B:29:0x0066, B:31:0x0070, B:34:0x0079, B:43:0x00a4, B:44:0x00a9, B:20:0x0042), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0079 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:37:0x0088, B:39:0x0092, B:25:0x0055, B:29:0x0066, B:31:0x0070, B:34:0x0079, B:43:0x00a4, B:44:0x00a9, B:20:0x0042), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:37:0x0088, B:39:0x0092, B:25:0x0055, B:29:0x0066, B:31:0x0070, B:34:0x0079, B:43:0x00a4, B:44:0x00a9, B:20:0x0042), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r14 == r5) goto L36;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0085 -> B:37:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.jrc r13, defpackage.nq4 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.cuh
            if (r0 == 0) goto L13
            r0 = r14
            cuh r0 = (defpackage.cuh) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            cuh r0 = new cuh
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.g
            int r1 = r0.i
            r2 = 2
            r3 = 1
            t31 r4 = r12.m
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L46
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L35
            int r13 = r0.f
            long r6 = r0.e
            jrc r1 = r0.d
            defpackage.ch3.d0(r14)     // Catch: java.lang.Throwable -> L32
            goto L88
        L32:
            r12 = move-exception
            goto Laa
        L35:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r12)
            r12 = 0
            return r12
        L3c:
            int r13 = r0.f
            long r6 = r0.e
            jrc r1 = r0.d
            defpackage.ch3.d0(r14)     // Catch: java.lang.Throwable -> L32
            goto L66
        L46:
            defpackage.ch3.d0(r14)
            long r6 = r13.A()
            r4.c()
            r14 = 0
        L51:
            r1 = 150(0x96, float:2.1E-43)
            if (r14 == r1) goto La4
            r0.d = r13     // Catch: java.lang.Throwable -> L32
            r0.e = r6     // Catch: java.lang.Throwable -> L32
            r0.f = r14     // Catch: java.lang.Throwable -> L32
            r0.i = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r12.b(r0)     // Catch: java.lang.Throwable -> L32
            if (r1 != r5) goto L64
            goto L87
        L64:
            r1 = r13
            r13 = r14
        L66:
            long r8 = r1.A()     // Catch: java.lang.Throwable -> L32
            r10 = 0
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 != 0) goto L79
            java.lang.Long r12 = new java.lang.Long     // Catch: java.lang.Throwable -> L32
            r12.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.d()
            return r12
        L79:
            r0.d = r1     // Catch: java.lang.Throwable -> L32
            r0.e = r6     // Catch: java.lang.Throwable -> L32
            r0.f = r13     // Catch: java.lang.Throwable -> L32
            r0.i = r2     // Catch: java.lang.Throwable -> L32
            java.lang.Object r14 = r12.n(r1, r0)     // Catch: java.lang.Throwable -> L32
            if (r14 != r5) goto L88
        L87:
            return r5
        L88:
            javax.net.ssl.SSLEngineResult r14 = (javax.net.ssl.SSLEngineResult) r14     // Catch: java.lang.Throwable -> L32
            javax.net.ssl.SSLEngineResult$Status r14 = r14.getStatus()     // Catch: java.lang.Throwable -> L32
            javax.net.ssl.SSLEngineResult$Status r8 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.Throwable -> L32
            if (r14 != r8) goto La0
            long r12 = r1.A()     // Catch: java.lang.Throwable -> L32
            long r6 = r6 - r12
            java.lang.Long r12 = new java.lang.Long     // Catch: java.lang.Throwable -> L32
            r12.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.d()
            return r12
        La0:
            int r14 = r13 + 1
            r13 = r1
            goto L51
        La4:
            one.me.sdk.transfer.upload.network.InfiniteLoopException r12 = new one.me.sdk.transfer.upload.network.InfiniteLoopException     // Catch: java.lang.Throwable -> L32
            r12.<init>()     // Catch: java.lang.Throwable -> L32
            throw r12     // Catch: java.lang.Throwable -> L32
        Laa:
            r4.d()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guh.m(jrc, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:18:0x003e). Please report as a decompilation issue!!! */
    public final Object n(jrc jrcVar, nq4 nq4Var) throws UploadUnhandledException.SslEngineOperationException, SSLException {
        duh duhVar;
        Object obj;
        int i;
        if (nq4Var instanceof duh) {
            duhVar = (duh) nq4Var;
            int i2 = duhVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                duhVar.g = i2 - Integer.MIN_VALUE;
            } else {
                duhVar = new duh(this, nq4Var);
            }
        } else {
            duhVar = new duh(this, nq4Var);
        }
        Object objD = duhVar.e;
        int i3 = duhVar.g;
        if (i3 == 0) {
            ch3.d0(objD);
            duhVar.d = jrcVar;
            duhVar.g = 1;
            objD = d(jrcVar, duhVar);
            obj = hu4.a;
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jrcVar = duhVar.d;
            ch3.d0(objD);
        }
        SSLEngineResult sSLEngineResult = (SSLEngineResult) objD;
        SSLEngineResult.Status status = sSLEngineResult.getStatus();
        if (status == null) {
            i = -1;
        } else {
            i = pth.$EnumSwitchMapping$1[status.ordinal()];
        }
        if (i != 1 || i == 2) {
            return sSLEngineResult;
        }
        if (i != 3) {
            if (i == 4) {
                throw new UploadUnhandledException.SslEngineOperationException("[wrapLoop] Incorrect result status: BUFFER_UNDERFLOW");
            }
            ore.o();
            return null;
        }
        this.m.b();
        duhVar.d = jrcVar;
        duhVar.g = 1;
        objD = d(jrcVar, duhVar);
        obj = hu4.a;
        if (objD == obj) {
            return obj;
        }
        SSLEngineResult sSLEngineResult2 = (SSLEngineResult) objD;
        SSLEngineResult.Status status2 = sSLEngineResult2.getStatus();
        if (status2 == null) {
            i = -1;
        } else {
            i = pth.$EnumSwitchMapping$1[status2.ordinal()];
        }
        if (i != 1) {
        }
        return sSLEngineResult2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(jrc jrcVar, nq4 nq4Var) throws UploadUnhandledException.ChannelWriteException {
        euh euhVar;
        if (nq4Var instanceof euh) {
            euhVar = (euh) nq4Var;
            int i = euhVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                euhVar.g = i - Integer.MIN_VALUE;
            } else {
                euhVar = new euh(this, nq4Var);
            }
        } else {
            euhVar = new euh(this, nq4Var);
        }
        Object obj = euhVar.e;
        Object obj2 = hu4.a;
        int i2 = euhVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            if (this.f || this.g || this.i) {
                throw new UploadUnhandledException.ChannelWriteException("Trying to write to channel, but channel is already closed", (Throwable) this.h.get());
            }
            euhVar.d = jrcVar;
            euhVar.g = 1;
            if (g(euhVar) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jrcVar = euhVar.d;
        ch3.d0(obj);
        euhVar.d = null;
        euhVar.g = 2;
        Object objM = m(jrcVar, euhVar);
        return objM == obj2 ? obj2 : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (h(r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(defpackage.nq4 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fuh
            if (r0 == 0) goto L13
            r0 = r7
            fuh r0 = (defpackage.fuh) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            fuh r0 = new fuh
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            t31 r4 = r6.m
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            defpackage.ch3.d0(r7)     // Catch: java.lang.Throwable -> L2c
            goto L51
        L2c:
            r6 = move-exception
            goto L57
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            r6 = 0
            return r6
        L35:
            defpackage.ch3.d0(r7)     // Catch: java.lang.Throwable -> L2c
            goto L48
        L39:
            defpackage.ch3.d0(r7)
            r4.c()
            r0.f = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r6.b(r0)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r5) goto L48
            goto L50
        L48:
            r0.f = r2     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r6 = r6.h(r0)     // Catch: java.lang.Throwable -> L2c
            if (r6 != r5) goto L51
        L50:
            return r5
        L51:
            r4.d()
            sbi r6 = defpackage.sbi.a
            return r6
        L57:
            r4.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guh.p(nq4):java.lang.Object");
    }
}
