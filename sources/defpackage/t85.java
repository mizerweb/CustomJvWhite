package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes2.dex */
public final class t85 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t85(vxf vxfVar, CharSequence charSequence, int i, ShareData shareData, g4b g4bVar, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = vxfVar;
        this.j = charSequence;
        this.g = i;
        this.k = shareData;
        this.l = g4bVar;
        this.h = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                t85 t85Var = new t85(this.h, this.g, (y85) obj4, (ugc) obj3, (Conversation) obj2, lq4Var);
                t85Var.i = obj;
                return t85Var;
            default:
                boolean z = this.h;
                return new t85((vxf) this.i, (CharSequence) obj4, this.g, (ShareData) obj3, (g4b) obj2, z, lq4Var);
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
        }
        return ((t85) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ef  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (defpackage.rx8.u(r10, r16) == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (defpackage.rx8.u(r1, r16) == r7) goto L37;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t85.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t85(boolean z, int i, y85 y85Var, ugc ugcVar, Conversation conversation, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = z;
        this.g = i;
        this.j = y85Var;
        this.k = ugcVar;
        this.l = conversation;
    }
}
