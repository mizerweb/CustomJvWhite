package com.vk.push.core.remote.config.omicron;

import com.vk.push.core.remote.config.omicron.executor.DefaultExecutorFactory;
import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import defpackage.atb;
import defpackage.g85;
import defpackage.mz0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends atb {
    public final ExecutorService f;
    public final /* synthetic */ g85 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g85 g85Var, OmicronConfig omicronConfig) {
        super(g85Var, omicronConfig);
        this.g = g85Var;
        this.f = ((DefaultExecutorFactory) g85Var.e).newSingleThreadExecutor();
    }

    @Override // defpackage.atb
    public final Data a() {
        Data data;
        DataId dataId = this.d;
        Future futureSubmit = this.f.submit(new mz0(3, this));
        OmicronConfig omicronConfig = this.c;
        float f = omicronConfig.i;
        AnalyticsHandler analyticsHandler = omicronConfig.f;
        long j = (long) (f * 1000.0f);
        Data data2 = null;
        try {
            data = (Data) futureSubmit.get(j, TimeUnit.MILLISECONDS);
            try {
                analyticsHandler.onWaitForActualOnTime(dataId);
            } catch (InterruptedException | ExecutionException unused) {
                data2 = data;
                data = data2;
            } catch (TimeoutException unused2) {
                data2 = data;
                analyticsHandler.onWaitForActualTimeout(dataId);
                data = data2;
            }
        } catch (InterruptedException | ExecutionException unused3) {
        } catch (TimeoutException unused4) {
        }
        if (data != null) {
            return data;
        }
        Data data3 = ((SerializationDataStorage) this.g.a).getData(dataId);
        if (data3 != null) {
            b();
            return data3;
        }
        Data dataBuild = Data.newBuilder().build();
        omicronConfig.f.onCacheMiss(dataId);
        return dataBuild;
    }
}
