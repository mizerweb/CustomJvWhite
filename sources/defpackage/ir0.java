package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.ipc.BindingDiedException;
import com.vk.push.core.ipc.IpcRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class ir0 extends ux8 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseIPCClient b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir0(BaseIPCClient baseIPCClient, int i) {
        super(1);
        this.a = i;
        this.b = baseIPCClient;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        BaseIPCClient baseIPCClient = this.b;
        switch (i) {
            case 0:
                baseIPCClient.k.remove((IpcRequest) obj);
                break;
            default:
                Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Notify caller about failed request due to binding death", null, 2, null);
                ((IpcRequest) obj).onError(new BindingDiedException());
                break;
        }
        return sbiVar;
    }
}
