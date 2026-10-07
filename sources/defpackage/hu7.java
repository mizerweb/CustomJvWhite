package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class hu7 implements Iterable, uv8 {
    public final String[] a;

    public hu7(String[] strArr) {
        this.a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.a;
        int length = strArr.length - 2;
        int iS = wk8.s(length, 0, -2);
        if (iS > length) {
            return null;
        }
        while (!z5h.G0(str, strArr[length], true)) {
            if (length == iS) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        return this.a[i * 2];
    }

    public final p3c c() {
        p3c p3cVar = new p3c(10);
        cx3.a1((ArrayList) p3cVar.b, this.a);
        return p3cVar;
    }

    public final TreeMap d() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String lowerCase = b(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(f(i));
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hu7) {
            return Arrays.equals(this.a, ((hu7) obj).a);
        }
        return false;
    }

    public final String f(int i) {
        return this.a[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        ylc[] ylcVarArr = new ylc[size];
        for (int i = 0; i < size; i++) {
            ylcVarArr[i] = new ylc(b(i), f(i));
        }
        return new y1(1, ylcVarArr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strB = b(i);
            String strF = f(i);
            sb.append(strB);
            sb.append(": ");
            if (uqi.q(strB)) {
                strF = "██";
            }
            sb.append(strF);
            sb.append("\n");
        }
        return sb.toString();
    }
}
