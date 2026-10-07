package defpackage;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes4.dex */
public final class x2g extends mdh implements qf7 {
    public ynh e;
    public int f;
    public final /* synthetic */ y2g g;
    public final /* synthetic */ LatLng h;
    public final /* synthetic */ float i;
    public final /* synthetic */ Long j;
    public final /* synthetic */ Long k;
    public final /* synthetic */ Long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2g(y2g y2gVar, LatLng latLng, float f, Long l, Long l2, Long l3, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = y2gVar;
        this.h = latLng;
        this.i = f;
        this.j = l;
        this.k = l2;
        this.l = l3;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new x2g(this.g, this.h, this.i, this.j, this.k, this.l, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((x2g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x011d A[PHI: r13
  0x011d: PHI (r13v9 ynh) = (r13v7 ynh), (r13v7 ynh), (r13v13 ynh) binds: [B:41:0x00ea, B:43:0x00ee, B:48:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0121  */
    /* JADX WARN: Code duplicated, block: B:54:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:61:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x017d  */
    /* JADX WARN: Code duplicated, block: B:66:0x018f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
    /* JADX WARN: Code duplicated, block: B:69:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x019a  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        if (r0 == r12) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010c, code lost:
    
        if (r0 == r12) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0174, code lost:
    
        if (r0 == r12) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01aa, code lost:
    
        if (r0 == r12) goto L73;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
