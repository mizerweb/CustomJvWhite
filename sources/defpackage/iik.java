package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iik extends mdh implements qf7 {
    public l9b e;
    public tgk f;
    public boolean g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ tgk j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iik(tgk tgkVar, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = tgkVar;
        this.k = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        iik iikVar = new iik(this.j, this.k, lq4Var);
        iikVar.i = obj;
        return iikVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((iik) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008d A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r7.b(r9) == r0) goto L37;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            hu4 r0 = defpackage.hu4.a
            int r1 = r9.h
            java.lang.String r2 = "Something went wrong, deferred is null"
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L27
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            defpackage.ch3.d0(r10)
            return r10
        L13:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            return r5
        L19:
            boolean r1 = r9.g
            tgk r6 = r9.f
            l9b r7 = r9.e
            java.lang.Object r8 = r9.i
            gu4 r8 = (defpackage.gu4) r8
            defpackage.ch3.d0(r10)
            goto L5b
        L27:
            defpackage.ch3.d0(r10)
            java.lang.Object r10 = r9.i
            r8 = r10
            gu4 r8 = (defpackage.gu4) r8
            tgk r10 = r9.j
            yf5 r10 = r10.f
            if (r10 == 0) goto L44
            boolean r10 = r9.k
            if (r10 != 0) goto L44
            tgk r10 = r9.j
            yf5 r10 = r10.f
            if (r10 == 0) goto L40
            goto L7e
        L40:
            defpackage.ore.k(r2)
            return r5
        L44:
            tgk r6 = r9.j
            l9b r7 = r6.g
            boolean r1 = r9.k
            r9.i = r8
            r9.e = r7
            r9.f = r6
            r9.g = r1
            r9.h = r4
            java.lang.Object r10 = r7.b(r9)
            if (r10 != r0) goto L5b
            goto L8c
        L5b:
            yf5 r10 = r6.f     // Catch: java.lang.Throwable -> L6c
            if (r10 == 0) goto L6e
            if (r1 != 0) goto L6e
            yf5 r10 = r6.f     // Catch: java.lang.Throwable -> L6c
            if (r10 == 0) goto L66
            goto L7b
        L66:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6c
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L6c
            throw r9     // Catch: java.lang.Throwable -> L6c
        L6c:
            r9 = move-exception
            goto L8e
        L6e:
            ohk r10 = new ohk     // Catch: java.lang.Throwable -> L6c
            r10.<init>(r6, r5, r4)     // Catch: java.lang.Throwable -> L6c
            r1 = 3
            r2 = 0
            yf5 r10 = defpackage.yab.h(r8, r5, r2, r10, r1)     // Catch: java.lang.Throwable -> L6c
            r6.f = r10     // Catch: java.lang.Throwable -> L6c
        L7b:
            r7.g(r5)
        L7e:
            r9.i = r5
            r9.e = r5
            r9.f = r5
            r9.h = r3
            java.lang.Object r9 = r10.p(r9)
            if (r9 != r0) goto L8d
        L8c:
            return r0
        L8d:
            return r9
        L8e:
            r7.g(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iik.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
