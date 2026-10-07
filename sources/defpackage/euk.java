package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class euk extends suk {
    final /* synthetic */ evk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euk(evk evkVar) {
        super(evkVar, null);
        this.e = evkVar;
    }

    @Override // defpackage.suk
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new yuk(this.e, i);
    }
}
