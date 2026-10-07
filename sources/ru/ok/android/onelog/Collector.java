package ru.ok.android.onelog;

import android.app.Application;
import android.content.Context;
import defpackage.yab;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Provider;
import ru.ok.android.commons.app.ApplicationProvider;

/* JADX INFO: loaded from: classes3.dex */
final class Collector implements OneLogAppender {
    private static final String APPEND_FILENAME = "append";
    private static final String MERGED_COLLECTOR = "";
    private static final String MERGED_LOG_DIRNAME = "onelog-v3";
    private static final String SEPARATE_LOG_DIRNAME = "onelog-v2";
    private static final String UPLOAD_FILENAME = "upload";
    private static Collector lastInstance;
    private static volatile Boolean useMergedCollector;
    private final String collector;
    private final Context context;
    private static final ConcurrentHashMap<String, Collector> INSTANCES = new ConcurrentHashMap<>();
    private static boolean cleanObsoleteDirs = true;
    private final AtomicReference<Worker> worker = new AtomicReference<>();
    private final AtomicReference<Uploader> uploader = new AtomicReference<>();
    private final Provider<File> uploadFile = new OneLogFile(UPLOAD_FILENAME);
    private final Lock uploadLock = new ReentrantLock();

    public final class OneLogFile implements Provider<File> {
        private File cachedFile;
        private final String name;

        public OneLogFile(String str) {
            this.name = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // javax.inject.Provider
        public File get() {
            File file = this.cachedFile;
            if (file != null) {
                return file;
            }
            Collector.this.cleanObsoleteDirs();
            File file2 = Collector.useMergedCollector.booleanValue() ? new File(new File(Collector.this.context.getFilesDir(), Collector.MERGED_LOG_DIRNAME), this.name) : new File(new File(new File(Collector.this.context.getFilesDir(), Collector.SEPARATE_LOG_DIRNAME), Collector.this.collector), this.name);
            this.cachedFile = file2;
            return file2;
        }
    }

    private Collector(Context context, String str) {
        this.context = context;
        this.collector = str;
    }

    private void cleanObsoleteDir(String str) {
        File file = new File(this.context.getFilesDir(), str);
        if (file.exists()) {
            deleteRecursively(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanObsoleteDirs() {
        if (cleanObsoleteDirs) {
            cleanObsoleteDirs = false;
            cleanObsoleteDir("onelog");
            if (useMergedCollector.booleanValue()) {
                cleanObsoleteDir(SEPARATE_LOG_DIRNAME);
            } else {
                cleanObsoleteDir(MERGED_LOG_DIRNAME);
            }
        }
    }

    private static boolean deleteRecursively(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                deleteRecursively(file2);
            }
        }
        return file.delete();
    }

    public static void flushAll() {
        Iterator<Collector> it = INSTANCES.values().iterator();
        while (it.hasNext()) {
            it.next().flush();
        }
    }

    public static Collector getInstance(String str) {
        if (useMergedCollector == null) {
            synchronized (INSTANCES) {
                try {
                    if (useMergedCollector == null) {
                        useMergedCollector = Boolean.valueOf(OneLogImpl.getInstance().isBatchCollectorsEnabled());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (useMergedCollector.booleanValue()) {
            str = "";
        }
        Application application = ApplicationProvider.a;
        Application applicationF = yab.F();
        Collector collector = lastInstance;
        if (collector != null && str.equals(collector.collector)) {
            return collector;
        }
        ConcurrentHashMap<String, Collector> concurrentHashMap = INSTANCES;
        Collector collector2 = concurrentHashMap.get(str);
        if (collector2 != null) {
            lastInstance = collector2;
            return collector2;
        }
        Collector collector3 = new Collector(applicationF, str);
        Collector collectorPutIfAbsent = concurrentHashMap.putIfAbsent(str, collector3);
        if (collectorPutIfAbsent != null) {
            lastInstance = collectorPutIfAbsent;
            return collectorPutIfAbsent;
        }
        lastInstance = collector3;
        return collector3;
    }

    private Uploader getUploader() {
        Uploader uploader = this.uploader.get();
        if (uploader != null) {
            return uploader;
        }
        Uploader uploader2 = new Uploader(this.uploadFile, this.uploadLock);
        AtomicReference<Uploader> atomicReference = this.uploader;
        while (!atomicReference.compareAndSet(null, uploader2)) {
            if (atomicReference.get() != null) {
                return this.uploader.get();
            }
        }
        return uploader2;
    }

    private Worker getWorker() {
        Worker worker = this.worker.get();
        if (worker != null) {
            return worker;
        }
        Worker worker2 = new Worker(new OneLogFile(APPEND_FILENAME), new ReentrantLock(), this.collector);
        AtomicReference<Worker> atomicReference = this.worker;
        while (!atomicReference.compareAndSet(null, worker2)) {
            if (atomicReference.get() != null) {
                return this.worker.get();
            }
        }
        return worker2;
    }

    @Override // ru.ok.android.onelog.OneLogAppender
    public void append(OneLogItem oneLogItem) {
        getWorker().append(oneLogItem);
    }

    public void drop() {
        getWorker().drop();
        getUploader().drop();
    }

    @Override // ru.ok.android.onelog.OneLogAppender, java.io.Flushable
    public void flush() {
        getWorker().flush();
    }

    public void upload(OneLogTrigger oneLogTrigger) throws IOException {
        try {
            this.uploadLock.lock();
            getWorker().grab(this.uploadFile.get());
            this.uploadLock.unlock();
            try {
                getUploader().upload(OneLogImpl.getInstance().getApiClient(this.collector), oneLogTrigger);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            this.uploadLock.unlock();
            throw th;
        }
    }
}
