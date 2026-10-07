package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qx3 extends mdh implements qf7 {
    public hr2 e;
    public byte[] f;
    public int g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xx6[] k;
    public final /* synthetic */ af7 l;
    public final /* synthetic */ tf7 m;
    public final /* synthetic */ yx6 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx3(lq4 lq4Var, yx6 yx6Var, af7 af7Var, tf7 tf7Var, xx6[] xx6VarArr) {
        super(2, lq4Var);
        this.k = xx6VarArr;
        this.l = af7Var;
        this.m = tf7Var;
        this.n = yx6Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        qx3 qx3Var = new qx3(lq4Var, this.n, this.l, this.m, this.k);
        qx3Var.j = obj;
        return qx3Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((qx3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf A[LOOP:0: B:32:0x00bf->B:58:?, LOOP_START, PHI: r8 r12
  0x00bf: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:29:0x00ba, B:58:?] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r12v4 dd8) = (r12v3 dd8), (r12v14 dd8) binds: [B:29:0x00ba, B:58:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0 A[EDGE_INSN: B:56:0x00e0->B:43:0x00e0 BREAK  A[LOOP:0: B:32:0x00bf->B:58:?], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0126 -> B:53:0x012b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
