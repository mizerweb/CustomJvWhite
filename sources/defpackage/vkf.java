package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vkf extends hlf {
    public final /* synthetic */ int h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vkf(int i, long j, long j2) {
        super(j);
        this.h = i;
        this.i = j2;
    }

    @Override // defpackage.hlf
    public final ilf a() {
        switch (this.h) {
            case 0:
                return new wkf(this);
            default:
                return new wkf(this, (byte) 0);
        }
    }

    public wkf c() {
        return new wkf(this);
    }
}
