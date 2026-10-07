package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nb4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb4(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                nb4 nb4Var = new nb4(2, lq4Var, 0);
                nb4Var.f = ((Boolean) obj).booleanValue();
                return nb4Var;
            case 1:
                nb4 nb4Var2 = new nb4(2, lq4Var, 1);
                nb4Var2.f = ((Boolean) obj).booleanValue();
                return nb4Var2;
            case 2:
                nb4 nb4Var3 = new nb4(2, lq4Var, 2);
                nb4Var3.f = ((Boolean) obj).booleanValue();
                return nb4Var3;
            default:
                nb4 nb4Var4 = new nb4(2, lq4Var, 3);
                nb4Var4.f = ((Boolean) obj).booleanValue();
                return nb4Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((nb4) create(bool, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        boolean z = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                return Boolean.valueOf(z);
            case 1:
                ch3.d0(obj);
                return Boolean.valueOf(z);
            case 2:
                ch3.d0(obj);
                return Boolean.valueOf(!z);
            default:
                ch3.d0(obj);
                return Boolean.valueOf(z);
        }
    }
}
