package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nki implements kki {
    public final rre a;
    public final pl b = new pl(28, this);

    public nki(rre rreVar) {
        this.a = rreVar;
    }

    public static int c(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1959080399) {
            if (iHashCode != 526786327) {
                if (iHashCode == 1354917154 && str.equals("ONE_VIDEO")) {
                    return 2;
                }
            } else if (str.equals("UNSPECIFIED")) {
                return 1;
            }
        } else if (str.equals("ONE_ME")) {
            return 3;
        }
        ore.p("Can't convert value to enum, unknown value: ".concat(str));
        return 0;
    }
}
