package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import one.me.android.root.RootController;
import one.me.finishbottomsheet.PollFinishBottomSheet;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qsa extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ MessagesListWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsa(MessagesListWidget messagesListWidget, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.g = messagesListWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MessagesListWidget messagesListWidget = this.g;
        switch (i) {
            case 0:
                qsa qsaVar = new qsa(messagesListWidget, lq4Var);
                qsaVar.f = obj;
                return qsaVar;
            case 1:
                qsa qsaVar2 = new qsa(1, lq4Var, messagesListWidget);
                qsaVar2.f = obj;
                return qsaVar2;
            case 2:
                qsa qsaVar3 = new qsa(2, lq4Var, messagesListWidget);
                qsaVar3.f = obj;
                return qsaVar3;
            case 3:
                qsa qsaVar4 = new qsa(3, lq4Var, messagesListWidget);
                qsaVar4.f = obj;
                return qsaVar4;
            case 4:
                qsa qsaVar5 = new qsa(4, lq4Var, messagesListWidget);
                qsaVar5.f = obj;
                return qsaVar5;
            case 5:
                qsa qsaVar6 = new qsa(5, lq4Var, messagesListWidget);
                qsaVar6.f = obj;
                return qsaVar6;
            case 6:
                qsa qsaVar7 = new qsa(6, lq4Var, messagesListWidget);
                qsaVar7.f = obj;
                return qsaVar7;
            case 7:
                qsa qsaVar8 = new qsa(7, lq4Var, messagesListWidget);
                qsaVar8.f = obj;
                return qsaVar8;
            case 8:
                qsa qsaVar9 = new qsa(8, lq4Var, messagesListWidget);
                qsaVar9.f = obj;
                return qsaVar9;
            case 9:
                qsa qsaVar10 = new qsa(9, lq4Var, messagesListWidget);
                qsaVar10.f = obj;
                return qsaVar10;
            case 10:
                qsa qsaVar11 = new qsa(10, lq4Var, messagesListWidget);
                qsaVar11.f = obj;
                return qsaVar11;
            case 11:
                qsa qsaVar12 = new qsa(11, lq4Var, messagesListWidget);
                qsaVar12.f = obj;
                return qsaVar12;
            case 12:
                qsa qsaVar13 = new qsa(12, lq4Var, messagesListWidget);
                qsaVar13.f = obj;
                return qsaVar13;
            case 13:
                qsa qsaVar14 = new qsa(13, lq4Var, messagesListWidget);
                qsaVar14.f = obj;
                return qsaVar14;
            default:
                qsa qsaVar15 = new qsa(14, lq4Var, messagesListWidget);
                qsaVar15.f = obj;
                return qsaVar15;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((qsa) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 9:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 10:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 11:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 12:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 13:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((qsa) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v83, types: [android.widget.ScrollView] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Integer, lq4, ynh] */
    /* JADX WARN: Type inference failed for: r11v18, types: [hve] */
    /* JADX WARN: Type inference failed for: r11v19, types: [hve] */
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
        qp4 qp4Var;
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        int iO;
        u1f u1fVar;
        al5 al5Var;
        icd icdVar;
        int i = 6;
        int measuredHeight = 0;
        ?? U1 = 0;
        ViewGroup viewGroup = null;
        switch (this.e) {
            case 0:
                je9 je9Var = je9.d;
                List list = (List) this.f;
                ch3.d0(obj);
                int iCompareTo = this.g.getViewLifecycleOwner().f().d.compareTo(n09.d);
                String str = this.g.a;
                if (iCompareTo >= 0) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        int size = list.size();
                        Object objT1 = ww3.t1(list);
                        MessageModel messageModel = objT1 instanceof MessageModel ? (MessageModel) objT1 : null;
                        String strX = messageModel != null ? messageModel.x() : null;
                        Object objD1 = ww3.D1(list);
                        MessageModel messageModel2 = objD1 instanceof MessageModel ? (MessageModel) objD1 : null;
                        String strX2 = messageModel2 != null ? messageModel2.x() : null;
                        StringBuilder sbA = nbh.A(size, "Got new messages on UI, size=", ", first=", strX, ", last=");
                        sbA.append(strX2);
                        a4cVar.c(je9Var, str, sbA.toString(), null);
                    }
                    RecyclerView recyclerView = (RecyclerView) this.g.findViewById(R.id.messages_list_recycler_view);
                    MessagesListWidget messagesListWidget = this.g;
                    if (recyclerView == null) {
                        messagesListWidget.H.I(list, new psa(messagesListWidget, list, 0));
                    } else {
                        n1g.Q(recyclerView, new psa(messagesListWidget, list, 1), new psa(messagesListWidget, list, 2), 1);
                    }
                } else {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        int size2 = list.size();
                        Object objT2 = ww3.t1(list);
                        MessageModel messageModel3 = objT2 instanceof MessageModel ? (MessageModel) objT2 : null;
                        String strX3 = messageModel3 != null ? messageModel3.x() : null;
                        Object objD2 = ww3.D1(list);
                        MessageModel messageModel4 = objD2 instanceof MessageModel ? (MessageModel) objD2 : null;
                        String strX4 = messageModel4 != null ? messageModel4.x() : null;
                        StringBuilder sbA2 = nbh.A(size2, "Got new messages (lifecycle scope), size=", ", first=", strX3, ", last=");
                        sbA2.append(strX4);
                        a4cVar2.c(je9Var, str, sbA2.toString(), null);
                    }
                    MessagesListWidget messagesListWidget2 = this.g;
                    messagesListWidget2.H.I(list, new psa(messagesListWidget2, list, 3));
                }
                return sbi.a;
            case 1:
                Object obj2 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                MessagesListWidget messagesListWidget3 = this.g;
                zv8[] zv8VarArr = MessagesListWidget.T1;
                if (messagesListWidget3.s1().a) {
                    if (messagesListWidget3.s1().b) {
                        messagesListWidget3.D1().r0((tw6) messagesListWidget3.F1.getValue());
                    } else {
                        messagesListWidget3.D1().r0((ssa) messagesListWidget3.E1.getValue());
                    }
                    if (zBooleanValue) {
                        if (messagesListWidget3.s1().b) {
                            messagesListWidget3.D1().k((tw6) messagesListWidget3.F1.getValue());
                        } else {
                            messagesListWidget3.D1().k((ssa) messagesListWidget3.E1.getValue());
                        }
                    }
                }
                return sbi.a;
            case 2:
                Object obj3 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                MessagesListWidget messagesListWidget4 = this.g;
                zv8[] zv8VarArr2 = MessagesListWidget.T1;
                messagesListWidget4.I1();
                if (zBooleanValue2 && (qp4Var = messagesListWidget4.o) != null) {
                    qp4Var.dismiss();
                }
                return sbi.a;
            case 3:
                Object obj4 = this.f;
                ch3.d0(obj);
                g8d g8dVar = (g8d) obj4;
                if (g8dVar instanceof e8d) {
                    MessagesListWidget messagesListWidget5 = this.g;
                    e8d e8dVar = (e8d) g8dVar;
                    ynh ynhVar = e8dVar.a;
                    Integer num = new Integer(R.drawable.icon_warning);
                    ynh ynhVar2 = e8dVar.b;
                    zv8[] zv8VarArr3 = MessagesListWidget.T1;
                    CharSequence charSequenceB = ynhVar.b(messagesListWidget5.getContext());
                    if (charSequenceB != null) {
                        g8c g8cVar = messagesListWidget5.G;
                        if (g8cVar != null) {
                            g8cVar.a();
                        }
                        h8c h8cVar = new h8c(messagesListWidget5);
                        h8cVar.n(charSequenceB);
                        h8cVar.a(ynhVar2);
                        h8cVar.h(new w8c(num.intValue()));
                        h8cVar.c(new o8c(0, 0, messagesListWidget5.r1(), 11));
                        messagesListWidget5.G = h8cVar.p();
                    }
                } else if (!cqk.d(g8dVar, f8d.a)) {
                    ore.o();
                    return null;
                }
                return sbi.a;
            case 4:
                Object obj5 = this.f;
                ch3.d0(obj);
                w0i w0iVar = (w0i) obj5;
                if (w0iVar == null) {
                    ore.o();
                    return null;
                }
                MessagesListWidget messagesListWidget6 = this.g;
                n3g n3gVar = new n3g(w0iVar.a, null, false ? 1 : 0, i);
                zv8[] zv8VarArr4 = MessagesListWidget.T1;
                messagesListWidget6.K1(n3gVar);
                return sbi.a;
            case 5:
                Object obj6 = this.f;
                ch3.d0(obj);
                a0f a0fVar = (a0f) obj6;
                MessagesListWidget messagesListWidget7 = this.g;
                if (a0fVar.equals(xze.a)) {
                    ((wsc) messagesListWidget7.r.getValue()).o(new svj(messagesListWidget7, 1));
                } else if (a0fVar instanceof zze) {
                    zze zzeVar = (zze) a0fVar;
                    CharSequence charSequenceB2 = zzeVar.a.b(messagesListWidget7.getContext());
                    if (charSequenceB2 != null) {
                        g8c g8cVar2 = messagesListWidget7.G;
                        if (g8cVar2 != null) {
                            g8cVar2.a();
                        }
                        h8c h8cVar2 = new h8c(messagesListWidget7);
                        h8cVar2.n(charSequenceB2);
                        h8cVar2.a(null);
                        Integer num2 = zzeVar.b;
                        if (num2 != null) {
                            h8cVar2.h(new w8c(num2.intValue()));
                        }
                        h8cVar2.c(new o8c(0, 0, messagesListWidget7.r1(), 11));
                        messagesListWidget7.G = h8cVar2.p();
                    }
                } else if (!(a0fVar instanceof yze)) {
                    ore.o();
                    return null;
                }
                return sbi.a;
            case 6:
                Object obj7 = this.f;
                ch3.d0(obj);
                l8b l8bVar = (l8b) obj7;
                MessagesListWidget messagesListWidget8 = this.g;
                zv8[] zv8VarArr5 = MessagesListWidget.T1;
                wx6 wx6Var = (wx6) messagesListWidget8.I.getValue();
                k96 k96VarD1 = this.g.D1();
                if (!wx6Var.h || !cqk.d(wx6Var.i, k96VarD1)) {
                    wx6Var.h = true;
                    k96 k96Var = wx6Var.i;
                    if (k96Var != null) {
                        k96Var.o0(wx6Var);
                    }
                    k96VarD1.h(wx6Var, -1);
                    wx6Var.i = k96VarD1;
                }
                wx6 wx6Var2 = (wx6) this.g.I.getValue();
                wx6Var2.getClass();
                long[] jArr3 = l8bVar.b;
                Object[] objArr2 = l8bVar.c;
                long[] jArr4 = l8bVar.a;
                int length = jArr4.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr4[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = measuredHeight;
                            while (i5 < i4) {
                                if ((255 & j) < 128) {
                                    int i6 = (i2 << 3) + i5;
                                    long j2 = jArr3[i6];
                                    qia qiaVar = (qia) objArr2[i6];
                                    l8b l8bVar2 = wx6Var2.c;
                                    Object objF = l8bVar2.f(j2);
                                    if (objF == null) {
                                        tvb tvbVar = new tvb(wx6Var2.a, Build.VERSION.SDK_INT > 27 ? awb.a : bwb.a);
                                        String str2 = qiaVar.b;
                                        Long lValueOf = Long.valueOf(qiaVar.a);
                                        CharSequence charSequence = qiaVar.c;
                                        if (charSequence == null) {
                                            charSequence = "";
                                        }
                                        tvbVar.c(charSequence, lValueOf, str2);
                                        int i7 = wx6Var2.e;
                                        tvbVar.setBounds(0, 0, i7, i7);
                                        tvbVar.setCallback((vx6) wx6Var2.j.getValue());
                                        l8bVar2.l(j2, tvbVar);
                                        objF = tvbVar;
                                    }
                                    tvb tvbVar2 = (tvb) objF;
                                    String str3 = qiaVar.b;
                                    Long lValueOf2 = Long.valueOf(qiaVar.a);
                                    CharSequence charSequence2 = qiaVar.c;
                                    if (charSequence2 == null) {
                                        charSequence2 = "";
                                    }
                                    tvbVar2.c(charSequence2, lValueOf2, str3);
                                } else {
                                    jArr4 = jArr4;
                                    jArr3 = jArr3;
                                    objArr2 = objArr2;
                                }
                                j >>= i3;
                                i5++;
                                i3 = i3;
                                jArr4 = jArr4;
                                jArr3 = jArr3;
                                objArr2 = objArr2;
                            }
                            jArr = jArr4;
                            jArr2 = jArr3;
                            objArr = objArr2;
                            if (i4 == i3) {
                            }
                        } else {
                            jArr = jArr4;
                            jArr2 = jArr3;
                            objArr = objArr2;
                        }
                        if (i2 != length) {
                            i2++;
                            jArr4 = jArr;
                            jArr3 = jArr2;
                            objArr2 = objArr;
                            measuredHeight = 0;
                        }
                    }
                }
                String name = wx6.class.getName();
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar3.b(je9Var2)) {
                        a4cVar3.c(je9Var2, name, zo5.h(wx6Var2.c.e, "avatars.size = "), null);
                    }
                }
                this.g.D1().X();
                return sbi.a;
            case 7:
                Object obj8 = this.f;
                ch3.d0(obj);
                x5f x5fVar = (x5f) obj8;
                MessagesListWidget messagesListWidget9 = this.g;
                String str4 = messagesListWidget9.a;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar4.b(je9Var3)) {
                        a4cVar4.c(je9Var3, str4, "Got new scrollEvent=" + x5fVar, null);
                    }
                }
                boolean z = x5fVar.b;
                MessagesLayoutManager messagesLayoutManager = messagesListWidget9.K1;
                if (z) {
                    if (messagesLayoutManager != null) {
                        messagesLayoutManager.x1("ScrollEvent");
                    }
                    messagesListWidget9.v1().c();
                } else if (messagesLayoutManager != null) {
                    messagesLayoutManager.v1(new ysa(messagesListWidget9, 0));
                }
                return sbi.a;
            case 8:
                Object obj9 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj9;
                MessagesListWidget messagesListWidget10 = this.g;
                zv8[] zv8VarArr6 = MessagesListWidget.T1;
                je9 je9Var4 = je9.g;
                if (rbbVar instanceof i65) {
                    wpa.b.e((i65) rbbVar);
                } else if (rbbVar instanceof dgc) {
                    xu1 xu1Var = (xu1) messagesListWidget10.A.getValue();
                    dgc dgcVar = (dgc) rbbVar;
                    xu1Var.m(null, dgcVar.c, dgcVar.b, dgcVar.d, new nfa(rbbVar, 1));
                } else if (rbbVar instanceof ofc) {
                    ofc ofcVar = (ofc) rbbVar;
                    ((xu1) messagesListWidget10.A.getValue()).k(ofcVar.d, true, ofcVar.c, false, new nfa(rbbVar, 2));
                } else if (rbbVar instanceof egc) {
                    Intent intent = new Intent("android.intent.action.INSERT");
                    intent.setType("vnd.android.cursor.dir/raw_contact");
                    egc egcVar = (egc) rbbVar;
                    intent.putExtra(SdkMetricStatEvent.NAME_KEY, egcVar.c);
                    intent.putExtra("phone", egcVar.d);
                    try {
                        messagesListWidget10.getContext().startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        String name2 = MessagesListWidget.class.getName();
                        String strS = nbh.s(egcVar.b, "error creating a new contact #", " in phonebook");
                        a4c a4cVar5 = gm0.f;
                        if (a4cVar5 != null) {
                            a4c.f(a4cVar5, je9Var4, name2, strS, null, null, 8);
                        }
                    }
                    break;
                } else if (rbbVar instanceof tfc) {
                    sb8.P(new msa(messagesListWidget10, 18), messagesListWidget10.getContext(), ((tfc) rbbVar).b);
                } else if (rbbVar instanceof ufc) {
                    zj7 zj7Var = ((ufc) rbbVar).b;
                    String str5 = sj8.a;
                    Context context = messagesListWidget10.getContext();
                    double d = zj7Var.d;
                    double d2 = zj7Var.e;
                    int i8 = (int) zj7Var.f;
                    Uri uriL = sj8.l(context, Uri.parse("yandexmaps://maps.yandex.ru").buildUpon().appendQueryParameter("pt", d2 + "," + d).appendQueryParameter("z", String.valueOf(i8)).appendQueryParameter("l", "map").build());
                    Intent intent2 = new Intent("android.intent.action.VIEW", uriL).setPackage("ru.yandex.yandexmaps");
                    if (intent2.resolveActivity(context.getPackageManager()) == null) {
                        intent2 = new Intent("android.intent.action.VIEW", uriL.buildUpon().scheme("https").authority("yandex.ru").path("maps").build());
                        if (intent2.resolveActivity(context.getPackageManager()) == null) {
                            intent2 = null;
                        }
                    }
                    sdg sdgVarT = messagesListWidget10.F1().T();
                    ak7 ak7Var = (ak7) messagesListWidget10.C.getValue();
                    ak7Var.getClass();
                    ul9 ul9Var = new ul9();
                    ul9Var.put("source_id", Long.valueOf(sdgVarT != null ? sdgVarT.a : 0L));
                    ul9Var.put("source_type", Integer.valueOf(sdgVarT != null ? sdgVarT.b : 0));
                    ((ae9) ak7Var.a.getValue()).h("geolocation_send_click", ouk.a(new ylc("source_meta", ul9Var.b())));
                    if (intent2 == null) {
                        messagesListWidget10.K1(new n3g(new tnh(R.string.no_app_found), U1, U1, i));
                    } else {
                        messagesListWidget10.getContext().startActivity(intent2);
                    }
                } else if (rbbVar instanceof vfc) {
                    vfc vfcVar = (vfc) rbbVar;
                    Intent intent3 = vfcVar.b;
                    Uri uri = vfcVar.c;
                    try {
                        messagesListWidget10.getContext().startActivity(intent3);
                    } catch (Exception unused2) {
                        intent3.setDataAndType(uri, "*/*");
                        messagesListWidget10.getContext().startActivity(intent3);
                    }
                    break;
                } else if (rbbVar instanceof ek8) {
                    o65.e((o65) messagesListWidget10.d.getAccessor().c(184), ((v65) ((ek8) rbbVar).a).a, null, null, 6);
                } else if (rbbVar instanceof lgc) {
                    wpa wpaVar = wpa.b;
                    lgc lgcVar = (lgc) rbbVar;
                    long j3 = lgcVar.b;
                    String str6 = lgcVar.d;
                    long j4 = lgcVar.c;
                    wpaVar.getClass();
                    Bundle bundleI = n1g.i(new ylc("video_url", str6));
                    o65 o65VarB = wpaVar.b();
                    StringBuilder sbS = qt4.s(j3, ":videoweb/full?chat_id=", "&msg_id=");
                    sbS.append(j4);
                    o65.c(o65VarB, sbS.toString(), bundleI, null, 4);
                } else if (rbbVar instanceof ri6) {
                    o65.c(wpa.b.b(), ":external_callback", n1g.i(new ylc("params", ((ri6) rbbVar).b)), null, 4);
                } else if (rbbVar instanceof e2g) {
                    wpa wpaVar2 = wpa.b;
                    e2g e2gVar = (e2g) rbbVar;
                    long j5 = e2gVar.b;
                    long j6 = e2gVar.c;
                    String str7 = e2gVar.d;
                    long j7 = e2gVar.e;
                    String str8 = e2gVar.f;
                    String str9 = e2gVar.h;
                    long j8 = e2gVar.g;
                    wpaVar2.getClass();
                    Uri uri2 = Uri.parse(str9);
                    o65 o65VarB2 = wpaVar2.b();
                    Bundle bundleI2 = n1g.i(new ylc("file_url", uri2));
                    n65 n65Var = new n65();
                    n65Var.a = ":dialogs/file-download-warning";
                    n65Var.d(Long.valueOf(j5), "chat_id");
                    n65Var.d(Long.valueOf(j6), "message_id");
                    if (str7 != null) {
                        n65Var.d(str7, "attach_id");
                    }
                    n65Var.d(Long.valueOf(j7), "file_id");
                    n65Var.d(str8, "file_name");
                    n65Var.d(Long.valueOf(j8), "file_size");
                    o65.e(o65VarB2, n65Var.a(), bundleI2, null, 4);
                } else if (cqk.d(rbbVar, co7.b)) {
                    Activity activity = messagesListWidget10.getActivity();
                    if (activity != null) {
                        ((gu) messagesListWidget10.z.getValue()).a(activity);
                    }
                } else if (rbbVar instanceof ome) {
                    ((wsc) messagesListWidget10.r.getValue()).o(new svj(messagesListWidget10, 1));
                } else if (rbbVar instanceof d2g) {
                    Context context2 = messagesListWidget10.getContext();
                    g5d g5dVar = (g5d) ((gjf) messagesListWidget10.k.getValue());
                    String str10 = String.format(context2.getString(R.string.tt_sms_invite_text), Arrays.copyOf(new Object[]{g5dVar.b()}, 1));
                    it3.a(messagesListWidget10.getContext(), str10.toString());
                    String str11 = sj8.a;
                    sj8.j(messagesListWidget10.getContext(), str10, null);
                } else if (rbbVar instanceof fgc) {
                    zv8[] zv8VarArr7 = BottomSheetWidget.t;
                    fgc fgcVar = (fgc) rbbVar;
                    PollFinishBottomSheet pollFinishBottomSheet = new PollFinishBottomSheet(messagesListWidget10.b, fgcVar.b, fgcVar.c, fgcVar.d);
                    pollFinishBottomSheet.setTargetController(messagesListWidget10);
                    br4 parentController = messagesListWidget10;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    U1 = rootController != null ? rootController.u1() : 0;
                    if (U1 != 0) {
                        lve lveVar = new lve(pollFinishBottomSheet, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        U1.I(lveVar);
                    }
                } else {
                    String str12 = messagesListWidget10.a;
                    String str13 = "Unknown navigation event " + rbbVar;
                    a4c a4cVar6 = gm0.f;
                    if (a4cVar6 != null) {
                        a4c.f(a4cVar6, je9Var4, str12, str13, null, null, 8);
                    }
                }
                return sbi.a;
            case 9:
                Object obj10 = this.f;
                ch3.d0(obj);
                this.g.D.b((zv7) obj10);
                return sbi.a;
            case 10:
                Object obj11 = this.f;
                ch3.d0(obj);
                cdi cdiVar = (cdi) obj11;
                MessagesListWidget messagesListWidget11 = this.g;
                long jA = cdiVar.a();
                vv vvVar = messagesListWidget11.f;
                zv8[] zv8VarArr8 = MessagesListWidget.T1;
                zv8 zv8Var = zv8VarArr8[2];
                vvVar.b(messagesListWidget11, Long.valueOf(jA));
                zci zciVar = messagesListWidget11.Y;
                if (zciVar != null) {
                    vv vvVar2 = messagesListWidget11.h;
                    zv8 zv8Var2 = zv8VarArr8[4];
                    zciVar.c = ((Boolean) vvVar2.a(messagesListWidget11)).booleanValue() ? 0L : cdiVar.a();
                    messagesListWidget11.D1().X();
                    if ((cdiVar instanceof bdi) && (iO = messagesListWidget11.H.O(((bdi) cdiVar).a)) >= 0) {
                        messagesListWidget11.x1.h = -1;
                        zpg zpgVar = messagesListWidget11.n1;
                        if (zpgVar != null) {
                            g85 g85Var = zpgVar.d;
                            if (zpgVar.k(iO) && g85Var.G(iO) != null) {
                                measuredHeight = g85Var.H(iO).a.getMeasuredHeight();
                            }
                        }
                        messagesListWidget11.D1().getLinearLayoutManager().p1(iO, (messagesListWidget11.D1().getMeasuredHeight() - zciVar.i().getMeasuredHeight()) - measuredHeight);
                    }
                }
                return sbi.a;
            case 11:
                Object obj12 = this.f;
                ch3.d0(obj);
                q6e q6eVar = (q6e) obj12;
                MessagesListWidget messagesListWidget12 = this.g;
                zv8[] zv8VarArr9 = MessagesListWidget.T1;
                if (q6eVar == null) {
                    ore.o();
                    return null;
                }
                b7e b7eVar = messagesListWidget12.P1;
                if (b7eVar != null) {
                    b7eVar.d(q6eVar.b, q6eVar.a, q6eVar.c);
                }
                return sbi.a;
            case 12:
                Object obj13 = this.f;
                ch3.d0(obj);
                bx5 bx5Var = (bx5) obj13;
                MessagesListWidget messagesListWidget13 = this.g;
                zci zciVar2 = messagesListWidget13.Y;
                if (zciVar2 != null) {
                    zciVar2.h = bx5Var;
                    FrameLayout frameLayout = zciVar2.f;
                    View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
                    TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
                    if (textView != null) {
                        q9i.t.h().b(textView, zciVar2.h);
                    }
                }
                xp9 xp9Var = messagesListWidget13.Z;
                if (xp9Var != null) {
                    xp9Var.c = bx5Var;
                }
                zpg zpgVar2 = messagesListWidget13.n1;
                if (zpgVar2 != null) {
                    zpgVar2.j();
                }
                messagesListWidget13.D1().X();
                messagesListWidget13.D1().invalidate();
                return sbi.a;
            case 13:
                Object obj14 = this.f;
                ch3.d0(obj);
                rxi rxiVar = (rxi) obj14;
                if (rxiVar instanceof pxi) {
                    MessagesListWidget messagesListWidget14 = this.g;
                    zv8[] zv8VarArr10 = MessagesListWidget.T1;
                    pti ptiVarQ1 = messagesListWidget14.q1();
                    String str14 = ((pxi) rxiVar).a;
                    lti ltiVar = (lti) ptiVarQ1.y.c(str14);
                    if (ltiVar == null) {
                        String str15 = ptiVarQ1.g;
                        a4c a4cVar7 = gm0.f;
                        if (a4cVar7 != null) {
                            je9 je9Var5 = je9.d;
                            if (a4cVar7.b(je9Var5)) {
                                a4cVar7.c(je9Var5, str15, "Player autoplay. State doesn't exist for clear player attachId ".concat(str14), null);
                            }
                        }
                    } else {
                        ptiVarQ1.c(ltiVar.c, str14);
                    }
                } else {
                    if (!cqk.d(rxiVar, qxi.a)) {
                        ore.o();
                        return null;
                    }
                    MessagesListWidget messagesListWidget15 = this.g;
                    zv8[] zv8VarArr11 = MessagesListWidget.T1;
                    k96 k96VarD2 = messagesListWidget15.D1();
                    if (k96VarD2.getScrollState() == 0) {
                        messagesListWidget15.q1().h(k96VarD2, false);
                    }
                }
                return sbi.a;
            default:
                Object obj15 = this.f;
                ch3.d0(obj);
                h76 h76Var = (h76) obj15;
                MessagesListWidget messagesListWidget16 = this.g;
                MessagesListWidget.o1(messagesListWidget16).removeAllViews();
                if (h76Var instanceof f76) {
                    icdVar = new icd(messagesListWidget16.getContext());
                    icdVar.setState((f76) h76Var);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                    layoutParams.setMargins(iK, iK, iK, iK);
                    icdVar.setLayoutParams(layoutParams);
                } else if (h76Var instanceof d76) {
                    d76 d76Var = (d76) h76Var;
                    sea seaVar = new sea(messagesListWidget16, 2, d76Var);
                    n01 n01Var = new n01(messagesListWidget16.getContext());
                    n01Var.setLinkListener(seaVar);
                    n01Var.setState(d76Var);
                    n01Var.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(272.0f * yl5.d().getDisplayMetrics().density), -2, 17));
                    n01Var.setBackground(new ip7(n01Var.getContext()));
                    n01Var.setForeground(new b6h(n01Var.getContext()));
                    n1g.N(new d3(d76Var, U1, 24), n01Var);
                    viewGroup = n01Var;
                } else if (h76Var instanceof e76) {
                    al5Var = new al5(messagesListWidget16.getContext());
                    al5Var.b((e76) h76Var, new cta(messagesListWidget16, 1));
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(262.0f * yl5.d().getDisplayMetrics().density), -2);
                    int iK2 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                    layoutParams2.setMargins(iK2, iK2, iK2, iK2);
                    al5Var.setLayoutParams(layoutParams2);
                    if (ch3.o(al5Var.getContext()).a()) {
                        viewGroup = al5Var;
                        messagesListWidget16.O1 = new m76(MessagesListWidget.o1(messagesListWidget16), messagesListWidget16.requireView());
                        viewGroup = al5Var;
                    }
                } else if (h76Var instanceof g76) {
                    u1fVar = new u1f(messagesListWidget16.getContext());
                    u1fVar.setState((g76) h76Var);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                    int iK3 = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
                    layoutParams3.setMargins(iK3, iK3, iK3, iK3);
                    u1fVar.setLayoutParams(layoutParams3);
                    if (ch3.o(messagesListWidget16.getContext()).a()) {
                        viewGroup = u1fVar;
                        messagesListWidget16.O1 = new m76(MessagesListWidget.o1(messagesListWidget16), messagesListWidget16.requireView());
                        viewGroup = u1fVar;
                    }
                } else if (h76Var != null) {
                    ore.o();
                    return null;
                }
                if (viewGroup != null) {
                    viewGroup = icdVar;
                    bdc.a(viewGroup, new bta(viewGroup, messagesListWidget16, 4));
                    MessagesListWidget.o1(messagesListWidget16).addView(viewGroup);
                }
                viewGroup = icdVar;
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qsa(int i, lq4 lq4Var, MessagesListWidget messagesListWidget) {
        super(2, lq4Var);
        this.e = i;
        this.g = messagesListWidget;
    }
}
