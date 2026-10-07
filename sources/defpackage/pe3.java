package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.nio.channels.AsynchronousChannelGroup;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.contactadddialog.ContactAddBottomSheet;
import one.me.devmenu.DevMenuInfoScreen;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet;
import one.me.sdk.richvector.internal.element.ClipPathElement;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.internal.upload.DbUploader;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pe3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pe3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() throws Throwable {
        kbc kbcVar;
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                se3 se3Var = (se3) obj;
                ghb ghbVar = ew5.b;
                e5d e5dVar = ((g5d) se3Var.b).a;
                b5d b5dVar = e5dVar.c0;
                zv8[] zv8VarArr = e5d.S6;
                int iIntValue = ((Number) b5dVar.a(zv8VarArr[52]).b).intValue();
                int iIntValue2 = ((Number) e5dVar.c0.a(zv8VarArr[52]).i()).intValue();
                if (iIntValue2 != 0) {
                    iIntValue = iIntValue2;
                }
                long jO = qe7.O(iIntValue, lw5.SECONDS);
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "se3", ewi.d(se3Var.a, "#", " timeout = ", ew5.t(jO)), null);
                    }
                }
                return new ew5(jO);
            case 1:
                return so2.F(((ym3) obj).a.getContext(), 6);
            case 2:
                qw2 qw2VarJ = ((xn3) obj).j();
                qw2VarJ.getClass();
                Iterator it = qw2VarJ.O(qw2.K, false, new wv2(qw2VarJ, true, true)).iterator();
                while (it.hasNext()) {
                    i2 += ((rt2) it.next()).b.m;
                }
                gm0.m("qw2", "getUnreadMessagesCount: %d", Integer.valueOf(i2));
                return Integer.valueOf(i2);
            case 3:
                return Boolean.valueOf(ChatsTabWidget.o1((ChatsTabWidget) obj));
            case 4:
                ns3 ns3Var = (ns3) obj;
                ((mvi) ns3Var.n.getValue()).d();
                hq6 hq6Var = (hq6) ns3Var.o.getValue();
                hq6Var.j.getClass();
                hq6Var.b(new ft0((Object) null)).B(Collections.singleton(b81.a));
                return sbi.a;
            case 5:
                return ClipPathElement.path_delegate$lambda$0((ClipPathElement) obj);
            case 6:
                wz3 wz3Var = (wz3) obj;
                r8e r8eVarL = ((xn3) wz3Var.b.getValue()).l(wz3Var.a.a);
                o7f o7fVar = (o7f) wz3Var.d.getValue();
                return o7fVar.a(r8eVarL, o7fVar.a.d(136));
            case 7:
                a14 a14Var = (a14) obj;
                ghb ghbVar2 = ew5.b;
                long jO2 = qe7.O(((Number) ((e5d) a14Var.h.getValue()).c0.a(e5d.S6[52]).i()).intValue(), lw5.SECONDS);
                String str = a14Var.d;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str, "#" + a14Var.a + " timeout = " + ew5.t(jO2), null);
                    }
                }
                return new ew5(jO2);
            case 8:
                ConfirmationBottomSheet confirmationBottomSheet = (ConfirmationBottomSheet) obj;
                zv8[] zv8VarArr2 = ConfirmationBottomSheet.G;
                String string = confirmationBottomSheet.getArgs().getString("theme_key");
                if (string == null || (kbcVar = (kbc) ((mbc) pq3.j.e(confirmationBottomSheet.getContext()).d).c.get(string)) == null) {
                    return null;
                }
                return kbcVar;
            case 9:
                id4 id4Var = (id4) obj;
                if (!id4Var.a()) {
                    int i3 = id4Var.g + 1;
                    id4Var.g = i3;
                    id4Var.e = id4Var.f ? ((ew5) oc9.s(new ew5(id4Var.b), new ew5(0L))).a : sn0.a(i3, id4Var.c, id4Var.d);
                    id4Var.k = ((pfh) id4Var.i).a();
                }
                return sbi.a;
            case 10:
                nd4 nd4Var = (nd4) obj;
                String str2 = nd4Var.c;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, str2, "Create new channel group with 2 threads", null);
                    }
                }
                a2c a2cVar = (a2c) nd4Var.a.getValue();
                zv8[] zv8VarArr3 = a2c.t;
                return AsynchronousChannelGroup.withFixedThreadPool(2, ((rbc) a2cVar.h.getValue()).a("upload-network", 5, true, false));
            case 11:
                return ((kzi) obj).a(":memory:");
            case 12:
                ContactAddBottomSheet contactAddBottomSheet = (ContactAddBottomSheet) obj;
                gh4 gh4Var = (gh4) contactAddBottomSheet.m.getAccessor().c(HttpStatus.SC_USE_PROXY);
                long jD1 = contactAddBottomSheet.D1();
                gh4Var.getClass();
                return new fh4(jD1, gh4Var.a, gh4Var.b, gh4Var.c);
            case 13:
                return new fmd((jcd) ((vl4) obj).x.getValue());
            case 14:
                return Integer.valueOf(pq3.j.h((xl4) obj).getText().h);
            case 15:
                ContactsPickerScreen contactsPickerScreen = (ContactsPickerScreen) obj;
                zv8[] zv8VarArr4 = ContactsPickerScreen.o;
                int i4 = uw8.a;
                if (uw8.b(uw8.c)) {
                    ml9.b(contactsPickerScreen);
                }
                return sbi.a;
            case 16:
                return ((no4) obj).a.g(bi4.l, bi4.n);
            case 17:
                ap4 ap4Var = (ap4) obj;
                float[] fArr = new float[8];
                while (i2 < 8) {
                    fArr[i2] = ap4Var.g;
                    i2++;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                shapeDrawable.getPaint().setStrokeWidth(yl5.d().getDisplayMetrics().density * 0.5f);
                shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
                return shapeDrawable;
            case 18:
                ContextMenuBottomSheet contextMenuBottomSheet = (ContextMenuBottomSheet) obj;
                zv8[] zv8VarArr5 = ContextMenuBottomSheet.C;
                vv vvVar = contextMenuBottomSheet.A;
                zv8[] zv8VarArr6 = ContextMenuBottomSheet.C;
                zv8 zv8Var = zv8VarArr6[6];
                if (!((Boolean) vvVar.a(contextMenuBottomSheet)).booleanValue()) {
                    zv8 zv8Var2 = zv8VarArr6[6];
                    vvVar.b(contextMenuBottomSheet, Boolean.TRUE);
                    Object targetController = contextMenuBottomSheet.getTargetController();
                    vp4 vp4Var = targetController instanceof vp4 ? (vp4) targetController : null;
                    if (vp4Var != null) {
                        vp4Var.onDismiss();
                    }
                }
                return sbi.a;
            case 19:
                return Long.valueOf(((PeerIdGenerator) obj).generatePeerId());
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((ParticipantStore) obj).getActiveRoomId();
            case 21:
                return (Conversation.State) ((AtomicReference) obj).get();
            case 22:
                return Float.valueOf(((Number) ((ifh) ((ljf) ((uvc) obj).b).d).getValue()).longValue());
            case 23:
                return new px4((rx4) obj);
            case 24:
                return ((u35) obj).getContext().getDrawable(R.drawable.icon_eye_fill_mini).mutate();
            case 25:
                return Boolean.valueOf(DbUploader.multiUploadHelper_delegate$lambda$0$0((DbUploader) obj));
            case 26:
                return new umb((Context) ((c95) obj).a.getValue());
            case 27:
                return ((na5) obj).c.q(34);
            case 28:
                dme dmeVar = ((rc5) obj).n;
                if (dmeVar != null) {
                    return (xt4) dmeVar.k.getValue();
                }
                return null;
            default:
                String packageName = ((DevMenuInfoScreen) obj).getContext().getPackageName();
                Locale locale = Locale.ROOT;
                String lowerCase = "Store".toLowerCase(locale);
                String lowerCase2 = "GOOGLE".toLowerCase(locale);
                String str3 = new SimpleDateFormat("dd.MM.yy HH:mm", Locale.getDefault()).format((Object) 1787060913946L);
                StringBuilder sbQ = qv1.q("\n    Version: 26.28.0(6804)\n    AppId: ru.oneme.app\n    Package: ", packageName, "\n    Hash: f2d26047eb\n    BuildType: release\n    VariantName: ", lowerCase, "\n    Store: ");
                sbQ.append(lowerCase2);
                sbQ.append("\n    UseNarnia: false\n    Gost: false\n    UsePersonalCloud: false\n    BuildTime: ");
                sbQ.append(str3);
                sbQ.append(" \n");
                return new pd8("О сборке", s5h.x0(sbQ.toString()));
        }
    }
}
