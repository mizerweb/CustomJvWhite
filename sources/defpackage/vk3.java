package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vk3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ rl3 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk3(rl3 rl3Var, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = rl3Var;
        this.g = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new vk3(this.f, this.g, lq4Var, 0);
            default:
                return new vk3(this.f, this.g, lq4Var, 1);
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
                ((vk3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((vk3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        long j = this.g;
        rl3 rl3Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = rl3.Z1;
                rl3Var.I().u(j);
                break;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = rl3.Z1;
                rl3Var.I().u(j);
                break;
        }
        return sbiVar;
    }
}
