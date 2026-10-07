package defpackage;

import android.net.TrafficStats;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import one.me.sdk.transfer.upload.exceptions.UploadUnhandledException;

/* JADX INFO: loaded from: classes3.dex */
public final class nuh implements fd4 {
    public static final AtomicInteger m = new AtomicInteger(0);
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public volatile boolean d;
    public final ny8 f;
    public final ny8 g;
    public volatile guh i;
    public volatile AsynchronousChannelGroup j;
    public volatile AsynchronousSocketChannel k;
    public final ifh l;
    public final l9b e = new l9b();
    public final String h = qt4.j(m.incrementAndGet(), nuh.class.getName(), ":");

    public nuh(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var3;
        this.b = ny8Var4;
        this.c = ny8Var5;
        this.f = ny8Var;
        this.g = ny8Var2;
        this.l = new ifh(new eke(ny8Var, 5));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        if (r2.b(r7, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.nq4 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.huh
            if (r0 == 0) goto L13
            r0 = r7
            huh r0 = (defpackage.huh) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            huh r0 = new huh
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.d
            hu4 r1 = defpackage.hu4.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            defpackage.ch3.d0(r7)     // Catch: java.lang.Throwable -> L2b
            goto L5c
        L2b:
            r7 = move-exception
            goto L7d
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r5
        L33:
            defpackage.ch3.d0(r7)     // Catch: java.lang.Throwable -> L2b
            goto L47
        L37:
            defpackage.ch3.d0(r7)
            guh r7 = r6.i     // Catch: java.lang.Throwable -> L2b
            if (r7 == 0) goto L47
            r0.f = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r7.e(r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r1) goto L47
            goto L5b
        L47:
            r6.i = r5     // Catch: java.lang.Throwable -> L2b
            java.nio.channels.AsynchronousChannelGroup r7 = r6.j     // Catch: java.lang.Throwable -> L2b
            if (r7 == 0) goto L5c
            nd4 r2 = r6.f()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L5c
            r0.f = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r2.b(r7, r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r1) goto L5c
        L5b:
            return r1
        L5c:
            r6.j = r5     // Catch: java.lang.Throwable -> L2b
            r6.k = r5     // Catch: java.lang.Throwable -> L2b
            r7 = 0
            r6.d = r7     // Catch: java.lang.Throwable -> L2b
            ifh r7 = r6.l
            boolean r7 = r7.d()
            if (r7 == 0) goto L7a
            ny8 r7 = r6.f
            java.lang.Object r7 = r7.getValue()
            o31 r7 = (defpackage.o31) r7
            java.nio.ByteBuffer r6 = r6.g()
            r7.b(r6)
        L7a:
            sbi r6 = defpackage.sbi.a
            return r6
        L7d:
            ifh r0 = r6.l
            boolean r0 = r0.d()
            if (r0 == 0) goto L94
            ny8 r0 = r6.f
            java.lang.Object r0 = r0.getValue()
            o31 r0 = (defpackage.o31) r0
            java.nio.ByteBuffer r6 = r6.g()
            r0.b(r6)
        L94:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuh.a(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010d A[Catch: all -> 0x00a8, Exception -> 0x011a, TRY_LEAVE, TryCatch #3 {Exception -> 0x011a, blocks: (B:52:0x0101, B:54:0x010d, B:59:0x011c, B:60:0x0123), top: B:89:0x0101, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x011c A[Catch: all -> 0x00a8, Exception -> 0x011a, TRY_ENTER, TryCatch #3 {Exception -> 0x011a, blocks: (B:52:0x0101, B:54:0x010d, B:59:0x011c, B:60:0x0123), top: B:89:0x0101, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, int i, dii diiVar, nq4 nq4Var) throws Throwable {
        iuh iuhVar;
        int i2;
        j9b j9bVar;
        String str2;
        int i3;
        SSLEngine sSLEngineE;
        int i4;
        int i5;
        int i6;
        int i7;
        j9b j9bVar2;
        dd4 dd4Var;
        int i8;
        j9b j9bVar3;
        Exception exc;
        int i9;
        int i10;
        int i11;
        o31 o31Var;
        AsynchronousSocketChannel asynchronousSocketChannel;
        nd4 nd4VarF;
        Exception exc2;
        if (nq4Var instanceof iuh) {
            iuhVar = (iuh) nq4Var;
            int i12 = iuhVar.n;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                iuhVar.n = i12 - Integer.MIN_VALUE;
            } else {
                iuhVar = new iuh(this, nq4Var);
            }
        } else {
            iuhVar = new iuh(this, nq4Var);
        }
        Object obj = iuhVar.l;
        Serializable serializable = hu4.a;
        int i13 = iuhVar.n;
        try {
            if (i13 == 0) {
                ch3.d0(obj);
                l9b l9bVar = this.e;
                iuhVar.d = str;
                iuhVar.e = l9bVar;
                i2 = i;
                iuhVar.h = i2;
                iuhVar.i = 0;
                iuhVar.n = 1;
                if (l9bVar.b(iuhVar) != serializable) {
                    j9bVar = l9bVar;
                    str2 = str;
                    i3 = 0;
                }
                return serializable;
            }
            if (i13 != 1) {
                if (i13 == 2) {
                    i6 = iuhVar.k;
                    i7 = iuhVar.j;
                    i5 = iuhVar.i;
                    int i14 = iuhVar.h;
                    SSLEngine sSLEngine = iuhVar.f;
                    j9b j9bVar4 = iuhVar.e;
                    try {
                        ch3.d0(obj);
                        i4 = i14;
                        j9bVar = j9bVar4;
                        sSLEngineE = sSLEngine;
                        e5i e5iVar = (e5i) obj;
                        AsynchronousChannelGroup asynchronousChannelGroup = (AsynchronousChannelGroup) e5iVar.a;
                        AsynchronousSocketChannel asynchronousSocketChannel2 = (AsynchronousSocketChannel) e5iVar.b;
                        dd4Var = (dd4) e5iVar.c;
                        this.j = asynchronousChannelGroup;
                        this.k = asynchronousSocketChannel2;
                        try {
                            o31Var = (o31) this.f.getValue();
                            asynchronousSocketChannel = this.k;
                            if (asynchronousSocketChannel != null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            this.i = new guh(o31Var, sSLEngineE, asynchronousSocketChannel);
                            this.d = true;
                            j9bVar.g(null);
                            return dd4Var;
                        } catch (Exception e) {
                            e = e;
                            gm0.V(this.h, "Got exception during connecting", e);
                            this.d = false;
                            guh guhVar = this.i;
                            if (guhVar != null) {
                                iuhVar.d = null;
                                iuhVar.e = j9bVar;
                                iuhVar.f = null;
                                iuhVar.g = e;
                                iuhVar.h = i4;
                                iuhVar.i = i5;
                                iuhVar.j = i7;
                                iuhVar.k = i6;
                                iuhVar.n = 3;
                                if (guhVar.e(iuhVar) != serializable) {
                                    exc = e;
                                    i9 = i7;
                                    i10 = i5;
                                    j9bVar3 = j9bVar;
                                    i11 = i4;
                                }
                            } else {
                                i8 = i5;
                                j9bVar3 = j9bVar;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        j9bVar2 = j9bVar4;
                        j9bVar2.g(null);
                        throw th;
                    }
                } else {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        exc2 = iuhVar.g;
                        j9bVar2 = iuhVar.e;
                        try {
                            ch3.d0(obj);
                            j9bVar3 = j9bVar2;
                            e = exc2;
                            j9bVar2 = j9bVar3;
                            this.j = null;
                            this.k = null;
                            throw new UploadUnhandledException.ChannelConnectException("Can't connect to a TLS channel", e);
                        } catch (Throwable th2) {
                            th = th2;
                            j9bVar2.g(null);
                            throw th;
                        }
                    }
                    i6 = iuhVar.k;
                    i9 = iuhVar.j;
                    i10 = iuhVar.i;
                    i11 = iuhVar.h;
                    exc = iuhVar.g;
                    j9bVar3 = iuhVar.e;
                    try {
                        ch3.d0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        j9bVar2 = j9bVar3;
                        j9bVar2.g(null);
                        throw th;
                    }
                }
                i8 = i10;
                i4 = i11;
                e = exc;
                i7 = i9;
                this.i = null;
                AsynchronousChannelGroup asynchronousChannelGroup2 = this.j;
                if (asynchronousChannelGroup2 != null && (nd4VarF = f()) != null) {
                    iuhVar.d = null;
                    iuhVar.e = j9bVar3;
                    iuhVar.f = null;
                    iuhVar.g = e;
                    iuhVar.h = i4;
                    iuhVar.i = i8;
                    iuhVar.j = i7;
                    iuhVar.k = i6;
                    iuhVar.n = 4;
                    if (nd4VarF.b(asynchronousChannelGroup2, iuhVar) != serializable) {
                        exc2 = e;
                        j9bVar2 = j9bVar3;
                        j9bVar3 = j9bVar2;
                        e = exc2;
                    }
                    return serializable;
                }
                j9bVar2 = j9bVar3;
                this.j = null;
                this.k = null;
                throw new UploadUnhandledException.ChannelConnectException("Can't connect to a TLS channel", e);
            } else {
                i3 = iuhVar.i;
                i2 = iuhVar.h;
                j9bVar = iuhVar.e;
                str2 = iuhVar.d;
                ch3.d0(obj);
            }
            if (this.d) {
                cd4 cd4Var = cd4.a;
                j9bVar.g(null);
                return cd4Var;
            }
            ((bd5) this.b.getValue()).getClass();
            int iIntValue = new Integer(i2 != -1 ? i2 : 443).intValue();
            sSLEngineE = e(iIntValue, str2);
            TrafficStats.setThreadStatsTag(str2.hashCode());
            iuhVar.d = null;
            iuhVar.e = j9bVar;
            iuhVar.f = sSLEngineE;
            iuhVar.h = i2;
            iuhVar.i = i3;
            iuhVar.j = 0;
            iuhVar.k = iIntValue;
            iuhVar.n = 2;
            Serializable serializableC = c(str2, iIntValue, iuhVar);
            if (serializableC != serializable) {
                i4 = i2;
                i5 = i3;
                i6 = iIntValue;
                obj = serializableC;
                i7 = 0;
                e5i e5iVar2 = (e5i) obj;
                AsynchronousChannelGroup asynchronousChannelGroup3 = (AsynchronousChannelGroup) e5iVar2.a;
                AsynchronousSocketChannel asynchronousSocketChannel3 = (AsynchronousSocketChannel) e5iVar2.b;
                dd4Var = (dd4) e5iVar2.c;
                this.j = asynchronousChannelGroup3;
                this.k = asynchronousSocketChannel3;
                o31Var = (o31) this.f.getValue();
                asynchronousSocketChannel = this.k;
                if (asynchronousSocketChannel != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.i = new guh(o31Var, sSLEngineE, asynchronousSocketChannel);
                this.d = true;
                j9bVar.g(null);
                return dd4Var;
            }
            return serializable;
        } catch (Throwable th4) {
            th = th4;
            j9bVar2 = j9bVar;
            j9bVar2.g(null);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01d5: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:51:0x01d3 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01e8: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:53:0x01e6 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01d6: MOVE (r11 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:51:0x01d3 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x01dd: MOVE (r13 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:51:0x01d3 */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x01e2: MOVE (r10 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r16 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:51:0x01d3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:202:0x0525 -> B:203:0x052a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18981. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.io.Serializable c(java.lang.String r21, int r22, defpackage.nq4 r23) {
        /*
            Method dump skipped, instruction units count: 1898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuh.c(java.lang.String, int, nq4):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(AsynchronousChannelGroup asynchronousChannelGroup, nq4 nq4Var) {
        kuh kuhVar;
        if (nq4Var instanceof kuh) {
            kuhVar = (kuh) nq4Var;
            int i = kuhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kuhVar.f = i - Integer.MIN_VALUE;
            } else {
                kuhVar = new kuh(this, nq4Var);
            }
        } else {
            kuhVar = new kuh(this, nq4Var);
        }
        Object obj = kuhVar.d;
        int i2 = kuhVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        bpg bpgVar = new bpg(15, asynchronousChannelGroup);
        kuhVar.f = 1;
        Object objV = qyj.V(k66.a, bpgVar, kuhVar);
        hu4 hu4Var = hu4.a;
        return objV == hu4Var ? hu4Var : objV;
    }

    public final SSLEngine e(int i, String str) throws UploadUnhandledException.SslEngineCreateException {
        try {
            SSLEngine sSLEngineCreateSSLEngine = ((SSLContext) ((hxb) this.c.getValue()).a.getValue()).createSSLEngine(str, i);
            sSLEngineCreateSSLEngine.setUseClientMode(true);
            return sSLEngineCreateSSLEngine;
        } catch (IllegalStateException e) {
            throw new UploadUnhandledException.SslEngineCreateException("SSLContext is not initialized", e);
        } catch (UnsupportedOperationException e2) {
            throw new UploadUnhandledException.SslEngineCreateException("SSLContext can't be used to create SSLEngine", e2);
        } catch (Throwable th) {
            throw new UploadUnhandledException.SslEngineCreateException("SSLEngine is not created", th);
        }
    }

    public final nd4 f() {
        return (nd4) this.g.getValue();
    }

    public final ByteBuffer g() {
        return (ByteBuffer) this.l.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ByteBuffer byteBuffer, nq4 nq4Var) throws UploadUnhandledException {
        luh luhVar;
        if (nq4Var instanceof luh) {
            luhVar = (luh) nq4Var;
            int i = luhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                luhVar.f = i - Integer.MIN_VALUE;
            } else {
                luhVar = new luh(this, nq4Var);
            }
        } else {
            luhVar = new luh(this, nq4Var);
        }
        Object objI = luhVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = luhVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objI);
                guh guhVar = this.i;
                if (guhVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                luhVar.f = 1;
                objI = guhVar.i(new jrc(byteBuffer), luhVar);
                if (objI == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objI);
            }
            return new Integer(((Number) objI).intValue());
        } catch (CancellationException e) {
            throw e;
        } catch (UploadUnhandledException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new UploadUnhandledException.ChannelReadException("Exception while reading from tls channel", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ByteBuffer byteBuffer, nq4 nq4Var) throws UploadUnhandledException {
        muh muhVar;
        if (nq4Var instanceof muh) {
            muhVar = (muh) nq4Var;
            int i = muhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                muhVar.f = i - Integer.MIN_VALUE;
            } else {
                muhVar = new muh(this, nq4Var);
            }
        } else {
            muhVar = new muh(this, nq4Var);
        }
        Object objO = muhVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = muhVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objO);
                guh guhVar = this.i;
                if (guhVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                muhVar.f = 1;
                objO = guhVar.o(new jrc(byteBuffer), muhVar);
                if (objO == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objO);
            }
            return new Long(((Number) objO).longValue());
        } catch (CancellationException e) {
            throw e;
        } catch (UploadUnhandledException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new UploadUnhandledException.ChannelWriteException("Exception while writing to tls channel", th);
        }
    }
}
