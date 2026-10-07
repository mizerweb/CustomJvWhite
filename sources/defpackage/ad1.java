package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ad1 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;
    public /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad1(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ad1 ad1Var = new ad1(i2, (lq4) obj3, 0);
                ad1Var.f = zBooleanValue;
                ad1Var.g = zBooleanValue2;
                return ad1Var.invokeSuspend(sbiVar);
            case 1:
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                ad1 ad1Var2 = new ad1(i2, (lq4) obj3, 1);
                ad1Var2.f = zBooleanValue3;
                ad1Var2.g = zBooleanValue4;
                return ad1Var2.invokeSuspend(sbiVar);
            case 2:
                boolean zBooleanValue5 = bool.booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                ad1 ad1Var3 = new ad1(i2, (lq4) obj3, 2);
                ad1Var3.f = zBooleanValue5;
                ad1Var3.g = zBooleanValue6;
                return ad1Var3.invokeSuspend(sbiVar);
            case 3:
                boolean zBooleanValue7 = bool.booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                ad1 ad1Var4 = new ad1(i2, (lq4) obj3, i2);
                ad1Var4.f = zBooleanValue7;
                ad1Var4.g = zBooleanValue8;
                return ad1Var4.invokeSuspend(sbiVar);
            case 4:
                boolean zBooleanValue9 = bool.booleanValue();
                boolean zBooleanValue10 = ((Boolean) obj2).booleanValue();
                ad1 ad1Var5 = new ad1(i2, (lq4) obj3, 4);
                ad1Var5.f = zBooleanValue9;
                ad1Var5.g = zBooleanValue10;
                return ad1Var5.invokeSuspend(sbiVar);
            case 5:
                boolean zBooleanValue11 = bool.booleanValue();
                boolean zBooleanValue12 = ((Boolean) obj2).booleanValue();
                ad1 ad1Var6 = new ad1(i2, (lq4) obj3, 5);
                ad1Var6.f = zBooleanValue11;
                ad1Var6.g = zBooleanValue12;
                return ad1Var6.invokeSuspend(sbiVar);
            case 6:
                boolean zBooleanValue13 = bool.booleanValue();
                boolean zBooleanValue14 = ((Boolean) obj2).booleanValue();
                ad1 ad1Var7 = new ad1(i2, (lq4) obj3, 6);
                ad1Var7.f = zBooleanValue13;
                ad1Var7.g = zBooleanValue14;
                return ad1Var7.invokeSuspend(sbiVar);
            default:
                boolean zBooleanValue15 = bool.booleanValue();
                boolean zBooleanValue16 = ((Boolean) obj2).booleanValue();
                ad1 ad1Var8 = new ad1(i2, (lq4) obj3, 7);
                ad1Var8.f = zBooleanValue15;
                ad1Var8.g = zBooleanValue16;
                return ad1Var8.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.e) {
            case 0:
                boolean z2 = this.f;
                boolean z3 = this.g;
                ch3.d0(obj);
                if (z2 && !z3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                boolean z4 = this.f;
                boolean z5 = this.g;
                ch3.d0(obj);
                if (z4 && !z5) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                boolean z6 = this.f;
                boolean z7 = this.g;
                ch3.d0(obj);
                if (z6 && z7) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                boolean z8 = this.f;
                boolean z9 = this.g;
                ch3.d0(obj);
                return new wx4(z9, !z8);
            case 4:
                boolean z10 = this.f;
                boolean z11 = this.g;
                ch3.d0(obj);
                if (z10 && !z11) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                boolean z12 = this.f;
                boolean z13 = this.g;
                ch3.d0(obj);
                return Boolean.valueOf(z12 || z13);
            case 6:
                boolean z14 = this.f;
                boolean z15 = this.g;
                ch3.d0(obj);
                if (z14 && !z15) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                boolean z16 = this.f;
                boolean z17 = this.g;
                ch3.d0(obj);
                return Boolean.valueOf(z16 || z17);
        }
    }
}
