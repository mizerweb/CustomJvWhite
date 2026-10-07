package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.vk.push.core.network.data.model.AppInfoRemote;
import com.vk.push.core.network.data.source.MasterHostApi;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import com.vk.push.core.network.utils.AppInfoJsonParser;
import com.vk.push.core.network.utils.ExtensionsKt;
import com.vk.push.core.network.utils.MapperKt;
import com.vk.push.core.network.utils.ResponseErrorKt;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.appupdate.forceupdate.ForceUpdateScreen;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.messages.list.loader.MessageModel;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class c37 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c37(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new c37((f37) obj2, lq4Var, 0);
            case 1:
                return new c37((n37) obj2, lq4Var, 1);
            case 2:
                return new c37((d67) obj2, lq4Var, 2);
            case 3:
                return new c37((x67) obj2, lq4Var, 3);
            case 4:
                return new c37((ej7) obj2, lq4Var, 4);
            case 5:
                return new c37((sc9) obj2, lq4Var, 5);
            case 6:
                return new c37((MasterHostApi) obj2, lq4Var, 6);
            case 7:
                return new c37((kz9) obj2, lq4Var, 7);
            case 8:
                return new c37((fva) obj2, lq4Var, 8);
            case 9:
                return new c37((bwa) obj2, lq4Var, 9);
            case 10:
                return new c37((xeb) obj2, lq4Var, 10);
            case 11:
                return new c37((pfb) obj2, lq4Var, 11);
            case 12:
                return new c37((pfb) obj2, lq4Var, 12);
            case 13:
                return new c37((cxb) obj2, lq4Var, 13);
            case 14:
                return new c37((wic) obj2, lq4Var, 14);
            case 15:
                return new c37((vrc) obj2, lq4Var, 15);
            case 16:
                return new c37((PickerContactsListWidget) obj2, lq4Var, 16);
            case 17:
                return new c37((xre) obj2, lq4Var, 17);
            case 18:
                return new c37((vfd) obj2, lq4Var, 18);
            case 19:
                return new c37((yfd) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new c37((end) obj2, lq4Var, 20);
            case 21:
                return new c37((srd) obj2, lq4Var, 21);
            case 22:
                return new c37((ProfileScreen) obj2, lq4Var, 22);
            case 23:
                return new c37((wfe) obj2, lq4Var, 23);
            case 24:
                return new c37((x6e) obj2, lq4Var, 24);
            case 25:
                return new c37((a8e) obj2, lq4Var, 25);
            case 26:
                return new c37((kde) obj2, lq4Var, 26);
            case 27:
                return new c37((dme) obj2, lq4Var, 27);
            case 28:
                return new c37((String) obj2, lq4Var, 28);
            default:
                return new c37((lmf) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                return ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                return ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((c37) create(bool, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                ((c37) create((z94) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                ((c37) create((ik0) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                return ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                return ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                ((c37) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 18:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 23:
                ((c37) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 24:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 25:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                ((c37) create((t4f) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 27:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 28:
                ((c37) create((Integer) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((c37) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v145 */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [poe] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [jsf] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Throwable] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        int i;
        ?? jsfVar;
        ?? poeVar;
        ?? poeVar2;
        jmf jmfVar;
        ry7 ry7Var = null;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                h8c h8cVar = (h8c) ((f37) this.f).j.getValue();
                h8cVar.m(new tnh(R.string.snack_network_error_title));
                h8cVar.a(new tnh(R.string.snack_network_error_description));
                h8cVar.p();
                return sbi.a;
            case 1:
                ch3.d0(obj);
                h8c h8cVar2 = (h8c) ((n37) this.f).c.getValue();
                h8cVar2.m(new tnh(R.string.snack_network_error_title));
                h8cVar2.a(new tnh(R.string.snack_network_error_description));
                return h8cVar2.p();
            case 2:
                ch3.d0(obj);
                h8c h8cVar3 = (h8c) ((d67) this.f).f.getValue();
                h8cVar3.m(new tnh(R.string.snack_network_error_title));
                h8cVar3.a(new tnh(R.string.snack_network_error_description));
                return h8cVar3.p();
            case 3:
                ch3.d0(obj);
                h8c h8cVar4 = (h8c) ((x67) this.f).j.getValue();
                h8cVar4.m(new tnh(R.string.snack_network_error_title));
                h8cVar4.a(new tnh(R.string.snack_network_error_description));
                return h8cVar4.p();
            case 4:
                ch3.d0(obj);
                gm0.n("ej7", "updateUiItemsBySelections()");
                ej7 ej7Var = (ej7) this.f;
                mjg mjgVar = ej7Var.n;
                Iterable<ki7> iterable = (Iterable) mjgVar.getValue();
                ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
                for (ki7 ki7Var : iterable) {
                    int iE = ej7Var.E(ki7Var.c);
                    arrayList.add(ki7.b(ki7Var, null, null, null, iE, !((Boolean) ej7Var.m.getValue()).booleanValue() || iE > 0, 0, null, 3903));
                }
                mjgVar.getClass();
                mjgVar.j(null, arrayList);
                return sbi.a;
            case 5:
                ch3.d0(obj);
                sc9 sc9Var = (sc9) this.f;
                Context context = sc9Var.e;
                ny8 ny8Var = sc9Var.i;
                String str = sc9Var.c;
                mjg mjgVar2 = sc9Var.j;
                String str2 = sc9Var.l;
                gm0.n(str2, "buildItems");
                List list = sc9Var.g;
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(yw3.W0(list2, 10));
                Iterator it = list2.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        ?? r22 = ry7Var;
                        xw3.V0();
                        throw r22;
                    }
                    String str3 = (String) next;
                    ry7 ry7Var2 = ry7Var;
                    String str4 = str2;
                    long j = i2;
                    Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                    String displayName = localeForLanguageTag.getDisplayName(localeForLanguageTag);
                    if (displayName.length() > 0) {
                        displayName = ((Object) tre.H0(displayName.charAt(0), localeForLanguageTag)) + displayName.substring(1);
                    }
                    xnh xnhVar = new xnh(displayName);
                    Locale localeForLanguageTag2 = Locale.forLanguageTag(str3);
                    String displayName2 = localeForLanguageTag2.getDisplayName(Locale.forLanguageTag(str == 0 ? ((jc9) ny8Var.getValue()).b(context) : str));
                    if (displayName2.length() > 0) {
                        displayName2 = ((Object) tre.H0(displayName2.charAt(0), localeForLanguageTag2)) + displayName2.substring(1);
                    }
                    xnh xnhVar2 = new xnh(displayName2);
                    if (sc9Var.d) {
                        i = 1;
                        jsfVar = new jsf(cqk.d(str3, str == 0 ? ((jc9) ny8Var.getValue()).b(context) : str), true);
                    } else {
                        i = 1;
                        jsfVar = ry7Var2;
                    }
                    arrayList2.add(new yaf(j, xnhVar, xnhVar2, jsfVar, i2 == 0 ? i : i2 == xw3.O0(list) ? 3 : 2));
                    str2 = str4;
                    ny8Var = ny8Var;
                    i2 = i3;
                    ry7Var = ry7Var2;
                    it = it;
                    str = str;
                }
                mjgVar2.getClass();
                mjgVar2.j(ry7Var, arrayList2);
                gm0.n(str2, "init, LocaleViewModel, items built");
                return sbi.a;
            case 6:
                ch3.d0(obj);
                Uri.Builder builder = new Uri.Builder();
                MasterHostApi masterHostApi = (MasterHostApi) this.f;
                Object objM26executeRequestIoAF18A = masterHostApi.a.m26executeRequestIoAF18A(new HttpRequest.Get(ExtensionsKt.hostInfo(builder, masterHostApi.b).encodedPath("v1/multihost/all").build().toString()));
                try {
                    ch3.d0(objM26executeRequestIoAF18A);
                    HttpResponse httpResponse = (HttpResponse) objM26executeRequestIoAF18A;
                    if (ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                        ResponseError errorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                        poeVar2 = new poe(new VkpnsRequestWithErrorBodyException(errorResponse.toString(), errorResponse.getCode()));
                    } else if (httpResponse.isSuccessful()) {
                        List<AppInfoRemote> appInfoList = AppInfoJsonParser.INSTANCE.parseAppInfoList(httpResponse.getBody());
                        poeVar = new ArrayList(yw3.W0(appInfoList, 10));
                        Iterator it2 = appInfoList.iterator();
                        while (it2.hasNext()) {
                            poeVar.add(MapperKt.toAppInfo((AppInfoRemote) it2.next()));
                        }
                        poeVar2 = poeVar;
                    } else {
                        String message = httpResponse.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        poeVar2 = new poe(new VkpnsRequestException(message, httpResponse.getCode()));
                    }
                } catch (Exception e) {
                    poeVar = new poe(e);
                }
                return new roe(poeVar2);
            case 7:
                ch3.d0(obj);
                kz9 kz9Var = (kz9) this.f;
                kz9Var.i(!kz9Var.e);
                kz9Var.l.invoke();
                return sbi.a;
            case 8:
                sbi sbiVar = sbi.a;
                ch3.d0(obj);
                String str5 = ((fva) this.f).l;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str5, "Scrolling to last message", null);
                    }
                }
                MessageModel messageModel = (MessageModel) ww3.D1(((opa) ((fva) this.f).e.getValue()).a);
                if (messageModel != null) {
                    long j2 = messageModel.x;
                    long jT = ((s7f) ((et3) ((fva) this.f).n.getValue())).t();
                    fva fvaVar = (fva) this.f;
                    if (j2 == jT) {
                        gm0.n(fvaVar.l, "Don't scroll to last self message because we handle it with scrollWork");
                    } else {
                        fvaVar.q.updateAndGet(new g23(6));
                        ((fva) this.f).r.set(null);
                        a6f.j(((fva) this.f).u, messageModel.c, i5f.a, 0L, 12);
                    }
                }
                return sbiVar;
            case 9:
                ch3.d0(obj);
                bwa bwaVar = (bwa) this.f;
                a8j.x(bwaVar.n, tva.b);
                bwaVar.C();
                return sbi.a;
            case 10:
                ch3.d0(obj);
                ((xeb) this.f).H(null);
                return sbi.a;
            case 11:
                ch3.d0(obj);
                return new Long(pvb.e((pvb) ((pfb) this.f).c.getValue(), UUID.randomUUID().toString()));
            case 12:
                ch3.d0(obj);
                return new Long(pvb.e((pvb) ((pfb) this.f).d.getValue(), UUID.randomUUID().toString()));
            case 13:
                sbi sbiVar2 = sbi.a;
                ch3.d0(obj);
                cxb cxbVar = (cxb) this.f;
                RootController rootController = ((c1c) cxbVar.g.getValue()).e;
                Activity activityD = rootController != null ? rootController.w1().d() : null;
                MainActivity mainActivity = activityD instanceof MainActivity ? (MainActivity) activityD : null;
                if (mainActivity != null) {
                    RootController rootControllerY = sb8.y(mainActivity);
                    if (!(rootControllerY.x1() instanceof ForceUpdateScreen)) {
                        ry7Var = rootControllerY.w1().e().isEmpty() ? null : new ry7(0);
                        rootControllerY.w1().T(oc9.e(new ForceUpdateScreen(cxbVar.f), ry7Var, ry7Var));
                    }
                }
                return sbiVar2;
            case 14:
                ch3.d0(obj);
                wic wicVar = (wic) this.f;
                zv8[] zv8VarArr = wic.i;
                ny8 ny8Var2 = wicVar.d;
                boolean z = !((nni) ny8Var2.getValue()).d.getBoolean("app.notification.show.new.users", true);
                ((nni) ny8Var2.getValue()).c("app.notification.show.new.users", z);
                pvb pvbVar = (pvb) wicVar.c.getValue();
                ini iniVar = new ini();
                iniVar.a = Boolean.valueOf(z);
                pvbVar.q(new lni(iniVar));
                wicVar.f.setValue(wicVar.B());
                return sbi.a;
            case 15:
                ch3.d0(obj);
                h8c h8cVar5 = (h8c) ((vrc) this.f).e.getValue();
                h8cVar5.n("Не удалось сдампить трейс");
                return h8cVar5.p();
            case 16:
                ch3.d0(obj);
                PickerContactsListWidget pickerContactsListWidget = (PickerContactsListWidget) this.f;
                zv8[] zv8VarArr2 = PickerContactsListWidget.q;
                n1g.Q(pickerContactsListWidget.q1(), new tyc(pickerContactsListWidget.q1(), 0), null, 5);
                return sbi.a;
            case 17:
                ch3.d0(obj);
                ((xre) this.f).invoke();
                return sbi.a;
            case 18:
                ch3.d0(obj);
                sgg sggVar = ((vfd) this.f).w;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                return sbi.a;
            case 19:
                ch3.d0(obj);
                yfd yfdVar = (yfd) this.f;
                String str6 = yfdVar.g;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str6, zo5.s("onAppGoesBackground allowOnlineStatus=", yfdVar.I.get()), null);
                    }
                }
                if (((yfd) this.f).I.compareAndSet(true, false)) {
                    ((yfd) this.f).F();
                }
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                sbi sbiVar3 = sbi.a;
                ch3.d0(obj);
                end endVar = (end) this.f;
                zv8[] zv8VarArr3 = end.w;
                long jT2 = ((s7f) ((et3) endVar.m.getValue())).t();
                long j3 = endVar.d;
                if (jT2 == j3) {
                    a8j.x(endVar.s, new umd(new tnh(R.string.profile_edit_admin_permissions_info_section_you_description), null, false, 6));
                } else {
                    ic6 ic6Var = endVar.r;
                    wnd.b.getClass();
                    bc1.q(":profile?id=" + j3 + "&type=contact", ic6Var);
                }
                return sbiVar3;
            case 21:
                ch3.d0(obj);
                h8c h8cVar6 = (h8c) ((srd) this.f).g.getValue();
                h8cVar6.m(new tnh(R.string.profile_edit_member_permissions_update_error));
                h8cVar6.h(new w8c(R.drawable.icon_warning));
                h8cVar6.p();
                return sbi.a;
            case 22:
                sbi sbiVar4 = sbi.a;
                ch3.d0(obj);
                ProfileScreen profileScreen = (ProfileScreen) this.f;
                if (profileScreen.getView() != null && !profileScreen.v1().p1.t() && !profileScreen.v1().p1.r()) {
                    zp3 zp3Var = (zp3) profileScreen.w.m(profileScreen, ProfileScreen.C[11]);
                    hve hveVar = zp3Var.a;
                    if (!cqk.d(zp3Var.b(), "profile_members_list_widget")) {
                        hveVar.S(false);
                        lve lveVarE = oc9.e(new ChatMembersCompactWidget(profileScreen.getArgs().getLong("profile:id"), profileScreen.getA().b()), null, null);
                        lveVarE.e("profile_members_list_widget");
                        hveVar.T(lveVarE);
                    }
                }
                return sbiVar4;
            case 23:
                ch3.d0(obj);
                ((wfe) this.f).a = null;
                return sbi.a;
            case 24:
                ch3.d0(obj);
                ((x6e) this.f).b();
                return sbi.a;
            case 25:
                ch3.d0(obj);
                List listN1 = ww3.N1((Iterable) ((a8e) this.f).l.getValue(), yl5.e(((a8e) this.f).d) ? 7 : 8);
                String strM = ((a8e) this.f).M();
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, strM, c0a.o("Warmup reactions. defaultReactions = ", ww3.z1(listN1, ",", "[", "]", dz7.p, 24), "]"), null);
                    }
                }
                return sbi.a;
            case 26:
                ch3.d0(obj);
                a8j.x(((kde) this.f).l, wx1.F);
                return sbi.a;
            case 27:
                ch3.d0(obj);
                dme dmeVar = (dme) this.f;
                gm0.x(dmeVar.s, "onRestart: close and re-create session", null);
                dmeVar.j().h();
                return sbi.a;
            case 28:
                ch3.d0(obj);
                gm0.n((String) this.f, "Connection restored");
                return sbi.a;
            default:
                ch3.d0(obj);
                lmf lmfVar = (lmf) this.f;
                if (lmfVar != null && (jmfVar = lmfVar.f) != null) {
                    jmfVar.a(lmfVar);
                }
                return sbi.a;
        }
    }
}
