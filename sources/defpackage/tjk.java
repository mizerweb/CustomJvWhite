package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tjk {
    public final File a = new File("/proc/self/stat");

    public static final String a(int i, List list) {
        if (i >= 3) {
            return (String) list.get(i - 3);
        }
        ore.p("Tail index starts from field 3");
        return null;
    }

    public final rjk b() {
        String string = r5h.y1(lu6.p0(this.a, pt2.c)).toString();
        int iU0 = r5h.U0(string, '(', 0, 6);
        int iY0 = r5h.Y0(string, ')', 0, 6);
        if (iU0 <= 0 || iY0 <= iU0) {
            ore.p("Malformed /proc/self/stat: cannot locate comm field");
            return null;
        }
        int i = Integer.parseInt(r5h.y1(string.substring(0, iU0)).toString());
        String strSubstring = string.substring(iU0 + 1, iY0);
        List listL1 = r5h.l1(string.substring(iY0 + 2), new char[]{' '});
        if (listL1.size() >= 50) {
            return new rjk(string, i, strSubstring, r5h.j1(a(3, listL1)), Long.parseLong(a(14, listL1)), Long.parseLong(a(15, listL1)), Long.parseLong(a(16, listL1)), Long.parseLong(a(17, listL1)));
        }
        throw new IllegalArgumentException(("Malformed /proc/self/stat: expected at least 50 tail fields, got " + listL1.size()).toString());
    }
}
