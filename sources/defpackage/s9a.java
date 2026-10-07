package defpackage;

import android.content.Context;
import android.view.View;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s9a implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ s9a(hua huaVar) {
        this.a = 11;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        vg4 vg4VarW;
        int i = this.a;
        boolean z = true;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return Long.valueOf(((l8a) obj).a);
            case 1:
                vg4 vg4Var = (vg4) obj;
                if (!vg4Var.f && !f55.q(vg4Var) && vg4Var.B() && (!vg4Var.E() || !vg4Var.H())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                rt2 rt2Var = (rt2) obj;
                return Boolean.valueOf((!rt2Var.h0() || rt2Var.w() == null || (vg4VarW = rt2Var.w()) == null || vg4VarW.f) ? false : true);
            case 3:
                return ((qxc) obj).c.e().toString();
            case 4:
                return ((qxc) obj).c.e().toString();
            case 5:
                vxe vxeVarO0 = ((qxe) obj).O0("DELETE FROM message_comments WHERE NOT EXISTS (SELECT 1 FROM messages WHERE messages.id = message_comments.message_id)");
                try {
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            case 6:
                vxe vxeVarO1 = ((qxe) obj).O0("DELETE FROM message_comments");
                try {
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
            case 7:
                return new lia((Context) obj);
            case 8:
                return Long.valueOf(((sfa) obj).b);
            case 9:
                vxe vxeVarO2 = ((qxe) obj).O0("DELETE FROM message_uploads");
                try {
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            case 10:
                vxe vxeVarO3 = ((qxe) obj).O0("DELETE FROM messages");
                try {
                    vxeVarO3.M0();
                    return sbiVar;
                } finally {
                    vxeVarO3.close();
                }
            case 11:
                tia tiaVar = (tia) obj;
                return new apb(new ilb(tiaVar.c), tiaVar.e, tiaVar.i, qv5.NOTIFICATIONS_LIMIT);
            case 12:
                zv8[] zv8VarArr = MessagesSettingsScreen.p;
                sva.b.b().f();
                return sbiVar;
            case 13:
                return "?";
            case 14:
                return ((fja) obj).b.b;
            case 15:
                return new ha9(((Integer) obj).intValue());
            case 16:
                return Integer.valueOf(((kbc) obj).getIcon().e);
            case 17:
                return Integer.valueOf(((kbc) obj).h().b);
            case 18:
                return Integer.valueOf(((kbc) obj).getIcon().e);
            case 19:
                return Integer.valueOf(((kbc) obj).h().b);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                vxe vxeVarO4 = ((qxe) obj).O0("DELETE FROM fcm_notifications");
                try {
                    vxeVarO4.M0();
                    return sbiVar;
                } finally {
                    vxeVarO4.close();
                }
            case 21:
                vxe vxeVarO5 = ((qxe) obj).O0("DELETE FROM notifications_read_marks");
                try {
                    vxeVarO5.M0();
                    return sbiVar;
                } finally {
                    vxeVarO5.close();
                }
            case 22:
                return Boolean.valueOf(((wm4) obj).a == 5);
            case 23:
                zv8[] zv8VarArr2 = NotificationsSettingsScreen.m;
                bnb.b.b().f();
                return sbiVar;
            case 24:
                vxe vxeVarO6 = ((qxe) obj).O0("DELETE FROM notifications_tracker_messages");
                try {
                    vxeVarO6.M0();
                    return sbiVar;
                } finally {
                    vxeVarO6.close();
                }
            case 25:
                return -1;
            case 26:
                return 0;
            case 27:
                return Boolean.valueOf(((View) obj).getVisibility() == 0);
            case 28:
                return Integer.valueOf(((kbc) obj).getIcon().b);
            default:
                return Integer.valueOf(((kbc) obj).getIcon().b);
        }
    }

    public /* synthetic */ s9a(int i) {
        this.a = i;
    }
}
