package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum m4h implements go8 {
    /* JADX INFO: Fake field, exist only in values array */
    DUPLICATE_PROPERTIES,
    /* JADX INFO: Fake field, exist only in values array */
    SCALARS_AS_OBJECTS,
    /* JADX INFO: Fake field, exist only in values array */
    UNTYPED_SCALARS,
    /* JADX INFO: Fake field, exist only in values array */
    EXACT_FLOATS;

    public final int a = 1 << ordinal();

    m4h() {
    }

    @Override // defpackage.go8
    public final boolean a() {
        return false;
    }

    @Override // defpackage.go8
    public final int h() {
        return this.a;
    }
}
