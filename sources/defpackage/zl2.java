package defpackage;

import android.view.View;
import android.view.Window;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zl2 implements s72 {
    public static final float[] a = new float[0];

    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public static List a(float[] fArr, boolean z) {
        ?? SingletonList;
        int length = fArr.length;
        r66 r66Var = r66.a;
        if (length == 0) {
            return r66Var;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < fArr.length) {
            int length2 = fArr.length - i;
            if (length2 == 1 || (z && i == 0)) {
                arrayList.add(0, new kv3(new float[]{fArr[i]}));
                i++;
            } else if (length2 % 3 == 0) {
                if (i < 0) {
                    c.o(c0a.k(i, "Requested element count ", " is less than zero."));
                    return null;
                }
                int length3 = fArr.length - i;
                if (length3 < 0) {
                    length3 = 0;
                }
                if (length3 < 0) {
                    c.o(c0a.k(length3, "Requested element count ", " is less than zero."));
                    return null;
                }
                if (length3 != 0) {
                    int length4 = fArr.length;
                    if (length3 >= length4) {
                        int length5 = fArr.length;
                        if (length5 == 0) {
                            SingletonList = r66Var;
                        } else if (length5 != 1) {
                            SingletonList = new ArrayList(fArr.length);
                            for (float f : fArr) {
                                SingletonList.add(Float.valueOf(f));
                            }
                        } else {
                            SingletonList = Collections.singletonList(Float.valueOf(fArr[0]));
                        }
                    } else if (length3 == 1) {
                        SingletonList = Collections.singletonList(Float.valueOf(fArr[length4 - 1]));
                    } else {
                        ArrayList arrayList2 = new ArrayList(length3);
                        for (int i2 = length4 - length3; i2 < length4; i2++) {
                            arrayList2.add(Float.valueOf(fArr[i2]));
                        }
                        SingletonList = arrayList2;
                    }
                } else {
                    SingletonList = r66Var;
                }
                Iterator it = ww3.Y1((Iterable) SingletonList, 3, 3).iterator();
                while (it.hasNext()) {
                    arrayList.add(new kv3(ww3.Q1((List) it.next())));
                    i += 3;
                }
            } else if (length2 >= 2) {
                arrayList.add(new kv3(new float[]{fArr[i], fArr[i + 1]}));
                i += 2;
            }
        }
        return arrayList;
    }

    public static void b(Window window) {
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
    }

    public static void c(Writer writer, String str) throws IOException {
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\\' || cCharAt == '\"' || cCharAt <= 31) {
                if (i2 > i) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(92);
                if (cCharAt == '\f') {
                    writer.write(102);
                } else if (cCharAt == '\r') {
                    writer.write(114);
                } else if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            writer.write(98);
                            break;
                        case '\t':
                            writer.write(116);
                            break;
                        case '\n':
                            writer.write(110);
                            break;
                        default:
                            writer.write(117);
                            writer.write(k1m.a((cCharAt >> '\f') & 15));
                            writer.write(k1m.a((cCharAt >> '\b') & 15));
                            writer.write(k1m.a((cCharAt >> 4) & 15));
                            writer.write(k1m.a(cCharAt & 15));
                            break;
                    }
                } else {
                    writer.write(cCharAt);
                }
                i = i2 + 1;
            }
        }
        if (length > i) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }
}
