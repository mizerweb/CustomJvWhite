package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tza {
    public final String a;
    public final String b;
    public final String c;

    public tza(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    public static tza a(String str) {
        int i;
        if (str != null) {
            String[] strArrSplit = str.split(" ");
            int i2 = 6;
            if (strArrSplit.length >= 6) {
                String str2 = strArrSplit[4];
                String str3 = null;
                int i3 = 3;
                while (i2 < strArrSplit.length) {
                    String str4 = strArrSplit[i2];
                    if (str4 != null) {
                        switch (str4) {
                            case "typ":
                                i = i2 + 1;
                                if (i < strArrSplit.length) {
                                    str3 = strArrSplit[i];
                                    i3--;
                                    i2 = i;
                                    break;
                                }
                                break;
                            case "raddr":
                                i = i2 + 1;
                                if (i < strArrSplit.length) {
                                    String str5 = strArrSplit[i];
                                    i3--;
                                    i2 = i;
                                    break;
                                }
                                break;
                            case "rport":
                                i = i2 + 1;
                                if (i < strArrSplit.length) {
                                    String str6 = strArrSplit[i];
                                    i3--;
                                    i2 = i;
                                    break;
                                }
                                break;
                        }
                        if (i3 == 0) {
                            String str7 = strArrSplit[0];
                            String str8 = strArrSplit[1];
                            String str9 = strArrSplit[2];
                            String str10 = strArrSplit[3];
                            String str11 = r38.a(str2) ? str2 : null;
                            String str12 = strArrSplit[5];
                            return new tza(str9, str11, str3);
                        }
                    }
                    i2++;
                }
                String str13 = strArrSplit[0];
                String str14 = strArrSplit[1];
                String str15 = strArrSplit[2];
                String str16 = strArrSplit[3];
                if (r38.a(str2)) {
                }
                String str17 = strArrSplit[5];
                return new tza(str15, str11, str3);
            }
        }
        return null;
    }
}
