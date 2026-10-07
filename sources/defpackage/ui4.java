package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ui4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ vi4 g;
    public final /* synthetic */ pz5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui4(vi4 vi4Var, pz5 pz5Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = vi4Var;
        this.h = pz5Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        pz5 pz5Var = this.h;
        vi4 vi4Var = this.g;
        switch (i) {
            case 0:
                return new ui4(vi4Var, pz5Var, lq4Var, 0);
            default:
                return new ui4(vi4Var, pz5Var, lq4Var, 1);
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
        return ((ui4) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ynh xnhVar;
        int i = this.e;
        hu4 hu4Var = hu4.a;
        boolean z = true;
        vi4 vi4Var = this.g;
        pz5 pz5Var = this.h;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    ptd ptdVar = (ptd) vi4Var.C.getValue();
                    String str = pz5Var.c;
                    String str2 = pz5Var.h;
                    String string = str != null ? r5h.y1(gxl.d(str)).toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    String str3 = pz5Var.f;
                    String string2 = str3 != null ? r5h.y1(gxl.d(str3)).toString() : null;
                    pz5 pz5Var2 = (pz5) vi4Var.k.getValue();
                    boolean zD = cqk.d(pz5Var2 != null ? pz5Var2.h : null, str2);
                    boolean z2 = str2 == null || r5h.X0(str2);
                    if (zD || z2) {
                        str2 = (zD || !z2) ? null : "$REMOVE$";
                    }
                    this.f = 1;
                    obj = ptdVar.a(string, string2, str2, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    ch3.d0(obj);
                }
                ntd ntdVar = (ntd) obj;
                if (!(ntdVar instanceof mtd)) {
                    if (ntdVar instanceof ltd) {
                        pzf pzfVar = vi4Var.e;
                        dih dihVarA = svl.a(((ltd) ntdVar).a);
                        if (dihVarA.equals(zhh.a)) {
                            xnhVar = new tnh(R.string.common_error_base_retry);
                        } else if (dihVarA.equals(aih.a)) {
                            xnhVar = new tnh(R.string.common_network_error);
                        } else if (dihVarA.equals(bih.a)) {
                            xnhVar = new tnh(R.string.common_service_error);
                        } else if (dihVarA instanceof cih) {
                            xnhVar = new xnh(((cih) dihVarA).a);
                        } else {
                            ore.o();
                        }
                        uod uodVar = new uod(xnhVar, new Integer(R.drawable.icon_warning));
                        this.f = 2;
                        if (pzfVar.emit(uodVar, this) == hu4Var) {
                            return hu4Var;
                        }
                        z = false;
                    } else {
                        ore.o();
                    }
                    return null;
                }
                return Boolean.valueOf(z);
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    dm4 dm4Var = (dm4) vi4Var.x.getValue();
                    long j = vi4Var.p;
                    String str4 = pz5Var.c;
                    String string3 = str4 != null ? r5h.y1(gxl.d(str4)).toString() : null;
                    String str5 = pz5Var.f;
                    String string4 = str5 != null ? r5h.y1(gxl.d(str5)).toString() : null;
                    this.f = 1;
                    if (dm4Var.a(j, this, string3, string4) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
        }
    }
}
