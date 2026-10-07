package defpackage;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tm extends mdh implements qf7 {
    public final /* synthetic */ int e = 3;
    public int f;
    public int g;
    public int h;
    public Object i;
    public Object j;
    public Object k;
    public /* synthetic */ Object l;
    public Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(dyg dygVar, Uri uri, List list, int i, int i2, i6a i6aVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = dygVar;
        this.l = uri;
        this.i = list;
        this.g = i;
        this.h = i2;
        this.m = i6aVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                tm tmVar = new tm((xm) this.m, lq4Var);
                tmVar.l = obj;
                return tmVar;
            case 1:
                return new tm((r72) this.j, lq4Var, (hli) this.k, this.g, (yd2) this.l);
            case 2:
                return new tm((p26) this.l, (i16) this.m, lq4Var);
            default:
                return new tm((dyg) this.k, (Uri) this.l, (List) this.i, this.g, this.h, (i6a) this.m, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((tm) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((tm) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((tm) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((tm) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x032d  */
    /* JADX WARN: Code duplicated, block: B:171:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0151  */
    /* JADX WARN: Code duplicated, block: B:52:0x0153 A[Catch: all -> 0x00df, CancellationException -> 0x01f3, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x01f3, blocks: (B:32:0x00da, B:88:0x01d8, B:38:0x00f7, B:49:0x014d, B:52:0x0153, B:84:0x01bb, B:43:0x0110, B:45:0x0134, B:56:0x0164, B:58:0x0168, B:60:0x0174, B:63:0x017a, B:66:0x0180, B:74:0x0197, B:77:0x019f, B:79:0x01a5, B:80:0x01ab, B:69:0x0186, B:72:0x018d, B:90:0x01ed, B:91:0x01f2), top: B:179:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d7  */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e6, code lost:
    
        if (r6.emit(r0, r23) == r7) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ea, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0317, code lost:
    
        if (r6.emit(r0, r23) == r7) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0353, code lost:
    
        if (r1 == r7) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03fb, code lost:
    
        if (r6.emit(r10, r23) == r7) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0401, code lost:
    
        return r20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x0353 -> B:151:0x0357). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(r72 r72Var, lq4 lq4Var, hli hliVar, int i, yd2 yd2Var) {
        super(2, lq4Var);
        this.j = r72Var;
        this.k = hliVar;
        this.g = i;
        this.l = yd2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(p26 p26Var, i16 i16Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = p26Var;
        this.m = i16Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(xm xmVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = xmVar;
    }
}
