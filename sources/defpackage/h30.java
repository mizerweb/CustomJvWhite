package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h30 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(ae5 ae5Var, efg efgVar, axg axgVar, ArrayList arrayList, njd njdVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.g = ae5Var;
        this.k = efgVar;
        this.l = axgVar;
        this.m = arrayList;
        this.n = njdVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                h30 h30Var = new h30((List) this.k, (n30) obj2, (List) this.l, (List) obj3, lq4Var);
                h30Var.g = obj;
                return h30Var;
            case 1:
                h30 h30Var2 = new h30((d0c) this.l, (String) obj3, (lg) obj2, lq4Var, 1);
                h30Var2.g = obj;
                return h30Var2;
            case 2:
                return new h30((ae5) this.g, (efg) this.k, (axg) this.l, (ArrayList) obj3, (njd) obj2, lq4Var);
            case 3:
                h30 h30Var3 = new h30((brf) obj3, (ny8) obj2, lq4Var);
                h30Var3.g = obj;
                return h30Var3;
            default:
                h30 h30Var4 = new h30((zgi) this.l, (ahi) obj3, (zui) obj2, lq4Var, 4);
                h30Var4.g = obj;
                return h30Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((h30) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((h30) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((h30) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((h30) create((ez0) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((h30) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:177:0x03f4 A[Catch: all -> 0x0395, TRY_ENTER, TryCatch #1 {all -> 0x0395, blocks: (B:169:0x038e, B:192:0x045b, B:177:0x03f4, B:179:0x0403, B:180:0x040f, B:182:0x0415, B:183:0x0422, B:185:0x0428, B:186:0x0434, B:188:0x043a, B:189:0x0446, B:194:0x045f, B:196:0x0479, B:197:0x047e, B:199:0x0484, B:200:0x0489, B:202:0x048f, B:203:0x0492, B:205:0x0498), top: B:234:0x038e }] */
    /* JADX WARN: Code duplicated, block: B:179:0x0403 A[Catch: all -> 0x0395, TryCatch #1 {all -> 0x0395, blocks: (B:169:0x038e, B:192:0x045b, B:177:0x03f4, B:179:0x0403, B:180:0x040f, B:182:0x0415, B:183:0x0422, B:185:0x0428, B:186:0x0434, B:188:0x043a, B:189:0x0446, B:194:0x045f, B:196:0x0479, B:197:0x047e, B:199:0x0484, B:200:0x0489, B:202:0x048f, B:203:0x0492, B:205:0x0498), top: B:234:0x038e }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0415 A[Catch: all -> 0x0395, TryCatch #1 {all -> 0x0395, blocks: (B:169:0x038e, B:192:0x045b, B:177:0x03f4, B:179:0x0403, B:180:0x040f, B:182:0x0415, B:183:0x0422, B:185:0x0428, B:186:0x0434, B:188:0x043a, B:189:0x0446, B:194:0x045f, B:196:0x0479, B:197:0x047e, B:199:0x0484, B:200:0x0489, B:202:0x048f, B:203:0x0492, B:205:0x0498), top: B:234:0x038e }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0428 A[Catch: all -> 0x0395, TryCatch #1 {all -> 0x0395, blocks: (B:169:0x038e, B:192:0x045b, B:177:0x03f4, B:179:0x0403, B:180:0x040f, B:182:0x0415, B:183:0x0422, B:185:0x0428, B:186:0x0434, B:188:0x043a, B:189:0x0446, B:194:0x045f, B:196:0x0479, B:197:0x047e, B:199:0x0484, B:200:0x0489, B:202:0x048f, B:203:0x0492, B:205:0x0498), top: B:234:0x038e }] */
    /* JADX WARN: Code duplicated, block: B:188:0x043a A[Catch: all -> 0x0395, TryCatch #1 {all -> 0x0395, blocks: (B:169:0x038e, B:192:0x045b, B:177:0x03f4, B:179:0x0403, B:180:0x040f, B:182:0x0415, B:183:0x0422, B:185:0x0428, B:186:0x0434, B:188:0x043a, B:189:0x0446, B:194:0x045f, B:196:0x0479, B:197:0x047e, B:199:0x0484, B:200:0x0489, B:202:0x048f, B:203:0x0492, B:205:0x0498), top: B:234:0x038e }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0459  */
    /* JADX WARN: Code duplicated, block: B:194:0x045f A[Catch: all -> 0x0395, TryCatch #1 {all -> 0x0395, blocks: (B:169:0x038e, B:192:0x045b, B:177:0x03f4, B:179:0x0403, B:180:0x040f, B:182:0x0415, B:183:0x0422, B:185:0x0428, B:186:0x0434, B:188:0x043a, B:189:0x0446, B:194:0x045f, B:196:0x0479, B:197:0x047e, B:199:0x0484, B:200:0x0489, B:202:0x048f, B:203:0x0492, B:205:0x0498), top: B:234:0x038e }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0479 A[Catch: all -> 0x0395, TryCatch #1 {all -> 0x0395, blocks: (B:169:0x038e, B:192:0x045b, B:177:0x03f4, B:179:0x0403, B:180:0x040f, B:182:0x0415, B:183:0x0422, B:185:0x0428, B:186:0x0434, B:188:0x043a, B:189:0x0446, B:194:0x045f, B:196:0x0479, B:197:0x047e, B:199:0x0484, B:200:0x0489, B:202:0x048f, B:203:0x0492, B:205:0x0498), top: B:234:0x038e }] */
    /* JADX WARN: Code duplicated, block: B:199:0x0484 A[Catch: all -> 0x0395, TryCatch #1 {all -> 0x0395, blocks: (B:169:0x038e, B:192:0x045b, B:177:0x03f4, B:179:0x0403, B:180:0x040f, B:182:0x0415, B:183:0x0422, B:185:0x0428, B:186:0x0434, B:188:0x043a, B:189:0x0446, B:194:0x045f, B:196:0x0479, B:197:0x047e, B:199:0x0484, B:200:0x0489, B:202:0x048f, B:203:0x0492, B:205:0x0498), top: B:234:0x038e }] */
    /* JADX WARN: Code duplicated, block: B:202:0x048f A[Catch: all -> 0x0395, TryCatch #1 {all -> 0x0395, blocks: (B:169:0x038e, B:192:0x045b, B:177:0x03f4, B:179:0x0403, B:180:0x040f, B:182:0x0415, B:183:0x0422, B:185:0x0428, B:186:0x0434, B:188:0x043a, B:189:0x0446, B:194:0x045f, B:196:0x0479, B:197:0x047e, B:199:0x0484, B:200:0x0489, B:202:0x048f, B:203:0x0492, B:205:0x0498), top: B:234:0x038e }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0498 A[Catch: all -> 0x0395, TRY_LEAVE, TryCatch #1 {all -> 0x0395, blocks: (B:169:0x038e, B:192:0x045b, B:177:0x03f4, B:179:0x0403, B:180:0x040f, B:182:0x0415, B:183:0x0422, B:185:0x0428, B:186:0x0434, B:188:0x043a, B:189:0x0446, B:194:0x045f, B:196:0x0479, B:197:0x047e, B:199:0x0484, B:200:0x0489, B:202:0x048f, B:203:0x0492, B:205:0x0498), top: B:234:0x038e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x0457 -> B:192:0x045b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x017c -> B:45:0x0181). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x018f -> B:50:0x0190). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h30.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(brf brfVar, ny8 ny8Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 3;
        this.m = brfVar;
        this.n = ny8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h30(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(List list, n30 n30Var, List list2, List list3, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.k = list;
        this.n = n30Var;
        this.l = list2;
        this.m = list3;
    }
}
