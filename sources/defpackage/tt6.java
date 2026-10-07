package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class tt6 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt6(x9h x9hVar, String str, int i, lx2 lx2Var, uii uiiVar, r6a r6aVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 4;
        this.i = x9hVar;
        this.j = str;
        this.g = i;
        this.k = lx2Var;
        this.l = uiiVar;
        this.m = r6aVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object l(zt6 zt6Var, njd njdVar, String str, cf7 cf7Var, cf7 cf7Var2, nq4 nq4Var) throws Throwable {
        st6 st6Var;
        String str2;
        cf7 cf7Var3;
        zt6 zt6Var2;
        CancellationException cancellationException;
        String str3;
        cf7 cf7Var4;
        String str4;
        a4c a4cVar;
        roe roeVar;
        Throwable th;
        cf7 cf7Var5;
        String str5;
        a4c a4cVar2;
        je9 je9Var = je9.f;
        if (nq4Var instanceof st6) {
            st6Var = (st6) nq4Var;
            int i = st6Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                st6Var.j = i - Integer.MIN_VALUE;
            } else {
                st6Var = new st6(nq4Var);
            }
        } else {
            st6Var = new st6(nq4Var);
        }
        Object obj = st6Var.i;
        Object obj2 = hu4.a;
        int i2 = st6Var.j;
        if (i2 == 0) {
            ch3.d0(obj);
            try {
                st6Var.d = zt6Var;
                st6Var.e = njdVar;
                st6Var.f = str;
                st6Var.g = cf7Var;
                st6Var.j = 1;
                Object objInvoke = cf7Var2.invoke(st6Var);
                if (objInvoke != obj2) {
                    return objInvoke;
                }
            } catch (CancellationException e) {
                zt6Var2 = zt6Var;
                cancellationException = e;
                str3 = str;
                cf7Var4 = cf7Var;
                str5 = zt6Var2.g;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str5, c0a.o("During ", str3, " got cancellation exception"), cancellationException);
                }
                if (cf7Var4 != null) {
                    throw cancellationException;
                }
                st6Var.d = null;
                st6Var.e = null;
                st6Var.f = null;
                st6Var.g = null;
                st6Var.h = cancellationException;
                st6Var.j = 2;
                if (cf7Var4.invoke(st6Var) != obj2) {
                    throw cancellationException;
                }
            } catch (Throwable th2) {
                th = th2;
                str2 = str;
                cf7Var3 = cf7Var;
                str4 = zt6Var.g;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str4, c0a.o("During ", str2, " got exception"), th);
                }
                roeVar = new roe(new poe(th));
                st6Var.d = null;
                st6Var.e = null;
                st6Var.f = null;
                st6Var.g = cf7Var3;
                st6Var.h = th;
                st6Var.j = 3;
                if (njdVar.f.a(st6Var, roeVar) != obj2) {
                    th = th;
                    cf7Var5 = cf7Var3;
                    if (cf7Var5 == null) {
                        throw th;
                    }
                    st6Var.d = null;
                    st6Var.e = null;
                    st6Var.f = null;
                    st6Var.g = null;
                    st6Var.h = th;
                    st6Var.j = 4;
                    if (cf7Var5.invoke(st6Var) != obj2) {
                        throw th;
                    }
                }
            }
        } else {
            if (i2 == 1) {
                cf7 cf7Var6 = st6Var.g;
                String str6 = st6Var.f;
                njd njdVar2 = st6Var.e;
                zt6Var2 = st6Var.d;
                try {
                    ch3.d0(obj);
                    return obj;
                } catch (CancellationException e2) {
                    cf7Var4 = cf7Var6;
                    str3 = str6;
                    cancellationException = e2;
                    str5 = zt6Var2.g;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        a4cVar2.c(je9Var, str5, c0a.o("During ", str3, " got cancellation exception"), cancellationException);
                    }
                    if (cf7Var4 != null) {
                        throw cancellationException;
                    }
                    st6Var.d = null;
                    st6Var.e = null;
                    st6Var.f = null;
                    st6Var.g = null;
                    st6Var.h = cancellationException;
                    st6Var.j = 2;
                    if (cf7Var4.invoke(st6Var) != obj2) {
                        return obj2;
                    }
                    throw cancellationException;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = str6;
                    njdVar = njdVar2;
                    cf7Var3 = cf7Var6;
                    zt6Var = zt6Var2;
                    str4 = zt6Var.g;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, str4, c0a.o("During ", str2, " got exception"), th);
                    }
                    roeVar = new roe(new poe(th));
                    st6Var.d = null;
                    st6Var.e = null;
                    st6Var.f = null;
                    st6Var.g = cf7Var3;
                    st6Var.h = th;
                    st6Var.j = 3;
                    if (njdVar.f.a(st6Var, roeVar) != obj2) {
                        th = th;
                        cf7Var5 = cf7Var3;
                        if (cf7Var5 == null) {
                            throw th;
                        }
                        st6Var.d = null;
                        st6Var.e = null;
                        st6Var.f = null;
                        st6Var.g = null;
                        st6Var.h = th;
                        st6Var.j = 4;
                        if (cf7Var5.invoke(st6Var) != obj2) {
                            throw th;
                        }
                    }
                    return obj2;
                }
            }
            if (i2 == 2) {
                CancellationException cancellationException2 = (CancellationException) st6Var.h;
                ch3.d0(obj);
                throw cancellationException2;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th4 = st6Var.h;
                ch3.d0(obj);
                throw th4;
            }
            th = st6Var.h;
            cf7Var5 = st6Var.g;
            ch3.d0(obj);
            if (cf7Var5 == null) {
                throw th;
            }
            st6Var.d = null;
            st6Var.e = null;
            st6Var.f = null;
            st6Var.g = null;
            st6Var.h = th;
            st6Var.j = 4;
            if (cf7Var5.invoke(st6Var) != obj2) {
                throw th;
            }
        }
        return obj2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                tt6 tt6Var = new tt6((zt6) obj2, lq4Var);
                tt6Var.k = obj;
                return tt6Var;
            case 1:
                return new tt6((Throwable) this.j, (x3c) this.k, (Thread.UncaughtExceptionHandler) this.l, (Thread) obj2, lq4Var);
            case 2:
                tt6 tt6Var2 = new tt6((String) this.k, (w8f) this.l, this.g, (String) obj2, lq4Var);
                tt6Var2.j = obj;
                return tt6Var2;
            case 3:
                tt6 tt6Var3 = new tt6((zog) this.l, (omg) obj2, lq4Var, 3);
                tt6Var3.j = obj;
                return tt6Var3;
            case 4:
                return new tt6((x9h) this.i, (String) this.j, this.g, (lx2) this.k, (uii) this.l, (r6a) obj2, lq4Var);
            default:
                tt6 tt6Var4 = new tt6((b7i) this.l, (pk8) obj2, lq4Var, 5);
                tt6Var4.j = obj;
                return tt6Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((tt6) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((tt6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((tt6) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((tt6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((tt6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((tt6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:341:0x078c  */
    /* JADX WARN: Code duplicated, block: B:344:0x07ad A[PHI: r0 r7 r11 r13
  0x07ad: PHI (r0v37 java.lang.Object) = (r0v19 java.lang.Object), (r0v50 java.lang.Object) binds: [B:321:0x06ec, B:342:0x07a9] A[DONT_GENERATE, DONT_INLINE]
  0x07ad: PHI (r7v13 wo8) = (r7v3 wo8), (r7v14 wo8) binds: [B:321:0x06ec, B:342:0x07a9] A[DONT_GENERATE, DONT_INLINE]
  0x07ad: PHI (r11v6 ??) = (r11v44 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r11v60 ??) binds: [B:321:0x06ec, B:342:0x07a9] A[DONT_GENERATE, DONT_INLINE]
  0x07ad: PHI (r13v7 char) = (r13v1 char), (r13v8 char) binds: [B:321:0x06ec, B:342:0x07a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:353:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:356:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:362:0x0812 A[PHI: r0 r7 r8 r11 r13
  0x0812: PHI (r0v34 java.lang.Object) = (r0v22 java.lang.Object), (r0v42 java.lang.Object) binds: [B:320:0x06da, B:360:0x080e] A[DONT_GENERATE, DONT_INLINE]
  0x0812: PHI (r7v12 wo8) = (r7v4 wo8), (r7v13 wo8) binds: [B:320:0x06da, B:360:0x080e] A[DONT_GENERATE, DONT_INLINE]
  0x0812: PHI (r8v6 wfi) = (r8v2 wfi), (r8v8 wfi) binds: [B:320:0x06da, B:360:0x080e] A[DONT_GENERATE, DONT_INLINE]
  0x0812: PHI (r11v5 ??) = (r11v45 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r11v61 ??) binds: [B:320:0x06da, B:360:0x080e] A[DONT_GENERATE, DONT_INLINE]
  0x0812: PHI (r13v6 char) = (r13v2 char), (r13v7 char) binds: [B:320:0x06da, B:360:0x080e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:365:0x0840  */
    /* JADX WARN: Code duplicated, block: B:369:0x0882  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [a4c] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v2, types: [lq4] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v5, types: [lq4] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Throwable, lq4] */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, lq4] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14, types: [zhh] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29, types: [zhh] */
    /* JADX WARN: Type inference failed for: r13v18, types: [pk8] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24, types: [pk8] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r3v12, types: [a4c] */
    /* JADX WARN: Type inference failed for: r3v22, types: [a4c] */
    /* JADX WARN: Type inference failed for: r4v48, types: [bih] */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v72 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:369:0x0882 -> B:370:0x0883). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 2366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt6(zt6 zt6Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.m = zt6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt6(a8j a8jVar, Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.l = a8jVar;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt6(String str, w8f w8fVar, int i, String str2, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.k = str;
        this.l = w8fVar;
        this.g = i;
        this.m = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt6(Throwable th, x3c x3cVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 1;
        this.j = th;
        this.k = x3cVar;
        this.l = uncaughtExceptionHandler;
        this.m = thread;
    }
}
