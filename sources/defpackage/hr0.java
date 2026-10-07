package defpackage;

import com.vk.push.core.base.DelayedAction;
import com.vk.push.core.ipc.BaseIPCClient;

/* JADX INFO: loaded from: classes2.dex */
public final class hr0 extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseIPCClient b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr0(BaseIPCClient baseIPCClient, int i) {
        super(0);
        this.a = i;
        this.b = baseIPCClient;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        BaseIPCClient baseIPCClient = this.b;
        switch (i) {
            case 0:
                if (baseIPCClient.k.isEmpty()) {
                    baseIPCClient.e();
                }
                return sbi.a;
            default:
                return new DelayedAction(null, new hr0(baseIPCClient, 0), 1, null);
        }
    }
}
