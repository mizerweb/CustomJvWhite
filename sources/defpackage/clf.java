package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class clf extends hlf {
    public final /* synthetic */ int h;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ clf(long j, Object obj, int i) {
        super(j);
        this.h = i;
        this.i = obj;
    }

    @Override // defpackage.hlf
    public final ilf a() {
        switch (this.h) {
            case 0:
                return new zjf(this);
            default:
                return new jlf(this);
        }
    }

    public zjf c() {
        return new zjf(this);
    }
}
