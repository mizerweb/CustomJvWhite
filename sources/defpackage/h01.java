package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h01 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public long g;
    public long h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h01(sua suaVar, long j, kja kjaVar, long j2, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 6;
        this.i = suaVar;
        this.g = j;
        this.j = kjaVar;
        this.h = j2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new h01((l01) obj2, this.h, lq4Var, 0);
            case 1:
                return new h01((kl1) this.i, this.g, this.h, (Long) obj2, lq4Var, 1);
            case 2:
                return new h01((no4) obj2, this.h, lq4Var, 2);
            case 3:
                h01 h01Var = new h01((hk7) obj2, this.g, this.h, lq4Var, 3);
                h01Var.i = obj;
                return h01Var;
            case 4:
                h01 h01Var2 = new h01((jh9) obj2, this.h, lq4Var, 4);
                h01Var2.i = obj;
                return h01Var2;
            case 5:
                return new h01((jsa) obj2, this.h, lq4Var, 5);
            case 6:
                return new h01((sua) this.i, this.g, (kja) obj2, this.h, lq4Var);
            case 7:
                return new h01((aob) obj2, this.g, this.h, lq4Var, 7);
            case 8:
                return new h01((yob) obj2, this.g, this.h, lq4Var, 8);
            case 9:
                return new h01((ygf) this.i, this.g, this.h, (s5e) obj2, lq4Var, 9);
            case 10:
                return new h01((vvg) this.i, this.h, (CharSequence) obj2, lq4Var);
            default:
                return new h01(this.i, lq4Var, (tyi) obj2, this.g);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return ((h01) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x025f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0389  */
    /* JADX WARN: Code duplicated, block: B:173:0x0394  */
    /* JADX WARN: Code duplicated, block: B:175:0x039c  */
    /* JADX WARN: Code duplicated, block: B:177:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:179:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:183:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ed  */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0277, code lost:
    
        if (r0.j(r2, r3, r5) == r9) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (r0 == r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        if (defpackage.vvg.B(r2, r5) == r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019c, code lost:
    
        if (r0 == r1) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h01.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h01(vvg vvgVar, long j, CharSequence charSequence, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 10;
        this.i = vvgVar;
        this.h = j;
        this.j = charSequence;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h01(Object obj, long j, long j2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.j = obj;
        this.g = j;
        this.h = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h01(Object obj, long j, long j2, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.g = j;
        this.h = j2;
        this.j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h01(Object obj, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.j = obj;
        this.h = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h01(Object obj, lq4 lq4Var, tyi tyiVar, long j) {
        super(2, lq4Var);
        this.e = 11;
        this.i = obj;
        this.j = tyiVar;
        this.g = j;
    }
}
