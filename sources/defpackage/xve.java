package defpackage;

import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class xve implements wve {
    public final y3e a;

    public xve(CidLogger cidLogger) {
        if (cidLogger != null) {
            this.a = cidLogger;
        } else {
            ore.p("Illegal 'logger' value: null");
            throw null;
        }
    }

    @Override // defpackage.wve
    public final void a(vve vveVar) {
        this.a.log("RtcNotifications", "<- " + vveVar);
    }

    @Override // defpackage.wve
    public final void b(int i, byte[] bArr) {
        String str;
        int i2 = t7k.a[qt4.D(i)];
        if (i2 != 1) {
            str = i2 != 2 ? "<unknown>" : zu7.a(bArr);
        } else {
            str = new String(bArr);
        }
        this.a.log("RtcNotifications", "<- ".concat(str));
    }

    @Override // defpackage.wve
    public final void c(Throwable th) {
        this.a.log("RtcNotifications", "<- " + th);
    }
}
