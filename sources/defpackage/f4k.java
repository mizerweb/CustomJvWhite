package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.vk.push.common.Logger;
import com.vk.push.core.hostinfo.MasterElections;
import com.vk.push.core.ipc.BaseIPCClient;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f4k extends BaseIPCClient {
    public final String m;

    public f4k(Context context, List list, Logger logger) {
        super(context, list, 0L, null, null, logger, 12, null);
        this.m = "ArbiterIPCClient";
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final IInterface createInterface(IBinder iBinder) {
        return MasterElections.Stub.asInterface(iBinder);
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(nq4 nq4Var) {
        n2k n2kVar;
        if (nq4Var instanceof n2k) {
            n2kVar = (n2k) nq4Var;
            int i = n2kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                n2kVar.f = i - Integer.MIN_VALUE;
            } else {
                n2kVar = new n2k(this, nq4Var);
            }
        } else {
            n2kVar = new n2k(this, nq4Var);
        }
        n2k n2kVar2 = n2kVar;
        Object objMakeAsyncRequest$default = n2kVar2.d;
        int i2 = n2kVar2.f;
        if (i2 == 0) {
            ch3.d0(objMakeAsyncRequest$default);
            ei6 ei6Var = ei6.e;
            ei6 ei6Var2 = ei6.f;
            rl0 rl0Var = rl0.q;
            ik5 ik5Var = new ik5(7, this);
            n2kVar2.f = 1;
            objMakeAsyncRequest$default = BaseIPCClient.makeAsyncRequest$default(this, ei6Var, "getMaster", ei6Var2, rl0Var, ik5Var, 0L, n2kVar2, 32, null);
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
