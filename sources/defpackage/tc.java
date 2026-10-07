package defpackage;

import android.app.Activity;
import android.database.SQLException;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import one.me.android.MainActivity;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tc implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tc(wu7 wu7Var, MainActivity mainActivity, ym1 ym1Var) {
        this.a = 11;
        this.b = wu7Var;
        this.c = mainActivity;
    }

    /* JADX WARN: Code duplicated, block: B:199:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:238:0x0642  */
    /* JADX WARN: Code duplicated, block: B:253:0x068c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        Object poeVar;
        EGLDisplay eGLDisplay;
        EGLConfig eGLConfig;
        int i;
        int i2 = this.a;
        j8c j8cVar = j8c.e;
        eGLSurfaceEglCreateWindowSurface = null;
        eGLSurfaceEglCreateWindowSurface = null;
        EGLSurface eGLSurfaceEglCreateWindowSurface = null;
        sbi sbiVar = sbi.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                ((vc) obj3).u(((eni) obj2).d, !((Boolean) obj).booleanValue());
                return sbiVar;
            case 1:
                ((ql) obj3).b.c((qxe) obj, (ArrayList) obj2);
                return sbiVar;
            case 2:
                ((en) obj3).b.c((qxe) obj, (ArrayList) obj2);
                return sbiVar;
            case 3:
                ku kuVar = (ku) obj3;
                sb8.P(new va(kuVar, 8), (Activity) obj2, ((eu) obj).a == 2 ? "https://play.google.com/store/apps/details?id=ru.oneme.app" : (String) kuVar.a.getValue());
                return sbiVar;
            case 4:
                b00 b00Var = (b00) obj2;
                List list = (List) obj;
                cx3.d1(list, new ez(rx8.j0((pw) obj3), 0));
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (!(((kw7) it.next()) instanceof jw7)) {
                        }
                    }
                    if (b00Var.g().k() == 0) {
                        list.clear();
                    }
                } else if (b00Var.g().k() == 0) {
                    list.clear();
                }
                return sbiVar;
            case 5:
                mga mgaVar = (mga) obj3;
                p20 p20Var = (p20) obj2;
                List list3 = (List) obj;
                long j = mgaVar.a;
                long j2 = mgaVar.b;
                if (j < j2) {
                    long j3 = j2 % 1;
                    if (j3 < 0) {
                        j3++;
                    }
                    long j4 = j % 1;
                    if (j4 < 0) {
                        j4++;
                    }
                    long j5 = (j3 - j4) % 1;
                    if (j5 < 0) {
                        j5++;
                    }
                    j2 -= j5;
                }
                List list4 = list3;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list4) {
                    long c = ((kw7) obj4).getC();
                    if (j <= c && c <= j2) {
                        arrayList.add(obj4);
                    }
                }
                list3.removeAll(arrayList);
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (!(((kw7) it2.next()) instanceof jw7)) {
                        }
                    }
                    if (p20Var.g().k() == 0) {
                        list3.clear();
                    }
                } else if (p20Var.g().k() == 0) {
                    list3.clear();
                }
                return sbiVar;
            case 6:
                p20 p20Var2 = (p20) obj2;
                List list5 = (List) obj;
                cx3.d1(list5, new ez(rx8.j0(((lga) obj3).a), 1));
                List list6 = list5;
                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                    Iterator it3 = list6.iterator();
                    while (it3.hasNext()) {
                        if (!(((kw7) it3.next()) instanceof jw7)) {
                        }
                    }
                    if (p20Var2.g().k() == 0) {
                        list5.clear();
                    }
                } else if (p20Var2.g().k() == 0) {
                    list5.clear();
                }
                return sbiVar;
            case 7:
                List list7 = (List) obj;
                ((p20) obj3).u.o(list7, (List) obj2);
                cx3.d1(list7, new vi2(19));
                return sbiVar;
            case 8:
                return Long.valueOf(((jg0) obj3).b.e((qxe) obj, (fg0) obj2));
            case 9:
                CallGridLayoutManager callGridLayoutManager = (CallGridLayoutManager) obj3;
                int iMin = Math.min(callGridLayoutManager.M0(), callGridLayoutManager.G() - (callGridLayoutManager.M0() * ((Integer) obj).intValue()));
                int iD = (callGridLayoutManager.u.d() - (((iMin + 1) * callGridLayoutManager.q) + (((ufe) obj2).a * iMin))) / 2;
                return Integer.valueOf(iD >= 0 ? iD : 0);
            case 10:
                qxe qxeVar = (qxe) obj;
                v2a v2aVar = ((xj1) obj3).b;
                List list8 = (List) obj2;
                if (list8 != null) {
                    for (Object obj5 : list8) {
                        try {
                            ((pl) v2aVar.b).d(qxeVar, obj5);
                        } catch (SQLException e) {
                            String message = e.getMessage();
                            if (message == null) {
                                throw e;
                            }
                            if (!r5h.L0(message, "unique", true) && !r5h.L0(message, "2067", false) && !r5h.L0(message, "1555", false)) {
                                throw e;
                            }
                            ((vj1) v2aVar.c).G(qxeVar, obj5);
                        }
                    }
                }
                return sbiVar;
            case 11:
                wu7 wu7Var = (wu7) obj3;
                Activity activity = (Activity) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                ViewGroup.LayoutParams layoutParams = wu7Var.getLayoutParams();
                WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    int height = activity.getWindow().getDecorView().getHeight() - wu7Var.getHeight();
                    if (height < 0) {
                        height = 0;
                    }
                    layoutParams2.y = oc9.v(layoutParams2.y + ((int) fFloatValue), 0, height);
                    try {
                        activity.getWindowManager().updateViewLayout(wu7Var, layoutParams2);
                        poeVar = sbiVar;
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    Throwable thA = roe.a(poeVar);
                    if (thA != null) {
                        gm0.V("PipAppController", "can't move held call banner", thA);
                    }
                }
                return sbiVar;
            case 12:
                ns1 ns1Var = (ns1) obj3;
                Surface surface = (Surface) obj2;
                ms1 ms1Var = (ms1) obj;
                ms1Var.getClass();
                ms1Var.d(ns1Var.a);
                surface.getClass();
                if (surface.isValid() && (eGLDisplay = ms1Var.e) != null && (eGLConfig = ms1Var.f) != null) {
                    eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
                    if (eGLSurfaceEglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                        throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "createSurface()");
                    }
                    eGLSurfaceEglCreateWindowSurface.getClass();
                    ms1Var.b(eGLSurfaceEglCreateWindowSurface);
                    GLES20.glPixelStorei(3317, 1);
                    int iIncrementAndGet = ms1.l.incrementAndGet();
                    ms1Var.a.log(ms1Var.j, "Surface created, total count is " + iIncrementAndGet);
                }
                ns1Var.a = eGLSurfaceEglCreateWindowSurface;
                return sbiVar;
            case 13:
                CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) obj3;
                et4 et4Var = (et4) obj;
                zv8[] zv8VarArr = CallOpponentsListWidget.v;
                mt1 mt1Var = new mt1(callOpponentsListWidget, 0);
                View rqVar = new rq(et4Var.getContext());
                rqVar.setId(R.id.call_opponents_list_app_bar);
                rqVar.setFocusable(true);
                rqVar.setFocusableInTouchMode(true);
                rqVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rqVar.setBackground(null);
                rqVar.setStateListAnimator(null);
                mt1Var.invoke(rqVar);
                et4Var.addView(rqVar);
                LinearLayout linearLayout = new LinearLayout(((LayoutInflater) obj2).getContext());
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
                recyclerView.setId(R.id.call_user_list_in_call_list);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter((et1) callOpponentsListWidget.s.getValue());
                recyclerView.setClipToPadding(true);
                recyclerView.setBackgroundColor(pq3.j.l(recyclerView).b.b().c);
                bt4 bt4Var = new bt4(-1, -1);
                bt4Var.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(bt4Var);
                linearLayout.addView(recyclerView);
                NestedScrollView nestedScrollView = new NestedScrollView(linearLayout.getContext());
                nestedScrollView.setFillViewport(true);
                ViewStub viewStub = new ViewStub(nestedScrollView.getContext());
                viewStub.setId(R.id.call_screen_opponent_empty_list);
                nestedScrollView.addView(viewStub);
                nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                linearLayout.addView(nestedScrollView);
                bt4 bt4Var2 = new bt4(-1, -1);
                bt4Var2.b(new AppBarLayout$ScrollingViewBehavior());
                linearLayout.setLayoutParams(bt4Var2);
                et4Var.addView(linearLayout);
                return sbiVar;
            case 14:
                i12 i12Var = (i12) obj3;
                dnf dnfVar = (dnf) obj2;
                l5g l5gVar = (l5g) obj;
                l5gVar.getClass();
                uvc uvcVar = l5gVar.a;
                ru1 ru1Var = i12Var.b;
                if (ru1Var.a.b() || cqk.d(ru1Var.k, dnfVar)) {
                    ru1Var.h(dnfVar, (List) uvcVar.b);
                    for (au1 au1Var : (List) uvcVar.c) {
                        vmc vmcVar = i12Var.e.n;
                        yt1 yt1Var = au1Var.b;
                        yt1Var.getClass();
                        vmcVar.onStateChanged(yt1Var, au1Var);
                    }
                }
                return sbiVar;
            case 15:
                w22.v((w22) obj3, (g52) obj2, ((Integer) obj).intValue());
                return sbiVar;
            case 16:
                g52.D((g52) obj3, (ok0) obj2, ((Boolean) obj).booleanValue());
                return sbiVar;
            case 17:
                return Long.valueOf(((ba2) obj3).b.e((qxe) obj, (kb1) obj2));
            case 18:
                BottomSheetWidget bottomSheetWidget = (BottomSheetWidget) obj3;
                o65 o65Var = (o65) obj2;
                rbb rbbVar = (rbb) obj;
                if (rbbVar instanceof i65) {
                    uuf.b.e((i65) rbbVar);
                } else if (rbbVar instanceof igc) {
                    Activity activity2 = bottomSheetWidget.getActivity();
                    if (activity2 != null) {
                        sb8.P(new q11(bottomSheetWidget, 2), activity2, ((igc) rbbVar).b.toString());
                    }
                } else if (rbbVar instanceof jgc) {
                    h8c h8cVar = new h8c(bottomSheetWidget);
                    CharSequence charSequenceB = ((jgc) rbbVar).b.b(bottomSheetWidget.getContext());
                    if (charSequenceB == null) {
                        charSequenceB = "";
                    }
                    h8cVar.n(charSequenceB);
                    h8cVar.a(null);
                    h8cVar.h(new w8c(R.drawable.icon_link_brake));
                    h8cVar.p();
                } else if (rbbVar instanceof hgc) {
                    o65.e(o65Var, ((hgc) rbbVar).b, null, null, 6);
                }
                zpe zpeVar = BaseBottomSheetWidget.i;
                bottomSheetWidget.v1(true);
                return sbiVar;
            case 19:
                gm0.x(((as2) obj3).e, "job.cancel()", null);
                ((sgg) obj2).b(null);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((qod) obj3).invoke(((CharSequence) obj).toString());
                ((c83) obj2).H(null);
                return sbiVar;
            case 21:
                rsf rsfVar = ((ChatNotificationsSettingsScreen) obj3).d;
                k96 k96Var = (k96) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue < 0) {
                    zv8[] zv8VarArr2 = ChatNotificationsSettingsScreen.g;
                    return null;
                }
                if (iIntValue >= rsfVar.l() || ((psf) ((k79) rsfVar.F(iIntValue))).getItemId() != R.id.oneme_notifications_settings_chat_type_all_button) {
                    return null;
                }
                return np4.q(k96Var.getContext(), R.string.oneme_notifications_settings_chat_enabled_section_title).toUpperCase(Locale.ROOT);
            case 22:
                return Long.valueOf(((ph3) obj3).b.e((qxe) obj, (jy2) obj2));
            case 23:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj3;
                k96 k96Var2 = (k96) obj2;
                int iN = chatsListSearchScreen.B.n(((Integer) obj).intValue());
                if (iN == R.id.oneme_contactlist_contact_view_type) {
                    return k96Var2.getResources().getString(R.string.search_all_contacts_header);
                }
                if (iN == R.id.oneme_contactlist_phonebook_contact_view_type) {
                    return k96Var2.getResources().getString(R.string.search_phonebook_contacts_header);
                }
                if (iN == R.id.chats_search_contact_view_type) {
                    if (chatsListSearchScreen.t.l() == 0) {
                        return k96Var2.getResources().getString(R.string.chats_list_search_contacts_header);
                    }
                    return null;
                }
                if (iN == R.id.chats_search_global_contact_view_type || iN == R.id.chats_search_global_chat_view_type) {
                    return k96Var2.getResources().getString(R.string.search_global_contacts_header);
                }
                if (iN == R.id.search_action_view_type) {
                    return k96Var2.getResources().getString(R.string.search_actions_header);
                }
                if (iN == R.id.chats_search_chat_view_type) {
                    if (chatsListSearchScreen.q.d.f.isEmpty()) {
                        return k96Var2.getResources().getString(R.string.search_chats_and_channels_header);
                    }
                    return null;
                }
                if (iN == R.id.chats_search_message_view_type) {
                    return k96Var2.getResources().getString(R.string.chats_list_search_messages_header);
                }
                return null;
            case 24:
                fk3 fk3Var = (fk3) obj3;
                vg4 vg4Var = (vg4) obj2;
                if (((j8c) obj) == j8cVar) {
                    fk3.D(fk3Var, vg4Var.v(), false);
                }
                return sbiVar;
            case 25:
                rl3 rl3Var = (rl3) obj3;
                Set set = (Set) obj2;
                int iOrdinal = ((j8c) obj).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    i = 1;
                } else {
                    i = 3;
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            i = 2;
                        } else if (iOrdinal != 4) {
                            ore.o();
                            return null;
                        }
                    }
                }
                int iD2 = qt4.D(i);
                if (iD2 == 0) {
                    a8j.t(rl3Var, ((n0c) rl3Var.h).b(), new k23(rl3Var, set, null, 20), 2);
                } else if (iD2 == 1) {
                    rl3Var.O(set);
                } else {
                    if (iD2 != 2) {
                        ore.o();
                        return null;
                    }
                    mjg mjgVar = rl3Var.x1;
                    Set setY = lof.Y((Set) mjgVar.getValue(), set);
                    mjgVar.j(null, setY);
                    mjg mjgVar2 = rl3Var.y1;
                    Integer numValueOf = Integer.valueOf(setY.hashCode());
                    mjgVar2.getClass();
                    mjgVar2.j(null, numValueOf);
                }
                return sbiVar;
            case 26:
                rl3 rl3Var2 = (rl3) obj3;
                vg4 vg4Var2 = (vg4) obj2;
                if (((j8c) obj) == j8cVar) {
                    rl3.H(rl3Var2, vg4Var2.v(), false);
                }
                return sbiVar;
            case 27:
                qw2 qw2VarH = ((pq3) obj3).h();
                qw2VarH.getClass();
                tw2 tw2Var = new tw2();
                qw2.F(tw2Var, 0L, 0L, 3, 0L, Collections.EMPTY_MAP, 0L, 1, 0L, 0L, "", null, null, 0L, 0L);
                tw2Var.b = lx2.e;
                tw2Var.J = Collections.EMPTY_LIST;
                tw2Var.d(null);
                tw2Var.c = kx2.a;
                tw2Var.e = Collections.singletonMap(Long.valueOf(qw2VarH.S()), 0L);
                tw2Var.n = new fx2();
                return p90.a(qw2VarH.D((q24) obj2, new nx2(tw2Var)));
            case 28:
                return Integer.valueOf(((g24) obj3).e.G((qxe) obj, (cei) obj2));
            default:
                return Integer.valueOf(((g24) obj3).d.G((qxe) obj, (dz3) obj2));
        }
    }

    public /* synthetic */ tc(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
