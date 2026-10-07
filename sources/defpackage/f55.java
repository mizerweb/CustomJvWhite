package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.UTFDataFormatException;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import one.me.android.initialization.AccountInitializer;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class f55 {
    public static ExecutorService b;
    public static final Object a = new Object();
    public static final ste c = new ste("PERFORMANCE_METRICS", 2);
    public static final i68 d = new i68("THUMBHASH", ".thumbhash");

    public static rqe A(vy2 vy2Var, int i) {
        return new rqe(vy2Var.a, vy2Var.b, i, vy2Var.d, vy2Var.g, false, pm9.r(vy2Var.i.e()), new km9(vy2Var.k), vy2Var.l.e(), vy2Var.h, vy2Var.c, ww3.T1(vy2Var.f), vy2Var.j, vy2Var.m);
    }

    public static final String B(lq4 lq4Var) {
        Object poeVar;
        if (lq4Var instanceof sn5) {
            return ((sn5) lq4Var).toString();
        }
        try {
            poeVar = lq4Var + '@' + n(lq4Var);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (roe.a(poeVar) != null) {
            poeVar = lq4Var.getClass().getName() + '@' + n(lq4Var);
        }
        return (String) poeVar;
    }

    public static r17 C(rqe rqeVar, o4c o4cVar, Set set, int i) {
        int i2 = i & 2;
        c76 c76Var = c76.a;
        Set set2 = i2 != 0 ? c76Var : set;
        List list = rqeVar.g;
        String str = rqeVar.a;
        CharSequence charSequenceA = o4cVar.a(rqeVar.b, list, 2, false, 0, true, false);
        int i3 = rqeVar.c;
        Set set3 = rqeVar.e;
        r66 r66Var = r66.a;
        List list2 = list == null ? r66Var : list;
        Map map = rqeVar.h;
        if (map == null) {
            map = s66.a;
        }
        Map map2 = map;
        List list3 = rqeVar.i;
        List list4 = list3 == null ? r66Var : list3;
        Set set4 = rqeVar.j;
        Set set5 = set4 == null ? c76Var : set4;
        List list5 = rqeVar.l;
        return new r17(str, charSequenceA, i3, set3, set2, list2, map2, list4, set5, list5 != null ? new LinkedHashSet(list5) : new LinkedHashSet(), rqeVar.k, rqeVar.m, rqeVar.n, rqeVar.f, rqeVar.d, c76Var, c76Var);
    }

    public static final JSONArray D(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object objE : list) {
            if (objE instanceof List) {
                objE = D((List) objE);
            } else if (objE instanceof Map) {
                objE = E((Map) objE);
            }
            jSONArray.put(objE);
        }
        return jSONArray;
    }

    public static final JSONObject E(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                value = D((List) value);
            } else if (value instanceof Map) {
                value = E((Map) value);
            }
            jSONObject.putOpt(String.valueOf(key), value);
        }
        return jSONObject;
    }

    public static final ArrayList F(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objG = jSONArray.get(i);
            if (objG instanceof JSONArray) {
                objG = F((JSONArray) objG);
            } else if (objG instanceof JSONObject) {
                objG = G((JSONObject) objG);
            }
            arrayList.add(objG);
        }
        return arrayList;
    }

    public static final HashMap G(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objG = jSONObject.get(next);
            if (objG instanceof JSONArray) {
                objG = F((JSONArray) objG);
            } else if (objG instanceof JSONObject) {
                objG = G((JSONObject) objG);
            }
            map.put(next, objG);
        }
        return map;
    }

    public static final String H(Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof oj4) {
            return oj4.f().concat(".NULL");
        }
        return obj instanceof xe9 ? ((xe9) obj).a(z, z2) : obj.toString();
    }

    public static final void I(gdi gdiVar) {
        gdiVar.d(334, new mh(26));
        gdiVar.d(335, new f(9));
        gdiVar.d(336, new mh(27));
        gdiVar.d(337, new mh(28));
        gdiVar.d(338, new f(10));
        gdiVar.d(339, new f(11));
        gdiVar.d(340, new g(29));
    }

    public static final void J(gdi gdiVar) {
        gdiVar.b(3, new lu2(7));
        gdiVar.b(3, new lu2(8));
        gdiVar.d(977, new ci3(0));
        gdiVar.d(987, new ci3(1));
        gdiVar.d(988, new ci3(2));
        gdiVar.d(903, new ci3(3));
        gdiVar.d(989, new ci3(4));
        gdiVar.d(670, new ci3(5));
        gdiVar.d(990, new ci3(6));
        gdiVar.d(991, new ci3(7));
        gdiVar.d(992, new ci3(8));
        gdiVar.d(980, new t62(25));
        gdiVar.d(981, new t62(26));
        gdiVar.d(993, new lu2(9));
        gdiVar.d(994, new lu2(10));
        gdiVar.d(983, new mu2(3));
        gdiVar.d(985, new mu2(4));
        gdiVar.d(995, new mu2(5));
        gdiVar.d(984, new mu2(6));
        gdiVar.d(147, new mu2(7));
        gdiVar.d(996, new mu2(8));
        gdiVar.d(976, new t62(27));
        gdiVar.d(978, new t62(28));
        gdiVar.d(979, new t62(29));
        gdiVar.d(997, new lu2(11));
        gdiVar.d(998, new mu2(9));
        gdiVar.d(999, new lu2(12));
        gdiVar.d(986, new mu2(10));
    }

    public static final void K(gdi gdiVar) {
        gdiVar.d(368, new g7f(27));
        gdiVar.d(375, new g7f(24));
        gdiVar.d(378, new jld(19));
        gdiVar.d(379, new ci3(20));
        gdiVar.d(382, new l65(7));
        gdiVar.d(383, new g7f(29));
        gdiVar.b(3, new y6f(28));
    }

    public static final void L(DataOutput dataOutput, String str, d9i d9iVar) throws IOException {
        dataOutput.writeUTF(str);
        dataOutput.writeByte(d9iVar.a);
    }

    public static final void M(DataOutput dataOutput, String str, d9i d9iVar, d9i d9iVar2, String str2, fbc fbcVar) throws IOException {
        int i;
        if (str2.length() < 21845) {
            L(dataOutput, str, d9iVar);
            dataOutput.writeUTF(str2);
            return;
        }
        L(dataOutput, str, d9iVar2);
        int length = str2.length();
        char[] cArr = (char[]) fbcVar.b;
        int length2 = cArr.length;
        if (length2 < length) {
            do {
                length2 <<= 1;
            } while (length2 < length);
            cArr = new char[length2];
            fbcVar.b = cArr;
        }
        str2.getChars(0, length, cArr, 0);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 3;
            if (i2 >= length) {
                break;
            }
            char c2 = cArr[i2];
            if (c2 <= 127) {
                i = 1;
            } else if (c2 <= 2047) {
                i = 2;
            }
            i3 += i;
            i2++;
        }
        int iA = d9iVar2.a();
        byte[] bArr = (byte[]) fbcVar.c;
        if (i3 <= 127) {
            bArr[0] = (byte) (iA | 8);
            bArr[1] = (byte) i3;
            i = 2;
        } else if (i3 <= 32767) {
            bArr[0] = (byte) (iA | 9);
            bArr[1] = (byte) (i3 >> 8);
            bArr[2] = (byte) i3;
        } else {
            bArr[0] = (byte) (iA | 10);
            bArr[1] = (byte) (i3 >> 24);
            bArr[2] = (byte) ((i3 >> 16) & 255);
            bArr[3] = (byte) ((i3 >> 8) & 255);
            bArr[4] = (byte) i3;
            i = 5;
        }
        dataOutput.write(bArr, 0, i);
        byte[] bArr2 = (byte[]) fbcVar.c;
        int length3 = bArr2.length;
        if (length3 < i3) {
            do {
                length3 <<= 1;
            } while (length3 < i3);
            bArr2 = new byte[length3];
            fbcVar.c = bArr2;
        }
        if (length == i3) {
            for (int i4 = 0; i4 < length; i4++) {
                bArr2[i4] = (byte) cArr[i4];
            }
        } else {
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                char c3 = cArr[i6];
                if (c3 <= 127) {
                    bArr2[i5] = (byte) c3;
                    i5++;
                } else if (c3 <= 2047) {
                    int i7 = i5 + 1;
                    bArr2[i5] = (byte) ((c3 >> 6) | 192);
                    i5 += 2;
                    bArr2[i7] = (byte) ((c3 & '?') | np0.m);
                } else {
                    bArr2[i5] = (byte) ((c3 >> '\f') | 224);
                    int i8 = i5 + 2;
                    bArr2[i5 + 1] = (byte) (((c3 >> 6) & 63) | np0.m);
                    i5 += 3;
                    bArr2[i8] = (byte) ((c3 & '?') | np0.m);
                }
            }
        }
        dataOutput.write(bArr2, 0, i3);
    }

    public static void a(StringBuilder sb, X509Certificate x509Certificate) {
        Principal subjectDN = x509Certificate.getSubjectDN();
        if (subjectDN != null) {
            sb.append("subjectDN=");
            sb.append(subjectDN.getName());
            sb.append("; ");
        }
        Principal issuerDN = x509Certificate.getIssuerDN();
        if (issuerDN != null) {
            sb.append("issuerDN=");
            sb.append(issuerDN.getName());
            sb.append("; ");
        }
        sb.append("notBefore=");
        sb.append(x509Certificate.getNotBefore());
        sb.append("; ");
        sb.append("notAfter=");
        sb.append(x509Certificate.getNotAfter());
        sb.append("; ");
    }

    public static boolean b(Map map, Map map2) {
        if (map == null || map2 == null || map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            i37 i37Var = (i37) entry.getKey();
            Object value = entry.getValue();
            Object obj = map2.get(i37Var);
            if (obj == null) {
                return false;
            }
            if ((value instanceof long[]) && (obj instanceof long[])) {
                if (!Arrays.equals((long[]) value, (long[]) obj)) {
                    return false;
                }
            } else if (!cqk.d(value, obj)) {
                return false;
            }
        }
        return true;
    }

    public static final Uri c(String str) {
        if (str.length() == 0) {
            return null;
        }
        return (z5h.K0(str, "file:", true) || z5h.K0(str, HttpHost.DEFAULT_SCHEME_NAME, true) || z5h.K0(str, "content", true) || z5h.K0(str, "android.resource", true) || z5h.K0(str, "data", true) || z5h.K0(str, "res:/", true)) ? Uri.parse(str) : Uri.parse("file:".concat(str));
    }

    public static final void f(TextView textView, kbc kbcVar) {
        Drawable drawableMutate;
        Drawable drawableMutate2;
        Drawable drawableMutate3;
        Drawable drawableMutate4;
        Drawable drawableMutate5;
        Drawable drawableMutate6;
        textView.setHighlightColor(lvb.I0(kbcVar.l().a, 0.24f));
        Drawable drawableR = np4.r(textView);
        if (drawableR != null) {
            sb8.m0(kbcVar.l().a, drawableR);
        }
        int i = kbcVar.l().a;
        if (Build.VERSION.SDK_INT >= 29) {
            Drawable textSelectHandle = textView.getTextSelectHandle();
            if (textSelectHandle != null && (drawableMutate6 = textSelectHandle.mutate()) != null) {
                drawableMutate6.setTint(i);
                textView.setTextSelectHandle(drawableMutate6);
            }
            Drawable textSelectHandleLeft = textView.getTextSelectHandleLeft();
            if (textSelectHandleLeft != null && (drawableMutate5 = textSelectHandleLeft.mutate()) != null) {
                drawableMutate5.setTint(i);
                textView.setTextSelectHandleLeft(drawableMutate5);
            }
            Drawable textSelectHandleRight = textView.getTextSelectHandleRight();
            if (textSelectHandleRight == null || (drawableMutate4 = textSelectHandleRight.mutate()) == null) {
                return;
            }
            drawableMutate4.setTint(i);
            textView.setTextSelectHandleRight(drawableMutate4);
            return;
        }
        Object objA0 = e9i.a0(textView, "mEditor");
        if (objA0 == null) {
            return;
        }
        Object objA1 = e9i.a0(textView, "mTextSelectHandleRes");
        if (!(objA1 instanceof Integer)) {
            objA1 = null;
        }
        Integer num = (Integer) objA1;
        if (num != null) {
            Drawable drawable = textView.getContext().getDrawable(num.intValue());
            if (drawable != null && (drawableMutate3 = drawable.mutate()) != null) {
                drawableMutate3.setTint(i);
                e9i.D0(objA0, "mSelectHandleCenter", drawableMutate3);
            }
        }
        Object objA2 = e9i.a0(textView, "mTextSelectHandleLeftRes");
        if (!(objA2 instanceof Integer)) {
            objA2 = null;
        }
        Integer num2 = (Integer) objA2;
        if (num2 != null) {
            Drawable drawable2 = textView.getContext().getDrawable(num2.intValue());
            if (drawable2 != null && (drawableMutate2 = drawable2.mutate()) != null) {
                drawableMutate2.setTint(i);
                e9i.D0(objA0, "mSelectHandleLeft", drawableMutate2);
            }
        }
        Object objA3 = e9i.a0(textView, "mTextSelectHandleRightRes");
        Integer num3 = (Integer) (objA3 instanceof Integer ? objA3 : null);
        if (num3 != null) {
            Drawable drawable3 = textView.getContext().getDrawable(num3.intValue());
            if (drawable3 == null || (drawableMutate = drawable3.mutate()) == null) {
                return;
            }
            drawableMutate.setTint(i);
            e9i.D0(objA0, "mSelectHandleRight", drawableMutate);
        }
    }

    public static final xac g(vbf vbfVar, boolean z) {
        return z ? (xac) vbfVar.a : (xac) vbfVar.b;
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static d25 i(byte[] bArr) {
        if (bArr.length > 10240) {
            ore.k("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return d25.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    while (i < i2) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s == -21521) {
                        short s2 = dataInputStream.readShort();
                        if (s2 != 1) {
                            ore.c(zo5.h(s2, "Unsupported version number: "));
                        }
                    } else {
                        ore.c(zo5.h(s, "Magic number doesn't match: "));
                    }
                    int i3 = dataInputStream.readInt();
                    while (i < i3) {
                        linkedHashMap.put(dataInputStream.readUTF(), j(dataInputStream, dataInputStream.readByte()));
                        i++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        rx8.n(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException e) {
            n1g.x().t(f35.a, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            n1g.x().t(f35.a, "Error in Data#fromByteArray: ", e2);
        }
        return new d25(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable j(DataInputStream dataInputStream, byte b2) throws IOException {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b2 == 8) {
            int i2 = dataInputStream.readInt();
            ?? r0 = new Boolean[i2];
            while (i < i2) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b2 == 9) {
            int i3 = dataInputStream.readInt();
            ?? r1 = new Byte[i3];
            while (i < i3) {
                r1[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r1;
        }
        if (b2 == 10) {
            int i4 = dataInputStream.readInt();
            ?? r2 = new Integer[i4];
            while (i < i4) {
                r2[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r2;
        }
        if (b2 == 11) {
            int i5 = dataInputStream.readInt();
            ?? r3 = new Long[i5];
            while (i < i5) {
                r3[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r3;
        }
        if (b2 == 12) {
            int i6 = dataInputStream.readInt();
            ?? r4 = new Float[i6];
            while (i < i6) {
                r4[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r4;
        }
        if (b2 == 13) {
            int i7 = dataInputStream.readInt();
            ?? r5 = new Double[i7];
            while (i < i7) {
                r5[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r5;
        }
        if (b2 != 14) {
            ore.k(zo5.h(b2, "Unsupported type "));
            return null;
        }
        int i8 = dataInputStream.readInt();
        ?? r6 = new String[i8];
        while (i < i8) {
            String utf = dataInputStream.readUTF();
            if (cqk.d(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r6[i] = utf;
            i++;
        }
        return r6;
    }

    public static ColorStateList k(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !o4.o(drawable)) {
            return null;
        }
        return o4.c(drawable).getColorStateList();
    }

    public static final kbc l(nbc nbcVar, boolean z) {
        return lbc.D8;
    }

    public static u72 m(s72 s72Var) {
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = s72Var.getClass();
        try {
            Object objQ = s72Var.Q(r72Var);
            if (objQ == null) {
                return u72Var;
            }
            r72Var.a = objQ;
            return u72Var;
        } catch (Exception e) {
            u72Var.c(e);
            return u72Var;
        }
    }

    public static final String n(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:33:0x0104  */
    /* JADX WARN: Code duplicated, block: B:34:0x0107  */
    /* JADX WARN: Code duplicated, block: B:36:0x010b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX WARN: Code duplicated, block: B:39:0x0118  */
    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    public static k4f o(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int safeInsetRight;
        int i6;
        int i7;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetLeft;
        Float fValueOf;
        boolean z;
        boolean z2;
        boolean z3;
        int i8 = Build.VERSION.SDK_INT;
        boolean z4 = false;
        if (i8 < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            sb8.M(context).getDefaultDisplay().getMetrics(displayMetrics);
            int i9 = displayMetrics.widthPixels;
            int i10 = displayMetrics.heightPixels;
            if (i8 >= 29) {
                DisplayCutout cutout = sb8.M(context).getDefaultDisplay().getCutout();
                safeInsetTop = cutout != null ? cutout.getSafeInsetTop() : 0;
                DisplayCutout cutout2 = sb8.M(context).getDefaultDisplay().getCutout();
                safeInsetBottom = cutout2 != null ? cutout2.getSafeInsetBottom() : 0;
                DisplayCutout cutout3 = sb8.M(context).getDefaultDisplay().getCutout();
                safeInsetLeft = cutout3 != null ? cutout3.getSafeInsetLeft() : 0;
                DisplayCutout cutout4 = sb8.M(context).getDefaultDisplay().getCutout();
                i = i10;
                i2 = i;
                safeInsetRight = cutout4 != null ? cutout4.getSafeInsetRight() : 0;
                i6 = i9;
                i7 = i6;
            } else {
                i = i10;
                i2 = i;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                safeInsetRight = 0;
                i6 = i9;
                i7 = i6;
            }
            if (i6 > 0 || i <= 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(Math.max(i6, i) / Math.min(i6, i));
            }
            if (lvb.w0(context).compareTo(pk5.AVERAGE) < 0) {
                z = true;
            } else {
                z = false;
            }
            if (fValueOf != null) {
                if (fValueOf.floatValue() >= 2.33f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z2 = z3;
            } else {
                z2 = false;
            }
            if (fValueOf != null && fValueOf.floatValue() <= 1.8f) {
                z4 = true;
            }
            return new k4f(i, i6, i7, i2, i3, i4, i5, safeInsetRight, z, z2, z4);
        }
        Rect bounds = sb8.M(context).getMaximumWindowMetrics().getBounds();
        Rect bounds2 = sb8.M(context).getCurrentWindowMetrics().getBounds();
        Insets insets = sb8.M(context).getMaximumWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int iWidth2 = bounds2.width();
        int iHeight2 = bounds2.height();
        safeInsetTop = insets.top;
        safeInsetBottom = insets.bottom;
        safeInsetLeft = insets.left;
        i = iHeight;
        i2 = iHeight2;
        safeInsetRight = insets.right;
        i6 = iWidth;
        i7 = iWidth2;
        i3 = safeInsetTop;
        i4 = safeInsetBottom;
        i5 = safeInsetLeft;
        if (i6 > 0) {
            fValueOf = null;
        } else {
            fValueOf = null;
        }
        if (lvb.w0(context).compareTo(pk5.AVERAGE) < 0) {
            z = true;
        } else {
            z = false;
        }
        if (fValueOf != null) {
            if (fValueOf.floatValue() >= 2.33f) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        if (fValueOf != null) {
            z4 = true;
        }
        return new k4f(i, i6, i7, i2, i3, i4, i5, safeInsetRight, z, z2, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v123, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v26, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v83, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v95, types: [iv4] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [pj4] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v5, types: [ujd] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String, ujd] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static ujd p(fka fkaVar) {
        int iU;
        ?? X;
        int iJ;
        Integer numS;
        int i;
        int iU2;
        ?? r17;
        ?? S;
        ?? r18;
        long jT;
        fka fkaVar2 = fkaVar;
        int i2 = 1;
        ?? r8 = 0;
        try {
            iU = ch3.U(fkaVar2);
        } catch (Throwable th) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = fjf.a.iterator();
            while (it.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th);
                    accountInitializer.d().i().g().a(null, th);
                } catch (Throwable th2) {
                    gm0.V("Payload", "failed to collect exception", th2);
                }
            }
            int iD = qt4.D(pye.a);
            if (iD != 0) {
                if (iD == 1) {
                    throw th;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        if (iU == 0) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        ?? E = 0;
        int i3 = 0;
        while (i3 < iU) {
            try {
                X = ch3.X(fkaVar2, r8);
            } catch (Throwable th3) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = fjf.a.iterator();
                while (it2.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(r8, th3);
                    } catch (Throwable th4) {
                        gm0.V("Payload", "failed to collect exception", th4);
                    }
                }
                int iD2 = qt4.D(pye.a);
                if (iD2 != 0) {
                    if (iD2 == i2) {
                        throw th3;
                    }
                    ore.o();
                    return r8;
                }
                X = r8;
            }
            if (X != 0) {
                int iHashCode = X.hashCode();
                try {
                    if (iHashCode == -2078600011) {
                        if (X.equals("profileOptions")) {
                            try {
                                iJ = ch3.J(fkaVar);
                            } catch (Throwable th5) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                Iterator it3 = fjf.a.iterator();
                                while (it3.hasNext()) {
                                    AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th5);
                                        accountInitializer3.d().i().g().a(null, th5);
                                    } catch (Throwable th6) {
                                        gm0.V("Payload", "failed to collect exception", th6);
                                    }
                                }
                                int iD3 = qt4.D(pye.a);
                                if (iD3 != 0) {
                                    if (iD3 == 1) {
                                        throw th5;
                                    }
                                    ore.o();
                                    return null;
                                }
                                iJ = 0;
                            }
                            for (int i4 = 0; i4 < iJ; i4++) {
                                try {
                                    numS = ch3.S(fkaVar);
                                } catch (Throwable th7) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                    Iterator it4 = fjf.a.iterator();
                                    while (it4.hasNext()) {
                                        AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th7);
                                            accountInitializer4.d().i().g().a(null, th7);
                                        } catch (Throwable th8) {
                                            gm0.V("Payload", "failed to collect exception", th8);
                                        }
                                    }
                                    int iD4 = qt4.D(pye.a);
                                    if (iD4 != 0) {
                                        if (iD4 == 1) {
                                            throw th7;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                    numS = null;
                                }
                                if (numS != null) {
                                    arrayList.add(Integer.valueOf(numS.intValue()));
                                }
                            }
                        }
                        i = 1;
                    } else if (iHashCode != -1148295641) {
                        if (iHashCode == 951526432 && X.equals("contact")) {
                            try {
                                E = pj4.e(fkaVar2);
                            } catch (Throwable th9) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                                Iterator it5 = fjf.a.iterator();
                                while (it5.hasNext()) {
                                    AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th9);
                                        accountInitializer5.d().i().g().a(r8, th9);
                                    } catch (Throwable th10) {
                                        gm0.V("Payload", "failed to collect exception", th10);
                                    }
                                }
                                int iD5 = qt4.D(pye.a);
                                if (iD5 != 0) {
                                    if (iD5 == i2) {
                                        throw th9;
                                    }
                                    ore.o();
                                    return r8;
                                }
                                E = r8;
                            }
                            i = i2;
                        }
                    } else if (X.equals("restrictions")) {
                        try {
                            iU2 = ch3.U(fkaVar2);
                        } catch (Throwable th11) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                            Iterator it6 = fjf.a.iterator();
                            while (it6.hasNext()) {
                                AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th11);
                                    accountInitializer6.d().i().g().a(r8, th11);
                                } catch (Throwable th12) {
                                    gm0.V("Payload", "failed to collect exception", th12);
                                }
                            }
                            int iD6 = qt4.D(pye.a);
                            if (iD6 != 0) {
                                if (iD6 == i2) {
                                    throw th11;
                                }
                                ore.o();
                                return r8;
                            }
                            iU2 = 0;
                        }
                        int i5 = 0;
                        ?? r9 = r8;
                        while (i5 < iU2) {
                            try {
                                S = ch3.S(fkaVar2);
                                r18 = r9;
                            } catch (Throwable th13) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                                Iterator it7 = fjf.a.iterator();
                                while (it7.hasNext()) {
                                    AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th13);
                                        accountInitializer7.d().i().g().a(r9, th13);
                                    } catch (Throwable th14) {
                                        gm0.V("Payload", "failed to collect exception", th14);
                                    }
                                }
                                int iD7 = qt4.D(pye.a);
                                r17 = r9;
                                if (iD7 != 0) {
                                    if (iD7 == 1) {
                                        throw th13;
                                    }
                                    ore.o();
                                    return r17;
                                }
                                S = r17;
                            }
                            if (S != 0) {
                                r18 = r17;
                                try {
                                    jT = ch3.T(fkaVar2, 0L);
                                } catch (Throwable th15) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                                    Iterator it8 = fjf.a.iterator();
                                    ?? r19 = r18;
                                    while (it8.hasNext()) {
                                        AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th15);
                                            accountInitializer8.d().i().g().a(r19, th15);
                                        } catch (Throwable th16) {
                                            gm0.V("Payload", "failed to collect exception", th16);
                                        }
                                        r19 = 0;
                                    }
                                    int iD8 = qt4.D(pye.a);
                                    if (iD8 != 0) {
                                        if (iD8 == 1) {
                                            throw th15;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                    jT = 0;
                                }
                                linkedHashMap.put(S, new moe(jT));
                            } else {
                                r18 = r17;
                            }
                            i5++;
                            fkaVar2 = fkaVar;
                            iU2 = iU2;
                            i2 = 1;
                            r9 = 0;
                        }
                        i = i2;
                    }
                    fkaVar.x();
                } catch (Throwable th17) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                    Iterator it9 = fjf.a.iterator();
                    while (it9.hasNext()) {
                        AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th17);
                            accountInitializer9.d().i().g().a(null, th17);
                        } catch (Throwable th18) {
                            gm0.V("Payload", "failed to collect exception", th18);
                        }
                    }
                    int iD9 = qt4.D(pye.a);
                    if (iD9 != 0) {
                        if (iD9 == 1) {
                            throw th17;
                        }
                        ore.o();
                        return null;
                    }
                }
                i = 1;
            } else {
                i = i2;
            }
            i3++;
            fkaVar2 = fkaVar;
            i2 = i;
            r8 = 0;
            E = E;
        }
        if (E != 0) {
            return new ujd(E, linkedHashMap, arrayList);
        }
        ore.p("Required value was null.");
        return null;
    }

    public static final boolean q(vg4 vg4Var) {
        return vg4Var == null || vg4Var.I();
    }

    public static Object r() {
        Object poeVar;
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary("max");
            poeVar = new ew5(qe7.P(SystemClock.uptimeMillis() - jUptimeMillis, lw5.MILLISECONDS));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA == null) {
            return poeVar;
        }
        try {
            throw new xab(thA);
        } catch (Throwable th2) {
            return new poe(th2);
        }
    }

    public static final String s(List list, final boolean z, final boolean z2) {
        return !z ? String.valueOf(list.size()) : ww3.z1(list, ",", "[", "]", new cf7() { // from class: ue9
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                return f55.H(obj, z, z2);
            }
        }, 24);
    }

    public static final d25 t(ha9 ha9Var, ylc... ylcVarArr) {
        w4 w4Var = new w4(6, false);
        ((LinkedHashMap) w4Var.a).put("local_account_id", Integer.valueOf(ha9Var.a));
        for (ylc ylcVar : ylcVarArr) {
            w4Var.n(ylcVar.b, (String) ylcVar.a);
        }
        return w4Var.e();
    }

    public static int u(Map map) {
        if (map == null) {
            return 0;
        }
        int iHashCode = 0;
        for (Map.Entry entry : map.entrySet()) {
            i37 i37Var = (i37) entry.getKey();
            Object value = entry.getValue();
            int iHashCode2 = i37Var.hashCode() + (iHashCode * 31);
            if (value instanceof long[]) {
                for (long j : (long[]) value) {
                    iHashCode2 = (iHashCode2 * 31) + Long.hashCode(j);
                }
                iHashCode = iHashCode2;
            } else {
                iHashCode = (value != null ? value.hashCode() : 0) + (iHashCode2 * 31);
            }
        }
        return iHashCode;
    }

    public static final boolean v(String str) {
        return (str.equals(HttpGet.METHOD_NAME) || str.equals(HttpHead.METHOD_NAME)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ce A[SYNTHETIC] */
    public static final String w(DataInputStream dataInputStream, fbc fbcVar) throws IOException {
        int unsignedByte;
        byte b2;
        int i;
        int i2;
        byte b3;
        byte b4;
        int i3;
        byte b5;
        int unsignedByte2 = dataInputStream.readUnsignedByte() & 15;
        if (unsignedByte2 != 15) {
            switch (unsignedByte2) {
                case 8:
                    unsignedByte = dataInputStream.readUnsignedByte();
                    break;
                case 9:
                    unsignedByte = dataInputStream.readUnsignedShort();
                    break;
                case 10:
                    unsignedByte = dataInputStream.readInt();
                    break;
                default:
                    ore.k("Extra too long");
                    return null;
            }
        } else {
            unsignedByte = -1;
        }
        byte[] bArr = (byte[]) fbcVar.c;
        char[] cArr = (char[]) fbcVar.b;
        int length = bArr.length;
        if (length < unsignedByte) {
            do {
                length <<= 1;
            } while (length < unsignedByte);
            bArr = new byte[length];
            fbcVar.c = bArr;
            cArr = new char[length];
            fbcVar.b = cArr;
        }
        dataInputStream.readFully(bArr, 0, unsignedByte);
        int i4 = 0;
        int i5 = 0;
        while (i4 < unsignedByte) {
            int i6 = bArr[i4] & 255;
            if (i6 > 127) {
                while (i4 < unsignedByte) {
                    b2 = bArr[i4];
                    i = b2 & 255;
                    switch (i >> 4) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            i4++;
                            cArr[i5] = (char) i;
                            i5++;
                            break;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        default:
                            throw new UTFDataFormatException(zo5.h(i4, "malformed input around byte "));
                        case 12:
                        case 13:
                            i3 = i4 + 2;
                            if (i3 <= unsignedByte) {
                                throw new UTFDataFormatException("malformed input: partial character at end");
                            }
                            b5 = bArr[i4 + 1];
                            if ((b5 & 192) == 128) {
                                throw new UTFDataFormatException(zo5.h(i3, "malformed input around byte "));
                            }
                            cArr[i5] = (char) ((b5 & 63) | ((b2 & 31) << 6));
                            i4 = i3;
                            i5++;
                            break;
                            break;
                        case 14:
                            i2 = i4 + 3;
                            if (i2 <= unsignedByte) {
                                throw new UTFDataFormatException("malformed input: partial character at end");
                            }
                            b3 = bArr[i4 + 1];
                            if ((b3 & 192) == 128) {
                                throw new UTFDataFormatException(zo5.h(i4 + 2, "malformed input around byte "));
                            }
                            b4 = bArr[i4 + 2];
                            if ((b4 & 192) == 128) {
                                throw new UTFDataFormatException(zo5.h(i2, "malformed input around byte "));
                            }
                            cArr[i5] = (char) ((b4 & 63) | ((b2 & 15) << 12) | ((b3 & 63) << 6));
                            i4 = i2;
                            i5++;
                            break;
                            break;
                    }
                }
                return new String(cArr, 0, i5);
            }
            i4++;
            cArr[i5] = (char) i6;
            i5++;
        }
        while (i4 < unsignedByte) {
            b2 = bArr[i4];
            i = b2 & 255;
            switch (i >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i4++;
                    cArr[i5] = (char) i;
                    i5++;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new UTFDataFormatException(zo5.h(i4, "malformed input around byte "));
                case 12:
                case 13:
                    i3 = i4 + 2;
                    if (i3 <= unsignedByte) {
                        throw new UTFDataFormatException("malformed input: partial character at end");
                    }
                    b5 = bArr[i4 + 1];
                    if ((b5 & 192) == 128) {
                        throw new UTFDataFormatException(zo5.h(i3, "malformed input around byte "));
                    }
                    cArr[i5] = (char) ((b5 & 63) | ((b2 & 31) << 6));
                    i4 = i3;
                    i5++;
                    break;
                    break;
                case 14:
                    i2 = i4 + 3;
                    if (i2 <= unsignedByte) {
                        throw new UTFDataFormatException("malformed input: partial character at end");
                    }
                    b3 = bArr[i4 + 1];
                    if ((b3 & 192) == 128) {
                        throw new UTFDataFormatException(zo5.h(i4 + 2, "malformed input around byte "));
                    }
                    b4 = bArr[i4 + 2];
                    if ((b4 & 192) == 128) {
                        throw new UTFDataFormatException(zo5.h(i2, "malformed input around byte "));
                    }
                    cArr[i5] = (char) ((b4 & 63) | ((b2 & 15) << 12) | ((b3 & 63) << 6));
                    i4 = i2;
                    i5++;
                    break;
                    break;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static final Object x(s3f s3fVar, boolean z, s3f s3fVar2, qf7 qf7Var) throws Throwable {
        Object s64Var;
        Object objR;
        try {
            if (qf7Var instanceof mq0) {
                e9i.l(2, qf7Var);
                s64Var = qf7Var.invoke(s3fVar2, s3fVar);
            } else {
                s64Var = p90.V(qf7Var, s3fVar2, s3fVar);
            }
        } catch (DispatchException e) {
            Throwable th = e.a;
            s3fVar.Q(new s64(false, th));
            throw th;
        } catch (Throwable th2) {
            s64Var = new s64(false, th2);
        }
        hu4 hu4Var = hu4.a;
        if (s64Var == hu4Var || (objR = s3fVar.R(s64Var)) == rx8.f) {
            return hu4Var;
        }
        s3fVar.n0();
        if (!(objR instanceof s64)) {
            return rx8.m0(objR);
        }
        if (!z) {
            Throwable th3 = ((s64) objR).a;
            if ((th3 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th3).a == s3fVar) {
                if (s64Var instanceof s64) {
                    throw ((s64) s64Var).a;
                }
                return s64Var;
            }
        }
        throw ((s64) objR).a;
    }

    public static byte[] y(d25 d25Var) {
        HashMap map = d25Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    z(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            n1g.x().t(f35.a, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static final void z(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                qr7.j(zfe.a(obj.getClass()).h(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            sr3 sr3VarA = zfe.a(objArr.getClass());
            if (sr3VarA.equals(zfe.a(Boolean[].class))) {
                i = 8;
            } else if (sr3VarA.equals(zfe.a(Byte[].class))) {
                i = 9;
            } else if (sr3VarA.equals(zfe.a(Integer[].class))) {
                i = 10;
            } else if (sr3VarA.equals(zfe.a(Long[].class))) {
                i = 11;
            } else if (sr3VarA.equals(zfe.a(Float[].class))) {
                i = 12;
            } else if (sr3VarA.equals(zfe.a(Double[].class))) {
                i = 13;
            } else {
                if (!sr3VarA.equals(zfe.a(String[].class))) {
                    qr7.j(zfe.a(objArr.getClass()).g(), "Unsupported value type ");
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public fo d(Context context, Looper looper, s80 s80Var, Object obj, ho7 ho7Var, io7 io7Var) {
        return e(context, looper, s80Var, obj, (skk) ho7Var, (skk) io7Var);
    }

    public fo e(Context context, Looper looper, s80 s80Var, Object obj, skk skkVar, skk skkVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
