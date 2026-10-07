package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bb9 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ bb9(yx6 yx6Var, int i, int i2) {
        this.a = i2;
        this.b = yx6Var;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        ab9 ab9Var;
        n4c n4cVar;
        int i = this.a;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        yl ylVar = null;
        switch (i) {
            case 0:
                if (lq4Var instanceof ab9) {
                    ab9Var = (ab9) lq4Var;
                    int i2 = ab9Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ab9Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        ab9Var = new ab9(this, lq4Var);
                    }
                } else {
                    ab9Var = new ab9(this, lq4Var);
                }
                Object obj2 = ab9Var.d;
                int i3 = ab9Var.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj2);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj2);
                if (this.c >= ((List) obj).size()) {
                    return sbiVar;
                }
                ab9Var.e = 1;
                return yx6Var.emit(obj, ab9Var) == hu4Var ? hu4Var : sbiVar;
            default:
                if (lq4Var instanceof n4c) {
                    n4cVar = (n4c) lq4Var;
                    int i4 = n4cVar.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        n4cVar.e = i4 - Integer.MIN_VALUE;
                    } else {
                        n4cVar = new n4c(this, lq4Var);
                    }
                } else {
                    n4cVar = new n4c(this, lq4Var);
                }
                Object obj3 = n4cVar.d;
                int i5 = n4cVar.e;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj3);
                jl jlVar = (jl) obj;
                if (jlVar != null) {
                    long j = jlVar.a;
                    String str = jlVar.e;
                    String str2 = jlVar.c;
                    ylVar = new yl(this.c, (str2 == null || str2.length() == 0) ? 3 : 1, j, str, str2);
                }
                if (ylVar == null) {
                    return sbiVar;
                }
                n4cVar.e = 1;
                return yx6Var.emit(ylVar, n4cVar) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
