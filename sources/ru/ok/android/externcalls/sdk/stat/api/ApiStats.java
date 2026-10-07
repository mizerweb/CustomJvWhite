package ru.ok.android.externcalls.sdk.stat.api;

import defpackage.af7;
import defpackage.fi1;
import defpackage.gi1;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Laf7;)V", "", "methodName", "", "executionTime", "Lsbi;", "reportExecutionTime", "(Ljava/lang/String;J)V", "Laf7;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ApiStats {
    private final af7 getEventualStatSender;

    public ApiStats(af7 af7Var) {
        this.getEventualStatSender = af7Var;
    }

    public final void reportExecutionTime(String methodName, long executionTime) {
        fi1 fi1Var = (fi1) this.getEventualStatSender.invoke();
        if (fi1Var != null) {
            ((gi1) fi1Var).d("api_call", EventItemValueKt.toEventItemValue(executionTime), new EventItemsMap((Map<String, ? extends EventItemValue>) Collections.singletonMap("api_method", EventItemValueKt.toEventItemValue(methodName))));
        }
    }
}
