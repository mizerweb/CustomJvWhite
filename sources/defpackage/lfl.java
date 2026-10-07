package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lfl {
    public static final String[] a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    public static final String[] b;
    public static final String[] c;

    static {
        String str = Build.HARDWARE;
        b = new String[]{"media", (str.equals("goldfish") || str.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        c = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static AssetFileDescriptor a(Context context, Uri uri) throws FileNotFoundException {
        ccl cclVar = ccl.c;
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT < 30) {
            uri = Uri.parse(uri.toString());
        }
        String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(uri, "r");
        }
        if ("content".equals(scheme)) {
            if (!e(context, uri, cclVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                return assetFileDescriptorOpenAssetFileDescriptor;
            }
            throw new FileNotFoundException("Content resolver returned null value.");
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor2 == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
        try {
            d(context, assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor(), uri, cclVar);
            return assetFileDescriptorOpenAssetFileDescriptor2;
        } catch (FileNotFoundException e) {
            try {
                assetFileDescriptorOpenAssetFileDescriptor2.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        } catch (IOException e3) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e3);
            try {
                assetFileDescriptorOpenAssetFileDescriptor2.close();
                throw fileNotFoundException;
            } catch (IOException e4) {
                fileNotFoundException.addSuppressed(e4);
                throw fileNotFoundException;
            }
        }
    }

    public static InputStream b(Context context, Uri uri, ccl cclVar) throws FileNotFoundException {
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT < 30) {
            uri = Uri.parse(uri.toString());
        }
        String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(uri);
        }
        if ("content".equals(scheme)) {
            if (!e(context, uri, cclVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                return inputStreamOpenInputStream;
            }
            throw new FileNotFoundException("Content resolver returned null value.");
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(uri.getPath()).getCanonicalFile()), "r");
            try {
                d(context, parcelFileDescriptorOpenFileDescriptor, uri, cclVar);
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
            } catch (FileNotFoundException e) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e3);
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw fileNotFoundException;
                } catch (IOException e4) {
                    fileNotFoundException.addSuppressed(e4);
                    throw fileNotFoundException;
                }
            }
        } catch (IOException e5) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e5);
            throw fileNotFoundException2;
        }
    }

    public static String c(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    public static void d(Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, ccl cclVar) throws IOException {
        File dataDir;
        String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        try {
            StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat structStatLstat = Os.lstat(canonicalPath);
                if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
                }
                if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
                }
                if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
                    ccl cclVar2 = ccl.c;
                    cclVar.getClass();
                    File dataDir2 = context.getDataDir();
                    boolean z = true;
                    if (dataDir2 == null ? !canonicalPath.startsWith(c(Environment.getDataDirectory())) : !canonicalPath.startsWith(c(dataDir2))) {
                        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                        if (contextCreateDeviceProtectedStorageContext == null || (dataDir = contextCreateDeviceProtectedStorageContext.getDataDir()) == null || !canonicalPath.startsWith(c(dataDir))) {
                            try {
                                File[] externalFilesDirs = context.getExternalFilesDirs(null);
                                int length = externalFilesDirs.length;
                                int i = 0;
                                while (true) {
                                    if (i < length) {
                                        File file = externalFilesDirs[i];
                                        if (file != null && canonicalPath.startsWith(c(file))) {
                                            break;
                                        } else {
                                            i++;
                                        }
                                    } else {
                                        try {
                                            File[] externalCacheDirs = context.getExternalCacheDirs();
                                            int length2 = externalCacheDirs.length;
                                            int i2 = 0;
                                            while (true) {
                                                if (i2 < length2) {
                                                    File file2 = externalCacheDirs[i2];
                                                    if (file2 != null && canonicalPath.startsWith(c(file2))) {
                                                        break;
                                                    } else {
                                                        i2++;
                                                    }
                                                } else {
                                                    z = false;
                                                    break;
                                                }
                                            }
                                        } catch (NullPointerException e) {
                                            throw e;
                                        } catch (Exception e2) {
                                            qr7.o(e2);
                                            return;
                                        }
                                    }
                                }
                            } catch (NullPointerException e3) {
                                throw e3;
                            } catch (Exception e4) {
                                qr7.o(e4);
                                return;
                            }
                        }
                    }
                    if (z == cclVar.a) {
                        return;
                    }
                }
                throw new FileNotFoundException("Can't open file: ".concat(canonicalPath));
            } catch (ErrnoException e5) {
                throw new IOException(e5);
            }
        } catch (ErrnoException e6) {
            throw new IOException(e6);
        }
    }

    public static boolean e(Context context, Uri uri, ccl cclVar) {
        int i;
        String authority = uri.getAuthority();
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (providerInfoResolveContentProvider == null) {
            int iLastIndexOf = authority.lastIndexOf(64);
            if (iLastIndexOf >= 0) {
                authority = authority.substring(iLastIndexOf + 1);
                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (providerInfoResolveContentProvider == null) {
                return !cclVar.a;
            }
        }
        jnk jnkVar = cclVar.b;
        int size = jnkVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = 3;
                break;
            }
            ((gxk) jnkVar.get(i2)).getClass();
            i2++;
            if (((uri.getAuthority().lastIndexOf(64) < 0 || np4.d(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2) - 1 == 1) {
                i = 2;
                break;
            }
        }
        if (i - 1 != 1) {
            boolean zEquals = context.getPackageName().equals(providerInfoResolveContentProvider.packageName);
            boolean z = cclVar.a;
            if (zEquals) {
                return z;
            }
            if (!z) {
                if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && providerInfoResolveContentProvider.exported) {
                    String[] strArr = b;
                    int length = strArr.length;
                    for (int i3 = 0; i3 < 2; i3++) {
                        if (!strArr[i3].equals(authority)) {
                        }
                    }
                    String[] strArr2 = c;
                    int length2 = strArr2.length;
                    for (int i4 = 0; i4 < 3; i4++) {
                        if (!strArr2[i4].equals(authority)) {
                        }
                    }
                    for (int i5 = 0; i5 < 6; i5++) {
                        String str = a[i5];
                        char cCharAt = str.charAt(str.length() - 1);
                        String str2 = providerInfoResolveContentProvider.packageName;
                        if (cCharAt == '.') {
                            if (!str2.startsWith(str)) {
                            }
                        } else if (!str2.equals(str)) {
                        }
                    }
                }
            }
        }
    }
}
