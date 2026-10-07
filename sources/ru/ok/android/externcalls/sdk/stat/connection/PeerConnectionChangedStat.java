package ru.ok.android.externcalls.sdk.stat.connection;

import defpackage.af7;
import defpackage.fi1;
import defpackage.j42;
import defpackage.zvh;
import java.util.Locale;
import kotlin.Metadata;
import org.apache.http.protocol.HTTP;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/connection/PeerConnectionChangedStat;", "", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Laf7;)V", "Lzvh;", HTTP.IDENTITY_CODING, "", "getTopologyTypeForCallStat", "(Lzvh;)Ljava/lang/String;", "Lorg/webrtc/PeerConnection$PeerConnectionState;", "state", "Lj42;", "topology", "Lsbi;", "onStateChanged", "(Lorg/webrtc/PeerConnection$PeerConnectionState;Lj42;)V", "Laf7;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PeerConnectionChangedStat {
    private final af7 getEventualStatSender;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[zvh.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PeerConnectionChangedStat(af7 af7Var) {
        this.getEventualStatSender = af7Var;
    }

    private final String getTopologyTypeForCallStat(zvh identity) {
        return WhenMappings.$EnumSwitchMapping$0[identity.ordinal()] != 1 ? "D" : "S";
    }

    public final void onStateChanged(PeerConnection.PeerConnectionState state, j42 topology) {
        fi1 fi1Var = (fi1) this.getEventualStatSender.invoke();
        if (fi1Var != null) {
            EventItemsMap eventItemsMap = new EventItemsMap();
            eventItemsMap.set("connection_state", EventItemValueKt.toEventItemValue(state.name().toLowerCase(Locale.ROOT)));
            eventItemsMap.set("p2p_relay", String.valueOf(topology.K()));
            eventItemsMap.set("call_topology", getTopologyTypeForCallStat(topology.w()));
            fi1.a(fi1Var, "connection_state_changed", null, eventItemsMap, 2);
        }
    }
}
