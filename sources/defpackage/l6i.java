package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l6i {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static final boolean a(Context context, Uri uri) {
        String path;
        Object poeVar;
        String scheme = uri.getScheme();
        boolean z = false;
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            z = true;
                        }
                        poeVar = Boolean.valueOf(z);
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    Object obj = Boolean.FALSE;
                    if (poeVar instanceof poe) {
                        poeVar = obj;
                    }
                    return ((Boolean) poeVar).booleanValue();
                }
            } else if (scheme.equals("file") && (path = uri.getPath()) != null && new File(path).isFile() && new File(path).canRead()) {
                return true;
            }
        }
        return false;
    }

    public static byte[] b(vk5[] vk5VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (vk5 vk5Var : vk5VarArr) {
            length += ((((vk5Var.g * 2) + 7) & (-8)) / 8) + (vk5Var.e * 2) + d(bArr, vk5Var.a, vk5Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + vk5Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, hvi.c)) {
            int length2 = vk5VarArr.length;
            while (i < length2) {
                vk5 vk5Var2 = vk5VarArr[i];
                n(byteArrayOutputStream, vk5Var2, d(bArr, vk5Var2.a, vk5Var2.b));
                m(byteArrayOutputStream, vk5Var2);
                i++;
            }
        } else {
            for (vk5 vk5Var3 : vk5VarArr) {
                n(byteArrayOutputStream, vk5Var3, d(bArr, vk5Var3.a, vk5Var3.b));
            }
            int length3 = vk5VarArr.length;
            while (i < length3) {
                m(byteArrayOutputStream, vk5VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final Bundle c(Integer num, Integer num2, String str, String[] strArr, String str2) {
        Bundle bundle = new Bundle();
        if (num.intValue() != -1) {
            bundle.putInt("android:query-arg-limit", num.intValue());
        }
        if (num2.intValue() != -1) {
            bundle.putInt("android:query-arg-offset", num2.intValue());
        }
        bundle.putStringArray("android:query-arg-sort-columns", new String[]{str2});
        if (str != null) {
            bundle.putString("android:query-arg-sql-selection", str);
        }
        if (strArr != null) {
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
        }
        return bundle;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = hvi.e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = hvi.d;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return zo5.w(nbh.C(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static m6i e(String str) {
        Object poeVar;
        if (str == null || str.length() == 0) {
            gm0.Y(l6i.class.getName(), "Early return in invoke cuz of jsonText.isNullOrEmpty()");
            return null;
        }
        try {
            poeVar = new JSONObject(str);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        JSONObject jSONObject = (JSONObject) poeVar;
        if (jSONObject != null) {
            return new m6i(jSONObject.optInt("pass_min_len"), jSONObject.optInt("pass_max_len"), jSONObject.optInt("hint_max_len"));
        }
        gm0.Y(l6i.class.getName(), "Early return in invoke cuz of json == null");
        return null;
    }

    public static int[] f(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iE = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iE += (int) awl.e(byteArrayInputStream, 2);
            iArr[i2] = iE;
        }
        return iArr;
    }

    public static vk5[] g(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, vk5[] vk5VarArr) throws IOException {
        byte[] bArr3 = hvi.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, hvi.g)) {
                ore.k("Unsupported meta version");
                return null;
            }
            int iE = (int) awl.e(fileInputStream, 2);
            byte[] bArrD = awl.d(fileInputStream, (int) awl.e(fileInputStream, 4), (int) awl.e(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                ore.k("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrD);
            try {
                vk5[] vk5VarArrI = i(byteArrayInputStream, bArr2, iE, vk5VarArr);
                byteArrayInputStream.close();
                return vk5VarArrI;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(hvi.a, bArr2)) {
            ore.k("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            ore.k("Unsupported meta version");
            return null;
        }
        int iE2 = (int) awl.e(fileInputStream, 1);
        byte[] bArrD2 = awl.d(fileInputStream, (int) awl.e(fileInputStream, 4), (int) awl.e(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            ore.k("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrD2);
        try {
            vk5[] vk5VarArrH = h(byteArrayInputStream2, iE2, vk5VarArr);
            byteArrayInputStream2.close();
            return vk5VarArrH;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static vk5[] h(ByteArrayInputStream byteArrayInputStream, int i, vk5[] vk5VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new vk5[0];
        }
        if (i != vk5VarArr.length) {
            ore.k("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iE = (int) awl.e(byteArrayInputStream, 2);
            iArr[i2] = (int) awl.e(byteArrayInputStream, 2);
            strArr[i2] = new String(awl.c(byteArrayInputStream, iE), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            vk5 vk5Var = vk5VarArr[i3];
            if (!vk5Var.b.equals(strArr[i3])) {
                ore.k("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            vk5Var.e = i4;
            vk5Var.h = f(byteArrayInputStream, i4);
        }
        return vk5VarArr;
    }

    public static vk5[] i(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, vk5[] vk5VarArr) throws IOException {
        vk5 vk5Var;
        if (byteArrayInputStream.available() == 0) {
            return new vk5[0];
        }
        if (i != vk5VarArr.length) {
            ore.k("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            awl.e(byteArrayInputStream, 2);
            String str = new String(awl.c(byteArrayInputStream, (int) awl.e(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jE = awl.e(byteArrayInputStream, 4);
            int iE = (int) awl.e(byteArrayInputStream, 2);
            if (vk5VarArr.length <= 0) {
                vk5Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= vk5VarArr.length) {
                    vk5Var = null;
                    break;
                }
                if (vk5VarArr[i3].b.equals(strSubstring)) {
                    vk5Var = vk5VarArr[i3];
                    break;
                }
                i3++;
            }
            if (vk5Var == null) {
                ore.k("Missing profile key: ".concat(str));
                return null;
            }
            vk5Var.d = jE;
            int[] iArrF = f(byteArrayInputStream, iE);
            if (Arrays.equals(bArr, hvi.e)) {
                vk5Var.e = iE;
                vk5Var.h = iArrF;
            }
        }
        return vk5VarArr;
    }

    public static vk5[] j(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, hvi.b)) {
            ore.k("Unsupported version");
            return null;
        }
        int iE = (int) awl.e(fileInputStream, 1);
        byte[] bArrD = awl.d(fileInputStream, (int) awl.e(fileInputStream, 4), (int) awl.e(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            ore.k("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrD);
        try {
            vk5[] vk5VarArrK = k(byteArrayInputStream, str, iE);
            byteArrayInputStream.close();
            return vk5VarArrK;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static vk5[] k(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new vk5[0];
        }
        vk5[] vk5VarArr = new vk5[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iE = (int) awl.e(byteArrayInputStream, 2);
            int iE2 = (int) awl.e(byteArrayInputStream, 2);
            vk5VarArr[i3] = new vk5(str, new String(awl.c(byteArrayInputStream, iE), StandardCharsets.UTF_8), awl.e(byteArrayInputStream, 4), iE2, (int) awl.e(byteArrayInputStream, 4), (int) awl.e(byteArrayInputStream, 4), new int[iE2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            vk5 vk5Var = vk5VarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = vk5Var.f;
            int i6 = vk5Var.g;
            TreeMap treeMap = vk5Var.i;
            int i7 = iAvailable - i5;
            int iE3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iE3 += (int) awl.e(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iE3), 1);
                int iE4 = (int) awl.e(byteArrayInputStream, 2);
                while (iE4 > 0) {
                    awl.e(byteArrayInputStream, 2);
                    int iE5 = (int) awl.e(byteArrayInputStream, 1);
                    if (iE5 != 6 && iE5 != 7) {
                        while (iE5 > 0) {
                            awl.e(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iE6 = (int) awl.e(byteArrayInputStream, 1); iE6 > 0; iE6--) {
                                awl.e(byteArrayInputStream, 2);
                            }
                            iE5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iE4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                ore.k("Read too much data during profile line parse");
                return null;
            }
            vk5Var.h = f(byteArrayInputStream, vk5Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(awl.c(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return vk5VarArr;
    }

    public static boolean l(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, vk5[] vk5VarArr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = hvi.a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = hvi.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(vk5VarArr, bArr3);
                awl.f(byteArrayOutputStream, vk5VarArr.length, 1);
                awl.f(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrB2 = awl.b(bArrB);
                awl.f(byteArrayOutputStream, bArrB2.length, 4);
                byteArrayOutputStream.write(bArrB2);
                return true;
            }
            byte[] bArr4 = hvi.d;
            if (Arrays.equals(bArr, bArr4)) {
                awl.f(byteArrayOutputStream, vk5VarArr.length, 1);
                for (vk5 vk5Var : vk5VarArr) {
                    int size = vk5Var.i.size() * 4;
                    String strD = d(bArr4, vk5Var.a, vk5Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    awl.g(strD.getBytes(charset).length, byteArrayOutputStream);
                    awl.g(vk5Var.h.length, byteArrayOutputStream);
                    awl.f(byteArrayOutputStream, size, 4);
                    awl.f(byteArrayOutputStream, vk5Var.c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = vk5Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        awl.g(((Integer) it.next()).intValue(), byteArrayOutputStream);
                        awl.g(0, byteArrayOutputStream);
                    }
                    for (int i2 : vk5Var.h) {
                        awl.g(i2, byteArrayOutputStream);
                    }
                }
                return true;
            }
            byte[] bArr5 = hvi.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB3 = b(vk5VarArr, bArr5);
                awl.f(byteArrayOutputStream, vk5VarArr.length, 1);
                awl.f(byteArrayOutputStream, bArrB3.length, 4);
                byte[] bArrB4 = awl.b(bArrB3);
                awl.f(byteArrayOutputStream, bArrB4.length, 4);
                byteArrayOutputStream.write(bArrB4);
                return true;
            }
            byte[] bArr6 = hvi.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            awl.g(vk5VarArr.length, byteArrayOutputStream);
            for (vk5 vk5Var2 : vk5VarArr) {
                String str = vk5Var2.a;
                TreeMap treeMap = vk5Var2.i;
                String strD2 = d(bArr6, str, vk5Var2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                awl.g(strD2.getBytes(charset2).length, byteArrayOutputStream);
                awl.g(treeMap.size(), byteArrayOutputStream);
                awl.g(vk5Var2.h.length, byteArrayOutputStream);
                awl.f(byteArrayOutputStream, vk5Var2.c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    awl.g(((Integer) it2.next()).intValue(), byteArrayOutputStream);
                }
                for (int i3 : vk5Var2.h) {
                    awl.g(i3, byteArrayOutputStream);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            awl.g(vk5VarArr.length, byteArrayOutputStream2);
            int i4 = 2;
            int i5 = 2;
            for (vk5 vk5Var3 : vk5VarArr) {
                awl.f(byteArrayOutputStream2, vk5Var3.c, 4);
                awl.f(byteArrayOutputStream2, vk5Var3.d, 4);
                awl.f(byteArrayOutputStream2, vk5Var3.g, 4);
                String strD3 = d(bArr2, vk5Var3.a, vk5Var3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                awl.g(length2, byteArrayOutputStream2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            u0k u0kVar = new u0k(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(u0kVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < vk5VarArr.length) {
                try {
                    vk5 vk5Var4 = vk5VarArr[i6];
                    awl.g(i6, byteArrayOutputStream3);
                    awl.g(vk5Var4.e, byteArrayOutputStream3);
                    i7 = i7 + 4 + (vk5Var4.e * i4);
                    int[] iArr = vk5Var4.h;
                    int length3 = iArr.length;
                    int i8 = i;
                    while (i < length3) {
                        int i9 = iArr[i];
                        awl.g(i9 - i8, byteArrayOutputStream3);
                        i++;
                        i4 = i4;
                        i8 = i9;
                    }
                    i6++;
                    i = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i10 = i4;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            u0k u0kVar2 = new u0k(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(u0kVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < vk5VarArr.length) {
                try {
                    vk5 vk5Var5 = vk5VarArr[i11];
                    Iterator it3 = vk5Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        o(byteArrayOutputStream5, iIntValue, vk5Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            p(byteArrayOutputStream6, vk5Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            awl.g(i11, byteArrayOutputStream4);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            awl.f(byteArrayOutputStream4, length4, 4);
                            awl.g(iIntValue, byteArrayOutputStream4);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            u0k u0kVar3 = new u0k(4, true, byteArray5);
            byteArrayOutputStream4.close();
            arrayList2.add(u0kVar3);
            long size2 = 12 + ((long) (arrayList2.size() * 16));
            awl.f(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                u0k u0kVar4 = (u0k) arrayList2.get(i14);
                int i15 = u0kVar4.a;
                byte[] bArr7 = u0kVar4.b;
                int i16 = i10;
                if (i15 == 1) {
                    j = 0;
                } else if (i15 == i16) {
                    j = 1;
                } else if (i15 == 3) {
                    j = 2;
                } else if (i15 == 4) {
                    j = 3;
                } else {
                    if (i15 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                awl.f(byteArrayOutputStream, j, 4);
                awl.f(byteArrayOutputStream, size2, 4);
                if (u0kVar4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrB5 = awl.b(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrB5);
                    awl.f(byteArrayOutputStream, bArrB5.length, 4);
                    awl.f(byteArrayOutputStream, length5, 4);
                    length = bArrB5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    awl.f(byteArrayOutputStream, bArr7.length, 4);
                    awl.f(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
                i10 = i16;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, vk5 vk5Var) throws IOException {
        p(byteArrayOutputStream, vk5Var);
        int i = vk5Var.g;
        int[] iArr = vk5Var.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            awl.g(i4 - i3, byteArrayOutputStream);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : vk5Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, vk5 vk5Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        awl.g(str.getBytes(charset).length, byteArrayOutputStream);
        awl.g(vk5Var.e, byteArrayOutputStream);
        awl.f(byteArrayOutputStream, vk5Var.f, 4);
        awl.f(byteArrayOutputStream, vk5Var.c, 4);
        awl.f(byteArrayOutputStream, vk5Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void o(ByteArrayOutputStream byteArrayOutputStream, int i, vk5 vk5Var) throws IOException {
        int i2 = vk5Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : vk5Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, vk5 vk5Var) throws IOException {
        int i = 0;
        for (Map.Entry entry : vk5Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                awl.g(iIntValue - i, byteArrayOutputStream);
                awl.g(0, byteArrayOutputStream);
                i = iIntValue;
            }
        }
    }

    public static String q(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String strQ = qt4.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strQ), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb = new StringBuilder(name2.length() + strQ.length() + 8 + 1);
                    sb.append("<");
                    sb.append(strQ);
                    sb.append(" threw ");
                    sb.append(name2);
                    sb.append(">");
                    string = sb.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i3, iIndexOf);
            sb2.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
