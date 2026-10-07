package defpackage;

import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.profile.screens.members.ChatMembersScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qq2 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qq2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new q(29, (oq2) obj);
            case 1:
                return new rq2(0, (oq2) obj);
            case 2:
                return new rq2(1, (au2) obj);
            case 3:
                return new rq2(2, (au2) obj);
            case 4:
                return new rq2(3, (a23) obj);
            case 5:
                zv8[] zv8VarArr = ChatMediaListWidget.m;
                h8c h8cVar = new h8c((ChatMediaListWidget) obj);
                h8cVar.m(new tnh(R.string.error_no_browser));
                h8cVar.a(new tnh(R.string.error_no_browser_desc));
                h8cVar.h(new w8c(R.drawable.icon_warning));
                h8cVar.p();
                return sbiVar;
            case 6:
                return new rq2(4, (za2) obj);
            case 7:
                return new rq2(5, (za2) obj);
            case 8:
                return new rq2(6, (a53) obj);
            case 9:
                return new rq2(7, (r63) obj);
            case 10:
                return new rq2(8, (r63) obj);
            case 11:
                zv8[] zv8VarArr2 = ChatMembersScreen.k;
                ((ChatMembersScreen) obj).q1().B();
                return sbiVar;
            case 12:
                return new rq2(9, (z63) obj);
            case 13:
                return new rq2(10, (z63) obj);
            case 14:
                return new rq2(11, (v83) obj);
            case 15:
                return new rq2(13, (pa3) obj);
            case 16:
                return new rq2(14, (k82) obj);
            case 17:
                return new rq2(15, (qa3) obj);
            case 18:
                return new rq2(12, (qa3) obj);
            case 19:
                return new rq2(16, (qa3) obj);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new rq2(17, (pa3) obj);
            case 21:
                return new rq2(18, (yw1) obj);
            case 22:
                return new rq2(19, (pa3) obj);
            case 23:
                return new rq2(20, (k82) obj);
            case 24:
                return new rq2(21, (pa3) obj);
            case 25:
                return new rq2(22, (pa3) obj);
            case 26:
                return new rq2(23, (pa3) obj);
            case 27:
                return new rq2(24, (za2) obj);
            case 28:
                return new rq2(25, (wi3) obj);
            default:
                return new rq2(26, (wi3) obj);
        }
    }
}
