package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dql {
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0067->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    public static final Object a(List list, f9g f9gVar, nq4 nq4Var) throws Throwable {
        o25 o25Var;
        List list2;
        wfe wfeVar;
        Iterator it;
        Throwable th;
        cf7 cf7Var;
        if (nq4Var instanceof o25) {
            o25Var = (o25) nq4Var;
            int i = o25Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                o25Var.g = i - Integer.MIN_VALUE;
            } else {
                o25Var = new o25(nq4Var);
            }
        } else {
            o25Var = new o25(nq4Var);
        }
        Object obj = o25Var.f;
        int i2 = o25Var.g;
        lq4 lq4Var = null;
        Object obj2 = hu4.a;
        if (i2 != 0) {
            if (i2 == 1) {
                list2 = (List) o25Var.d;
                ch3.d0(obj);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = o25Var.e;
                wfeVar = (wfe) o25Var.d;
                try {
                    ch3.d0(obj);
                } catch (Throwable th2) {
                    Object obj3 = wfeVar.a;
                    if (obj3 == null) {
                        wfeVar.a = th2;
                    } else {
                        gm0.b((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                cf7Var = (cf7) it.next();
                o25Var.d = wfeVar;
                o25Var.e = it;
                o25Var.g = 2;
                if (cf7Var.invoke(o25Var) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) wfeVar.a;
            if (th == null) {
                return sbi.a;
            }
            throw th;
        }
        ch3.d0(obj);
        ArrayList arrayList = new ArrayList();
        t20 t20Var = new t20(list, arrayList, lq4Var, 12);
        o25Var.d = arrayList;
        o25Var.g = 1;
        if (f9gVar.a(t20Var, o25Var) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        wfeVar = new wfe();
        it = list2.iterator();
        while (it.hasNext()) {
            cf7Var = (cf7) it.next();
            o25Var.d = wfeVar;
            o25Var.e = it;
            o25Var.g = 2;
            if (cf7Var.invoke(o25Var) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) wfeVar.a;
        if (th == null) {
            return sbi.a;
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b A[Catch: all -> 0x0023, TryCatch #2 {all -> 0x0023, blocks: (B:3:0x0007, B:9:0x002b, B:11:0x003f, B:13:0x0047, B:17:0x0058, B:19:0x005e, B:21:0x0066, B:24:0x0076, B:28:0x008f, B:27:0x0081, B:14:0x004b, B:16:0x0051, B:8:0x0027), top: B:62:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[Catch: all -> 0x0023, TryCatch #2 {all -> 0x0023, blocks: (B:3:0x0007, B:9:0x002b, B:11:0x003f, B:13:0x0047, B:17:0x0058, B:19:0x005e, B:21:0x0066, B:24:0x0076, B:28:0x008f, B:27:0x0081, B:14:0x004b, B:16:0x0051, B:8:0x0027), top: B:62:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec A[Catch: Exception -> 0x00ef, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ef, blocks: (B:45:0x00e7, B:47:0x00ec), top: B:60:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8 A[Catch: Exception -> 0x00fb, FINALLY_INSNS, TRY_LEAVE, TryCatch #4 {Exception -> 0x00fb, blocks: (B:51:0x00f3, B:53:0x00f8), top: B:66:0x00f3 }] */
    public static Uri b(Uri uri, Context context, rs6 rs6Var) {
        InputStream inputStreamOpenInputStream;
        int i;
        FileOutputStream fileOutputStream = null;
        try {
            gm0.n("dql", "Uri is from FileProvider, need copy: " + uri);
            String type = context.getContentResolver().getType(uri);
            String lowerCase = type == null ? "application/octet-stream" : type.toLowerCase();
            StringBuilder sb = new StringBuilder();
            kp4 kp4VarF = l21.f(context, uri.toString(), ((ju6) rs6Var).b);
            if (kp4VarF != null) {
                String str = kp4VarF.b;
                if (ch3.s(str)) {
                    sb.append(str);
                } else if (uri.getLastPathSegment() != null) {
                    sb.append(uri.getLastPathSegment());
                }
            } else if (uri.getLastPathSegment() != null) {
                sb.append(uri.getLastPathSegment());
            }
            int iLastIndexOf = sb.lastIndexOf(".");
            String mimeTypeFromExtension = (iLastIndexOf <= 0 || (i = iLastIndexOf + 1) >= sb.length()) ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(sb.substring(i));
            if (mimeTypeFromExtension == null || !mimeTypeFromExtension.toLowerCase().equals(lowerCase)) {
                sb.append(".");
                sb.append(MimeTypeMap.getSingleton().getExtensionFromMimeType(lowerCase));
            }
            File fileT = ((ju6) rs6Var).t(sb.toString());
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileT);
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    oxl.e(inputStreamOpenInputStream, fileOutputStream2);
                    fileOutputStream2.close();
                    inputStreamOpenInputStream.close();
                    Uri uriFromFile = Uri.fromFile(fileT);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mime_type", lowerCase);
                    try {
                        try {
                            context.getContentResolver().update(uriFromFile, contentValues, null, null);
                        } catch (IllegalArgumentException unused) {
                            context.getContentResolver().insert(uriFromFile, contentValues);
                        }
                    } catch (IllegalArgumentException e) {
                        gm0.V("dql", "copyContentOfUri failed to copy mimetype", e);
                    }
                    try {
                        fileOutputStream2.close();
                        inputStreamOpenInputStream.close();
                    } catch (Exception unused2) {
                    }
                    return uriFromFile;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        gm0.V("dql", "handleSingleMediaIntent failed to copy FileProvider uri: ", th);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                if (inputStreamOpenInputStream != null) {
                                }
                            } catch (Exception unused3) {
                                return uri;
                            }
                        } else if (inputStreamOpenInputStream != null) {
                        }
                        return uri;
                    } finally {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                            } catch (Exception unused4) {
                            }
                        } else if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamOpenInputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    public static int c(Intent intent) {
        String type = intent.getType();
        if ((type != null ? z5h.K0(type, HTTP.PLAIN_TEXT_TYPE, true) : false) && intent.getParcelableExtra("android.intent.extra.STREAM") == null && intent.getParcelableArrayListExtra("android.intent.extra.STREAM") == null) {
            return 0;
        }
        if (type != null ? z5h.K0(type, "text/x-vcard", true) : false) {
            return 5;
        }
        if (type == null || type.length() == 0 || !z5h.K0(type, "image/", true) || r5h.L0(type, "djvu", true)) {
            return (type == null || type.length() == 0 || !z5h.K0(type, "video/", true)) ? 4 : 2;
        }
        return 1;
    }

    public static ArrayList d(Intent intent, Context context, ed6 ed6Var, rs6 rs6Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayListExtra != null) {
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                Uri uriQ = ju6.q((Parcelable) it.next());
                if (uriQ != null) {
                    String packageName = context.getPackageName();
                    if (dp4.a(uriQ, packageName)) {
                        gm0.W("dql", zo5.l(uriQ, "Blocked incoming multiple share with own content provider URI: "), new Object[0]);
                        if (ed6Var != null) {
                            ((t1c) ed6Var).a(new SecurityException(zo5.l(uriQ, "Multiple share with own content provider URI blocked: ")));
                        }
                    } else if (dp4.b(uriQ, packageName)) {
                        arrayList.add(uriQ);
                    } else if (!l21.k(context, uriQ)) {
                        if (rs6Var != null) {
                            uriQ = b(uriQ, context, rs6Var);
                        }
                        arrayList.add(uriQ);
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList e(Intent intent, Context context, ed6 ed6Var, rs6 rs6Var) {
        Uri uriQ;
        ArrayList arrayList = new ArrayList();
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
        if (parcelableExtra != null && (uriQ = ju6.q(parcelableExtra)) != null) {
            String packageName = context.getPackageName();
            if (dp4.a(uriQ, packageName)) {
                gm0.W("dql", zo5.l(uriQ, "Blocked incoming share with own content provider URI: "), new Object[0]);
                if (ed6Var != null) {
                    ((t1c) ed6Var).a(new SecurityException(zo5.l(uriQ, "Share with own content provider URI blocked: ")));
                    return arrayList;
                }
            } else {
                if (dp4.b(uriQ, packageName)) {
                    arrayList.add(uriQ);
                    return arrayList;
                }
                if (!l21.k(context, uriQ)) {
                    if (rs6Var != null) {
                        uriQ = b(uriQ, context, rs6Var);
                    }
                    arrayList.add(uriQ);
                }
            }
        }
        return arrayList;
    }
}
