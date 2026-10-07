package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class g5j {
    public final String a;
    public final long b;
    public final String c;

    public g5j(long j, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public static g5j a(fka fkaVar) throws IOException {
        int iP0 = fkaVar.P0();
        String strW = null;
        String strW2 = null;
        long jT = 0;
        for (int i = 0; i < iP0; i++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            switch (strS0) {
                case "url":
                    strW = ch3.W(fkaVar);
                    break;
                case "token":
                    strW2 = ch3.W(fkaVar);
                    break;
                case "videoId":
                    jT = ch3.T(fkaVar, 0L);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        return new g5j(jT, strW, strW2);
    }

    public final String toString() {
        return nbh.z(nbh.B(this.b, "VideoUploadInfo{url='", this.a, "', videoId="), ", token='", !ch3.r(this.c), "'}");
    }
}
