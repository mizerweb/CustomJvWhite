package ru.ok.android.externcalls.analytics.internal.storage;

import java.io.File;
import java.io.IOException;
import javax.inject.Provider;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/storage/CacheWriter;", "", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", DatabaseHelper.ITEM_COLUMN_NAME, "Lsbi;", "writeToCache", "(Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;)V", "", "length", "()J", "", "count", "()I", "Ljavax/inject/Provider;", "Ljava/io/File;", "outFileProvider", "grab", "(Ljavax/inject/Provider;)V", "drop", "()V", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface CacheWriter {
    int count();

    void drop() throws IOException;

    void grab(Provider<File> outFileProvider) throws IOException;

    long length();

    void writeToCache(CallAnalyticsEvent item);
}
