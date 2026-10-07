package ru.ok.android.externcalls.analytics.internal.storage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ok/android/externcalls/analytics/internal/storage/DbCacheWriter;", "Lru/ok/android/externcalls/analytics/internal/storage/CacheWriter;", "Lru/ok/android/externcalls/analytics/internal/storage/DatabaseHelper;", "dbHelper", "Ljava/util/concurrent/locks/Lock;", "lock", "<init>", "(Lru/ok/android/externcalls/analytics/internal/storage/DatabaseHelper;Ljava/util/concurrent/locks/Lock;)V", "", "length", "()J", "", "count", "()I", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", DatabaseHelper.ITEM_COLUMN_NAME, "Lsbi;", "writeToCache", "(Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;)V", "drop", "()V", "Ljavax/inject/Provider;", "Ljava/io/File;", "outFileProvider", "grab", "(Ljavax/inject/Provider;)V", "Lru/ok/android/externcalls/analytics/internal/storage/DatabaseHelper;", "Ljava/util/concurrent/locks/Lock;", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "Companion", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DbCacheWriter implements CacheWriter {
    private static final String LOG_TAG = "CallAnalyticsDbCacheWriter";
    private final DatabaseHelper dbHelper;
    private final Lock lock;
    private final CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();

    public DbCacheWriter(DatabaseHelper databaseHelper, Lock lock) {
        this.dbHelper = databaseHelper;
        this.lock = lock;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public int count() {
        Lock lock = this.lock;
        lock.lock();
        try {
            return this.dbHelper.count();
        } finally {
            lock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public void drop() throws IOException {
        Lock lock = this.lock;
        lock.lock();
        try {
            this.dbHelper.drop();
        } finally {
            lock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public void grab(Provider<File> outFileProvider) throws IOException {
        this.logger.d(LOG_TAG, "grab requested. noop for db driven uploader");
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public long length() {
        return 0L;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public void writeToCache(CallAnalyticsEvent item) {
        Lock lock = this.lock;
        lock.lock();
        try {
            this.dbHelper.append(item);
        } finally {
            lock.unlock();
        }
    }
}
