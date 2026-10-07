package ru.ok.android.externcalls.sdk.capabilities;

import defpackage.c76;
import defpackage.j95;
import defpackage.la6;
import defpackage.lof;
import defpackage.ma6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u0017\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/capabilities/ClientCapabilities;", "", "caps", "", "Lru/ok/android/externcalls/sdk/capabilities/ClientCapabilities$Capability;", "<init>", "(Ljava/util/Set;)V", "", "([Lru/ok/android/externcalls/sdk/capabilities/ClientCapabilities$Capability;)V", "getValue", "", "getHexValueString", "", "plus", "bit", "minus", "set", "cap", "", "has", "Capability", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ClientCapabilities {
    private static final int BIT_ADD_PARTICIPANT = 15;
    private static final int BIT_ADMIN_MUTE_NOTIFY = 5;
    private static final int BIT_AUDIENCE_MODE = 11;
    private static final int BIT_CALL_TO_CONTACTS = 10;
    private static final int BIT_FILTER_DEFAULTS = 3;
    private static final int BIT_HOLD = 18;
    private static final int BIT_SCREEN_TRACK_CONSUMER = 4;
    private static final int BIT_SCREEN_TRACK_PRODUCER = 0;
    private static final int BIT_SESSION_ROOMS = 8;
    private static final int BIT_SESSION_STATE_UPDATES = 14;
    private static final int BIT_USE_P2P_RELAY = 16;
    private static final int BIT_VIDEO_TRACKS = 1;
    private static final int BIT_VMOJI = 9;
    private static final int BIT_WAITING_HALL = 2;
    private static final int BIT_WAIT_FOR_ADMIN = 17;
    private static final int BIT_WATCH_MOVIE = 6;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Set<Capability> caps;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/capabilities/ClientCapabilities$Capability;", "", "bit", "", "<init>", "(Ljava/lang/String;II)V", "getBit$calls_sdk", "()I", "SCREEN_TRACK_PRODUCER", "VIDEO_TRACKS", "WAITING_HALL", "FILTER_DEFAULTS", "SCREEN_TRACK_CONSUMER", "ADMIN_MUTE_NOTIFY", "WATCH_MOVIE", "SESSION_ROOMS", "VMOJI", "CALL_TO_CONTACTS", "SESSION_STATE_UPDATES", "AUDIENCE_MODE", "ADD_PARTICIPANT", "USE_P2P_RELAY", "WAIT_FOR_ADMIN", "HOLD", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum Capability {
        SCREEN_TRACK_PRODUCER(0),
        VIDEO_TRACKS(1),
        WAITING_HALL(2),
        FILTER_DEFAULTS(3),
        SCREEN_TRACK_CONSUMER(4),
        ADMIN_MUTE_NOTIFY(5),
        WATCH_MOVIE(6),
        SESSION_ROOMS(8),
        VMOJI(9),
        CALL_TO_CONTACTS(10),
        SESSION_STATE_UPDATES(14),
        AUDIENCE_MODE(11),
        ADD_PARTICIPANT(15),
        USE_P2P_RELAY(16),
        WAIT_FOR_ADMIN(17),
        HOLD(18);

        private static final /* synthetic */ la6 $ENTRIES = new ma6(values());
        private final int bit;

        Capability(int i) {
            this.bit = i;
        }

        public static la6 getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getBit$calls_sdk, reason: from getter */
        public final int getBit() {
            return this.bit;
        }
    }

    public ClientCapabilities(Capability... capabilityArr) {
        this((Set<? extends Capability>) a.p1(Arrays.copyOf(capabilityArr, capabilityArr.length)));
    }

    public static final ClientCapabilities empty() {
        return INSTANCE.empty();
    }

    public static final ClientCapabilities from(int i) {
        return INSTANCE.from(i);
    }

    public static final ClientCapabilities getDefault() {
        return INSTANCE.getDefault();
    }

    public final String getHexValueString() {
        return Integer.toHexString(getValue());
    }

    public final int getValue() {
        Iterator<Capability> it = this.caps.iterator();
        int bit = 0;
        while (it.hasNext()) {
            bit |= 1 << it.next().getBit();
        }
        return bit;
    }

    public final boolean has(Capability cap) {
        return this.caps.contains(cap);
    }

    public final ClientCapabilities minus(Capability bit) {
        return set(bit, false);
    }

    public final ClientCapabilities plus(Capability bit) {
        return set(bit, true);
    }

    public final ClientCapabilities set(Capability cap, boolean set) {
        if (!set || this.caps.contains(cap)) {
            return (set || !this.caps.contains(cap)) ? this : new ClientCapabilities(lof.X(this.caps, cap));
        }
        return new ClientCapabilities(lof.a0(this.caps, cap));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\u0016H\u0007J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/capabilities/ClientCapabilities$Companion;", "", "<init>", "()V", "BIT_SCREEN_TRACK_PRODUCER", "", "BIT_VIDEO_TRACKS", "BIT_WAITING_HALL", "BIT_FILTER_DEFAULTS", "BIT_SCREEN_TRACK_CONSUMER", "BIT_ADMIN_MUTE_NOTIFY", "BIT_WATCH_MOVIE", "BIT_SESSION_ROOMS", "BIT_VMOJI", "BIT_CALL_TO_CONTACTS", "BIT_AUDIENCE_MODE", "BIT_SESSION_STATE_UPDATES", "BIT_ADD_PARTICIPANT", "BIT_USE_P2P_RELAY", "BIT_WAIT_FOR_ADMIN", "BIT_HOLD", "default", "Lru/ok/android/externcalls/sdk/capabilities/ClientCapabilities;", "getDefault", "empty", "from", SdkMetricStatEvent.VALUE_KEY, "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        public final ClientCapabilities empty() {
            return new ClientCapabilities(c76.a, null);
        }

        public final ClientCapabilities from(int value) {
            HashSet hashSet = new HashSet();
            for (Capability capability : Capability.getEntries()) {
                if (((1 << capability.getBit()) & value) != 0) {
                    hashSet.add(capability);
                }
            }
            return new ClientCapabilities(hashSet, null);
        }

        public final ClientCapabilities getDefault() {
            return new ClientCapabilities(a.p1(new Capability[]{Capability.SCREEN_TRACK_PRODUCER, Capability.VIDEO_TRACKS, Capability.WAITING_HALL, Capability.FILTER_DEFAULTS, Capability.SCREEN_TRACK_CONSUMER, Capability.ADMIN_MUTE_NOTIFY, Capability.WATCH_MOVIE, Capability.SESSION_ROOMS, Capability.VMOJI, Capability.CALL_TO_CONTACTS, Capability.ADD_PARTICIPANT, Capability.USE_P2P_RELAY}), null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ClientCapabilities(Set<? extends Capability> set) {
        this.caps = set;
    }

    public /* synthetic */ ClientCapabilities(Set set, j95 j95Var) {
        this((Set<? extends Capability>) set);
    }
}
