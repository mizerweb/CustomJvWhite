package com.vk.push.core.deviceid;

import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.data.repository.CrashReporterRepository;
import defpackage.ao5;
import defpackage.gu4;
import defpackage.jd3;
import defpackage.lb5;
import defpackage.lq4;
import defpackage.yab;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/deviceid/CollectDeviceIdErrorsUseCase;", "", "Lcom/vk/push/core/DeviceIdRepository;", "repository", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashSender", "Lcom/vk/push/common/Logger;", "logger", "Lgu4;", "scope", "<init>", "(Lcom/vk/push/core/DeviceIdRepository;Lcom/vk/push/core/data/repository/CrashReporterRepository;Lcom/vk/push/common/Logger;Lgu4;)V", "Lsbi;", "invoke", "()V", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CollectDeviceIdErrorsUseCase {
    public final DeviceIdRepository a;
    public final CrashReporterRepository b;
    public final Logger c;
    public final gu4 d;

    public CollectDeviceIdErrorsUseCase(DeviceIdRepository deviceIdRepository, CrashReporterRepository crashReporterRepository, Logger logger, gu4 gu4Var) {
        this.a = deviceIdRepository;
        this.b = crashReporterRepository;
        this.c = logger;
        this.d = gu4Var;
    }

    public final void invoke() {
        ao5 ao5Var = ao5.a;
        yab.i0(this.d, lb5.c, 0, new jd3(this, (lq4) null, 7), 2);
    }
}
