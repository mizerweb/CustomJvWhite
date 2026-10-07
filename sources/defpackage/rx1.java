package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class rx1 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx1(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                rx1 rx1Var = new rx1(3, (lq4) obj3, 0);
                rx1Var.g = (vmi) obj;
                rx1Var.f = zBooleanValue;
                return rx1Var.invokeSuspend(sbiVar);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                rx1 rx1Var2 = new rx1(3, (lq4) obj3, 1);
                rx1Var2.g = (e21) obj;
                rx1Var2.f = zBooleanValue2;
                return rx1Var2.invokeSuspend(sbiVar);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                rx1 rx1Var3 = new rx1(3, (lq4) obj3, 2);
                rx1Var3.f = zBooleanValue3;
                rx1Var3.g = (nh7) obj2;
                return rx1Var3.invokeSuspend(sbiVar);
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                rx1 rx1Var4 = new rx1(3, (lq4) obj3, 3);
                rx1Var4.g = (List) obj;
                rx1Var4.f = zBooleanValue4;
                return rx1Var4.invokeSuspend(sbiVar);
            case 4:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                rx1 rx1Var5 = new rx1(3, (lq4) obj3, 4);
                rx1Var5.g = (mpi) obj;
                rx1Var5.f = zBooleanValue5;
                return rx1Var5.invokeSuspend(sbiVar);
            default:
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                rx1 rx1Var6 = new rx1(3, (lq4) obj3, 5);
                rx1Var6.g = (Map) obj;
                rx1Var6.f = zBooleanValue6;
                return rx1Var6.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        boolean z = false;
        r66 r66Var = r66.a;
        switch (i) {
            case 0:
                vmi vmiVar = (vmi) this.g;
                boolean z2 = this.f;
                ch3.d0(obj);
                if (z2) {
                    return Boolean.valueOf(qx1.$EnumSwitchMapping$0[vmiVar.ordinal()] == 1);
                }
                return Boolean.FALSE;
            case 1:
                e21 e21Var = (e21) this.g;
                boolean z3 = this.f;
                ch3.d0(obj);
                return z3 ? e21.g : e21Var;
            case 2:
                boolean z4 = this.f;
                nh7 nh7Var = (nh7) this.g;
                ch3.d0(obj);
                return new ylc(Boolean.valueOf(z4), nh7Var);
            case 3:
                List list = (List) this.g;
                boolean z5 = this.f;
                ch3.d0(obj);
                return z5 ? list : r66Var;
            case 4:
                mpi mpiVar = (mpi) this.g;
                boolean z6 = this.f;
                ch3.d0(obj);
                if ((mpiVar instanceof kpi) && z6) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Map map = (Map) this.g;
                boolean z7 = this.f;
                ch3.d0(obj);
                return z7 ? ww3.T1(map.values()) : r66Var;
        }
    }
}
