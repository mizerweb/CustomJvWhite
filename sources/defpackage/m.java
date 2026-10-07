package defpackage;

import android.app.Activity;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.calls.share.CallSharePickerScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.rlottie.RLottieFactory;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.stories.edit.EditStoryScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0331  */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        boolean z;
        Object value;
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a8j.x(((AboutAppSettingsScreen) obj2).o1().g, rt3.b);
                return sbi.a;
            case 1:
                return obj == ((b2) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 2:
                ru8 ru8Var = (ru8) obj2;
                ru8Var.K((jt8) obj, (String) ww3.B1(ru8Var.a));
                return sbi.a;
            case 3:
                rt2 rt2Var = (rt2) obj;
                return Boolean.valueOf(rt2Var.b.m > 0 && !rt2Var.s0((et3) ((q5) obj2).f.getValue()));
            case 4:
                return Boolean.valueOf(((WeakReference) obj).get() == ((Activity) obj2));
            case 5:
                zv8[] zv8VarArr = AddChatAdminsScreen.l;
                ((AddChatAdminsScreen) obj2).getRouter().D();
                return sbi.a;
            case 6:
                zv8[] zv8VarArr2 = AddChatMembersScreen.r;
                ltb onBackPressedDispatcher = ((AddChatMembersScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return sbi.a;
            case 7:
                zv8[] zv8VarArr3 = AddLinkBottomSheet.s;
                a69 a69Var = (a69) ((AddLinkBottomSheet) obj2).r.getValue();
                String string = ((CharSequence) obj).toString();
                mjg mjgVar = a69Var.f;
                mjgVar.getClass();
                mjgVar.j(null, string);
                return sbi.a;
            case 8:
                zv8[] zv8VarArr4 = AdminWaitingRoomScreen.i;
                ((AdminWaitingRoomScreen) obj2).getRouter().D();
                return sbi.a;
            case 9:
                ((n9a) ((AdminsFromContactsScreen) ((h47) obj2).g).c.getValue()).E(((Long) obj).longValue(), false);
                return sbi.a;
            case 10:
                AdminsFromContactsScreen adminsFromContactsScreen = (AdminsFromContactsScreen) obj2;
                int iIntValue = ((Integer) obj).intValue();
                zv8[] zv8VarArr5 = AdminsFromContactsScreen.k;
                je jeVar = (je) adminsFromContactsScreen.d.getValue();
                h47 h47Var = adminsFromContactsScreen.j;
                return (!jeVar.B() && iIntValue < h47Var.l()) ? ((oc) ((k79) h47Var.F(iIntValue))).b : "";
            case 11:
                yl ylVar = (yl) obj2;
                return RLottieFactory.create(new RLottieFactory.Config(new RLottieFactory.Way.Url(ylVar.c, true, ylVar.b(), ylVar.b(), true), false, ylVar.a() == 1, ylVar.a() != 3, false, 18, null));
            case 12:
                km kmVar = (km) obj2;
                mg1 mg1Var = (mg1) obj;
                mg1Var.getClass();
                x52 x52Var = mg1Var.a;
                yvi yviVar = mg1Var.b;
                yviVar.getClass();
                if (yviVar.a != 0 && yviVar.b != 0 && x52Var.a == v4j.c) {
                    ysj ysjVar = kmVar.e;
                    yt1 yt1Var = x52Var.b;
                    yt1Var.getClass();
                    z = ((Boolean) ysjVar.invoke(yt1Var)).booleanValue();
                }
                return Boolean.valueOf(z);
            case 13:
                return Boolean.valueOf(((xm) obj2).h(((Long) obj).longValue()) == null);
            case 14:
                l8b l8bVar = (l8b) obj2;
                List list = (List) obj;
                for (Object obj3 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    kw7 kw7Var = (kw7) l8bVar.f(((kw7) obj3).getA());
                    if (kw7Var != null) {
                        list.set(i2, kw7Var);
                    }
                    i2 = i3;
                }
                return sbi.a;
            case 15:
                kbc kbcVar = (kbc) obj2;
                return new int[]{((rac) kbcVar.a().f).b, ((rac) kbcVar.a().g).b, ((rac) kbcVar.a().c).b, ((rac) kbcVar.a().d).b, ((rac) kbcVar.a().e).b};
            case 16:
                zl0 zl0Var = (zl0) obj;
                om0 om0Var = ((pm0) obj2).g;
                if (om0Var != null) {
                    hu huVar = (hu) om0Var;
                    boh bohVar = (boh) huVar.b;
                    EditStoryScreen editStoryScreen = (EditStoryScreen) huVar.c;
                    zv8[] zv8VarArr6 = EditStoryScreen.A1;
                    p0m.a(bohVar, kt7.CLOCK_TICK);
                    p26 p26VarC1 = editStoryScreen.C1();
                    int[] iArr = zl0Var.b;
                    u8b u8bVar = (u8b) p26VarC1.N().f.a.getValue();
                    Object[] objArr = u8bVar.a;
                    int i4 = u8bVar.b;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            i5 = -1;
                        } else if (!Arrays.equals(((aoh) objArr[i5]).a(), iArr)) {
                            i5++;
                        }
                    }
                    hj8 hj8VarF0 = oc9.f0(0, u8bVar.b);
                    aoh aohVar = (i5 > hj8VarF0.b || hj8VarF0.a > i5) ? null : (aoh) u8bVar.g(i5);
                    if (aohVar == null) {
                        String str = p26VarC1.j;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "text story background item is null, returning early", null);
                            }
                        }
                    } else {
                        p26VarC1.N().g.setValue(aohVar.getName());
                        a8j.x(p26VarC1.F1, new w06(i5));
                    }
                }
                return sbi.a;
            case 17:
                ((bw0) obj2).o.set(false);
                return sbi.a;
            case 18:
                dw0 dw0Var = (dw0) obj2;
                af7 onDoubleTap = dw0Var.getOnDoubleTap();
                if (onDoubleTap != null) {
                    onDoubleTap.invoke();
                }
                return Boolean.valueOf(dw0Var.getOnDoubleTap() != null);
            case 19:
                o61 o61Var = (o61) obj2;
                s01 s01Var = (s01) obj;
                c61 c61Var = s01Var.a;
                j61 j61Var = c61Var.b;
                j61 j61Var2 = j61.CALLBACK;
                r60 r60Var = s01Var.b;
                float f = r60Var.d;
                float fAbs = j61Var == j61Var2 ? (float) Math.abs(f - r60Var.b) : ((float) Math.abs(f - r60Var.b)) - (o61Var.f + o61Var.b);
                if (fAbs < 0.0f) {
                    fAbs = (float) Math.abs(r60Var.d - r60Var.b);
                }
                s01Var.i = TextUtils.ellipsize((c61Var.b == j61.REQUEST_GEO_LOCATION && c61Var.f) ? o61Var.getContext().getString(R.string.button_title_send_location_by_request) : c61Var.a, o61Var.n, fAbs, TextUtils.TruncateAt.END).toString();
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                zv8[] zv8VarArr7 = CallAdminSettingsScreen.j;
                return Integer.valueOf(pq3.j.k(((CallAdminSettingsScreen) obj2).getContext()).b.b().f);
            case 21:
                zv8[] zv8VarArr8 = CallDebugMenuScreen.i;
                return Integer.valueOf(pq3.j.k(((CallDebugMenuScreen) obj2).getContext()).b.b().f);
            case 22:
                int iIntValue2 = ((Integer) obj).intValue();
                er3 er3Var = CallHistoryPageScreen.l;
                yw7 yw7Var = (yw7) ((cl1) ((CallHistoryPageScreen) obj2).i.getValue()).J(iIntValue2);
                if (yw7Var != null) {
                    return Long.valueOf(yw7Var.a);
                }
                return null;
            case 23:
                return Integer.valueOf(pq3.j.e(((co1) obj2).a).m().getText().h);
            case 24:
                ((wo1) obj2).f.set(false);
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, "CallInviteToP2PController", "Failed enable invite to p2p feature.", null);
                    }
                }
                return sbi.a;
            case 25:
                vq1 vq1Var = (vq1) obj2;
                Long l = ((lq1) vq1Var.k.a.getValue()).i;
                if (l != null) {
                    long jLongValue = l.longValue();
                    ic6 ic6Var = vq1Var.m;
                    pk1.b.getClass();
                    bc1.q(":call-presettings?chat_id=" + jLongValue, ic6Var);
                } else {
                    gm0.Y(vq1.class.getName(), "Early return in openCallPresettings cuz of state.value.serverChatId is null");
                }
                return sbi.a;
            case 26:
                ms1 ms1Var = (ms1) obj;
                sbi sbiVar = sbi.a;
                ms1Var.getClass();
                EGLSurface eGLSurface = ((u52) obj2).a;
                if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
                    EGLDisplay eGLDisplay = ms1Var.e;
                    if (eGLDisplay == null) {
                        throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
                    }
                    ms1Var.b(eGLSurface);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
                    ms1.a("clearImage()");
                }
                return sbiVar;
            case 27:
                CharSequence charSequenceD0 = lvb.d0((CharSequence) obj);
                CallPresettingsScreen callPresettingsScreen = (CallPresettingsScreen) ((zo7) obj2).b;
                zv8[] zv8VarArr9 = CallPresettingsScreen.i;
                nv1 nv1VarO1 = callPresettingsScreen.o1();
                mjg mjgVar2 = nv1VarO1.e;
                do {
                    value = mjgVar2.getValue();
                    ((hv1) value).getClass();
                } while (!mjgVar2.h(value, new hv1(charSequenceD0)));
                nv1VarO1.C(charSequenceD0);
                return sbi.a;
            case 28:
                x7j x7jVar = (x7j) obj;
                zy1 zy1Var = ((bz1) obj2).y;
                if (zy1Var != null) {
                    CallScreen callScreen = ((fx1) zy1Var).a;
                    l6m l6mVar = CallScreen.D1;
                    callScreen.R1().E(x7jVar, true);
                }
                return sbi.a;
            default:
                oi8 oi8Var = CallSharePickerScreen.p;
                ltb onBackPressedDispatcher2 = ((CallSharePickerScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return sbi.a;
        }
    }
}
