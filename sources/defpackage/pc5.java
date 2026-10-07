package defpackage;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class pc5 {
    public final iz8 a;
    public final int b;
    public final ifh c = new ifh(new s35(3));
    public final ifh d = new ifh(new s35(4));

    public pc5(iz8 iz8Var, int i) {
        this.a = iz8Var;
        this.b = i;
    }

    public final String a(String str) {
        String str2;
        String strD = ((lge) this.c.getValue()).d("", str);
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        if (i == 1) {
            str2 = "lottie_cache";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "webm_cache";
        }
        sb.append(str2);
        sb.append('_');
        if (sb.length() + strD.length() >= 220) {
            sb.append(((q7b) this.d.getValue()).a(strD.getBytes(pt2.a)));
        } else {
            sb.append(strD);
        }
        return sb.toString();
    }

    public final ibb b(String str) {
        String strConcat;
        int iV0;
        try {
            File fileA = this.a.a();
            final String strA = a(str);
            File[] fileArrListFiles = fileA.listFiles(new FileFilter() { // from class: oc5
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    String name = file.getName();
                    if (name == null || name.length() == 0) {
                        return false;
                    }
                    return z5h.K0(name, strA, false);
                }
            });
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                File file = fileArrListFiles[0];
                String name = file.getName();
                return new ibb(file, (name == null || name.length() == 0 || (iV0 = r5h.V0(name, (strConcat = strA.concat("_origname_")), 0, false, 6)) == -1) ? null : name.substring(iV0 + strConcat.length()));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final File c(String str, String str2) {
        String str3;
        String strConcat;
        File fileA = this.a.a();
        String strA = a(str);
        if (str2 == null || str2.length() == 0) {
            int i = this.b;
            if (i == 1) {
                str3 = "json";
            } else {
                if (i != 2) {
                    throw null;
                }
                str3 = "webm";
            }
            strConcat = ".".concat(str3);
        } else {
            strConcat = "_origname_".concat(str2);
        }
        return new File(fileA, strA.concat(strConcat));
    }
}
