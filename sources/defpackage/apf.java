package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class apf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ bpf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ apf(bpf bpfVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = bpfVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        bpf bpfVar = this.g;
        switch (i) {
            case 0:
                return new apf(bpfVar, lq4Var, 0);
            case 1:
                return new apf(bpfVar, lq4Var, 1);
            case 2:
                return new apf(bpfVar, lq4Var, 2);
            case 3:
                return new apf(bpfVar, lq4Var, 3);
            case 4:
                return new apf(bpfVar, lq4Var, 4);
            default:
                return new apf(bpfVar, lq4Var, 5);
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
        }
        return ((apf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:101:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:102:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:103:0x0428  */
    /* JADX WARN: Code duplicated, block: B:104:0x0454  */
    /* JADX WARN: Code duplicated, block: B:105:0x0480  */
    /* JADX WARN: Code duplicated, block: B:106:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:108:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:109:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:111:0x04df  */
    /* JADX WARN: Code duplicated, block: B:112:0x050b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0537  */
    /* JADX WARN: Code duplicated, block: B:117:0x0575  */
    /* JADX WARN: Code duplicated, block: B:119:0x057d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0582  */
    /* JADX WARN: Code duplicated, block: B:124:0x059a A[LOOP:1: B:122:0x0594->B:124:0x059a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:129:0x0612  */
    /* JADX WARN: Code duplicated, block: B:135:0x062a  */
    /* JADX WARN: Code duplicated, block: B:137:0x063d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0643  */
    /* JADX WARN: Code duplicated, block: B:148:0x06a3 A[PHI: r2 r54
  0x06a3: PHI (r2v16 int) = (r2v11 int), (r2v11 int), (r2v17 int) binds: [B:149:0x06a5, B:151:0x06ab, B:147:0x065e] A[DONT_GENERATE, DONT_INLINE]
  0x06a3: PHI (r54v4 hu4) = (r54v2 hu4), (r54v2 hu4), (r54v5 hu4) binds: [B:149:0x06a5, B:151:0x06ab, B:147:0x065e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:164:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:166:0x0711  */
    /* JADX WARN: Code duplicated, block: B:167:0x071c  */
    /* JADX WARN: Code duplicated, block: B:194:0x056a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x013b A[PHI: r3
  0x013b: PHI (r3v17 java.lang.Object) = (r3v16 java.lang.Object), (r3v34 java.lang.Object) binds: [B:57:0x0138, B:48:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x017b  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x020e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0222  */
    /* JADX WARN: Code duplicated, block: B:85:0x025f  */
    /* JADX WARN: Code duplicated, block: B:89:0x028a  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:92:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:93:0x0316  */
    /* JADX WARN: Code duplicated, block: B:96:0x032c  */
    /* JADX WARN: Code duplicated, block: B:98:0x034c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0378  */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x076e, code lost:
    
        if (r7 == r15) goto L172;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 2070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
