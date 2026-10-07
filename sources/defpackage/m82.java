package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m82 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ w82 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m82(w82 w82Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = w82Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        w82 w82Var = this.g;
        switch (i) {
            case 0:
                m82 m82Var = new m82(w82Var, lq4Var, 0);
                m82Var.f = obj;
                return m82Var;
            default:
                m82 m82Var2 = new m82(w82Var, lq4Var, 1);
                m82Var2.f = obj;
                return m82Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((m82) create((x02) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((m82) create((vmi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        w82 w82Var = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                x02 x02Var = (x02) obj2;
                ch3.d0(obj);
                mjg mjgVar = w82Var.m;
                x02 x02Var2 = (x02) mjgVar.getValue();
                if (!r5h.X0(x02Var2.s()) && !r5h.X0(x02Var.s()) && !cqk.d(x02Var2.s(), x02Var.s())) {
                    w82Var.n.a(sbiVar);
                }
                mjgVar.setValue(x02Var);
                break;
            default:
                vmi vmiVar = (vmi) obj2;
                ch3.d0(obj);
                if (vmiVar == vmi.a) {
                    dz4 dz4Var = (dz4) ((x02) w82Var.m.getValue()).z().getValue();
                    sa2 sa2Var = (sa2) w82Var.k.getValue();
                    String strA = ns4.a(dz4Var.c);
                    boolean z = dz4Var.i;
                    sa2Var.getClass();
                    sa2.c(sa2Var, "BAD_CONNECTION_ALERT", strA, "VPN", null, null, null, z, null, 376);
                }
                w82Var.m(vmiVar);
                break;
        }
        return sbiVar;
    }
}
