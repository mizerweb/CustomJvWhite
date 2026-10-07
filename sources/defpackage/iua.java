package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.health.SystemHealthManager;
import android.view.ViewConfiguration;
import one.me.chats.picker.stories.PickStoryPresetScreen;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.pinbars.PinBarsWidget;
import one.me.polls.screens.create.PollCreateScreen;
import one.me.polls.screens.result.voterslist.PollAnswerVotersListScreen;
import one.me.sdk.permissionhost.PermissionBottomSheet;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.SoftwareVideoEncoderFactory;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.analytics.internal.upload.MultiUploadHelper;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iua implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iua(gu4 gu4Var, pza pzaVar) {
        this.a = 2;
        this.b = pzaVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00e5  */
    @Override // defpackage.af7
    public final Object invoke() {
        Object poeVar;
        int i = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((kua) obj).N());
            case 1:
                h hVar = ((MessagesSettingsScreen) obj).b;
                return new bwa((nni) hVar.getAccessor().c(161), (i6e) hVar.getAccessor().c(321), hVar.getAccessor().d(312), hVar.getAccessor().d(320), hVar.getAccessor().d(23), hVar.getAccessor().d(389), hVar.getAccessor().d(390), (da4) hVar.getAccessor().c(369), hVar.getAccessor().d(360), hVar.getAccessor().d(254));
            case 2:
                try {
                    f40 f40VarC = ((pza) obj).c();
                    if (!f40VarC.c.delete() || !f40VarC.d.delete() || !f40VarC.e.delete()) {
                        z = false;
                    }
                    poeVar = Boolean.valueOf(z);
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                return new roe(poeVar);
            case 3:
                return Boolean.valueOf(MultiFileUploader.multiUploadHelper_delegate$lambda$0$0((MultiFileUploader) obj));
            case 4:
                return so2.F(((d6b) obj).a.getContext(), 2);
            case 5:
                return MultiUploadHelper.handler_delegate$lambda$0((MultiUploadHelper) obj);
            case 6:
                w7b w7bVar = (w7b) obj;
                xte xteVar = w7bVar.a;
                xteVar.s = true;
                xteVar.g();
                w7bVar.a.i();
                xte xteVar2 = w7bVar.a;
                String str = xteVar2.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "notifyListeners: AudioPlayUrl.update", null);
                    }
                }
                synchronized (xteVar2.i) {
                    for (tte tteVar : xteVar2.i) {
                        w7bVar.a.g();
                        w7bVar.a.i();
                        tteVar.j();
                    }
                }
                return sbi.a;
            case 7:
                Object systemService = ((pcb) obj).a.getSystemService((Class<Object>) SystemHealthManager.class);
                if (systemService != null) {
                    return (SystemHealthManager) systemService;
                }
                ore.p("Required value was null.");
                return null;
            case 8:
                sdb sdbVar = (sdb) obj;
                int iK = gm0.K(64.0f * yl5.d().getDisplayMetrics().density);
                rdb rdbVar = new rdb();
                rdbVar.setCallback(sdbVar);
                rdbVar.b(sdb.l(pq3.j.h(sdbVar)));
                rdbVar.setBounds(0, 0, iK, iK);
                rdbVar.i.B(rdbVar, rdb.j[0], Float.valueOf(iK / 2.0f));
                return rdbVar;
            case 9:
                Context context = ((vxb) obj).a;
                ny8 ny8Var = yl5.a;
                return Integer.valueOf(context.getResources().getDisplayMetrics().widthPixels);
            case 10:
                izb izbVar = (izb) obj;
                return new RippleDrawable(ColorStateList.valueOf(((bs0) pq3.j.h(izbVar).u().c.g).c), null, izbVar.s);
            case 11:
                vzb vzbVar = (vzb) obj;
                Drawable drawableMutate = vzbVar.getContext().getDrawable(R.drawable.icon_cross_round_fill).mutate();
                pq3.j.h(vzbVar);
                sb8.m0(-1, drawableMutate);
                return drawableMutate;
            case 12:
                v0c v0cVar = (v0c) obj;
                v0cVar.e = 1.0f;
                v0cVar.H = 4;
                v0cVar.g = null;
                v0cVar.i = null;
                v0cVar.h = null;
                v0cVar.s.setAlpha(v0cVar.D);
                v0cVar.o.setAlpha(255);
                return sbi.a;
            case 13:
                return ((y8e) obj).f();
            case 14:
                e8c e8cVar = (e8c) obj;
                e8cVar.post(e8cVar.i);
                return sbi.a;
            case 15:
                bec becVar = (bec) obj;
                t4j t4jVarF = becVar.o.f();
                if (t4jVarF == null) {
                    return null;
                }
                ux9 ux9Var = t4jVarF.b;
                return ((h1e) becVar.h.getValue()).c(((kwi) ux9Var).c().a, ((kwi) ux9Var).c().b, y0e.l);
            case 16:
                return new na1((pnc) obj, 1);
            case 17:
                ioc iocVar = (ioc) obj;
                try {
                    return new SoftwareVideoEncoderFactory();
                } catch (Throwable th2) {
                    return new hoc(iocVar.b, new IllegalStateException("Can't create SoftwareVideoEncoder", th2));
                }
            case 18:
                PermissionBottomSheet permissionBottomSheet = (PermissionBottomSheet) obj;
                vv vvVar = permissionBottomSheet.I;
                zv8[] zv8VarArr = PermissionBottomSheet.Y;
                zv8 zv8Var = zv8VarArr[8];
                if (!((Boolean) vvVar.a(permissionBottomSheet)).booleanValue()) {
                    zv8 zv8Var2 = zv8VarArr[8];
                    vvVar.b(permissionBottomSheet, Boolean.TRUE);
                    Object targetController = permissionBottomSheet.getTargetController();
                    hsc hscVar = targetController instanceof hsc ? (hsc) targetController : null;
                    if (hscVar != null) {
                        hscVar.Y0(permissionBottomSheet.X);
                    }
                    permissionBottomSheet.X = false;
                }
                return sbi.a;
            case 19:
                svj.e((svj) obj, R.string.permissions_camera_request_denied_permanently, null, null, null, true, Integer.valueOf(R.string.go_to_settings), 14);
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                float fIntValue = ((Number) ((vvc) obj).a.getValue()).intValue();
                return Integer.valueOf((int) (fIntValue - (0.4f * fIntValue)));
            case 21:
                PickChatMembers pickChatMembers = (PickChatMembers) obj;
                zv8[] zv8VarArr2 = PickChatMembers.p;
                int i2 = uw8.a;
                if (uw8.b(uw8.c)) {
                    ml9.b(pickChatMembers);
                }
                return sbi.a;
            case 22:
                PickStoryPresetScreen pickStoryPresetScreen = (PickStoryPresetScreen) obj;
                zv8[] zv8VarArr3 = PickStoryPresetScreen.o;
                int i3 = uw8.a;
                if (uw8.b(uw8.c)) {
                    ml9.b(pickStoryPresetScreen);
                }
                return sbi.a;
            case 23:
                hr7 hr7Var = (hr7) obj;
                zv8[] zv8VarArr4 = PinBarsWidget.z;
                o65.c(b0d.b.b(), qt4.n(":call-join-link?link=", hr7Var.a, "&video_enabled=", hr7Var.b), null, null, 6);
                return sbi.a;
            case 24:
                if (((gc4) obj).getState() != dc4.ERROR) {
                    int i4 = uw8.a;
                    z = uw8.b(uw8.c);
                }
                return Boolean.valueOf(z);
            case 25:
                ((mkc) obj).e(false);
                return sbi.a;
            case 26:
                return Integer.valueOf(ViewConfiguration.get(((k1d) obj).a.getContext()).getScaledTouchSlop());
            case 27:
                PollAnswerVotersListScreen pollAnswerVotersListScreen = (PollAnswerVotersListScreen) obj;
                m6d m6dVar = (m6d) pollAnswerVotersListScreen.f.getAccessor().c(765);
                vv vvVar2 = pollAnswerVotersListScreen.b;
                zv8[] zv8VarArr5 = PollAnswerVotersListScreen.n;
                zv8 zv8Var3 = zv8VarArr5[0];
                long jLongValue = ((Number) vvVar2.a(pollAnswerVotersListScreen)).longValue();
                vv vvVar3 = pollAnswerVotersListScreen.c;
                zv8 zv8Var4 = zv8VarArr5[1];
                long jLongValue2 = ((Number) vvVar3.a(pollAnswerVotersListScreen)).longValue();
                vv vvVar4 = pollAnswerVotersListScreen.d;
                zv8 zv8Var5 = zv8VarArr5[2];
                long jLongValue3 = ((Number) vvVar4.a(pollAnswerVotersListScreen)).longValue();
                vv vvVar5 = pollAnswerVotersListScreen.e;
                zv8 zv8Var6 = zv8VarArr5[3];
                return new l6d(jLongValue, jLongValue2, jLongValue3, ((Number) vvVar5.a(pollAnswerVotersListScreen)).intValue(), m6dVar.a, m6dVar.b, m6dVar.c, m6dVar.d, m6dVar.e, m6dVar.f, m6dVar.g);
            case 28:
                return ((h7d) obj).getContext().getDrawable(R.drawable.icon_cup_fill).mutate();
            default:
                PollCreateScreen pollCreateScreen = (PollCreateScreen) obj;
                z7d z7dVar = (z7d) pollCreateScreen.d.getAccessor().c(763);
                vv vvVar6 = pollCreateScreen.a;
                zv8 zv8Var7 = PollCreateScreen.n[0];
                long jLongValue4 = ((Number) vvVar6.a(pollCreateScreen)).longValue();
                z7dVar.getClass();
                return new y7d(jLongValue4);
        }
    }

    public /* synthetic */ iua(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
