package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.polls.screens.create.PollCreateScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pyb implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ pyb(int i) {
        this.a = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i;
        long j;
        int i2 = this.a;
        String str = null;
        sbi sbiVar = sbi.a;
        boolean z = false;
        switch (i2) {
            case 0:
                return Integer.valueOf(((kbc) obj).getIcon().h);
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue != 0) {
                    i = iIntValue != 1 ? 10 : 15;
                } else {
                    i = 18;
                }
                return Integer.valueOf(i);
            case 2:
                return Integer.valueOf(((kbc) obj).getText().h);
            case 3:
                return Integer.valueOf(26 - ((((Integer) obj).intValue() + 1) * 4));
            case 4:
                return ((fi4) obj).a();
            case 5:
                return Integer.valueOf(((kbc) obj).getText().h);
            case 6:
                return Boolean.valueOf(((View) obj).getId() != R.id.oneme_button_progress_bar_id);
            case 7:
                return Integer.valueOf((int) (((bj8) obj).a >> 32));
            case 8:
                return Integer.valueOf((int) (((bj8) obj).a & 4294967295L));
            case 9:
                vxe vxeVarO0 = ((qxe) obj).O0("DELETE FROM organizations");
                try {
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            case 10:
                zv8[] zv8VarArr = OtherNotificationsSettingsScreen.g;
                bnb.b.b().f();
                return sbiVar;
            case 11:
                r7a r7aVar = (r7a) ((Map.Entry) obj).getValue();
                if (r7aVar.a.isEmpty()) {
                    vo8 vo8Var = (vo8) r7aVar.b.getAndSet(null);
                    if (vo8Var != null) {
                        vo8Var.b(null);
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM phones");
                try {
                    int iE = qyj.E(vxeVarO1, "id");
                    int iE2 = qyj.E(vxeVarO1, "phonebook_id");
                    int iE3 = qyj.E(vxeVarO1, "contact_id");
                    int iE4 = qyj.E(vxeVarO1, "phone");
                    int iE5 = qyj.E(vxeVarO1, "phone_key");
                    int iE6 = qyj.E(vxeVarO1, "server_phone");
                    int iE7 = qyj.E(vxeVarO1, "email");
                    int iE8 = qyj.E(vxeVarO1, "first_name");
                    int iE9 = qyj.E(vxeVarO1, "last_name");
                    int iE10 = qyj.E(vxeVarO1, "avatar_path");
                    int iE11 = qyj.E(vxeVarO1, "type");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO1.M0()) {
                        int i3 = iE2;
                        arrayList.add(new stc(vxeVarO1.getLong(iE), vxeVarO1.getLong(iE2), (int) vxeVarO1.getLong(iE3), vxeVarO1.B0(iE4), vxeVarO1.B0(iE5), vxeVarO1.getLong(iE6), vxeVarO1.isNull(iE7) ? str : vxeVarO1.B0(iE7), vxeVarO1.B0(iE8), vxeVarO1.isNull(iE9) ? str : vxeVarO1.B0(iE9), vxeVarO1.isNull(iE10) ? str : vxeVarO1.B0(iE10), iic.h((int) vxeVarO1.getLong(iE11))));
                        iE2 = i3;
                        str = null;
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO1.close();
                }
            case 13:
                vxe vxeVarO2 = ((qxe) obj).O0("DELETE FROM phones");
                try {
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            case 14:
                vxe vxeVarO3 = ((qxe) obj).O0("SELECT phone, server_phone FROM phones");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO3.M0()) {
                        arrayList2.add(new ltc(vxeVarO3.B0(0), vxeVarO3.getLong(1)));
                    }
                    vxeVarO3.close();
                    return arrayList2;
                } catch (Throwable th) {
                    vxeVarO3.close();
                    throw th;
                }
            case 15:
                vxe vxeVarO4 = ((qxe) obj).O0("DELETE FROM phones");
                try {
                    vxeVarO4.M0();
                    return sbiVar;
                } finally {
                    vxeVarO4.close();
                }
            case 16:
                vxe vxeVarO5 = ((qxe) obj).O0("SELECT COUNT(*) FROM phones");
                try {
                    if (vxeVarO5.M0()) {
                        j = vxeVarO5.getLong(0);
                        break;
                    } else {
                        j = 0;
                    }
                    return Long.valueOf(j);
                } finally {
                    vxeVarO5.close();
                }
            case 17:
                return ((w73) obj).r;
            case 18:
                zv8[] zv8VarArr2 = PickerChatsTabWidget.p;
                return Boolean.FALSE;
            case 19:
                zv8[] zv8VarArr3 = PickerChatsTabWidget.p;
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((Integer) obj).getClass();
                zv8[] zv8VarArr4 = PickerContactsListWidget.q;
                return Boolean.FALSE;
            case 21:
                return ((m4j) obj).toString();
            case 22:
                return (ylc) ((ylc) obj).a;
            case 23:
                zv8[] zv8VarArr5 = PollCreateScreen.n;
                return Boolean.valueOf(((lfe) obj).f == R.id.oneme_poll_create__answer_item_viewtype);
            case 24:
                return new CopyOnWriteArraySet();
            case 25:
                return jj8.a;
            case 26:
                return ((agd) obj).name();
            case 27:
                return p90.a(null);
            case 28:
                return new ArrayList();
            default:
                return iid.b;
        }
    }
}
