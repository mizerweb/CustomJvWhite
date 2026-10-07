package ru.ok.android.onelog;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import com.fasterxml.jackson.core.JsonParseException;
import defpackage.ep4;
import defpackage.no;
import defpackage.np0;
import defpackage.p8e;
import defpackage.pt8;
import defpackage.qt4;
import defpackage.u21;
import defpackage.wu8;
import defpackage.yab;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.commons.app.ApplicationProvider;

/* JADX INFO: loaded from: classes3.dex */
final class Uploader {
    private static final int CORRUPTED_FILE_SAMPLE_BYTES = 512;
    private static final String FORM_FACTOR_PHONE = "phone";
    private static final String FORM_FACTOR_TABLET = "tablet";
    private static String applicationString;
    private static String platformString;
    private final Provider<File> file;
    private final Lock lock;

    public Uploader(Provider<File> provider, Lock lock) {
        this.file = provider;
        this.lock = lock;
    }

    private static void copyDebugSample(File file) {
    }

    private static void copyFile(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[np0.r];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i < 0) {
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    try {
                        fileInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            fileInputStream.close();
            throw th4;
        }
    }

    public static void execute(no noVar, Collection<OneLogItem> collection) throws IOException, ApiException {
        if (collection.isEmpty()) {
            return;
        }
        execute(noVar, new SimpleOneLogItemsApiValue(collection, OneLogTrigger.explicitUpload(collection.size())));
    }

    public static String getApplicationParam() throws PackageManager.NameNotFoundException {
        String str = applicationString;
        if (str != null) {
            return str;
        }
        Application application = ApplicationProvider.a;
        String str2 = yab.F().getPackageName() + ":" + yab.R() + ":" + yab.Q();
        applicationString = str2;
        return str2;
    }

    public static String getPlatformParam() {
        String str = platformString;
        if (str != null) {
            return str;
        }
        Application application = ApplicationProvider.a;
        StringBuilder sbV = qt4.v("android:", yab.F().getResources().getConfiguration().smallestScreenWidthDp < 600 ? FORM_FACTOR_PHONE : FORM_FACTOR_TABLET, ":");
        sbV.append(Build.VERSION.RELEASE);
        String string = sbV.toString();
        platformString = string;
        return string;
    }

    private static boolean isValidUploadFile(File file) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("[".getBytes(charset));
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream("]".getBytes(charset));
                    try {
                        SequenceInputStream sequenceInputStream = new SequenceInputStream(new SequenceInputStream(byteArrayInputStream, fileInputStream), byteArrayInputStream2);
                        try {
                            InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, charset);
                            try {
                                try {
                                    pt8 pt8Var = wu8.b;
                                    p8e p8eVar = new p8e(pt8Var.a(new ep4(true, inputStreamReader, pt8Var.h), false), pt8Var.d, inputStreamReader, pt8Var.a.c());
                                    new HashMap();
                                    wu8 wu8Var = new wu8(p8eVar);
                                    try {
                                        wu8Var.r();
                                        while (wu8Var.hasNext()) {
                                            wu8Var.x();
                                        }
                                        wu8Var.q();
                                        wu8Var.close();
                                        inputStreamReader.close();
                                        sequenceInputStream.close();
                                        byteArrayInputStream2.close();
                                        fileInputStream.close();
                                        byteArrayInputStream.close();
                                        return true;
                                    } catch (Throwable th) {
                                        try {
                                            wu8Var.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (JsonParseException e) {
                                    throw new JsonSyntaxException(e);
                                }
                            } catch (Throwable th3) {
                                try {
                                    inputStreamReader.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            try {
                                sequenceInputStream.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        try {
                            byteArrayInputStream2.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                } catch (Throwable th9) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th10) {
                        th9.addSuppressed(th10);
                    }
                    throw th9;
                }
            } catch (Throwable th11) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th12) {
                    th11.addSuppressed(th12);
                }
                throw th11;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    private static String readFirstBytes(File file, int i) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[Math.min(i, (int) Math.min(file.length(), i))];
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    fileInputStream.close();
                    return "";
                }
                String strSanitizeForLogging = sanitizeForLogging(new String(bArr, 0, i2, StandardCharsets.UTF_8));
                fileInputStream.close();
                return strSanitizeForLogging;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return "";
        }
        return "";
    }

