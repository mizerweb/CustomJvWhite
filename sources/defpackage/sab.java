package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public enum sab {
    ;

    public static boolean a;

    public static void a() {
        File[] fileArrListFiles = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath()).listFiles(new rab(0));
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!new File(file.getAbsolutePath() + ".lck").exists()) {
                    try {
                        file.delete();
                    } catch (SecurityException e) {
                        System.err.println("Failed to delete old temp lib" + e.getMessage());
                    }
                }
            }
        }
    }

    public static int h() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return 2;
        }
        if (property.contains("Mac")) {
            return 3;
        }
        if (property.contains("Windows")) {
            return 1;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return 4;
        }
        c.i("Unsupported operating system: ".concat(property));
        return 0;
    }

    public static String i() {
        int iH = h();
        StringBuilder sbV = qt4.v("/", sab.class.getPackage().getName().replace('.', '/'), "/");
        sbV.append(r5a.d(iH));
        sbV.append("/");
        sbV.append(System.getProperty("os.arch"));
        sbV.append("/liblz4-java.");
        sbV.append(r5a.c(iH));
        return sbV.toString();
    }

    public static sab valueOf(String str) {
        qt4.A(Enum.valueOf(sab.class, str));
        r5a.h(null);
        throw null;
    }
}
