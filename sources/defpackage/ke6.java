package defpackage;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class ke6 {
    public static final Pattern c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final ArrayList f;
    public final ArrayList a;
    public final ByteOrder b;

    static {
        ie6 ie6Var = new ie6(0);
        ie6Var.b = 0;
        f = Collections.list(ie6Var);
    }

    public ke6() {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ie6 ie6Var = new ie6(1);
        ie6Var.b = 0;
        this.a = Collections.list(ie6Var);
        this.b = byteOrder;
    }

    public static Pair a(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairA = a(strArrSplit[0]);
            if (((Integer) pairA.first).intValue() == 2) {
                return pairA;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairA2 = a(strArrSplit[i]);
                int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairA;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    if (j < 0 || j > 65535) {
                        return j < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c(str, str2, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0325  */
    /* JADX WARN: Code duplicated, block: B:104:0x0336 A[LOOP:9: B:102:0x0333->B:104:0x0336, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x034f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0360 A[LOOP:10: B:107:0x035d->B:109:0x0360, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0382 A[LOOP:11: B:111:0x0380->B:112:0x0382, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x039c  */
    /* JADX WARN: Code duplicated, block: B:115:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:117:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:119:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:122:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0177  */
    /* JADX WARN: Code duplicated, block: B:66:0x0184  */
    /* JADX WARN: Code duplicated, block: B:69:0x018f A[LOOP:1: B:67:0x018c->B:69:0x018f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b3 A[LOOP:2: B:71:0x01b1->B:72:0x01b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e3 A[LOOP:3: B:75:0x01e0->B:77:0x01e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x022f A[LOOP:4: B:79:0x022d->B:80:0x022f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0258  */
    /* JADX WARN: Code duplicated, block: B:86:0x0268 A[LOOP:5: B:84:0x0265->B:86:0x0268, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x028c A[LOOP:6: B:88:0x028a->B:89:0x028c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b7 A[LOOP:7: B:92:0x02b4->B:94:0x02b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x02fe A[LOOP:8: B:96:0x02fc->B:97:0x02fe, LOOP_END] */
    public final void c(String str, String str2, List list) {
        String str3;
        int i;
        int i2;
        ByteOrder byteOrder;
        he6 he6Var;
        String[] strArrSplit;
        int length;
        int[] iArr;
        int i3;
        ByteBuffer byteBufferWrap;
        int i4;
        int i5;
        String[] strArrSplit2;
        long[] jArr;
        int i6;
        int i7;
        String[] strArrSplit3;
        int length2;
        uw[] uwVarArr;
        int i8;
        int i9;
        ByteBuffer byteBufferWrap2;
        int i10;
        int i11;
        String[] strArrSplit4;
        int length3;
        int[] iArr2;
        int i12;
        ByteBuffer byteBufferWrap3;
        int i13;
        int i14;
        String[] strArrSplit5;
        int length4;
        uw[] uwVarArr2;
        int i15;
        ByteBuffer byteBufferWrap4;
        int i16;
        String[] strArrSplit6;
        int length5;
        double[] dArr;
        int i17;
        ByteBuffer byteBufferWrap5;
        int i18;
        String str4 = str;
        String strReplaceAll = str2;
        if (("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) && strReplaceAll != null) {
            boolean zFind = d.matcher(strReplaceAll).find();
            boolean zFind2 = e.matcher(strReplaceAll).find();
            if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                tvj.g("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str4)) {
            str4 = "PhotographicSensitivity";
        }
        String str5 = str4;
        int i19 = 3;
        int i20 = 2;
        int i21 = 1;
        if (strReplaceAll != null && le6.e.contains(str5)) {
            if (str5.equals("GPSTimeStamp")) {
                Matcher matcher = c.matcher(strReplaceAll);
                if (!matcher.find()) {
                    tvj.g("ExifData", "Invalid value for " + str5 + " : " + strReplaceAll);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                String strGroup = matcher.group(1);
                strGroup.getClass();
                sb.append(Integer.parseInt(strGroup));
                sb.append("/1,");
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                sb.append(Integer.parseInt(strGroup2));
                sb.append("/1,");
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                sb.append(Integer.parseInt(strGroup3));
                sb.append("/1");
                strReplaceAll = sb.toString();
            } else {
                try {
                    strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                } catch (NumberFormatException e2) {
                    tvj.i("ExifData", qv1.l("Invalid value for ", str5, " : ", strReplaceAll), e2);
                    return;
                }
            }
        }
        int i22 = 0;
        int i23 = 0;
        while (true) {
            ue6[] ue6VarArr = le6.c;
            if (i23 >= 4) {
                return;
            }
            ue6 ue6Var = (ue6) ((HashMap) f.get(i23)).get(str5);
            if (ue6Var != null) {
                int i24 = ue6Var.d;
                int i25 = ue6Var.c;
                if (strReplaceAll != null) {
                    Pair pairA = a(strReplaceAll);
                    int i26 = -1;
                    if (i25 == ((Integer) pairA.first).intValue() || i25 == ((Integer) pairA.second).intValue()) {
                        i24 = i25;
                        byteOrder = this.b;
                        switch (i24) {
                            case 1:
                                str3 = str5;
                                int i27 = i21;
                                i20 = i20;
                                i2 = i19;
                                Map map = (Map) list.get(i23);
                                Charset charset = he6.d;
                                i = i27;
                                if (strReplaceAll.length() == i) {
                                    i22 = 0;
                                    if (strReplaceAll.charAt(0) < '0' && strReplaceAll.charAt(0) <= '1') {
                                        byte[] bArr = new byte[i];
                                        bArr[0] = (byte) (strReplaceAll.charAt(0) - '0');
                                        he6Var = new he6(i, bArr, i);
                                    }
                                    map.put(str3, he6Var);
                                } else {
                                    i22 = 0;
                                }
                                byte[] bytes = strReplaceAll.getBytes(he6.d);
                                he6Var = new he6(i, bytes, bytes.length);
                                map.put(str3, he6Var);
                                break;
                            case 2:
                            case 7:
                                i2 = i19;
                                str3 = str5;
                                int i28 = i21;
                                Map map2 = (Map) list.get(i23);
                                Charset charset2 = he6.d;
                                byte[] bytes2 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(he6.d);
                                i20 = 2;
                                map2.put(str3, new he6(2, bytes2, bytes2.length));
                                i = i28;
                                i22 = 0;
                                break;
                            case 3:
                                int i29 = i19;
                                str3 = str5;
                                int i30 = i21;
                                strArrSplit = strReplaceAll.split(",", -1);
                                length = strArrSplit.length;
                                iArr = new int[length];
                                while (i3 < strArrSplit.length) {
                                    iArr[i3] = Integer.parseInt(strArrSplit[i3]);
                                }
                                Map map3 = (Map) list.get(i23);
                                byteBufferWrap = ByteBuffer.wrap(new byte[he6.f[i29] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i4 < length) {
                                    byteBufferWrap.putShort((short) iArr[i4]);
                                }
                                i2 = i29;
                                map3.put(str3, new he6(i2, byteBufferWrap.array(), length));
                                i = i30;
                                i22 = 0;
                                i20 = 2;
                                break;
                            case 4:
                                str3 = str5;
                                i5 = i21;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i6 < strArrSplit2.length) {
                                    jArr[i6] = Long.parseLong(strArrSplit2[i6]);
                                }
                                ((Map) list.get(i23)).put(str3, he6.b(jArr, byteOrder));
                                i = i5;
                                i2 = i19;
                                i22 = 0;
                                i20 = 2;
                                break;
                            case 5:
                                i5 = i21;
                                i7 = -1;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit3.length;
                                uwVarArr = new uw[length2];
                                i8 = i22;
                                while (i8 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i8].split("/", i7);
                                    uwVarArr[i8] = new uw(4, (long) Double.parseDouble(strArrSplit7[i22]), (long) Double.parseDouble(strArrSplit7[i5]));
                                    i8++;
                                    length2 = length2;
                                    str5 = str5;
                                    i7 = -1;
                                    i22 = 0;
                                }
                                String str6 = str5;
                                i9 = length2;
                                Map map4 = (Map) list.get(i23);
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[he6.f[5] * i9]);
                                byteBufferWrap2.order(byteOrder);
                                while (i10 < i9) {
                                    uw uwVar = uwVarArr[i10];
                                    byteBufferWrap2.putInt((int) uwVar.b);
                                    byteBufferWrap2.putInt((int) uwVar.c);
                                }
                                he6 he6Var2 = new he6(5, byteBufferWrap2.array(), i9);
                                str3 = str6;
                                map4.put(str3, he6Var2);
                                i = i5;
                                i2 = i19;
                                i22 = 0;
                                i20 = 2;
                                break;
                            case 9:
                                i11 = i19;
                                int i31 = i21;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit4.length;
                                iArr2 = new int[length3];
                                while (i12 < strArrSplit4.length) {
                                    iArr2[i12] = Integer.parseInt(strArrSplit4[i12]);
                                }
                                Map map5 = (Map) list.get(i23);
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[he6.f[9] * length3]);
                                byteBufferWrap3.order(byteOrder);
                                while (i13 < length3) {
                                    byteBufferWrap3.putInt(iArr2[i13]);
                                }
                                map5.put(str5, new he6(9, byteBufferWrap3.array(), length3));
                                str3 = str5;
                                i = i31;
                                i2 = i11;
                                break;
                            case 10:
                                i14 = i21;
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length4 = strArrSplit5.length;
                                uwVarArr2 = new uw[length4];
                                i15 = i22;
                                while (i15 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i15].split("/", i26);
                                    int i32 = i15;
                                    uwVarArr2[i32] = new uw(4, (long) Double.parseDouble(strArrSplit8[i22]), (long) Double.parseDouble(strArrSplit8[i14]));
                                    i15 = i32 + 1;
                                    i19 = i19;
                                    strReplaceAll = strReplaceAll;
                                    i26 = -1;
                                }
                                i11 = i19;
                                String str7 = strReplaceAll;
                                Map map6 = (Map) list.get(i23);
                                byteBufferWrap4 = ByteBuffer.wrap(new byte[he6.f[10] * length4]);
                                byteBufferWrap4.order(byteOrder);
                                while (i16 < length4) {
                                    uw uwVar2 = uwVarArr2[i16];
                                    byteBufferWrap4.putInt((int) uwVar2.b);
                                    byteBufferWrap4.putInt((int) uwVar2.c);
                                }
                                map6.put(str5, new he6(10, byteBufferWrap4.array(), length4));
                                str3 = str5;
                                i = i14;
                                strReplaceAll = str7;
                                i2 = i11;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length5 = strArrSplit6.length;
                                dArr = new double[length5];
                                while (i17 < strArrSplit6.length) {
                                    dArr[i17] = Double.parseDouble(strArrSplit6[i17]);
                                }
                                Map map7 = (Map) list.get(i23);
                                byteBufferWrap5 = ByteBuffer.wrap(new byte[he6.f[12] * length5]);
                                byteBufferWrap5.order(byteOrder);
                                i18 = i22;
                                while (i18 < length5) {
                                    byteBufferWrap5.putDouble(dArr[i18]);
                                    i18++;
                                    i21 = i21;
                                }
                                map7.put(str5, new he6(12, byteBufferWrap5.array(), length5));
                                str3 = str5;
                                i = i21;
                                i20 = i20;
                                i2 = i19;
                                break;
                        }
                    } else if (i24 != -1 && (i24 == ((Integer) pairA.first).intValue() || i24 == ((Integer) pairA.second).intValue())) {
                        byteOrder = this.b;
                        switch (i24) {
                            case 1:
                                str3 = str5;
                                int i210 = i21;
                                i20 = i20;
                                i2 = i19;
                                Map map8 = (Map) list.get(i23);
                                Charset charset3 = he6.d;
                                i = i210;
                                if (strReplaceAll.length() == i) {
                                    i22 = 0;
                                    if (strReplaceAll.charAt(0) < '0') {
                                    }
                                    map8.put(str3, he6Var);
                                } else {
                                    i22 = 0;
                                }
                                byte[] bytes3 = strReplaceAll.getBytes(he6.d);
                                he6Var = new he6(i, bytes3, bytes3.length);
                                map8.put(str3, he6Var);
                                break;
                            case 2:
                            case 7:
                                i2 = i19;
                                str3 = str5;
                                int i211 = i21;
                                Map map9 = (Map) list.get(i23);
                                Charset charset4 = he6.d;
                                byte[] bytes4 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(he6.d);
                                i20 = 2;
                                map9.put(str3, new he6(2, bytes4, bytes4.length));
                                i = i211;
                                i22 = 0;
                                break;
                            case 3:
                                int i212 = i19;
                                str3 = str5;
                                int i33 = i21;
                                strArrSplit = strReplaceAll.split(",", -1);
                                length = strArrSplit.length;
                                iArr = new int[length];
                                for (i3 = 0; i3 < strArrSplit.length; i3++) {
                                    iArr[i3] = Integer.parseInt(strArrSplit[i3]);
                                }
                                Map map10 = (Map) list.get(i23);
                                byteBufferWrap = ByteBuffer.wrap(new byte[he6.f[i212] * length]);
                                byteBufferWrap.order(byteOrder);
                                for (i4 = 0; i4 < length; i4++) {
                                    byteBufferWrap.putShort((short) iArr[i4]);
                                }
                                i2 = i212;
                                map10.put(str3, new he6(i2, byteBufferWrap.array(), length));
                                i = i33;
                                i22 = 0;
                                i20 = 2;
                                break;
                            case 4:
                                str3 = str5;
                                i5 = i21;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i6 = 0; i6 < strArrSplit2.length; i6++) {
                                    jArr[i6] = Long.parseLong(strArrSplit2[i6]);
                                }
                                ((Map) list.get(i23)).put(str3, he6.b(jArr, byteOrder));
                                i = i5;
                                i2 = i19;
                                i22 = 0;
                                i20 = 2;
                                break;
                            case 5:
                                i5 = i21;
                                i7 = -1;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit3.length;
                                uwVarArr = new uw[length2];
                                i8 = i22;
                                while (i8 < strArrSplit3.length) {
                                    String[] strArrSplit9 = strArrSplit3[i8].split("/", i7);
                                    uwVarArr[i8] = new uw(4, (long) Double.parseDouble(strArrSplit9[i22]), (long) Double.parseDouble(strArrSplit9[i5]));
                                    i8++;
                                    length2 = length2;
                                    str5 = str5;
                                    i7 = -1;
                                    i22 = 0;
                                }
                                String str8 = str5;
                                i9 = length2;
                                Map map11 = (Map) list.get(i23);
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[he6.f[5] * i9]);
                                byteBufferWrap2.order(byteOrder);
                                for (i10 = 0; i10 < i9; i10++) {
                                    uw uwVar3 = uwVarArr[i10];
                                    byteBufferWrap2.putInt((int) uwVar3.b);
                                    byteBufferWrap2.putInt((int) uwVar3.c);
                                }
                                he6 he6Var3 = new he6(5, byteBufferWrap2.array(), i9);
                                str3 = str8;
                                map11.put(str3, he6Var3);
                                i = i5;
                                i2 = i19;
                                i22 = 0;
                                i20 = 2;
                                break;
                            case 9:
                                i11 = i19;
                                int i34 = i21;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit4.length;
                                iArr2 = new int[length3];
                                for (i12 = i22; i12 < strArrSplit4.length; i12++) {
                                    iArr2[i12] = Integer.parseInt(strArrSplit4[i12]);
                                }
                                Map map12 = (Map) list.get(i23);
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[he6.f[9] * length3]);
                                byteBufferWrap3.order(byteOrder);
                                for (i13 = i22; i13 < length3; i13++) {
                                    byteBufferWrap3.putInt(iArr2[i13]);
                                }
                                map12.put(str5, new he6(9, byteBufferWrap3.array(), length3));
                                str3 = str5;
                                i = i34;
                                i2 = i11;
                                break;
                            case 10:
                                i14 = i21;
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length4 = strArrSplit5.length;
                                uwVarArr2 = new uw[length4];
                                i15 = i22;
                                while (i15 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i15].split("/", i26);
                                    int i35 = i15;
                                    uwVarArr2[i35] = new uw(4, (long) Double.parseDouble(strArrSplit10[i22]), (long) Double.parseDouble(strArrSplit10[i14]));
                                    i15 = i35 + 1;
                                    i19 = i19;
                                    strReplaceAll = strReplaceAll;
                                    i26 = -1;
                                }
                                i11 = i19;
                                String str9 = strReplaceAll;
                                Map map13 = (Map) list.get(i23);
                                byteBufferWrap4 = ByteBuffer.wrap(new byte[he6.f[10] * length4]);
                                byteBufferWrap4.order(byteOrder);
                                for (i16 = i22; i16 < length4; i16++) {
                                    uw uwVar4 = uwVarArr2[i16];
                                    byteBufferWrap4.putInt((int) uwVar4.b);
                                    byteBufferWrap4.putInt((int) uwVar4.c);
                                }
                                map13.put(str5, new he6(10, byteBufferWrap4.array(), length4));
                                str3 = str5;
                                i = i14;
                                strReplaceAll = str9;
                                i2 = i11;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length5 = strArrSplit6.length;
                                dArr = new double[length5];
                                for (i17 = i22; i17 < strArrSplit6.length; i17++) {
                                    dArr[i17] = Double.parseDouble(strArrSplit6[i17]);
                                }
                                Map map14 = (Map) list.get(i23);
                                byteBufferWrap5 = ByteBuffer.wrap(new byte[he6.f[12] * length5]);
                                byteBufferWrap5.order(byteOrder);
                                i18 = i22;
                                while (i18 < length5) {
                                    byteBufferWrap5.putDouble(dArr[i18]);
                                    i18++;
                                    i21 = i21;
                                }
                                map14.put(str5, new he6(12, byteBufferWrap5.array(), length5));
                                str3 = str5;
                                i = i21;
                                i20 = i20;
                                i2 = i19;
                                break;
                        }
                    } else {
                        if (i25 == i21 || i25 == 7 || i25 == i20) {
                            i24 = i25;
                            byteOrder = this.b;
                            switch (i24) {
                                case 1:
                                    str3 = str5;
                                    int i213 = i21;
                                    i20 = i20;
                                    i2 = i19;
                                    Map map15 = (Map) list.get(i23);
                                    Charset charset5 = he6.d;
                                    i = i213;
                                    if (strReplaceAll.length() == i) {
                                        i22 = 0;
                                        if (strReplaceAll.charAt(0) < '0') {
                                        }
                                        map15.put(str3, he6Var);
                                    } else {
                                        i22 = 0;
                                    }
                                    byte[] bytes5 = strReplaceAll.getBytes(he6.d);
                                    he6Var = new he6(i, bytes5, bytes5.length);
                                    map15.put(str3, he6Var);
                                    break;
                                case 2:
                                case 7:
                                    i2 = i19;
                                    str3 = str5;
                                    int i214 = i21;
                                    Map map16 = (Map) list.get(i23);
                                    Charset charset6 = he6.d;
                                    byte[] bytes6 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(he6.d);
                                    i20 = 2;
                                    map16.put(str3, new he6(2, bytes6, bytes6.length));
                                    i = i214;
                                    i22 = 0;
                                    break;
                                case 3:
                                    int i215 = i19;
                                    str3 = str5;
                                    int i36 = i21;
                                    strArrSplit = strReplaceAll.split(",", -1);
                                    length = strArrSplit.length;
                                    iArr = new int[length];
                                    while (i3 < strArrSplit.length) {
                                        iArr[i3] = Integer.parseInt(strArrSplit[i3]);
                                    }
                                    Map map17 = (Map) list.get(i23);
                                    byteBufferWrap = ByteBuffer.wrap(new byte[he6.f[i215] * length]);
                                    byteBufferWrap.order(byteOrder);
                                    while (i4 < length) {
                                        byteBufferWrap.putShort((short) iArr[i4]);
                                    }
                                    i2 = i215;
                                    map17.put(str3, new he6(i2, byteBufferWrap.array(), length));
                                    i = i36;
                                    i22 = 0;
                                    i20 = 2;
                                    break;
                                case 4:
                                    str3 = str5;
                                    i5 = i21;
                                    strArrSplit2 = strReplaceAll.split(",", -1);
                                    jArr = new long[strArrSplit2.length];
                                    while (i6 < strArrSplit2.length) {
                                        jArr[i6] = Long.parseLong(strArrSplit2[i6]);
                                    }
                                    ((Map) list.get(i23)).put(str3, he6.b(jArr, byteOrder));
                                    i = i5;
                                    i2 = i19;
                                    i22 = 0;
                                    i20 = 2;
                                    break;
                                case 5:
                                    i5 = i21;
                                    i7 = -1;
                                    strArrSplit3 = strReplaceAll.split(",", -1);
                                    length2 = strArrSplit3.length;
                                    uwVarArr = new uw[length2];
                                    i8 = i22;
                                    while (i8 < strArrSplit3.length) {
                                        String[] strArrSplit11 = strArrSplit3[i8].split("/", i7);
                                        uwVarArr[i8] = new uw(4, (long) Double.parseDouble(strArrSplit11[i22]), (long) Double.parseDouble(strArrSplit11[i5]));
                                        i8++;
                                        length2 = length2;
                                        str5 = str5;
                                        i7 = -1;
                                        i22 = 0;
                                    }
                                    String str10 = str5;
                                    i9 = length2;
                                    Map map18 = (Map) list.get(i23);
                                    byteBufferWrap2 = ByteBuffer.wrap(new byte[he6.f[5] * i9]);
                                    byteBufferWrap2.order(byteOrder);
                                    while (i10 < i9) {
                                        uw uwVar5 = uwVarArr[i10];
                                        byteBufferWrap2.putInt((int) uwVar5.b);
                                        byteBufferWrap2.putInt((int) uwVar5.c);
                                    }
                                    he6 he6Var4 = new he6(5, byteBufferWrap2.array(), i9);
                                    str3 = str10;
                                    map18.put(str3, he6Var4);
                                    i = i5;
                                    i2 = i19;
                                    i22 = 0;
                                    i20 = 2;
                                    break;
                                case 9:
                                    i11 = i19;
                                    int i37 = i21;
                                    strArrSplit4 = strReplaceAll.split(",", -1);
                                    length3 = strArrSplit4.length;
                                    iArr2 = new int[length3];
                                    while (i12 < strArrSplit4.length) {
                                        iArr2[i12] = Integer.parseInt(strArrSplit4[i12]);
                                    }
                                    Map map19 = (Map) list.get(i23);
                                    byteBufferWrap3 = ByteBuffer.wrap(new byte[he6.f[9] * length3]);
                                    byteBufferWrap3.order(byteOrder);
                                    while (i13 < length3) {
                                        byteBufferWrap3.putInt(iArr2[i13]);
                                    }
                                    map19.put(str5, new he6(9, byteBufferWrap3.array(), length3));
                                    str3 = str5;
                                    i = i37;
                                    i2 = i11;
                                    break;
                                case 10:
                                    i14 = i21;
                                    strArrSplit5 = strReplaceAll.split(",", -1);
                                    length4 = strArrSplit5.length;
                                    uwVarArr2 = new uw[length4];
                                    i15 = i22;
                                    while (i15 < strArrSplit5.length) {
                                        String[] strArrSplit12 = strArrSplit5[i15].split("/", i26);
                                        int i38 = i15;
                                        uwVarArr2[i38] = new uw(4, (long) Double.parseDouble(strArrSplit12[i22]), (long) Double.parseDouble(strArrSplit12[i14]));
                                        i15 = i38 + 1;
                                        i19 = i19;
                                        strReplaceAll = strReplaceAll;
                                        i26 = -1;
                                    }
                                    i11 = i19;
                                    String str11 = strReplaceAll;
                                    Map map110 = (Map) list.get(i23);
                                    byteBufferWrap4 = ByteBuffer.wrap(new byte[he6.f[10] * length4]);
                                    byteBufferWrap4.order(byteOrder);
                                    while (i16 < length4) {
                                        uw uwVar6 = uwVarArr2[i16];
                                        byteBufferWrap4.putInt((int) uwVar6.b);
                                        byteBufferWrap4.putInt((int) uwVar6.c);
                                    }
                                    map110.put(str5, new he6(10, byteBufferWrap4.array(), length4));
                                    str3 = str5;
                                    i = i14;
                                    strReplaceAll = str11;
                                    i2 = i11;
                                    break;
                                case 12:
                                    strArrSplit6 = strReplaceAll.split(",", -1);
                                    length5 = strArrSplit6.length;
                                    dArr = new double[length5];
                                    while (i17 < strArrSplit6.length) {
                                        dArr[i17] = Double.parseDouble(strArrSplit6[i17]);
                                    }
                                    Map map111 = (Map) list.get(i23);
                                    byteBufferWrap5 = ByteBuffer.wrap(new byte[he6.f[12] * length5]);
                                    byteBufferWrap5.order(byteOrder);
                                    i18 = i22;
                                    while (i18 < length5) {
                                        byteBufferWrap5.putDouble(dArr[i18]);
                                        i18++;
                                        i21 = i21;
                                    }
                                    map111.put(str5, new he6(12, byteBufferWrap5.array(), length5));
                                    str3 = str5;
                                    i = i21;
                                    break;
                            }
                        }
                        i20 = i20;
                        i2 = i19;
                    }
                } else {
                    ((Map) list.get(i23)).remove(str5);
                }
                str3 = str5;
                i = i21;
                i20 = i20;
                i2 = i19;
            } else {
                str3 = str5;
                i = i21;
                i20 = i20;
                i2 = i19;
            }
            i23++;
            int i39 = i22;
            str5 = str3;
            i22 = i39;
            i19 = i2;
            i20 = i20;
            i21 = i;
        }
    }

    public final void d(int i) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i == 90) {
            i2 = 6;
        } else if (i == 180) {
            i2 = 3;
        } else if (i != 270) {
            tvj.g("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
            i2 = 0;
        } else {
            i2 = 8;
        }
        c("Orientation", String.valueOf(i2), this.a);
    }
}
