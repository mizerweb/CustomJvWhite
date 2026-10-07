package ru.ok.tamtam.api;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/tamtam/api/CorruptedInputDataException;", "Ljava/io/IOException;", "tamtam-java-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CorruptedInputDataException extends IOException {
    public CorruptedInputDataException() {
        super("Corrupted input data");
    }
}
