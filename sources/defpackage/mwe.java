package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.base.DelayedAction;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.domain.repository.CallingAppRepository;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import one.me.sdk.vendor.rustore.push.RustoreMessagingService;

/* JADX INFO: loaded from: classes3.dex */
public final class mwe extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RustoreMessagingService b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwe(RustoreMessagingService rustoreMessagingService, int i) {
        super(0);
        this.a = i;
        this.b = rustoreMessagingService;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Logger logger = qfk.a;
                Logger loggerA = this.b.a();
                PackagesRepository packagesRepository = (PackagesRepository) qgk.h.getValue();
                Logger logger2 = xik.a;
                return new kdk(new euc(new GetCallingAppInfoUseCase((CallingAppRepository) qgk.q.getValue()), packagesRepository, (n7k) qgk.e.getValue(), 21), (l4k) qgk.f.getValue(), (y3k) t9k.b.getValue(), (g7k) qgk.c.getValue(), (CrashReporterRepository) qgk.u.getValue(), qgk.b(), loggerA);
            case 1:
                RustoreMessagingService rustoreMessagingService = this.b;
                int i = RustoreMessagingService.k;
                Logger.DefaultImpls.info$default(rustoreMessagingService.a(), "Stop service immediately", null, 2, null);
                rustoreMessagingService.stopSelf(rustoreMessagingService.g);
                return sbi.a;
            default:
                return new DelayedAction(null, new mwe(this.b, 1), 1, null);
        }
    }
}
