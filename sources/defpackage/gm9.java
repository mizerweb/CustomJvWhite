package defpackage;

import androidx.datastore.preferences.protobuf.a;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gm9 {
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x0140  */
    /* JADX WARN: Code duplicated, block: B:50:0x0151  */
    /* JADX WARN: Code duplicated, block: B:51:0x0162  */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:56:0x017e  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX WARN: Code duplicated, block: B:59:0x018e  */
    /* JADX WARN: Code duplicated, block: B:61:0x019c  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01af  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01de  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0206  */
    /* JADX WARN: Code duplicated, block: B:80:0x013c A[SYNTHETIC] */
    public static int a(Object obj, int i, Object obj2) {
        int iO;
        int size;
        int iN;
        int i2;
        rxj rxjVar;
        int iM;
        int size2;
        int iN2;
        fm9 fm9Var = (fm9) obj;
        bm9 bm9Var = (bm9) obj2;
        if (fm9Var.isEmpty()) {
            return 0;
        }
        int iE = 0;
        for (Map.Entry entry : fm9Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            bm9Var.getClass();
            int iM2 = vu3.m(i);
            xtj xtjVar = bm9Var.a;
            rxj rxjVar2 = (rxj) xtjVar.b;
            int i3 = kp6.c;
            int iO2 = 1;
            int iM3 = vu3.m(1);
            oxj oxjVar = rxj.d;
            if (rxjVar2 == oxjVar) {
                iM3 *= 2;
            }
            switch (rxjVar2.ordinal()) {
                case 0:
                    ((Double) key).getClass();
                    iO = 8;
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i4 = iO2 + iM + i2;
                            iE = mw7.e(i4, i4, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i5 = iO2 + iM + i2;
                            iE = mw7.e(i5, i5, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i6 = iO2 + iM + i2;
                            iE = mw7.e(i6, i6, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i7 = iO2 + iM + i2;
                            iE = mw7.e(i7, i7, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i8 = iO2 + iM + i2;
                            iE = mw7.e(i8, i8, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i9 = iO2 + iM + i2;
                            iE = mw7.e(i9, i9, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i10 = iO2 + iM + i2;
                            iE = mw7.e(i10, i10, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11 = iO2 + iM + i2;
                            iE = mw7.e(i11, i11, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i12 = iO2 + iM + i2;
                            iE = mw7.e(i12, i12, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i13 = iO2 + iM + i2;
                            iE = mw7.e(i13, i13, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i14 = iO2 + iM + i2;
                            iE = mw7.e(i14, i14, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i15 = iO2 + iM + i2;
                            iE = mw7.e(i15, i15, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i16 = iO2 + iM + i2;
                            iE = mw7.e(i16, i16, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i17 = iO2 + iM + i2;
                            iE = mw7.e(i17, i17, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i18 = iO2 + iM + i2;
                            iE = mw7.e(i18, i18, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i19 = iO2 + iM + i2;
                            iE = mw7.e(i19, i19, iM2, iE);
                            break;
                        case 16:
                            int iIntValue = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue >> 31) ^ (iIntValue << 1));
                            int i110 = iO2 + iM + i2;
                            iE = mw7.e(i110, i110, iM2, iE);
                            break;
                        case 17:
                            long jLongValue = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue >> 63) ^ (jLongValue << 1));
                            int i111 = iO2 + iM + i2;
                            iE = mw7.e(i111, i111, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 1:
                    ((Float) key).getClass();
                    iO = 4;
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i112 = iO2 + iM + i2;
                            iE = mw7.e(i112, i112, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i113 = iO2 + iM + i2;
                            iE = mw7.e(i113, i113, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i114 = iO2 + iM + i2;
                            iE = mw7.e(i114, i114, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i115 = iO2 + iM + i2;
                            iE = mw7.e(i115, i115, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i116 = iO2 + iM + i2;
                            iE = mw7.e(i116, i116, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i117 = iO2 + iM + i2;
                            iE = mw7.e(i117, i117, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i118 = iO2 + iM + i2;
                            iE = mw7.e(i118, i118, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i119 = iO2 + iM + i2;
                            iE = mw7.e(i119, i119, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i1110 = iO2 + iM + i2;
                            iE = mw7.e(i1110, i1110, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i1111 = iO2 + iM + i2;
                            iE = mw7.e(i1111, i1111, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i1112 = iO2 + iM + i2;
                            iE = mw7.e(i1112, i1112, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i1113 = iO2 + iM + i2;
                            iE = mw7.e(i1113, i1113, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i1114 = iO2 + iM + i2;
                            iE = mw7.e(i1114, i1114, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i1115 = iO2 + iM + i2;
                            iE = mw7.e(i1115, i1115, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i1116 = iO2 + iM + i2;
                            iE = mw7.e(i1116, i1116, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1117 = iO2 + iM + i2;
                            iE = mw7.e(i1117, i1117, iM2, iE);
                            break;
                        case 16:
                            int iIntValue2 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                            int i1118 = iO2 + iM + i2;
                            iE = mw7.e(i1118, i1118, iM2, iE);
                            break;
                        case 17:
                            long jLongValue2 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                            int i1119 = iO2 + iM + i2;
                            iE = mw7.e(i1119, i1119, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 2:
                    iO = vu3.o(((Long) key).longValue());
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i11110 = iO2 + iM + i2;
                            iE = mw7.e(i11110, i11110, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i11111 = iO2 + iM + i2;
                            iE = mw7.e(i11111, i11111, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11112 = iO2 + iM + i2;
                            iE = mw7.e(i11112, i11112, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11113 = iO2 + iM + i2;
                            iE = mw7.e(i11113, i11113, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i11114 = iO2 + iM + i2;
                            iE = mw7.e(i11114, i11114, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i11115 = iO2 + iM + i2;
                            iE = mw7.e(i11115, i11115, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11116 = iO2 + iM + i2;
                            iE = mw7.e(i11116, i11116, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11117 = iO2 + iM + i2;
                            iE = mw7.e(i11117, i11117, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i11118 = iO2 + iM + i2;
                            iE = mw7.e(i11118, i11118, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i11119 = iO2 + iM + i2;
                            iE = mw7.e(i11119, i11119, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i111110 = iO2 + iM + i2;
                            iE = mw7.e(i111110, i111110, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i111111 = iO2 + iM + i2;
                            iE = mw7.e(i111111, i111111, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i111112 = iO2 + iM + i2;
                            iE = mw7.e(i111112, i111112, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111113 = iO2 + iM + i2;
                            iE = mw7.e(i111113, i111113, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i111114 = iO2 + iM + i2;
                            iE = mw7.e(i111114, i111114, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i111115 = iO2 + iM + i2;
                            iE = mw7.e(i111115, i111115, iM2, iE);
                            break;
                        case 16:
                            int iIntValue3 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                            int i111116 = iO2 + iM + i2;
                            iE = mw7.e(i111116, i111116, iM2, iE);
                            break;
                        case 17:
                            long jLongValue3 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                            int i111117 = iO2 + iM + i2;
                            iE = mw7.e(i111117, i111117, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 3:
                    iO = vu3.o(((Long) key).longValue());
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i111118 = iO2 + iM + i2;
                            iE = mw7.e(i111118, i111118, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i111119 = iO2 + iM + i2;
                            iE = mw7.e(i111119, i111119, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i1111110 = iO2 + iM + i2;
                            iE = mw7.e(i1111110, i1111110, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i1111111 = iO2 + iM + i2;
                            iE = mw7.e(i1111111, i1111111, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i1111112 = iO2 + iM + i2;
                            iE = mw7.e(i1111112, i1111112, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1111113 = iO2 + iM + i2;
                            iE = mw7.e(i1111113, i1111113, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i1111114 = iO2 + iM + i2;
                            iE = mw7.e(i1111114, i1111114, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111115 = iO2 + iM + i2;
                            iE = mw7.e(i1111115, i1111115, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i1111116 = iO2 + iM + i2;
                            iE = mw7.e(i1111116, i1111116, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i1111117 = iO2 + iM + i2;
                            iE = mw7.e(i1111117, i1111117, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i1111118 = iO2 + iM + i2;
                            iE = mw7.e(i1111118, i1111118, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i1111119 = iO2 + iM + i2;
                            iE = mw7.e(i1111119, i1111119, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i11111110 = iO2 + iM + i2;
                            iE = mw7.e(i11111110, i11111110, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i11111111 = iO2 + iM + i2;
                            iE = mw7.e(i11111111, i11111111, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11111112 = iO2 + iM + i2;
                            iE = mw7.e(i11111112, i11111112, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i11111113 = iO2 + iM + i2;
                            iE = mw7.e(i11111113, i11111113, iM2, iE);
                            break;
                        case 16:
                            int iIntValue4 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                            int i11111114 = iO2 + iM + i2;
                            iE = mw7.e(i11111114, i11111114, iM2, iE);
                            break;
                        case 17:
                            long jLongValue4 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                            int i11111115 = iO2 + iM + i2;
                            iE = mw7.e(i11111115, i11111115, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 4:
                    iO = vu3.k(((Integer) key).intValue());
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i11111116 = iO2 + iM + i2;
                            iE = mw7.e(i11111116, i11111116, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i11111117 = iO2 + iM + i2;
                            iE = mw7.e(i11111117, i11111117, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11111118 = iO2 + iM + i2;
                            iE = mw7.e(i11111118, i11111118, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11111119 = iO2 + iM + i2;
                            iE = mw7.e(i11111119, i11111119, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111111110 = iO2 + iM + i2;
                            iE = mw7.e(i111111110, i111111110, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i111111111 = iO2 + iM + i2;
                            iE = mw7.e(i111111111, i111111111, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i111111112 = iO2 + iM + i2;
                            iE = mw7.e(i111111112, i111111112, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111113 = iO2 + iM + i2;
                            iE = mw7.e(i111111113, i111111113, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i111111114 = iO2 + iM + i2;
                            iE = mw7.e(i111111114, i111111114, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i111111115 = iO2 + iM + i2;
                            iE = mw7.e(i111111115, i111111115, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i111111116 = iO2 + iM + i2;
                            iE = mw7.e(i111111116, i111111116, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i111111117 = iO2 + iM + i2;
                            iE = mw7.e(i111111117, i111111117, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i111111118 = iO2 + iM + i2;
                            iE = mw7.e(i111111118, i111111118, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111111119 = iO2 + iM + i2;
                            iE = mw7.e(i111111119, i111111119, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i1111111110 = iO2 + iM + i2;
                            iE = mw7.e(i1111111110, i1111111110, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1111111111 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111, i1111111111, iM2, iE);
                            break;
                        case 16:
                            int iIntValue5 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                            int i1111111112 = iO2 + iM + i2;
                            iE = mw7.e(i1111111112, i1111111112, iM2, iE);
                            break;
                        case 17:
                            long jLongValue5 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                            int i1111111113 = iO2 + iM + i2;
                            iE = mw7.e(i1111111113, i1111111113, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 5:
                    ((Long) key).getClass();
                    iO = 8;
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i1111111114 = iO2 + iM + i2;
                            iE = mw7.e(i1111111114, i1111111114, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i1111111115 = iO2 + iM + i2;
                            iE = mw7.e(i1111111115, i1111111115, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i1111111116 = iO2 + iM + i2;
                            iE = mw7.e(i1111111116, i1111111116, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i1111111117 = iO2 + iM + i2;
                            iE = mw7.e(i1111111117, i1111111117, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i1111111118 = iO2 + iM + i2;
                            iE = mw7.e(i1111111118, i1111111118, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1111111119 = iO2 + iM + i2;
                            iE = mw7.e(i1111111119, i1111111119, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11111111110 = iO2 + iM + i2;
                            iE = mw7.e(i11111111110, i11111111110, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111, i11111111111, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i11111111112 = iO2 + iM + i2;
                            iE = mw7.e(i11111111112, i11111111112, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i11111111113 = iO2 + iM + i2;
                            iE = mw7.e(i11111111113, i11111111113, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i11111111114 = iO2 + iM + i2;
                            iE = mw7.e(i11111111114, i11111111114, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i11111111115 = iO2 + iM + i2;
                            iE = mw7.e(i11111111115, i11111111115, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i11111111116 = iO2 + iM + i2;
                            iE = mw7.e(i11111111116, i11111111116, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i11111111117 = iO2 + iM + i2;
                            iE = mw7.e(i11111111117, i11111111117, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11111111118 = iO2 + iM + i2;
                            iE = mw7.e(i11111111118, i11111111118, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i11111111119 = iO2 + iM + i2;
                            iE = mw7.e(i11111111119, i11111111119, iM2, iE);
                            break;
                        case 16:
                            int iIntValue6 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                            int i111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i111111111110, i111111111110, iM2, iE);
                            break;
                        case 17:
                            long jLongValue6 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                            int i111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111, i111111111111, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 6:
                    ((Integer) key).getClass();
                    iO = 4;
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i111111111112, i111111111112, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i111111111113, i111111111113, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i111111111114, i111111111114, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i111111111115, i111111111115, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i111111111116, i111111111116, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i111111111117, i111111111117, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i111111111118, i111111111118, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i111111111119, i111111111119, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i1111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111110, i1111111111110, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i1111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111, i1111111111111, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i1111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111112, i1111111111112, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i1111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111113, i1111111111113, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i1111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111114, i1111111111114, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i1111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111115, i1111111111115, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i1111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111116, i1111111111116, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111117, i1111111111117, iM2, iE);
                            break;
                        case 16:
                            int iIntValue7 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                            int i1111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111118, i1111111111118, iM2, iE);
                            break;
                        case 17:
                            long jLongValue7 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                            int i1111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111119, i1111111111119, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 7:
                    ((Boolean) key).getClass();
                    iO = 1;
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i11111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111110, i11111111111110, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i11111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111, i11111111111111, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111112, i11111111111112, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111113, i11111111111113, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i11111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111114, i11111111111114, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i11111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111115, i11111111111115, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111116, i11111111111116, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111117, i11111111111117, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i11111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111118, i11111111111118, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i11111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111119, i11111111111119, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111110, i111111111111110, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111, i111111111111111, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111112, i111111111111112, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111113, i111111111111113, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111114, i111111111111114, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111115, i111111111111115, iM2, iE);
                            break;
                        case 16:
                            int iIntValue8 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                            int i111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111116, i111111111111116, iM2, iE);
                            break;
                        case 17:
                            long jLongValue8 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                            int i111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111117, i111111111111117, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 8:
                    if (key instanceof c71) {
                        size = ((c71) key).size();
                        iN = vu3.n(size);
                        iO = size + iN;
                    } else {
                        iO = vu3.l((String) key);
                    }
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111118, i111111111111118, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111119, i111111111111119, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i1111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111110, i1111111111111110, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i1111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111, i1111111111111111, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i1111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111112, i1111111111111112, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111113, i1111111111111113, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i1111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111114, i1111111111111114, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111115, i1111111111111115, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i1111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111116, i1111111111111116, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i1111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111117, i1111111111111117, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i1111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111118, i1111111111111118, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i1111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111119, i1111111111111119, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i11111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111110, i11111111111111110, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i11111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111, i11111111111111111, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111112, i11111111111111112, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i11111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111113, i11111111111111113, iM2, iE);
                            break;
                        case 16:
                            int iIntValue9 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                            int i11111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111114, i11111111111111114, iM2, iE);
                            break;
                        case 17:
                            long jLongValue9 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                            int i11111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111115, i11111111111111115, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 9:
                    iO = ((a) key).a();
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i11111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111116, i11111111111111116, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i11111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111117, i11111111111111117, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111118, i11111111111111118, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111119, i11111111111111119, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111110, i111111111111111110, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111, i111111111111111111, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111112, i111111111111111112, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111113, i111111111111111113, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111114, i111111111111111114, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111115, i111111111111111115, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111116, i111111111111111116, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111117, i111111111111111117, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111118, i111111111111111118, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111119, i111111111111111119, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i1111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111110, i1111111111111111110, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111, i1111111111111111111, iM2, iE);
                            break;
                        case 16:
                            int iIntValue10 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                            int i1111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111112, i1111111111111111112, iM2, iE);
                            break;
                        case 17:
                            long jLongValue10 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                            int i1111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111113, i1111111111111111113, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 10:
                    size = ((a) key).a();
                    iN = vu3.n(size);
                    iO = size + iN;
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i1111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111114, i1111111111111111114, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i1111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111115, i1111111111111111115, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i1111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111116, i1111111111111111116, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i1111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111117, i1111111111111111117, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i1111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111118, i1111111111111111118, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111119, i1111111111111111119, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111110, i11111111111111111110, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111, i11111111111111111111, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i11111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111112, i11111111111111111112, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i11111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111113, i11111111111111111113, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i11111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111114, i11111111111111111114, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i11111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111115, i11111111111111111115, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i11111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111116, i11111111111111111116, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i11111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111117, i11111111111111111117, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111118, i11111111111111111118, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i11111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111119, i11111111111111111119, iM2, iE);
                            break;
                        case 16:
                            int iIntValue11 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                            int i111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111110, i111111111111111111110, iM2, iE);
                            break;
                        case 17:
                            long jLongValue11 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                            int i111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111, i111111111111111111111, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 11:
                    if (key instanceof c71) {
                        size = ((c71) key).size();
                        iN = vu3.n(size);
                    } else {
                        size = ((byte[]) key).length;
                        iN = vu3.n(size);
                    }
                    iO = size + iN;
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111112, i111111111111111111112, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111113, i111111111111111111113, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111114, i111111111111111111114, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111115, i111111111111111111115, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111116, i111111111111111111116, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111117, i111111111111111111117, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i111111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111118, i111111111111111111118, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111119, i111111111111111111119, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i1111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111110, i1111111111111111111110, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i1111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111, i1111111111111111111111, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i1111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111112, i1111111111111111111112, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i1111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111113, i1111111111111111111113, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i1111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111114, i1111111111111111111114, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i1111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111115, i1111111111111111111115, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i1111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111116, i1111111111111111111116, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111117, i1111111111111111111117, iM2, iE);
                            break;
                        case 16:
                            int iIntValue12 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                            int i1111111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111118, i1111111111111111111118, iM2, iE);
                            break;
                        case 17:
                            long jLongValue12 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                            int i1111111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111119, i1111111111111111111119, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 12:
                    iO = vu3.n(((Integer) key).intValue());
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i11111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111110, i11111111111111111111110, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i11111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111, i11111111111111111111111, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111112, i11111111111111111111112, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111113, i11111111111111111111113, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i11111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111114, i11111111111111111111114, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i11111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111115, i11111111111111111111115, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111116, i11111111111111111111116, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111117, i11111111111111111111117, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i11111111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111118, i11111111111111111111118, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i11111111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111119, i11111111111111111111119, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i111111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111110, i111111111111111111111110, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i111111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111, i111111111111111111111111, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i111111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111112, i111111111111111111111112, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111113, i111111111111111111111113, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i111111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111114, i111111111111111111111114, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i111111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111115, i111111111111111111111115, iM2, iE);
                            break;
                        case 16:
                            int iIntValue13 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                            int i111111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111116, i111111111111111111111116, iM2, iE);
                            break;
                        case 17:
                            long jLongValue13 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                            int i111111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111117, i111111111111111111111117, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 13:
                    iO = vu3.k(((Integer) key).intValue());
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i111111111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111118, i111111111111111111111118, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i111111111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111119, i111111111111111111111119, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i1111111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111110, i1111111111111111111111110, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i1111111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111, i1111111111111111111111111, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i1111111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111112, i1111111111111111111111112, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1111111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111113, i1111111111111111111111113, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i1111111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111114, i1111111111111111111111114, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111115, i1111111111111111111111115, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i1111111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111116, i1111111111111111111111116, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i1111111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111117, i1111111111111111111111117, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i1111111111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111118, i1111111111111111111111118, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i1111111111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111119, i1111111111111111111111119, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i11111111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111110, i11111111111111111111111110, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i11111111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111, i11111111111111111111111111, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11111111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111112, i11111111111111111111111112, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i11111111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111113, i11111111111111111111111113, iM2, iE);
                            break;
                        case 16:
                            int iIntValue14 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                            int i11111111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111114, i11111111111111111111111114, iM2, iE);
                            break;
                        case 17:
                            long jLongValue14 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                            int i11111111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111115, i11111111111111111111111115, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 14:
                    ((Integer) key).getClass();
                    iO = 4;
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i11111111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111116, i11111111111111111111111116, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i11111111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111117, i11111111111111111111111117, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11111111111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111118, i11111111111111111111111118, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11111111111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111119, i11111111111111111111111119, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111111111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111110, i111111111111111111111111110, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i111111111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111, i111111111111111111111111111, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i111111111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111112, i111111111111111111111111112, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111113, i111111111111111111111111113, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i111111111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111114, i111111111111111111111111114, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i111111111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111115, i111111111111111111111111115, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i111111111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111116, i111111111111111111111111116, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i111111111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111117, i111111111111111111111111117, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i111111111111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111118, i111111111111111111111111118, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111111111111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111119, i111111111111111111111111119, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i1111111111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111110, i1111111111111111111111111110, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1111111111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111111, i1111111111111111111111111111, iM2, iE);
                            break;
                        case 16:
                            int iIntValue15 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                            int i1111111111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111112, i1111111111111111111111111112, iM2, iE);
                            break;
                        case 17:
                            long jLongValue15 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                            int i1111111111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111113, i1111111111111111111111111113, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 15:
                    ((Long) key).getClass();
                    iO = 8;
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i1111111111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111114, i1111111111111111111111111114, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i1111111111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111115, i1111111111111111111111111115, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i1111111111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111116, i1111111111111111111111111116, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i1111111111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111117, i1111111111111111111111111117, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i1111111111111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111118, i1111111111111111111111111118, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1111111111111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111119, i1111111111111111111111111119, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11111111111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111110, i11111111111111111111111111110, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111111, i11111111111111111111111111111, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i11111111111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111112, i11111111111111111111111111112, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i11111111111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111113, i11111111111111111111111111113, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i11111111111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111114, i11111111111111111111111111114, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i11111111111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111115, i11111111111111111111111111115, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i11111111111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111116, i11111111111111111111111111116, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i11111111111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111117, i11111111111111111111111111117, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11111111111111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111118, i11111111111111111111111111118, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i11111111111111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111119, i11111111111111111111111111119, iM2, iE);
                            break;
                        case 16:
                            int iIntValue16 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                            int i111111111111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111110, i111111111111111111111111111110, iM2, iE);
                            break;
                        case 17:
                            long jLongValue16 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                            int i111111111111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111111, i111111111111111111111111111111, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 16:
                    int iIntValue17 = ((Integer) key).intValue();
                    iO = vu3.n((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i111111111111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111112, i111111111111111111111111111112, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i111111111111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111113, i111111111111111111111111111113, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i111111111111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111114, i111111111111111111111111111114, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i111111111111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111115, i111111111111111111111111111115, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111111111111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111116, i111111111111111111111111111116, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i111111111111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111117, i111111111111111111111111111117, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i111111111111111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111118, i111111111111111111111111111118, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111119, i111111111111111111111111111119, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i1111111111111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111111110, i1111111111111111111111111111110, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i1111111111111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111111111, i1111111111111111111111111111111, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i1111111111111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111111112, i1111111111111111111111111111112, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i1111111111111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111111113, i1111111111111111111111111111113, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i1111111111111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111111114, i1111111111111111111111111111114, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i1111111111111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111111115, i1111111111111111111111111111115, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i1111111111111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111111116, i1111111111111111111111111111116, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i1111111111111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111111117, i1111111111111111111111111111117, iM2, iE);
                            break;
                        case 16:
                            int iIntValue18 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                            int i1111111111111111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111111118, i1111111111111111111111111111118, iM2, iE);
                            break;
                        case 17:
                            long jLongValue17 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                            int i1111111111111111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i1111111111111111111111111111119, i1111111111111111111111111111119, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 17:
                    long jLongValue18 = ((Long) key).longValue();
                    iO = vu3.o((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                    i2 = iO + iM3;
                    rxjVar = (rxj) xtjVar.c;
                    iM = vu3.m(2);
                    if (rxjVar == oxjVar) {
                        iM *= 2;
                    }
                    switch (rxjVar.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iO2 = 8;
                            int i11111111111111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111111110, i11111111111111111111111111111110, iM2, iE);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iO2 = 4;
                            int i11111111111111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111111111, i11111111111111111111111111111111, iM2, iE);
                            break;
                        case 2:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11111111111111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111111112, i11111111111111111111111111111112, iM2, iE);
                            break;
                        case 3:
                            iO2 = vu3.o(((Long) value).longValue());
                            int i11111111111111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111111113, i11111111111111111111111111111113, iM2, iE);
                            break;
                        case 4:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i11111111111111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111111114, i11111111111111111111111111111114, iM2, iE);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i11111111111111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111111115, i11111111111111111111111111111115, iM2, iE);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i11111111111111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111111116, i11111111111111111111111111111116, iM2, iE);
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111111117, i11111111111111111111111111111117, iM2, iE);
                            break;
                        case 8:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                            } else {
                                iO2 = vu3.l((String) value);
                            }
                            int i11111111111111111111111111111118 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111111118, i11111111111111111111111111111118, iM2, iE);
                            break;
                        case 9:
                            iO2 = ((a) value).a();
                            int i11111111111111111111111111111119 = iO2 + iM + i2;
                            iE = mw7.e(i11111111111111111111111111111119, i11111111111111111111111111111119, iM2, iE);
                            break;
                        case 10:
                            size2 = ((a) value).a();
                            iN2 = vu3.n(size2);
                            iO2 = iN2 + size2;
                            int i111111111111111111111111111111110 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111111110, i111111111111111111111111111111110, iM2, iE);
                            break;
                        case 11:
                            if (value instanceof c71) {
                                size2 = ((c71) value).size();
                                iN2 = vu3.n(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                iN2 = vu3.n(size2);
                            }
                            iO2 = iN2 + size2;
                            int i111111111111111111111111111111111 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111111111, i111111111111111111111111111111111, iM2, iE);
                            break;
                        case 12:
                            iO2 = vu3.n(((Integer) value).intValue());
                            int i111111111111111111111111111111112 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111111112, i111111111111111111111111111111112, iM2, iE);
                            break;
                        case 13:
                            iO2 = vu3.k(((Integer) value).intValue());
                            int i111111111111111111111111111111113 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111111113, i111111111111111111111111111111113, iM2, iE);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iO2 = 4;
                            int i111111111111111111111111111111114 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111111114, i111111111111111111111111111111114, iM2, iE);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iO2 = 8;
                            int i111111111111111111111111111111115 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111111115, i111111111111111111111111111111115, iM2, iE);
                            break;
                        case 16:
                            int iIntValue19 = ((Integer) value).intValue();
                            iO2 = vu3.n((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                            int i111111111111111111111111111111116 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111111116, i111111111111111111111111111111116, iM2, iE);
                            break;
                        case 17:
                            long jLongValue19 = ((Long) value).longValue();
                            iO2 = vu3.o((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                            int i111111111111111111111111111111117 = iO2 + iM + i2;
                            iE = mw7.e(i111111111111111111111111111111117, i111111111111111111111111111111117, iM2, iE);
                            break;
                        default:
                            ore.q("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                default:
                    ore.q("There is no way to get here, but the compiler thinks otherwise.");
                    return 0;
            }
        }
        return iE;
    }

    public static fm9 b(Object obj, Object obj2) {
        fm9 fm9VarB = (fm9) obj;
        fm9 fm9Var = (fm9) obj2;
        if (!fm9Var.isEmpty()) {
            if (!fm9VarB.a) {
                fm9VarB = fm9VarB.b();
            }
            fm9VarB.a();
            if (!fm9Var.isEmpty()) {
                fm9VarB.putAll(fm9Var);
            }
        }
        return fm9VarB;
    }
}
