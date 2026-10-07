package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w40 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny8 b;

    public /* synthetic */ w40(ny8 ny8Var, int i) {
        this.a = i;
        this.b = ny8Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ny8 ny8Var = this.b;
        switch (i) {
            case 0:
                zl9 zl9VarC = ((g5d) ((gjf) ny8Var.getValue())).c();
                if (zl9VarC != null) {
                    return zl9VarC.c;
                }
                return null;
            case 1:
                return ((n0c) ((xhh) ny8Var.getValue())).a().R0(1, "call_chat_observing");
            case 2:
                Boolean bool = (Boolean) ((e5d) ny8Var.getValue()).A().i();
                bool.booleanValue();
                return bool;
            case 3:
                Boolean bool2 = (Boolean) ((e5d) ny8Var.getValue()).B5.a(e5d.S6[341]).i();
                bool2.booleanValue();
                return bool2;
            case 4:
                return ((n0c) ((xhh) ny8Var.getValue())).a().R0(1, "call_p2p_invite_observing");
            case 5:
                return (NotificationManager) ((Context) ny8Var.getValue()).getSystemService(NotificationManager.class);
            case 6:
                return new lxi(ny8Var);
            case 7:
                return ((Context) ny8Var.getValue()).getString(R.string.call_notification_name_temp);
            case 8:
                return ((Context) ny8Var.getValue()).getString(R.string.call_notification_incoming_call);
            case 9:
                return ((Context) ny8Var.getValue()).getString(R.string.call_notification_incoming_video_call);
            case 10:
                return ((Context) ny8Var.getValue()).getString(R.string.call_notification_active_call);
            case 11:
                Drawable drawable = ((Context) ny8Var.getValue()).getDrawable(R.drawable.ic_unknown_contact_notification);
                if (drawable != null) {
                    return ch3.e0(drawable, gm0.K(yl5.d().getDisplayMetrics().density * 88.0f), gm0.K(88.0f * yl5.d().getDisplayMetrics().density));
                }
                return null;
            case 12:
                return Integer.valueOf(((Number) ((e5d) ny8Var.getValue()).f0.a(e5d.S6[55]).i()).intValue());
            case 13:
                return ww3.X1((Iterable) ((e5d) ny8Var.getValue()).e0.a(e5d.S6[54]).i());
            case 14:
                return ((o31) ny8Var.getValue()).a(1024);
            case 15:
                return new pji(ny8Var);
            case 16:
                return new jxb((Context) ny8Var.getValue());
            case 17:
                return Integer.valueOf(((Number) ((e5d) ny8Var.getValue()).p5.a(e5d.S6[329]).i()).intValue());
            case 18:
                return Integer.valueOf(((Number) ((e5d) ny8Var.getValue()).f0.a(e5d.S6[55]).i()).intValue());
            case 19:
                return ww3.X1((Iterable) ((e5d) ny8Var.getValue()).e0.a(e5d.S6[54]).i());
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((n25) ny8Var.getValue()).a();
            case 21:
                return (yob) ((u7f) ny8Var.getValue()).f.getValue();
            case 22:
                return (hua) ((u7f) ny8Var.getValue()).g.c.getValue();
            case 23:
                return (aob) ((u7f) ny8Var.getValue()).e.getValue();
            case 24:
                return ((n0c) ((xhh) ny8Var.getValue())).a().R0(1, "notifs-readmarks");
            case 25:
                return ((n0c) ((xhh) ny8Var.getValue())).a().R0(1, "call_participants_observing");
            case 26:
                return new lxi(ny8Var);
            case 27:
                return (pad) ((f5d) ((wo6) ny8Var.getValue())).a.s3.a(e5d.S6[228]).i();
            case 28:
                return ((n0c) ((xhh) ny8Var.getValue())).b();
            default:
                return ((n0c) ((xhh) ny8Var.getValue())).b();
        }
    }
}
