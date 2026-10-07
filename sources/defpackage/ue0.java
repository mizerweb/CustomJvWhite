package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ue0 extends mdh implements qf7 {
    public final /* synthetic */ int e = 4;
    public int f;
    public Object g;
    public long h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(mjb mjbVar, ky3 ky3Var, sfe sfeVar, long j, q24 q24Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = mjbVar;
        this.j = ky3Var;
        this.k = sfeVar;
        this.h = j;
        this.l = q24Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                ue0 ue0Var = new ue0((ve0) this.l, this.h, lq4Var);
                ue0Var.g = obj;
                return ue0Var;
            case 1:
                ue0 ue0Var2 = new ue0((List) this.j, (im7) this.k, this.h, (CharSequence) this.l, lq4Var);
                ue0Var2.g = obj;
                return ue0Var2;
            case 2:
                ue0 ue0Var3 = new ue0((ae8) this.k, (String) this.l, lq4Var);
                ue0Var3.g = obj;
                return ue0Var3;
            case 3:
                ue0 ue0Var4 = new ue0((m8b) this.k, (a0b) this.l, this.h, lq4Var);
                ue0Var4.g = obj;
                return ue0Var4;
            case 4:
                return new ue0(this.h, (x5b) this.g, lq4Var);
            case 5:
                ue0 ue0Var5 = new ue0((mjb) this.i, (ky3) this.j, (sfe) this.k, this.h, (q24) this.l, lq4Var);
                ue0Var5.g = obj;
                return ue0Var5;
            case 6:
                ue0 ue0Var6 = new ue0((nzg) this.k, this.h, (azg) this.l, lq4Var);
                ue0Var6.g = obj;
                return ue0Var6;
            default:
                return new ue0((e1i) this.i, this.h, (sfa) this.j, (rt2) this.k, (q36) this.l, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((ue0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((ue0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((ue0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((ue0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((ue0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((ue0) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((ue0) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((ue0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:387:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:389:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:392:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:393:0x0a0b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:322:0x085f -> B:324:0x0863). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:388:0x0a01 -> B:390:0x0a05). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 2910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(ve0 ve0Var, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = ve0Var;
        this.h = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(ae8 ae8Var, String str, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = ae8Var;
        this.l = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(m8b m8bVar, a0b a0bVar, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = m8bVar;
        this.l = a0bVar;
        this.h = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(long j, x5b x5bVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = j;
        this.g = x5bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(nzg nzgVar, long j, azg azgVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = nzgVar;
        this.h = j;
        this.l = azgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(e1i e1iVar, long j, sfa sfaVar, rt2 rt2Var, q36 q36Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = e1iVar;
        this.h = j;
        this.j = sfaVar;
        this.k = rt2Var;
        this.l = q36Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(List list, im7 im7Var, long j, CharSequence charSequence, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = list;
        this.k = im7Var;
        this.h = j;
        this.l = charSequence;
    }
}
