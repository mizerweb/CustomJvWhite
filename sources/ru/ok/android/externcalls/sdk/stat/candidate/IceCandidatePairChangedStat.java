package ru.ok.android.externcalls.sdk.stat.candidate;

import defpackage.af7;
import defpackage.fi1;
import defpackage.gi1;
import defpackage.j95;
import defpackage.r38;
import defpackage.uza;
import kotlin.Metadata;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.IceCandidate;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/candidate/IceCandidatePairChangedStat;", "", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Laf7;)V", "Lorg/webrtc/CandidatePairChangeEvent;", "event", "Lsbi;", "onSelectedCandidatePairChanged", "(Lorg/webrtc/CandidatePairChangeEvent;)V", "Laf7;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IceCandidatePairChangedStat {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_LAST_DATA_RECEIVED_MS = "lastDataReceivedMs";

    @Deprecated
    public static final String KEY_REASON = "reason";
    private final af7 getEventualStatSender;

    public IceCandidatePairChangedStat(af7 af7Var) {
        this.getEventualStatSender = af7Var;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x005d  */
    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent event) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_LAST_DATA_RECEIVED_MS, event.lastDataReceivedMs);
        jSONObject.put("reason", event.reason);
        jSONObject.put("local", new JSONObject().put("sdp", event.local.sdp));
        jSONObject.put("remote", new JSONObject().put("sdp", event.remote.sdp));
        fi1 fi1Var = (fi1) this.getEventualStatSender.invoke();
        if (fi1Var != null) {
            EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(jSONObject.toString());
            EventItemsMap eventItemsMap = new EventItemsMap();
            IceCandidate iceCandidate = event.local;
            boolean z = uza.a;
            String str2 = iceCandidate.sdp;
            String str3 = null;
            if (str2 == null) {
                str = null;
            } else {
                String[] strArrSplit = str2.split(" ");
                if (strArrSplit.length < 6) {
                    str = null;
                } else {
                    str = strArrSplit[4];
                    if (!r38.a(str)) {
                        str = null;
                    }
                }
            }
            eventItemsMap.set("local_address", str);
            String str4 = event.remote.sdp;
            if (str4 != null) {
                String[] strArrSplit2 = str4.split(" ");
                if (strArrSplit2.length >= 6) {
                    String str5 = strArrSplit2[4];
                    if (r38.a(str5)) {
                        str3 = str5;
                    }
                }
            }
            if (str3 == null) {
                str3 = "";
            }
            eventItemsMap.set("remote_address", str3);
            ((gi1) fi1Var).d("ice_candidates_changed", eventItemValue, eventItemsMap);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/candidate/IceCandidatePairChangedStat$Companion;", "", "<init>", "()V", "KEY_LAST_DATA_RECEIVED_MS", "", "KEY_REASON", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
