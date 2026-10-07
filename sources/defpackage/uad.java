package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uad extends f3 {
    public final rv8 a;
    public final ny8 b = rx8.P(2, new a8d(4, this));

    public uad(rv8 rv8Var) {
        this.a = rv8Var;
    }

    @Override // defpackage.aw8
    public final fif d() {
        return (fif) this.b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
