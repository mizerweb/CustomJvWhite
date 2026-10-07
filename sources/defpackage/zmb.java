package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zmb {
    public final boolean a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public zmb(boolean z, String str, int i, boolean z2, boolean z3) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = z2;
        this.e = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Settings{notify=");
        sb.append(this.a);
        sb.append(", ringtone='");
        sb.append(this.b);
        sb.append("', led=");
        sb.append(this.c);
        sb.append(", vibrate=");
        sb.append(this.d);
        sb.append(", maxPriority=");
        return c0a.p(sb, this.e, '}');
    }
}
