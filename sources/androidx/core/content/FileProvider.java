package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import defpackage.hs6;
import defpackage.np0;
import defpackage.ore;
import defpackage.qv1;
import defpackage.qxl;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    public static final String[] e = {"_display_name", "_size"};
    public static final File f = new File("/");
    public static final HashMap g = new HashMap();
    public final Object a;
    public final int b;
    public String c;
    public hs6 d;

    public FileProvider(int i) {
        this.a = new Object();
        this.b = i;
    }

    public static String a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    public static hs6 c(int i, Context context, String str) {
        hs6 hs6VarD;
        HashMap map = g;
        synchronized (map) {
            try {
                hs6VarD = (hs6) map.get(str);
                if (hs6VarD == null) {
                    try {
                        try {
                            hs6VarD = d(i, context, str);
                            map.put(str, hs6VarD);
                        } catch (XmlPullParserException e2) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                        }
                    } catch (IOException e3) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hs6VarD;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    public static hs6 d(int i, Context context, String str) throws XmlPullParserException, IOException {
        File externalStorageDirectory;
        hs6 hs6Var = new hs6(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, np0.m);
        if (providerInfoResolveContentProvider == null) {
            ore.p(qv1.k("Couldn't find meta-data for provider with authority ", str));
            return null;
        }
        if (providerInfoResolveContentProvider.metaData == null && i != 0) {
            Bundle bundle = new Bundle(1);
            providerInfoResolveContentProvider.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            ore.p("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            return null;
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return hs6Var;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, SdkMetricStatEvent.NAME_KEY);
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, ClientCookie.PATH_ATTR);
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    } else {
                        externalStorageDirectory = null;
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    } else {
                        externalStorageDirectory = null;
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrB = qxl.b(context);
                    if (fileArrB.length > 0) {
                        externalStorageDirectory = fileArrB[0];
                    } else {
                        externalStorageDirectory = null;
                    }
                } else {
                    externalStorageDirectory = null;
                }
                if (externalStorageDirectory != null) {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    hs6Var.a(externalStorageDirectory, attributeValue);
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority;
        if (str == null || str.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str2 = providerInfo.authority.split(";")[0];
        synchronized (this.a) {
            this.c = str2;
        }
        HashMap map = g;
        synchronized (map) {
            map.remove(str2);
        }
    }

    public final hs6 b() {
        hs6 hs6Var;
        synchronized (this.a) {
            try {
                if (this.c == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.d == null) {
                    this.d = c(this.b, getContext(), this.c);
                }
                hs6Var = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hs6Var;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File fileB = b().b(uri);
        int iLastIndexOf = fileB.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileB.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File fileB = b().b(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                ore.p(qv1.k("Invalid mode: ", str));
                return null;
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(fileB, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File fileB = b().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileB.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i2] = "_size";
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(fileB.length());
                }
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public FileProvider() {
        this(0);
    }
}
