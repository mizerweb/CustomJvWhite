package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w3j implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ fbc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ w3j(fbc fbcVar, int i, long j) {
        this.b = fbcVar;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.d;
        long j = this.c;
        fbc fbcVar = this.b;
        switch (i) {
            case 0:
                y3j y3jVar = (y3j) fbcVar.c;
                String str = vqi.a;
                y3jVar.A(i2, j);
                break;
            default:
                y3j y3jVar2 = (y3j) fbcVar.c;
                String str2 = vqi.a;
                y3jVar2.i(i2, j);
                break;
        }
    }

    public /* synthetic */ w3j(fbc fbcVar, long j, int i) {
        this.b = fbcVar;
        this.c = j;
        this.d = i;
    }
}
