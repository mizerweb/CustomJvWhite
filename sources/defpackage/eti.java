package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class eti extends l40 {
    public final Long d;
    public final Integer e;
    public final Long f;
    public final long g;
    public final String h;
    public final Integer i;
    public final Integer j;
    public final boolean k;
    public final String l;
    public final String m;
    public final byte[] n;
    public final byte[] o;
    public final Long p;
    public final String q;
    public final kui r;
    public final byte[] s;
    public final String t;

    public eti(long j, int i, Long l, long j2, String str, Integer num, Integer num2, boolean z, String str2, String str3, byte[] bArr, byte[] bArr2, Long l2, boolean z2, String str4, kui kuiVar, boolean z3, byte[] bArr3, String str5) {
        super(w50.VIDEO, z2, z3);
        this.d = Long.valueOf(j);
        this.e = Integer.valueOf(i);
        this.f = l;
        this.g = j2;
        this.h = str;
        this.i = num;
        this.j = num2;
        this.k = z;
        this.l = str2;
        this.m = str3;
        this.p = l2;
        this.n = bArr;
        this.o = bArr2;
        this.q = str4;
        this.r = kuiVar;
        this.s = bArr3;
        this.t = str5;
    }

    @Override // defpackage.l40
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.q;
        if (ch3.r(str)) {
            mapA.put("videoId", this.d);
        } else {
            mapA.put(ApiProtocol.KEY_TOKEN, str);
        }
        mapA.put("videoType", this.e);
        byte[] bArr = this.s;
        if (bArr != null && bArr.length > 0) {
            mapA.put("wave", bArr);
        }
        Long l = this.f;
        if (l.longValue() > 0) {
            mapA.put("duration", l);
        }
        byte[] bArr2 = this.o;
        if (bArr2 != null) {
            mapA.put("thumbhash", bArr2);
        }
        return mapA;
    }

    @Override // defpackage.l40
    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        byte[] bArr = this.s;
        int length = bArr != null ? bArr.length : -1;
        byte[] bArr2 = this.o;
        int length2 = bArr2 != null ? bArr2.length : -1;
        StringBuilder sb = new StringBuilder("Attach{type=");
        sb.append(strValueOf);
        sb.append(", videoType=");
        sb.append(this.e);
        sb.append(", deleted=");
        qt4.B(", sensitive=", ", videoId=", sb, this.b, this.c);
        sb.append(this.d);
        sb.append(", wave.size=");
        sb.append(length);
        sb.append(", duration=");
        sb.append(this.f);
        sb.append(", size=");
        sb.append(this.g);
        sb.append(", thumbhash.size=");
        sb.append(length2);
        sb.append(", width=");
        sb.append(this.i);
        sb.append(", height=");
        sb.append(this.j);
        sb.append("}");
        return sb.toString();
    }
}
