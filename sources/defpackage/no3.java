package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class no3 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no3(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                no3 no3Var = new no3(i2, (lq4) obj3, 0);
                no3Var.g = (List) obj;
                no3Var.f = zBooleanValue;
                return no3Var.invokeSuspend(sbiVar);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                no3 no3Var2 = new no3(i2, (lq4) obj3, 1);
                no3Var2.f = zBooleanValue2;
                no3Var2.g = (gu7) obj2;
                return no3Var2.invokeSuspend(sbiVar);
            default:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                no3 no3Var3 = new no3(i2, (lq4) obj3, 2);
                no3Var3.g = (l49) obj;
                no3Var3.f = zBooleanValue3;
                return no3Var3.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        switch (this.e) {
            case 0:
                List list = (List) this.g;
                boolean z2 = this.f;
                ch3.d0(obj);
                if (z2) {
                    z = true;
                } else {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                osg osgVar = (osg) it.next();
                                if (osgVar.e > 0 || !osgVar.a) {
                                    z = true;
                                }
                            }
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                boolean z3 = this.f;
                gu7 gu7Var = (gu7) this.g;
                ch3.d0(obj);
                return z3 ? gu7Var : du7.c;
            default:
                l49 l49Var = (l49) this.g;
                boolean z4 = this.f;
                ch3.d0(obj);
                if (z4) {
                    return l49Var;
                }
                return null;
        }
    }
}
