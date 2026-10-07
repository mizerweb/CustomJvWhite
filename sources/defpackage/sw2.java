package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sw2 {
    public final long a;
    public final int b;
    public final long c;
    public final String d;

    public sw2(rw2 rw2Var) {
        this.a = rw2Var.b;
        this.b = rw2Var.a;
        this.c = rw2Var.c;
        this.d = (String) rw2Var.d;
    }

    public static rw2 a() {
        return new rw2();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminParticipant{id=");
        sb.append(this.a);
        sb.append(", permissions=");
        sb.append(this.b);
        sb.append(", inviterId=");
        sb.append(this.c);
        sb.append(", alias='");
        return zo5.w(sb, this.d, "'}");
    }
}
