package defpackage;

import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i48 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IdMappingWrapper b;

    public /* synthetic */ i48(IdMappingWrapper idMappingWrapper, int i) {
        this.a = i;
        this.b = idMappingWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        IdMappingWrapper idMappingWrapper = this.b;
        switch (i) {
            case 0:
                idMappingWrapper.writeCacheToDisk();
                break;
            default:
                idMappingWrapper.readCacheFromDisk();
                break;
        }
    }
}
