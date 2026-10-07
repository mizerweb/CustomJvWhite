package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tge implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ wge c;

    public /* synthetic */ tge(yx6 yx6Var, wge wgeVar, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = wgeVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        sge sgeVar;
        uge ugeVar;
        vge vgeVar;
        int i = this.a;
        sbi sbiVar = sbi.a;
        wge wgeVar = this.c;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                if (lq4Var instanceof sge) {
                    sgeVar = (sge) lq4Var;
                    int i2 = sgeVar.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        sgeVar.e = i2 - Integer.MIN_VALUE;
                    } else {
                        sgeVar = new sge(this, lq4Var);
                    }
                } else {
                    sgeVar = new sge(this, lq4Var);
                }
                Object obj2 = sgeVar.d;
                int i3 = sgeVar.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj2);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj2);
                String[] strArr = (String[]) obj;
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str : strArr) {
                    arrayList.add(wgeVar.b(str));
                }
                sgeVar.e = 1;
                return yx6Var.emit(arrayList, sgeVar) == hu4Var ? hu4Var : sbiVar;
            case 1:
                if (lq4Var instanceof uge) {
                    ugeVar = (uge) lq4Var;
                    int i4 = ugeVar.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ugeVar.e = i4 - Integer.MIN_VALUE;
                    } else {
                        ugeVar = new uge(this, lq4Var);
                    }
                } else {
                    ugeVar = new uge(this, lq4Var);
                }
                Object obj3 = ugeVar.d;
                int i5 = ugeVar.e;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj3);
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList(yw3.W0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(wgeVar.b((String) it.next()));
                }
                ugeVar.e = 1;
                return yx6Var.emit(arrayList2, ugeVar) == hu4Var ? hu4Var : sbiVar;
            default:
                if (lq4Var instanceof vge) {
                    vgeVar = (vge) lq4Var;
                    int i6 = vgeVar.e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        vgeVar.e = i6 - Integer.MIN_VALUE;
                    } else {
                        vgeVar = new vge(this, lq4Var);
                    }
                } else {
                    vgeVar = new vge(this, lq4Var);
                }
                Object obj4 = vgeVar.d;
                int i7 = vgeVar.e;
                if (i7 == 0) {
                    ch3.d0(obj4);
                    List listM1 = ww3.M1(ww3.X1((List) obj), wgeVar.e);
                    vgeVar.e = 1;
                    return yx6Var.emit(listM1, vgeVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i7 == 1) {
                    ch3.d0(obj4);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
