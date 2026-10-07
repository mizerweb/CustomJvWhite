package defpackage;

import java.util.List;
import java.util.Set;
import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes3.dex */
public final class uxf extends mdh implements qf7 {
    public List e;
    public Set f;
    public int g;
    public final /* synthetic */ vxf h;
    public final /* synthetic */ CharSequence i;
    public final /* synthetic */ int j;
    public final /* synthetic */ ShareData k;
    public final /* synthetic */ g4b l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxf(vxf vxfVar, CharSequence charSequence, int i, ShareData shareData, g4b g4bVar, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = vxfVar;
        this.i = charSequence;
        this.j = i;
        this.k = shareData;
        this.l = g4bVar;
        this.m = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new uxf(this.h, this.i, this.j, this.k, this.l, this.m, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((uxf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (r0 == r10) goto L37;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uxf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
