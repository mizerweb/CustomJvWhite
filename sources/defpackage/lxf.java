package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final class lxf extends l40 {
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final puc i;
    public final l40 j;
    public final boolean k;

    public lxf(long j, String str, String str2, String str3, String str4, puc pucVar, l40 l40Var, boolean z, boolean z2, boolean z3) {
        super(w50.SHARE, z, z2);
        this.d = j;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = pucVar;
        this.j = l40Var;
        this.k = z3;
    }

    @Override // defpackage.l40
    public final HashMap a() {
        HashMap mapA = super.a();
        mapA.put("shareId", Long.valueOf(this.d));
        mapA.put(MLFeatureConfigProviderBase.URL_KEY, this.e);
        return mapA;
    }

    @Override // defpackage.l40
    public final String toString() {
        boolean z = this.i != null;
        boolean z2 = this.j != null;
        boolean zS = ch3.s(this.f);
        boolean zS2 = ch3.s(this.g);
        boolean zS3 = ch3.s(this.h);
        StringBuilder sbB = zo5.B("ShareAttach{deleted=", this.b, ", sensitive=", this.c, ", contentLevel=");
        qt4.B(", hasImage=", ", hasMedia=", sbB, this.k, z);
        qt4.B(", hasTitle=", ", hasDesc=", sbB, z2, zS);
        return bc1.m(", hasHost=", "}", sbB, zS2, zS3);
    }
}
