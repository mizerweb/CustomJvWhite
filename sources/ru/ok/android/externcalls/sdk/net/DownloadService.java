package ru.ok.android.externcalls.sdk.net;

import android.util.Patterns;
import defpackage.b8g;
import defpackage.c;
import defpackage.c0a;
import defpackage.f8g;
import defpackage.i3f;
import defpackage.iu6;
import defpackage.j95;
import defpackage.p64;
import defpackage.po;
import defpackage.qr7;
import defpackage.qv1;
import defpackage.sbi;
import defpackage.tre;
import defpackage.v7g;
import defpackage.wki;
import defpackage.y3e;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.io.FileAlreadyExistsException;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.android.externcalls.sdk.net.internal.DownloadResult;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\fJ1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/net/DownloadService;", "", "", MLFeatureConfigProviderBase.URL_KEY, "Ljava/io/File;", "dest", "Lru/ok/android/externcalls/sdk/net/FileValidationConfig;", "fileValidationConfig", "Lv7g;", "Lru/ok/android/externcalls/sdk/net/internal/DownloadResult;", "download", "(Ljava/lang/String;Ljava/io/File;Lru/ok/android/externcalls/sdk/net/FileValidationConfig;)Lv7g;", "Impl", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface DownloadService {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ v7g download$default(DownloadService downloadService, String str, File file, FileValidationConfig fileValidationConfig, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: download");
            return null;
        }
        if ((i & 4) != 0) {
            fileValidationConfig = null;
        }
        return downloadService.download(str, file, fileValidationConfig);
    }

    v7g download(String str, File dest, FileValidationConfig fileValidationConfig);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/net/DownloadService$Impl;", "Lru/ok/android/externcalls/sdk/net/DownloadService;", "Ly3e;", "logger", "<init>", "(Ly3e;)V", "", MLFeatureConfigProviderBase.URL_KEY, "Ljava/io/File;", "destination", "Ljava/security/MessageDigest;", "md", "Lsbi;", "downloadInner", "(Ljava/lang/String;Ljava/io/File;Ljava/security/MessageDigest;)V", "dest", "Lru/ok/android/externcalls/sdk/net/FileValidationConfig;", "fileValidationConfig", "Lv7g;", "Lru/ok/android/externcalls/sdk/net/internal/DownloadResult;", "download", "(Ljava/lang/String;Ljava/io/File;Lru/ok/android/externcalls/sdk/net/FileValidationConfig;)Lv7g;", "Ly3e;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Impl implements DownloadService {
        private static final Companion Companion = new Companion(null);

        @Deprecated
        public static final String LOG_TAG = "DownloadService.Impl";
        private final y3e logger;

        public Impl(y3e y3eVar) {
            this.logger = y3eVar;
        }

        /* JADX WARN: Code duplicated, block: B:66:0x014d  */
        /* JADX WARN: Code duplicated, block: B:88:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        public static final void download$lambda$0(String str, File file, FileValidationConfig fileValidationConfig, Impl impl, f8g f8gVar) throws Throwable {
            String str2;
            File file2;
            Impl impl2;
            Exception exc;
            b8g b8gVar;
            long jCurrentTimeMillis;
            try {
                try {
                    if (!Patterns.WEB_URL.matcher(str).matches()) {
                        throw new IllegalArgumentException("Url is invalid " + str);
                    }
                    try {
                        if (file.exists()) {
                            b8g b8gVar2 = (b8g) f8gVar;
                            if (b8gVar2.b()) {
                                return;
                            }
                            FileAlreadyExistsException fileAlreadyExistsException = new FileAlreadyExistsException(file, null, null);
                            if (b8gVar2.d(fileAlreadyExistsException)) {
                                return;
                            }
                            tre.s0(fileAlreadyExistsException);
                            return;
                        }
                        try {
                            File parentFile = file.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.exists()) {
                                    qr7.k(qv1.k("Can not create directories for ", file.getAbsolutePath()));
                                }
                            } else {
                                try {
                                    qr7.k(c0a.o("File ", file.getAbsolutePath(), " does not have a parent"));
                                } catch (Exception e) {
                                    e = e;
                                    str2 = str;
                                    file2 = file;
                                    impl2 = impl;
                                    exc = e;
                                    y3e y3eVar = impl2.logger;
                                    StringBuilder sbQ = qv1.q("Exception during file downloading. url ", str2, ", destination ", file2.getAbsolutePath(), ". ");
                                    sbQ.append(exc);
                                    y3eVar.log(LOG_TAG, sbQ.toString());
                                    iu6.b(file2);
                                    b8gVar = (b8g) f8gVar;
                                    if (b8gVar.b()) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            if (fileValidationConfig == null) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                str2 = str;
                                file2 = file;
                                impl2 = impl;
                                downloadInner$default(impl2, str2, file2, null, 4, null);
                                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                            } else {
                                str2 = str;
                                file2 = file;
                                impl2 = impl;
                                MessageDigest messageDigest = MessageDigest.getInstance(fileValidationConfig.getHashAlgorithm().a);
                                long jCurrentTimeMillis3 = System.currentTimeMillis();
                                impl2.downloadInner(str2, file2, messageDigest);
                                long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
                                try {
                                    messageDigest.getClass();
                                    try {
                                        byte[] bArrDigest = messageDigest.digest();
                                        bArrDigest.getClass();
                                        StringBuilder sb = new StringBuilder();
                                        for (byte b : bArrDigest) {
                                            sb.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
                                        }
                                        if (!sb.toString().equals(fileValidationConfig.getExpectedChecksum())) {
                                            throw new RuntimeException("Downloaded model is corrupted");
                                        }
                                        jCurrentTimeMillis = jCurrentTimeMillis4;
                                    } catch (Exception e2) {
                                        e = e2;
                                        exc = e;
                                        y3e y3eVar2 = impl2.logger;
                                        StringBuilder sbQ2 = qv1.q("Exception during file downloading. url ", str2, ", destination ", file2.getAbsolutePath(), ". ");
                                        sbQ2.append(exc);
                                        y3eVar2.log(LOG_TAG, sbQ2.toString());
                                        iu6.b(file2);
                                        b8gVar = (b8g) f8gVar;
                                        if (b8gVar.b()) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            }
                            b8g b8gVar3 = (b8g) f8gVar;
                            if (b8gVar3.b()) {
                                return;
                            }
                            b8gVar3.a(new DownloadResult(file2, jCurrentTimeMillis));
                            return;
                        } catch (Exception e4) {
                            e = e4;
                            str2 = str;
                            file2 = file;
                            impl2 = impl;
                        }
                    } catch (Exception e5) {
                        exc = e5;
                        str2 = str;
                        file2 = file;
                        impl2 = impl;
                    }
                } catch (Exception e6) {
                    e = e6;
                    exc = e;
                }
            } catch (Exception e7) {
                e = e7;
                str2 = str;
                file2 = file;
                impl2 = impl;
            }
            exc = e;
            y3e y3eVar3 = impl2.logger;
            StringBuilder sbQ3 = qv1.q("Exception during file downloading. url ", str2, ", destination ", file2.getAbsolutePath(), ". ");
            sbQ3.append(exc);
            y3eVar3.log(LOG_TAG, sbQ3.toString());
            try {
                iu6.b(file2);
            } catch (Exception e8) {
                download$lambda$0$3(impl2, qv1.k("Exception during file deleting: ", e8.getMessage()));
            }
            b8gVar = (b8g) f8gVar;
            if (b8gVar.b() || b8gVar.d(exc)) {
                return;
            }
            tre.s0(exc);
        }

        private static final sbi download$lambda$0$3(Impl impl, String str) {
            impl.logger.log(LOG_TAG, str);
            return sbi.a;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0061  */
        /* JADX WARN: Code duplicated, block: B:40:0x006f  */
        /* JADX WARN: Code duplicated, block: B:42:0x0074  */
        /* JADX WARN: Code duplicated, block: B:48:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:63:0x0068 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        private final void downloadInner(String str, File destination, MessageDigest md) throws Throwable {
            URLConnection uRLConnectionOpenConnection;
            InputStream inputStream;
            Closeable fileOutputStream;
            Closeable[] closeableArr;
            HttpURLConnection httpURLConnection;
            Closeable closeable;
            wki wkiVar = md != null ? new wki(1, md) : null;
            int i = 0;
            try {
                uRLConnectionOpenConnection = new URL(str).openConnection();
                try {
                    inputStream = uRLConnectionOpenConnection.getInputStream();
                    try {
                        fileOutputStream = new FileOutputStream(destination);
                        try {
                            iu6.h(inputStream, fileOutputStream, wkiVar);
                            Closeable[] closeableArr2 = {inputStream, fileOutputStream, wkiVar};
                            while (i < 3) {
                                Closeable closeable2 = closeableArr2[i];
                                if (closeable2 != null) {
                                    try {
                                        closeable2.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                i++;
                            }
                            httpURLConnection = uRLConnectionOpenConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnectionOpenConnection : null;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } catch (Throwable th) {
                            th = th;
                            closeableArr = new Closeable[]{inputStream, fileOutputStream, wkiVar};
                            while (i < 3) {
                                closeable = closeableArr[i];
                                if (closeable != null) {
                                    try {
                                        closeable.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                i++;
                            }
                            httpURLConnection = uRLConnectionOpenConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnectionOpenConnection : null;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                    fileOutputStream = inputStream;
                    closeableArr = new Closeable[]{inputStream, fileOutputStream, wkiVar};
                    while (i < 3) {
                        closeable = closeableArr[i];
                        if (closeable != null) {
                            closeable.close();
                        }
                        i++;
                    }
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                uRLConnectionOpenConnection = null;
                inputStream = null;
            }
        }

        public static /* synthetic */ void downloadInner$default(Impl impl, String str, File file, MessageDigest messageDigest, int i, Object obj) throws Throwable {
            if ((i & 4) != 0) {
                messageDigest = null;
            }
            impl.downloadInner(str, file, messageDigest);
        }

        @Override // ru.ok.android.externcalls.sdk.net.DownloadService
        public v7g download(String str, File dest, FileValidationConfig fileValidationConfig) {
            return new p64(2, new po(str, dest, fileValidationConfig, this)).j(i3f.b());
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/net/DownloadService$Impl$Companion;", "", "<init>", "()V", "LOG_TAG", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j95 j95Var) {
                this();
            }

            private Companion() {
            }
        }
    }
}
