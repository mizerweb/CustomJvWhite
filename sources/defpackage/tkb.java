package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tkb extends kih {
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final k1i g;

    public tkb(long j, long j2, long j3, String str, k1i k1iVar) {
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = k1iVar;
    }

    @Override // defpackage.sq0
    public final String toString() {
        String str = gm0.c() ? this.f : "****";
        String strName = this.g.name();
        StringBuilder sbS = qt4.s(this.c, "Response(chatId=", ", messageId=");
        sbS.append(this.d);
        qt4.z(this.e, " attachId=", " transcription=", sbS);
        return nbh.y(sbS, str, " transcriptionStatus= ", strName, ")");
    }
}
