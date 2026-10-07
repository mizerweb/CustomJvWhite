package defpackage;

import java.net.URI;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zt6 implements iii {
    public final URI a;
    public final u1i b;
    public final wze c;
    public final mt6 d;
    public final lt6 e;
    public final z18 f;
    public final ny8 h;
    public final ifh i;
    public final ifh m;
    public final ifh n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public volatile long r;
    public volatile x0m s;
    public final uii t;
    public final String g = zt6.class.getName();
    public final l9b j = new l9b();
    public final ifh k = new ifh(new mp5(9, this));
    public final l9b l = new l9b();

    public zt6(ny8 ny8Var, ny8 ny8Var2, ifh ifhVar, ifh ifhVar2, ifh ifhVar3, ny8 ny8Var3, URI uri, u1i u1iVar, wze wzeVar, mt6 mt6Var, lt6 lt6Var, z18 z18Var) {
        this.a = uri;
        this.b = u1iVar;
        this.c = wzeVar;
        this.d = mt6Var;
        this.e = lt6Var;
        this.f = z18Var;
        this.h = ny8Var;
        this.i = new ifh(new dx4(ny8Var2, 13, this));
        this.m = new ifh(new w40(ny8Var, 14));
        this.n = new ifh(new w40(ny8Var3, 15));
        this.o = ifhVar;
        this.p = ifhVar2;
        this.q = ifhVar3;
        this.t = new uii(z18Var, mt6Var, lt6Var, wzeVar);
    }

    public static final ppe b(zt6 zt6Var) {
        return (ppe) zt6Var.i.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        if (r10.e(r12, r11, r15) == r8) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.zt6 r10, defpackage.fd4 r11, defpackage.wfi r12, defpackage.b41 r13, defpackage.ht1 r14, defpackage.nq4 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt6.c(zt6, fd4, wfi, b41, ht1, nq4):java.lang.Object");
    }

    @Override // defpackage.iii
    public final xx6 a() {
        lq4 lq4Var = null;
        int i = 0;
        return new dz6(new bye(new wz6((Object) e9i.H(new qz1(e9i.r(new tt6(this, null)), 1), new wf0(8)), (Object) new ut6(3, lq4Var, i), lq4Var, i)), new np2(this, lq4Var, 2));
    }

    public final void d(long j, long j2) {
        z18 z18Var = this.f;
        int iOrdinal = ((lt6) z18Var.c).b.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            ore.o();
            return;
        }
        String strC = z18Var.c(j, j2);
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbS = qt4.s(j, "Dynamic headers for offset=", ", length=");
                sbS.append(j2);
                sbS.append(":\n");
                sbS.append(strC);
                a4cVar.c(je9Var, str, sbS.toString(), null);
            }
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.m.getValue();
        byteBuffer.clear();
        byteBuffer.put(strC.getBytes(pt2.a));
        byteBuffer.flip();
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0261  */
    /* JADX WARN: Code duplicated, block: B:145:0x0291  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:43:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ae -> B:31:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(defpackage.fd4 r18, defpackage.wfi r19, defpackage.nq4 r20) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt6.e(fd4, wfi, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x0221 A[PHI: r0 r1 r4 r5 r12 r13 r14 r15
  0x0221: PHI (r0v7 java.lang.Object) = (r0v34 java.lang.Object), (r0v35 java.lang.Object) binds: [B:104:0x021d, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x0221: PHI (r1v5 zt6) = (r1v14 zt6), (r1v0 zt6) binds: [B:104:0x021d, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x0221: PHI (r4v9 xt6) = (r4v10 xt6), (r4v2 xt6) binds: [B:104:0x021d, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x0221: PHI (r5v6 qf7) = (r5v7 qf7), (r5v20 qf7) binds: [B:104:0x021d, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x0221: PHI (r12v4 ??) = (r12v19 ??), (r12v14 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:104:0x021d, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x0221: PHI (r13v3 b41) = (r13v6 b41), (r13v18 b41) binds: [B:104:0x021d, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x0221: PHI (r14v3 wfi) = (r14v4 wfi), (r14v18 wfi) binds: [B:104:0x021d, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x0221: PHI (r15v3 fd4) = (r15v4 fd4), (r15v19 fd4) binds: [B:104:0x021d, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x023c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0260  */
    /* JADX WARN: Code duplicated, block: B:118:0x0285  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x012a  */
    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    /* JADX WARN: Code duplicated, block: B:71:0x0156  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x01af  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0278, code lost:
    
        if (r5.invoke(r1, r4) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a1, code lost:
    
        if (r5.invoke(r1, r4) == r2) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Throwable, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r14v14, types: [a4c] */
    /* JADX WARN: Type inference failed for: r1v18, types: [a4c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a4c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v7, types: [a4c] */
    /* JADX WARN: Type inference failed for: r8v8, types: [a4c] */
    /* JADX WARN: Type inference failed for: r9v10, types: [a4c] */
    /* JADX WARN: Type inference failed for: r9v11, types: [a4c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x027b -> B:29:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x02a1 -> B:16:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.fd4 r19, defpackage.wfi r20, defpackage.b41 r21, defpackage.qf7 r22, defpackage.nq4 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt6.f(fd4, wfi, b41, qf7, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x0136 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:15:0x003a, B:65:0x016b, B:68:0x0172, B:70:0x0178, B:55:0x0120, B:61:0x0153, B:58:0x0136, B:60:0x013c), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0169  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j9b] */
    /* JADX WARN: Type inference failed for: r5v12, types: [j9b] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    public final Object g(fd4 fd4Var, wfi wfiVar, nq4 nq4Var) throws Throwable {
        yt6 yt6Var;
        j9b j9bVar;
        wfi wfiVar2;
        fd4 fd4Var2;
        int i;
        ByteBuffer byteBuffer;
        wfi wfiVar3;
        fd4 fd4Var3;
        j9b j9bVar2;
        Throwable th;
        String str;
        a4c a4cVar;
        l9b l9bVar;
        j9b j9bVar3;
        wfi wfiVar4;
        ByteBuffer byteBuffer2;
        String str2;
        a4c a4cVar2;
        ByteBuffer byteBuffer3;
        wfi wfiVar5;
        String str3;
        a4c a4cVar3;
        je9 je9Var = je9.d;
        if (nq4Var instanceof yt6) {
            yt6Var = (yt6) nq4Var;
            int i2 = yt6Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yt6Var.k = i2 - Integer.MIN_VALUE;
            } else {
                yt6Var = new yt6(this, nq4Var);
            }
        } else {
            yt6Var = new yt6(this, nq4Var);
        }
        Object obj = yt6Var.i;
        hu4 hu4Var = hu4.a;
        ?? r5 = yt6Var.k;
        int i3 = 0;
        try {
            try {
                if (r5 == 0) {
                    ch3.d0(obj);
                    j9bVar = this.j;
                    yt6Var.d = fd4Var;
                    wfiVar2 = wfiVar;
                    yt6Var.e = wfiVar2;
                    yt6Var.f = j9bVar;
                    yt6Var.h = 0;
                    yt6Var.k = 1;
                    if (j9bVar.b(yt6Var) != hu4Var) {
                        fd4Var2 = fd4Var;
                        i = 0;
                    }
                    return hu4Var;
                }
                if (r5 == 1) {
                    i = yt6Var.h;
                    j9b j9bVar4 = yt6Var.f;
                    wfiVar2 = yt6Var.e;
                    fd4Var2 = yt6Var.d;
                    ch3.d0(obj);
                    j9bVar = j9bVar4;
                } else {
                    if (r5 == 2) {
                        byteBuffer = yt6Var.g;
                        j9bVar2 = yt6Var.f;
                        wfiVar3 = yt6Var.e;
                        fd4 fd4Var4 = yt6Var.d;
                        try {
                            ch3.d0(obj);
                            j9bVar = j9bVar2;
                            fd4Var3 = fd4Var4;
                            str = this.g;
                            a4cVar = gm0.f;
                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, wfiVar3 + " finish writing static headers: " + byteBuffer, null);
                            }
                            byteBuffer.reset();
                            j9bVar.g(null);
                            l9bVar = this.l;
                            yt6Var.d = fd4Var3;
                            yt6Var.e = wfiVar3;
                            yt6Var.f = l9bVar;
                            yt6Var.g = null;
                            yt6Var.h = 0;
                            yt6Var.k = 3;
                            if (l9bVar.b(yt6Var) != hu4Var) {
                                j9bVar3 = l9bVar;
                                wfiVar4 = wfiVar3;
                                d(wfiVar4.a, wfiVar4.b);
                                byteBuffer2 = (ByteBuffer) this.m.getValue();
                                str2 = this.g;
                                a4cVar2 = gm0.f;
                                if (a4cVar2 == null) {
                                    a4cVar2.c(je9Var, str2, wfiVar4 + " start writing dynamic headers: " + byteBuffer2, null);
                                }
                                yt6Var.d = null;
                                yt6Var.e = wfiVar4;
                                yt6Var.f = j9bVar3;
                                yt6Var.g = byteBuffer2;
                                yt6Var.h = i3;
                                yt6Var.k = 4;
                                if (((nuh) fd4Var3).i(byteBuffer2, yt6Var) != hu4Var) {
                                    byteBuffer3 = byteBuffer2;
                                    wfiVar5 = wfiVar4;
                                    r5 = j9bVar3;
                                }
                            }
                            return hu4Var;
                        } catch (Throwable th2) {
                            th = th2;
                            j9bVar2.g(null);
                            throw th;
                        }
                    }
                    if (r5 == 3) {
                        i3 = yt6Var.h;
                        j9b j9bVar5 = yt6Var.f;
                        wfiVar4 = yt6Var.e;
                        fd4Var3 = yt6Var.d;
                        ch3.d0(obj);
                        j9bVar3 = j9bVar5;
                        d(wfiVar4.a, wfiVar4.b);
                        byteBuffer2 = (ByteBuffer) this.m.getValue();
                        str2 = this.g;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 == null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str2, wfiVar4 + " start writing dynamic headers: " + byteBuffer2, null);
                        }
                        yt6Var.d = null;
                        yt6Var.e = wfiVar4;
                        yt6Var.f = j9bVar3;
                        yt6Var.g = byteBuffer2;
                        yt6Var.h = i3;
                        yt6Var.k = 4;
                        if (((nuh) fd4Var3).i(byteBuffer2, yt6Var) != hu4Var) {
                            byteBuffer3 = byteBuffer2;
                            wfiVar5 = wfiVar4;
                            r5 = j9bVar3;
                        }
                        return hu4Var;
                    }
                    if (r5 != 4) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    byteBuffer3 = yt6Var.g;
                    j9b j9bVar6 = yt6Var.f;
                    wfiVar5 = yt6Var.e;
                    ch3.d0(obj);
                    r5 = j9bVar6;
                }
                str3 = this.g;
                a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str3, wfiVar5 + " finish writing dynamic headers: " + byteBuffer3, null);
                }
                r5.g(null);
                return sbi.a;
                ByteBuffer byteBuffer4 = (ByteBuffer) this.k.getValue();
                byteBuffer4.mark();
                String str4 = this.g;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                    a4cVar4.c(je9Var, str4, wfiVar2 + " start writing static headers: " + byteBuffer4, null);
                }
                yt6Var.d = fd4Var2;
                yt6Var.e = wfiVar2;
                yt6Var.f = j9bVar;
                yt6Var.g = byteBuffer4;
                yt6Var.h = i;
                yt6Var.k = 2;
                nuh nuhVar = (nuh) fd4Var2;
                if (nuhVar.i(byteBuffer4, yt6Var) != hu4Var) {
                    byteBuffer = byteBuffer4;
                    wfiVar3 = wfiVar2;
                    fd4Var3 = nuhVar;
                    str = this.g;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, str, wfiVar3 + " finish writing static headers: " + byteBuffer, null);
                    }
                    byteBuffer.reset();
                    j9bVar.g(null);
                    l9bVar = this.l;
                    yt6Var.d = fd4Var3;
                    yt6Var.e = wfiVar3;
                    yt6Var.f = l9bVar;
                    yt6Var.g = null;
                    yt6Var.h = 0;
                    yt6Var.k = 3;
                    if (l9bVar.b(yt6Var) != hu4Var) {
                        j9bVar3 = l9bVar;
                        wfiVar4 = wfiVar3;
                        d(wfiVar4.a, wfiVar4.b);
                        byteBuffer2 = (ByteBuffer) this.m.getValue();
                        str2 = this.g;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 == null) {
                            a4cVar2.c(je9Var, str2, wfiVar4 + " start writing dynamic headers: " + byteBuffer2, null);
                        }
                        yt6Var.d = null;
                        yt6Var.e = wfiVar4;
                        yt6Var.f = j9bVar3;
                        yt6Var.g = byteBuffer2;
                        yt6Var.h = i3;
                        yt6Var.k = 4;
                        if (((nuh) fd4Var3).i(byteBuffer2, yt6Var) != hu4Var) {
                            byteBuffer3 = byteBuffer2;
                            wfiVar5 = wfiVar4;
                            r5 = j9bVar3;
                            str3 = this.g;
                            a4cVar3 = gm0.f;
                            if (a4cVar3 != null) {
                                a4cVar3.c(je9Var, str3, wfiVar5 + " finish writing dynamic headers: " + byteBuffer3, null);
                            }
                            r5.g(null);
                            return sbi.a;
                        }
                    }
                }
                return hu4Var;
            } catch (Throwable th3) {
                th = th3;
                j9bVar2 = j9bVar;
                j9bVar2.g(null);
                throw th;
            }
        } catch (Throwable th4) {
            r5.g(null);
            throw th4;
        }
    }
}
