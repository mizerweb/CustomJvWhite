package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class t2g implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t2g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new lye(21, (p2g) obj);
            case 1:
                return new lye(22, (rhg) obj);
            case 2:
                return new lye(23, (rhg) obj);
            case 3:
                return new lye(24, (ize) obj);
            case 4:
                return new lye(25, (vlg) obj);
            case 5:
                return new lye(26, (jng) obj);
            case 6:
                return new lye(27, (ong) obj);
            case 7:
                return new lye(28, (ize) obj);
            case 8:
                return new lye(29, (uog) obj);
            case 9:
                ghb ghbVar = ew5.b;
                return new ew5(qe7.O(((vqg) ((e5d) obj).r().i()).f, lw5.SECONDS));
            case 10:
                return new fvg(0, (cvg) obj);
            case 11:
                return new fvg(1, (xvg) obj);
            case 12:
                return new fvg(2, (xvg) obj);
            case 13:
                return new fvg(3, (xvg) obj);
            case 14:
                return new fvg(4, (yvg) obj);
            case 15:
                return new fvg(5, (yvg) obj);
            case 16:
                return new fvg(6, (yvg) obj);
            case 17:
                return new fvg(7, (r0h) obj);
            case 18:
                return new fvg(8, (bpg) obj);
            case 19:
                return new fvg(9, (bpg) obj);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new fvg(10, (erh) obj);
            case 21:
                tmi tmiVarA = ((umi) ((ny8) obj).getValue()).a();
                String str = tmiVarA.b;
                String str2 = tmiVarA.d;
                String strY = nbh.y(qv1.q("OKMessages/", str, " (", str2, "; "), tmiVarA.h, "; ", tmiVarA.i, ")");
                try {
                    return URLEncoder.encode(strY, Charset.defaultCharset().name());
                } catch (UnsupportedEncodingException unused) {
                    return strY;
                }
            case 22:
                return new fvg(11, (j0i) obj);
            case 23:
                return new fvg(12, (j0i) obj);
            case 24:
                return new fvg(13, (u7i) obj);
            case 25:
                return new fvg(14, (j0i) obj);
            case 26:
                return new fvg(15, (j0i) obj);
            case 27:
                return new fvg(16, (vbi) obj);
            case 28:
                return new fvg(17, (rni) obj);
            default:
                return new fvg(18, (rni) obj);
        }
    }
}
