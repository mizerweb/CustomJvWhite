package defpackage;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.contactlist.ContactListWidget;
import one.me.mediaeditor.MediaEditScreen;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;
import one.me.stickerspreview.StickerPreviewScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.PeerConnectionFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o01 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o01(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                dig digVar = (dig) obj2;
                di4 di4Var = (di4) obj;
                hi4 hi4Var = null;
                e70VarC = null;
                e70 e70VarC = null;
                if (digVar != null) {
                    l40 l40Var = digVar.a;
                    if (l40Var != null && l40Var.a == w50.PHOTO) {
                        e70VarC = pm9.c(l40Var, null, 0L, 0L);
                    }
                    ewe eweVar = digVar.b;
                    hi4Var = new hi4(e70VarC, (String) eweVar.b, pm9.r((List) eweVar.c));
                }
                di4Var.v = hi4Var;
                break;
            case 1:
                o91 o91Var = (o91) obj2;
                PeerConnectionFactory peerConnectionFactory = (PeerConnectionFactory) obj;
                o91Var.getClass();
                try {
                    peerConnectionFactory.clearDumpRequests();
                } catch (Throwable th) {
                    o91Var.N.logException("OKRTCCall", "Error stopping local audio dump", th);
                    return;
                }
                break;
            case 2:
                zv8[] zv8VarArr = ChatMembersCompactWidget.h;
                ((t63) obj2).invoke(obj);
                break;
            case 3:
                zv8[] zv8VarArr2 = ChatsListSearchScreen.F;
                ((t63) obj2).invoke(obj);
                break;
            case 4:
                zv8[] zv8VarArr3 = ChatsListWidget.X;
                ((t63) obj2).invoke(obj);
                break;
            case 5:
                zv8[] zv8VarArr4 = ChatsListWidget.X;
                ((t63) obj2).invoke(obj);
                break;
            case 6:
                zv8[] zv8VarArr5 = ContactListWidget.o1;
                ((t63) obj2).invoke(obj);
                break;
            case 7:
                zv8[] zv8VarArr6 = MediaEditScreen.w1;
                ((t63) obj2).invoke(obj);
                break;
            case 8:
                zv8[] zv8VarArr7 = MessagesListWidget.T1;
                ((t63) obj2).invoke(obj);
                break;
            case 9:
                zv8[] zv8VarArr8 = MessagesListWidget.T1;
                ((t63) obj2).invoke(obj);
                break;
            case 10:
                qpc qpcVar = (qpc) obj2;
                qpcVar.w.log("PeerConnectionClient", qpcVar + ": factory not available for peer connection creation: " + ((Throwable) obj).getMessage());
                qpcVar.V = false;
                break;
            case 11:
                ((t63) obj2).invoke(obj);
                break;
            case 12:
                ((t63) obj2).invoke(obj);
                break;
            case 13:
                ((t63) obj2).invoke(obj);
                break;
            case 14:
                ((t63) obj2).invoke(obj);
                break;
            case 15:
                ((szf) obj2).k.log("SlmsSource", "Factory not available, cannot create media stream: " + ((Throwable) obj).getMessage());
                break;
            case 16:
                zv8[] zv8VarArr9 = StickerPreviewScreen.v;
                ((t63) obj2).invoke(obj);
                break;
            case 17:
                zv8[] zv8VarArr10 = StickersScreen.m;
                ((t63) obj2).invoke(obj);
                break;
            case 18:
                zv8[] zv8VarArr11 = StickersSettingsScreen.g;
                ((t63) obj2).invoke(obj);
                break;
            case 19:
                zv8[] zv8VarArr12 = TwoFACheckPassScreen.n;
                ((t63) obj2).invoke(obj);
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                zv8[] zv8VarArr13 = TwoFACreationScreen.n;
                ((t63) obj2).invoke(obj);
                break;
            case 21:
                ((t63) obj2).invoke(obj);
                break;
            case 22:
                zv8[] zv8VarArr14 = TwoFAStartRestoreScreen.j;
                ((t63) obj2).invoke(obj);
                break;
            case 23:
                ((r9i) obj2).a.add((mfk) obj);
                break;
            case 24:
                ((q3e) obj2).b.add((kfk) obj);
                break;
            case 25:
                zv8[] zv8VarArr15 = WebAppRootScreen.G;
                ((t63) obj2).invoke(obj);
                break;
            case 26:
                zv8[] zv8VarArr16 = WebAppRootScreen.G;
                ((t63) obj2).invoke(obj);
                break;
            case 27:
                s4k s4kVar = (s4k) obj2;
                s4kVar.getClass();
                s4kVar.a(((Integer) obj).intValue());
                break;
            case 28:
                d5k d5kVar = (d5k) obj2;
                o8k o8kVar = (o8k) obj;
                w4k w4kVar = d5kVar.b;
                Objects.toString(o8kVar);
                Objects.toString(w4kVar);
                d5kVar.e.d(o8kVar, d5kVar.b, new o01(28, d5kVar));
                break;
            default:
                ((o5k) obj2).c.add((hfk) obj);
                break;
        }
    }
}
