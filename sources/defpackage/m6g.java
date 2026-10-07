package defpackage;

import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class m6g implements Comparable {
    public static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public m6g(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009f A[PHI: r2
  0x009f: PHI (r2v15 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x0095, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    public static m6g b(File file, long j, long j2, s80 s80Var) {
        File file2;
        long j3;
        String strGroup;
        File fileF;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = h.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                strGroup.getClass();
                String str = vqi.a;
                int length = strGroup.length();
                int iEnd = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (strGroup.charAt(i3) == '%') {
                        i2++;
                    }
                }
                if (i2 != 0) {
                    int i4 = length - (i2 * 2);
                    StringBuilder sb = new StringBuilder(i4);
                    Matcher matcher2 = vqi.f.matcher(strGroup);
                    while (i2 > 0 && matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        char c = (char) Integer.parseInt(strGroup2, 16);
                        sb.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb.append(c);
                        iEnd = matcher2.end();
                        i2--;
                    }
                    if (iEnd < length) {
                        sb.append((CharSequence) strGroup, iEnd, length);
                    }
                    if (sb.length() != i4) {
                        strGroup = null;
                    } else {
                        strGroup = sb.toString();
                    }
                }
            } else {
                matcher = g.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileF = null;
            } else {
                File parentFile = file.getParentFile();
                parentFile.getClass();
                int i5 = s80Var.l(strGroup).a;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j4 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileF = f(parentFile, i5, j4, Long.parseLong(strGroup4));
                if (!file.renameTo(fileF)) {
                    fileF = null;
                }
            }
            if (fileF == null) {
                return null;
            }
            file2 = fileF;
            name = fileF.getName();
        }
        Matcher matcher3 = i.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        String strGroup5 = matcher3.group(1);
        strGroup5.getClass();
        String str2 = (String) ((SparseArray) s80Var.b).get(Integer.parseInt(strGroup5));
        if (str2 == null) {
            return null;
        }
        long length2 = j == -1 ? file2.length() : j;
        if (length2 == 0) {
            return null;
        }
        String strGroup6 = matcher3.group(2);
        strGroup6.getClass();
        long j5 = Long.parseLong(strGroup6);
        if (j2 == -9223372036854775807L) {
            String strGroup7 = matcher3.group(3);
            strGroup7.getClass();
            j3 = Long.parseLong(strGroup7);
        } else {
            j3 = j2;
        }
        return new m6g(str2, j5, length2, j3, file2);
    }

    public static m6g d(File file, long j, s80 s80Var) {
        return b(file, j, -9223372036854775807L, s80Var);
    }

    public static m6g e(long j, long j2, String str) {
        return new m6g(str, j, j2, -9223372036854775807L, null);
    }

    public static File f(File file, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, c0a.m(j2, ".v3.exo", sb));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(m6g m6gVar) {
        String str = m6gVar.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(m6gVar.a);
        }
        long j = this.b - m6gVar.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.b);
        sb.append(", ");
        return c0a.m(this.c, "]", sb);
    }
}
