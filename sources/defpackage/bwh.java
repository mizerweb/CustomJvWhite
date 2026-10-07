package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bwh extends cwh {
    public final /* synthetic */ int b;
    public final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwh(long j, int i) {
        super(awh.NO_CONNECTION_TIMEOUT);
        this.b = i;
        switch (i) {
            case 1:
                super(awh.NO_DATA_TIMEOUT);
                this.c = j;
                break;
            case 2:
                super(awh.SUCCESS_AUDIO);
                this.c = j;
                break;
            case 3:
                super(awh.SUCCESS_CONNECTION);
                this.c = j;
                break;
            default:
                this.c = j;
                break;
        }
    }
}
