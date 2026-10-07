package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum l3m implements x5l {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);

    private final int a;

    l3m(int i) {
        this.a = i;
    }

    @Override // defpackage.x5l
    public final int zza() {
        return this.a;
    }
}
