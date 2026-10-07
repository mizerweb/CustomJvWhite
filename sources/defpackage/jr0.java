package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.ipc.IpcRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class jr0 extends ux8 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr0(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                IpcRequest ipcRequest = (IpcRequest) obj;
                BaseIPCClient baseIPCClient = (BaseIPCClient) obj2;
                Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Executing pending request as connection is alive now", null, 2, null);
                try {
                    IpcRequest.execute$default(ipcRequest, (IInterface) obj3, (AppInfo) obj4, null, 4, null);
                } catch (RemoteException e) {
                    baseIPCClient.getLogger().error("Could not execute request", e);
                    ipcRequest.onError(e);
                }
                break;
            default:
                uxj uxjVar = (uxj) obj4;
                i19 i19Var = (i19) obj3;
                lk9 lk9Var = (lk9) obj2;
                k66 k66Var = k66.a;
                if (!lk9Var.P0(k66Var)) {
                    i19Var.f(uxjVar);
                } else {
                    lk9Var.D0(k66Var, new txj(i19Var, 0, uxjVar));
                }
                break;
        }
        return sbiVar;
        return sbiVar;
    }
}
