package defpackage;

import java.util.Arrays;
import java.util.Map;
import kotlin.collections.a;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;
import one.me.devmenu.DevMenuScreen;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w83 implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ w83(int i) {
        this.a = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ChatNotificationsSettingsScreen.g;
                bnb.b.b().f();
                return sbiVar;
            case 1:
                return gxl.c((String) obj);
            case 2:
                vxe vxeVarO0 = ((qxe) obj).O0("DELETE FROM chat_title");
                try {
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            case 3:
                vxe vxeVarO1 = ((qxe) obj).O0("DELETE FROM chats");
                try {
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
            case 4:
                zv8[] zv8VarArr2 = ChatsListSearchScreen.F;
                return sbiVar;
            case 5:
                return ((y8f) obj).r();
            case 6:
                ((Integer) obj).getClass();
                return Boolean.TRUE;
            case 7:
                zv8[] zv8VarArr3 = xv3.o;
                return sbiVar;
            case 8:
                return Long.valueOf(((sfa) obj).b);
            case 9:
                vxe vxeVarO2 = ((qxe) obj).O0("DELETE FROM comments");
                try {
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            case 10:
                vxe vxeVarO3 = ((qxe) obj).O0("DELETE FROM complain_reasons");
                try {
                    vxeVarO3.M0();
                    return sbiVar;
                } finally {
                    vxeVarO3.close();
                }
            case 11:
                return tok.a(((TamErrorException) obj).a);
            case 12:
                return Boolean.valueOf(((wg4) obj) == wg4.d);
            case 13:
                return Boolean.valueOf(((wg4) obj) == wg4.a);
            case 14:
                wm4 wm4Var = (wm4) obj;
                return Boolean.valueOf(wm4Var.b || wm4Var.a == 7);
            case 15:
                vxe vxeVarO4 = ((qxe) obj).O0("DELETE FROM contact_title");
                try {
                    vxeVarO4.M0();
                    return sbiVar;
                } finally {
                    vxeVarO4.close();
                }
            case 16:
                vxe vxeVarO5 = ((qxe) obj).O0("DELETE FROM contacts");
                try {
                    vxeVarO5.M0();
                    return sbiVar;
                } finally {
                    vxeVarO5.close();
                }
            case 17:
                vxe vxeVarO6 = ((qxe) obj).O0("SELECT COUNT(*) FROM contact_title");
                try {
                    return Integer.valueOf(vxeVarO6.M0() ? (int) vxeVarO6.getLong(0) : 0);
                } finally {
                    vxeVarO6.close();
                }
            case 18:
                return Boolean.valueOf(((wm4) obj).b);
            case 19:
                return Conversation.addParticipants$lambda$0((AddParticipantsResult) obj);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ConversationStart.parseTurnServers$lambda$1((PeerConnection.IceServer) obj);
            case 21:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sbZ = zo5.z(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                }
                sbZ.append(value);
                return sbZ.toString();
            case 22:
                return obj instanceof Object[] ? a.h1((Object[]) obj, null, "[", "]", new w83(22), 25) : String.valueOf(obj);
            case 23:
                zv8[] zv8VarArr4 = DevMenuFeatureTogglesPageScreen.k;
                return Boolean.valueOf(!((i5d) obj).d);
            case 24:
                pd8 pd8Var = (pd8) obj;
                return zo5.p(pd8Var.a, ":\n", pd8Var.b);
            case 25:
                zv8[] zv8VarArr5 = DevMenuScreen.h;
                sj5.b.b().f();
                return sbiVar;
            case 26:
                zv8[] zv8VarArr6 = DialogNotificationsSettingsScreen.g;
                bnb.b.b().f();
                return sbiVar;
            case 27:
                ((c60) obj).m = "";
                return sbiVar;
            case 28:
                b87 b87Var = (b87) obj;
                String str2 = b87Var.a;
                return new t4j(str2 != null ? str2 : "", srk.e(b87Var), true);
            default:
                b87 b87Var2 = (b87) obj;
                String str3 = b87Var2.a;
                return new ec0(str3 != null ? str3 : "", srk.b(b87Var2));
        }
    }
}
