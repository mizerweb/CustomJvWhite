package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vz5 extends mdh implements qf7 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ wz5 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ CharSequence j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ List l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz5(wz5 wz5Var, long j, long j2, CharSequence charSequence, boolean z, List list, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = wz5Var;
        this.h = j;
        this.i = j2;
        this.j = charSequence;
        this.k = z;
        this.l = list;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        vz5 vz5Var = new vz5(this.g, this.h, this.i, this.j, this.k, this.l, lq4Var);
        vz5Var.f = obj;
        return vz5Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((vz5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objF;
        t60 t60VarV;
        String str;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) this.f;
        hu4 hu4Var = hu4.a;
        int i = this.e;
        boolean z = true;
        if (i == 0) {
            ch3.d0(obj);
            gm0.x(gu4Var.getClass().getName(), "Edit message.", null);
            sua suaVar = (sua) this.g.b.getValue();
            long j = this.h;
            this.f = gu4Var;
            this.e = 1;
            objF = suaVar.f(j, this);
            if (objF == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            objF = obj;
        }
        sfa sfaVar = (sfa) objF;
        if (sfaVar != null) {
            List listB = ((xl7) this.g.a.getValue()).b(this.j, this.i);
            CharSequence charSequence = this.j;
            if (charSequence == null) {
                charSequence = "";
            }
            String string = charSequence.toString();
            if (!sfaVar.V()) {
                z = false;
                break;
            }
            t60 t60VarV2 = sfaVar.v();
            String str2 = t60VarV2 != null ? t60VarV2.b : null;
            if (str2 != null && str2.length() != 0 && (t60VarV = sfaVar.v()) != null && (str = t60VarV.b) != null) {
                String strF1 = r5h.f1(r5h.f1(str, "http://"), "https://");
                qu6 qu6VarS0 = yhf.s0(yhf.m0(new sw(1, listB), new us5(4)), new us5(5));
                boolean z2 = r5h.L0(string, strF1, true) || r5h.L0(string, str, false);
                pu6 pu6Var = new pu6(qu6VarS0);
                while (true) {
                    if (!pu6Var.hasNext()) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    String str3 = (String) pu6Var.next();
                    if (z5h.G0(str3, str, true) || z5h.G0(str3, strF1, true) || r5h.f1(r5h.f1(str3, "http://"), "https://").equalsIgnoreCase(strF1)) {
                    }
                    z = false;
                    break;
                }
            }
            z = false;
            break;
            if (this.k || z) {
                String name = gu4Var.getClass().getName();
                List list = this.l;
                boolean z3 = this.k;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "Edit message. Attachments scenario, media size:" + (list != null ? new Integer(list.size()) : null) + ", media changed:" + z3, null);
                    }
                }
                List list2 = this.l;
                if (list2 == null) {
                    list2 = r66.a;
                }
                jkf jkfVar = new jkf(sfaVar.a, this.i, list2);
                jkfVar.i = string;
                jkfVar.j = listB;
                ((wzj) this.g.d.getValue()).c(new kkf(jkfVar));
                return sbiVar;
            }
            CharSequence charSequence2 = this.j;
            if ((charSequence2 != null && charSequence2.length() != 0) || sfaVar.B(y60.c) || sfaVar.B(y60.d)) {
                gm0.n(gu4Var.getClass().getName(), "Edit message. Text scenario");
                wz5 wz5Var = this.g;
                long j2 = this.i;
                long j3 = this.h;
                CharSequence charSequence3 = this.j;
                ((wzj) wz5Var.d.getValue()).c(new mkf(new lkf(j3, r5h.y1(charSequence3 != null ? charSequence3 : "").toString(), listB, j2)));
                return sbiVar;
            }
        }
        return sbiVar;
    }
}
