package ru.ok.android.externcalls.sdk.stat.mldownload;

import defpackage.af7;
import defpackage.fi1;
import defpackage.gi1;
import defpackage.sbi;
import defpackage.u14;
import defpackage.z92;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;", "Lru/ok/android/externcalls/sdk/stat/internal/SingleShotStat;", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Laf7;)V", "", "modelId", "", "downloadDurationMs", "Lsbi;", "readyToUse", "(Ljava/lang/String;J)V", "error", "(Ljava/lang/String;Ljava/lang/String;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MLDownloadStat extends SingleShotStat {
    public MLDownloadStat(af7 af7Var) {
        super(af7Var);
    }

    public static final sbi error$lambda$0(String str, String str2, fi1 fi1Var) {
        EventItemValue eventItemValue = str != null ? EventItemValueKt.toEventItemValue(str) : null;
        EventItemsMap eventItemsMap = new EventItemsMap();
        eventItemsMap.set("source", str2);
        ((gi1) fi1Var).d("ml_error", eventItemValue, eventItemsMap);
        return sbi.a;
    }

    public static final sbi readyToUse$lambda$0(long j, String str, fi1 fi1Var) {
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(j);
        EventItemsMap eventItemsMap = new EventItemsMap();
        eventItemsMap.set("source", str);
        ((gi1) fi1Var).d("ml_ready_to_use", eventItemValue, eventItemsMap);
        return sbi.a;
    }

    public final void error(String modelId, String error) {
        reportOnce(new z92(error, modelId, 6));
    }

    public final void readyToUse(String modelId, long downloadDurationMs) {
        reportOnce(new u14(downloadDurationMs, modelId, 2));
    }
}
