package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class d3 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                d3 d3Var = new d3((AbstractPickerScreen) obj4, (lq4) obj3, 0);
                d3Var.f = (Map) obj;
                d3Var.g = (Map) obj2;
                return d3Var.invokeSuspend(sbiVar);
            case 1:
                d3 d3Var2 = new d3((je) obj4, (lq4) obj3, 1);
                d3Var2.f = (List) obj;
                d3Var2.g = (List) obj2;
                return d3Var2.invokeSuspend(sbiVar);
            case 2:
                d3 d3Var3 = new d3((BaseBottomSheetWidget) obj4, (lq4) obj3, 2);
                d3Var3.f = (ecd) obj;
                d3Var3.g = (kbc) obj2;
                d3Var3.invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                d3 d3Var4 = new d3((km1) obj4, (lq4) obj3, 3);
                d3Var4.f = (be1) obj;
                d3Var4.g = (vg4) obj2;
                d3Var4.invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                d3 d3Var5 = new d3((CallLinkInfoScreen) obj4, (lq4) obj3, 4);
                d3Var5.f = (et4) obj;
                d3Var5.g = (kbc) obj2;
                d3Var5.invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                d3 d3Var6 = new d3((kt1) obj4, (lq4) obj3, 5);
                d3Var6.f = (Long) obj;
                d3Var6.g = (CharSequence) obj2;
                d3Var6.invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                d3 d3Var7 = new d3((ny8) obj4, (lq4) obj3, 6);
                d3Var7.f = (k52) obj;
                d3Var7.g = (enc) obj2;
                return d3Var7.invokeSuspend(sbiVar);
            case 7:
                d3 d3Var8 = new d3((ny8) obj4, (lq4) obj3, 7);
                d3Var8.f = (k52) obj;
                d3Var8.g = (ao1) obj2;
                return d3Var8.invokeSuspend(sbiVar);
            case 8:
                d3 d3Var9 = new d3((rp4) obj4, (lq4) obj3, 8);
                d3Var9.f = (ImageView) obj;
                d3Var9.g = (kbc) obj2;
                d3Var9.invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                d3 d3Var10 = new d3((q04) obj4, (lq4) obj3, 9);
                d3Var10.f = (List) obj;
                d3Var10.g = (x8a) obj2;
                return d3Var10.invokeSuspend(sbiVar);
            case 10:
                d3 d3Var11 = new d3((q04) obj4, (lq4) obj3, 10);
                d3Var11.f = (Set) obj;
                d3Var11.g = (x8a) obj2;
                return d3Var11.invokeSuspend(sbiVar);
            case 11:
                d3 d3Var12 = new d3((zpg) this.g, (zpg) obj4, (lq4) obj3, 11);
                d3Var12.f = (RecyclerView) obj;
                d3Var12.invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                d3 d3Var13 = new d3((rp4) this.g, (ImageView) obj4, (lq4) obj3, 12);
                d3Var13.f = (FrameLayout) obj;
                d3Var13.invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                d3 d3Var14 = new d3((zyg) obj4, (lq4) obj3, 13);
                d3Var14.f = (Map) obj;
                d3Var14.g = (Map) obj2;
                return d3Var14.invokeSuspend(sbiVar);
            case 14:
                d3 d3Var15 = new d3((ExternalCallbackWidget) obj4, (lq4) obj3, 14);
                d3Var15.f = (TextView) obj;
                d3Var15.g = (kbc) obj2;
                d3Var15.invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                d3 d3Var16 = new d3((u17) obj4, (lq4) obj3, 15);
                d3Var16.f = (View) obj;
                d3Var16.g = (kbc) obj2;
                d3Var16.invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                d3 d3Var17 = new d3((sr8) obj4, (lq4) obj3, 16);
                d3Var17.f = (List) obj;
                d3Var17.g = (x8a) obj2;
                return d3Var17.invokeSuspend(sbiVar);
            case 17:
                d3 d3Var18 = new d3((sr8) obj4, (lq4) obj3, 17);
                d3Var18.f = (List) obj;
                d3Var18.g = (List) obj2;
                return d3Var18.invokeSuspend(sbiVar);
            case 18:
                d3 d3Var19 = new d3((Drawable) obj4, (lq4) obj3, 18);
                d3Var19.f = (TextView) obj;
                d3Var19.g = (kbc) obj2;
                d3Var19.invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                d3 d3Var20 = new d3((k96) this.g, (LogsViewerScreen) obj4, (lq4) obj3, 19);
                d3Var20.f = (List) obj2;
                d3Var20.invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                d3 d3Var21 = new d3((Drawable) this.g, (AppCompatTextView) obj4, (lq4) obj3, 20);
                d3Var21.f = (kbc) obj2;
                d3Var21.invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                d3 d3Var22 = new d3((AppCompatTextView) this.g, (AppCompatTextView) obj4, (lq4) obj3, 21);
                d3Var22.f = (kbc) obj2;
                d3Var22.invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                d3 d3Var23 = new d3((MessageContextMenuBottomSheet) obj4, (lq4) obj3, 22);
                d3Var23.f = (FrameLayout) obj;
                d3Var23.g = (kbc) obj2;
                d3Var23.invokeSuspend(sbiVar);
                return sbiVar;
            case 23:
                d3 d3Var24 = new d3((nma) obj4, (lq4) obj3, 23);
                d3Var24.f = (rt2) obj;
                d3Var24.g = (fla) obj2;
                return d3Var24.invokeSuspend(sbiVar);
            case 24:
                d3 d3Var25 = new d3((d76) obj4, (lq4) obj3, 24);
                d3Var25.f = (n01) obj;
                d3Var25.g = (kbc) obj2;
                d3Var25.invokeSuspend(sbiVar);
                return sbiVar;
            case 25:
                d3 d3Var26 = new d3((MessagesListWidget) obj4, (lq4) obj3, 25);
                d3Var26.f = (k96) obj;
                d3Var26.g = (kbc) obj2;
                d3Var26.invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                d3 d3Var27 = new d3((rsc) obj4, (lq4) obj3, 26);
                d3Var27.f = (ssc) obj;
                d3Var27.g = (ssc) obj2;
                d3Var27.invokeSuspend(sbiVar);
                return sbiVar;
            case 27:
                d3 d3Var28 = new d3((kyc) obj4, (lq4) obj3, 27);
                d3Var28.f = (List) obj;
                d3Var28.g = (y47) obj2;
                return d3Var28.invokeSuspend(sbiVar);
            case 28:
                d3 d3Var29 = new d3((PickerContactsListWidget) obj4, (lq4) obj3, 28);
                d3Var29.f = (List) obj;
                d3Var29.g = (List) obj2;
                d3Var29.invokeSuspend(sbiVar);
                return sbiVar;
            default:
                d3 d3Var30 = new d3((czc) obj4, (lq4) obj3, 29);
                d3Var30.f = (List) obj;
                d3Var30.g = (m8b) obj2;
                return d3Var30.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:286:0x076f A[PHI: r7
  0x076f: PHI (r7v4 java.lang.CharSequence) = (r7v3 java.lang.CharSequence), (r7v17 java.lang.CharSequence) binds: [B:281:0x0763, B:285:0x076d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:288:0x0775 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:289:0x0777  */
    /* JADX WARN: Code duplicated, block: B:290:0x0780  */
    /* JADX WARN: Code duplicated, block: B:292:0x0784  */
    /* JADX WARN: Code duplicated, block: B:294:0x078e  */
    /* JADX WARN: Code duplicated, block: B:302:0x07ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [em1] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v79 */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CharSequence charSequence;
        Long lValueOf;
        long jLongValue;
        String strI;
        String string;
        String strI2;
        em1 em1Var;
        e04 e04VarD;
        int i = this.e;
        p63 p63Var = p63.COMMENTS_BLACKLIST;
        a8g a8gVar = pq3.j;
        r66 r66Var = r66.a;
        String str = null;
        sbi sbiVar = sbi.a;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                Map map = (Map) this.f;
                Map map2 = (Map) this.g;
                ch3.d0(obj);
                AbstractPickerScreen abstractPickerScreen = (AbstractPickerScreen) obj3;
                Iterator it = lof.Y(map.keySet(), map2.keySet()).iterator();
                while (it.hasNext()) {
                    long jLongValue2 = ((Number) it.next()).longValue();
                    vzb vzbVar = (vzb) abstractPickerScreen.findViewById(R.id.oneme_picker_chips);
                    if (vzbVar != null) {
                        vzbVar.c(jLongValue2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    if (!cqk.d(map.get(entry.getKey()), entry.getValue())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    long jLongValue3 = ((Number) entry2.getKey()).longValue();
                    oyc oycVar = (oyc) entry2.getValue();
                    vzb vzbVar2 = (vzb) abstractPickerScreen.findViewById(R.id.oneme_picker_chips);
                    if (vzbVar2 != null) {
                        vzbVar2.c(jLongValue3);
                    }
                    vzb vzbVar3 = (vzb) abstractPickerScreen.findViewById(R.id.oneme_picker_chips);
                    if (vzbVar3 != null) {
                        vzbVar3.a(jLongValue3, oycVar.b, oycVar.e, oycVar.c, oycVar.d);
                    }
                }
                return map2;
            case 1:
                List list = (List) this.f;
                List list2 = (List) this.g;
                ch3.d0(obj);
                return ((je) obj3).B() ? list2 : list;
            case 2:
                ecd ecdVar = (ecd) this.f;
                kbc kbcVar = (kbc) this.g;
                ch3.d0(obj);
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) obj3;
                kbc kbcVarT1 = baseBottomSheetWidget.t1();
                if (kbcVarT1 != null) {
                    kbcVar = kbcVarT1;
                }
                vv vvVar = baseBottomSheetWidget.c;
                zv8 zv8Var = BaseBottomSheetWidget.j[0];
                if (((Boolean) vvVar.a(baseBottomSheetWidget)).booleanValue()) {
                    ecdVar.setBackground(new ColorDrawable(kbcVar.b().g));
                }
                return sbiVar;
            case 3:
                be1 be1Var = (be1) this.f;
                vg4 vg4Var = (vg4) this.g;
                ch3.d0(obj);
                km1 km1Var = (km1) obj3;
                ny8 ny8Var = km1Var.k;
                mjg mjgVar = km1Var.n;
                while (true) {
                    Object value = mjgVar.getValue();
                    Object value2 = km1Var.o.getValue();
                    if (value2 instanceof em1) {
                        em1Var = (em1) value2;
                    } else {
                        obj2 = str;
                    }
                    if (obj2 == null) {
                        obj2 = em1Var;
                        obj2 = em1.l;
                    }
                    obj2 = em1Var;
                    ?? r11 = obj2;
                    Long l = be1Var.a;
                    String str2 = be1Var.j;
                    CharSequence charSequenceV = be1Var.c;
                    if (charSequenceV != null) {
                        if (!km1.E(be1Var, vg4Var)) {
                            if (vg4Var != null) {
                                lValueOf = Long.valueOf(vg4Var.w());
                            } else {
                                lValueOf = be1Var.i;
                            }
                            if (lValueOf != null) {
                                jLongValue = lValueOf.longValue();
                                if (jLongValue > 0) {
                                    vtc vtcVar = (vtc) km1Var.j.getValue();
                                    String strValueOf = String.valueOf(jLongValue);
                                    if (vg4Var != null || (strI = vg4Var.i()) == null) {
                                        strI = str2;
                                    } else {
                                        if (strI.length() == 0) {
                                            strI = str;
                                        }
                                        if (strI == null) {
                                            strI = str2;
                                        }
                                    }
                                    charSequenceV = vd7.v(vtcVar, strValueOf, strI, ((s7f) ((et3) ny8Var.getValue())).m());
                                }
                            }
                            charSequence = str;
                        }
                        charSequence = charSequenceV;
                    } else {
                        charSequenceV = vg4Var != null ? vg4Var.k() : str;
                        if (charSequenceV != null) {
                            if (!km1.E(be1Var, vg4Var)) {
                                if (vg4Var != null) {
                                    lValueOf = Long.valueOf(vg4Var.w());
                                } else {
                                    lValueOf = be1Var.i;
                                }
                                if (lValueOf != null) {
                                    jLongValue = lValueOf.longValue();
                                    if (jLongValue > 0) {
                                        vtc vtcVar2 = (vtc) km1Var.j.getValue();
                                        String strValueOf2 = String.valueOf(jLongValue);
                                        if (vg4Var != null) {
                                            strI = str2;
                                        } else {
                                            strI = str2;
                                        }
                                        charSequenceV = vd7.v(vtcVar2, strValueOf2, strI, ((s7f) ((et3) ny8Var.getValue())).m());
                                    }
                                }
                                charSequence = str;
                            }
                            charSequence = charSequenceV;
                        } else {
                            charSequence = str;
                        }
                    }
                    boolean z = be1Var.h;
                    Long l2 = be1Var.f;
                    CharSequence charSequence2 = be1Var.g;
                    ok0 ok0Var = new ok0((l2 == null || charSequence2 == null) ? null : gm0.a(charSequence2, new Long(l2.longValue())), be1Var.e);
                    if (vg4Var != null && (strI2 = vg4Var.i()) != null) {
                        if (strI2.length() == 0) {
                            strI2 = null;
                        }
                        if (strI2 != null) {
                            str2 = strI2;
                        }
                    }
                    if (str2 != null) {
                        x0c x0cVarB = ((wge) km1Var.l.getValue()).b(str2);
                        StringBuilder sb = new StringBuilder();
                        CharSequence charSequence3 = x0cVarB.d;
                        if (charSequence3 != null) {
                            sb.append(charSequence3);
                            sb.append(" ");
                        }
                        sb.append(x0cVarB.c);
                        string = sb.toString();
                    } else {
                        string = null;
                    }
                    Long lValueOf2 = vg4Var != null ? Long.valueOf(vg4Var.a.b.y) : be1Var.k;
                    if (mjgVar.h(value, em1.a(r11, new qe1(l, charSequence, null, ok0Var, null, z, string, lValueOf2 != null ? oc9.G(((s7f) ((et3) ny8Var.getValue())).v(), lValueOf2.longValue()) : null, null, 276), false, null, null, null, km1.E(be1Var, vg4Var), vg4Var != null ? Boolean.valueOf(vg4Var.G()) : null, be1Var.m, 254))) {
                        return sbiVar;
                    }
                    sbiVar = sbiVar;
                    str = null;
                }
                break;
            case 4:
                et4 et4Var = (et4) this.f;
                kbc kbcVar2 = (kbc) this.g;
                ch3.d0(obj);
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) obj3;
                ldf ldfVar = CallLinkInfoScreen.t;
                j8e j8eVar = callLinkInfoScreen.k;
                zv8[] zv8VarArr = CallLinkInfoScreen.u;
                ((TextView) j8eVar.m(callLinkInfoScreen, zv8VarArr[3])).setTextColor(a8gVar.h(et4Var).getText().b);
                TextView textView = (TextView) callLinkInfoScreen.l.m(callLinkInfoScreen, zv8VarArr[4]);
                CharSequence text = textView.getText();
                Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), eph.class) : null;
                if (spans == null) {
                    spans = new eph[0];
                }
                for (Object obj4 : spans) {
                    ((eph) obj4).onThemeChanged(a8gVar.h(et4Var));
                }
                et4Var.setBackgroundColor(kbcVar2.b().b);
                return sbiVar;
            case 5:
                Long l3 = (Long) this.f;
                CharSequence charSequence4 = (CharSequence) this.g;
                ch3.d0(obj);
                kt1 kt1Var = (kt1) obj3;
                ((p32) kt1Var.h.getValue()).getClass();
                String strE = p32.e(l3);
                if (strE != null && !r5h.X0(strE)) {
                    charSequence4 = ((Object) charSequence4) + " · " + strE;
                }
                q32 q32Var = new q32(1, "", null, charSequence4);
                s32 s32Var = kt1Var.q;
                s32Var.b = q32Var;
                Iterator it2 = s32Var.a.iterator();
                while (it2.hasNext()) {
                    ((r32) it2.next()).D(q32Var);
                }
                return sbiVar;
            case 6:
                k52 k52Var = (k52) this.f;
                enc encVar = (enc) this.g;
                ch3.d0(obj);
                xb9 xb9Var = (xb9) ((et3) ((ny8) obj3).getValue());
                return Boolean.valueOf((((Boolean) xb9Var.M0.m(xb9Var, xb9.g1[30])).booleanValue() || k52Var.j || encVar.c.isEmpty()) ? false : true);
            case 7:
                k52 k52Var2 = (k52) this.f;
                ao1 ao1Var = (ao1) this.g;
                ch3.d0(obj);
                return (((Boolean) ((f5d) ((wo6) ((ny8) obj3).getValue())).a.z5.a(e5d.S6[339]).i()).booleanValue() && (ao1Var.f instanceof mi6)) ? k52Var2.h : vmi.d;
            case 8:
                ImageView imageView = (ImageView) this.f;
                kbc kbcVar3 = (kbc) this.g;
                ch3.d0(obj);
                Integer num = ((rp4) obj3).e;
                if (num != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(oc9.Z(num.intValue(), kbcVar3)));
                }
                return sbiVar;
            case 9:
                List list3 = (List) this.f;
                x8a x8aVar = (x8a) this.g;
                ch3.d0(obj);
                q04 q04Var = (q04) obj3;
                baa baaVar = q04Var.d;
                long j = q04Var.c;
                if (x8aVar instanceof w8a) {
                    w8a w8aVar = (w8a) x8aVar;
                    Collection collection = w8aVar.c;
                    if (w8aVar.a == j && w8aVar.b == p63Var) {
                        if (collection.isEmpty()) {
                            return r66Var;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : list3) {
                            if (!collection.contains(Long.valueOf(((e04) obj5).a))) {
                                arrayList.add(obj5);
                            }
                        }
                        return arrayList;
                    }
                } else if (x8aVar instanceof u8a) {
                    u8a u8aVar = (u8a) x8aVar;
                    Collection collection2 = u8aVar.c;
                    if (u8aVar.a == j && u8aVar.b == p63Var && !collection2.isEmpty()) {
                        Iterable iterable = (Iterable) baaVar.b().a.getValue();
                        int iP0 = wm9.P0(yw3.W0(iterable, 10));
                        if (iP0 < 16) {
                            iP0 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP0);
                        for (Object obj6 : iterable) {
                            linkedHashMap2.put(Long.valueOf(((n63) obj6).a.v()), obj6);
                        }
                        Iterable<n63> iterable2 = (Iterable) baaVar.b().a.getValue();
                        int iP1 = wm9.P0(yw3.W0(iterable2, 10));
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iP1 >= 16 ? iP1 : 16);
                        for (n63 n63Var : iterable2) {
                            linkedHashMap3.put(Long.valueOf(n63Var.a.v()), new ylc(Long.valueOf(n63Var.c), Long.valueOf(n63Var.d)));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = collection2.iterator();
                        while (it3.hasNext()) {
                            long jLongValue4 = ((Number) it3.next()).longValue();
                            n63 n63Var2 = (n63) linkedHashMap2.get(Long.valueOf(jLongValue4));
                            if (n63Var2 != null) {
                                e04VarD = q04Var.C(n63Var2);
                            } else {
                                vg4 vg4Var2 = (vg4) ((no4) q04Var.j.getValue()).j(jLongValue4).a.getValue();
                                e04VarD = vg4Var2 != null ? q04Var.D(vg4Var2, linkedHashMap3) : null;
                            }
                            if (e04VarD != null) {
                                arrayList2.add(e04VarD);
                            }
                        }
                        ArrayList arrayListG1 = ww3.G1(arrayList2, list3);
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj7 : arrayListG1) {
                            if (hashSet.add(Long.valueOf(((e04) obj7).a))) {
                                arrayList3.add(obj7);
                            }
                        }
                        return arrayList3;
                    }
                } else if (!(x8aVar instanceof v8a)) {
                    ore.o();
                    return null;
                }
                return list3;
            case 10:
                long j2 = ((q04) obj3).c;
                Set set = (Set) this.f;
                x8a x8aVar2 = (x8a) this.g;
                ch3.d0(obj);
                if (x8aVar2 instanceof w8a) {
                    w8a w8aVar2 = (w8a) x8aVar2;
                    Collection collection3 = w8aVar2.c;
                    if (w8aVar2.a == j2 && w8aVar2.b == p63Var && !collection3.isEmpty()) {
                        return lof.Z(set, collection3);
                    }
                } else if (x8aVar2 instanceof u8a) {
                    u8a u8aVar2 = (u8a) x8aVar2;
                    Collection collection4 = u8aVar2.c;
                    if (u8aVar2.a == j2 && u8aVar2.b == p63Var && !collection4.isEmpty()) {
                        return lof.Y(set, ww3.X1(collection4));
                    }
                } else if (!(x8aVar2 instanceof v8a)) {
                    ore.o();
                    return null;
                }
                return set;
            case 11:
                RecyclerView recyclerView = (RecyclerView) this.f;
                ch3.d0(obj);
                ((zpg) this.g).j();
                ((zpg) obj3).j();
                recyclerView.X();
                return sbiVar;
            case 12:
                FrameLayout frameLayout = (FrameLayout) this.f;
                ch3.d0(obj);
                Integer num2 = ((rp4) this.g).e;
                if (num2 != null) {
                    ((ImageView) obj3).setImageTintList(ColorStateList.valueOf(oc9.Z(num2.intValue(), a8gVar.h(frameLayout))));
                }
                return sbiVar;
            case 13:
                Map map3 = (Map) this.f;
                Map map4 = (Map) this.g;
                ch3.d0(obj);
                long j3 = ((zyg) obj3).a;
                ozg ozgVar = (ozg) map3.get(new Long(j3));
                return ozgVar == null ? (ozg) map4.get(new Long(j3)) : ozgVar;
            case 14:
                TextView textView2 = (TextView) this.f;
                kbc kbcVar4 = (kbc) this.g;
                ch3.d0(obj);
                int i2 = ExternalCallbackWidget.y;
                textView2.setTextColor(kbcVar4.getText().e);
                ((xc8) ((ExternalCallbackWidget) obj3).w.getValue()).setTint(kbcVar4.getIcon().e);
                return sbiVar;
            case 15:
                View view = (View) this.f;
                kbc kbcVar5 = (kbc) this.g;
                ch3.d0(obj);
                ShapeDrawable shapeDrawable = u17.x;
                ((u17) obj3).H(kbcVar5);
                view.setForeground(col.b(((bs0) kbcVar5.u().c.g).c, null, u17.x));
                return sbiVar;
            case 16:
                List list4 = (List) this.f;
                x8a x8aVar3 = (x8a) this.g;
                ch3.d0(obj);
                sr8 sr8Var = (sr8) obj3;
                if (x8aVar3 instanceof w8a) {
                    w8a w8aVar3 = (w8a) x8aVar3;
                    Collection collection5 = w8aVar3.c;
                    if (w8aVar3.a == sr8Var.c && w8aVar3.b == p63.JOIN_REQUEST) {
                        if (collection5.isEmpty()) {
                            return r66Var;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj8 : list4) {
                            if (!collection5.contains(Long.valueOf(((rq8) obj8).a))) {
                                arrayList4.add(obj8);
                            }
                        }
                        return arrayList4;
                    }
                } else if (!(x8aVar3 instanceof u8a) && !(x8aVar3 instanceof v8a)) {
                    ore.o();
                    return null;
                }
                return list4;
            case 17:
                sr8 sr8Var2 = (sr8) obj3;
                ?? arrayList5 = (List) this.f;
                List list5 = (List) this.g;
                ch3.d0(obj);
                if (list5 != null) {
                    List<vg4> list6 = list5;
                    arrayList5 = new ArrayList(yw3.W0(list6, 10));
                    for (vg4 vg4Var3 : list6) {
                        long jV = vg4Var3.v();
                        String strK = vg4Var3.k();
                        String str3 = strK == null ? "" : strK;
                        String strZ = vg4Var3.z(us0.a);
                        Uri uriK = strZ != null ? sb8.K(strZ) : null;
                        CharSequence charSequenceU = vg4Var3.u();
                        arrayList5.add(new rq8(jV, str3, uriK, charSequenceU == null ? "" : charSequenceU));
                    }
                }
                boolean zA = sr8Var2.d.a();
                if (((Collection) arrayList5).isEmpty()) {
                    return zA ? ir8.a : new hr8(((Boolean) sr8Var2.j.getValue()).booleanValue());
                }
                return new gr8(arrayList5, zA);
            case 18:
                TextView textView3 = (TextView) this.f;
                kbc kbcVar6 = (kbc) this.g;
                ch3.d0(obj);
                ((Drawable) obj3).setTint(kbcVar6.getIcon().b);
                textView3.setTextColor(kbcVar6.getText().h);
                textView3.setBackground(col.d(kbcVar6, kbcVar6.b().f, 0, 6));
                return sbiVar;
            case 19:
                LogsViewerScreen logsViewerScreen = (LogsViewerScreen) obj3;
                mh9 mh9Var = logsViewerScreen.f;
                mh9 mh9Var2 = logsViewerScreen.e;
                List list7 = (List) this.f;
                ch3.d0(obj);
                k96 k96Var = (k96) this.g;
                k96Var.setRefreshingNext(false);
                if (list7.isEmpty()) {
                    if (!cqk.d(k96Var.getAdapter(), mh9Var2)) {
                        k96Var.K0(mh9Var2, true);
                    }
                } else if (!cqk.d(k96Var.getAdapter(), mh9Var)) {
                    k96Var.K0(mh9Var, true);
                }
                mh9Var.o();
                mh9Var2.o();
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                kbc kbcVar7 = (kbc) this.f;
                ch3.d0(obj);
                Drawable drawable = (Drawable) this.g;
                kbcVar7.getIcon();
                drawable.setTint(-1);
                ((AppCompatTextView) obj3).setTextColor(-1);
                return sbiVar;
            case 21:
                kbc kbcVar8 = (kbc) this.f;
                ch3.d0(obj);
                ((AppCompatTextView) this.g).setTextColor(kbcVar8.getText().b);
                ((AppCompatTextView) obj3).setTextColor(kbcVar8.getText().d);
                return sbiVar;
            case 22:
                FrameLayout frameLayout2 = (FrameLayout) this.f;
                kbc kbcVar9 = (kbc) this.g;
                ch3.d0(obj);
                zv8[] zv8VarArr2 = MessageContextMenuBottomSheet.w1;
                ColorDrawable colorDrawable = ((MessageContextMenuBottomSheet) obj3).I;
                colorDrawable.setColor(kbcVar9.b().f);
                frameLayout2.setBackground(colorDrawable);
                return sbiVar;
            case 23:
                rt2 rt2Var = (rt2) this.f;
                fla flaVar = (fla) this.g;
                ch3.d0(obj);
                return Boolean.valueOf((rt2Var.b0() || flaVar != null || ((nma) obj3).d.a()) ? false : true);
            case 24:
                n01 n01Var = (n01) this.f;
                kbc kbcVar10 = (kbc) this.g;
                ch3.d0(obj);
                Drawable background = n01Var.getBackground();
                ip7 ip7Var = background instanceof ip7 ? (ip7) background : null;
                if (ip7Var != null) {
                    ip7Var.b.B(ip7Var, ip7.g[0], (int[]) ((t84) kbcVar10.f().c).d);
                    ip7Var.h(kbcVar10);
                }
                Drawable foreground = n01Var.getForeground();
                b6h b6hVar = foreground instanceof b6h ? (b6h) foreground : null;
                if (b6hVar != null) {
                    b6hVar.b(((d76) obj3).d != null ? (int[]) ((t84) kbcVar10.f().c).h : (int[]) ((t84) kbcVar10.f().c).g);
                    b6hVar.h(kbcVar10);
                }
                return sbiVar;
            case 25:
                k96 k96Var2 = (k96) this.f;
                kbc kbcVar11 = (kbc) this.g;
                ch3.d0(obj);
                MessagesListWidget messagesListWidget = (MessagesListWidget) obj3;
                zpg zpgVar = messagesListWidget.n1;
                if (zpgVar != null) {
                    zpgVar.j();
                }
                k96Var2.X();
                tda tdaVar = messagesListWidget.p;
                if (tdaVar != null) {
                    tdaVar.onThemeChanged(kbcVar11);
                }
                return sbiVar;
            case 26:
                ssc sscVar = (ssc) this.f;
                ssc sscVar2 = (ssc) this.g;
                ch3.d0(obj);
                ssc sscVar3 = ssc.a;
                rsc.a((rsc) obj3, "gallery", sscVar == sscVar3 ? "allowed" : sscVar2 == sscVar3 ? "partial" : "denied");
                return sbiVar;
            case 27:
                List list8 = (List) this.f;
                y47 y47Var = (y47) this.g;
                ch3.d0(obj);
                List<r17> list9 = list8;
                ArrayList arrayList6 = new ArrayList(yw3.W0(list9, 10));
                for (r17 r17Var : list9) {
                    ou4 ou4Var = (ou4) y47Var.a.d(r17Var.a);
                    if (ou4Var == null) {
                        ou4Var = ou4.b;
                    }
                    arrayList6.add(new q37(r17Var.a, r17Var.b, r17Var.o, ou4Var, r17Var.i));
                }
                return arrayList6;
            case 28:
                List list10 = (List) this.f;
                List list11 = (List) this.g;
                ch3.d0(obj);
                PickerContactsListWidget pickerContactsListWidget = (PickerContactsListWidget) obj3;
                pickerContactsListWidget.j.H(list11);
                pickerContactsListWidget.h.H(list10);
                return sbiVar;
            default:
                List list12 = (List) this.f;
                m8b m8bVar = (m8b) this.g;
                ch3.d0(obj);
                zv8[] zv8VarArr3 = czc.l;
                if (!((czc) obj3).D(m8bVar)) {
                    return list12;
                }
                List<qxc> list13 = list12;
                ArrayList arrayList7 = new ArrayList(yw3.W0(list13, 10));
                for (qxc qxcVar : list13) {
                    arrayList7.add(qxc.i(qxcVar, m8bVar.d(qxcVar.a)));
                }
                return arrayList7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(Object obj, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.h = obj;
    }
}
