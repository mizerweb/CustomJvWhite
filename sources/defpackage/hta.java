package defpackage;

import one.me.pinbars.PinBarsWidget;
import one.me.profile.ProfileScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hta implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hta(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new pw8(23, (nsa) obj);
            case 1:
                return new pw8(24, (msa) obj);
            case 2:
                return new pw8(25, (iua) obj);
            case 3:
                return new pw8(26, (jeb) obj);
            case 4:
                return new pw8(27, (hob) obj);
            case 5:
                return new pw8(28, (hob) obj);
            case 6:
                return new pw8(29, (vic) obj);
            case 7:
                return new kvc(0, (cvc) obj);
            case 8:
                return new kvc(1, (owc) obj);
            case 9:
                return new kvc(2, (fyc) obj);
            case 10:
                return new kvc(3, (lyc) obj);
            case 11:
                return new kvc(4, (ryc) obj);
            case 12:
                return new kvc(5, (ryc) obj);
            case 13:
                return new kvc(6, (yyc) obj);
            case 14:
                return pq3.j.k(((PinBarsWidget) obj).getContext()).b;
            case 15:
                return new kvc(7, (iua) obj);
            case 16:
                return new kvc(8, (iua) obj);
            case 17:
                return new kvc(9, (a8d) obj);
            case 18:
                return new kvc(10, (g9d) obj);
            case 19:
                return new kvc(11, (g9d) obj);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new kvc(12, (k9d) obj);
            case 21:
                return new kvc(13, (k9d) obj);
            case 22:
                return new kvc(14, (a8d) obj);
            case 23:
                return new kvc(15, (fnd) obj);
            case 24:
                return new kvc(16, (k9d) obj);
            case 25:
                return new kvc(17, (k9d) obj);
            case 26:
                return new kvc(18, (k9d) obj);
            case 27:
                return new kvc(19, (k9d) obj);
            case 28:
                return new kvc(20, (a8d) obj);
            default:
                ku8 ku8Var = ProfileScreen.B;
                h8c h8cVar = new h8c((ProfileScreen) obj);
                h8cVar.m(new tnh(R.string.error_no_browser));
                h8cVar.a(new tnh(R.string.error_no_browser_desc));
                h8cVar.h(new w8c(R.drawable.icon_warning));
                h8cVar.p();
                return sbi.a;
        }
    }
}
