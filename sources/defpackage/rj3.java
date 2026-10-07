package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rj3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ fk3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj3(fk3 fk3Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        switch (i) {
            case 1:
                int i2 = i7c.b;
                this.f = fk3Var;
                super(2, lq4Var);
                break;
            default:
                this.f = fk3Var;
                break;
        }
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        fk3 fk3Var = this.f;
        switch (i) {
            case 0:
                return new rj3(fk3Var, lq4Var, 0);
            default:
                int i2 = i7c.b;
                return new rj3(fk3Var, lq4Var, 1);
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
                ((rj3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((rj3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        fk3 fk3Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                mjg mjgVar = fk3Var.I;
                ulc ulcVar = (ulc) fk3Var.Y.get();
                mjgVar.setValue(ulcVar != null ? (String) ulcVar.d : null);
                break;
            default:
                ch3.d0(obj);
                long j = i7c.a;
                if (j == j) {
                    zu6 zu6Var = (zu6) fk3Var.A.getValue();
                    String str = (String) fk3Var.G.getValue();
                    if (str == null) {
                        str = "";
                    }
                    ylc ylcVarA = zu6Var.a(str);
                    if (ylcVarA != null) {
                        a8j.x(fk3Var.X, new f8f((String) ylcVarA.a, (String) ylcVarA.b));
                    }
                }
                break;
        }
        return sbiVar;
    }
}
