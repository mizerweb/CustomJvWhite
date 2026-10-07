package defpackage;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b67 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b67(ild ildVar, ekd ekdVar, ckd ckdVar, String str, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 4;
        this.i = ildVar;
        this.j = ekdVar;
        this.k = ckdVar;
        this.l = str;
        this.g = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                b67 b67Var = new b67((d67) obj2, lq4Var);
                b67Var.j = obj;
                return b67Var;
            case 1:
                b67 b67Var2 = new b67((es8) this.k, (qf7) obj2, lq4Var, 1);
                b67Var2.h = obj;
                return b67Var2;
            case 2:
                return new b67((x5b) this.k, (Collection) obj2, lq4Var, 2);
            case 3:
                return new b67((j9b) this.k, (onc) obj2, lq4Var, 3);
            case 4:
                b67 b67Var3 = new b67((ild) this.i, (ekd) this.j, (ckd) this.k, (String) obj2, this.g, lq4Var);
                b67Var3.h = obj;
                return b67Var3;
            default:
                b67 b67Var4 = new b67((AtomicReference) this.k, (zgi) obj2, lq4Var, 5);
                b67Var4.h = obj;
                return b67Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((b67) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((b67) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((b67) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((b67) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((b67) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((b67) create((vfi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:130:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x02dc A[Catch: all -> 0x02f8, TRY_LEAVE, TryCatch #4 {all -> 0x02f8, blocks: (B:119:0x028c, B:127:0x02be, B:131:0x02d4, B:133:0x02dc, B:123:0x02a2, B:126:0x02b4), top: B:228:0x027c }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:158:0x0388  */
    /* JADX WARN: Code duplicated, block: B:161:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:168:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:181:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:184:0x041e  */
    /* JADX WARN: Code duplicated, block: B:189:0x043b A[PHI: r1
  0x043b: PHI (r1v22 c9b) = (r1v11 c9b), (r1v24 c9b) binds: [B:180:0x03fc, B:188:0x043a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:191:0x043f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x0441  */
    /* JADX WARN: Code duplicated, block: B:193:0x0443  */
    /* JADX WARN: Code duplicated, block: B:195:0x0446  */
    /* JADX WARN: Code duplicated, block: B:197:0x044e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0465  */
    /* JADX WARN: Code duplicated, block: B:202:0x0470  */
    /* JADX WARN: Code duplicated, block: B:205:0x0483 A[LOOP:1: B:201:0x046e->B:205:0x0483, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x0489 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x048b A[LOOP:0: B:198:0x0450->B:208:0x048b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x0498  */
    /* JADX WARN: Code duplicated, block: B:214:0x04c0 A[PHI: r0 r1 r10
  0x04c0: PHI (r0v45 java.lang.Object) = (r0v31 java.lang.Object), (r0v51 java.lang.Object) binds: [B:212:0x04bd, B:143:0x0325] A[DONT_GENERATE, DONT_INLINE]
  0x04c0: PHI (r1v25 int) = (r1v23 int), (r1v26 int) binds: [B:212:0x04bd, B:143:0x0325] A[DONT_GENERATE, DONT_INLINE]
  0x04c0: PHI (r10v6 d67) = (r10v2 d67), (r10v1 d67) binds: [B:212:0x04bd, B:143:0x0325] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:236:0x047a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0487 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x03cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x02f2 -> B:127:0x02be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b67.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b67(d67 d67Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.l = d67Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b67(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.k = obj;
        this.l = obj2;
    }
}
