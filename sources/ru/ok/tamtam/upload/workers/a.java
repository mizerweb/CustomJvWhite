package ru.ok.tamtam.upload.workers;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/tamtam/upload/workers/a;", "Lru/ok/tamtam/exception/IssueKeyException;", "<init>", "()V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class a extends IssueKeyException {
    public a() {
        super("ONEME-30203", "Upload disabled by pms", null);
    }
}
