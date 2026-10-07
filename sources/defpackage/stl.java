package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class stl {
    public static ptl a;

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            ore.p("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static synchronized ysl b() {
        ysl yslVar;
        esl eslVar = new esl();
        synchronized (stl.class) {
            try {
                if (a == null) {
                    a = new ptl(0);
                }
                yslVar = (ysl) a.b(eslVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return yslVar;
        return yslVar;
    }
}
