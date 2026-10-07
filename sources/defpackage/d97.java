package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.collections.a;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.android.root.RootController;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.chats.picker.stories.PickStoryPresetScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.devmenu.tools.server.ServerHostBottomSheet;
import one.me.mediapicker.MediaPickerScreen;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import one.me.qrscanner.QrScannerWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.gallery.permissions.PartialMediaAccessWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class d97 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d97(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.h = obj2;
        this.g = obj3;
    }

    private final Object A(Object obj) {
        Object poeVar;
        gu4 gu4Var = (gu4) this.f;
        ch3.d0(obj);
        File file = (File) this.h;
        v3f v3fVar = ((hze) this.g).a;
        try {
            ljf ljfVar = new ljf(file, 13);
            String name = file.getName();
            lz8 lz8VarE = v3fVar.e();
            Date date = new Date();
            lz8VarE.getClass();
            poeVar = v3fVar.b(ljfVar, qv1.l("IMG_", lz8.a(date), ".", r5h.r1('.', name, "").toLowerCase(Locale.ROOT)));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(gu4Var.getClass().getName(), null, new es6("Ошибка при сохранении оригинального изображения: ".concat(file.getName()), thA));
        }
        if (poeVar instanceof poe) {
            return null;
        }
        return poeVar;
    }

    private final Object B(Object obj) {
        q9f q9fVar = (q9f) this.f;
        ch3.d0(obj);
        boolean z = q9fVar instanceof m9f;
        ((View) this.h).setVisibility(z ? 0 : 8);
        if (!(q9fVar instanceof n9f) && !(q9fVar instanceof o9f)) {
            if (!z) {
                ore.o();
                return null;
            }
            SearchMessageBottomWidget searchMessageBottomWidget = (SearchMessageBottomWidget) this.g;
            m9f m9fVar = (m9f) q9fVar;
            zv8[] zv8VarArr = SearchMessageBottomWidget.h;
            AppCompatTextView appCompatTextViewP1 = searchMessageBottomWidget.p1();
            Context context = searchMessageBottomWidget.getContext();
            int i = m9fVar.a;
            boolean z2 = m9fVar.d;
            boolean z3 = m9fVar.c;
            appCompatTextViewP1.setText(i == 0 ? context.getString(R.string.chat_screen__search_result_not_found) : context.getString(R.string.chat_screen__search_result_success, Integer.valueOf(m9fVar.b), Integer.valueOf(i)));
            searchMessageBottomWidget.f = z3;
            searchMessageBottomWidget.u1(searchMessageBottomWidget.s1(), z3);
            searchMessageBottomWidget.g = z2;
            searchMessageBottomWidget.u1(searchMessageBottomWidget.o1(), z2);
        }
        return sbi.a;
    }

    private final Object C(Object obj) {
        Object poeVar;
        SelectedMediaBottomBarWidget selectedMediaBottomBarWidget = (SelectedMediaBottomBarWidget) this.g;
        ec6 ec6Var = (ec6) this.f;
        ch3.d0(obj);
        Object objA = ec6Var.a();
        Throwable thA = roe.a(objA);
        sbi sbiVar = sbi.a;
        if (thA == null) {
            try {
                hve hveVar = selectedMediaBottomBarWidget.y;
                if (hveVar != null && hveVar.o()) {
                    hff hffVarT1 = selectedMediaBottomBarWidget.t1();
                    hffVarT1.B.a(yka.a);
                }
                poeVar = sbiVar;
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            ch3.d0(poeVar);
        }
        return sbiVar;
    }

    private final Object l(Object obj) {
        Object obj2 = this.f;
        ch3.d0(obj);
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        MediaBarWidget mediaBarWidget = (MediaBarWidget) this.h;
        zv8[] zv8VarArr = MediaBarWidget.u1;
        if (mediaBarWidget.C1().z.a.getValue() != lhd.b && ((Boolean) ((MediaBarWidget) this.h).C1().C.a.getValue()).booleanValue()) {
            int i = 0;
            boolean z = ((ecd) this.g).getScrollState() == ccd.b;
            boolean z2 = zBooleanValue && z && !(((MediaBarWidget) this.h).x1().e != null);
            String str = ((MediaBarWidget) this.h).a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    ccd scrollState = ((ecd) this.g).getScrollState();
                    boolean z3 = ((MediaBarWidget) this.h).x1().e != null;
                    StringBuilder sbB = zo5.B("onCreateView(): setFullScreen?=", z2, " isKeyboardOpened=", zBooleanValue, ", scrollState=");
                    sbB.append(scrollState);
                    sbB.append(",crollState=");
                    sbB.append(z);
                    sbB.append(", animating=");
                    sbB.append(z3);
                    a4cVar.c(je9Var, str, sbB.toString(), null);
                }
            }
            if (z2) {
                ((MediaBarWidget) this.h).x1().k();
            }
            MediaBarWidget mediaBarWidget2 = (MediaBarWidget) this.h;
            ValueAnimator valueAnimator = mediaBarWidget2.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int alpha = mediaBarWidget2.C.getAlpha();
            if (zBooleanValue) {
                a8g a8gVar = pq3.j;
                View viewX1 = mediaBarWidget2.E;
                if (viewX1 == null) {
                    viewX1 = mediaBarWidget2.x1();
                }
                i = (a8gVar.h(viewX1).b().g >> 24) & 255;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new lk1(mediaBarWidget2, alpha, i, 2));
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.start();
            mediaBarWidget2.D = valueAnimatorOfFloat;
        }
        return sbi.a;
    }

    private final Object n(Object obj) {
        Object obj2 = this.f;
        ch3.d0(obj);
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        MediaPickerScreen mediaPickerScreen = (MediaPickerScreen) this.h;
        if (zBooleanValue) {
            zp3 zp3VarP1 = MediaPickerScreen.p1(mediaPickerScreen);
            hve hveVar = zp3VarP1.a;
            if (!cqk.d(zp3VarP1.b(), "partial_media_access_widget")) {
                hveVar.S(false);
                lve lveVarE = oc9.e(new PartialMediaAccessWidget(mediaPickerScreen.d.b()), null, null);
                lveVarE.e("partial_media_access_widget");
                hveVar.T(lveVarE);
            }
        } else {
            MediaPickerScreen.p1(mediaPickerScreen).c();
            if (mediaPickerScreen.x1() && mediaPickerScreen.t1().getVisibility() == 0) {
                MediaPickerScreen.o1(mediaPickerScreen, false);
            }
        }
        n7j.c((View) this.g, 300L, new n1a(mediaPickerScreen, 1));
        return sbi.a;
    }

    private final Object o(Object obj) {
        gu4 gu4Var = (gu4) this.f;
        ch3.d0(obj);
        jsa jsaVar = (jsa) this.h;
        rt2 rt2Var = (rt2) this.g;
        try {
            zv8[] zv8VarArr = jsa.Z2;
            ((jfa) jsaVar.N1.getValue()).a(rt2Var, jsaVar.R2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            qv1.t(gu4Var, "restartCommentsViewportPolling fail", th);
        }
        return sbi.a;
    }

    private final Object p(Object obj) {
        Object obj2 = this.f;
        ch3.d0(obj);
        f1i f1iVar = (f1i) obj2;
        MessagesListWidget messagesListWidget = (MessagesListWidget) this.h;
        mvh mvhVar = messagesListWidget.R1;
        if (mvhVar != null) {
            int i = f1iVar.b ? 2 : 3;
            mvhVar.f = i;
            ivh ivhVar = (ivh) mvhVar.n.getValue();
            ivhVar.c = i;
            ivhVar.c();
            ivhVar.invalidateSelf();
            mvhVar.e(f1iVar.a, 8388661, 4000L);
            xb9 xb9Var = (xb9) messagesListWidget.t1();
            xb9Var.X0.B(xb9Var, xb9.g1[41], Boolean.TRUE);
            h1i h1iVar = (h1i) this.g;
            messagesListWidget.D1().r0(h1iVar.d);
            h1iVar.c = null;
        }
        return sbi.a;
    }

    private final Object q(Object obj) {
        mvh mvhVar;
        h1i h1iVar;
        Map linkedHashMap;
        MessagesListWidget messagesListWidget = (MessagesListWidget) this.h;
        Object obj2 = this.f;
        ch3.d0(obj);
        iqa iqaVar = (iqa) obj2;
        boolean z = true;
        if (cqk.d(iqaVar, fqa.a)) {
            MessagesLayoutManager messagesLayoutManager = messagesListWidget.K1;
            if (messagesLayoutManager != null) {
                messagesLayoutManager.F = i5f.b;
            }
            messagesListWidget.D1().w0(messagesListWidget.H.l() - 1);
        } else if (cqk.d(iqaVar, gqa.a)) {
            zv8[] zv8VarArr = MessagesListWidget.T1;
            fva fvaVarG0 = messagesListWidget.F1().g0();
            fvaVarG0.q.updateAndGet(new g23(5));
            fvaVarG0.r.set(null);
            a6f a6fVar = fvaVarG0.u;
            a6fVar.getClass();
            a6f.i(a6fVar, Long.MIN_VALUE, null, 0, 6);
            ((View) this.g).post(new bta(messagesListWidget));
        } else if (cqk.d(iqaVar, ypa.a)) {
            zv8[] zv8VarArr2 = MessagesListWidget.T1;
            messagesListWidget.F1().c0().b();
            x6e x6eVar = messagesListWidget.o1;
            if (x6eVar != null) {
                x6eVar.b();
            }
        } else if (iqaVar instanceof eqa) {
            zv8[] zv8VarArr3 = MessagesListWidget.T1;
            x5b x5bVarC0 = messagesListWidget.F1().c0();
            int i = ((eqa) iqaVar).a;
            List listT1 = ww3.T1(((r5b) x5bVarC0.f.getValue()).a);
            if (listT1.isEmpty()) {
                x5bVarC0.b();
            } else {
                x5bVarC0.e.invoke(listT1, Integer.valueOf(i));
                if (i == R.id.messages_list_context_action_copy || i == R.id.messages_list_context_action_reply || i == R.id.messages_list_context_action_forward) {
                    x5bVarC0.b();
                }
            }
        } else if (iqaVar instanceof dqa) {
            m76 m76Var = messagesListWidget.O1;
            if (m76Var != null) {
                m76Var.q = true;
            }
        } else if (iqaVar instanceof hqa) {
            zv8[] zv8VarArr4 = MessagesListWidget.T1;
            if (!sol.e(messagesListWidget.w1())) {
                hqa hqaVar = (hqa) iqaVar;
                messagesListWidget.J1(hqaVar.a, hqaVar.b);
            }
        } else if (iqaVar instanceof aqa) {
            zv8[] zv8VarArr5 = MessagesListWidget.T1;
            messagesListWidget.I1();
        } else if (cqk.d(iqaVar, zpa.a)) {
            zv8[] zv8VarArr6 = MessagesListWidget.T1;
            int iX0 = messagesListWidget.D1().getLinearLayoutManager().X0();
            int iZ0 = messagesListWidget.D1().getLinearLayoutManager().Z0();
            if (iX0 != -1 && iZ0 != -1) {
                linkedHashMap = new LinkedHashMap();
                if (iX0 <= iZ0) {
                    while (true) {
                        MessageModel messageModelQ = messagesListWidget.H.Q(iX0);
                        if (messageModelQ != null) {
                            linkedHashMap.put(Integer.valueOf(iX0), messageModelQ);
                        }
                        if (iX0 == iZ0) {
                            break;
                        }
                        iX0++;
                    }
                }
            } else {
                gm0.n(messagesListWidget.a, "Can't dump messages because didn't exist in lm");
                linkedHashMap = s66.a;
            }
            Map map = linkedHashMap;
            jsa jsaVarF1 = messagesListWidget.F1();
            int iL = messagesListWidget.H.l();
            kta ktaVar = (kta) jsaVarF1.P1.getValue();
            ktaVar.g.B(ktaVar, kta.h[0], yab.i0((gu4) ktaVar.f.getValue(), null, 2, new jta(jsaVarF1.w2, iL, map, ktaVar, null), 1));
        } else if (cqk.d(iqaVar, bqa.a)) {
            zv8[] zv8VarArr7 = MessagesListWidget.T1;
            if (!((f5d) ((wo6) messagesListWidget.m.getValue())).n() && !((f5d) ((wo6) messagesListWidget.m.getValue())).D()) {
                z = false;
            }
            if (!((Boolean) messagesListWidget.F1().I2.getValue()).booleanValue()) {
                xb9 xb9Var = (xb9) messagesListWidget.t1();
                if (!((Boolean) xb9Var.X0.m(xb9Var, xb9.g1[41])).booleanValue() && z && (mvhVar = messagesListWidget.R1) != null && (h1iVar = (h1i) messagesListWidget.Q1.getValue()) != null) {
                    k96 k96VarD1 = messagesListWidget.D1();
                    h1iVar.c = mvhVar;
                    View contentView = mvhVar.getContentView();
                    if (contentView != null) {
                        contentView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    }
                    h1iVar.d.a(k96VarD1, 0);
                }
            }
        } else {
            if (!cqk.d(iqaVar, cqa.a)) {
                ore.o();
                return null;
            }
            zv8[] zv8VarArr8 = MessagesListWidget.T1;
            messagesListWidget.I1();
        }
        return sbi.a;
    }

    private final Object r(Object obj) {
        gu4 gu4Var = (gu4) this.f;
        ch3.d0(obj);
        Map map = (Map) this.h;
        y6b y6bVar = (y6b) this.g;
        for (Map.Entry entry : map.entrySet()) {
            yab.i0(gu4Var, null, 0, new wz6((j6b) entry.getValue(), y6bVar, (ha9) entry.getKey(), null, 21), 3);
        }
        return sbi.a;
    }

    private final Object s(Object obj) {
        ch3.d0(obj);
        boolean zF = q3m.f(((Context) ((lvc) this.f).f.getValue()).getContentResolver(), Uri.parse(((lvc) this.f).c));
        Bitmap.CompressFormat compressFormat = zF ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        UUID uuidRandomUUID = UUID.randomUUID();
        File fileT = ((ju6) ((lvc) this.f).e.getValue()).t(uuidRandomUUID + "." + (zF ? "png" : "jpg"));
        q3m.g(fileT.getPath(), (Bitmap) ((wfe) this.h).a, 100, compressFormat);
        String str = ((lvc) this.f).h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "photo editing result: " + uuidRandomUUID + " with compress format: " + compressFormat, null);
            }
        }
        a8j.x(((lvc) this.f).n, new zuc(Uri.fromFile(fileT), ((qvc) this.g).b.b()));
        return sbi.a;
    }

    private final Object t(Object obj) {
        m8b m8bVar = (m8b) this.f;
        ch3.d0(obj);
        int i = m8bVar.d;
        cyb cybVar = (cyb) this.h;
        PickChatMembers pickChatMembers = (PickChatMembers) this.g;
        if (i == 0) {
            cybVar.setText(np4.q(pickChatMembers.getContext(), R.string.oneme_startconversations_create_empty_chat));
            cybVar.setCount(null);
            cybVar.setEnabled(true);
        } else if (i > ((g5d) pickChatMembers.m).d()) {
            cybVar.setEnabled(false);
        } else {
            cybVar.setText(np4.q(pickChatMembers.getContext(), R.string.oneme_startconversations_continue_create_chat));
            cybVar.setCount(new Integer(i));
            cybVar.setEnabled(true);
        }
        return sbi.a;
    }

    private final Object u(Object obj) {
        Object obj2 = this.f;
        ch3.d0(obj);
        int i = ((m8b) obj2).d;
        Integer num = i == 0 ? null : new Integer(i);
        cyb cybVar = (cyb) this.h;
        cybVar.setText(np4.q(((PickStoryPresetScreen) this.g).getContext(), R.string.to_save));
        cybVar.setCount(num);
        return sbi.a;
    }

    private final Object v(Object obj) {
        Object obj2 = this.f;
        ch3.d0(obj);
        List list = (List) obj2;
        PickerContactsListWidget pickerContactsListWidget = (PickerContactsListWidget) this.h;
        pickerContactsListWidget.i.H(list);
        if (r5h.X0((CharSequence) pickerContactsListWidget.p1().l.a.getValue())) {
            pickerContactsListWidget.q1().setVisibility(0);
            ((r1c) pickerContactsListWidget.l.getValue()).setVisibility(4);
        } else {
            View view = (View) this.g;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                yab.e(viewGroup, (View) pickerContactsListWidget.l.getValue(), -1);
            }
            pickerContactsListWidget.q1().setVisibility((list == null || !list.isEmpty()) ? 0 : 4);
            ((r1c) pickerContactsListWidget.l.getValue()).setVisibility((list == null || !list.isEmpty()) ? 4 : 0);
        }
        return sbi.a;
    }

    private final Object w(Object obj) {
        Object obj2 = this.f;
        ch3.d0(obj);
        List list = (List) obj2;
        PickerMembersListWidget pickerMembersListWidget = (PickerMembersListWidget) this.h;
        pickerMembersListWidget.j.H(list);
        View view = (View) this.g;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            yab.e(viewGroup, (View) pickerMembersListWidget.k.getValue(), -1);
        }
        pickerMembersListWidget.r1().setVisibility((list == null || !list.isEmpty()) ? 0 : 4);
        ((r1c) pickerMembersListWidget.k.getValue()).setVisibility((list == null || !list.isEmpty()) ? 4 : 0);
        return sbi.a;
    }

    private final Object x(Object obj) {
        Iterable iterableSingletonList;
        Object[] objArr;
        List list;
        Object next;
        Object[] spans;
        int spanStart;
        dc dcVar = (dc) this.h;
        Object obj2 = this.f;
        ch3.d0(obj);
        cz9 cz9Var = (cz9) obj2;
        int i = 0;
        if (cz9Var instanceof wy9) {
            CharSequence charSequence = ((wy9) cz9Var).a;
            Editable text = dcVar.getText();
            if (text != null) {
                if (text.length() == 0) {
                    iterableSingletonList = r66.a;
                } else {
                    Object[] spans2 = text.getSpans(0, text.length(), geg.class);
                    if (spans2.length == 0) {
                        iterableSingletonList = Collections.singletonList(text);
                    } else {
                        pw pwVar = new pw((spans2.length * 2) + 2);
                        pwVar.add(0);
                        pwVar.add(Integer.valueOf(text.length()));
                        for (Object obj3 : spans2) {
                            int spanStart2 = text.getSpanStart(obj3);
                            int spanEnd = text.getSpanEnd(obj3);
                            if (spanStart2 != -1 && spanEnd != -1) {
                                pwVar.add(Integer.valueOf(spanStart2));
                                pwVar.add(Integer.valueOf(spanEnd));
                            }
                        }
                        List listL1 = ww3.L1(pwVar);
                        ArrayList arrayList = new ArrayList();
                        int size = listL1.size() - 1;
                        int i2 = 0;
                        while (i2 < size) {
                            int iIntValue = ((Number) listL1.get(i2)).intValue();
                            i2++;
                            int iIntValue2 = ((Number) listL1.get(i2)).intValue();
                            if (iIntValue < iIntValue2) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text.subSequence(iIntValue, iIntValue2));
                                int length = spans2.length;
                                int i3 = i;
                                while (i3 < length) {
                                    Object obj4 = spans2[i3];
                                    int spanStart3 = text.getSpanStart(obj4);
                                    Object[] objArr2 = spans2;
                                    int spanEnd2 = text.getSpanEnd(obj4);
                                    List list2 = listL1;
                                    int spanFlags = text.getSpanFlags(obj4);
                                    if (spanStart3 < iIntValue2 && spanEnd2 > iIntValue) {
                                        int iMax = Math.max(spanStart3, iIntValue) - iIntValue;
                                        int iMin = Math.min(spanEnd2, iIntValue2) - iIntValue;
                                        if (iMax >= 0 && iMax < iMin) {
                                            spannableStringBuilder.setSpan(obj4, iMax, iMin, spanFlags);
                                        }
                                    }
                                    i3++;
                                    spans2 = objArr2;
                                    listL1 = list2;
                                }
                                objArr = spans2;
                                list = listL1;
                                arrayList.add(spannableStringBuilder);
                            } else {
                                objArr = spans2;
                                list = listL1;
                            }
                            spans2 = objArr;
                            listL1 = list;
                            i = 0;
                        }
                        iterableSingletonList = arrayList;
                    }
                }
                Iterator it = iterableSingletonList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!z5h.E0((CharSequence) next, charSequence));
                CharSequence charSequence2 = (CharSequence) next;
                if (charSequence2 != null) {
                    Editable text2 = dcVar.getText();
                    if (text2 != null) {
                        int length2 = charSequence2.length();
                        try {
                            Spanned spanned = charSequence2 instanceof Spanned ? (Spanned) charSequence2 : null;
                            spans = spanned != null ? spanned.getSpans(0, length2, geg.class) : null;
                        } catch (Throwable unused) {
                        }
                        geg[] gegVarArr = (geg[]) spans;
                        geg gegVar = gegVarArr != null ? (geg) a.b1(gegVarArr) : null;
                        if (gegVar != null && (spanStart = text2.getSpanStart(gegVar)) != -1) {
                            text2.delete(spanStart, charSequence2.length() + spanStart);
                        }
                    }
                } else {
                    Editable text3 = dcVar.getText();
                    if (text3 != null) {
                        dcVar.a(charSequence);
                        text3.replace(dcVar.getSelectionEnd(), dcVar.getSelectionEnd(), charSequence, 0, charSequence.length());
                    }
                }
            }
        } else if (cz9Var instanceof vy9) {
            CharSequence emojiBeforeCursor = dcVar.getEmojiBeforeCursor();
            if (emojiBeforeCursor != null) {
                ProfileReactionsSettingsScreen profileReactionsSettingsScreen = (ProfileReactionsSettingsScreen) this.g;
                zv8[] zv8VarArr = ProfileReactionsSettingsScreen.p;
                a8j.x(((ez9) profileReactionsSettingsScreen.g.getValue()).f, new xy9(emojiBeforeCursor));
            }
            dcVar.dispatchKeyEvent(new KeyEvent(0, 67));
        }
        return sbi.a;
    }

    private final Object y(Object obj) {
        Object obj2 = this.f;
        ch3.d0(obj);
        i0e i0eVar = (i0e) obj2;
        if (cqk.d(i0eVar, f0e.a)) {
            p0m.a((View) this.h, mt7.REJECT);
            h8c h8cVar = new h8c((QrScannerWidget) this.g);
            h8cVar.h(new w8c(R.drawable.icon_warning_fill));
            h8cVar.m(new tnh(R.string.oneme_qrscanner_error_snackbar_title));
            h8cVar.a(new tnh(R.string.try_again));
            h8cVar.p();
        } else if (!cqk.d(i0eVar, g0e.a)) {
            if (cqk.d(i0eVar, e0e.a)) {
                QrScannerWidget qrScannerWidget = (QrScannerWidget) this.g;
                zv8[] zv8VarArr = QrScannerWidget.w;
                qrScannerWidget.t1().B(l1f.a);
            } else {
                if (!(i0eVar instanceof h0e)) {
                    ore.o();
                    return null;
                }
                QrScannerWidget qrScannerWidget2 = (QrScannerWidget) this.g;
                ((TextView) qrScannerWidget2.n.m(qrScannerWidget2, QrScannerWidget.w[6])).setVisibility(8);
                h0e h0eVar = (h0e) i0eVar;
                tzd tzdVar = (tzd) ww3.t1(h0eVar.a);
                if (tzdVar != null) {
                    QrScannerWidget qrScannerWidget3 = (QrScannerWidget) this.g;
                    boolean z = h0eVar.b;
                    RectF rectF = qrScannerWidget3.p;
                    if (z) {
                        qrScannerWidget3.v1(tzdVar.a);
                    } else {
                        rectF.set(tzdVar.b);
                        qrScannerWidget3.r1().setOnQrAnimationCompleteListener(new k9d(qrScannerWidget3, 17, tzdVar));
                        d0e d0eVarR1 = qrScannerWidget3.r1();
                        if (d0eVarR1.l) {
                            d0eVarR1.d.set(rectF);
                            d0eVarR1.invalidate();
                        } else {
                            d0eVarR1.c.cancel();
                            d0eVarR1.e = rectF;
                            ValueAnimator valueAnimator = d0eVarR1.h;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(d0eVarR1.k), Integer.valueOf(d0eVarR1.j));
                            valueAnimatorOfObject.setDuration(200L);
                            valueAnimatorOfObject.addUpdateListener(new c0e(d0eVarR1, 1));
                            valueAnimatorOfObject.start();
                            d0eVarR1.h = valueAnimatorOfObject;
                            d0eVarR1.g.set((d0eVarR1.getWidth() - d0eVarR1.b) / 2.0f, (d0eVarR1.getHeight() - d0eVarR1.b) / 2.0f, (d0eVarR1.getWidth() + d0eVarR1.b) / 2.0f, (d0eVarR1.getHeight() + d0eVarR1.b) / 2.0f);
                            ValueAnimator valueAnimator2 = d0eVarR1.i;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(200L);
                            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfFloat.addUpdateListener(new mk(d0eVarR1, 8, rectF));
                            valueAnimatorOfFloat.addListener(new li(15, d0eVarR1));
                            valueAnimatorOfFloat.start();
                            d0eVarR1.i = valueAnimatorOfFloat;
                            d0eVarR1.l = true;
                        }
                    }
                }
            }
        }
        String name = QrScannerWidget.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "SCAN_RESULT = " + i0eVar, null);
            }
        }
        return sbi.a;
    }

    private final Object z(Object obj) {
        hve hveVarU1;
        RecordControlsWidget recordControlsWidget = (RecordControlsWidget) this.h;
        Object obj2 = this.f;
        ch3.d0(obj);
        wbe wbeVar = (wbe) obj2;
        if (cqk.d(wbeVar, sbe.a)) {
            ny8 ny8Var = recordControlsWidget.f;
            zv8[] zv8VarArr = RecordControlsWidget.x1;
            if (!((wsc) ny8Var.getValue()).c(wsc.i)) {
                ((wsc) ny8Var.getValue()).k(new svj(recordControlsWidget, 1), R.string.permissions_audio_request_denied);
            }
            if (!((wsc) ny8Var.getValue()).c(wsc.n)) {
                ((wsc) ny8Var.getValue()).p(new svj(recordControlsWidget, 1));
            }
        } else {
            if (cqk.d(wbeVar, tbe.a)) {
                zv8[] zv8VarArr2 = RecordControlsWidget.x1;
                zv8[] zv8VarArr3 = BottomSheetWidget.t;
                jc4 jc4VarC = p.c(R.string.audio_record_confirm_exit_title, null, null, 6);
                jc4VarC.g(new tnh(R.string.audio_record_confirm_exit_description));
                jc4VarC.a(new kc4(1, new tnh(R.string.audio_record_confirm_exit_accept), 3, 56));
                jc4VarC.a(new kc4(2, new tnh(R.string.audio_record_confirm_exit_cancel), 2, 56));
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(recordControlsWidget);
                confirmationBottomSheetF.setTargetController(recordControlsWidget);
                br4 parentController = recordControlsWidget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                    p.k(false, lveVar, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar);
                }
            } else if (cqk.d(wbeVar, rbe.a)) {
                p0m.a((View) this.g, mt7.REJECT);
            } else if (wbeVar instanceof vbe) {
                zv8[] zv8VarArr4 = RecordControlsWidget.x1;
                sol.g(recordControlsWidget, recordControlsWidget.r1(), ((vbe) wbeVar).a, null);
            } else {
                if (!(wbeVar instanceof ube)) {
                    ore.o();
                    return null;
                }
                zv8[] zv8VarArr5 = BottomSheetWidget.t;
                ube ubeVar = (ube) wbeVar;
                jc4 jc4VarA = mol.a(ubeVar.a, null, null, 6);
                jc4VarA.g(ubeVar.b);
                ubeVar.c.forEach(new ob3(7, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 19)));
                ConfirmationBottomSheet confirmationBottomSheetF2 = jc4VarA.f(recordControlsWidget);
                confirmationBottomSheetF2.setTargetController(recordControlsWidget);
                br4 parentController2 = recordControlsWidget;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                hveVarU1 = rootController2 != null ? rootController2.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar2 = new lve(confirmationBottomSheetF2, null, null, null, false, -1);
                    p.k(false, lveVar2, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar2);
                }
            }
        }
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                d97 d97Var = new d97(lq4Var, (z2e) obj3, (ForwardPickerScreen) obj2, 0);
                d97Var.f = obj;
                return d97Var;
            case 1:
                d97 d97Var2 = new d97((xx6) obj3, lq4Var, (ForwardPickerScreen) obj2, 1);
                d97Var2.f = obj;
                return d97Var2;
            case 2:
                d97 d97Var3 = new d97((ForwardPickerScreen) obj2, (ViewGroup) obj3, lq4Var);
                d97Var3.f = obj;
                return d97Var3;
            case 3:
                d97 d97Var4 = new d97(lq4Var, (ForwardPickerScreen) obj2, (View) obj3);
                d97Var4.f = obj;
                return d97Var4;
            case 4:
                d97 d97Var5 = new d97((Set) obj3, (ej7) obj2, lq4Var, 4);
                d97Var5.f = obj;
                return d97Var5;
            case 5:
                return new d97((ej7) this.f, (kb9) obj3, (List) obj2, lq4Var, 5);
            case 6:
                return new d97((lu7) this.f, (File) obj3, (File) obj2, lq4Var, 6);
            case 7:
                d97 d97Var6 = new d97((LinkInterceptorWidget) obj3, (Uri) obj2, lq4Var, 7);
                d97Var6.f = obj;
                return d97Var6;
            case 8:
                return new d97((jg9) this.f, (wfe) obj3, (gda) obj2, lq4Var, 8);
            case 9:
                d97 d97Var7 = new d97(lq4Var, (MediaBarWidget) obj3, (ecd) obj2, 9);
                d97Var7.f = obj;
                return d97Var7;
            case 10:
                return new d97((lx9) this.f, (y26) obj3, (Uri) obj2, lq4Var, 10);
            case 11:
                d97 d97Var8 = new d97(lq4Var, (MediaPickerScreen) obj3, (View) obj2, 11);
                d97Var8.f = obj;
                return d97Var8;
            case 12:
                d97 d97Var9 = new d97(lq4Var, (MessageWriteWidget) obj3, (View) obj2, 12);
                d97Var9.f = obj;
                return d97Var9;
            case 13:
                return new d97((jsa) this.f, (String) obj3, (List) obj2, lq4Var, 13);
            case 14:
                d97 d97Var10 = new d97((jsa) obj3, (rt2) obj2, lq4Var, 14);
                d97Var10.f = obj;
                return d97Var10;
            case 15:
                d97 d97Var11 = new d97(lq4Var, (MessagesListWidget) obj3, (h1i) obj2, 15);
                d97Var11.f = obj;
                return d97Var11;
            case 16:
                d97 d97Var12 = new d97(lq4Var, (MessagesListWidget) obj3, (View) obj2, 16);
                d97Var12.f = obj;
                return d97Var12;
            case 17:
                d97 d97Var13 = new d97((Map) obj3, (y6b) obj2, lq4Var, 17);
                d97Var13.f = obj;
                return d97Var13;
            case 18:
                return new d97((lvc) this.f, (wfe) obj3, (qvc) obj2, lq4Var, 18);
            case 19:
                d97 d97Var14 = new d97((cyb) obj3, (PickChatMembers) obj2, lq4Var, 19);
                d97Var14.f = obj;
                return d97Var14;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                d97 d97Var15 = new d97(lq4Var, (cyb) obj3, (PickStoryPresetScreen) obj2, 20);
                d97Var15.f = obj;
                return d97Var15;
            case 21:
                d97 d97Var16 = new d97(lq4Var, (PickerContactsListWidget) obj3, (View) obj2, 21);
                d97Var16.f = obj;
                return d97Var16;
            case 22:
                d97 d97Var17 = new d97(lq4Var, (PickerMembersListWidget) obj3, (View) obj2, 22);
                d97Var17.f = obj;
                return d97Var17;
            case 23:
                d97 d97Var18 = new d97(lq4Var, (dc) obj3, (ProfileReactionsSettingsScreen) obj2, 23);
                d97Var18.f = obj;
                return d97Var18;
            case 24:
                d97 d97Var19 = new d97(lq4Var, (View) obj3, (QrScannerWidget) obj2, 24);
                d97Var19.f = obj;
                return d97Var19;
            case 25:
                d97 d97Var20 = new d97(lq4Var, (RecordControlsWidget) obj3, (View) obj2, 25);
                d97Var20.f = obj;
                return d97Var20;
            case 26:
                d97 d97Var21 = new d97((File) obj3, (hze) obj2, lq4Var, 26);
                d97Var21.f = obj;
                return d97Var21;
            case 27:
                d97 d97Var22 = new d97((View) obj3, (SearchMessageBottomWidget) obj2, lq4Var, 27);
                d97Var22.f = obj;
                return d97Var22;
            case 28:
                d97 d97Var23 = new d97((xx6) obj3, lq4Var, (SelectedMediaBottomBarWidget) obj2, 28);
                d97Var23.f = obj;
                return d97Var23;
            default:
                d97 d97Var24 = new d97(lq4Var, (ServerHostBottomSheet) obj3, (View) obj2, 29);
                d97Var24.f = obj;
                return d97Var24;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((d97) create((ec6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((d97) create((zka) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((d97) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                return ((d97) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((d97) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                ((d97) create((l49) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((d97) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                ((d97) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                ((d97) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                ((d97) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                ((d97) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 18:
                ((d97) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                ((d97) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 23:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 24:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 25:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                return ((d97) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                ((d97) create((q9f) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 28:
                ((d97) create((ec6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((d97) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:271:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:272:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:297:0x0957  */
    /* JADX WARN: Code duplicated, block: B:301:0x0961  */
    /* JADX WARN: Code duplicated, block: B:303:0x0969  */
    /* JADX WARN: Code duplicated, block: B:304:0x096d  */
    /* JADX WARN: Code duplicated, block: B:307:0x0974  */
    /* JADX WARN: Code duplicated, block: B:313:0x0986  */
    /* JADX WARN: Code duplicated, block: B:321:0x099d  */
    /* JADX WARN: Code duplicated, block: B:322:0x099f  */
    /* JADX WARN: Code duplicated, block: B:325:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:326:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:334:0x09c0  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v18 java.lang.Object, still in use, count: 2, list:
          (r4v18 java.lang.Object) from 0x094f: PHI (r4 I:??) = (r4v12 java.lang.Object), (r4v18 java.lang.Object) binds: [B:292:0x094e, B:465:0x094f] A[DONT_GENERATE, DONT_INLINE]
          (r4v18 java.lang.Object) from 0x093d: CHECK_CAST (kef) (r4v18 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 3326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d97.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d97(lq4 lq4Var, ForwardPickerScreen forwardPickerScreen, View view) {
        super(2, lq4Var);
        this.e = 3;
        this.g = forwardPickerScreen;
        this.h = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d97(xx6 xx6Var, lq4 lq4Var, Widget widget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = xx6Var;
        this.g = widget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d97(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d97(lq4 lq4Var, Object obj, Object obj2, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d97(ForwardPickerScreen forwardPickerScreen, ViewGroup viewGroup, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.g = forwardPickerScreen;
        this.h = viewGroup;
    }
}
