package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.vk.push.common.Logger;
import com.vk.push.core.auth.Auth;
import com.vk.push.core.ipc.BaseIPCClient;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m7k extends BaseIPCClient {
    public final String m;

    public m7k(Context context, List list, Logger logger, af7 af7Var) {
        super(context, list, 0L, null, af7Var, logger, 12, null);
        this.m = "AuthIPCClient";
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final IInterface createInterface(IBinder iBinder) {
        return Auth.Stub.asInterface(iBinder);
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(nq4 nq4Var) {
        x6k x6kVar;
        if (nq4Var instanceof x6k) {
            x6kVar = (x6k) nq4Var;
            int i = x6kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                x6kVar.f = i - Integer.MIN_VALUE;
            } else {
                x6kVar = new x6k(this, nq4Var);
            }
        } else {
            x6kVar = new x6k(this, nq4Var);
        }
        x6k x6kVar2 = x6kVar;
        Object objMakeAsyncRequest$default = x6kVar2.d;
        int i2 = x6kVar2.f;
        if (i2 == 0) {
            ch3.d0(objMakeAsyncRequest$default);
            ei6 ei6Var = ei6.l;
            ei6 ei6Var2 = ei6.m;
            rl0 rl0Var = rl0.v;
            rl0 rl0Var2 = rl0.w;
            x6kVar2.f = 1;
            objMakeAsyncRequest$default = BaseIPCClient.makeAsyncRequest$default(this, ei6Var, "isUserAuthorized", ei6Var2, rl0Var, rl0Var2, 0L, x6kVar2, 32, null);
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object i(nq4 nq4Var) {
        j6k j6kVar;
        if (nq4Var instanceof j6k) {
            j6kVar = (j6k) nq4Var;
            int i = j6kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                j6kVar.f = i - Integer.MIN_VALUE;
            } else {
                j6kVar = new j6k(this, nq4Var);
            }
        } else {
            j6kVar = new j6k(this, nq4Var);
        }
        j6k j6kVar2 = j6kVar;
        Object objMakeAsyncRequest$default = j6kVar2.d;
        int i2 = j6kVar2.f;
        if (i2 == 0) {
            ch3.d0(objMakeAsyncRequest$default);
            ei6 ei6Var = ei6.i;
            ei6 ei6Var2 = ei6.j;
            rl0 rl0Var = rl0.s;
            rl0 rl0Var2 = rl0.u;
            j6kVar2.f = 1;
            objMakeAsyncRequest$default = BaseIPCClient.makeAsyncRequest$default(this, ei6Var, "getIntermediateToken", ei6Var2, rl0Var, rl0Var2, 0L, j6kVar2, 32, null);
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
