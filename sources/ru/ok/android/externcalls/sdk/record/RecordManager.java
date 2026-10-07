package ru.ok.android.externcalls.sdk.record;

import defpackage.af7;
import defpackage.c;
import defpackage.cf7;
import defpackage.dnf;
import defpackage.j95;
import defpackage.la6;
import defpackage.ma6;
import defpackage.zo5;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001:\u0007\u001c\u001d\u001e\u001f !\"JA\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJA\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001a¨\u0006#À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager;", "", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "params", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "stopRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/record/RecordDescription;", "getRecordDescription", "()Lru/ok/android/externcalls/sdk/record/RecordDescription;", "", "Ldnf;", "Lru/ok/android/externcalls/sdk/record/RecordDescriptionHistory;", "getRecordDescriptionHistory", "()Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "listener", "addRecordListener", "(Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "removeRecordListener", "StartRecordInfo", "StartParams", "StopRecordInfo", "StopParams", "RecordError", "RecordStartError", "RecordStopError", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface RecordManager {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$RecordError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "messagePrefix", "", "errorJson", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorJson", "()Ljava/lang/String;", "getErrorMessage", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static class RecordError extends RuntimeException {
        private final String errorJson;
        private final String errorMessage;

        public RecordError(String str, String str2, String str3) {
            super(zo5.p(str, " ", str3));
            this.errorJson = str2;
            this.errorMessage = str3;
        }

        public final String getErrorJson() {
            return this.errorJson;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$RecordStartError;", "Lru/ok/android/externcalls/sdk/record/RecordManager$RecordError;", "errorJson", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RecordStartError extends RecordError {
        public RecordStartError(String str, String str2) {
            super("Can't start record", str, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$RecordStopError;", "Lru/ok/android/externcalls/sdk/record/RecordManager$RecordError;", "errorJson", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RecordStopError extends RecordError {
        public RecordStopError(String str, String str2) {
            super("Can't stop record", str, str2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartRecordInfo;", "", "<init>", "()V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StartRecordInfo {
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo;", "", "removeResult", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo$RemoveResult;", "<init>", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo$RemoveResult;)V", "getRemoveResult", "()Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo$RemoveResult;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RemoveResult", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StopRecordInfo {
        private final RemoveResult removeResult;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo$RemoveResult;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_REQUESTED", "REMOVED", "NOT_SUPPORTED", "NOT_REMOVED", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public enum RemoveResult {
            NOT_REQUESTED,
            REMOVED,
            NOT_SUPPORTED,
            NOT_REMOVED;

            private static final /* synthetic */ la6 $ENTRIES = new ma6(values());

            public static la6 getEntries() {
                return $ENTRIES;
            }
        }

        public StopRecordInfo(RemoveResult removeResult) {
            this.removeResult = removeResult;
        }

        public static /* synthetic */ StopRecordInfo copy$default(StopRecordInfo stopRecordInfo, RemoveResult removeResult, int i, Object obj) {
            if ((i & 1) != 0) {
                removeResult = stopRecordInfo.removeResult;
            }
            return stopRecordInfo.copy(removeResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RemoveResult getRemoveResult() {
            return this.removeResult;
        }

        public final StopRecordInfo copy(RemoveResult removeResult) {
            return new StopRecordInfo(removeResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StopRecordInfo) && this.removeResult == ((StopRecordInfo) other).removeResult;
        }

        public final RemoveResult getRemoveResult() {
            return this.removeResult;
        }

        public int hashCode() {
            return this.removeResult.hashCode();
        }

        public String toString() {
            return "StopRecordInfo(removeResult=" + this.removeResult + ")";
        }
    }

    static /* synthetic */ void startRecord$default(RecordManager recordManager, StartParams startParams, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: startRecord");
            return;
        }
        if ((i & 2) != 0) {
            af7Var = null;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        recordManager.startRecord(startParams, af7Var, cf7Var);
    }

    static /* synthetic */ void stopRecord$default(RecordManager recordManager, StopParams stopParams, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: stopRecord");
            return;
        }
        if ((i & 2) != 0) {
            af7Var = null;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        recordManager.stopRecord(stopParams, af7Var, cf7Var);
    }

    void addRecordListener(RecordEventListener listener);

    RecordDescription getRecordDescription();

    Map<dnf, RecordDescriptionHistory> getRecordDescriptionHistory();

    void removeRecordListener(RecordEventListener listener);

    void startRecord(StartParams params, af7 onSuccess, cf7 onError);

    void stopRecord(StopParams params, af7 onSuccess, cf7 onError);

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0001,B\u0081\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b&\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b'\u0010\u001eR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b+\u0010*¨\u0006-"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "", "", "isStream", "", "movieId", "", "albumId", "Ldnf;", "sessionRoomId", "", SdkMetricStatEvent.NAME_KEY, "description", "groupId", "privacy", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartRecordInfo;", "Lsbi;", "onSuccess", "", "onError", "<init>", "(ZLjava/lang/Long;Ljava/lang/String;Ldnf;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Long;Ljava/lang/String;Lcf7;Lcf7;)V", "Z", "()Z", "Ljava/lang/Long;", "getMovieId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getAlbumId", "()Ljava/lang/String;", "Ldnf;", "getSessionRoomId", "()Ldnf;", "Ljava/lang/CharSequence;", "getName", "()Ljava/lang/CharSequence;", "getDescription", "getGroupId", "getPrivacy", "Lcf7;", "getOnSuccess", "()Lcf7;", "getOnError", "Builder", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StartParams {
        private final String albumId;
        private final CharSequence description;
        private final Long groupId;
        private final boolean isStream;
        private final Long movieId;
        private final CharSequence name;
        private final cf7 onError;
        private final cf7 onSuccess;
        private final String privacy;
        private final dnf sessionRoomId;

        /* JADX INFO: loaded from: classes2.dex */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0007J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0004\b%\u0010\"J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010)R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010+R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R$\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010.R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010.R\u001c\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0018\u0010-\u0012\u0004\b/\u0010\u0003¨\u00060"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "<init>", "()V", "", "movieId", "withMovieId", "(Ljava/lang/Long;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "isStream", "(Z)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "Ldnf;", "sessionRoomId", "withSessionRoomId", "(Ldnf;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", SdkMetricStatEvent.NAME_KEY, "withName", "(Ljava/lang/CharSequence;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "description", "withDescription", "groupId", "withGroupId", "", "privacy", "withPrivacy", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "albumId", "withAlbumId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartRecordInfo;", "Lsbi;", "onSuccess", "withCallOnSuccess", "(Lcf7;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "onError", "withCallOnError", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "build", "()Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "Z", "Ljava/lang/Long;", "Ldnf;", "Ljava/lang/CharSequence;", "Ljava/lang/String;", "Lcf7;", "getPrivacy$annotations", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder {
            private String albumId;
            private Long groupId;
            private boolean isStream;
            private Long movieId;
            private CharSequence name;
            private cf7 onError;
            private cf7 onSuccess;
            private dnf sessionRoomId;
            private CharSequence description = "";
            private String privacy = "PUBLIC";

            private static /* synthetic */ void getPrivacy$annotations() {
            }

            public final StartParams build() {
                boolean z = this.isStream;
                Long l = this.movieId;
                dnf dnfVar = this.sessionRoomId;
                CharSequence charSequence = this.name;
                CharSequence charSequence2 = this.description;
                String str = this.privacy;
                return new StartParams(z, l, this.albumId, dnfVar, charSequence, charSequence2, this.groupId, str, this.onSuccess, this.onError, null);
            }

            public final Builder isStream(boolean isStream) {
                this.isStream = isStream;
                return this;
            }

            public final Builder withAlbumId(String albumId) {
                this.albumId = albumId;
                return this;
            }

            public final Builder withCallOnError(cf7 onError) {
                this.onError = onError;
                return this;
            }

            public final Builder withCallOnSuccess(cf7 onSuccess) {
                this.onSuccess = onSuccess;
                return this;
            }

            public final Builder withDescription(CharSequence description) {
                this.description = description;
                return this;
            }

            public final Builder withGroupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            public final Builder withMovieId(Long movieId) {
                this.movieId = movieId;
                return this;
            }

            public final Builder withName(CharSequence name) {
                this.name = name;
                return this;
            }

            public final Builder withPrivacy(String privacy) {
                this.privacy = privacy;
                return this;
            }

            public final Builder withSessionRoomId(dnf sessionRoomId) {
                this.sessionRoomId = sessionRoomId;
                return this;
            }
        }

        private StartParams(boolean z, Long l, String str, dnf dnfVar, CharSequence charSequence, CharSequence charSequence2, Long l2, String str2, cf7 cf7Var, cf7 cf7Var2) {
            this.isStream = z;
            this.movieId = l;
            this.albumId = str;
            this.sessionRoomId = dnfVar;
            this.name = charSequence;
            this.description = charSequence2;
            this.groupId = l2;
            this.privacy = str2;
            this.onSuccess = cf7Var;
            this.onError = cf7Var2;
        }

        public final String getAlbumId() {
            return this.albumId;
        }

        public final CharSequence getDescription() {
            return this.description;
        }

        public final Long getGroupId() {
            return this.groupId;
        }

        public final Long getMovieId() {
            return this.movieId;
        }

        public final CharSequence getName() {
            return this.name;
        }

        public final cf7 getOnError() {
            return this.onError;
        }

        public final cf7 getOnSuccess() {
            return this.onSuccess;
        }

        public final String getPrivacy() {
            return this.privacy;
        }

        public final dnf getSessionRoomId() {
            return this.sessionRoomId;
        }

        /* JADX INFO: renamed from: isStream, reason: from getter */
        public final boolean getIsStream() {
            return this.isStream;
        }

        public /* synthetic */ StartParams(boolean z, Long l, String str, dnf dnfVar, CharSequence charSequence, CharSequence charSequence2, Long l2, String str2, cf7 cf7Var, cf7 cf7Var2, j95 j95Var) {
            this(z, l, str, dnfVar, charSequence, charSequence2, l2, str2, cf7Var, cf7Var2);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "", "Ldnf;", "sessionRoomId", "", "removeRecord", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo;", "Lsbi;", "onSuccess", "", "onError", "<init>", "(Ldnf;ZLcf7;Lcf7;)V", "Ldnf;", "getSessionRoomId", "()Ldnf;", "Z", "getRemoveRecord", "()Z", "Lcf7;", "getOnSuccess", "()Lcf7;", "getOnError", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StopParams {
        private final cf7 onError;
        private final cf7 onSuccess;
        private final boolean removeRecord;
        private final dnf sessionRoomId;

        public /* synthetic */ StopParams(dnf dnfVar, boolean z, cf7 cf7Var, cf7 cf7Var2, int i, j95 j95Var) {
            this((i & 1) != 0 ? null : dnfVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : cf7Var, (i & 8) != 0 ? null : cf7Var2);
        }

        public final cf7 getOnError() {
            return this.onError;
        }

        public final cf7 getOnSuccess() {
            return this.onSuccess;
        }

        public final boolean getRemoveRecord() {
            return this.removeRecord;
        }

        public final dnf getSessionRoomId() {
            return this.sessionRoomId;
        }

        public StopParams(dnf dnfVar, boolean z, cf7 cf7Var, cf7 cf7Var2) {
            this.sessionRoomId = dnfVar;
            this.removeRecord = z;
            this.onSuccess = cf7Var;
            this.onError = cf7Var2;
        }

        public StopParams() {
            this(null, false, null, null, 15, null);
        }
    }
}
