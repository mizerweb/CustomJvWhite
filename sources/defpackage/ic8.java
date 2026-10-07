package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ic8 {
    public int a;
    public hc8 b;
    public boolean c;

    public final String toString() {
        String str;
        int i = this.a;
        hc8 hc8Var = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder("EarlyStart(sdk=");
        if (i == 1) {
            str = "NotStarted";
        } else if (i == 2) {
            str = "Initializing";
        } else if (i != 3) {
            str = i != 4 ? "null" : "Failed";
        } else {
            str = "Ready";
        }
        sb.append(str);
        sb.append(", action=");
        sb.append(hc8Var);
        sb.append(", initiated=");
        return qt4.r(sb, z, ")");
    }
}
