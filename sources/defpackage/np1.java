package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class np1 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ np1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) throws Throwable {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                xx6[] xx6VarArr = (xx6[]) obj4;
                Object objN = n1g.n(lq4Var, yx6Var, new j7(xx6VarArr, 1), new mp1(null, (gu4) obj3, (List) obj2, (op1) obj), xx6VarArr);
                return objN == hu4Var ? objN : sbiVar;
            default:
                Object objCollect = ((r07) obj4).collect(new ck3(yx6Var, (mu1) obj3, (dyc) obj2, (Long) obj, 3), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
        }
    }
}
