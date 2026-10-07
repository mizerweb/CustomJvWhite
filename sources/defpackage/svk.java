package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class svk {
    public static final String a(String str) {
        List listN1;
        if (!str.endsWith(".png")) {
            return null;
        }
        List listM1 = r5h.m1(str, new String[]{"_"}, 6);
        if (listM1.isEmpty()) {
            listN1 = r66.a;
        } else {
            ListIterator listIterator = listM1.listIterator(listM1.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listN1 = ww3.N1(listM1, listIterator.nextIndex() + 1);
                }
            }
            listN1 = r66.a;
        }
        return (String) listN1.get(1);
    }
}
