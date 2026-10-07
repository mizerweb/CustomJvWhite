package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k0i extends kih {
    public final String c;
    public final k1i d;

    public k0i(String str, k1i k1iVar) {
        this.c = str;
        this.d = k1iVar;
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.w("Response(transcription=", gm0.c() ? this.c : "****", ", transcriptionStatus=", this.d.name(), ")");
    }
}
