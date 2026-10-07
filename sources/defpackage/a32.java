package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a32 extends kih {
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final String g;
    public final String h;

    public a32(String str, String str2, Long l, Long l2, String str3, String str4) {
        this.c = str;
        this.d = str2;
        this.e = l;
        this.f = l2;
        this.g = str3;
        this.h = str4;
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sbQ = qv1.q("{conversationId='", this.c, "', joinLink=", this.g, ", callName=");
        sbQ.append(this.d);
        sbQ.append(", callerId=");
        sbQ.append(this.e);
        sbQ.append(", chatId=");
        sbQ.append(this.f);
        sbQ.append(", type=");
        sbQ.append(this.h);
        sbQ.append("}");
        return sbQ.toString();
    }
}
