package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class ihc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public boolean g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihc(pvc pvcVar, c36 c36Var, y26 y26Var, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 3;
        this.i = pvcVar;
        this.j = c36Var;
        this.k = y26Var;
        this.g = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                return new ihc((khc) obj3, (ByteBuffer) obj2, this.g, lq4Var);
            case 1:
                ihc ihcVar = new ihc(this.g, (wfe) this.i, (s04) obj3, (mz3) obj2, lq4Var);
                ihcVar.h = obj;
                return ihcVar;
            case 2:
                return new ihc((gm8) this.i, (String) obj3, (String) obj2, lq4Var, 2);
            case 3:
                ihc ihcVar2 = new ihc((pvc) this.i, (c36) obj3, (y26) obj2, this.g, lq4Var);
                ihcVar2.h = obj;
                return ihcVar2;
            default:
                ihc ihcVar3 = new ihc((ogj) this.i, (igj) obj3, (lgj) obj2, lq4Var, 4);
                ihcVar3.g = ((Boolean) obj).booleanValue();
                return ihcVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((ihc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((ihc) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((ihc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((ihc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ihc) create(bool, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0249  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x019d  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b3, code lost:
    
        if (r0 == r7) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihc(khc khcVar, ByteBuffer byteBuffer, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.j = khcVar;
        this.k = byteBuffer;
        this.g = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ihc(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihc(boolean z, wfe wfeVar, s04 s04Var, mz3 mz3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 1;
        this.g = z;
        this.i = wfeVar;
        this.j = s04Var;
        this.k = mz3Var;
    }
}
