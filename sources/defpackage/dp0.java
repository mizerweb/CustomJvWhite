package defpackage;

import android.content.Context;
import one.me.calls.impl.service.b;
import one.me.calls.impl.service.d;
import one.me.calls.impl.service.telecom.a;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class dp0 extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ dp0(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        int i = 1;
        int i2 = 0;
        switch (this.b) {
            case 0:
                return new jp0(h5Var.d(34), h5Var.d(132), h5Var.d(478), h5Var.d(23));
            case 1:
                return new ap0((uo0) h5Var.c(933), (xhh) h5Var.c(23), (jp0) h5Var.c(935));
            case 2:
                return new x11(h5Var.d(7), h5Var.d(269), h5Var.d(85), h5Var.d(353), h5Var.d(23), h5Var.d(254));
            case 3:
                return new ib1((w82) h5Var.c(839), h5Var.d(107), h5Var.d(717), h5Var.d(236));
            case 4:
                return new ua2((y82) h5Var.c(65), h5Var.d(85), h5Var.d(109), h5Var.d(82));
            case 5:
                return new t9c(h5Var.d(109), h5Var.d(24), h5Var.d(325), h5Var.d(26), h5Var.d(721));
            case 6:
                return new o3c(h5Var.d(109));
            case 7:
                return new t2c(h5Var.d(109));
            case 8:
                r6a r6aVar = new r6a(h5Var.d(85), h5Var.d(97), h5Var.d(664));
                return new mi1(h5Var.d(7), h5Var.d(62), h5Var.d(82), new uii(r6aVar, r6aVar, r6aVar, h5Var.d(82), h5Var.d(76), h5Var.d(97), h5Var.d(5)).g(), h5Var.d(97), h5Var.d(708), h5Var.d(709), h5Var.d(710), h5Var.d(712), h5Var.d(85), h5Var.d(26), h5Var.d(5));
            case 9:
                return new hc1((j12) h5Var.c(741));
            case 10:
                return new n42((b95) h5Var.c(107), (ha9) h5Var.c(30), (j72) h5Var.c(720), (sa2) h5Var.c(236), (y82) h5Var.c(65));
            case 11:
                return new wo1(h5Var.d(26), h5Var.d(719), h5Var.d(65), h5Var.d(23));
            case 12:
                return new ya1(h5Var.d(719), h5Var.d(55), h5Var.d(56), h5Var.d(63), (y82) h5Var.c(65), h5Var.d(286), (j52) h5Var.c(707), h5Var.d(236), h5Var.d(23));
            case 13:
                return new sf1(h5Var.d(719));
            case 14:
                return new syb(new b((e5d) h5Var.c(26)), new a((ha9) h5Var.c(30)), new d((ha9) h5Var.c(30)), (e5d) h5Var.c(26));
            case 15:
                return new l92();
            case 16:
                return new f9();
            case 17:
                return new j72();
            case 18:
                return new qd1();
            case 19:
                return new rd1((y82) h5Var.c(65), h5Var.d(719));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new ac1(h5Var.d(719), new ifh(new ic1(h5Var, i2)), h5Var.d(704), h5Var.d(55), new ifh(new ic1(h5Var, i)), h5Var.d(107), h5Var.d(26), (y82) h5Var.c(65));
            case 21:
                return new unc(h5Var.d(719), h5Var.d(107), h5Var.d(55));
            case 22:
                return new io5(h5Var.d(57), (y82) h5Var.c(65), h5Var.d(23));
            case 23:
                return new z82(h5Var.d(116), h5Var.d(342), (wmi) h5Var.c(139));
            case 24:
                return new js1(h5Var.d(322), h5Var.d(344), h5Var.d(85), h5Var.d(7), h5Var.d(348), h5Var.d(641));
            case 25:
                return new ue1((Context) h5Var.c(7), (ha9) h5Var.c(30), h5Var.d(703), h5Var.d(65), h5Var.d(26), h5Var.d(733));
            case 26:
                drc drcVar = new drc();
                drcVar.e = (rrc) h5Var.c(8);
                krc krcVar = (krc) h5Var.c(9);
                drcVar.d = krcVar != null ? krcVar.a : null;
                drcVar.f = (exb) h5Var.c(10);
                drcVar.e((zqc) h5Var.c(11));
                drcVar.b("calls_init");
                drcVar.d(new do1(h5Var.d(0), (rrc) h5Var.c(8), 0));
                return new eo1(drcVar.a());
            case 27:
                drc drcVar2 = new drc();
                drcVar2.e = (rrc) h5Var.c(8);
                krc krcVar2 = (krc) h5Var.c(9);
                drcVar2.d = krcVar2 != null ? krcVar2.a : null;
                drcVar2.f = (exb) h5Var.c(10);
                drcVar2.e((zqc) h5Var.c(11));
                drcVar2.b("calls_screen_init");
                drcVar2.d(new do1(h5Var.d(0), (rrc) h5Var.c(8), 1));
                return new tx1(drcVar2.a());
            case 28:
                drc drcVar3 = new drc();
                drcVar3.e = (rrc) h5Var.c(8);
                krc krcVar3 = (krc) h5Var.c(9);
                drcVar3.d = krcVar3 != null ? krcVar3.a : null;
                drcVar3.f = (exb) h5Var.c(10);
                drcVar3.e((zqc) h5Var.c(11));
                drcVar3.b("incoming_calls_init");
                drcVar3.d(new do1(h5Var.d(0), (rrc) h5Var.c(8), 2));
                return new kc8(drcVar3.a());
            default:
                return new fa2();
        }
    }
}
