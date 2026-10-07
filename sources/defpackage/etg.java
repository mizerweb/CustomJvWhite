package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class etg extends mdh implements xf7 {
    public /* synthetic */ zsg e;
    public /* synthetic */ ylc f;
    public /* synthetic */ bsg g;
    public /* synthetic */ boolean h;
    public /* synthetic */ boolean i;
    public final /* synthetic */ ftg j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etg(ftg ftgVar, lq4 lq4Var) {
        super(6, lq4Var);
        this.j = ftgVar;
    }

    @Override // defpackage.xf7
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        etg etgVar = new etg(this.j, (lq4) obj6);
        etgVar.e = (zsg) obj;
        etgVar.f = (ylc) obj2;
        etgVar.g = (bsg) obj3;
        etgVar.h = zBooleanValue;
        etgVar.i = zBooleanValue2;
        return etgVar.invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        zsg zsgVar = this.e;
        ylc ylcVar = this.f;
        bsg bsgVar = this.g;
        boolean z2 = this.h;
        boolean z3 = this.i;
        ch3.d0(obj);
        List list = (List) ylcVar.a;
        yg6 yg6Var = (yg6) ylcVar.b;
        boolean z4 = yg6Var != null ? yg6Var.c : false;
        ArrayList arrayList = zsgVar.a;
        boolean z5 = zsgVar.b;
        if (z2) {
            z = true;
        } else {
            int i = ftg.k;
            int i2 = bsgVar == null ? -1 : atg.$EnumSwitchMapping$0[bsgVar.ordinal()];
            if (i2 == -1 || i2 == 1 || i2 == 2 || i2 == 3) {
                z = true;
            } else {
                if (i2 != 4 && i2 != 5) {
                    ore.o();
                    return null;
                }
                z = false;
            }
        }
        return new g6h(arrayList, list, z3, z2, z, z5, z4);
    }
}
