package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class v0b {
    private static final bo7 a = new bo7("ModelUtils", "");

    public static abstract class a {
        public abstract String a();

        public abstract String b();

        public abstract String c();
    }

    public static abstract class b {
        public static b d(long j, String str, boolean z) {
            if (str == null) {
                str = "";
            }
            return new ci0(j, str, z);
        }

        public abstract String a();

        public abstract long b();

        public abstract boolean c();
    }

    private v0b() {
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098 A[Catch: all -> 0x00a1, IOException -> 0x00a3, TRY_ENTER, TryCatch #13 {IOException -> 0x00a3, all -> 0x00a1, blocks: (B:45:0x0098, B:51:0x00a7, B:52:0x00b2), top: B:98:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7 A[Catch: all -> 0x00a1, IOException -> 0x00a3, TryCatch #13 {IOException -> 0x00a3, all -> 0x00a1, blocks: (B:45:0x0098, B:51:0x00a7, B:52:0x00b2), top: B:98:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2 A[Catch: all -> 0x00a1, IOException -> 0x00a3, TRY_LEAVE, TryCatch #13 {IOException -> 0x00a3, all -> 0x00a1, blocks: (B:45:0x0098, B:51:0x00a7, B:52:0x00b2), top: B:98:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb A[Catch: all -> 0x00c4, IOException -> 0x00c6, TryCatch #1 {all -> 0x00c4, blocks: (B:54:0x00bf, B:61:0x00cb, B:62:0x00ce, B:72:0x00e9), top: B:98:0x0096 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public static b a(Context context, vb9 vb9Var) throws Throwable {
        long length;
        a0g a0gVar;
        String string;
        String strR;
        Throwable th;
        IOException e;
        InputStream inputStreamB;
        String strF;
        b bVarD;
        String strB = vb9Var.b();
        String strA = vb9Var.a();
        Uri uriC = vb9Var.c();
        ?? r5 = 0;
        if (strB == null) {
            if (strA != null) {
                if (!vb9Var.d() || (strA = e(context, strA, false)) != null) {
                    length = new File(strA).length();
                }
            } else {
                if (uriC == null) {
                    a.b("ModelUtils", "Local model doesn't have any valid path.");
                    return null;
                }
                try {
                    AssetFileDescriptor assetFileDescriptorA = lfl.a(context, uriC);
                    try {
                        length = assetFileDescriptorA.getLength();
                        assetFileDescriptorA.close();
                    } catch (Throwable th2) {
                        if (assetFileDescriptorA != null) {
                            try {
                                assetFileDescriptorA.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e2) {
                    a.c("ModelUtils", "Failed to open model file", e2);
                    return null;
                }
            }
            a0gVar = (a0g) j0b.c().a(a0g.class);
            if (strB != null) {
                string = strB;
            } else if (strA != null) {
                string = strA;
            } else {
                yab.s(uriC);
                string = uriC.toString();
            }
            strR = a0gVar.r(string, length);
            if (strR != null) {
                return b.d(length, strR, vb9Var.d());
            }
            if (strB != null) {
                inputStreamB = context.getAssets().open(strB);
            } else if (strA != null) {
                inputStreamB = new FileInputStream(new File(strA));
            } else {
                yab.s(uriC);
                String[] strArr = lfl.a;
                inputStreamB = lfl.b(context, uriC, ccl.c);
            }
            if (inputStreamB != null) {
                strF = f(inputStreamB);
            } else {
                strF = null;
            }
            if (strF != null) {
                a0gVar.s(string, length, strF);
            }
            bVarD = b.d(length, strF, vb9Var.d());
            if (inputStreamB != null) {
                inputStreamB.close();
                return bVarD;
            }
            return bVarD;
        }
        if (!vb9Var.d() || (strB = e(context, strB, true)) != null) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(strB);
                try {
                    length = assetFileDescriptorOpenFd.getLength();
                    assetFileDescriptorOpenFd.close();
                    a0gVar = (a0g) j0b.c().a(a0g.class);
                    if (strB != null) {
                        string = strB;
                    } else if (strA != null) {
                        string = strA;
                    } else {
                        yab.s(uriC);
                        string = uriC.toString();
                    }
                    strR = a0gVar.r(string, length);
                    if (strR != null) {
                        return b.d(length, strR, vb9Var.d());
                    }
                    try {
                        try {
                            if (strB != null) {
                                inputStreamB = context.getAssets().open(strB);
                            } else if (strA != null) {
                                inputStreamB = new FileInputStream(new File(strA));
                            } else {
                                yab.s(uriC);
                                String[] strArr2 = lfl.a;
                                inputStreamB = lfl.b(context, uriC, ccl.c);
                            }
                            if (inputStreamB != null) {
                                try {
                                    strF = f(inputStreamB);
                                } catch (IOException e3) {
                                    e = e3;
                                    a.c("ModelUtils", "Failed to open model file", e);
                                    if (inputStreamB != null) {
                                        try {
                                            inputStreamB.close();
                                        } catch (IOException e4) {
                                            a.c("ModelUtils", "Failed to close model file", e4);
                                        }
                                    }
                                    return null;
                                }
                            } else {
                                strF = null;
                            }
                            if (strF != null) {
                                a0gVar.s(string, length, strF);
                            }
                            bVarD = b.d(length, strF, vb9Var.d());
                            if (inputStreamB != null) {
                                try {
                                    inputStreamB.close();
                                    return bVarD;
                                } catch (IOException e5) {
                                    a.c("ModelUtils", "Failed to close model file", e5);
                                }
                            }
                            return bVarD;
                        } catch (IOException e6) {
                            e = e6;
                            inputStreamB = null;
                        } catch (Throwable th4) {
                            th = th4;
                            if (r5 != 0) {
                                try {
                                    r5.close();
                                } catch (IOException e7) {
                                    a.c("ModelUtils", "Failed to close model file", e7);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r5 = context;
                        if (r5 != 0) {
                            r5.close();
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                    }
                    throw th6;
                }
            } catch (IOException e8) {
                a.c("ModelUtils", "Failed to open model file", e8);
                return null;
            }
        }
        return null;
    }

    public static String b(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                String strF = f(fileInputStream);
                fileInputStream.close();
                return strF;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            a.b("ModelUtils", "Failed to create FileInputStream for model: ".concat(e.toString()));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (new java.io.File(r6).exists() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v0b.a c(java.lang.String r6, boolean r7, android.content.Context r8) {
        /*
            java.lang.String r0 = "Json string from the manifest file: "
            java.lang.String r1 = java.lang.String.valueOf(r6)
            bo7 r2 = defpackage.v0b.a
            java.lang.String r3 = "Manifest file path: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.String r3 = "ModelUtils"
            r2.a(r3, r1)
            r1 = 0
            if (r7 == 0) goto L24
            android.content.res.AssetManager r4 = r8.getAssets()     // Catch: java.io.IOException -> L2f
            java.io.InputStream r4 = r4.open(r6)     // Catch: java.io.IOException -> L2f
            if (r4 == 0) goto L37
            r4.close()     // Catch: java.io.IOException -> L2f
            goto L37
        L24:
            java.io.File r4 = new java.io.File
            r4.<init>(r6)
            boolean r4 = r4.exists()
            if (r4 != 0) goto L37
        L2f:
            bo7 r6 = defpackage.v0b.a
            java.lang.String r7 = "Manifest file does not exist."
            r6.b(r3, r7)
            return r1
        L37:
            boolean r4 = r6.isEmpty()     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r5 = 0
            if (r4 == 0) goto L45
            byte[] r6 = new byte[r5]     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            goto L68
        L41:
            r6 = move-exception
            goto L9f
        L43:
            r6 = move-exception
            goto L9f
        L45:
            if (r7 == 0) goto L50
            android.content.res.AssetManager r7 = r8.getAssets()     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.io.InputStream r6 = r7.open(r6)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            goto L5b
        L50:
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.io.File r8 = new java.io.File     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r8.<init>(r6)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r7.<init>(r8)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r6 = r7
        L5b:
            int r7 = r6.available()     // Catch: java.lang.Throwable -> L93
            byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> L93
            r6.read(r8, r5, r7)     // Catch: java.lang.Throwable -> L93
            r6.close()     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r6 = r8
        L68:
            java.lang.String r7 = new java.lang.String     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.lang.String r8 = "UTF-8"
            r7.<init>(r6, r8)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.lang.String r6 = r0.concat(r7)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r2.a(r3, r6)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r6.<init>(r7)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.lang.String r7 = "modelType"
            java.lang.String r7 = r6.getString(r7)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.lang.String r8 = "modelFile"
            java.lang.String r8 = r6.getString(r8)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.lang.String r0 = "labelsFile"
            java.lang.String r6 = r6.getString(r0)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            bi0 r0 = new bi0     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r0.<init>(r7, r8, r6)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            return r0
        L93:
            r7 = move-exception
            if (r6 == 0) goto L9e
            r6.close()     // Catch: java.lang.Throwable -> L9a
            goto L9e
        L9a:
            r6 = move-exception
            r7.addSuppressed(r6)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
        L9e:
            throw r7     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
        L9f:
            bo7 r7 = defpackage.v0b.a
            java.lang.String r8 = "Error parsing the manifest file."
            r7.c(r3, r8, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v0b.c(java.lang.String, boolean, android.content.Context):v0b$a");
    }

    public static boolean d(File file, String str) {
        String strB = b(file);
        a.a("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(strB)));
        return str.equals(strB);
    }

    private static String e(Context context, String str, boolean z) {
        a aVarC = c(str, z, context);
        if (aVarC != null) {
            return new File(new File(str).getParent(), aVarC.b()).toString();
        }
        a.b("ModelUtils", "Failed to parse manifest file.");
        return null;
    }

    private static String f(InputStream inputStream) {
        int i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (IOException unused) {
            a.b("ModelUtils", "Failed to read model file");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            a.b("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        }
    }
}
