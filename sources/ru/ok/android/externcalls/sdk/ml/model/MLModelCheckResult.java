package ru.ok.android.externcalls.sdk.ml.model;

import defpackage.c0a;
import defpackage.cqk;
import defpackage.zo5;
import java.io.File;
import kotlin.Metadata;
import org.webrtc.PeerConnectionFactory;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult;", "", PeerConnectionFactory.TRIAL_ENABLED, "Disabled", "Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult$Disabled;", "Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult$Enabled;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface MLModelCheckResult {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult$Disabled;", "Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Disabled implements MLModelCheckResult {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Disabled);
        }

        public int hashCode() {
            return -1300392114;
        }

        public String toString() {
            return "Disabled";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult$Enabled;", "Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "ExistentModel", "UpdatedModel", "Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult$Enabled$ExistentModel;", "Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult$Enabled$UpdatedModel;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Enabled extends MLModelCheckResult {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult$Enabled$ExistentModel;", "Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult$Enabled;", "file", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ExistentModel implements Enabled {
            private final File file;

            public ExistentModel(File file) {
                this.file = file;
            }

            public static /* synthetic */ ExistentModel copy$default(ExistentModel existentModel, File file, int i, Object obj) {
                if ((i & 1) != 0) {
                    file = existentModel.file;
                }
                return existentModel.copy(file);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final File getFile() {
                return this.file;
            }

            public final ExistentModel copy(File file) {
                return new ExistentModel(file);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ExistentModel) && cqk.d(this.file, ((ExistentModel) other).file);
            }

            @Override // ru.ok.android.externcalls.sdk.ml.model.MLModelCheckResult.Enabled
            public File getFile() {
                return this.file;
            }

            public int hashCode() {
                return this.file.hashCode();
            }

            public String toString() {
                return "ExistentModel(file=" + this.file + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult$Enabled$UpdatedModel;", "Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult$Enabled;", "file", "Ljava/io/File;", "version", "", "downloadDurationMs", "", "<init>", "(Ljava/io/File;Ljava/lang/String;J)V", "getFile", "()Ljava/io/File;", "getVersion", "()Ljava/lang/String;", "getDownloadDurationMs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UpdatedModel implements Enabled {
            private final long downloadDurationMs;
            private final File file;
            private final String version;

            public UpdatedModel(File file, String str, long j) {
                this.file = file;
                this.version = str;
                this.downloadDurationMs = j;
            }

            public static /* synthetic */ UpdatedModel copy$default(UpdatedModel updatedModel, File file, String str, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    file = updatedModel.file;
                }
                if ((i & 2) != 0) {
                    str = updatedModel.version;
                }
                if ((i & 4) != 0) {
                    j = updatedModel.downloadDurationMs;
                }
                return updatedModel.copy(file, str, j);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final File getFile() {
                return this.file;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getVersion() {
                return this.version;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final long getDownloadDurationMs() {
                return this.downloadDurationMs;
            }

            public final UpdatedModel copy(File file, String version, long downloadDurationMs) {
                return new UpdatedModel(file, version, downloadDurationMs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdatedModel)) {
                    return false;
                }
                UpdatedModel updatedModel = (UpdatedModel) other;
                return cqk.d(this.file, updatedModel.file) && cqk.d(this.version, updatedModel.version) && this.downloadDurationMs == updatedModel.downloadDurationMs;
            }

            public final long getDownloadDurationMs() {
                return this.downloadDurationMs;
            }

            @Override // ru.ok.android.externcalls.sdk.ml.model.MLModelCheckResult.Enabled
            public File getFile() {
                return this.file;
            }

            public final String getVersion() {
                return this.version;
            }

            public int hashCode() {
                return Long.hashCode(this.downloadDurationMs) + zo5.d(this.file.hashCode() * 31, 31, this.version);
            }

            public String toString() {
                File file = this.file;
                String str = this.version;
                long j = this.downloadDurationMs;
                StringBuilder sb = new StringBuilder("UpdatedModel(file=");
                sb.append(file);
                sb.append(", version=");
                sb.append(str);
                sb.append(", downloadDurationMs=");
                return c0a.m(j, ")", sb);
            }
        }

        File getFile();
    }
}
