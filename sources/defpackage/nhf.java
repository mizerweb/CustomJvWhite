package defpackage;

import com.vk.push.core.process.SeparateProcessRepository;
import com.vk.push.core.utils.ProcessUtilsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class nhf extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SeparateProcessRepository b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nhf(SeparateProcessRepository separateProcessRepository, int i) {
        super(0);
        this.a = i;
        this.b = separateProcessRepository;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        SeparateProcessRepository separateProcessRepository = this.b;
        boolean z = false;
        switch (i) {
            case 0:
                String serviceProcessName = separateProcessRepository.b.getServiceProcessName();
                if (serviceProcessName != null && serviceProcessName.endsWith(":vkpns")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                String processName = ProcessUtilsKt.getProcessName(separateProcessRepository.a);
                if (processName != null && r5h.L0(processName, ":vkpns", false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
