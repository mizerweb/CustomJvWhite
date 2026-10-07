package ru.ok.android.externcalls.sdk.stat.p2prelay;

import defpackage.af7;
import defpackage.fi1;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/p2prelay/P2PRelayRequestedStat;", "", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Laf7;)V", "Lru/ok/android/externcalls/sdk/stat/p2prelay/P2PRelayRequestReason;", "reason", "Lsbi;", "onP2PRelayRequested", "(Lru/ok/android/externcalls/sdk/stat/p2prelay/P2PRelayRequestReason;)V", "Laf7;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class P2PRelayRequestedStat {
    private final af7 getEventualStatSender;

    public P2PRelayRequestedStat(af7 af7Var) {
        this.getEventualStatSender = af7Var;
    }

    public final void onP2PRelayRequested(P2PRelayRequestReason reason) {
        fi1 fi1Var = (fi1) this.getEventualStatSender.invoke();
        if (fi1Var != null) {
            fi1.a(fi1Var, "client_requested_p2p_relay", EventItemValueKt.toEventItemValue(reason.asStatString()), null, 4);
        }
    }
}
