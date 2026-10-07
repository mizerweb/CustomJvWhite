package ru.ok.android.externcalls.sdk.ml.delegate;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.b17;
import defpackage.bag;
import defpackage.c0a;
import defpackage.cf7;
import defpackage.cqk;
import defpackage.d17;
import defpackage.dp9;
import defpackage.e8g;
import defpackage.f17;
import defpackage.fg7;
import defpackage.i3f;
import defpackage.ip9;
import defpackage.iu6;
import defpackage.lp9;
import defpackage.lu6;
import defpackage.ore;
import defpackage.pp9;
import defpackage.q8g;
import defpackage.rg4;
import defpackage.sbi;
import defpackage.sf7;
import defpackage.sr;
import defpackage.th;
import defpackage.uv0;
import defpackage.v7g;
import defpackage.wt7;
import defpackage.ww3;
import defpackage.wxl;
import defpackage.xj9;
import defpackage.y3e;
import defpackage.yw3;
import defpackage.z2f;
import defpackage.z5h;
import defpackage.z9g;
import defpackage.zo5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.io.FileAlreadyExistsException;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfig;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProvider;
import ru.ok.android.externcalls.sdk.ml.model.AvailableMLFeatureInfo;
import ru.ok.android.externcalls.sdk.ml.model.ExtensionRule;
import ru.ok.android.externcalls.sdk.ml.model.MLFeatureType;
import ru.ok.android.externcalls.sdk.ml.model.MLModelCheckResult;
import ru.ok.android.externcalls.sdk.ml.model.ModelSpec;
import ru.ok.android.externcalls.sdk.ml.stage.DownloadStage;
import ru.ok.android.externcalls.sdk.ml.stage.RenameStage;
import ru.ok.android.externcalls.sdk.ml.stage.SaveNewModelInfoStage;
import ru.ok.android.externcalls.sdk.ml.stage.UnzipStage;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.net.FileValidationConfig;
import ru.ok.android.externcalls.sdk.net.internal.DownloadResult;
import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000 G2\u00020\u0001:\u0002HGBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010%\u001a\u00020)H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00101J\u0017\u00104\u001a\u00020/2\u0006\u00103\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0014¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020;0!¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010F¨\u0006I"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate;", "", "Lxj9;", "mlFeaturesInfoDataSource", "Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfigProvider;", "mlFeatureConfigProvider", "Lru/ok/android/externcalls/sdk/net/DownloadService;", "downloadService", "Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;", "mlDownloadStat", "Lru/ok/android/externcalls/sdk/ml/model/MLFeatureType;", "type", "", "actualModelVersion", "Ly3e;", "logger", "Landroid/content/Context;", "context", "Lru/ok/android/externcalls/sdk/ml/model/ModelSpec;", "modelSpec", "<init>", "(Lxj9;Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfigProvider;Lru/ok/android/externcalls/sdk/net/DownloadService;Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;Lru/ok/android/externcalls/sdk/ml/model/MLFeatureType;Ljava/lang/String;Ly3e;Landroid/content/Context;Lru/ok/android/externcalls/sdk/ml/model/ModelSpec;)V", "downloadDir", "()Ljava/lang/String;", "fileName", "Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult;", "validateCurrentModel", "()Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult;", "Ldp9;", "Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfig;", "fetchConfig", "()Ldp9;", "config", "Lv7g;", "Lru/ok/android/externcalls/sdk/ml/stage/DownloadStage;", "downloadModel", "(Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfig;)Lv7g;", "stage", "Lru/ok/android/externcalls/sdk/ml/stage/UnzipStage;", "unzipModel", "(Lru/ok/android/externcalls/sdk/ml/stage/DownloadStage;)Lru/ok/android/externcalls/sdk/ml/stage/UnzipStage;", "Lru/ok/android/externcalls/sdk/ml/stage/RenameStage;", "renameFiles", "(Lru/ok/android/externcalls/sdk/ml/stage/UnzipStage;)Lru/ok/android/externcalls/sdk/ml/stage/RenameStage;", "Lru/ok/android/externcalls/sdk/ml/stage/SaveNewModelInfoStage;", "saveNewModelInfo", "(Lru/ok/android/externcalls/sdk/ml/stage/RenameStage;)Lru/ok/android/externcalls/sdk/ml/stage/SaveNewModelInfoStage;", "Lsbi;", "clearDir", "()V", "removeCurrentModel", "msg", "log", "(Ljava/lang/String;)V", "Ljava/io/File;", "modelDir", "", "isModelValid", "(Ljava/io/File;)Z", "Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult;", "checkModel", "()Lv7g;", "Lxj9;", "Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfigProvider;", "Lru/ok/android/externcalls/sdk/net/DownloadService;", "Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;", "Lru/ok/android/externcalls/sdk/ml/model/MLFeatureType;", "Ljava/lang/String;", "Ly3e;", "Landroid/content/Context;", "Lru/ok/android/externcalls/sdk/ml/model/ModelSpec;", "Companion", "MLModelValidationResult", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class MLFeatureDelegate {
    private static final String LOG_TAG = "MLFeatureDelegate";
    private static final String ML_FEATURES_DIR_NAME = "ml_features";
    private static final String ZIP_EXTENSION = "zip";
    private final String actualModelVersion;
    private final Context context;
    private final DownloadService downloadService;
    private final y3e logger;
    private final MLDownloadStat mlDownloadStat;
    private final MLFeatureConfigProvider mlFeatureConfigProvider;
    private final xj9 mlFeaturesInfoDataSource;
    private final ModelSpec modelSpec;
    private final MLFeatureType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult;", "", "UpToDate", "NeedUpdate", "Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult$NeedUpdate;", "Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult$UpToDate;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface MLModelValidationResult {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult$NeedUpdate;", "Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NeedUpdate implements MLModelValidationResult {
            private final String reason;

            public NeedUpdate(String str) {
                this.reason = str;
            }

            public final String getReason() {
                return this.reason;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult$UpToDate;", "Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult;", "model", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getModel", "()Ljava/io/File;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class UpToDate implements MLModelValidationResult {
            private final File model;

            public UpToDate(File file) {
                this.model = file;
            }

            public final File getModel() {
                return this.model;
            }
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$downloadModel$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass2<T, R> implements sf7 {
        public static final AnonymousClass2<T, R> INSTANCE = ;

        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
        /* JADX INFO: renamed from: apply */
        public final DownloadStage mo41apply(DownloadResult downloadResult) {
            return new DownloadStage(downloadResult.getFile(), downloadResult.getDownloadDurationMs());
        }
    }

    public MLFeatureDelegate(xj9 xj9Var, MLFeatureConfigProvider mLFeatureConfigProvider, DownloadService downloadService, MLDownloadStat mLDownloadStat, MLFeatureType mLFeatureType, String str, y3e y3eVar, Context context, ModelSpec modelSpec) {
        this.mlFeaturesInfoDataSource = xj9Var;
        this.mlFeatureConfigProvider = mLFeatureConfigProvider;
        this.downloadService = downloadService;
        this.mlDownloadStat = mLDownloadStat;
        this.type = mLFeatureType;
        this.actualModelVersion = str;
        this.logger = y3eVar;
        this.context = context;
        this.modelSpec = modelSpec;
    }

    private final void clearDir() {
        File[] fileArrListFiles = new File(downloadDir()).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                wxl.b(file, new MLFeatureDelegate$clearDir$1$1(this));
            }
        }
    }

    private final String downloadDir() {
        return this.context.getFilesDir() + "/ml_features/" + this.type.getSubDirName();
    }

    public final v7g downloadModel(MLFeatureConfig config) {
        log("Start download " + this.type + " model file. url = " + config.getUrl());
        File file = new File(downloadDir(), fileName());
        v7g v7gVarDownload = this.downloadService.download(config.getUrl(), file, new FileValidationConfig(config.getChecksum(), wt7.MD5));
        C00391 c00391 = new uv0() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.downloadModel.1
            final /* synthetic */ File $destination;
            final /* synthetic */ MLFeatureDelegate this$0;

            public C00391() {
                file = file;
                mLFeatureDelegate = this;
            }

            @Override // defpackage.uv0
            public final boolean test(Integer num, Throwable th) {
                boolean z = th instanceof FileAlreadyExistsException;
                if (z) {
                    wxl.b(file, new C00051(mLFeatureDelegate));
                }
                return num.intValue() <= 1 && z;
            }

            /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$downloadModel$1$1 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class C00051 extends fg7 implements cf7 {
                public C00051(Object obj) {
                    super(1, 0, MLFeatureDelegate.class, obj, "log", "log(Ljava/lang/String;)V");
                }

                @Override // defpackage.cf7
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return sbi.a;
                }

                public final void invoke(String str) {
                    ((MLFeatureDelegate) this.receiver).log(str);
                }
            }
        };
        v7gVarDownload.getClass();
        return new f17(new b17(v7gVarDownload instanceof f17 ? new d17(((f17) v7gVarDownload).a) : new bag(v7gVarDownload), c00391)).f(AnonymousClass2.INSTANCE);
    }

    private final dp9 fetchConfig() {
        return this.mlFeatureConfigProvider.getConfig();
    }

    private final String fileName() {
        return zo5.o(this.actualModelVersion, ".zip");
    }

    public final void log(String msg) {
        this.logger.log(LOG_TAG, msg);
    }

    public final void removeCurrentModel() {
        Object obj = this.mlFeaturesInfoDataSource;
        String prefsKey = this.type.getPrefsKey();
        sr srVar = (sr) obj;
        srVar.getClass();
        prefsKey.getClass();
        ((SharedPreferences) srVar.b).edit().remove(prefsKey).apply();
        clearDir();
    }

    public final RenameStage renameFiles(UnzipStage stage) throws IOException {
        File modelDir = stage.getModelDir();
        if (!modelDir.exists() || !modelDir.isDirectory()) {
            ore.p(zo5.m(modelDir, "Path does not exist or is not directory: "));
            return null;
        }
        File[] fileArrListFiles = modelDir.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("Failed to list files in directory: " + modelDir + " (access denied or I/O error)");
        }
        File file = null;
        boolean z = false;
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                String name = file2.getName();
                if (z5h.G0(name, "config.cfg", false)) {
                    z = true;
                } else if (name.regionMatches(true, name.length() - 4, ".cfg", 0, 4)) {
                    file = file2;
                }
            }
        }
        if (z) {
            log("Valid config file already exists");
            return new RenameStage(stage.getModelDir(), stage.getDownloadDurationMs());
        }
        if (file == null) {
            throw new FileNotFoundException("Config file (.cfg) was not found");
        }
        File file3 = new File(modelDir, "config.cfg");
        if (file3.exists()) {
            wxl.b(file3, null);
        }
        file.renameTo(file3);
        log(c0a.o("Config file ", file.getName(), " was successfully renamed to config.cfg"));
        return new RenameStage(stage.getModelDir(), stage.getDownloadDurationMs());
    }

    public final SaveNewModelInfoStage saveNewModelInfo(RenameStage stage) {
        log("Saving new " + this.type + " model info");
        ((sr) this.mlFeaturesInfoDataSource).X(this.type.getPrefsKey(), new AvailableMLFeatureInfo(this.type, this.actualModelVersion, stage.getModelDir().getPath()));
        return new SaveNewModelInfoStage(stage.getModelDir(), stage.getDownloadDurationMs());
    }

    public final UnzipStage unzipModel(DownloadStage stage) {
        File parentFile;
        try {
            log("Start unzipping " + this.type + " model. file " + stage.getFile());
            String str = (String) ww3.t1(iu6.i(new File(downloadDir()), stage.getFile()));
            if (str == null || (parentFile = new File(downloadDir(), str).getParentFile()) == null) {
                throw new IllegalStateException("The archive was unpacked incorrectly");
            }
            UnzipStage unzipStage = new UnzipStage(parentFile, stage.getDownloadDurationMs());
            wxl.b(stage.getFile(), new C00401(this));
            return unzipStage;
        } catch (Throwable th) {
            wxl.b(stage.getFile(), new C00401(this));
            throw th;
        }
    }

    public final MLModelValidationResult validateCurrentModel() {
        AvailableMLFeatureInfo availableMLFeatureInfo = (AvailableMLFeatureInfo) ((sr) this.mlFeaturesInfoDataSource).y(this.type.getPrefsKey(), AvailableMLFeatureInfo.class);
        if (availableMLFeatureInfo == null) {
            return new MLModelValidationResult.NeedUpdate("There are no available models");
        }
        if (!cqk.d(availableMLFeatureInfo.getVersion(), this.actualModelVersion)) {
            return new MLModelValidationResult.NeedUpdate("The current version is out of date");
        }
        File file = new File(availableMLFeatureInfo.getPath());
        return !isModelValid(file) ? new MLModelValidationResult.NeedUpdate("Can not verify model integrity") : new MLModelValidationResult.UpToDate(file);
    }

    public final v7g checkModel() {
        dp9 dp9VarFetchConfig = fetchConfig();
        z2f z2fVarB = i3f.b();
        dp9VarFetchConfig.getClass();
        Objects.requireNonNull(z2fVarB, "scheduler is null");
        lp9 lp9Var = new lp9(dp9VarFetchConfig, z2fVarB, 1);
        z2f z2fVarB2 = i3f.b();
        Objects.requireNonNull(z2fVarB2, "scheduler is null");
        ip9 ip9Var = new ip9(new lp9(lp9Var, z2fVarB2, 0), new sf7() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1

            /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1$4 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class AnonymousClass4<T, R> implements sf7 {
                public AnonymousClass4() {
                }

                @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                /* JADX INFO: renamed from: apply */
                public final MLModelCheckResult.Enabled.UpdatedModel mo41apply(SaveNewModelInfoStage saveNewModelInfoStage) {
                    return new MLModelCheckResult.Enabled.UpdatedModel(saveNewModelInfoStage.getFile(), mLFeatureDelegate.actualModelVersion, saveNewModelInfoStage.getDownloadDurationMs());
                }
            }

            /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1$5 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class AnonymousClass5<T> implements rg4 {
                public AnonymousClass5() {
                }

                @Override // defpackage.rg4, defpackage.tg4
                public final void accept(MLModelCheckResult.Enabled.UpdatedModel updatedModel) {
                    MLFeatureDelegate mLFeatureDelegate = mLFeatureDelegate;
                    mLFeatureDelegate.log(mLFeatureDelegate.type + " ml model updated successfully");
                    mLFeatureDelegate.mlDownloadStat.readyToUse(updatedModel.getVersion(), updatedModel.getDownloadDurationMs());
                }
            }

            /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1$6 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class AnonymousClass6<T> implements rg4 {
                public AnonymousClass6() {
                }

                @Override // defpackage.rg4, defpackage.tg4
                public final void accept(Throwable th) {
                    MLFeatureDelegate mLFeatureDelegate = mLFeatureDelegate;
                    mLFeatureDelegate.log("Error during " + mLFeatureDelegate.type + " ml model update: " + th);
                    mLFeatureDelegate.mlDownloadStat.error(mLFeatureDelegate.actualModelVersion, th.getMessage());
                }
            }

            public AnonymousClass1() {
            }

            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply */
            public final z9g mo41apply(MLFeatureConfig mLFeatureConfig) {
                MLFeatureDelegate.this.logger.log(MLFeatureDelegate.LOG_TAG, "got ml config " + mLFeatureConfig);
                boolean enabled = mLFeatureConfig.getEnabled();
                MLFeatureDelegate mLFeatureDelegate = MLFeatureDelegate.this;
                if (!enabled) {
                    mLFeatureDelegate.logger.log(MLFeatureDelegate.LOG_TAG, "The activation of the " + MLFeatureDelegate.this.type + " has been disabled remotely");
                    return v7g.e(MLModelCheckResult.Disabled.INSTANCE);
                }
                MLModelValidationResult mLModelValidationResultValidateCurrentModel = mLFeatureDelegate.validateCurrentModel();
                if (mLModelValidationResultValidateCurrentModel instanceof MLModelValidationResult.NeedUpdate) {
                    MLFeatureDelegate mLFeatureDelegate2 = MLFeatureDelegate.this;
                    mLFeatureDelegate2.log("Current " + mLFeatureDelegate2.type + " model is invalid, the update is starting now. Reason: " + ((MLModelValidationResult.NeedUpdate) mLModelValidationResultValidateCurrentModel).getReason());
                    MLFeatureDelegate.this.removeCurrentModel();
                    return new e8g(new e8g(new q8g(MLFeatureDelegate.this.downloadModel(mLFeatureConfig).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.1
                        public C00041() {
                        }

                        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                        /* JADX INFO: renamed from: apply */
                        public final UnzipStage mo41apply(DownloadStage downloadStage) {
                            return mLFeatureDelegate.unzipModel(downloadStage);
                        }
                    }).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.2
                        public AnonymousClass2() {
                        }

                        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                        /* JADX INFO: renamed from: apply */
                        public final RenameStage mo41apply(UnzipStage unzipStage) {
                            return mLFeatureDelegate.renameFiles(unzipStage);
                        }
                    }).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.3
                        public AnonymousClass3() {
                        }

                        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                        /* JADX INFO: renamed from: apply */
                        public final SaveNewModelInfoStage mo41apply(RenameStage renameStage) {
                            return mLFeatureDelegate.saveNewModelInfo(renameStage);
                        }
                    }), th.a(), 0).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.4
                        public AnonymousClass4() {
                        }

                        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                        /* JADX INFO: renamed from: apply */
                        public final MLModelCheckResult.Enabled.UpdatedModel mo41apply(SaveNewModelInfoStage saveNewModelInfoStage) {
                            return new MLModelCheckResult.Enabled.UpdatedModel(saveNewModelInfoStage.getFile(), mLFeatureDelegate.actualModelVersion, saveNewModelInfoStage.getDownloadDurationMs());
                        }
                    }), new rg4() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.5
                        public AnonymousClass5() {
                        }

                        @Override // defpackage.rg4, defpackage.tg4
                        public final void accept(MLModelCheckResult.Enabled.UpdatedModel updatedModel) {
                            MLFeatureDelegate mLFeatureDelegate3 = mLFeatureDelegate;
                            mLFeatureDelegate3.log(mLFeatureDelegate3.type + " ml model updated successfully");
                            mLFeatureDelegate.mlDownloadStat.readyToUse(updatedModel.getVersion(), updatedModel.getDownloadDurationMs());
                        }
                    }, 2), new rg4() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.6
                        public AnonymousClass6() {
                        }

                        @Override // defpackage.rg4, defpackage.tg4
                        public final void accept(Throwable th) {
                            MLFeatureDelegate mLFeatureDelegate3 = mLFeatureDelegate;
                            mLFeatureDelegate3.log("Error during " + mLFeatureDelegate3.type + " ml model update: " + th);
                            mLFeatureDelegate.mlDownloadStat.error(mLFeatureDelegate.actualModelVersion, th.getMessage());
                        }
                    }, 0);
                }
                if (!(mLModelValidationResultValidateCurrentModel instanceof MLModelValidationResult.UpToDate)) {
                    ore.o();
                    return null;
                }
                MLFeatureDelegate mLFeatureDelegate3 = MLFeatureDelegate.this;
                mLFeatureDelegate3.log("Current " + mLFeatureDelegate3.type + " model is up to date");
                return v7g.e(new MLModelCheckResult.Enabled.ExistentModel(((MLModelValidationResult.UpToDate) mLModelValidationResultValidateCurrentModel).getModel()));
            }

            /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1$1 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class C00041 implements sf7 {
                public C00041() {
                }

                @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                /* JADX INFO: renamed from: apply */
                public final UnzipStage mo41apply(DownloadStage downloadStage) {
                    return mLFeatureDelegate.unzipModel(downloadStage);
                }
            }

            /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1$2 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class AnonymousClass2 implements sf7 {
                public AnonymousClass2() {
                }

                @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                /* JADX INFO: renamed from: apply */
                public final RenameStage mo41apply(UnzipStage unzipStage) {
                    return mLFeatureDelegate.renameFiles(unzipStage);
                }
            }

            /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1$3 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class AnonymousClass3 implements sf7 {
                public AnonymousClass3() {
                }

                @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                /* JADX INFO: renamed from: apply */
                public final SaveNewModelInfoStage mo41apply(RenameStage renameStage) {
                    return mLFeatureDelegate.saveNewModelInfo(renameStage);
                }
            }
        }, 0);
        MLModelCheckResult.Disabled disabled = MLModelCheckResult.Disabled.INSTANCE;
        Objects.requireNonNull(disabled, "defaultItem is null");
        return new pp9(ip9Var, 0, disabled);
    }

    public boolean isModelValid(File modelDir) {
        File[] fileArrListFiles;
        if (!modelDir.exists() || !modelDir.isDirectory() || (fileArrListFiles = modelDir.listFiles()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.length() >= this.modelSpec.getMinFileSize()) {
                arrayList.add(file);
            }
        }
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(lu6.m0((File) it.next()));
        }
        Set<String> setX1 = ww3.X1(arrayList2);
        Set<ExtensionRule> requiredExtensions = this.modelSpec.getRequiredExtensions();
        if (requiredExtensions != null && requiredExtensions.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = requiredExtensions.iterator();
        while (it2.hasNext()) {
            if (!((ExtensionRule) it2.next()).isSatisfied(setX1)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1<T, R> implements sf7 {

        /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1$4 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class AnonymousClass4<T, R> implements sf7 {
            public AnonymousClass4() {
            }

            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply */
            public final MLModelCheckResult.Enabled.UpdatedModel mo41apply(SaveNewModelInfoStage saveNewModelInfoStage) {
                return new MLModelCheckResult.Enabled.UpdatedModel(saveNewModelInfoStage.getFile(), mLFeatureDelegate.actualModelVersion, saveNewModelInfoStage.getDownloadDurationMs());
            }
        }

        /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1$5 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class AnonymousClass5<T> implements rg4 {
            public AnonymousClass5() {
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(MLModelCheckResult.Enabled.UpdatedModel updatedModel) {
                MLFeatureDelegate mLFeatureDelegate3 = mLFeatureDelegate;
                mLFeatureDelegate3.log(mLFeatureDelegate3.type + " ml model updated successfully");
                mLFeatureDelegate.mlDownloadStat.readyToUse(updatedModel.getVersion(), updatedModel.getDownloadDurationMs());
            }
        }

        /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1$6 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class AnonymousClass6<T> implements rg4 {
            public AnonymousClass6() {
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Throwable th) {
                MLFeatureDelegate mLFeatureDelegate3 = mLFeatureDelegate;
                mLFeatureDelegate3.log("Error during " + mLFeatureDelegate3.type + " ml model update: " + th);
                mLFeatureDelegate.mlDownloadStat.error(mLFeatureDelegate.actualModelVersion, th.getMessage());
            }
        }

        public AnonymousClass1() {
        }

        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
        /* JADX INFO: renamed from: apply */
        public final z9g mo41apply(MLFeatureConfig mLFeatureConfig) {
            MLFeatureDelegate.this.logger.log(MLFeatureDelegate.LOG_TAG, "got ml config " + mLFeatureConfig);
            boolean enabled = mLFeatureConfig.getEnabled();
            MLFeatureDelegate mLFeatureDelegate = MLFeatureDelegate.this;
            if (!enabled) {
                mLFeatureDelegate.logger.log(MLFeatureDelegate.LOG_TAG, "The activation of the " + MLFeatureDelegate.this.type + " has been disabled remotely");
                return v7g.e(MLModelCheckResult.Disabled.INSTANCE);
            }
            MLModelValidationResult mLModelValidationResultValidateCurrentModel = mLFeatureDelegate.validateCurrentModel();
            if (mLModelValidationResultValidateCurrentModel instanceof MLModelValidationResult.NeedUpdate) {
                MLFeatureDelegate mLFeatureDelegate2 = MLFeatureDelegate.this;
                mLFeatureDelegate2.log("Current " + mLFeatureDelegate2.type + " model is invalid, the update is starting now. Reason: " + ((MLModelValidationResult.NeedUpdate) mLModelValidationResultValidateCurrentModel).getReason());
                MLFeatureDelegate.this.removeCurrentModel();
                return new e8g(new e8g(new q8g(MLFeatureDelegate.this.downloadModel(mLFeatureConfig).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.1
                    public C00041() {
                    }

                    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                    /* JADX INFO: renamed from: apply */
                    public final UnzipStage mo41apply(DownloadStage downloadStage) {
                        return mLFeatureDelegate.unzipModel(downloadStage);
                    }
                }).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.2
                    public AnonymousClass2() {
                    }

                    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                    /* JADX INFO: renamed from: apply */
                    public final RenameStage mo41apply(UnzipStage unzipStage) {
                        return mLFeatureDelegate.renameFiles(unzipStage);
                    }
                }).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.3
                    public AnonymousClass3() {
                    }

                    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                    /* JADX INFO: renamed from: apply */
                    public final SaveNewModelInfoStage mo41apply(RenameStage renameStage) {
                        return mLFeatureDelegate.saveNewModelInfo(renameStage);
                    }
                }), th.a(), 0).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.4
                    public AnonymousClass4() {
                    }

                    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                    /* JADX INFO: renamed from: apply */
                    public final MLModelCheckResult.Enabled.UpdatedModel mo41apply(SaveNewModelInfoStage saveNewModelInfoStage) {
                        return new MLModelCheckResult.Enabled.UpdatedModel(saveNewModelInfoStage.getFile(), mLFeatureDelegate.actualModelVersion, saveNewModelInfoStage.getDownloadDurationMs());
                    }
                }), new rg4() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.5
                    public AnonymousClass5() {
                    }

                    @Override // defpackage.rg4, defpackage.tg4
                    public final void accept(MLModelCheckResult.Enabled.UpdatedModel updatedModel) {
                        MLFeatureDelegate mLFeatureDelegate3 = mLFeatureDelegate;
                        mLFeatureDelegate3.log(mLFeatureDelegate3.type + " ml model updated successfully");
                        mLFeatureDelegate.mlDownloadStat.readyToUse(updatedModel.getVersion(), updatedModel.getDownloadDurationMs());
                    }
                }, 2), new rg4() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.6
                    public AnonymousClass6() {
                    }

                    @Override // defpackage.rg4, defpackage.tg4
                    public final void accept(Throwable th) {
                        MLFeatureDelegate mLFeatureDelegate3 = mLFeatureDelegate;
                        mLFeatureDelegate3.log("Error during " + mLFeatureDelegate3.type + " ml model update: " + th);
                        mLFeatureDelegate.mlDownloadStat.error(mLFeatureDelegate.actualModelVersion, th.getMessage());
                    }
                }, 0);
            }
            if (!(mLModelValidationResultValidateCurrentModel instanceof MLModelValidationResult.UpToDate)) {
                ore.o();
                return null;
            }
            MLFeatureDelegate mLFeatureDelegate3 = MLFeatureDelegate.this;
            mLFeatureDelegate3.log("Current " + mLFeatureDelegate3.type + " model is up to date");
            return v7g.e(new MLModelCheckResult.Enabled.ExistentModel(((MLModelValidationResult.UpToDate) mLModelValidationResultValidateCurrentModel).getModel()));
        }

        /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1$1 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class C00041 implements sf7 {
            public C00041() {
            }

            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply */
            public final UnzipStage mo41apply(DownloadStage downloadStage) {
                return mLFeatureDelegate.unzipModel(downloadStage);
            }
        }

        /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1$2 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class AnonymousClass2 implements sf7 {
            public AnonymousClass2() {
            }

            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply */
            public final RenameStage mo41apply(UnzipStage unzipStage) {
                return mLFeatureDelegate.renameFiles(unzipStage);
            }
        }

        /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1$3 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class AnonymousClass3 implements sf7 {
            public AnonymousClass3() {
            }

            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply */
            public final SaveNewModelInfoStage mo41apply(RenameStage renameStage) {
                return mLFeatureDelegate.saveNewModelInfo(renameStage);
            }
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$downloadModel$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C00391<T1, T2> implements uv0 {
        final /* synthetic */ File $destination;
        final /* synthetic */ MLFeatureDelegate this$0;

        public C00391() {
            file = file;
            mLFeatureDelegate = this;
        }

        @Override // defpackage.uv0
        public final boolean test(Integer num, Throwable th) {
            boolean z = th instanceof FileAlreadyExistsException;
            if (z) {
                wxl.b(file, new C00051(mLFeatureDelegate));
            }
            return num.intValue() <= 1 && z;
        }

        /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$downloadModel$1$1 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class C00051 extends fg7 implements cf7 {
            public C00051(Object obj) {
                super(1, 0, MLFeatureDelegate.class, obj, "log", "log(Ljava/lang/String;)V");
            }

            @Override // defpackage.cf7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return sbi.a;
            }

            public final void invoke(String str) {
                ((MLFeatureDelegate) this.receiver).log(str);
            }
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$unzipModel$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class C00401 extends fg7 implements cf7 {
        public C00401(Object obj) {
            super(1, 0, MLFeatureDelegate.class, obj, "log", "log(Ljava/lang/String;)V");
        }

        @Override // defpackage.cf7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return sbi.a;
        }

        public final void invoke(String str) {
            ((MLFeatureDelegate) this.receiver).log(str);
        }
    }
}
