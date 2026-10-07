package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o29 extends zq0 {
    public final Long b;
    public final long c;
    public final gm4 d;
    public final ir7 e;
    public final oui f;
    public final Long g;
    public final String h;

    public o29(long j, Long l, long j2, gm4 gm4Var, ir7 ir7Var, oui ouiVar, Long l2, String str) {
        super(j);
        this.b = l;
        this.c = j2;
        this.d = gm4Var;
        this.e = ir7Var;
        this.f = ouiVar;
        this.g = l2;
        this.h = str;
    }

    @Override // defpackage.zq0
    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkInfoEvent{chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", contactSearchResult=");
        sb.append(this.d);
        sb.append(", groupChatInfo=");
        sb.append(this.e);
        sb.append(", videoConference=");
        sb.append(this.f);
        sb.append(", stickerSetId=");
        sb.append(this.g);
        sb.append(", startPayload='");
        return zo5.w(sb, this.h, "'}");
    }
}