    private static String sanitizeForLogging(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '{' || cCharAt == '}' || cCharAt == '[' || cCharAt == ']' || cCharAt == ',' || cCharAt == ':' || cCharAt == '\"' || cCharAt == ' ') {
                sb.append(cCharAt);
            } else if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t') {
                sb.append(' ');
            } else {
                sb.append('x');
            }
        }
        return sb.toString();
    }

    private static void uploadInParts(no noVar, File file, OneLogTrigger oneLogTrigger, long j) throws Throwable {
        List<File> listSplit = OneLogFileSplitter.split(file, j);
        if (listSplit == null || listSplit.isEmpty()) {
            String firstBytes = readFirstBytes(file, 512);
            file.length();
            OneLogDiagnostics.reportFileTooLargeDropped(file, j, firstBytes);
            copyDebugSample(file);
            Files.delete(file);
            return;
        }
        int i = 0;
        while (i < listSplit.size()) {
            try {
                File file2 = listSplit.get(i);
                try {
                    execute(noVar, new StreamingOneLogItemsApiValue(file2, i == listSplit.size() + (-1) ? oneLogTrigger : null));
                } catch (ApiInvocationException e) {
                    int errorCode = e.getErrorCode();
                    if (errorCode == 2 || errorCode == 453 || errorCode == 102 || errorCode == 103) {
                        throw e;
                    }
                    e.getErrorMessage();
                } catch (ApiRequestException e2) {
                    e2.getMessage();
                } catch (OneLogCorruptedFileException e3) {
                    e3.getCause();
                    OneLogDiagnostics.reportSerializationError(file2, e3.getCause());
                }
                Files.delete(file2);
                i++;
            } catch (Throwable th) {
                OneLogFileSplitter.deleteParts(listSplit);
                throw th;
            }
        }
        Files.delete(file);
        OneLogFileSplitter.deleteParts(listSplit);
    }

    private static void uploadSingle(no noVar, File file, OneLogTrigger oneLogTrigger) throws IOException, ApiException {
        try {
            execute(noVar, new StreamingOneLogItemsApiValue(file, oneLogTrigger));
        } catch (ApiInvocationException e) {
            int errorCode = e.getErrorCode();
            if (errorCode == 2 || errorCode == 453 || errorCode == 102 || errorCode == 103) {
                throw e;
            }
            e.getErrorMessage();
        } catch (ApiRequestException e2) {
            e2.getMessage();
        } catch (OneLogCorruptedFileException e3) {
            e3.getCause();
            OneLogDiagnostics.reportSerializationError(file, e3.getCause());
        }
        Files.delete(file);
    }

    public void drop() {
        File file = this.file.get();
        try {
            this.lock.lock();
            if (file.exists()) {
                FileLocks.Holder holderLock = FileLocks.lock(file);
                try {
                    Files.delete(file);
                    if (holderLock != null) {
                        holderLock.close();
                    }
                } catch (Throwable th) {
                    if (holderLock != null) {
                        try {
                            holderLock.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th3) {
            this.lock.unlock();
            throw th3;
        }
        this.lock.unlock();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[Catch: IOException | ApiException -> 0x0013, IOException | ApiException -> 0x0013, all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0008, B:7:0x0019, B:9:0x0023, B:12:0x0029, B:22:0x0057, B:42:0x008d, B:41:0x008a), top: B:46:0x0008 }] */
    public void upload(no noVar, OneLogTrigger oneLogTrigger) {
        File file = this.file.get();
        try {
            try {
                this.lock.lock();
                if (file.exists()) {
                    if (file.length() == 0) {
                        Files.delete(file);
                    } else {
                        FileLocks.Holder holderLock = FileLocks.lock(file);
                        try {
                            if (!file.exists() || file.length() == 0) {
                                if (file.exists()) {
                                    Files.delete(file);
                                }
                                if (holderLock != null) {
                                    holderLock.close();
                                }
                            } else if (isValidUploadFile(file)) {
                                long maxUploadFileSize = OneLogImpl.getInstance().getMaxUploadFileSize();
                                if (file.length() > maxUploadFileSize) {
                                    uploadInParts(noVar, file, oneLogTrigger, maxUploadFileSize);
                                } else {
                                    uploadSingle(noVar, file, oneLogTrigger);
                                }
                                if (holderLock != null) {
                                    holderLock.close();
                                }
                            } else {
                                String firstBytes = readFirstBytes(file, 512);
                                file.length();
                                OneLogDiagnostics.reportCorruptedFileDropped(file, null, firstBytes);
                                copyDebugSample(file);
                                Files.delete(file);
                                if (holderLock != null) {
                                    holderLock.close();
                                }
                            }
                        } catch (Throwable th) {
                            if (holderLock != null) {
                                try {
                                    holderLock.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                }
            } catch (IOException | ApiException unused) {
            }
            this.lock.unlock();
        } catch (Throwable th3) {
            this.lock.unlock();
            throw th3;
        }
    }

    public static void execute(no noVar, OneLogItem oneLogItem) throws IOException, ApiException {
        execute(noVar, Collections.singleton(oneLogItem));
    }

    private static void execute(no noVar, u21 u21Var) throws IOException, ApiException {
        noVar.a(new OneLogApiRequest(getApplicationParam(), getPlatformParam(), u21Var));
    }
}
