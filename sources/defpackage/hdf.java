package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hdf implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ jdf c;

    public /* synthetic */ hdf(yx6 yx6Var, jdf jdfVar, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = jdfVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        gdf gdfVar;
        idf idfVar;
        int i = this.a;
        sbi sbiVar = sbi.a;
        jdf jdfVar = this.c;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                if (lq4Var instanceof gdf) {
                    gdfVar = (gdf) lq4Var;
                    int i2 = gdfVar.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        gdfVar.e = i2 - Integer.MIN_VALUE;
                    } else {
                        gdfVar = new gdf(this, lq4Var);
                    }
                } else {
                    gdfVar = new gdf(this, lq4Var);
                }
                Object obj2 = gdfVar.d;
                int i3 = gdfVar.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj2);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj2);
                ArrayList arrayList = new ArrayList();
                for (nh7 nh7Var : (List) obj) {
                    boolean z = nh7Var.d;
                    mh7 mh7Var = nh7Var.a;
                    boolean z2 = !z || cqk.d(mh7Var, jh7.a) || cqk.d(mh7Var, kh7.a);
                    adf adfVar = jdfVar.d;
                    if ((adfVar.a && z2) || (!adfVar.b && nh7Var.b == 0)) {
                        nh7Var = null;
                    }
                    if (nh7Var != null) {
                        arrayList.add(nh7Var);
                    }
                }
                gdfVar.e = 1;
                return yx6Var.emit(arrayList, gdfVar) == hu4Var ? hu4Var : sbiVar;
            default:
                if (lq4Var instanceof idf) {
                    idfVar = (idf) lq4Var;
                    int i4 = idfVar.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        idfVar.e = i4 - Integer.MIN_VALUE;
                    } else {
                        idfVar = new idf(this, lq4Var);
                    }
                } else {
                    idfVar = new idf(this, lq4Var);
                }
                Object obj3 = idfVar.d;
                int i5 = idfVar.e;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj3);
                ylc ylcVar = (ylc) obj;
                List list = (List) ylcVar.a;
                nh7 nh7Var2 = (nh7) ylcVar.b;
                List<nh7> list2 = list;
                ArrayList arrayList2 = new ArrayList(yw3.W0(list2, 10));
                for (nh7 nh7Var3 : list2) {
                    kb9 kb9Var = (kb9) jdfVar.c.r.get(nh7Var3.a);
                    arrayList2.add(new oh7(nh7Var3, kb9Var != null ? kb9Var.k : null, cqk.d(nh7Var2 != null ? nh7Var2.a.b() : null, nh7Var3.a.b())));
                }
                idfVar.e = 1;
                return yx6Var.emit(arrayList2, idfVar) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
