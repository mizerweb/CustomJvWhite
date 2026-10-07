package defpackage;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fb8 extends mdh implements qf7 {
    public final /* synthetic */ int e = 4;
    public int f;
    public int g;
    public int h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb8(lq4 lq4Var, int i, j0f j0fVar, int i2, Integer num, wp6 wp6Var, int i3) {
        super(2, lq4Var);
        this.f = i;
        this.i = j0fVar;
        this.g = i2;
        this.k = num;
        this.l = wp6Var;
        this.h = i3;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                fb8 fb8Var = new fb8((nh7) this.k, this.h, (rb8) this.l, lq4Var);
                fb8Var.j = obj;
                return fb8Var;
            case 1:
                return new fb8((qdb) this.k, (Uri) this.l, lq4Var);
            case 2:
                fb8 fb8Var2 = new fb8(lq4Var, this.f, (j0f) this.i, this.g, (Integer) this.k, (wp6) this.l, this.h);
                fb8Var2.j = obj;
                return fb8Var2;
            case 3:
                return new fb8((ikf) this.l, lq4Var);
            default:
                return new fb8(this.g, this.j, lq4Var, (dtj) this.k, (List) this.i);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((fb8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((fb8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                ((fb8) create((kyj) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                return ((fb8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((fb8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:207:0x0486  */
    /* JADX WARN: Code duplicated, block: B:209:0x0492 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:216:0x04de  */
    /* JADX WARN: Code duplicated, block: B:220:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:222:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:226:0x050d  */
    /* JADX WARN: Code duplicated, block: B:228:0x051d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x052b  */
    /* JADX WARN: Code duplicated, block: B:235:0x0537  */
    /* JADX WARN: Code duplicated, block: B:240:0x054c  */
    /* JADX WARN: Code duplicated, block: B:241:0x0556  */
    /* JADX WARN: Code duplicated, block: B:243:0x057e  */
    /* JADX WARN: Code duplicated, block: B:274:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0151  */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:64:0x016e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a3  */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02fb, code lost:
    
        if (r5.emit(r9, r27) == r0) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb8(int i, Object obj, lq4 lq4Var, dtj dtjVar, List list) {
        super(2, lq4Var);
        this.g = i;
        this.j = obj;
        this.k = dtjVar;
        this.i = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb8(nh7 nh7Var, int i, rb8 rb8Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = nh7Var;
        this.h = i;
        this.l = rb8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb8(qdb qdbVar, Uri uri, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = qdbVar;
        this.l = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb8(ikf ikfVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = ikfVar;
    }
}
