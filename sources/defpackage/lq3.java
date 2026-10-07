package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class lq3 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ pq3 c;

    public /* synthetic */ lq3(yx6 yx6Var, pq3 pq3Var, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = pq3Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        kq3 kq3Var;
        oq3 oq3Var;
        switch (this.a) {
            case 0:
                if (lq4Var instanceof kq3) {
                    kq3Var = (kq3) lq4Var;
                    int i = kq3Var.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kq3Var.e = i - Integer.MIN_VALUE;
                    } else {
                        kq3Var = new kq3(this, lq4Var);
                    }
                } else {
                    kq3Var = new kq3(this, lq4Var);
                }
                Object obj2 = kq3Var.d;
                hu4 hu4Var = hu4.a;
                int i2 = kq3Var.e;
                if (i2 == 0) {
                    ch3.d0(obj2);
                    yx6 yx6Var = this.b;
                    ahb ahbVarA = ((j55) this.c.e).a();
                    kq3Var.e = 1;
                    if (yx6Var.emit(ahbVarA, kq3Var) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj2);
                }
                return sbi.a;
            default:
                if (lq4Var instanceof oq3) {
                    oq3Var = (oq3) lq4Var;
                    int i3 = oq3Var.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        oq3Var.e = i3 - Integer.MIN_VALUE;
                    } else {
                        oq3Var = new oq3(this, lq4Var);
                    }
                } else {
                    oq3Var = new oq3(this, lq4Var);
                }
                Object obj3 = oq3Var.d;
                hu4 hu4Var2 = hu4.a;
                int i4 = oq3Var.e;
                if (i4 == 0) {
                    ch3.d0(obj3);
                    yx6 yx6Var2 = this.b;
                    String str = (String) this.c.i;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "big_flow: map", null);
                        }
                    }
                    pq3 pq3Var = this.c;
                    mbc mbcVar = (mbc) pq3Var.d;
                    SharedPreferences sharedPreferences = (SharedPreferences) ((ifh) ((j55) pq3Var.e).a).getValue();
                    nbc nbcVar = nbc.SPACE;
                    nbc nbcVarA = mbcVar.a(sharedPreferences.getString("themename", "OneMeGlobalThemeColorSpace"));
                    kbc kbcVarL = nbcVarA != null ? f55.l(nbcVarA, this.c.n()) : null;
                    oq3Var.e = 1;
                    if (yx6Var2.emit(kbcVarL, oq3Var) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj3);
                }
                return sbi.a;
        }
    }
}
