package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n72 extends zq0 {
    public final long b;
    public final String c;

    public n72(long j, String str) {
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.zq0
    public final String toString() {
        StringBuilder sb = new StringBuilder("CallbackAnswerEvent{chatId=");
        sb.append(this.b);
        sb.append("text=");
        return x05.i(sb, this.c, '}');
    }
}
