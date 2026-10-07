package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.OmicronConfig;
import com.vk.push.core.remote.config.omicron.c;
import com.vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import com.vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import com.vk.push.core.remote.config.omicron.timetable.TimeProvider;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.TextureBufferImpl;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mz0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        tsb tsbVar;
        InputStream inputStreamQ0;
        File file;
        Closeable closeable;
        int i = this.a;
        File file2 = null;
        data = null;
        Data data = null;
        file2 = null;
        file2 = null;
        file2 = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                nz0 nz0Var = (nz0) obj;
                try {
                    ibb ibbVarB = nz0Var.b.b(nz0Var.d);
                    if (ibbVarB != null && ibbVarB.b.exists() && ibbVarB.b.canRead()) {
                        nz0Var.e(ibbVarB.b, ibbVarB.a);
                        String str = hbb.a;
                        return ibbVarB;
                    }
                    if (!nz0Var.e) {
                        String str2 = hbb.a;
                        return null;
                    }
                    pc5 pc5Var = nz0Var.b;
                    String str3 = nz0Var.d;
                    pc5Var.getClass();
                    file = new File(pc5Var.a.a(), pc5Var.a(str3).concat(".temp"));
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    try {
                        tsb tsbVarF = nz0Var.a.f(nz0Var.d);
                        try {
                            if (!tsbVarF.a.E()) {
                                throw new FileNotFoundException(nz0Var.d);
                            }
                            rne rneVar = tsbVarF.a.g;
                            if (rneVar == null) {
                                throw new IOException("failed to get response body");
                            }
                            inputStreamQ0 = rneVar.E().Q0();
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                                try {
                                    byte[] bArr = new byte[np0.r];
                                    while (true) {
                                        int i2 = inputStreamQ0.read(bArr);
                                        if (i2 != -1) {
                                            fileOutputStream.write(bArr, 0, i2);
                                        } else {
                                            fileOutputStream.flush();
                                            String strL = tsbVarF.l();
                                            File fileC = nz0Var.b.c(nz0Var.d, strL);
                                            File parentFile2 = fileC.getParentFile();
                                            if (parentFile2 != null) {
                                                parentFile2.mkdirs();
                                            }
                                            try {
                                                hbb.b(file, fileC);
                                                nz0Var.e(fileC, strL);
                                                ibb ibbVar = new ibb(fileC, strL);
                                                hbb.a(tsbVarF);
                                                hbb.a(inputStreamQ0);
                                                hbb.a(fileOutputStream);
                                                hbb.c(file);
                                                return ibbVar;
                                            } catch (Throwable th) {
                                                tsbVar = tsbVarF;
                                                th = th;
                                                file2 = fileC;
                                                closeable = fileOutputStream;
                                            }
                                        }
                                        try {
                                            hbb.c(file2);
                                            for (WeakReference weakReference : (Iterable) nz0Var.f.get()) {
                                                ebb ebbVar = (ebb) weakReference.get();
                                                if (ebbVar != null) {
                                                    ebbVar.onFailed(th);
                                                }
                                                weakReference.clear();
                                            }
                                            throw th;
                                        } catch (Throwable th2) {
                                            hbb.a(tsbVar);
                                            hbb.a(inputStreamQ0);
                                            hbb.a(closeable);
                                            hbb.c(file);
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    tsbVar = tsbVarF;
                                    th = th3;
                                    closeable = fileOutputStream;
                                }
                            } catch (Throwable th4) {
                                tsbVar = tsbVarF;
                                th = th4;
                                closeable = null;
                            }
                        } catch (Throwable th5) {
                            tsbVar = tsbVarF;
                            th = th5;
                            inputStreamQ0 = null;
                            closeable = inputStreamQ0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        tsbVar = null;
                        inputStreamQ0 = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    tsbVar = null;
                    inputStreamQ0 = null;
                    file = null;
                    closeable = null;
                }
                break;
            case 1:
                w41 w41Var = (w41) obj;
                w41Var.g.g();
                hn5 hn5Var = w41Var.a;
                synchronized (hn5Var.m) {
                    try {
                        hn5Var.h.m();
                        hn5Var.e.clear();
                    } catch (IOException | NullPointerException e) {
                        ghb ghbVar = hn5Var.j;
                        e.getMessage();
                        ghbVar.getClass();
                    }
                    fn5 fn5Var = hn5Var.k;
                    synchronized (fn5Var) {
                        fn5Var.a = false;
                        fn5Var.c = -1L;
                        fn5Var.b = -1L;
                    }
                    break;
                }
                return null;
            case 2:
                CidLogger cidLogger = (CidLogger) ((xp9) obj).b;
                try {
                    MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                    codecInfos.getClass();
                    for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                        try {
                            cidLogger.log("OKRTCCall", "codec=" + mediaCodecInfo.getName());
                        } catch (Exception e2) {
                            cidLogger.reportException("OKRTCCall", "codec.log", e2);
                        }
                    }
                } catch (Exception e3) {
                    cidLogger.reportException("OKRTCCall", "codec.log", e3);
                }
                return sbi.a;
            case 3:
                c cVar = (c) obj;
                g85 g85Var = cVar.g;
                NetworkDataRetriever networkDataRetriever = (NetworkDataRetriever) g85Var.b;
                DataId dataId = cVar.d;
                DataQuery.Builder builderNewBuilder = DataQuery.newBuilder();
                OmicronConfig omicronConfig = cVar.c;
                int i3 = zsb.b[networkDataRetriever.retrieve(dataId, builderNewBuilder.environment(omicronConfig.h).userId(omicronConfig.k).fingerprints(omicronConfig.e).build()).ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                    }
                    return data;
                }
                data = networkDataRetriever.getData();
                ((SerializationDataStorage) g85Var.a).putData(dataId, data);
                cVar.a.set(data);
                omicronConfig.f.onCacheUpdated(dataId);
                ((SharedPreferencesUpdateTimetable) g85Var.c).setUpdateDate(dataId, ((TimeProvider) g85Var.d).getCurrentDate());
                return data;
            case 4:
                EglBase eglBase = ((zzf) obj).l;
                if (eglBase != null) {
                    return eglBase.getEglBaseContext();
                }
                return null;
            case 5:
                return SupportedCodecsStatistics.tryToReport$lambda$0((xdd) obj);
            default:
                return ((TextureBufferImpl) obj).lambda$toI420$1();
        }
    }
}
