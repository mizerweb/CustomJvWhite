package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yvl {
    public static void a(int i, Collection collection) {
        boolean zContains = collection.contains(Integer.valueOf(i));
        Locale locale = Locale.US;
        String strB = b(i);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(b(((Integer) it.next()).intValue()));
        }
        qyj.h(nbh.w("Effects target ", strB, " is not in the supported list ", "[" + String.join(", ", arrayList) + "]", "."), zContains);
    }

    public static String b(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }
}
