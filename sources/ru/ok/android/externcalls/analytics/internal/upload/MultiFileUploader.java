package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Looper;
import defpackage.c0a;
import defpackage.cqk;
import defpackage.ifh;
import defpackage.iu6;
import defpackage.iua;
import defpackage.j95;
import defpackage.ny8;
import defpackage.ore;
import defpackage.qv1;
import defpackage.r5h;
import defpackage.r66;
import defpackage.vx9;
import defpackage.zo5;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 @2\u00020\u0001:\u0002A@BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020(2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020(2\u0006\u0010+\u001a\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010\u001eJ\u000f\u0010/\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00106R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00107R\u0014\u00108\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u00109\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00106R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader;", "Ljavax/inject/Provider;", "Landroid/os/Looper;", "looperProvider", "Ljava/io/File;", "dir", "Ljava/util/concurrent/locks/Lock;", "lock", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "channel", "", "isContentCompressed", "autoDetectContentCompression", "", "fileCountLimit", "", "timeBeforeNextUploadMs", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Lru/ok/android/externcalls/analytics/internal/event/EventChannel;ZZILjava/lang/Long;)V", "now", "Lsbi;", "scheduleNextUpload", "(Z)V", "uploadImpl", "()Z", "file", "uploadFileWithResultCheck", "(Ljava/io/File;)Z", "createNewFile", "()Ljava/io/File;", "", "getAllFiles", "()Ljava/util/List;", "Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "getStorageInfo", "()Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "dropOldestFile", "(Ljava/io/File;)V", "files", "", "calcBestNameForNewFile", "(Ljava/util/List;)Ljava/lang/String;", "index", "getFileNameForIndex", "(I)Ljava/lang/String;", "getSink", "upload", "()V", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "idleStateProvider", "setIdleStateProvider", "(Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;)V", "Ljavax/inject/Provider;", "I", "Ljava/lang/Long;", "fileIndexStringLength", "scaleUpNextUploadTimeout", "Lru/ok/android/externcalls/analytics/internal/upload/MultiUploadHelper;", "multiUploadHelper$delegate", "Lny8;", "getMultiUploadHelper", "()Lru/ok/android/externcalls/analytics/internal/upload/MultiUploadHelper;", "multiUploadHelper", "Companion", "StorageInfo", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultiFileUploader extends AbstractUploader {

    @Deprecated
    public static final String CHUNK_FILE_NAME_PREFIX = "chunk";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "CallAnalyticsUploaderV2";
    private final int fileCountLimit;
    private final int fileIndexStringLength;
    private final Provider<Looper> looperProvider;

    /* JADX INFO: renamed from: multiUploadHelper$delegate, reason: from kotlin metadata */
    private final ny8 multiUploadHelper;
    private volatile int scaleUpNextUploadTimeout;
    private final Long timeBeforeNextUploadMs;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "", "oldestFile", "Ljava/io/File;", "allFiles", "", "<init>", "(Ljava/io/File;Ljava/util/List;)V", "getOldestFile", "()Ljava/io/File;", "getAllFiles", "()Ljava/util/List;", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StorageInfo {
        private final List<File> allFiles;
        private final File oldestFile;

        /* JADX WARN: Multi-variable type inference failed */
        public StorageInfo(File file, List<? extends File> list) {
            this.oldestFile = file;
            this.allFiles = list;
        }

        public final List<File> getAllFiles() {
            return this.allFiles;
        }

        public final File getOldestFile() {
            return this.oldestFile;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractUploader.UploadResult.values().length];
            try {
                iArr[AbstractUploader.UploadResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractUploader.UploadResult.RECOVERABLE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractUploader.UploadResult.SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractUploader.UploadResult.BAD_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractUploader.UploadResult.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiFileUploader(Provider<Looper> provider, Provider<File> provider2, Lock lock, EventChannel eventChannel, boolean z, boolean z2, int i, Long l) {
        super(provider2, lock, eventChannel, z, z2, LOG_TAG);
        this.looperProvider = provider;
        this.fileCountLimit = i;
        this.timeBeforeNextUploadMs = l;
        int i2 = 10;
        if (i <= 10) {
            i2 = 1;
        } else if (i <= 100) {
            i2 = 2;
        } else if (i <= 1000) {
            i2 = 3;
        }
        this.fileIndexStringLength = i2;
        this.scaleUpNextUploadTimeout = 1;
        this.multiUploadHelper = new ifh(new vx9(this, 12, eventChannel));
    }

    private final String calcBestNameForNewFile(List<? extends File> files) {
        Object next;
        int i = this.fileCountLimit;
        for (int i2 = 0; i2 < i; i2++) {
            String fileNameForIndex = getFileNameForIndex(i2);
            Iterator<T> it = files.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!cqk.d(fileNameForIndex, ((File) next).getName()));
            if (next == null) {
                if (!new File(getStorage().get(), fileNameForIndex).exists()) {
                    getLogger().d(LOG_TAG, "Name: " + fileNameForIndex + " not found, provide it");
                    return fileNameForIndex;
                }
                getLogger().d(LOG_TAG, "Name: " + fileNameForIndex + " not listed but file exists");
            }
        }
        String fileNameForIndex2 = getFileNameForIndex(0);
        getLogger().d(LOG_TAG, "Nothing found, default to " + fileNameForIndex2);
        return fileNameForIndex2;
    }

    private final File createNewFile() {
        List<File> allFiles;
        File oldestFile;
        Lock lock = getLock();
        lock.lock();
        try {
            File file = getStorage().get();
            StorageInfo storageInfo = getStorageInfo();
            if (storageInfo.getAllFiles().size() < this.fileCountLimit || (oldestFile = storageInfo.getOldestFile()) == null) {
                allFiles = storageInfo.getAllFiles();
            } else {
                dropOldestFile(oldestFile);
                allFiles = getAllFiles();
                if (allFiles == null) {
                    allFiles = storageInfo.getAllFiles();
                }
            }
            String strCalcBestNameForNewFile = calcBestNameForNewFile(allFiles);
            CallAnalyticsLogger logger = getLogger();
            List<File> list = allFiles;
            byte[] bArr = iu6.a;
            long jE = 0;
            if (list != null) {
                Iterator<File> it = list.iterator();
                while (it.hasNext()) {
                    jE += iu6.e(it.next());
                }
            }
            logger.d(LOG_TAG, "Propose new file for upload cache: " + strCalcBestNameForNewFile + ", total files size: " + jE);
            return new File(file, strCalcBestNameForNewFile);
        } finally {
            lock.unlock();
        }
    }

    private final void dropOldestFile(File file) {
        try {
            iu6.b(file);
            getLogger().d(LOG_TAG, "Oldest file " + file.getPath() + " dropped");
        } catch (IOException e) {
            getLogger().e(LOG_TAG, c0a.o("Oldest file ", file.getPath(), " drop request failed"), e);
        }
    }

    private final List<File> getAllFiles() {
        File[] fileArrListFiles = getStorage().get().listFiles();
        return fileArrListFiles != null ? a.Y0(fileArrListFiles) : r66.a;
    }

    private final String getFileNameForIndex(int index) {
        return this.fileIndexStringLength > 1 ? qv1.k("chunk_", r5h.c1(String.valueOf(index), this.fileIndexStringLength, '_')) : zo5.h(index, "chunk_");
    }

    private final MultiUploadHelper getMultiUploadHelper() {
        return (MultiUploadHelper) this.multiUploadHelper.getValue();
    }

    private final StorageInfo getStorageInfo() {
        List<File> allFiles = getAllFiles();
        File file = null;
        long jLastModified = 0;
        for (File file2 : allFiles) {
            if (file2.exists() && (file == null || file2.lastModified() < jLastModified)) {
                jLastModified = file2.lastModified();
                file = file2;
            }
        }
        return new StorageInfo(file, allFiles);
    }

    public static final MultiUploadHelper multiUploadHelper_delegate$lambda$0(MultiFileUploader multiFileUploader, EventChannel eventChannel) {
        return new MultiUploadHelper(multiFileUploader.looperProvider, eventChannel, multiFileUploader.timeBeforeNextUploadMs, LOG_TAG, new iua(3, multiFileUploader));
    }

    public static final boolean multiUploadHelper_delegate$lambda$0$0(MultiFileUploader multiFileUploader) {
        return !multiFileUploader.getStorageInfo().getAllFiles().isEmpty();
    }

    private final void scheduleNextUpload(boolean now) {
        getMultiUploadHelper().scheduleNextUpload(now, this.scaleUpNextUploadTimeout);
    }

    public static /* synthetic */ void scheduleNextUpload$default(MultiFileUploader multiFileUploader, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        multiFileUploader.scheduleNextUpload(z);
    }

    private final boolean uploadFileWithResultCheck(File file) {
        int i = WhenMappings.$EnumSwitchMapping$0[uploadFile(file).ordinal()];
        if (i == 1 || i == 2) {
            this.scaleUpNextUploadTimeout = 1;
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        if (i != 5) {
            ore.o();
            return false;
        }
        if (this.scaleUpNextUploadTimeout < 6) {
            this.scaleUpNextUploadTimeout *= 2;
        }
        return false;
    }

    private final boolean uploadImpl() {
        StorageInfo storageInfo = getStorageInfo();
        File oldestFile = storageInfo.getOldestFile();
        getLogger().d(LOG_TAG, "Try to upload oldest file first");
        if (oldestFile != null && uploadFileWithResultCheck(oldestFile)) {
            getLogger().d(LOG_TAG, "Oldest file upload completed: " + oldestFile.getPath());
            return true;
        }
        getLogger().d(LOG_TAG, "Try to upload first from the list");
        for (File file : storageInfo.getAllFiles()) {
            if (uploadFileWithResultCheck(file)) {
                getLogger().d(LOG_TAG, "File upload completed: " + file.getPath());
                return true;
            }
        }
        getLogger().d(LOG_TAG, "No files were uploaded");
        return false;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public File getSink() {
        Lock lock = getLock();
        lock.lock();
        try {
            ensureStorageIsOfCorrectType(true);
            return createNewFile();
        } finally {
            lock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader, ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void setIdleStateProvider(Uploader.IdleStateProvider idleStateProvider) {
        Uploader.IdleStateProvider idleState = getIdleState();
        Boolean boolValueOf = idleState != null ? Boolean.valueOf(idleState.isIdle()) : null;
        super.setIdleStateProvider(idleStateProvider);
        getMultiUploadHelper().setIdleStateProvider(boolValueOf, idleStateProvider);
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void upload() {
        Uploader.IdleStateProvider idleState = getIdleState();
        if (idleState != null && !idleState.isIdle()) {
            getLogger().d(LOG_TAG, "call is not idle, postpone upload");
            return;
        }
        Lock lock = getLock();
        lock.lock();
        try {
            try {
                uploadImpl();
            } catch (Throwable th) {
                getLogger().report(LOG_TAG, "Upload failed", new StatDeliveryException(getChannel().getApiMethod(), th));
            }
            scheduleNextUpload$default(this, false, 1, null);
        } finally {
            lock.unlock();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$Companion;", "", "<init>", "()V", "LOG_TAG", "", "CHUNK_FILE_NAME_PREFIX", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MultiFileUploader(Provider provider, Provider provider2, Lock lock, EventChannel eventChannel, boolean z, boolean z2, int i, Long l, int i2, j95 j95Var) {
        this(provider, provider2, lock, eventChannel, z, z2, (i2 & 64) != 0 ? 10 : i, l);
    }
}
