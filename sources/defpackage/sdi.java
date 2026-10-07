package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sdi extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ vdi g;
    public final /* synthetic */ long h;
    public final /* synthetic */ List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sdi(vdi vdiVar, long j, List list, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = vdiVar;
        this.h = j;
        this.i = list;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                sdi sdiVar = new sdi(this.g, this.h, this.i, lq4Var, 0);
                sdiVar.f = obj;
                return sdiVar;
            default:
                sdi sdiVar2 = new sdi(this.g, this.h, this.i, lq4Var, 1);
                sdiVar2.f = obj;
                return sdiVar2;
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
                ((sdi) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((sdi) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.io.Serializable, long[]] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                gu4 gu4Var = (gu4) this.f;
                ch3.d0(obj);
                ?? U1 = ww3.U1(this.i);
                vdi vdiVar = this.g;
                vdiVar.getClass();
                yab.i0(gu4Var, null, 0, new f1j(vdiVar, this.h, (Serializable) U1, (lq4) null, 15), 3);
                return sbi.a;
            default:
                gu4 gu4Var2 = (gu4) this.f;
                ch3.d0(obj);
                return yab.i0(gu4Var2, null, 0, new sdi(this.g, this.h, this.i, null, 0), 3);
        }
    }
}
