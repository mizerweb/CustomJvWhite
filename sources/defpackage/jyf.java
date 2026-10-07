package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.push.common.HostInfoProvider;
import com.vk.push.common.clientid.ClientId;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import com.vk.push.core.network.utils.ExtensionsKt;
import com.vk.push.core.network.utils.ResponseErrorKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import one.me.calls.ui.bottomsheet.unkowncontact.UnknownContactBottomSheet;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.stories.viewer.viewer.widgets.writebar.StoriesWriteBarWidget;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class jyf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyf(Object obj, lq4 lq4Var, gu4 gu4Var, f2j f2jVar) {
        super(2, lq4Var);
        this.e = 14;
        this.f = obj;
        this.g = gu4Var;
        this.h = f2jVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                jyf jyfVar = new jyf(lq4Var, (ShareDataPickerScreen) obj3, (ViewGroup) obj2, 0);
                jyfVar.f = obj;
                return jyfVar;
            case 1:
                jyf jyfVar2 = new jyf((xx6) obj2, lq4Var, (ShareDataPickerScreen) obj3);
                jyfVar2.f = obj;
                return jyfVar2;
            case 2:
                jyf jyfVar3 = new jyf(lq4Var, (ShareDataPickerScreen) obj3, (View) obj2, 2);
                jyfVar3.f = obj;
                return jyfVar3;
            case 3:
                jyf jyfVar4 = new jyf(lq4Var, (z2e) obj2, (ShareDataPickerScreen) obj3);
                jyfVar4.f = obj;
                return jyfVar4;
            case 4:
                jyf jyfVar5 = new jyf(lq4Var, (ShareDataPickerScreen) obj3, (cyb) obj2, 4);
                jyfVar5.f = obj;
                return jyfVar5;
            case 5:
                jyf jyfVar6 = new jyf((amg) obj3, (Long) obj2, lq4Var, 5);
                jyfVar6.f = obj;
                return jyfVar6;
            case 6:
                jyf jyfVar7 = new jyf(lq4Var, (StickersScreen) obj3, (View) obj2, 6);
                jyfVar7.f = obj;
                return jyfVar7;
            case 7:
                jyf jyfVar8 = new jyf((xx6) obj3, lq4Var, (StoriesWriteBarWidget) obj2);
                jyfVar8.f = obj;
                return jyfVar8;
            case 8:
                jyf jyfVar9 = new jyf(lq4Var, (StoriesWriteBarWidget) obj3, (View) obj2, 8);
                jyfVar9.f = obj;
                return jyfVar9;
            case 9:
                return new jyf((wfe) this.f, (ndh) obj3, (wfe) obj2, lq4Var, 9);
            case 10:
                jyf jyfVar10 = new jyf(lq4Var, (View) obj3, (UnknownContactBottomSheet) obj2, 10);
                jyfVar10.f = obj;
                return jyfVar10;
            case 11:
                jyf jyfVar11 = new jyf((pti) obj3, (ny8) obj2, lq4Var, 11);
                jyfVar11.f = obj;
                return jyfVar11;
            case 12:
                jyf jyfVar12 = new jyf((izi) obj3, (oxi) obj2, lq4Var, 12);
                jyfVar12.f = obj;
                return jyfVar12;
            case 13:
                jyf jyfVar13 = new jyf((File) obj3, (byte[]) obj2, lq4Var, 13);
                jyfVar13.f = obj;
                return jyfVar13;
            case 14:
                return new jyf(this.f, lq4Var, (gu4) obj3, (f2j) obj2);
            case 15:
                jyf jyfVar14 = new jyf(lq4Var, (VideoMessageWidget) obj3, (View) obj2, 15);
                jyfVar14.f = obj;
                return jyfVar14;
            default:
                return new jyf((String) this.f, (ClientId) obj3, (r6a) obj2, lq4Var, 16);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws JSONException, IOException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((jyf) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((jyf) create((ec6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((jyf) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((jyf) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((jyf) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((jyf) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                ((jyf) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ((jyf) create((ec6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((jyf) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                ((jyf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                ((jyf) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                ((jyf) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                ((jyf) create((l1j) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                ((jyf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                return ((jyf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                ((jyf) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((jyf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:82:0x0205  */
    /* JADX WARN: Code duplicated, block: B:84:0x0208  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws JSONException, IOException {
        Object poeVar;
        Object poeVar2;
        AnimatorSet animatorSet;
        long j;
        Point pointG;
        String name;
        a4c a4cVar;
        je9 je9Var;
        int i;
        Object poeVar3;
        poe poeVar4;
        String str = "";
        int i2 = 8;
        pointG = null;
        pointG = null;
        pointG = null;
        Point pointG2 = null;
        omg omgVar = null;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                zka zkaVar = (zka) obj2;
                ShareDataPickerScreen shareDataPickerScreen = (ShareDataPickerScreen) this.g;
                ViewGroup viewGroup = (ViewGroup) this.h;
                hve hveVar = shareDataPickerScreen.w;
                if (hveVar != null) {
                    int iOrdinal = zkaVar.a.ordinal();
                    if (iOrdinal == 0) {
                        kz9 kz9Var = shareDataPickerScreen.y;
                        if (kz9Var != null) {
                            zv8[] zv8VarArr = kz9.p;
                            kz9Var.i(true);
                        }
                        shareDataPickerScreen.A1().setLeftIcon(R.drawable.icon_sticker);
                        lvb.H(viewGroup, ShareDataPickerScreen.D, null);
                    } else if (iOrdinal == 1) {
                        if (!hveVar.o()) {
                            hveVar.T(oc9.e(new MediaKeyboardWidget(shareDataPickerScreen.b, 0L, true, false, null, false, 58, null), null, null));
                        }
                        WeakHashMap weakHashMap = i7j.a;
                        y6j.l(viewGroup, null);
                        kz9 kz9Var2 = shareDataPickerScreen.y;
                        if (kz9Var2 != null) {
                            kz9Var2.l();
                        }
                        shareDataPickerScreen.A1().setLeftIcon(R.drawable.icon_keyboard);
                    } else if (iOrdinal == 2) {
                        ow0 ow0Var = ((ShareDataPickerScreen) shareDataPickerScreen.x.b).r;
                        if (ow0Var.d()) {
                            ((tha) ow0Var.getValue()).h(true);
                        }
                        shareDataPickerScreen.A1().setLeftIcon(R.drawable.icon_sticker);
                        e9i.j0(new fz6(new jz(new hde(uw8.f, 6), 11), new i97(viewGroup, null, 1), 3), shareDataPickerScreen.getViewLifecycleScope());
                    }
                }
                return sbi.a;
            case 1:
                ShareDataPickerScreen shareDataPickerScreen2 = (ShareDataPickerScreen) this.g;
                sbi sbiVar = sbi.a;
                ec6 ec6Var = (ec6) this.f;
                ch3.d0(obj);
                Object objA = ec6Var.a();
                if (roe.a(objA) == null) {
                    try {
                        hve hveVar2 = shareDataPickerScreen2.w;
                        if (hveVar2 != null && hveVar2.o()) {
                            ((vxf) shareDataPickerScreen2.x1().d).t.a(yka.a);
                        }
                        poeVar = sbiVar;
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    ch3.d0(poeVar);
                    break;
                }
                return sbiVar;
            case 2:
                View view = (View) this.h;
                Object obj3 = this.f;
                ch3.d0(obj);
                int i3 = ((m8b) obj3).d;
                ShareDataPickerScreen shareDataPickerScreen3 = (ShareDataPickerScreen) this.g;
                j8e j8eVar = shareDataPickerScreen3.s;
                if (shareDataPickerScreen3.n && i3 == 0) {
                    zv8[] zv8VarArr2 = ShareDataPickerScreen.C;
                    ((cyb) j8eVar.m(shareDataPickerScreen3, zv8VarArr2[1])).setVisibility(0);
                    ((z2e) shareDataPickerScreen3.t.m(shareDataPickerScreen3, zv8VarArr2[2])).setVisibility(8);
                    shareDataPickerScreen3.A1().setVisibility(8);
                } else {
                    zv8[] zv8VarArr3 = ShareDataPickerScreen.C;
                    ((cyb) j8eVar.m(shareDataPickerScreen3, zv8VarArr3[1])).setVisibility(8);
                    ((z2e) shareDataPickerScreen3.t.m(shareDataPickerScreen3, zv8VarArr3[2])).setVisibility(((vxf) shareDataPickerScreen3.x1().d).q.a.getValue() != null ? 0 : 8);
                    shareDataPickerScreen3.A1().setVisibility(0);
                }
                byte b = shareDataPickerScreen3.A1().getVisibility() == 0;
                if (b != true && i3 > 0) {
                    TransitionManager.beginDelayedTransition((ViewGroup) view, shareDataPickerScreen3.q);
                    shareDataPickerScreen3.A1().setVisibility(0);
                } else if (b != false && i3 == 0) {
                    TransitionManager.beginDelayedTransition((ViewGroup) view, shareDataPickerScreen3.q);
                    ow0 ow0Var2 = shareDataPickerScreen3.r;
                    if (ow0Var2.d()) {
                        ((tha) ow0Var2.getValue()).setVisibility(8);
                    }
                    hve hveVar3 = shareDataPickerScreen3.w;
                    if (hveVar3 == null || !hveVar3.o()) {
                        int i4 = uw8.a;
                        if (uw8.b(uw8.c)) {
                            shareDataPickerScreen3.x.i();
                        }
                    } else {
                        ((vxf) shareDataPickerScreen3.x1().d).t.a(yka.a);
                    }
                }
                return sbi.a;
            case 3:
                Object obj4 = this.f;
                ch3.d0(obj);
                txf txfVar = (txf) obj4;
                z2e z2eVar = (z2e) this.h;
                if (txfVar == null) {
                    z2eVar.setVisibility(8);
                } else {
                    ShareDataPickerScreen shareDataPickerScreen4 = (ShareDataPickerScreen) this.g;
                    if (!shareDataPickerScreen4.n && ((m8b) shareDataPickerScreen4.x1().i.a.getValue()).i()) {
                        i2 = 0;
                    }
                    z2eVar.setVisibility(i2);
                    ynh ynhVar = txfVar.a;
                    ynh ynhVar2 = txfVar.b;
                    String str2 = txfVar.c;
                    Integer num = txfVar.d;
                    Integer num2 = txfVar.e;
                    CharSequence charSequenceB = ynhVar.b(z2eVar.getContext());
                    if (charSequenceB == null) {
                        ore.p("Required value was null.");
                        return null;
                    }
                    z2eVar.setTitle(charSequenceB);
                    z2eVar.setBody(ynhVar2 != null ? ynhVar2.b(z2eVar.getContext()) : null);
                    z2eVar.a(null, str2, num2, false, false);
                    z2eVar.setCounter(num);
                }
                return sbi.a;
            case 4:
                Object obj5 = this.f;
                ch3.d0(obj);
                m8b m8bVar = (m8b) obj5;
                ShareDataPickerScreen shareDataPickerScreen5 = (ShareDataPickerScreen) this.g;
                if (shareDataPickerScreen5.z || m8bVar.d != 1) {
                    int i5 = m8bVar.d;
                    cyb cybVar = (cyb) this.h;
                    if (i5 == 0) {
                        cybVar.setVisibility(8);
                        cybVar.setCount(null);
                    } else {
                        cybVar.setVisibility(0);
                        cybVar.setText(np4.q(shareDataPickerScreen5.getContext(), R.string.contacts_picker_send_btn_title));
                        cybVar.setCount(new Integer(i5));
                    }
                } else {
                    ((vxf) shareDataPickerScreen5.x1().d).g(null, m8bVar);
                }
                return sbi.a;
            case 5:
                ylc ylcVar = (ylc) this.f;
                ch3.d0(obj);
                emg emgVar = (emg) ylcVar.a;
                boolean zBooleanValue = ((Boolean) ylcVar.b).booleanValue();
                amg amgVar = (amg) this.g;
                mjg mjgVar = amgVar.z;
                if (emgVar != null) {
                    Long l = (Long) this.h;
                    long j2 = emgVar.a;
                    String str3 = emgVar.b;
                    xnh xnhVar = new xnh(str3 != null ? str3 : "");
                    String str4 = emgVar.c;
                    List list = emgVar.h;
                    ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(amg.D((clg) it.next(), false, l));
                    }
                    omgVar = new omg(j2, xnhVar, str4, null, arrayList, zBooleanValue ? 2 : 4, false, false, false, emgVar.g, emgVar.d == ((s7f) ((et3) amgVar.o.getValue())).t(), 456);
                }
                mjgVar.setValue(omgVar);
                return sbi.a;
            case 6:
                Object obj6 = this.f;
                ch3.d0(obj);
                List list2 = (List) obj6;
                StickersScreen stickersScreen = (StickersScreen) this.g;
                stickersScreen.l.H(list2);
                if (list2.isEmpty()) {
                    View view2 = (View) this.h;
                    ViewGroup viewGroup2 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                    if (viewGroup2 != null) {
                        yab.e(viewGroup2, (View) stickersScreen.h.getValue(), -1);
                    }
                    kng kngVar = stickersScreen.a;
                    ow0 ow0Var3 = stickersScreen.h;
                    if (ow0Var3.d()) {
                        zmg zmgVar = (zmg) ow0Var3.getValue();
                        kng kngVar2 = kng.RECENT;
                        zmgVar.setTitle(kngVar == kngVar2 ? R.string.oneme_stickers_settings_empty_recent_title : R.string.oneme_stickers_settings_empty_favorite_title);
                        zmgVar.setSubtitle(kngVar == kngVar2 ? Integer.valueOf(R.string.oneme_stickers_settings_empty_recent_subtitle) : null);
                        zmgVar.setIcon(R.drawable.draw_sticker_24_gradient);
                    }
                    ((View) stickersScreen.h.getValue()).setVisibility(0);
                    stickersScreen.p1().setVisibility(8);
                    stickersScreen.q1().setRightActions(ybc.a);
                } else {
                    stickersScreen.p1().setVisibility(0);
                    a4m.b(stickersScreen.h);
                    stickersScreen.q1().setRightActions(new ccc(1, new fz7(1, stickersScreen, StickersScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0, 24)));
                }
                return sbi.a;
            case 7:
                sbi sbiVar2 = sbi.a;
                ec6 ec6Var2 = (ec6) this.f;
                ch3.d0(obj);
                Object objA2 = ec6Var2.a();
                if (roe.a(objA2) == null) {
                    try {
                        StoriesWriteBarWidget.o1((StoriesWriteBarWidget) this.h, (wka) objA2);
                        poeVar2 = sbiVar2;
                    } catch (Throwable th2) {
                        poeVar2 = new poe(th2);
                    }
                    ch3.d0(poeVar2);
                }
                return sbiVar2;
            case 8:
                Object obj7 = this.f;
                ch3.d0(obj);
                pla plaVar = (pla) obj7;
                if (plaVar instanceof ola) {
                    StoriesWriteBarWidget storiesWriteBarWidget = (StoriesWriteBarWidget) this.g;
                    zv8[] zv8VarArr4 = StoriesWriteBarWidget.n;
                    vvg vvgVarU1 = storiesWriteBarWidget.u1();
                    CharSequence charSequence = ((ola) plaVar).a;
                    Long l2 = (Long) vvgVarU1.c.getValue();
                    if (l2 != null) {
                        vvgVarU1.j.B(vvgVarU1, vvg.q[0], yab.h0(vvgVarU1.b, ((n0c) vvgVarU1.C()).a(), 2, new h01(vvgVarU1, l2.longValue(), charSequence, (lq4) null)));
                    } else {
                        String str5 = vvgVarU1.g;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.f;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str5, "can't sendReply cuz storyId is null", null);
                            }
                        }
                    }
                    StoriesWriteBarWidget.p1((StoriesWriteBarWidget) this.g);
                } else {
                    if (!(plaVar instanceof nla)) {
                        ore.o();
                        return null;
                    }
                    p0m.a((View) this.h, kt7.CLOCK_TICK);
                    StoriesWriteBarWidget storiesWriteBarWidget2 = (StoriesWriteBarWidget) this.g;
                    zv8[] zv8VarArr5 = StoriesWriteBarWidget.n;
                    vvg vvgVarU2 = storiesWriteBarWidget2.u1();
                    boolean z = ((nla) plaVar).a;
                    zv8[] zv8VarArr6 = vvg.q;
                    vvgVarU2.E(new chf(23), z);
                }
                return sbi.a;
            case 9:
                ch3.d0(obj);
                wfe wfeVar = (wfe) this.f;
                if (!((tsb) wfeVar.a).a.E()) {
                    throw new FileNotFoundException(((ndh) this.g).f);
                }
                rne rneVar = ((tsb) wfeVar.a).a.g;
                if (rneVar == null) {
                    qr7.k("failed to get response body");
                    return null;
                }
                InputStream inputStreamQ0 = rneVar.E().Q0();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream((File) ((wfe) this.h).a, false);
                    try {
                        byte[] bArr = new byte[np0.r];
                        while (true) {
                            int i6 = inputStreamQ0.read(bArr);
                            if (i6 == -1) {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                inputStreamQ0.close();
                                return sbi.a;
                            }
                            fileOutputStream.write(bArr, 0, i6);
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                rx8.n(inputStreamQ0, th);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            rx8.n(fileOutputStream, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            case 10:
                Object obj8 = this.f;
                ch3.d0(obj);
                ici iciVar = (ici) obj8;
                ViewGroup viewGroup3 = (ViewGroup) ((View) this.g);
                UnknownContactBottomSheet unknownContactBottomSheet = (UnknownContactBottomSheet) this.h;
                TransitionManager.beginDelayedTransition(viewGroup3, unknownContactBottomSheet.B);
                j8e j8eVar2 = unknownContactBottomSheet.w;
                zv8[] zv8VarArr7 = UnknownContactBottomSheet.C;
                v0h.i((TextView) j8eVar2.m(unknownContactBottomSheet, zv8VarArr7[2]), iciVar.a);
                TextView textView = (TextView) unknownContactBottomSheet.x.m(unknownContactBottomSheet, zv8VarArr7[3]);
                ynh ynhVar3 = iciVar.b;
                textView.setVisibility(ynhVar3 != null ? 0 : 8);
                if (ynhVar3 != null) {
                    TextView textView2 = (TextView) unknownContactBottomSheet.x.m(unknownContactBottomSheet, zv8VarArr7[3]);
                    textView2.setText(ynhVar3.b(textView2.getContext()));
                }
                ((zbi) unknownContactBottomSheet.y.m(unknownContactBottomSheet, zv8VarArr7[4])).a(iciVar.d, iciVar.c);
                return sbi.a;
            case 11:
                sbi sbiVar3 = sbi.a;
                String str6 = (String) this.f;
                ch3.d0(obj);
                pti ptiVar = (pti) this.g;
                RecyclerView recyclerView = ptiVar.h;
                if (recyclerView != null) {
                    String str7 = ptiVar.g;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        je9 je9Var3 = je9.d;
                        if (a4cVar3.b(je9Var3)) {
                            a4cVar3.c(je9Var3, str7, c0a.o("Player autoplay. Handle preparation complete for ", str6, ", try restart autoplay."), null);
                        }
                    }
                    ((n5j) ((ny8) this.h).getValue()).e.getClass();
                    tui.d.remove(str6);
                    ((pti) this.g).d(recyclerView);
                }
                return sbiVar3;
            case 12:
                l1j l1jVar = (l1j) this.f;
                ch3.d0(obj);
                izi iziVar = (izi) this.g;
                if (iziVar.g.d || ((animatorSet = iziVar.n1) != null && animatorSet.isRunning())) {
                    izi.N(iziVar, l1jVar);
                } else {
                    izi.P(iziVar, (oxi) this.h, l1jVar);
                }
                return sbi.a;
            case 13:
                gu4 gu4Var = (gu4) this.f;
                ch3.d0(obj);
                File file = (File) this.g;
                byte[] bArr2 = (byte[]) this.h;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, "placeholder_videomsg.jpeg"));
                    try {
                        fileOutputStream2.write(bArr2);
                        fileOutputStream2.close();
                        return sbi.a;
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            rx8.n(fileOutputStream2, th7);
                            throw th8;
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    String name2 = gu4Var.getClass().getName();
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        je9 je9Var4 = je9.g;
                        if (a4cVar4.b(je9Var4)) {
                            a4cVar4.c(je9Var4, name2, "Couldn't save a video msg placeholder in file", null);
                        }
                    }
                }
                break;
            case 14:
                ch3.d0(obj);
                Uri uri = (Uri) this.f;
                long jC = 0;
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    if (!(mediaMetadataRetriever instanceof AutoCloseable)) {
                        try {
                            mediaMetadataRetriever.setDataSource((Context) ((f2j) this.h).e.getValue(), uri);
                            pointG2 = y3m.g(mediaMetadataRetriever);
                            jC = y3m.c(mediaMetadataRetriever);
                            mediaMetadataRetriever.release();
                            j = jC;
                            pointG = pointG2;
                            String string = uri.toString();
                            if (pointG != null) {
                                i = pointG.x;
                            } else {
                                i = 0;
                            }
                            return new u84(j, string, i, pointG != null ? pointG.y : 0);
                        } catch (Throwable th9) {
                            try {
                                throw th9;
                            } catch (Throwable th10) {
                                try {
                                    mediaMetadataRetriever.release();
                                    throw th10;
                                } catch (Throwable th11) {
                                    gm0.b(th9, th11);
                                    throw th10;
                                }
                            }
                        }
                    }
                    Log.w("compatUse", "early return cuz of mediaMetadataRetriever is AutoCloseable");
                    MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever3 = mediaMetadataRetriever2;
                        mediaMetadataRetriever3.setDataSource((Context) ((f2j) this.h).e.getValue(), uri);
                        pointG = y3m.g(mediaMetadataRetriever3);
                        try {
                            jC = y3m.c(mediaMetadataRetriever3);
                            try {
                                p90.f(mediaMetadataRetriever2, null);
                                j = jC;
                            } catch (Throwable th12) {
                                th = th12;
                                pointG2 = pointG;
                                name = ((gu4) this.g).getClass().getName();
                                a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9Var = je9.f;
                                    if (a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, name, qv1.k("Can't get video params for path ", uri.getPath()), th);
                                    }
                                }
                                j = jC;
                                pointG = pointG2;
                            }
                            String string2 = uri.toString();
                            if (pointG != null) {
                                i = pointG.x;
                            } else {
                                i = 0;
                            }
                            return new u84(j, string2, i, pointG != null ? pointG.y : 0);
                        } catch (Throwable th13) {
                            th = th13;
                            pointG2 = pointG;
                            Throwable th14 = th;
                            try {
                                throw th14;
                            } catch (Throwable th15) {
                                p90.f(mediaMetadataRetriever2, th14);
                                throw th15;
                            }
                        }
                    } catch (Throwable th16) {
                        th = th16;
                    }
                } catch (Throwable th17) {
                    th = th17;
                }
                th = th17;
                name = ((gu4) this.g).getClass().getName();
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, qv1.k("Can't get video params for path ", uri.getPath()), th);
                    }
                }
                j = jC;
                pointG = pointG2;
                String string3 = uri.toString();
                if (pointG != null) {
                    i = pointG.x;
                } else {
                    i = 0;
                }
                return new u84(j, string3, i, pointG != null ? pointG.y : 0);
            case 15:
                Object obj9 = this.f;
                ch3.d0(obj);
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.g;
                zv8[] zv8VarArr8 = VideoMessageWidget.B;
                cyi cyiVarQ1 = videoMessageWidget.q1();
                b62 b62Var = new b62((VideoMessageWidget) this.g, 6, (View) this.h);
                cyiVarQ1.addOnLayoutChangeListener(b62Var);
                if (cyiVarQ1.isLaidOut()) {
                    String str8 = ((VideoMessageWidget) this.g).h;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null) {
                        je9 je9Var5 = je9.e;
                        if (a4cVar5.b(je9Var5)) {
                            a4cVar5.c(je9Var5, str8, "updating blur for video message screen", null);
                        }
                    }
                    ((View) this.h).getBackground().invalidateSelf();
                }
                n7j.c(((VideoMessageWidget) this.g).q1(), 300L, new zd(new r2j(cyiVarQ1, b62Var), (VideoMessageWidget) this.g, (View) this.h, 4));
                return sbi.a;
            default:
                r6a r6aVar = (r6a) this.h;
                ch3.d0(obj);
                JSONObject jSONObjectPut = new JSONObject().put("auth_token", (String) this.f);
                ClientId clientId = (ClientId) this.g;
                Object objM26executeRequestIoAF18A = ((HttpClient) r6aVar.a).m26executeRequestIoAF18A(new HttpRequest.Post(ExtensionsKt.hostInfo(new Uri.Builder(), (HostInfoProvider) r6aVar.c).encodedPath("v1/projects/" + ((String) r6aVar.b) + "/token:new").build().toString(), jSONObjectPut.putOpt("client_id", clientId != null ? clientId.getClientIdValue() : null).putOpt("client_id_type", clientId != null ? clientId.getClientIdType() : null).toString()));
                try {
                    ch3.d0(objM26executeRequestIoAF18A);
                    HttpResponse httpResponse = (HttpResponse) objM26executeRequestIoAF18A;
                    if (!ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                        if (httpResponse.isSuccessful()) {
                            poeVar3 = new m4k(new JSONObject(httpResponse.getBody()).getString(ApiProtocol.KEY_TOKEN));
                        } else {
                            String message = httpResponse.getMessage();
                            if (message != null) {
                                str = message;
                            }
                            poeVar4 = new poe(new VkpnsRequestException(str, httpResponse.getCode()));
                        }
                        return new roe(poeVar3);
                    }
                    ResponseError errorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                    poeVar4 = new poe(new VkpnsRequestWithErrorBodyException(errorResponse.toString(), errorResponse.getCode()));
                    poeVar3 = poeVar4;
                } catch (Exception e2) {
                    poeVar3 = new poe(e2);
                }
                return new roe(poeVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jyf(lq4 lq4Var, Object obj, Object obj2, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyf(xx6 xx6Var, lq4 lq4Var, ShareDataPickerScreen shareDataPickerScreen) {
        super(2, lq4Var);
        this.e = 1;
        this.h = xx6Var;
        this.g = shareDataPickerScreen;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyf(xx6 xx6Var, lq4 lq4Var, StoriesWriteBarWidget storiesWriteBarWidget) {
        super(2, lq4Var);
        this.e = 7;
        this.g = xx6Var;
        this.h = storiesWriteBarWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jyf(Serializable serializable, Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = serializable;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyf(lq4 lq4Var, z2e z2eVar, ShareDataPickerScreen shareDataPickerScreen) {
        super(2, lq4Var);
        this.e = 3;
        this.h = z2eVar;
        this.g = shareDataPickerScreen;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jyf(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }
}
