package ru.ok.messages.utils;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/messages/utils/ContextDirCreationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "dir", "", "<init>", "(Ljava/lang/String;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContextDirCreationException extends RuntimeException {
    public ContextDirCreationException(String str) {
        super("could not create dir ".concat(str));
    }
}
