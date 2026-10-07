package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.CheckHostsAvailabilityUseCase;

/* JADX INFO: loaded from: classes3.dex */
public final class sek extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ efk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sek(efk efkVar, int i) {
        super(0);
        this.a = i;
        this.b = efkVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        lq4 lq4Var = null;
        efk efkVar = this.b;
        switch (i) {
            case 0:
                Logger logger = xik.a;
                return new CollectDeviceIdErrorsUseCase((DeviceIdRepository) qgk.m.getValue(), (CrashReporterRepository) qgk.u.getValue(), efkVar.b, efkVar.q);
            case 1:
                Logger logger2 = qfk.a;
                Logger logger3 = efkVar.b;
                Logger logger4 = xik.a;
                return new j4k(new g9i((wek) qgk.b.getValue()), new ewe(qgk.c(), logger3), logger3);
            case 2:
                Logger logger5 = t9k.a;
                dq4 dq4Var = efkVar.q;
                Logger logger6 = efkVar.b;
                Logger logger7 = xik.a;
                return new u9k(dq4Var, new CheckHostsAvailabilityUseCase((PackagesRepository) qgk.h.getValue()), logger6);
            case 3:
                Logger logger8 = xik.a;
                Logger logger9 = efkVar.b;
                return new qhk((g4k) qgk.i.getValue(), (mgk) qgk.j.getValue(), qgk.b(), efkVar.q, (g7k) qgk.c.getValue(), logger9);
            case 4:
                Logger logger10 = t9k.a;
                dq4 dq4Var2 = efkVar.q;
                Logger logger11 = efkVar.b;
                Logger logger12 = xik.a;
                ifh ifhVar = qgk.d;
                return new phk(dq4Var2, new rai((hik) ifhVar.getValue()), new n6k((hik) ifhVar.getValue()), logger11);
            case 5:
                Logger logger13 = t9k.a;
                int i2 = 1;
                return new ddk((l4k) qgk.f.getValue(), new p25(i2, lq4Var, i2), efkVar.b);
            default:
                x9k x9kVar = (x9k) efkVar.k.getValue();
                yab.i0(x9kVar.d, null, 0, new oli(x9kVar, lq4Var, 21), 3);
                v9k v9kVar = (v9k) efkVar.l.getValue();
                yab.i0(v9kVar.d, null, 0, new oli(v9kVar, lq4Var, 20), 3);
                return sbi.a;
        }
    }
}
