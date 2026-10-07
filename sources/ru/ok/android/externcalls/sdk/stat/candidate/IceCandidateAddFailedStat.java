package ru.ok.android.externcalls.sdk.stat.candidate;

import defpackage.af7;
import defpackage.fi1;
import defpackage.gi1;
import defpackage.n38;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/candidate/IceCandidateAddFailedStat;", "", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Laf7;)V", "Ln38;", "event", "Lsbi;", "report", "(Ln38;)V", "Laf7;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IceCandidateAddFailedStat {
    private final af7 getEventualStatSender;

    public IceCandidateAddFailedStat(af7 af7Var) {
        this.getEventualStatSender = af7Var;
    }

    public final void report(n38 event) {
        fi1 fi1Var = (fi1) this.getEventualStatSender.invoke();
        if (fi1Var != null) {
            EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(event.b);
            EventItemsMap eventItemsMap = new EventItemsMap();
            eventItemsMap.set(SdkMetricStatEvent.STRING_VALUE_KEY, event.c);
            eventItemsMap.set("remote_url", event.a);
            ((gi1) fi1Var).d("ice_candidate_add_failed", eventItemValue, eventItemsMap);
        }
    }
}
