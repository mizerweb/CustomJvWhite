package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class db3 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ q9h f;
    public /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db3(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        q9h q9hVar = (q9h) obj;
        Boolean bool = (Boolean) obj2;
        switch (i) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                db3 db3Var = new db3(i2, (lq4) obj3, 0);
                db3Var.f = q9hVar;
                db3Var.g = zBooleanValue;
                return db3Var.invokeSuspend(sbiVar);
            case 1:
                boolean zBooleanValue2 = bool.booleanValue();
                db3 db3Var2 = new db3(i2, (lq4) obj3, 1);
                db3Var2.f = q9hVar;
                db3Var2.g = zBooleanValue2;
                return db3Var2.invokeSuspend(sbiVar);
            default:
                boolean zBooleanValue3 = bool.booleanValue();
                db3 db3Var3 = new db3(i2, (lq4) obj3, 2);
                db3Var3.f = q9hVar;
                db3Var3.g = zBooleanValue3;
                return db3Var3.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.e) {
            case 0:
                q9h q9hVar = this.f;
                boolean z2 = this.g;
                ch3.d0(obj);
                return new ylc(q9hVar, Boolean.valueOf(z2));
            case 1:
                q9h q9hVar2 = this.f;
                boolean z3 = this.g;
                ch3.d0(obj);
                if (q9hVar2 != null && z3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                q9h q9hVar3 = this.f;
                boolean z4 = this.g;
                ch3.d0(obj);
                if (q9hVar3 != null && z4) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
