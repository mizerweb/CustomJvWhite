package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oqh extends ThreadLocal {
    public final /* synthetic */ fbc a;

    public oqh(fbc fbcVar) {
        this.a = fbcVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return ((af7) this.a.b).invoke();
    }
}
