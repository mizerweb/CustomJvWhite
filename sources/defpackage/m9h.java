package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m9h extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ uii g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9h(uii uiiVar, String str, int i, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.g = uiiVar;
        this.h = str;
        this.i = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new m9h(this.g, this.h, this.i, lq4Var, 0);
            default:
                return new m9h(this.g, this.h, this.i, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((m9h) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Integer num2;
        int i = this.e;
        hu4 hu4Var = hu4.a;
        uii uiiVar = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    List list = (List) uiiVar.h;
                    String str = (String) uiiVar.f;
                    String str2 = this.h;
                    boolean zD = cqk.d(str2, str);
                    int i3 = this.i;
                    if (zD && (num = (Integer) uiiVar.g) != null && num.intValue() == i3 && list != null) {
                        return list;
                    }
                    jah jahVar = (jah) uiiVar.d;
                    this.f = 1;
                    obj = jahVar.e(i3, this, str2);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                uiiVar.h = (List) obj;
                return obj;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    List list2 = (List) uiiVar.i;
                    String str3 = (String) uiiVar.f;
                    String str4 = this.h;
                    boolean zD2 = cqk.d(str4, str3);
                    int i5 = this.i;
                    if (zD2 && (num2 = (Integer) uiiVar.g) != null && num2.intValue() == i5 && list2 != null) {
                        return list2;
                    }
                    g85 g85Var = (g85) uiiVar.e;
                    this.f = 1;
                    obj = yab.K0(((n0c) ((xhh) g85Var.b)).a(), new ht1(g85Var, str4, i5, (lq4) null, 8), this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                uiiVar.i = (List) obj;
                return obj;
        }
    }
}
