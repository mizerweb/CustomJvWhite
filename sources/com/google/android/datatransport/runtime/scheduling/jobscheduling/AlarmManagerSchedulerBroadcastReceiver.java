package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.c86;
import defpackage.ff;
import defpackage.g4i;
import defpackage.ij0;
import defpackage.xtj;
import defpackage.yhd;
import defpackage.z18;
import java.util.concurrent.Executor;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter(LogFactory.PRIORITY_KEY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        g4i.b(context);
        xtj xtjVarA = ij0.a();
        xtjVarA.D(queryParameter);
        xtjVarA.d = yhd.b(iIntValue);
        int i2 = 0;
        if (queryParameter2 != null) {
            xtjVarA.c = Base64.decode(queryParameter2, 0);
        }
        z18 z18Var = g4i.a().d;
        ((Executor) z18Var.e).execute(new c86(z18Var, xtjVarA.n(), i, new ff(i2)));
    }
}
