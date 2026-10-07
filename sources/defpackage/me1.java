package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class me1 extends mdh implements qf7 {
    public final /* synthetic */ int e = 8;
    public int f;
    public long g;
    public Object h;
    public Object i;
    public Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(lt5 lt5Var, long j, CharSequence charSequence, Long l, Long l2, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = lt5Var;
        this.g = j;
        this.i = charSequence;
        this.j = l;
        this.k = l2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                me1 me1Var = new me1((jz) this.i, lq4Var, (pe1) this.j, this.g, (Integer) obj2);
                me1Var.h = obj;
                return me1Var;
            case 1:
                return new me1((q73) this.j, (String) obj2, this.g, lq4Var);
            case 2:
                me1 me1Var2 = new me1((ny8) this.i, this.g, (vl4) this.j, (ny8) obj2, lq4Var);
                me1Var2.h = obj;
                return me1Var2;
            case 3:
                me1 me1Var3 = new me1((y85) obj2, lq4Var);
                me1Var3.h = obj;
                return me1Var3;
            case 4:
                return new me1((lt5) this.h, this.g, (CharSequence) this.i, (Long) this.j, (Long) obj2, lq4Var);
            case 5:
                me1 me1Var4 = new me1((jfa) this.j, this.g, (String) obj2, lq4Var);
                me1Var4.h = obj;
                return me1Var4;
            case 6:
                me1 me1Var5 = new me1((List) this.j, (jsa) obj2, lq4Var);
                me1Var5.h = obj;
                return me1Var5;
            case 7:
                return new me1((ngf) this.h, (q24) this.i, this.g, (s5e) this.j, (ija) obj2, lq4Var);
            default:
                return new me1((ArrayList) this.i, (af7) this.j, (cf7) obj2, this.g, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((me1) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((me1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((me1) create((vg4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((me1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((me1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((me1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((me1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((me1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((me1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0305  */
    /* JADX WARN: Code duplicated, block: B:48:0x010f A[PHI: r2 r4
  0x010f: PHI (r2v60 java.lang.Object) = (r2v59 java.lang.Object), (r2v66 java.lang.Object) binds: [B:46:0x010c, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r4v61 long) = (r4v60 long), (r4v63 long) binds: [B:46:0x010c, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0186  */
    /* JADX WARN: Code duplicated, block: B:75:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d9 A[PHI: r2
  0x01d9: PHI (r2v43 rt2) = (r2v54 rt2), (r2v54 rt2), (r2v56 rt2) binds: [B:82:0x01be, B:84:0x01d6, B:66:0x0156] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0203  */
    /* JADX WARN: Code duplicated, block: B:89:0x0206  */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03c0, code lost:
    
        if (r1.f(r11, r10, r4, r6) == r9) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03dc, code lost:
    
        if (r0.a(r1, r6) == r9) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03df, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013b, code lost:
    
        if (r1 == r15) goto L58;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0222 -> B:73:0x0186). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(q73 q73Var, String str, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = q73Var;
        this.k = str;
        this.g = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(y85 y85Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = y85Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(jz jzVar, lq4 lq4Var, pe1 pe1Var, long j, Integer num) {
        super(2, lq4Var);
        this.i = jzVar;
        this.j = pe1Var;
        this.g = j;
        this.k = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(ny8 ny8Var, long j, vl4 vl4Var, ny8 ny8Var2, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = ny8Var;
        this.g = j;
        this.j = vl4Var;
        this.k = ny8Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(jfa jfaVar, long j, String str, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = jfaVar;
        this.g = j;
        this.k = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(ngf ngfVar, q24 q24Var, long j, s5e s5eVar, ija ijaVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = ngfVar;
        this.i = q24Var;
        this.g = j;
        this.j = s5eVar;
        this.k = ijaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(ArrayList arrayList, af7 af7Var, cf7 cf7Var, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = arrayList;
        this.j = af7Var;
        this.k = cf7Var;
        this.g = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(List list, jsa jsaVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = list;
        this.k = jsaVar;
    }
}
