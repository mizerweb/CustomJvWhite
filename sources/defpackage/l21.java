package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.system.Os;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l21 {
    public static final /* synthetic */ int a = 0;
    public static ScheduledExecutorService b;

    public static String a(String str) {
        if (ch3.r(str) || ".".equals(str) || "..".equals(str)) {
            return "(invalid)";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 0 && cCharAt <= 31) || cCharAt == '\"' || cCharAt == '*' || cCharAt == '/' || cCharAt == ':' || cCharAt == '<' || cCharAt == '\\' || cCharAt == '|' || cCharAt == 127 || cCharAt == '>' || cCharAt == '?') {
                sb.append('_');
            } else {
                sb.append(cCharAt);
            }
        }
        byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
        if (bytes.length > 255) {
            while (bytes.length > 252) {
                sb.deleteCharAt(sb.length() / 2);
                bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
            }
            sb.insert(sb.length() / 2, "...");
        }
        return sb.toString();
    }

    public static Object b(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(l21.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public static String c(Context context, rs6 rs6Var, String str, String str2) throws Throwable {
        String strSubstring;
        InputStream inputStreamOpenInputStream;
        int iY0;
        ?? r0 = 0;
        if (str2 == null || str2.length() == 0 || (iY0 = r5h.Y0(str2, '.', 0, 6)) < 0) {
            strSubstring = null;
        } else {
            strSubstring = str2.substring(iY0 + 1);
            if (MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring.toLowerCase(Locale.ROOT)) == null) {
                strSubstring = null;
            }
        }
        String strReplaceAll = ch3.r(str) ? null : str.replaceAll(":", "_").replaceAll("//", "_").replaceAll("/", "_");
        gm0.m("l21", "copyFromUri: generate file name from uri: uri = %s, generated name = %s", str, strReplaceAll);
        File fileP = ((ju6) rs6Var).p(strReplaceAll, strSubstring);
        gm0.m("l21", "copyFromUri fromUriString = %s, copy = %s", str, fileP.getAbsolutePath());
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.parse(str));
                try {
                    if (inputStreamOpenInputStream == null) {
                        gm0.s("l21", "copyFromUri: failed to open input stream for uri %s", str);
                        oxl.d(inputStreamOpenInputStream);
                        return null;
                    }
                    oxl.f(fileP, inputStreamOpenInputStream);
                    String absolutePath = fileP.getAbsolutePath();
                    oxl.d(inputStreamOpenInputStream);
                    return absolutePath;
                } catch (Exception e) {
                    e = e;
                    gm0.s("l21", "copyFromUri: failed to copy for uri %s, e: %s", str, e.toString());
                    if (fileP.exists()) {
                        fileP.delete();
                    }
                    oxl.d(inputStreamOpenInputStream);
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                inputStreamOpenInputStream = null;
            } catch (Throwable th) {
                th = th;
                oxl.d(r0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r0 = context;
            oxl.d(r0);
            throw th;
        }
    }

    public static bdj d(String str) {
        Object next;
        y1 y1Var = new y1(0, bdj.p);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (!((bdj) next).a.equals(str));
        bdj bdjVar = (bdj) next;
        return bdjVar == null ? bdj.URL : bdjVar;
    }

    public static ScheduledExecutorService e() {
        if (b == null) {
            b = Executors.newSingleThreadScheduledExecutor();
        }
        return b;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:113:0x0204 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:129:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0144 A[EXC_TOP_SPLITTER, PHI: r3
  0x0144: PHI (r3v10 ??) = (r3v25 ??), (r3v26 ??) binds: [B:70:0x0167, B:60:0x0142] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01c4 A[EXC_TOP_SPLITTER, PHI: r3
  0x01c4: PHI (r3v16 android.os.ParcelFileDescriptor) = (r3v15 android.os.ParcelFileDescriptor), (r3v18 android.os.ParcelFileDescriptor) binds: [B:106:0x01e1, B:98:0x01c2] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce A[Catch: all -> 0x00fb, Exception -> 0x0100, TRY_ENTER, TryCatch #10 {Exception -> 0x0100, blocks: (B:35:0x00ce, B:39:0x00e3, B:49:0x010e, B:51:0x0114, B:42:0x00f2, B:47:0x0103, B:56:0x012f, B:57:0x0137), top: B:139:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3 A[Catch: all -> 0x00fb, Exception -> 0x0100, TryCatch #10 {Exception -> 0x0100, blocks: (B:35:0x00ce, B:39:0x00e3, B:49:0x010e, B:51:0x0114, B:42:0x00f2, B:47:0x0103, B:56:0x012f, B:57:0x0137), top: B:139:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2 A[Catch: all -> 0x00fb, Exception -> 0x0100, TryCatch #10 {Exception -> 0x0100, blocks: (B:35:0x00ce, B:39:0x00e3, B:49:0x010e, B:51:0x0114, B:42:0x00f2, B:47:0x0103, B:56:0x012f, B:57:0x0137), top: B:139:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0103 A[Catch: all -> 0x00fb, Exception -> 0x0100, TryCatch #10 {Exception -> 0x0100, blocks: (B:35:0x00ce, B:39:0x00e3, B:49:0x010e, B:51:0x0114, B:42:0x00f2, B:47:0x0103, B:56:0x012f, B:57:0x0137), top: B:139:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:49:0x010e A[Catch: all -> 0x00fb, Exception -> 0x0100, TryCatch #10 {Exception -> 0x0100, blocks: (B:35:0x00ce, B:39:0x00e3, B:49:0x010e, B:51:0x0114, B:42:0x00f2, B:47:0x0103, B:56:0x012f, B:57:0x0137), top: B:139:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:56:0x012f A[Catch: all -> 0x00fb, Exception -> 0x0100, TRY_ENTER, TryCatch #10 {Exception -> 0x0100, blocks: (B:35:0x00ce, B:39:0x00e3, B:49:0x010e, B:51:0x0114, B:42:0x00f2, B:47:0x0103, B:56:0x012f, B:57:0x0137), top: B:139:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0137 A[Catch: all -> 0x00fb, Exception -> 0x0100, TRY_LEAVE, TryCatch #10 {Exception -> 0x0100, blocks: (B:35:0x00ce, B:39:0x00e3, B:49:0x010e, B:51:0x0114, B:42:0x00f2, B:47:0x0103, B:56:0x012f, B:57:0x0137), top: B:139:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0176 A[PHI: r3
  0x0176: PHI (r3v20 ??) = (r3v7 ??), (r3v9 ??), (r3v9 ??), (r3v10 ??), (r3v10 ??), (r3v11 ??), (r3v11 ??) binds: [B:32:0x00be, B:68:0x0161, B:70:0x0167, B:128:0x0176, B:61:0x0144, B:58:0x013c, B:60:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0179  */
    /* JADX WARN: Code duplicated, block: B:81:0x017f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x019b  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a9 A[Catch: all -> 0x0193, Exception -> 0x0198, TRY_LEAVE, TryCatch #4 {Exception -> 0x0198, blocks: (B:85:0x018e, B:91:0x019d, B:93:0x01a9, B:97:0x01bd), top: B:133:0x018e }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01bd A[Catch: all -> 0x0193, Exception -> 0x0198, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0198, blocks: (B:85:0x018e, B:91:0x019d, B:93:0x01a9, B:97:0x01bd), top: B:133:0x018e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19, types: [long] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    public static kp4 f(Context context, String str, is6 is6Var) throws Throwable {
        kp4 kp4Var;
        ?? StartsWith;
        Throwable th;
        Exception exc;
        int columnIndex;
        int columnIndex2;
        String type;
        String string;
        long j;
        kp4 kp4Var2;
        ?? r3;
        Throwable th2;
        Exception exc2;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        kp4 kp4Var3;
        long statSize;
        String type2;
        ?? r1 = 0;
        ?? r2 = 0;
        if (ch3.r(str)) {
            gm0.q("l21", "getContentUriParams: failed, uri is empty or null");
            return null;
        }
        StringBuilder sb = new StringBuilder("getContentUriParams: uri: ");
        sb.append(gm0.c() ? str : "*****");
        gm0.n("l21", sb.toString());
        try {
            Uri uri = Uri.parse(str);
            try {
                String strJ = j(context, uri, is6Var);
                if (ch3.r(strJ)) {
                    gm0.q("l21", "getContentUriParams: failed, cant get path to file from uri " + str);
                } else {
                    File file = new File(strJ);
                    if (rx8.w(file)) {
                        String name = file.getName();
                        String strI = i(name);
                        if (ch3.r(strI)) {
                            strI = context.getContentResolver().getType(uri);
                        }
                        q36 q36Var = new q36();
                        q36Var.a = file.length();
                        q36Var.b = name;
                        q36Var.c = strI;
                        q36Var.d = strJ;
                        kp4Var = new kp4(q36Var);
                    } else {
                        gm0.q("l21", "getContentUriParams: failed, file not found for uri " + str);
                    }
                    if (kp4Var != null) {
                        return kp4Var;
                    }
                    StartsWith = str.startsWith("content://");
                    try {
                        if (StartsWith != 0) {
                            try {
                                StartsWith = context.getContentResolver().query(uri, null, null, null, null);
                                try {
                                    if (StartsWith != 0) {
                                        columnIndex = StartsWith.getColumnIndex("_display_name");
                                        columnIndex2 = StartsWith.getColumnIndex("_size");
                                        if (StartsWith.moveToFirst()) {
                                            if (columnIndex != -1) {
                                                string = StartsWith.getString(columnIndex);
                                                type = i(string);
                                                if (!ch3.r(type)) {
                                                    type = context.getContentResolver().getType(uri);
                                                }
                                            } else {
                                                type = context.getContentResolver().getType(uri);
                                                string = null;
                                            }
                                            if (columnIndex2 != -1) {
                                                j = StartsWith.getLong(columnIndex2);
                                            } else {
                                                j = 0;
                                            }
                                            q36 q36Var2 = new q36();
                                            q36Var2.a = j;
                                            q36Var2.b = string;
                                            q36Var2.c = type;
                                            kp4 kp4Var4 = new kp4(q36Var2);
                                            if (!StartsWith.isClosed()) {
                                                try {
                                                    StartsWith.close();
                                                } catch (Exception unused) {
                                                }
                                            }
                                            kp4Var2 = kp4Var4;
                                            r3 = StartsWith;
                                        } else {
                                            gm0.q("l21", "getContentUriParams: moveToFirst failed for uri ".concat(str));
                                        }
                                    } else {
                                        gm0.q("l21", "getContentUriParams: failed with cursor, cursor is null");
                                    }
                                    if (StartsWith != 0 && !StartsWith.isClosed()) {
                                        try {
                                            StartsWith = StartsWith;
                                            StartsWith = StartsWith;
                                            StartsWith.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
                                } catch (Exception e) {
                                    exc = e;
                                    StartsWith = StartsWith;
                                    gm0.q("l21", "getContentUriParams: failed with cursor, e: " + exc.toString());
                                    if (StartsWith != 0 && !StartsWith.isClosed()) {
                                        StartsWith = StartsWith;
                                        StartsWith = StartsWith;
                                        StartsWith.close();
                                    }
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                StartsWith = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                if (r1 == 0 || r1.isClosed()) {
                                    throw th;
                                }
                                try {
                                    r1.close();
                                    throw th;
                                } catch (Exception unused3) {
                                    throw th;
                                }
                            }
                            StartsWith = StartsWith;
                            StartsWith = StartsWith;
                            kp4Var2 = null;
                            r3 = StartsWith;
                        } else {
                            StartsWith = StartsWith;
                            StartsWith = StartsWith;
                            kp4Var2 = null;
                            r3 = StartsWith;
                        }
                        if (kp4Var2 != null) {
                            r3 = kp4Var2.a;
                            if (r3 != 0) {
                                return kp4Var2;
                            }
                        }
                        try {
                            try {
                                parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                                if (parcelFileDescriptorOpenFileDescriptor != null) {
                                    try {
                                        statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                                    } catch (Exception e3) {
                                        exc2 = e3;
                                        gm0.q("l21", "getContentUriParams: failed with file descriptor, e: " + exc2.toString());
                                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                                            try {
                                                parcelFileDescriptorOpenFileDescriptor.close();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                    }
                                } else {
                                    statSize = -1;
                                }
                                type2 = context.getContentResolver().getType(uri);
                                if (statSize >= 0) {
                                    q36 q36Var3 = new q36();
                                    q36Var3.a = statSize;
                                    q36Var3.c = type2;
                                    kp4Var3 = new kp4(q36Var3);
                                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                                        try {
                                            parcelFileDescriptorOpenFileDescriptor.close();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                } else {
                                    gm0.q("l21", "getContentUriParams: failed, cant get size from parcelFileDescriptor");
                                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                                        parcelFileDescriptorOpenFileDescriptor.close();
                                    }
                                    kp4Var3 = null;
                                }
                            } catch (Exception e4) {
                                exc2 = e4;
                                parcelFileDescriptorOpenFileDescriptor = null;
                            } catch (Throwable th4) {
                                th2 = th4;
                                if (r2 != 0) {
                                    throw th2;
                                }
                                try {
                                    r2.close();
                                    throw th2;
                                } catch (IOException unused6) {
                                    throw th2;
                                }
                            }
                            if (kp4Var3 != null) {
                                return null;
                            }
                            if (kp4Var2 != null) {
                                return kp4Var3;
                            }
                            q36 q36Var4 = new q36();
                            q36Var4.b = kp4Var2.b;
                            q36Var4.d = kp4Var2.d;
                            q36Var4.a = kp4Var3.a;
                            q36Var4.c = kp4Var3.c;
                            return new kp4(q36Var4);
                        } catch (Throwable th5) {
                            th2 = th5;
                            r2 = r3;
                            if (r2 != 0) {
                                throw th2;
                            }
                            r2.close();
                            throw th2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r1 = StartsWith;
                    }
                }
            } catch (Exception e5) {
                gm0.q("l21", "getContentUriParams: failed with get path, e: " + e5.toString());
            }
            kp4Var = null;
            if (kp4Var != null) {
                return kp4Var;
            }
            StartsWith = str.startsWith("content://");
            if (StartsWith != 0) {
                StartsWith = context.getContentResolver().query(uri, null, null, null, null);
                if (StartsWith != 0) {
                    columnIndex = StartsWith.getColumnIndex("_display_name");
                    columnIndex2 = StartsWith.getColumnIndex("_size");
                    if (StartsWith.moveToFirst()) {
                        if (columnIndex != -1) {
                            string = StartsWith.getString(columnIndex);
                            type = i(string);
                            if (!ch3.r(type)) {
                                type = context.getContentResolver().getType(uri);
                            }
                        } else {
                            type = context.getContentResolver().getType(uri);
                            string = null;
                        }
                        if (columnIndex2 != -1) {
                            j = StartsWith.getLong(columnIndex2);
                        } else {
                            j = 0;
                        }
                        q36 q36Var5 = new q36();
                        q36Var5.a = j;
                        q36Var5.b = string;
                        q36Var5.c = type;
                        kp4 kp4Var5 = new kp4(q36Var5);
                        if (!StartsWith.isClosed()) {
                            StartsWith.close();
                        }
                        kp4Var2 = kp4Var5;
                        r3 = StartsWith;
                    } else {
                        gm0.q("l21", "getContentUriParams: moveToFirst failed for uri ".concat(str));
                    }
                } else {
                    gm0.q("l21", "getContentUriParams: failed with cursor, cursor is null");
                }
                if (StartsWith != 0) {
                    StartsWith = StartsWith;
                    StartsWith = StartsWith;
                    StartsWith.close();
                }
                StartsWith = StartsWith;
                StartsWith = StartsWith;
                kp4Var2 = null;
                r3 = StartsWith;
            } else {
                StartsWith = StartsWith;
                StartsWith = StartsWith;
                kp4Var2 = null;
                r3 = StartsWith;
            }
            if (kp4Var2 != null) {
                r3 = kp4Var2.a;
                if (r3 != 0) {
                    return kp4Var2;
                }
            }
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
            } else {
                statSize = -1;
            }
            type2 = context.getContentResolver().getType(uri);
            if (statSize >= 0) {
                q36 q36Var6 = new q36();
                q36Var6.a = statSize;
                q36Var6.c = type2;
                kp4Var3 = new kp4(q36Var6);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
            } else {
                gm0.q("l21", "getContentUriParams: failed, cant get size from parcelFileDescriptor");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                kp4Var3 = null;
            }
            if (kp4Var3 != null) {
                return null;
            }
            if (kp4Var2 != null) {
                return kp4Var3;
            }
            q36 q36Var7 = new q36();
            q36Var7.b = kp4Var2.b;
            q36Var7.d = kp4Var2.d;
            q36Var7.a = kp4Var3.a;
            q36Var7.c = kp4Var3.c;
            return new kp4(q36Var7);
        } catch (Exception unused7) {
            StringBuilder sb2 = new StringBuilder("getContentUriParams: failed to parse uri: ");
            if (!gm0.c()) {
                str = "*****";
            }
            sb2.append(str);
            gm0.q("l21", sb2.toString());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:? A[SYNTHETIC] */
    public static String g(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Uri uri2;
        Throwable th;
        Exception exc;
        Cursor cursorQuery;
        gm0.m("l21", "getDataColumn: uri = %s, selection = %s, selection args = %s", uri, str, Arrays.toString(strArr));
        Cursor cursor = null;
        try {
            try {
                uri2 = uri;
                try {
                    cursorQuery = context.getContentResolver().query(uri2, new String[]{"_data"}, str, strArr, null);
                    if (cursorQuery != null) {
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                    if (ch3.r(string)) {
                                        cursorQuery.close();
                                        return null;
                                    }
                                    if (string.startsWith("/")) {
                                        cursorQuery.close();
                                        return string;
                                    }
                                    if (!string.startsWith("file://")) {
                                        cursorQuery.close();
                                        return null;
                                    }
                                    String strReplace = string.replace("file://", "");
                                    cursorQuery.close();
                                    return strReplace;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    throw th;
                                }
                                cursor.close();
                                throw th;
                            }
                        } catch (Exception e) {
                            exc = e;
                            gm0.s("l21", "getDataColumn: error for uri = %s, e = %s", uri2, exc.toString());
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    cursorQuery = null;
                    gm0.s("l21", "getDataColumn: error for uri = %s, e = %s", uri2, exc.toString());
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                uri2 = uri;
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    public static String h(Uri uri) {
        String string = uri.toString();
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        int iIndexOf = string.indexOf(path);
        if (iIndexOf == -1) {
            String encodedPath = uri.getEncodedPath();
            iIndexOf = encodedPath != null ? string.indexOf(encodedPath) : -1;
        }
        if (iIndexOf != -1) {
            return string.substring(iIndexOf);
        }
        return null;
    }

    public static String i(String str) {
        String mimeTypeFromExtension = null;
        try {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                String strSubstring = str.substring(iLastIndexOf + 1);
                mimeTypeFromExtension = singleton.getMimeTypeFromExtension(strSubstring.toLowerCase());
                if (ch3.r(mimeTypeFromExtension) && !ch3.r(strSubstring)) {
                    return "application/".concat(strSubstring);
                }
            }
            return mimeTypeFromExtension;
        } catch (Exception e) {
            gm0.q("l21", "getMimeTypeFromFileName: failed, e: " + e.toString());
            return mimeTypeFromExtension;
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x01d3  */
    public static String j(Context context, Uri uri, is6 is6Var) {
        Exception exc;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        try {
            String string = uri.toString();
            try {
                String path = uri.getPath();
                if (ch3.r(path)) {
                    gm0.m("l21", "getPath: path from uri.getPath is empty, uri = %s", gm0.c() ? string : "*****");
                } else {
                    File file = new File(path);
                    if (file.exists()) {
                        StringBuilder sb = new StringBuilder("getPath: from file: ");
                        sb.append(gm0.c() ? string : "*****");
                        gm0.n("l21", sb.toString());
                        return file.getAbsolutePath();
                    }
                }
                File file2 = new File(uri.toString());
                if (file2.exists()) {
                    StringBuilder sb2 = new StringBuilder("getPath: from file: ");
                    sb2.append(gm0.c() ? string : "*****");
                    gm0.n("l21", sb2.toString());
                    return file2.getAbsolutePath();
                }
            } catch (Exception e) {
                vg vgVar = new vg("47701", "getPath: error check file exists", e);
                gm0.V("l21", vgVar.getMessage(), vgVar);
            }
            if (string.contains("com.google.android.apps.photos.contentprovider")) {
                try {
                    String str = string.split("/1/")[1];
                    int iIndexOf = str.indexOf("/ACTUAL");
                    if (iIndexOf != -1) {
                        String strSubstring = str.substring(0, iIndexOf);
                        Charset charset = StandardCharsets.UTF_8;
                        uri3 = Uri.parse(URLDecoder.decode(strSubstring, StandardCharsets.UTF_8));
                    } else {
                        uri3 = uri;
                    }
                    uri2 = uri3;
                } catch (Exception e2) {
                    gm0.V("l21", "getPath: error on get google photos uri", e2);
                    uri2 = uri;
                }
            } else {
                uri2 = uri;
            }
            try {
                if (DocumentsContract.isDocumentUri(context, uri2)) {
                    if ("com.android.externalstorage.documents".equals(uri2.getAuthority())) {
                        gm0.n("l21", "getPath: is external document: " + uri2);
                        String[] strArrSplit = DocumentsContract.getDocumentId(uri2).split(":");
                        if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                            return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                        }
                    } else {
                        if ("com.android.providers.downloads.documents".equals(uri2.getAuthority())) {
                            gm0.n("l21", "getPath: is download document: " + uri2);
                            String documentId = DocumentsContract.getDocumentId(uri2);
                            if (ch3.r(documentId) || !documentId.toLowerCase().startsWith("raw:")) {
                                return g(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                            }
                            String strSubstring2 = documentId.substring(4);
                            if (rx8.x(strSubstring2)) {
                                return strSubstring2;
                            }
                            return null;
                        }
                        if ("com.android.providers.media.documents".equals(uri2.getAuthority())) {
                            gm0.n("l21", "getPath: is media document: " + uri2);
                            String[] strArrSplit2 = DocumentsContract.getDocumentId(uri2).split(":");
                            String str2 = strArrSplit2[0];
                            int iHashCode = str2.hashCode();
                            if (iHashCode != 93166550) {
                                if (iHashCode != 100313435) {
                                    if (iHashCode == 112202875 && str2.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                        uri4 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                    } else {
                                        uri4 = null;
                                    }
                                } else if (str2.equals("image")) {
                                    uri4 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                } else {
                                    uri4 = null;
                                }
                            } else if (str2.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                uri4 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                            } else {
                                uri4 = null;
                            }
                            return g(context, uri4, "_id=?", new String[]{strArrSplit2[1]});
                        }
                    }
                } else {
                    if ("content".equalsIgnoreCase(uri2.getScheme())) {
                        String authority = uri2.getAuthority();
                        if (!ch3.r(authority) && authority.equalsIgnoreCase(is6Var.a)) {
                            gm0.n("l21", "getPath: from application content scheme: " + uri2);
                            String strA = yrk.a(uri2, Environment.getExternalStorageDirectory(), context.getFilesDir());
                            if (!ch3.r(strA)) {
                                return strA;
                            }
                        }
                        gm0.n("l21", "getPath: from content scheme: " + uri2);
                        return g(context, uri2, null, null);
                    }
                    if ("file".equalsIgnoreCase(uri2.getScheme())) {
                        String strH = h(uri2);
                        gm0.n("l21", "getPath: from file scheme: " + string + ", fullPath: " + strH);
                        return strH;
                    }
                }
            } catch (Exception e3) {
                exc = e3;
                gm0.s("l21", "getPath: error for uri %s, e: %s", uri2, exc.toString());
            }
        } catch (Exception e4) {
            exc = e4;
            uri2 = uri;
            gm0.s("l21", "getPath: error for uri %s, e: %s", uri2, exc.toString());
            return null;
        }
        return null;
    }

    public static boolean k(Context context, Uri uri) {
        String strP;
        String path = uri.getPath();
        boolean z = false;
        if (ch3.r(path)) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= 10) {
                path = null;
                break;
            }
            if (ch3.r(path)) {
                strP = path;
            } else {
                String[] strArrSplit = path.split("/");
                strP = strArrSplit.length > 0 ? strArrSplit[0] : "";
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    strP = zo5.p(strP, "/", strArrSplit[i2]);
                    try {
                        strP = Os.readlink(strP);
                    } catch (Exception unused) {
                    }
                }
            }
            if (path.equals(strP)) {
                break;
            }
            i++;
            path = strP;
        }
        if (path == null) {
            return true;
        }
        if (!ch3.r(path)) {
            try {
                String canonicalPath = new File(path).getCanonicalPath();
                if (canonicalPath != null) {
                    path = canonicalPath;
                }
            } catch (Exception unused2) {
                if (!ch3.r(path)) {
                    String strReplace = path.replace("/./", "/");
                    while (true) {
                        String strReplace2 = strReplace.replace("//", "/");
                        if (strReplace.equals(strReplace2)) {
                            break;
                        }
                        strReplace = strReplace2;
                    }
                    String[] strArrSplit2 = strReplace.split("/");
                    ArrayList arrayList = new ArrayList();
                    if (strArrSplit2.length > 0) {
                        arrayList.add(strArrSplit2[0]);
                    }
                    for (int i3 = 1; i3 < strArrSplit2.length; i3++) {
                        String str = strArrSplit2[i3];
                        if (!"..".equals(str) || arrayList.size() <= 0) {
                            arrayList.add(str);
                        } else {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    if (arrayList.size() > 0) {
                        sb.append((String) arrayList.get(0));
                    }
                    for (int i4 = 1; i4 < arrayList.size(); i4++) {
                        sb.append("/");
                        sb.append((String) arrayList.get(i4));
                    }
                    path = sb.toString();
                }
            }
        }
        if (!ch3.r(path)) {
            if (path.contains("/data/data/" + context.getPackageName()) || path.contains(context.getFilesDir().getParent())) {
                z = true;
            }
        }
        return z;
    }

    public static Uri l(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && !"file".equalsIgnoreCase(scheme)) {
            return null;
        }
        String strH = h(uri);
        File file = strH != null ? new File(strH) : null;
        if (file == null || !file.exists()) {
            return null;
        }
        return Uri.fromFile(file);
    }

    public static Uri m(String str) {
        if (ch3.r(str)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        Uri uriL = l(uri);
        return uriL != null ? uriL : uri;
    }
}
