package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class mp6 extends l40 {
    public final long d;
    public final long e;
    public final String f;
    public final l40 g;
    public final String h;

    public mp6(long j, long j2, String str, l40 l40Var, boolean z, String str2, boolean z2) {
        super(w50.FILE, z, z2);
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = l40Var;
        this.h = str2;
    }

    @Override // defpackage.l40
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.h;
        if (ch3.r(str)) {
            mapA.put("fileId", Long.valueOf(this.d));
            return mapA;
        }
        mapA.put(ApiProtocol.KEY_TOKEN, str);
        return mapA;
    }
}
