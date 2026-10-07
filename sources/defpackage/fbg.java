package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class fbg implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fbg(Serializable serializable, yx6 yx6Var, int i) {
        this.a = i;
        this.c = serializable;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(int i, lq4 lq4Var) {
        lig ligVar;
        if (lq4Var instanceof lig) {
            ligVar = (lig) lq4Var;
            int i2 = ligVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ligVar.f = i2 - Integer.MIN_VALUE;
            } else {
                ligVar = new lig(this, lq4Var);
            }
        } else {
            ligVar = new lig(this, lq4Var);
        }
        Object obj = ligVar.d;
        int i3 = ligVar.f;
        sbi sbiVar = sbi.a;
        if (i3 != 0) {
            if (i3 == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        if (i > 0) {
            sfe sfeVar = (sfe) this.c;
            if (!sfeVar.a) {
                sfeVar.a = true;
                yx6 yx6Var = (yx6) this.b;
                ligVar.f = 1;
                Object objEmit = yx6Var.emit(h0g.a, ligVar);
                hu4 hu4Var = hu4.a;
                if (objEmit == hu4Var) {
                    return hu4Var;
                }
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:137:0x025d  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:182:0x033b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0385  */
    /* JADX WARN: Code duplicated, block: B:233:0x0415  */
    /* JADX WARN: Code duplicated, block: B:251:0x0464  */
    /* JADX WARN: Code duplicated, block: B:286:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x0129  */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0241, code lost:
    
        if (r0.emit(r2, r3) == r8) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0306, code lost:
    
        if (r0.emit(r1, r10) == r8) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        if (r6.emit(r1, r10) == r8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        if (r2.emit(r6, r3) == r8) goto L96;
     */
    @Override // defpackage.yx6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r18, defpackage.lq4 r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbg.emit(java.lang.Object, lq4):java.lang.Object");
    }

    public /* synthetic */ fbg(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
