package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class dz1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ io5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dz1(io5 io5Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = io5Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                dz1 dz1Var = new dz1(this.g, lq4Var, 0);
                dz1Var.f = obj;
                return dz1Var;
            default:
                dz1 dz1Var2 = new dz1(this.g, lq4Var, 1);
                dz1Var2.f = obj;
                return dz1Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Collection collection = (Collection) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((dz1) create(collection, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((dz1) create(collection, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        io5 io5Var = this.g;
        Collection collection = (Collection) this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                ((d9b) io5Var.d.getValue()).a(collection);
                break;
            default:
                ch3.d0(obj);
                ((d9b) io5Var.d.getValue()).a(collection);
                break;
        }
        return sbiVar;
    }
}
