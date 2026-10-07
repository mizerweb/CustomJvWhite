package ru.ok.android.externcalls.sdk.events.end;

import defpackage.cqk;
import defpackage.la6;
import defpackage.ma6;
import defpackage.nbh;
import defpackage.x05;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.exception.CallTerminatingException;
import ru.ok.android.externcalls.sdk.exception.Domain;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u001b2\u00020\u0001:\u0014\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0013\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.¨\u0006/À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "", "key", "", "getKey", "()Ljava/lang/String;", "description", "getDescription", "Hangup", "EndedForAll", "KilledWithoutDelete", "Canceled", "Rejected", "Missed", "Busy", "RemovedFromCall", "Banned", "AcceptedOnAnotherDevice", "ConversationAlreadyEnded", "InitiallyClosed", "CallTimeout", "SocketClosed", "Error", "ObsoleteClient", "SignalingTimeout", "PeerConnectionTimeout", "Unknown", "Companion", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$AcceptedOnAnotherDevice;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Banned;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Busy;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$CallTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Canceled;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$ConversationAlreadyEnded;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$EndedForAll;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Error;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Hangup;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$InitiallyClosed;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$KilledWithoutDelete;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Missed;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$ObsoleteClient;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$PeerConnectionTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Rejected;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$RemovedFromCall;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$SignalingTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$SocketClosed;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Unknown;", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ConversationEndReason {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String KEY_ANOTHER_DEVICE = "another_device";
    public static final String KEY_BANNED = "banned";
    public static final String KEY_BUSY = "busy";
    public static final String KEY_CALL_TIMEOUT = "call_timeout";
    public static final String KEY_CANCELLED = "canceled";
    public static final String KEY_ERROR = "error";
    public static final String KEY_FAILED = "failed";
    public static final String KEY_HANGUP = "hangup";
    public static final String KEY_INITIALLY_CLOSED = "initially_closed";
    public static final String KEY_KILLED = "killed";
    public static final String KEY_KILLED_WITHOUT_DELETE = "killed_without_delete";
    public static final String KEY_MISSED = "missed";
    public static final String KEY_OBSOLETE_CLIENT = "obsolete_client";
    public static final String KEY_REJECTED = "rejected";
    public static final String KEY_REMOVED = "removed";
    public static final String KEY_SOCKET_CLOSED = "socket_closed";
    public static final String KEY_TIMEOUT = "timeout";

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$AcceptedOnAnotherDevice;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AcceptedOnAnotherDevice implements ConversationEndReason {
        public static final AcceptedOnAnotherDevice INSTANCE = new AcceptedOnAnotherDevice();
        private static final String key = "another_device";

        private AcceptedOnAnotherDevice() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AcceptedOnAnotherDevice);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 941556652;
        }

        public String toString() {
            return "AcceptedOnAnotherDevice";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Banned;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Banned implements ConversationEndReason {
        public static final Banned INSTANCE = new Banned();
        private static final String key = "banned";

        private Banned() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Banned);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -2039493819;
        }

        public String toString() {
            return "Banned";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Busy;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Busy implements ConversationEndReason {
        public static final Busy INSTANCE = new Busy();
        private static final String key = "busy";

        private Busy() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Busy);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -1199866912;
        }

        public String toString() {
            return "Busy";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$CallTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CallTimeout implements ConversationEndReason {
        public static final CallTimeout INSTANCE = new CallTimeout();
        private static final String key = "call_timeout";

        private CallTimeout() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CallTimeout);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 746379612;
        }

        public String toString() {
            return "CallTimeout";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Canceled;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "source", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Canceled$Source;", "description", "", "<init>", "(Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Canceled$Source;Ljava/lang/String;)V", "getSource", "()Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Canceled$Source;", "getDescription", "()Ljava/lang/String;", "key", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Source", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Canceled implements ConversationEndReason {
        private final String description;
        private final String key = "canceled";
        private final Source source;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Canceled$Source;", "", "<init>", "(Ljava/lang/String;I)V", "PARTICIPANT", "RINGING_TIMEOUT", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public enum Source {
            PARTICIPANT,
            RINGING_TIMEOUT;

            private static final /* synthetic */ la6 $ENTRIES = new ma6(values());

            public static la6 getEntries() {
                return $ENTRIES;
            }
        }

        public Canceled(Source source, String str) {
            this.source = source;
            this.description = str;
        }

        public static /* synthetic */ Canceled copy$default(Canceled canceled, Source source, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                source = canceled.source;
            }
            if ((i & 2) != 0) {
                str = canceled.description;
            }
            return canceled.copy(source, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Source getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final Canceled copy(Source source, String description) {
            return new Canceled(source, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Canceled)) {
                return false;
            }
            Canceled canceled = (Canceled) other;
            return this.source == canceled.source && cqk.d(this.description, canceled.description);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getDescription() {
            return this.description;
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return this.key;
        }

        public final Source getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = this.source.hashCode() * 31;
            String str = this.description;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Canceled(source=" + this.source + ", description=" + this.description + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Companion;", "", "<init>", "()V", "KEY_HANGUP", "", "KEY_KILLED", "KEY_KILLED_WITHOUT_DELETE", "KEY_CANCELLED", "KEY_REJECTED", "KEY_MISSED", "KEY_BUSY", "KEY_REMOVED", "KEY_BANNED", "KEY_ANOTHER_DEVICE", "KEY_INITIALLY_CLOSED", "KEY_CALL_TIMEOUT", "KEY_SOCKET_CLOSED", "KEY_ERROR", "KEY_OBSOLETE_CLIENT", "KEY_TIMEOUT", "KEY_FAILED", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String KEY_ANOTHER_DEVICE = "another_device";
        public static final String KEY_BANNED = "banned";
        public static final String KEY_BUSY = "busy";
        public static final String KEY_CALL_TIMEOUT = "call_timeout";
        public static final String KEY_CANCELLED = "canceled";
        public static final String KEY_ERROR = "error";
        public static final String KEY_FAILED = "failed";
        public static final String KEY_HANGUP = "hangup";
        public static final String KEY_INITIALLY_CLOSED = "initially_closed";
        public static final String KEY_KILLED = "killed";
        public static final String KEY_KILLED_WITHOUT_DELETE = "killed_without_delete";
        public static final String KEY_MISSED = "missed";
        public static final String KEY_OBSOLETE_CLIENT = "obsolete_client";
        public static final String KEY_REJECTED = "rejected";
        public static final String KEY_REMOVED = "removed";
        public static final String KEY_SOCKET_CLOSED = "socket_closed";
        public static final String KEY_TIMEOUT = "timeout";

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$ConversationAlreadyEnded;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConversationAlreadyEnded implements ConversationEndReason {
        public static final ConversationAlreadyEnded INSTANCE = new ConversationAlreadyEnded();
        private static final String key = "canceled";

        private ConversationAlreadyEnded() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ConversationAlreadyEnded);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -513124916;
        }

        public String toString() {
            return "ConversationAlreadyEnded";
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static String getDescription(ConversationEndReason conversationEndReason) {
            return ConversationEndReason.super.getDescription();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$EndedForAll;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EndedForAll implements ConversationEndReason {
        public static final EndedForAll INSTANCE = new EndedForAll();
        private static final String key = "killed";

        private EndedForAll() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EndedForAll);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 1468058539;
        }

        public String toString() {
            return "EndedForAll";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Error;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "key", "", "getKey", "()Ljava/lang/String;", "description", "getDescription$annotations", "()V", "getDescription", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements ConversationEndReason {
        private final String key = "error";
        private final Throwable throwable;

        public Error(Throwable th) {
            this.throwable = th;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        public static /* synthetic */ void getDescription$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && cqk.d(this.throwable, ((Error) other).throwable);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getDescription() {
            Throwable th = this.throwable;
            return th instanceof CallTerminatingException ? ((CallTerminatingException) th).asString() : new CallTerminatingException.Builder(Domain.UNKNOWN, th).build().asString();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return this.key;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return x05.h("Error(throwable=", ")", this.throwable);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Hangup;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Hangup implements ConversationEndReason {
        public static final Hangup INSTANCE = new Hangup();
        private static final String key = "hangup";

        private Hangup() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Hangup);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -1867725132;
        }

        public String toString() {
            return "Hangup";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$InitiallyClosed;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitiallyClosed implements ConversationEndReason {
        public static final InitiallyClosed INSTANCE = new InitiallyClosed();
        private static final String key = "initially_closed";

        private InitiallyClosed() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof InitiallyClosed);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 498008150;
        }

        public String toString() {
            return "InitiallyClosed";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$KilledWithoutDelete;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KilledWithoutDelete implements ConversationEndReason {
        public static final KilledWithoutDelete INSTANCE = new KilledWithoutDelete();
        private static final String key = "killed_without_delete";

        private KilledWithoutDelete() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof KilledWithoutDelete);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -2109906353;
        }

        public String toString() {
            return "KilledWithoutDelete";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Missed;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Missed implements ConversationEndReason {
        public static final Missed INSTANCE = new Missed();
        private static final String key = "missed";

        private Missed() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Missed);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -1717031230;
        }

        public String toString() {
            return "Missed";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$ObsoleteClient;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "explanationHtml", "", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getExplanationHtml", "()Ljava/lang/String;", "getCode", "key", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ObsoleteClient implements ConversationEndReason {
        private final String code;
        private final String explanationHtml;
        private final String key = "obsolete_client";

        public ObsoleteClient(String str, String str2) {
            this.explanationHtml = str;
            this.code = str2;
        }

        public static /* synthetic */ ObsoleteClient copy$default(ObsoleteClient obsoleteClient, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = obsoleteClient.explanationHtml;
            }
            if ((i & 2) != 0) {
                str2 = obsoleteClient.code;
            }
            return obsoleteClient.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getExplanationHtml() {
            return this.explanationHtml;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final ObsoleteClient copy(String explanationHtml, String code) {
            return new ObsoleteClient(explanationHtml, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ObsoleteClient)) {
                return false;
            }
            ObsoleteClient obsoleteClient = (ObsoleteClient) other;
            return cqk.d(this.explanationHtml, obsoleteClient.explanationHtml) && cqk.d(this.code, obsoleteClient.code);
        }

        public final String getCode() {
            return this.code;
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        public final String getExplanationHtml() {
            return this.explanationHtml;
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return this.key;
        }

        public int hashCode() {
            String str = this.explanationHtml;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.code;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return nbh.w("ObsoleteClient(explanationHtml=", this.explanationHtml, ", code=", this.code, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$PeerConnectionTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PeerConnectionTimeout implements ConversationEndReason {
        public static final PeerConnectionTimeout INSTANCE = new PeerConnectionTimeout();
        private static final String key = "timeout";

        private PeerConnectionTimeout() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PeerConnectionTimeout);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -303820710;
        }

        public String toString() {
            return "PeerConnectionTimeout";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Rejected;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Rejected implements ConversationEndReason {
        public static final Rejected INSTANCE = new Rejected();
        private static final String key = "rejected";

        private Rejected() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Rejected);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -201133339;
        }

        public String toString() {
            return "Rejected";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$RemovedFromCall;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemovedFromCall implements ConversationEndReason {
        public static final RemovedFromCall INSTANCE = new RemovedFromCall();
        private static final String key = "removed";

        private RemovedFromCall() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof RemovedFromCall);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 354659681;
        }

        public String toString() {
            return "RemovedFromCall";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$SignalingTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SignalingTimeout implements ConversationEndReason {
        public static final SignalingTimeout INSTANCE = new SignalingTimeout();
        private static final String key = "timeout";

        private SignalingTimeout() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SignalingTimeout);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -269234386;
        }

        public String toString() {
            return "SignalingTimeout";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$SocketClosed;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SocketClosed implements ConversationEndReason {
        public static final SocketClosed INSTANCE = new SocketClosed();
        private static final String key = "socket_closed";

        private SocketClosed() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SocketClosed);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -1133470298;
        }

        public String toString() {
            return "SocketClosed";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Unknown;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown implements ConversationEndReason {
        public static final Unknown INSTANCE = new Unknown();
        private static final String key = "failed";

        private Unknown() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public /* bridge */ String getDescription() {
            return super.getDescription();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 1252320515;
        }

        public String toString() {
            return "Unknown";
        }
    }

    default String getDescription() {
        return null;
    }

    String getKey();
}
