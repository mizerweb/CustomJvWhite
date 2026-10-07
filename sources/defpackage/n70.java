package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class n70 extends l40 {
    public final Long d;
    public final String e;
    public final Long f;
    public final byte[] g;
    public final String h;

    public n70(long j, String str, long j2, byte[] bArr, boolean z, String str2, boolean z2) {
        super(w50.AUDIO, z, z2);
        this.f = Long.valueOf(j2);
        this.d = Long.valueOf(j);
        this.e = str;
        this.g = bArr;
        this.h = str2;
    }

    @Override // defpackage.l40
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.h;
        if (ch3.r(str)) {
            mapA.put("audioId", this.d);
        } else {
            mapA.put(ApiProtocol.KEY_TOKEN, str);
        }
        byte[] bArr = this.g;
        if (bArr != null && bArr.length > 0) {
            mapA.put("wave", bArr);
        }
        Long l = this.f;
        if (l.longValue() > 0) {
            mapA.put("duration", l);
        }
        return mapA;
    }

    @Override // defpackage.l40
    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        byte[] bArr = this.g;
        int length = bArr != null ? bArr.length : -1;
        boolean zS = ch3.s(this.e);
        StringBuilder sbA = zo5.A("Attach{type=", strValueOf, ", deleted=", ", sensitive=", this.b);
        sbA.append(this.c);
        sbA.append(", audioId=");
        sbA.append(this.d);
        sbA.append(", wave.size=");
        sbA.append(length);
        sbA.append(", duration=");
        sbA.append(this.f);
        sbA.append(", hasUrl=");
        return qt4.r(sbA, zS, "}");
    }
}
