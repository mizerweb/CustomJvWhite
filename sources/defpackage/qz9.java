package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraManager;
import android.text.Editable;
import android.util.Log;
import android.util.Size;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;
import one.me.chatmedia.viewer.video.playbackSpeed.PlaybackSettingsBottomSheet;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.polls.screens.create.PollCreateScreen;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.sdk.messagewrite.multiselectbottomwidget.MultiSelectBottomWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qz9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz9(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    private final Object l(Object obj) {
        ff2 ff2VarA;
        r72 r72Var = (r72) this.g;
        x70 x70Var = (x70) this.f;
        ch3.d0(obj);
        try {
            String[] cameraIdList = ((CameraManager) x70Var.j).getCameraIdList();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                try {
                    ff2VarA = ejl.a(str, null, null);
                } catch (IllegalArgumentException e) {
                    Log.w("PipePresenceSrc", "Could not create CameraIdentifier for system ID: " + str, e);
                    ff2VarA = null;
                }
                if (ff2VarA != null) {
                    arrayList.add(ff2VarA);
                }
            }
            Log.d("PipePresenceSrc", "[FetchData] Refreshed camera list from hardware: " + arrayList);
            x70Var.q(arrayList, null);
            r72Var.b(arrayList);
        } catch (Exception e2) {
            Log.e("PipePresenceSrc", "[FetchData] Failed to refresh camera list from hardware.", e2);
            x70Var.q(null, e2);
            r72Var.d(e2);
        }
        return sbi.a;
    }

    private final Object n(Object obj) {
        ch3.d0(obj);
        x8b x8bVar = (x8b) this.f;
        for (vdd vddVar : ((PreferenceDataStoreByKeyMigration) this.g).b) {
            if (x8bVar.b.get()) {
                ore.k("Do mutate preferences once returned to DataStore.");
                return null;
            }
            x8bVar.a.remove(vddVar);
        }
        return sbi.a;
    }

    private final Object o(Object obj) {
        ylc ylcVar = (ylc) this.f;
        ch3.d0(obj);
        rt2 rt2Var = (rt2) ylcVar.a;
        vg4 vg4Var = (vg4) ylcVar.b;
        end endVar = (end) this.g;
        if (!endVar.q) {
            mjg mjgVar = endVar.o;
            xmd xmdVarB = end.B(endVar, rt2Var, vg4Var, false);
            mjgVar.getClass();
            mjgVar.j(null, xmdVarB);
        }
        return sbi.a;
    }

    private final Object p(Object obj) {
        ch3.d0(obj);
        apd apdVar = (apd) this.f;
        zv8[] zv8VarArr = apd.r;
        yab.i0(apdVar.b, ((n0c) ((xhh) apdVar.d.getValue())).b(), 0, new voc(apdVar, ((ju6) apdVar.f.getValue()).t((String) apdVar.q.get()).getAbsolutePath(), (RectF) this.g, null, 10), 2);
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                qz9 qz9Var = new qz9(lq4Var, (MediaKeyboardWidget) obj2, 0);
                qz9Var.f = obj;
                return qz9Var;
            case 1:
                qz9 qz9Var2 = new qz9((q1a) obj2, lq4Var, 1);
                qz9Var2.f = obj;
                return qz9Var2;
            case 2:
                return new qz9((v9a) this.f, (Collection) obj2, lq4Var, 2);
            case 3:
                qz9 qz9Var3 = new qz9((r00) obj2, lq4Var, 3);
                qz9Var3.f = obj;
                return qz9Var3;
            case 4:
                qz9 qz9Var4 = new qz9((nma) obj2, lq4Var, 4);
                qz9Var4.f = obj;
                return qz9Var4;
            case 5:
                return new qz9((nma) this.f, (CharSequence) obj2, lq4Var, 5);
            case 6:
                qz9 qz9Var5 = new qz9(lq4Var, (o6g) obj2, 6);
                qz9Var5.f = obj;
                return qz9Var5;
            case 7:
                return new qz9((Collection) this.f, (jsa) obj2, lq4Var, 7);
            case 8:
                qz9 qz9Var6 = new qz9((kua) obj2, lq4Var, 8);
                qz9Var6.f = obj;
                return qz9Var6;
            case 9:
                qz9 qz9Var7 = new qz9(lq4Var, (MessagesSettingsScreen) obj2, 9);
                qz9Var7.f = obj;
                return qz9Var7;
            case 10:
                qz9 qz9Var8 = new qz9(lq4Var, (MultiSelectBottomWidget) obj2, 10);
                qz9Var8.f = obj;
                return qz9Var8;
            case 11:
                qz9 qz9Var9 = new qz9((ev) obj2, lq4Var, 11);
                qz9Var9.f = obj;
                return qz9Var9;
            case 12:
                qz9 qz9Var10 = new qz9((z79) obj2, lq4Var, 12);
                qz9Var10.f = obj;
                return qz9Var10;
            case 13:
                qz9 qz9Var11 = new qz9((kob) obj2, lq4Var, 13);
                qz9Var11.f = obj;
                return qz9Var11;
            case 14:
                return new qz9((ArrayList) this.f, (pfb) obj2, lq4Var, 14);
            case 15:
                return new qz9((String) this.f, (lfc) obj2, lq4Var, 15);
            case 16:
                qz9 qz9Var12 = new qz9(lq4Var, (OtherNotificationsSettingsScreen) obj2, 16);
                qz9Var12.f = obj;
                return qz9Var12;
            case 17:
                qz9 qz9Var13 = new qz9((rsc) obj2, lq4Var, 17);
                qz9Var13.f = obj;
                return qz9Var13;
            case 18:
                qz9 qz9Var14 = new qz9(lq4Var, (PhotoViewerWidget) obj2, 18);
                qz9Var14.f = obj;
                return qz9Var14;
            case 19:
                qz9 qz9Var15 = new qz9((wwc) obj2, lq4Var, 19);
                qz9Var15.f = obj;
                return qz9Var15;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                qz9 qz9Var16 = new qz9((PickerContactsListWidget) obj2, lq4Var, 20);
                qz9Var16.f = obj;
                return qz9Var16;
            case 21:
                return new qz9((vyc) this.f, (String) obj2, lq4Var, 21);
            case 22:
                qz9 qz9Var17 = new qz9((PipScreen) obj2, lq4Var, 22);
                qz9Var17.f = obj;
                return qz9Var17;
            case 23:
                return new qz9((x70) this.f, (r72) obj2, lq4Var, 23);
            case 24:
                qz9 qz9Var18 = new qz9(lq4Var, (PlaybackSettingsBottomSheet) obj2, 24);
                qz9Var18.f = obj;
                return qz9Var18;
            case 25:
                qz9 qz9Var19 = new qz9(lq4Var, (PollCreateScreen) obj2, 25);
                qz9Var19.f = obj;
                return qz9Var19;
            case 26:
                qz9 qz9Var20 = new qz9((PreferenceDataStoreByKeyMigration) obj2, lq4Var, 26);
                qz9Var20.f = obj;
                return qz9Var20;
            case 27:
                qz9 qz9Var21 = new qz9((end) obj2, lq4Var, 27);
                qz9Var21.f = obj;
                return qz9Var21;
            case 28:
                return new qz9((apd) this.f, (RectF) obj2, lq4Var, 28);
            default:
                qz9 qz9Var22 = new qz9(lq4Var, (dc) obj2, 29);
                qz9Var22.f = obj;
                return qz9Var22;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((qz9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((qz9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((qz9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((qz9) create((c8a) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((qz9) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((qz9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((qz9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((qz9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((qz9) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 9:
                ((qz9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 10:
                ((qz9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 11:
                ((qz9) create((o5b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 12:
                ((qz9) create((o5b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 13:
                ((qz9) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 14:
                ((qz9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 15:
                ((qz9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 16:
                ((qz9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 17:
                ((qz9) create((ssc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 18:
                ((qz9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 19:
                ((qz9) create((e5i) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((qz9) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 21:
                ((qz9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 22:
                ((qz9) create((qgc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 23:
                ((qz9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 24:
                ((qz9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 25:
                ((qz9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 26:
                ((qz9) create((x8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 27:
                ((qz9) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 28:
                ((qz9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((qz9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x05e2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        Set setSingleton;
        Object value;
        gla glaVar;
        u40 u40Var;
        t50 t50Var;
        nx2 nx2Var;
        ax2 ax2Var;
        View view;
        View viewFindViewById;
        View view2;
        lfe lfeVarL;
        View view3;
        sbi sbiVar;
        int i;
        int i2;
        int[] iArr;
        Object[] objArr;
        long[] jArr;
        int i3;
        int[] iArr2;
        Object[] objArr2;
        long[] jArr2;
        int i4;
        sbi sbiVar2;
        int i5;
        int i6;
        int i7;
        long j = 0;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                cz9 cz9Var = (cz9) obj2;
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.g;
                zv8[] zv8VarArr = MediaKeyboardWidget.u;
                if ((cz9Var instanceof wy9) || (cz9Var instanceof xy9)) {
                    mediaKeyboardWidget.v1();
                }
                return sbi.a;
            case 1:
                gu4 gu4Var = (gu4) this.f;
                ch3.d0(obj);
                q1a q1aVar = (q1a) this.g;
                try {
                    poeVar = axl.a((Context) q1aVar.h.getValue(), (ky8) q1aVar.l.getValue());
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    qv1.t(gu4Var, "Failed to create TextStoryIconLayout", thA);
                }
                if (poeVar instanceof poe) {
                    poeVar = null;
                }
                foh fohVar = (foh) poeVar;
                if (fohVar != null) {
                    mjg mjgVar = q1aVar.o;
                    mjgVar.getClass();
                    mjgVar.j(null, fohVar);
                }
                return sbi.a;
            case 2:
                ch3.d0(obj);
                v9a v9aVar = (v9a) this.f;
                Iterator it = yhf.m0(new sw(1, (Iterable) v9aVar.n.a.getValue()), new t9a(0, (Collection) this.g)).iterator();
                if (it.hasNext()) {
                    Long lValueOf = Long.valueOf(((l8a) it.next()).a);
                    if (it.hasNext()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.add(lValueOf);
                        while (it.hasNext()) {
                            linkedHashSet.add(Long.valueOf(((l8a) it.next()).a));
                        }
                        setSingleton = linkedHashSet;
                    } else {
                        setSingleton = Collections.singleton(lValueOf);
                    }
                } else {
                    setSingleton = c76.a;
                }
                v9aVar.k = setSingleton;
                v9aVar.g.a(new w8a(v9aVar.c, v9aVar.d, setSingleton));
                return sbi.a;
            case 3:
                c8a c8aVar = (c8a) this.f;
                ch3.d0(obj);
                if (!cqk.d(c8aVar, c8a.a)) {
                    ore.o();
                    return null;
                }
                r00 r00Var = (r00) this.g;
                if (((AtomicBoolean) r00Var.g).compareAndSet(false, true)) {
                    yab.i0((dq4) r00Var.f, null, 0, new t20(r00Var, null, 22), 3);
                }
                return sbi.a;
            case 4:
                m8b m8bVar = (m8b) this.f;
                ch3.d0(obj);
                mjg mjgVar2 = ((nma) this.g).o1;
                do {
                    value = mjgVar2.getValue();
                    gla glaVar2 = (gla) value;
                    if (glaVar2 != null) {
                        Set set = glaVar2.a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : set) {
                            if (!m8bVar.d(((Number) obj3).longValue())) {
                                arrayList.add(obj3);
                            }
                        }
                        glaVar = new gla(new pw(arrayList), glaVar2.b, glaVar2.c);
                    } else {
                        glaVar = null;
                    }
                } while (!mjgVar2.h(value, glaVar));
                return sbi.a;
            case 5:
                ch3.d0(obj);
                nma nmaVar = (nma) this.f;
                rt2 rt2Var = (rt2) nmaVar.c.getValue();
                Long l = rt2Var != null ? new Long(rt2Var.A()) : null;
                CharSequence charSequence = (CharSequence) this.g;
                if (charSequence != null && charSequence.length() != 0 && l != null) {
                    hjc hjcVar = (hjc) nmaVar.s.getValue();
                    long jLongValue = l.longValue();
                    if (jLongValue == 0) {
                        hjcVar.getClass();
                    } else {
                        hjcVar.g(jLongValue, null, 0L);
                    }
                }
                return sbi.a;
            case 6:
                Object obj4 = this.f;
                ch3.d0(obj);
                ((Boolean) obj4).getClass();
                ((o6g) this.g).dismiss();
                return sbi.a;
            case 7:
                sbi sbiVar3 = sbi.a;
                jsa jsaVar = (jsa) this.g;
                ch3.d0(obj);
                Collection collection = (Collection) this.f;
                if (!collection.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        long jLongValue2 = ((Number) it2.next()).longValue();
                        MessageModel messageModelH = ((opa) jsaVar.z2.a.getValue()).h(jLongValue2);
                        ylc ylcVar = (messageModelH == null || (u40Var = messageModelH.j) == null || (t50Var = u40Var.b) == null) ? null : new ylc(new Long(jLongValue2), t50Var);
                        if (ylcVar != null) {
                            arrayList2.add(ylcVar);
                        }
                    }
                    Map mapW0 = wm9.W0(arrayList2);
                    zv8[] zv8VarArr2 = jsa.Z2;
                    jsaVar.f0().g(jsaVar.c.a, mapW0, ns5.CHAT);
                }
                return sbiVar3;
            case 8:
                rt2 rt2Var2 = (rt2) this.f;
                ch3.d0(obj);
                kua kuaVar = (kua) this.g;
                if (rt2Var2 != null && (nx2Var = rt2Var2.b) != null && (ax2Var = nx2Var.p) != null) {
                    j = ax2Var.d;
                }
                kuaVar.x = j;
                kuaVar.l.a();
                return sbi.a;
            case 9:
                Object obj5 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj5;
                if (rbbVar instanceof i65) {
                    sva.b.e((i65) rbbVar);
                } else if (rbbVar instanceof wva) {
                    MessagesSettingsScreen messagesSettingsScreen = (MessagesSettingsScreen) this.g;
                    j8e j8eVar = messagesSettingsScreen.f;
                    wva wvaVar = (wva) rbbVar;
                    zv8[] zv8VarArr3 = MessagesSettingsScreen.p;
                    if (wvaVar instanceof vva) {
                        List listB = messagesSettingsScreen.q1().B();
                        Rect rect = messagesSettingsScreen.k;
                        RectF rectF = messagesSettingsScreen.l;
                        h7e h7eVar = messagesSettingsScreen.i;
                        if (h7eVar == null || !h7eVar.isShowing()) {
                            lfe lfeVarL2 = messagesSettingsScreen.p1().L(R.id.oneme_messages_settings_fast_reaction_enable);
                            if (lfeVarL2 != null && (view2 = lfeVarL2.a) != null && (lfeVarL = messagesSettingsScreen.p1().L(R.id.oneme_messages_settings_fast_reaction_choose)) != null && (view3 = lfeVarL.a) != null) {
                                messagesSettingsScreen.n = view3;
                                if (rectF.isEmpty()) {
                                    zv8[] zv8VarArr4 = MessagesSettingsScreen.p;
                                    Rect rectD = n9j.d(view2, (View) j8eVar.m(messagesSettingsScreen, zv8VarArr4[1]));
                                    rectF.left = rectD.left;
                                    rectF.top = rectD.top - gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
                                    Rect rectD2 = n9j.d(view3, (View) j8eVar.m(messagesSettingsScreen, zv8VarArr4[1]));
                                    rectF.right = rectD2.right;
                                    rectF.bottom = rectD2.bottom + gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                                }
                                if (messagesSettingsScreen.p1().getGlobalVisibleRect(rect)) {
                                    wv7 wv7VarO1 = messagesSettingsScreen.o1();
                                    wv7VarO1.a.addAll(lvb.J(rectF));
                                    wv7VarO1.invalidate();
                                    h7e h7eVar2 = new h7e(messagesSettingsScreen.getContext(), ((a2c) messagesSettingsScreen.b.getAccessor().c(27)).a());
                                    h7eVar2.e = view3;
                                    view3.getLocationOnScreen(h7eVar2.f);
                                    h7eVar2.m = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                                    h7eVar2.i = -1L;
                                    h7eVar2.d = new Rect(rect);
                                    h7eVar2.b(listB, 8388613);
                                    h7eVar2.l = new xva(0, messagesSettingsScreen);
                                    h7eVar2.setOnDismissListener(new nc1(6, h7eVar2));
                                    h7eVar2.c(8388661);
                                    messagesSettingsScreen.i = h7eVar2;
                                    messagesSettingsScreen.o1().setVisibility(0);
                                } else {
                                    gm0.Y(MessagesSettingsScreen.class.getName(), "empty recycler rect when try to show reactions popup picker");
                                }
                            }
                        } else {
                            messagesSettingsScreen.r1();
                        }
                    } else if (wvaVar instanceof tva) {
                        messagesSettingsScreen.r1();
                    } else {
                        if (!(wvaVar instanceof uva)) {
                            ore.o();
                            return null;
                        }
                        uva uvaVar = (uva) wvaVar;
                        lfe lfeVarL3 = messagesSettingsScreen.p1().L(R.id.oneme_messages_settings_fast_reaction_choose);
                        if (lfeVarL3 != null && (view = lfeVarL3.a) != null && (viewFindViewById = view.findViewById(R.id.oneme_messages_settings_reaction_image)) != null) {
                            RLottieFactory rLottieFactory = RLottieFactory.INSTANCE;
                            String str = uvaVar.b;
                            Size size = n6e.b;
                            RLottieDrawable rLottieDrawableCreateByUrl$default = RLottieFactory.createByUrl$default(str, gm0.K(size.getWidth() * yl5.d().getDisplayMetrics().density), gm0.K(size.getHeight() * yl5.d().getDisplayMetrics().density), false, false, true, false, true, false, 72, null);
                            zv8[] zv8VarArr5 = MessagesSettingsScreen.p;
                            messagesSettingsScreen.m.set(n9j.d(viewFindViewById, (View) j8eVar.m(messagesSettingsScreen, zv8VarArr5[1])));
                            e6e.a((e6e) messagesSettingsScreen.g.m(messagesSettingsScreen, zv8VarArr5[2]), R.id.oneme_messages_settings_need_divider_above_vh, rLottieDrawableCreateByUrl$default, messagesSettingsScreen.m, 8);
                        }
                    }
                }
                return sbi.a;
            case 10:
                Object obj6 = this.f;
                ch3.d0(obj);
                k61 k61Var = (k61) obj6;
                MultiSelectBottomWidget multiSelectBottomWidget = (MultiSelectBottomWidget) this.g;
                j8e j8eVar2 = multiSelectBottomWidget.c;
                zv8[] zv8VarArr6 = MultiSelectBottomWidget.e;
                MultiSelectBottomWidget.p1((cyb) j8eVar2.m(multiSelectBottomWidget, zv8VarArr6[2]), k61Var.a);
                MultiSelectBottomWidget.p1((cyb) multiSelectBottomWidget.d.m(multiSelectBottomWidget, zv8VarArr6[3]), k61Var.b);
                return sbi.a;
            case 11:
                o5b o5bVar = (o5b) this.f;
                ch3.d0(obj);
                ((ev) this.g).f(o5bVar.a);
                return sbi.a;
            case 12:
                o5b o5bVar2 = (o5b) this.f;
                ch3.d0(obj);
                z79 z79Var = (z79) this.g;
                boolean z = o5bVar2.a;
                boolean z2 = o5bVar2.c;
                p7b p7bVar = z79Var.b;
                k96 k96Var = z79Var.a;
                tee teeVar = z79Var.d;
                if (!z) {
                    tp3 tp3Var = teeVar instanceof tp3 ? (tp3) teeVar : null;
                    if (teeVar == null) {
                        gm0.Y(z79.class.getName(), "no decoration to remove");
                    } else if (!z2 || tp3Var == null || tp3Var.e <= 0.0f) {
                        z79Var.d();
                    } else {
                        z79Var.b();
                        z79Var.g = 4;
                        int childCount = k96Var.getChildCount();
                        for (int i8 = 0; i8 < childCount; i8++) {
                            View childAt = k96Var.getChildAt(i8);
                            childAt.cancelLongPress();
                            childAt.setPressed(false);
                        }
                        z79Var.c(false);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(tp3Var.e, 0.0f);
                        valueAnimatorOfFloat.setDuration(500L);
                        valueAnimatorOfFloat.setInterpolator(p7bVar.a);
                        valueAnimatorOfFloat.addUpdateListener(new x79(tp3Var, z79Var, 0));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(tp3Var.g, 0.0f);
                        valueAnimatorOfFloat2.setDuration(100L);
                        valueAnimatorOfFloat2.setInterpolator(p7bVar.b);
                        valueAnimatorOfFloat2.addUpdateListener(new ak(16, tp3Var));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.addListener(new y79(z79Var, 1));
                        animatorSet.start();
                        z79Var.f = animatorSet;
                    }
                } else if (teeVar == null) {
                    tre.y0(k96Var);
                    if (z79Var.i == null) {
                        z79Var.i = Boolean.valueOf(k96Var.getClipChildren());
                    }
                    k96Var.setClipChildren(false);
                    tee teeVar2 = (tee) z79Var.c.invoke();
                    k96Var.h(teeVar2, -1);
                    z79Var.d = teeVar2;
                    b65 b65Var = new b65(k96Var);
                    k96Var.j(b65Var);
                    z79Var.e = b65Var;
                    if (teeVar2 instanceof tp3) {
                        tp3 tp3Var2 = (tp3) teeVar2;
                        tp3Var2.e = 0.0f;
                        tp3Var2.f = 0.0f;
                        tp3Var2.g = 0.0f;
                        z79Var.a();
                    } else {
                        z79Var.g = 3;
                        k96Var.X();
                        k96Var.requestLayout();
                        k96Var.invalidate();
                    }
                } else {
                    int iD = qt4.D(z79Var.g);
                    if (iD != 1) {
                        if (iD != 3) {
                            k96Var.X();
                        } else {
                            z79Var.a();
                        }
                    }
                }
                return sbi.a;
            case 13:
                List list = (List) this.f;
                ch3.d0(obj);
                ((kob) this.g).m.setValue(list);
                return sbi.a;
            case 14:
                ch3.d0(obj);
                ArrayList arrayList3 = (ArrayList) this.f;
                ny8 ny8Var = ((pfb) this.g).b;
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    qw7 qw7Var = ((yw7) it3.next()).k;
                    if (qw7Var instanceof lw7) {
                        lw7 lw7Var = (lw7) qw7Var;
                        ((wzj) ny8Var.getValue()).c(new gkf(lw7Var.b, lw7Var.d, false, mg5.REGULAR));
                    } else if (qw7Var instanceof ow7) {
                        ow7 ow7Var = (ow7) qw7Var;
                        ((wzj) ny8Var.getValue()).c(new gkf(ow7Var.b, ow7Var.c, false, mg5.REGULAR));
                    } else if (qw7Var instanceof nw7) {
                        nw7 nw7Var = (nw7) qw7Var;
                        ((wzj) ny8Var.getValue()).c(new gkf(nw7Var.b, nw7Var.e, true, mg5.REGULAR));
                    } else if (!(qw7Var instanceof pw7)) {
                        ore.o();
                        return null;
                    }
                }
                return sbi.a;
            case 15:
                sbi sbiVar4 = sbi.a;
                ch3.d0(obj);
                List listM1 = r5h.m1((String) this.f, new String[]{","}, 6);
                ArrayList arrayList4 = new ArrayList(yw3.W0(listM1, 10));
                Iterator it4 = listM1.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new Integer(Integer.parseInt(r5h.y1((String) it4.next()).toString())));
                }
                int[] iArrS1 = ww3.S1(arrayList4);
                int i9 = ej8.a;
                e8b e8bVar = new e8b();
                int iS = wk8.s(0, iArrS1.length - 1, 3);
                if (iS >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 2;
                        if (i11 < iArrS1.length) {
                            e8bVar.f(iArrS1[i10], new bj8(bj8.a(iArrS1[i10 + 1], iArrS1[i11])));
                        }
                        if (i10 != iS) {
                            i10 += 3;
                        }
                    }
                }
                if (e8bVar.e < ((f5d) ((lfc) this.g).c()).i()) {
                    return sbiVar4;
                }
                int i12 = (int) ((f5d) ((lfc) this.g).c()).i();
                PriorityQueue priorityQueue = new PriorityQueue(i12, new xa8(14));
                int[] iArr3 = e8bVar.b;
                Object[] objArr3 = e8bVar.c;
                long[] jArr3 = e8bVar.a;
                int length = jArr3.length - 2;
                int i13 = 8;
                int i14 = 7;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j2 = jArr3[i15];
                        int[] iArr4 = iArr3;
                        if ((((~j2) << i14) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j2 & 255) < 128) {
                                    int i18 = (i15 << 3) + i17;
                                    i7 = i14;
                                    int i19 = iArr4[i18];
                                    bj8 bj8Var = (bj8) objArr3[i18];
                                    i6 = i13;
                                    int i20 = (int) (bj8Var.a >> 32);
                                    long jA = bj8.a(i19, i20);
                                    sbiVar2 = sbiVar4;
                                    if (priorityQueue.size() < i12) {
                                        priorityQueue.offer(new bj8(jA));
                                        i5 = i12;
                                    } else {
                                        bj8 bj8Var2 = (bj8) priorityQueue.peek();
                                        i5 = i12;
                                        if (i20 > (bj8Var2 != null ? (int) (bj8Var2.a & 4294967295L) : 0)) {
                                            priorityQueue.poll();
                                            priorityQueue.offer(new bj8(jA));
                                        }
                                    }
                                } else {
                                    sbiVar2 = sbiVar4;
                                    i5 = i12;
                                    i6 = i13;
                                    i7 = i14;
                                }
                                j2 >>= i6;
                                i17++;
                                i13 = i6;
                                i14 = i7;
                                sbiVar4 = sbiVar2;
                                i12 = i5;
                            }
                            sbiVar = sbiVar4;
                            i4 = i12;
                            i = i14;
                            if (i16 == i13) {
                            }
                        } else {
                            sbiVar = sbiVar4;
                            i4 = i12;
                            i = i14;
                        }
                        if (i15 != length) {
                            i15++;
                            iArr3 = iArr4;
                            i14 = i;
                            sbiVar4 = sbiVar;
                            i12 = i4;
                            i13 = 8;
                        }
                    }
                } else {
                    sbiVar = sbiVar4;
                    i = 7;
                }
                List<bj8> listM2 = ww3.M1(priorityQueue, new xa8(13));
                ArrayList arrayList5 = new ArrayList(yw3.W0(listM2, 10));
                for (bj8 bj8Var3 : listM2) {
                    lhb lhbVar = kfc.c;
                    short s = (short) (bj8Var3.a >> 32);
                    lhbVar.getClass();
                    arrayList5.add(new ylc(lhb.p(s), new Integer((int) (bj8Var3.a & 4294967295L))));
                }
                int i21 = (int) ((f5d) ((lfc) this.g).c()).i();
                PriorityQueue priorityQueue2 = new PriorityQueue(i21, new xa8(14));
                int[] iArr5 = e8bVar.b;
                Object[] objArr4 = e8bVar.c;
                long[] jArr4 = e8bVar.a;
                int length2 = jArr4.length - 2;
                if (length2 >= 0) {
                    int i22 = 0;
                    while (true) {
                        long j3 = jArr4[i22];
                        if ((((~j3) << i) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i23 = 8 - ((~(i22 - length2)) >>> 31);
                            int i24 = 0;
                            while (i24 < i23) {
                                if ((j3 & 255) < 128) {
                                    int i25 = (i22 << 3) + i24;
                                    int i26 = iArr5[i25];
                                    iArr2 = iArr5;
                                    objArr2 = objArr4;
                                    int i27 = (int) (((bj8) objArr4[i25]).a & 4294967295L);
                                    jArr2 = jArr4;
                                    long jA2 = bj8.a(i26, i27);
                                    if (priorityQueue2.size() < i21) {
                                        priorityQueue2.offer(new bj8(jA2));
                                        i3 = i21;
                                    } else {
                                        bj8 bj8Var4 = (bj8) priorityQueue2.peek();
                                        i3 = i21;
                                        if (i27 > (bj8Var4 != null ? (int) (bj8Var4.a & 4294967295L) : 0)) {
                                            priorityQueue2.poll();
                                            priorityQueue2.offer(new bj8(jA2));
                                        }
                                    }
                                } else {
                                    i3 = i21;
                                    iArr2 = iArr5;
                                    objArr2 = objArr4;
                                    jArr2 = jArr4;
                                }
                                j3 >>= 8;
                                i24++;
                                jArr4 = jArr2;
                                iArr5 = iArr2;
                                objArr4 = objArr2;
                                i21 = i3;
                            }
                            i2 = i21;
                            iArr = iArr5;
                            objArr = objArr4;
                            jArr = jArr4;
                            if (i23 == 8) {
                            }
                        } else {
                            i2 = i21;
                            iArr = iArr5;
                            objArr = objArr4;
                            jArr = jArr4;
                        }
                        if (i22 != length2) {
                            i22++;
                            jArr4 = jArr;
                            iArr5 = iArr;
                            objArr4 = objArr;
                            i21 = i2;
                        }
                    }
                }
                List<bj8> listM3 = ww3.M1(priorityQueue2, new xa8(13));
                ArrayList arrayList6 = new ArrayList(yw3.W0(listM3, 10));
                for (bj8 bj8Var5 : listM3) {
                    lhb lhbVar2 = kfc.c;
                    short s2 = (short) (bj8Var5.a >> 32);
                    lhbVar2.getClass();
                    arrayList6.add(new ylc(lhb.p(s2), new Integer((int) (bj8Var5.a & 4294967295L))));
                }
                long jA3 = lfc.a((lfc) this.g, e8bVar, new pyb(i));
                long jA4 = lfc.a((lfc) this.g, e8bVar, new pyb(8));
                String str2 = ((lfc) this.g).b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        StringBuilder sb = new StringBuilder("Sending opcode stats:\n                |topOpcodesByCount=");
                        sb.append(arrayList5);
                        sb.append("\n                |topOpcodesByTraffic=");
                        sb.append(arrayList6);
                        sb.append("\n                |overallCountOfAllOpcodes=");
                        qt4.x((int) (jA3 & 4294967295L), (int) (jA3 >> 32), "\n                |overallCountOfLogOpcode=", "\n                |overallTrafficOfAllOpcodes=", sb);
                        sb.append((int) (jA4 & 4294967295L));
                        sb.append("\n                |overallTrafficOfLogOpcode=");
                        sb.append((int) (jA4 >> 32));
                        sb.append("\n                ");
                        a4cVar.c(je9Var, str2, s5h.y0(sb.toString()), null);
                    }
                }
                yj5.a((yj5) ((lfc) this.g).c.getValue(), xj5.OPCODE, (int) (jA3 >> 32), (int) (jA3 & 4294967295L), (int) (jA4 >> 32), (int) (jA4 & 4294967295L), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, lfc.b((lfc) this.g, arrayList5), lfc.b((lfc) this.g, arrayList6), null, null, null, null, null, -393248);
                return sbiVar;
            case 16:
                Object obj7 = this.f;
                ch3.d0(obj);
                ((OtherNotificationsSettingsScreen) this.g).d.H((List) obj7);
                return sbi.a;
            case 17:
                ssc sscVar = (ssc) this.f;
                ch3.d0(obj);
                rsc.a((rsc) this.g, "push", sscVar == ssc.a ? "allowed" : "denied");
                return sbi.a;
            case 18:
                Object obj8 = this.f;
                ch3.d0(obj);
                bc6 bc6Var = (bc6) obj8;
                PhotoViewerWidget photoViewerWidget = (PhotoViewerWidget) this.g;
                zv8[] zv8VarArr7 = PhotoViewerWidget.f;
                if (bc6Var instanceof ob6) {
                    qy9 qy9Var = ((ob6) bc6Var).a;
                    if (cqk.d(qy9Var.B(), photoViewerWidget.u1()) && qy9Var.l() == photoViewerWidget.v1()) {
                        qy9 qy9VarM = photoViewerWidget.w1().M(photoViewerWidget.v1(), photoViewerWidget.u1());
                        ky9 ky9Var = qy9VarM instanceof ky9 ? (ky9) qy9VarM : null;
                        if (ky9Var != null) {
                            if (photoViewerWidget.q1().getFailure()) {
                                photoViewerWidget.w1().S(photoViewerWidget.v1(), photoViewerWidget.u1());
                                photoViewerWidget.q1().k(t2m.b(ky9Var.d), photoViewerWidget.q1().getFailure());
                            } else {
                                photoViewerWidget.w1().T(photoViewerWidget.v1(), photoViewerWidget.u1());
                            }
                        }
                    }
                } else if (bc6Var instanceof sb6) {
                    ky9 ky9Var2 = ((sb6) bc6Var).a;
                    if (ky9Var2.f.equals(photoViewerWidget.u1()) && ky9Var2.a == photoViewerWidget.v1()) {
                        photoViewerWidget.q1().k(t2m.b(ky9Var2.d), true);
                    }
                }
                return sbi.a;
            case 19:
                e5i e5iVar = (e5i) this.f;
                ch3.d0(obj);
                double dDoubleValue = ((Number) e5iVar.a).doubleValue();
                double dDoubleValue2 = ((Number) e5iVar.b).doubleValue();
                String str3 = (String) e5iVar.c;
                wwc wwcVar = (wwc) this.g;
                mjg mjgVar3 = wwcVar.l;
                Double d = ((rwc) mjgVar3.getValue()).a;
                Double d2 = ((rwc) mjgVar3.getValue()).b;
                tnh tnhVar = (d == null || d2 == null || !((fih) wwcVar.f.getValue()).c(dDoubleValue, dDoubleValue2, d.doubleValue(), d2.doubleValue())) ? new tnh(R.string.oneme_location_map_send_place) : new tnh(R.string.oneme_location_map_send_geolocation);
                rwc rwcVarA = rwc.a((rwc) mjgVar3.getValue(), null, null, new Double(dDoubleValue), new Double(dDoubleValue2), tnhVar, str3, false, 3);
                mjgVar3.getClass();
                mjgVar3.j(null, rwcVarA);
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                String str4 = (String) this.f;
                ch3.d0(obj);
                boolean zX0 = r5h.X0(str4);
                PickerContactsListWidget pickerContactsListWidget = (PickerContactsListWidget) this.g;
                oxc oxcVar = pickerContactsListWidget.i;
                r84 r84Var = pickerContactsListWidget.k;
                if (zX0) {
                    zv8[] zv8VarArr8 = PickerContactsListWidget.q;
                    if (!cqk.d(pickerContactsListWidget.q1().getAdapter(), r84Var)) {
                        pvh pvhVar = pickerContactsListWidget.n;
                        if (pvhVar != null) {
                            pvhVar.b(pickerContactsListWidget.q1());
                        }
                        pickerContactsListWidget.q1().setAdapter(r84Var);
                        pickerContactsListWidget.n = tre.Y(pickerContactsListWidget.q1());
                        RecyclerView recyclerViewQ1 = pickerContactsListWidget.q1();
                        sy7 sy7Var = pickerContactsListWidget.o;
                        if (sy7Var != null) {
                            recyclerViewQ1.o0(sy7Var);
                        }
                        pickerContactsListWidget.o = null;
                        zpg zpgVar = pickerContactsListWidget.p;
                        if (zpgVar != null) {
                            recyclerViewQ1.o0(zpgVar);
                        }
                        pickerContactsListWidget.p = null;
                        pickerContactsListWidget.o1(pickerContactsListWidget.q1());
                    }
                } else {
                    zv8[] zv8VarArr9 = PickerContactsListWidget.q;
                    if (!cqk.d(pickerContactsListWidget.q1().getAdapter(), oxcVar)) {
                        pvh pvhVar2 = pickerContactsListWidget.n;
                        if (pvhVar2 != null) {
                            pvhVar2.b(pickerContactsListWidget.q1());
                        }
                        pickerContactsListWidget.q1().setAdapter(oxcVar);
                        pickerContactsListWidget.n = tre.Y(pickerContactsListWidget.q1());
                        RecyclerView recyclerViewQ2 = pickerContactsListWidget.q1();
                        sy7 sy7Var2 = pickerContactsListWidget.o;
                        if (sy7Var2 != null) {
                            recyclerViewQ2.o0(sy7Var2);
                        }
                        pickerContactsListWidget.o = null;
                        zpg zpgVar2 = pickerContactsListWidget.p;
                        if (zpgVar2 != null) {
                            recyclerViewQ2.o0(zpgVar2);
                        }
                        pickerContactsListWidget.p = null;
                    }
                }
                return sbi.a;
            case 21:
                ch3.d0(obj);
                ((f9b) ((vyc) this.f).e.g.getValue()).setValue((String) this.g);
                return sbi.a;
            case 22:
                qgc qgcVar = (qgc) this.f;
                ch3.d0(obj);
                PipScreen pipScreen = (PipScreen) this.g;
                zv8[] zv8VarArr10 = PipScreen.f;
                ev1 ev1Var = pipScreen.o1().c;
                if (ev1Var != null) {
                    ev1Var.d(qgcVar);
                }
                return sbi.a;
            case 23:
                return l(obj);
            case 24:
                Object obj9 = this.f;
                ch3.d0(obj);
                float fFloatValue = ((Number) obj9).floatValue();
                PlaybackSettingsBottomSheet playbackSettingsBottomSheet = (PlaybackSettingsBottomSheet) this.g;
                pu4.c((v0c) playbackSettingsBottomSheet.q.m(playbackSettingsBottomSheet, PlaybackSettingsBottomSheet.u[1]), new Float(fFloatValue), false, 6);
                return sbi.a;
            case 25:
                Object obj10 = this.f;
                ch3.d0(obj);
                List list2 = (List) obj10;
                PollCreateScreen pollCreateScreen = (PollCreateScreen) this.g;
                pollCreateScreen.m.I(list2, new og7(pollCreateScreen, 18, list2));
                return sbi.a;
            case 26:
                return n(obj);
            case 27:
                return o(obj);
            case 28:
                return p(obj);
            default:
                Object obj11 = this.f;
                ch3.d0(obj);
                CharSequence charSequence2 = (CharSequence) obj11;
                dc dcVar = (dc) this.g;
                Editable text = dcVar.getText();
                if (text != null && !cqk.d(charSequence2, text)) {
                    if (charSequence2 == null) {
                        text.clear();
                    } else {
                        dcVar.a(charSequence2);
                        text.replace(0, dcVar.length(), charSequence2);
                        bdc.a(dcVar, new cc(dcVar, text, 1));
                    }
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz9(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz9(lq4 lq4Var, Object obj, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }
}
