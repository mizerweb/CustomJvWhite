package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final class my extends kih implements Serializable {
    public List c;
    public List d;
    public List e;
    public long f;

    public my(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
        if (this.d == null) {
            this.d = Collections.EMPTY_LIST;
        }
        if (this.e == null) {
            this.e = Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) throws IOException {
        str.getClass();
        switch (str) {
            case "marker":
                this.f = fkaVar.I0();
                break;
            case "stickers":
                this.c = b50.d(fkaVar);
                break;
            case "stickerSets":
                this.d = b50.d(fkaVar);
                break;
            case "backgrounds":
                int iJ = ch3.J(fkaVar);
                this.e = new ArrayList(iJ);
                for (int i = 0; i < iJ; i++) {
                    List list = this.e;
                    int iU = ch3.U(fkaVar);
                    long jT = 0;
                    String str2 = "";
                    String str3 = str2;
                    for (int i2 = 0; i2 < iU; i2++) {
                        String strS0 = fkaVar.S0();
                        if (strS0 == null) {
                            fkaVar.x();
                        } else {
                            int iHashCode = strS0.hashCode();
                            if (iHashCode != 3355) {
                                if (iHashCode != 116079) {
                                    if (iHashCode == 94842723 && strS0.equals("color")) {
                                        String strW = ch3.W(fkaVar);
                                        str3 = strW == null ? "" : strW;
                                    } else {
                                        fkaVar.x();
                                    }
                                } else if (strS0.equals(MLFeatureConfigProviderBase.URL_KEY)) {
                                    String strW2 = ch3.W(fkaVar);
                                    str2 = strW2 == null ? "" : strW2;
                                } else {
                                    fkaVar.x();
                                }
                            } else if (strS0.equals("id")) {
                                jT = ch3.T(fkaVar, 0L);
                            } else {
                                fkaVar.x();
                            }
                        }
                    }
                    list.add(new xl0(jT, str2, str3));
                }
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    public final long h() {
        return this.f;
    }

    public final List i() {
        return this.d;
    }

    public final List k() {
        return this.c;
    }

    @Override // defpackage.sq0
    public final String toString() {
        int iO = tre.O(this.c);
        int iO2 = tre.O(this.d);
        int iO3 = tre.O(this.e);
        long j = this.f;
        StringBuilder sbP = qv1.p("{stickers=", iO, "stickerSets=", iO2, "backgrounds=");
        c0a.v(sbP, iO3, ", marker=", j);
        sbP.append("}");
        return sbP.toString();
    }
}
