package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hid {
    public final File a = new File("/proc/self/stat");

    public final gid a() {
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
            return new gid(string, i, strSubstring, r5h.j1((String) listL1.get(0)), Long.parseLong((String) listL1.get(11)), Long.parseLong((String) listL1.get(12)), Long.parseLong((String) listL1.get(13)), Long.parseLong((String) listL1.get(14)));
        }
        c.o(zo5.h(listL1.size(), "Malformed /proc/self/stat: expected at least 50 tail fields, got "));
        return null;
    }
}
