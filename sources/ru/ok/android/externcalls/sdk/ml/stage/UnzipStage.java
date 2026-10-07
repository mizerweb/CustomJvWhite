package ru.ok.android.externcalls.sdk.ml.stage;

import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/stage/UnzipStage;", "", "modelDir", "Ljava/io/File;", "downloadDurationMs", "", "<init>", "(Ljava/io/File;J)V", "getModelDir", "()Ljava/io/File;", "getDownloadDurationMs", "()J", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UnzipStage {
    private final long downloadDurationMs;
    private final File modelDir;

    public UnzipStage(File file, long j) {
        this.modelDir = file;
        this.downloadDurationMs = j;
    }

    public final long getDownloadDurationMs() {
        return this.downloadDurationMs;
    }

    public final File getModelDir() {
        return this.modelDir;
    }
}
