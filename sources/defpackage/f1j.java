package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes3.dex */
public final class f1j extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public long g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1j(i8e i8eVar, rt2 rt2Var, long j, ufe ufeVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 12;
        this.h = i8eVar;
        this.i = rt2Var;
        this.g = j;
        this.j = ufeVar;
    }

    private final Object l(Object obj) {
        x7e x7eVar;
        x7e x7eVar2;
        z5e z5eVar;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            jsa jsaVar = (jsa) this.i;
            long j = this.g;
            s5e s5eVar = (s5e) this.j;
            zv8[] zv8VarArr = jsa.Z2;
            MessageModel messageModelR = jsaVar.R(j);
            if (messageModelR == null) {
                gm0.Y(jsa.class.getName(), "Early return in extractSelfReactionData cuz of findMessageModel(messageId) is null");
                x7eVar = null;
            } else {
                x7eVar = new x7e(s5eVar, messageModelR.r() ? messageModelR.u : messageModelR.a, messageModelR.b, messageModelR.w);
            }
            jsa jsaVar2 = (jsa) this.i;
            if (x7eVar != null) {
                lk9 lk9VarC = ((n0c) jsaVar2.j).c();
                zw9 zw9Var = new zw9((jsa) this.i, this.g, x7eVar, (lq4) null, 10);
                this.h = x7eVar;
                this.f = 1;
                if (yab.K0(lk9VarC, zw9Var, this) != hu4Var) {
                    x7eVar2 = x7eVar;
                }
                return hu4Var;
            }
            String str = jsaVar2.v;
            long j2 = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, nbh.s(j2, "handleReactionClick: message ", " is null"), null);
                }
            }
            return sbiVar;
        }
        if (i != 1) {
            if (i == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        x7eVar2 = (x7e) this.h;
        ch3.d0(obj);
        kja kjaVar = x7eVar2.d;
        if (!cqk.d((kjaVar == null || (z5eVar = kjaVar.c) == null) ? null : z5eVar.b, (s5e) this.j)) {
            lk9 lk9VarC2 = ((n0c) ((jsa) this.i).j).c();
            wqa wqaVar = new wqa((jsa) this.i, null, 1);
            this.h = null;
            this.f = 2;
            if (yab.K0(lk9VarC2, wqaVar, this) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    private final Object n(Object obj) {
        rt2 rt2Var;
        u40 u40Var;
        jsa jsaVar;
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rt2Var = (rt2) this.h;
            try {
                ch3.d0(obj);
                jsa jsaVar2 = (jsa) this.j;
                zv8[] zv8VarArr = jsa.Z2;
                jsaVar2.h0().c(new kfi(rt2Var.a, this.g, false));
                return sbiVar;
            } catch (Throwable th) {
                th = th;
                try {
                    jsa jsaVar3 = (jsa) this.j;
                    zv8[] zv8VarArr2 = jsa.Z2;
                    jsaVar3.n0(true, th);
                    jsaVar = (jsa) this.j;
                    return sbiVar;
                } finally {
                    jsaVar = (jsa) this.j;
                    zv8[] zv8VarArr3 = jsa.Z2;
                    jsaVar.h0().c(new kfi(rt2Var.a, this.g, false));
                }
            }
        }
        ch3.d0(obj);
        rt2 rt2Var2 = (rt2) ((jsa) this.j).w2.a.getValue();
        if (rt2Var2 == null) {
            String str = ((jsa) this.j).v;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "poll revote: chat is null", null);
                return sbiVar;
            }
        } else {
            long jA = rt2Var2.A();
            MessageModel messageModelH = ((opa) ((jsa) this.j).z2.a.getValue()).h(this.g);
            t50 t50Var = (messageModelH == null || (u40Var = messageModelH.j) == null) ? null : u40Var.b;
            e7d e7dVar = t50Var instanceof e7d ? (e7d) t50Var : null;
            if (e7dVar != null) {
                long j = e7dVar.b;
                try {
                    y9d y9dVar = (y9d) ((jsa) this.j).J1.getValue();
                    f8b f8bVar = jj8.a;
                    long j2 = this.g;
                    this.i = null;
                    this.h = rt2Var2;
                    this.f = 1;
                    ghb ghbVar = ew5.b;
                    if (y9dVar.a(jA, j, j2, f8bVar, qe7.O(5, lw5.SECONDS), this) == hu4Var) {
                        return hu4Var;
                    }
                    rt2Var = rt2Var2;
                    jsa jsaVar4 = (jsa) this.j;
                    zv8[] zv8VarArr4 = jsa.Z2;
                    jsaVar4.h0().c(new kfi(rt2Var.a, this.g, false));
                    return sbiVar;
                } catch (Throwable th2) {
                    th = th2;
                    rt2Var = rt2Var2;
                    jsa jsaVar5 = (jsa) this.j;
                    zv8[] zv8VarArr5 = jsa.Z2;
                    jsaVar5.n0(true, th);
                    jsaVar = (jsa) this.j;
                    return sbiVar;
                }
            }
            jsa jsaVar6 = (jsa) this.j;
            long j3 = this.g;
            String str2 = jsaVar6.v;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, nbh.s(j3, "poll revote: pollId for message(", ") is null"), null);
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0141  */
    /* JADX WARN: Code duplicated, block: B:57:0x0144  */
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x015d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x0169  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x01f8  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0198, code lost:
    
        if (r0 == r7) goto L82;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x0147, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1j.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r3.e(r1, r11) == r9) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r12) {
        /*
            r11 = this;
            long r0 = r11.g
            java.lang.Object r2 = r11.j
            s4f r2 = (defpackage.s4f) r2
            j52 r3 = r2.a
            int r4 = r11.f
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            hu4 r9 = defpackage.hu4.a
            if (r4 == 0) goto L3f
            if (r4 == r7) goto L37
            if (r4 == r6) goto L29
            if (r4 != r5) goto L23
            java.lang.Object r11 = r11.i
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            defpackage.ch3.d0(r12)
            goto Lb7
        L23:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            return r8
        L29:
            java.lang.Object r0 = r11.i
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.Object r1 = r11.h
            java.util.Set r1 = (java.util.Set) r1
            defpackage.ch3.d0(r12)
            goto L84
        L37:
            java.lang.Object r4 = r11.h
            java.util.Set r4 = (java.util.Set) r4
            defpackage.ch3.d0(r12)
            goto L5a
        L3f:
            defpackage.ch3.d0(r12)
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r0)
            java.util.Set r12 = java.util.Collections.singleton(r12)
            r11.h = r12
            r11.f = r7
            java.lang.Object r4 = r3.c(r12, r11)
            if (r4 != r9) goto L57
            goto Lb6
        L57:
            r10 = r4
            r4 = r12
            r12 = r10
        L5a:
            java.util.Map r12 = (java.util.Map) r12
            java.util.Collection r12 = r12.values()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r12 = defpackage.ww3.s1(r12)
            q42 r12 = (defpackage.q42) r12
            if (r12 == 0) goto L6f
            java.lang.CharSequence r12 = r12.getName()
            goto L70
        L6f:
            r12 = r8
        L70:
            r11.h = r4
            r7 = r12
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r11.i = r7
            r11.f = r6
            java.lang.Object r0 = r3.d(r0, r11)
            if (r0 != r9) goto L80
            goto Lb6
        L80:
            r1 = r0
            r0 = r12
            r12 = r1
            r1 = r4
        L84:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto Laa
            if (r0 == 0) goto Laa
            boolean r12 = defpackage.r5h.X0(r0)
            if (r12 == 0) goto L95
            goto Laa
        L95:
            mjg r12 = r2.j
        L97:
            java.lang.Object r11 = r12.getValue()
            r1 = r11
            t4f r1 = (defpackage.t4f) r1
            r2 = 7
            t4f r1 = defpackage.t4f.a(r1, r8, r8, r0, r2)
            boolean r11 = r12.h(r11, r1)
            if (r11 == 0) goto L97
            goto Lb7
        Laa:
            r11.h = r8
            r11.i = r8
            r11.f = r5
            java.lang.Object r11 = r3.e(r1, r11)
            if (r11 != r9) goto Lb7
        Lb6:
            return r9
        Lb7:
            sbi r11 = defpackage.sbi.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1j.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[Catch: all -> 0x003a, CancellationException -> 0x003d, TryCatch #1 {CancellationException -> 0x003d, blocks: (B:14:0x0036, B:28:0x0096, B:31:0x00a7, B:33:0x00af, B:19:0x0040, B:25:0x006a, B:22:0x0049), top: B:56:0x0010, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00af A[Catch: all -> 0x003a, CancellationException -> 0x003d, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x003d, blocks: (B:14:0x0036, B:28:0x0096, B:31:0x00a7, B:33:0x00af, B:19:0x0040, B:25:0x006a, B:22:0x0049), top: B:56:0x0010, outer: #0 }] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
    
        if (defpackage.vdi.a(r0, r3, r5, r18) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012e, code lost:
    
        if (defpackage.vdi.a(r0, r3, r6, r18) == r2) goto L54;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00af, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object q(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1j.q(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            k5j k5jVar = (k5j) this.h;
            Long l = new Long(this.g);
            List listSingletonList = Collections.singletonList(new h5j((String) this.i, (List) this.j));
            this.f = 1;
            Object objR = k5jVar.r(l, listSingletonList, this);
            hu4 hu4Var = hu4.a;
            if (objR == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    /* JADX WARN: Type inference failed for: r7v15, types: [java.io.Serializable, long[]] */
    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new f1j((v3j) this.h, (g1j) this.i, (xzi) obj2, lq4Var, 0);
            case 1:
                f1j f1jVar = new f1j((e70) this.i, (dg0) obj2, this.g, lq4Var, 1);
                f1jVar.h = obj;
                return f1jVar;
            case 2:
                f1j f1jVar2 = new f1j((r8e) this.i, lq4Var, (gu2) obj2, this.g);
                f1jVar2.h = obj;
                return f1jVar2;
            case 3:
                f1j f1jVar3 = new f1j((sfa) this.i, (qw2) obj2, this.g, lq4Var, 3);
                f1jVar3.h = obj;
                return f1jVar3;
            case 4:
                return new f1j((s73) this.h, this.g, (List) this.i, (r17) obj2, lq4Var, 4);
            case 5:
                f1j f1jVar4 = new f1j((rl3) this.i, (String) obj2, this.g, lq4Var, 5);
                f1jVar4.h = obj;
                return f1jVar4;
            case 6:
                return new f1j((rl3) obj2, this.g, lq4Var, 6);
            case 7:
                return new f1j(this.g, (o17) this.h, (kli) this.i, (i64) obj2, lq4Var);
            case 8:
                return new f1j((e70) this.h, (lx9) this.i, (hb9) obj2, lq4Var, 8);
            case 9:
                return new f1j((jsa) this.i, this.g, (s5e) obj2, lq4Var, 9);
            case 10:
                f1j f1jVar5 = new f1j((jsa) obj2, this.g, lq4Var, 10);
                f1jVar5.i = obj;
                return f1jVar5;
            case 11:
                return new f1j(this.g, (dkb) this.i, (gkb) obj2, lq4Var);
            case 12:
                return new f1j((i8e) this.h, (rt2) this.i, this.g, (ufe) obj2, lq4Var);
            case 13:
                return new f1j(this.g, (s4f) obj2, lq4Var);
            case 14:
                return new f1j((hff) this.h, (CharSequence) this.i, (hb9) obj2, this.g, lq4Var);
            case 15:
                return new f1j(this.i, this.g, (Serializable) obj2, lq4Var, 15);
            case 16:
                return new f1j((k5j) this.h, this.g, (String) this.i, (List) obj2, lq4Var, 16);
            default:
                return new f1j((ioj) this.h, (String) this.i, (String) obj2, lq4Var, 17);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((f1j) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((f1j) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((f1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:231:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:233:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:454:0x0a82  */
    /* JADX WARN: Code duplicated, block: B:456:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:459:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:461:0x0a97  */
    /* JADX WARN: Code duplicated, block: B:462:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:465:0x0aaf  */
    /* JADX WARN: Code duplicated, block: B:499:0x0c5e  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v149 java.lang.Object, still in use, count: 2, list:
          (r2v149 java.lang.Object) from 0x012b: PHI (r2 I:??) = (r2v145 java.lang.Object), (r2v149 java.lang.Object) binds: [B:60:0x012a, B:512:0x012b] A[DONT_GENERATE, DONT_INLINE]
          (r2v149 java.lang.Object) from 0x011f: CHECK_CAST (bdj) (r2v149 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 3290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1j(long j, dkb dkbVar, gkb gkbVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 11;
        this.g = j;
        this.i = dkbVar;
        this.j = gkbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1j(long j, s4f s4fVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 13;
        this.g = j;
        this.j = s4fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1j(long j, o17 o17Var, kli kliVar, i64 i64Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 7;
        this.g = j;
        this.h = o17Var;
        this.i = kliVar;
        this.j = i64Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1j(r8e r8eVar, lq4 lq4Var, gu2 gu2Var, long j) {
        super(2, lq4Var);
        this.e = 2;
        this.i = r8eVar;
        this.j = gu2Var;
        this.g = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1j(hff hffVar, CharSequence charSequence, hb9 hb9Var, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 14;
        this.h = hffVar;
        this.i = charSequence;
        this.j = hb9Var;
        this.g = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1j(a8j a8jVar, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.j = a8jVar;
        this.g = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1j(Object obj, long j, Serializable serializable, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.g = j;
        this.j = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1j(Object obj, long j, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.g = j;
        this.i = obj2;
        this.j = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1j(Object obj, Object obj2, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.j = obj2;
        this.g = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1j(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }
}
