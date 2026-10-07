package ru.rustore.sdk.pushclient.internal.arbiter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.ComponentActions;
import defpackage.efk;
import defpackage.ifh;
import defpackage.lq4;
import defpackage.oli;
import defpackage.ore;
import defpackage.qv;
import defpackage.yab;

/* JADX INFO: loaded from: classes3.dex */
public final class ArbiterBroadcastReceiver extends BroadcastReceiver {
    public final ifh a = new ifh(new qv(0, this));

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lq4 lq4Var = null;
        Logger.DefaultImpls.info$default((Logger) this.a.getValue(), "Master update broadcast received", null, 2, null);
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 1854594276 && action.equals(ComponentActions.MASTER_HOST_UPDATE_ACTION)) {
            if (efk.s == null) {
                Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
                return;
            }
            efk efkVar = efk.s;
            if (efkVar == null) {
                ore.k("Client SDK is not initialized, did you call init method in your Application class?");
            } else {
                Logger.DefaultImpls.info$default(efkVar.b, "Update master", null, 2, null);
                yab.i0(efkVar.q, null, 0, new oli(efkVar, lq4Var, 26), 3);
            }
        }
    }
}
