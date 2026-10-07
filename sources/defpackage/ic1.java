package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class ic1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ ic1(h5 h5Var, int i) {
        this.a = i;
        this.b = h5Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        h5 h5Var = this.b;
        switch (i) {
            case 0:
                return new d82(h5Var.d(7), h5Var.d(55), new cxd(h5Var.d(106)), h5Var.d(82), h5Var.d(97), h5Var.d(26));
            case 1:
                return ((a2c) h5Var.c(27)).d();
            case 2:
                return new qu2((Context) h5Var.c(7), (ky8) h5Var.c(178), (wmi) h5Var.c(139), (su2) h5Var.c(991), (pa4) h5Var.c(738), h5Var.d(1000));
            case 3:
                return Long.valueOf(((s7f) ((et3) h5Var.c(85))).t());
            case 4:
                int iIntValue = ((Number) ((f5d) ((wo6) h5Var.c(54))).a.M3.a(e5d.S6[248]).i()).intValue();
                return iIntValue > 0 ? a2c.f((a2c) h5Var.c(27), "room", iIntValue, iIntValue, false, true, 0, 96) : ((a2c) h5Var.c(27)).c();
            case 5:
                int iIntValue2 = ((Number) ((f5d) ((wo6) h5Var.c(54))).a.N3.a(e5d.S6[249]).i()).intValue();
                if (iIntValue2 > 1) {
                    return a2c.f((a2c) h5Var.c(27), "room-tx", iIntValue2, iIntValue2, false, true, 0, 96);
                }
                a2c a2cVar = (a2c) h5Var.c(27);
                zv8[] zv8VarArr = a2c.t;
                v1c v1cVarB = a2cVar.b();
                v1cVarB.getClass();
                return a2cVar.i(v1cVarB.a(new od6("room-tx", 1, 1, 0L, true, false, 5, false, true)), "room-tx");
            case 6:
                return ((a2c) h5Var.c(27)).a();
            case 7:
                return ((Boolean) ((f5d) ((wo6) h5Var.c(54))).a.Z3.a(e5d.S6[261]).h().getValue()).booleanValue() ? new ee7(((a2c) h5Var.c(27)).a()) : tai.l();
            case 8:
                return new jz8(h5Var);
            case 9:
                return (ScheduledExecutorService) ((a2c) h5Var.c(27)).p.getValue();
            case 10:
                j71 j71Var = new j71();
                j71Var.e((j6g) h5Var.c(151));
                j71Var.h((s25) h5Var.c(149));
                j71Var.f(null);
                j71Var.g();
                return j71Var;
            case 11:
                a2c a2cVar2 = (a2c) h5Var.c(27);
                od6 od6Var = a2cVar2.o;
                zv8 zv8Var = a2c.t[4];
                return a2cVar2.e(od6Var);
            case 12:
                return ((n0c) ((xhh) h5Var.c(23))).b();
            case 13:
                return ((n0c) ((xhh) h5Var.c(23))).d();
            case 14:
                return (Boolean) ((e5d) h5Var.c(26)).e6.a(e5d.S6[370]).i();
            case 15:
                a2c a2cVar3 = (a2c) h5Var.c(27);
                zv8[] zv8VarArr2 = a2c.t;
                v1c v1cVarB2 = a2cVar3.b();
                v1cVarB2.getClass();
                return a2cVar3.h(a2cVar3.i(v1cVarB2.a(new od6("rlottie", 1, 1, 0L, true, false, 5, false, true)), "rlottie"), "rlottie");
            case 16:
                return Boolean.valueOf(((pk5) h5Var.c(88)).compareTo(pk5.HIGH) >= 0);
            case 17:
                return new zwb(h5Var);
            case 18:
                return Boolean.valueOf(((pk5) h5Var.c(88)).compareTo(pk5.AVERAGE) >= 0);
            case 19:
                a2c a2cVar4 = (a2c) h5Var.c(27);
                od6 od6Var2 = a2cVar4.o;
                zv8 zv8Var2 = a2c.t[4];
                return a2cVar4.e(od6Var2);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return (Boolean) ((e5d) h5Var.c(26)).d2.a(e5d.S6[159]).i();
            case 21:
                return (ScheduledExecutorService) ((a2c) h5Var.c(27)).p.getValue();
            case 22:
                return Boolean.valueOf(((svb) h5Var.c(100)).b());
            case 23:
                return ((n0c) ((xhh) h5Var.c(23))).a();
            case 24:
                return new k7f(h5Var);
            case 25:
                Boolean bool = (Boolean) ((f5d) ((wo6) h5Var.c(54))).a.b5.a(e5d.S6[315]).i();
                bool.getClass();
                return bool;
            case 26:
                return new qd6(((mle) h5Var.c(465)).a);
            case 27:
                return new qd6(((lih) h5Var.c(464)).a);
            case 28:
                return new qd6(((twe) h5Var.c(660)).a);
            default:
                return (Boolean) ((e5d) h5Var.c(26)).U5.a(e5d.S6[360]).i();
        }
    }
}
