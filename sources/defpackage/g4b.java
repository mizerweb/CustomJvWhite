package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g4b {
    public static final g4b c = new g4b(1, 0);
    public final int a;
    public final long b;

    public g4b(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4b)) {
            return false;
        }
        g4b g4bVar = (g4b) obj;
        return this.a == g4bVar.a && this.b == g4bVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (qt4.D(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SliceData(flow=");
        switch (this.a) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "CHAT_SCREEN";
                break;
            case 3:
                str = "FORWARD";
                break;
            case 4:
                str = "SHARE";
                break;
            case 5:
                str = "LOGS";
                break;
            case 6:
                str = "PUSH";
                break;
            case 7:
                str = "DELAYED_MESSAGES";
                break;
            case 8:
                str = "PROFILE";
                break;
            case 9:
                str = "MEDIA_BAR";
                break;
            case 10:
                str = "COMMENTS_SCREEN";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", sliceTime=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
