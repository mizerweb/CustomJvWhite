package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gv6 {
    public long a;
    public long b;
    public boolean c = false;
    public final qpc d;

    public gv6(qpc qpcVar) {
        this.d = qpcVar;
    }

    public static long a(String str) {
        String str2 = null;
        for (String str3 : str.split("\n")) {
            if (str3.startsWith("a=fingerprint")) {
                String[] strArrSplit = str3.split(" ");
                if (strArrSplit.length == 2) {
                    str2 = strArrSplit[1];
                }
            }
        }
        if (str2 == null) {
            return -1L;
        }
        String[] strArrSplit2 = str2.split(":");
        long j = 0;
        for (int iMin = Math.min(7, strArrSplit2.length - 1); iMin >= 0; iMin--) {
            j = (j << 8) | ((long) Integer.parseInt(strArrSplit2[iMin], 16));
        }
        return j;
    }
}
