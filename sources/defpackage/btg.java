package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class btg extends mdh implements tf7 {
    public /* synthetic */ zsg e;
    public /* synthetic */ boolean f;
    public final /* synthetic */ ftg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btg(ftg ftgVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.g = ftgVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        btg btgVar = new btg(this.g, (lq4) obj3);
        btgVar.e = (zsg) obj;
        btgVar.f = zBooleanValue;
        return btgVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object next;
        boolean zIsEmpty;
        zsg zsgVar = this.e;
        boolean z = this.f;
        ch3.d0(obj);
        boolean z2 = false;
        if (z) {
            ArrayList arrayList = zsgVar.a;
            int i = ftg.k;
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((osg) next).a);
            osg osgVar = (osg) next;
            if (osgVar != null) {
                zIsEmpty = osgVar.e <= 0 && arrayList.size() < 2;
            } else {
                zIsEmpty = arrayList.isEmpty();
            }
            if (zIsEmpty) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
