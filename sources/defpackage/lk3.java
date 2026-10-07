package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lk3 extends mdh implements vf7 {
    public /* synthetic */ wh3 e;
    public /* synthetic */ p9i f;
    public /* synthetic */ Map g;
    public final /* synthetic */ rl3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk3(rl3 rl3Var, lq4 lq4Var) {
        super(4, lq4Var);
        this.h = rl3Var;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        lk3 lk3Var = new lk3(this.h, (lq4) obj4);
        lk3Var.e = (wh3) obj;
        lk3Var.f = (p9i) obj2;
        lk3Var.g = (Map) obj3;
        return lk3Var.invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        dnh dnhVar;
        dnh dnhVarA;
        wh3 wh3Var = this.e;
        p9i p9iVar = this.f;
        Map map = this.g;
        ch3.d0(obj);
        zv8[] zv8VarArr = rl3.Z1;
        List<w73> list = wh3Var.a;
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        for (w73 w73VarO : list) {
            vi9 vi9Var = p9iVar.a;
            long j = w73VarO.a;
            Long l = w73VarO.r;
            zf3 zf3Var = (zf3) vi9Var.b(j);
            Long l2 = l == null ? w73VarO.v : l;
            rl3 rl3Var = this.h;
            ozg ozgVar = ((l != null && ((s7f) ((et3) rl3Var.k.getValue())).t() == l.longValue()) || l2 == null) ? null : (ozg) map.get(Long.valueOf(l2.longValue()));
            boolean z2 = true;
            if (!cqk.d(zf3Var != null ? zf3Var.c : null, w73VarO.i)) {
                z = true;
            } else if ((zf3Var != null ? zf3Var.b : 0) != w73VarO.j) {
                z = true;
            } else {
                z = false;
            }
            boolean zD = cqk.d(ozgVar, w73VarO.x);
            if (z || !zD) {
                boolean z3 = ((f5d) ((wo6) rl3Var.l.getValue())).b() == 0;
                if (z3) {
                    dnhVar = null;
                } else {
                    int i = w73VarO.p;
                    if (!w73VarO.x() && !w73VarO.w()) {
                        z2 = false;
                    }
                    ru2 ru2Var = new ru2(i, w73VarO.y, z2);
                    if (zf3Var != null) {
                        CharSequence charSequence = zf3Var.c;
                        if (charSequence.length() <= 0) {
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            dnhVarA = cnh.a((o9i) rl3Var.C.getValue(), charSequence, ru2Var);
                        } else {
                            dnhVarA = null;
                        }
                    } else {
                        dnhVarA = null;
                    }
                    dnhVar = dnhVarA;
                }
                w73VarO = w73.o(w73VarO, null, null, zf3Var != null ? zf3Var.c : null, zf3Var != null ? zf3Var.b : 0, dnhVar, z3, ozgVar, 25161983);
            }
            arrayList.add(w73VarO);
        }
        return new wh3(arrayList, wh3Var.b);
    }
}
