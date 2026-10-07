package defpackage;

import one.me.chats.forward.ForwardPickerScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fj3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fj3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new rq2(27, (wi3) obj);
            case 1:
                return new rq2(28, (wi3) obj);
            case 2:
                return new rq2(29, (f04) obj);
            case 3:
                return new u54(0, (r54) obj);
            case 4:
                return new u54(1, (va4) obj);
            case 5:
                return new u54(2, (hb4) obj);
            case 6:
                return new u54(3, (sb4) obj);
            case 7:
                return new u54(4, (za2) obj);
            case 8:
                return (Boolean) ((gc4) obj).m2.invoke();
            case 9:
                return new u54(5, (pe3) obj);
            case 10:
                return new u54(6, (za2) obj);
            case 11:
                return new u54(7, (al4) obj);
            case 12:
                return new u54(8, (al4) obj);
            case 13:
                return new u54(9, (al4) obj);
            case 14:
                return new u54(10, (dx4) obj);
            case 15:
                return Class.forName((String) obj);
            case 16:
                return new u54(11, (el5) obj);
            case 17:
                return new u54(12, (fy5) obj);
            case 18:
                return new u54(13, (fy5) obj);
            case 19:
                return new u54(14, (i06) obj);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new u54(15, (ca6) obj);
            case 21:
                return new u54(16, (bj6) obj);
            case 22:
                return new u54(17, (mp5) obj);
            case 23:
                return new u54(18, (dx4) obj);
            case 24:
                return new u54(19, (mp5) obj);
            case 25:
                return new u54(20, (mp5) obj);
            case 26:
                return new u54(21, (p57) obj);
            case 27:
                ForwardPickerScreen forwardPickerScreen = (ForwardPickerScreen) obj;
                zv8[] zv8VarArr = ForwardPickerScreen.z;
                ForwardPickerScreen.A1(forwardPickerScreen, forwardPickerScreen.C1(), new tnh(R.string.oneme_forward_author_visibility_onboarding), true);
                forwardPickerScreen.p = tt.d;
                return sbi.a;
            case 28:
                return new u54(22, (c97) obj);
            default:
                return new u54(23, (mp5) obj);
        }
    }
}
