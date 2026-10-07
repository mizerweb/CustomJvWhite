package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.vk.push.common.Logger;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.push.PushProvider;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r7k extends BaseIPCClient {
    public final String m;
    public final String n;

    public r7k(String str, Context context, List list, Logger logger, p7k p7kVar) {
        super(context, list, 0L, null, p7kVar, logger, 12, null);
        this.m = str;
        this.n = "PushIPCClient";
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final IInterface createInterface(IBinder iBinder) {
        return PushProvider.Stub.asInterface(iBinder);
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.n;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(String str, nq4 nq4Var) {
        m6k m6kVar;
        if (nq4Var instanceof m6k) {
            m6kVar = (m6k) nq4Var;
            int i = m6kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                m6kVar.f = i - Integer.MIN_VALUE;
            } else {
                m6kVar = new m6k(this, nq4Var);
            }
        } else {
            m6kVar = new m6k(this, nq4Var);
        }
        m6k m6kVar2 = m6kVar;
        Object objMakeAsyncRequest$default = m6kVar2.d;
        int i2 = m6kVar2.f;
        if (i2 == 0) {
            ch3.d0(objMakeAsyncRequest$default);
            p6k p6kVar = new p6k(str, this);
            ei6 ei6Var = ei6.k;
            rl0 rl0Var = rl0.t;
            ysj ysjVar = new ysj(1, this, r7k.class, "findPushService", "findPushService(Ljava/lang/String;)Landroid/content/ComponentName;", 0, 5);
            m6kVar2.f = 1;
            objMakeAsyncRequest$default = BaseIPCClient.makeAsyncRequest$default(this, p6kVar, "registerForPushes", ei6Var, rl0Var, ysjVar, 0L, m6kVar2, 32, null);
            hu4 hu4Var = hu4.a;
            if (objMakeAsyncRequest$default == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objMakeAsyncRequest$default);
        }
        return ((roe) objMakeAsyncRequest$default).a;
    }
}
